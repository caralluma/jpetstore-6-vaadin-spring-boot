package com.kiroule.jpetstore.vaadinspring.ui.event;

import com.kiroule.jpetstore.vaadinspring.domain.Item;

/**
 * @author Igor Baiborodine
 */
public class UIRemoveItemFromCartEvent {

  private Item item;

  public UIRemoveItemFromCartEvent(Item item) {
    this.item = item;
  }

  public Item getItem() {
    return item;
  }
}
