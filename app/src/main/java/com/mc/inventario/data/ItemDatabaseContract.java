package com.mc.inventario.data;

import android.provider.BaseColumns;

public final class ItemDatabaseContract {
    private ItemDatabaseContract(){}

    public static final class ItemDatabaseEntry implements BaseColumns {
        public final static String TABLE_NAME = "items";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_ITEM_NAME ="name";
        public final static String COLUMN_ITEM_QUANTITY ="quantity";
    }

}
