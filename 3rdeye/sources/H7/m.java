package H7;

import android.database.Cursor;
import b9.C1992A;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: StorageStatements.kt */
/* loaded from: classes.dex */
public final class m implements j {
    @Override // H7.j
    public final void a(c cVar) {
        ArrayList arrayList = new ArrayList();
        h hVarA = cVar.a("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
        try {
            Cursor cursorA = hVarA.a();
            if (!cursorA.moveToFirst()) {
                hVarA.close();
                return;
            }
            do {
                String string = cursorA.getString(cursorA.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.NAME));
                kotlin.jvm.internal.l.e(string, "cursor.getString(cursor.…lumnIndexOrThrow(\"name\"))");
                arrayList.add(string);
            } while (cursorA.moveToNext());
            C1992A c1992a = C1992A.f18074a;
            hVarA.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar.t("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
            }
        } finally {
        }
    }

    public final String toString() {
        return "Drop all database tables";
    }
}
