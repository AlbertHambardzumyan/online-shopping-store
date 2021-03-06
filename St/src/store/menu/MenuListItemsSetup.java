// Copyright (c) 2016 Albert Hambardzumyan
// All rights reserved.
// This software is released under the BSD license.
package store.menu;

import store.db.DBconnectionManager;

import java.util.List;

/**
 * @author Albert Hambardzumyan
 */

/**
 * A specialization of the MenuListItemsSetter servlet that
 * displays a menuListItems.
 */

public class MenuListItemsSetup extends MenuListItemsSetter {

    public void init() {
        List<Integer> ids;
        ids = DBconnectionManager.getInstance().getSettedMenuListItems();
        setItems(ids);

    }
}