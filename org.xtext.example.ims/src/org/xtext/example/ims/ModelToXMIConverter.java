package org.xtext.example.ims;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.google.inject.Injector;
import java.io.IOException;

public class ModelToXMIConverter {
    
    public static void main(String[] args) {
        // Initialize the model
        Injector injector = new IMSStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

        // Load the model from the file 'sample.ims'
        String inputPath = "/Users/alexcattani/Desktop/439A3-master/org.xtext.example.ims/model/sample.ims";
        Resource xtextResource = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(inputPath), true);

        // Create a new resource for the XMI output
        String outputPath = "/Users/alexcattani/Desktop/439A3-master/org.xtext.example.ims/model/sample.xmi";
        Resource xmiResource = new XMIResourceFactoryImpl().createResource(org.eclipse.emf.common.util.URI.createFileURI(outputPath));
        xmiResource.getContents().add(xtextResource.getContents().get(0));

        // Save the XMI resource
        try {
            xmiResource.save(null);
            System.out.println("Model saved to XMI file at: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
