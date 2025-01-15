package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

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
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0 && productRepository.count() == 0) {
            OutsourcedPart part1 = new OutsourcedPart();
            part1.setCompanyName("Bobbi's Bows");
            part1.setName("Bow - Sandalwood");
            part1.setInv(25);
            part1.setPrice(79.99);
            part1.setId(100L);
            outsourcedPartRepository.save(part1);

            OutsourcedPart part2 = new OutsourcedPart();
            part2.setCompanyName("Sarah's Strings");
            part2.setName("String (Cello)");
            part2.setInv(100);
            part2.setPrice(12.99);
            part2.setId(101L);
            outsourcedPartRepository.save(part2);

            OutsourcedPart part3 = new OutsourcedPart();
            part3.setCompanyName("Sarah's Strings");
            part3.setName("String (Double Bass)");
            part3.setInv(100);
            part3.setPrice(19.99);
            part3.setId(102L);
            outsourcedPartRepository.save(part3);

            InhousePart part4 = new InhousePart();
            part4.setName("Strings (Viola)");
            part4.setInv(100);
            part4.setPrice(9.99);
            part4.setId(103L);
            inhousePartRepository.save(part4);

            InhousePart part5 = new InhousePart();
            part5.setName("String (Violin)");
            part5.setInv(100);
            part5.setPrice(9.99);
            part5.setId(104L);
            inhousePartRepository.save(part5);

            List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
            for (OutsourcedPart part : outsourcedParts) {
                System.out.println(part.getName() + " " + part.getCompanyName());
            }


            Product cello = new Product("Cello", 999.99, 25);
            Product doubleBass = new Product("Double Bass", 2199.99, 25);
            Product electricCello = new Product("Electric Cello", 1999.99, 10);
            Product viola = new Product("Viola", 499.99, 40);
            Product violin = new Product("Violin", 499.99, 40);
            productRepository.save(cello);
            productRepository.save(doubleBass);
            productRepository.save(electricCello);
            productRepository.save(viola);
            productRepository.save(violin);
        }
            System.out.println("Started in Bootstrap");
            System.out.println("Number of Products" + productRepository.count());
            System.out.println(productRepository.findAll());
            System.out.println("Number of Parts" + partRepository.count());
            System.out.println(partRepository.findAll());

        }
    }