package it.stefanomilesi.myplatform.controller;

import it.stefanomilesi.myplatform.entity.Asset;
import it.stefanomilesi.myplatform.repository.AssetRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assets")
public class AssetController extends CrudRestController<Asset> {

    public AssetController(AssetRepository repository) {
        super(repository);
    }
}
