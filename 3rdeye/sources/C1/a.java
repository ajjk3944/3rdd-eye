package C1;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.work.s;
import c9.C2091l;
import io.appmetrica.analytics.impl.Oo;
import kotlin.jvm.internal.l;
import y9.n;

/* compiled from: CursorUtil.android.kt */
/* loaded from: classes.dex */
public final class a {
    public static final int a(Cursor c10, String str) {
        l.f(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c10.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = c10.getColumnNames();
        l.c(columnNames);
        String strConcat = ".".concat(str);
        String strE = s.e(".", str, '`');
        int length = columnNames.length;
        int i = 0;
        int i10 = 0;
        while (i < length) {
            String str2 = columnNames[i];
            int i11 = i10 + 1;
            if (str2.length() >= str.length() + 2 && (n.T(str2, strConcat) || (str2.charAt(0) == '`' && n.T(str2, strE)))) {
                return i10;
            }
            i++;
            i10 = i11;
        }
        return -1;
    }

    public static final int b(Cursor c10, String str) {
        String strP;
        l.f(c10, "c");
        int iA = a(c10, str);
        if (iA >= 0) {
            return iA;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            l.e(columnNames, "getColumnNames(...)");
            strP = C2091l.p(", ", columnNames);
        } catch (Exception e4) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e4);
            strP = "unknown";
        }
        throw new IllegalArgumentException(Oo.f("column '", str, "' does not exist. Available columns: ", strP));
    }
}
