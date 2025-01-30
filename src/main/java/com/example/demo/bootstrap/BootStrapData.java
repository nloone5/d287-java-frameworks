package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        if (outsourcedPartRepository.count() == 0) {
            OutsourcedPart frame = new OutsourcedPart();
            frame.setCompanyName("Looney's Cars");
            frame.setName("Frame");
            frame.setInv(10);
            frame.setMinInv(1);
            frame.setMaxInv(50);
            frame.setPrice(1000.0);
            frame.setId(100L);
            outsourcedPartRepository.save(frame);
            OutsourcedPart thePart = null;
            for (OutsourcedPart part:outsourcedParts) {
                if(part.getName().equals("Frame"))thePart=part;
            }

            OutsourcedPart engine = new OutsourcedPart();
            engine.setCompanyName("Looney's Cars");
            engine.setName("Engine");
            engine.setInv(7);
            engine.setMinInv(1);
            engine.setMaxInv(50);
            engine.setPrice(3000.0);
            engine.setId(200L);
            outsourcedPartRepository.save(engine);
            thePart = null;
            for (OutsourcedPart part:outsourcedParts) {
                if(part.getName().equals("Engine"))thePart=part;
            }

            OutsourcedPart door = new OutsourcedPart();
            door.setCompanyName("Looney's Cars");
            door.setName("Door");
            door.setInv(34);
            door.setMinInv(1);
            door.setMaxInv(50);
            door.setPrice(500.0);
            door.setId(300L);
            outsourcedPartRepository.save(door);
            thePart = null;
            for (OutsourcedPart part:outsourcedParts) {
                if(part.getName().equals("Door"))thePart=part;
            }

            OutsourcedPart wheel = new OutsourcedPart();
            wheel.setCompanyName("Looney's Cars");
            wheel.setName("Wheel");
            wheel.setInv(29);
            wheel.setMinInv(1);
            wheel.setMaxInv(50);
            wheel.setPrice(300.0);
            wheel.setId(400L);
            outsourcedPartRepository.save(wheel);
            thePart = null;
            for (OutsourcedPart part:outsourcedParts) {
                if(part.getName().equals("Wheel"))thePart=part;
            }

            OutsourcedPart seat = new OutsourcedPart();
            seat.setCompanyName("Looney's Cars");
            seat.setName("Seat");
            seat.setInv(46);
            seat.setMinInv(1);
            seat.setMaxInv(50);
            seat.setPrice(400.0);
            seat.setId(250L);
            outsourcedPartRepository.save(seat);
            thePart = null;
            for (OutsourcedPart part:outsourcedParts) {
                if(part.getName().equals("Seat  "))thePart=part;
            }

            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        Product coupe = new Product("Coupe", 50000.0, 8);
        Product sedan = new Product("Sedan", 40000.0, 17);
        Product suv = new Product("SUV", 55000, 36);
        Product truck = new Product("Truck", 62000, 25);
        Product ev = new Product("Electric Vehicle", 70000, 22);

        if (productRepository.count() == 0) {
            productRepository.save(coupe);
            productRepository.save(sedan);
            productRepository.save(suv);
            productRepository.save(truck);
            productRepository.save(ev);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
