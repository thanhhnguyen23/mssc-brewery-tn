package io.thn.msscbrewery.services;

import io.thn.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {

        // * NOTE: testing endpoint w/ random UUID: `api/v1/beer/8438688c-7795-4599-b3ea-30f0bb584fc6`
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        // ! TODO: implement
        return BeerDto.builder().build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleteing a beer...");
    }

}
