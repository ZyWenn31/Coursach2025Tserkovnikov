package ru.tserk.coursach.coursach.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.tserk.coursach.coursach.models.Item;
import ru.tserk.coursach.coursach.models.Shop;
import ru.tserk.coursach.coursach.models.ShopItem;

import java.util.List;
import java.util.Optional;

@Repository
public interface  ShopItemRepository extends JpaRepository<ShopItem, Integer> {
    List<ShopItem> findAllByItId(Item itId);
    List<ShopItem> findAllBySId(Shop SId);
    Optional<ShopItem> findShopItemByItIdAndSId(Item itID, Shop SId);
}
