package p2;

import Zg.AbstractC3682n;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import jh.AbstractC6329b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7207a {
    public static final Cursor a(Cursor c10) {
        AbstractC6492s.i(c10, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c10.getColumnNames(), c10.getCount());
            while (c10.moveToNext()) {
                Object[] objArr = new Object[c10.getColumnCount()];
                int columnCount = c10.getColumnCount();
                for (int i10 = 0; i10 < columnCount; i10++) {
                    int type = c10.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(c10.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(c10.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = c10.getString(i10);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i10] = c10.getBlob(i10);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC6329b.a(c10, null);
            return matrixCursor;
        } finally {
        }
    }

    private static final int b(Cursor cursor, String str) {
        return -1;
    }

    public static final int c(Cursor c10, String name) {
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(name, "name");
        int columnIndex = c10.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : b(c10, name);
    }

    public static final int d(Cursor c10, String name) {
        String strI0;
        AbstractC6492s.i(c10, "c");
        AbstractC6492s.i(name, "name");
        int iC = c(c10, name);
        if (iC >= 0) {
            return iC;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            AbstractC6492s.h(columnNames, "c.columnNames");
            strI0 = AbstractC3682n.I0(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strI0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strI0);
    }
}
