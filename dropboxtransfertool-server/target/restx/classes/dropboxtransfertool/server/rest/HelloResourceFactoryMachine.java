package dropboxtransfertool.server.rest;

import com.google.common.collect.ImmutableSet;
import restx.factory.*;
import dropboxtransfertool.server.rest.HelloResource;

@Machine
public class HelloResourceFactoryMachine extends SingleNameFactoryMachine<dropboxtransfertool.server.rest.HelloResource> {
    public static final Name<dropboxtransfertool.server.rest.HelloResource> NAME = Name.of(dropboxtransfertool.server.rest.HelloResource.class, "HelloResource");

    public HelloResourceFactoryMachine() {
        super(0, new StdMachineEngine<dropboxtransfertool.server.rest.HelloResource>(NAME, 0, BoundlessComponentBox.FACTORY) {


            @Override
            public BillOfMaterials getBillOfMaterial() {
                return new BillOfMaterials(ImmutableSet.<Factory.Query<?>>of(

                ));
            }

            @Override
            protected dropboxtransfertool.server.rest.HelloResource doNewComponent(SatisfiedBOM satisfiedBOM) {
                return new HelloResource(

                );
            }
        });
    }

}
