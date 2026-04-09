package zc;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f26974a;

    /* renamed from: b, reason: collision with root package name */
    public long f26975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f26976c;

    public j(l lVar, String str) {
        this.f26976c = lVar;
        cc.s.e(str);
        this.f26974a = str;
        this.f26975b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public final List a() {
        ArrayList arrayList;
        l lVar = this.f26976c;
        ArrayList arrayList2 = new ArrayList();
        String strValueOf = String.valueOf(this.f26975b);
        String str = this.f26974a;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = lVar.h2().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, strValueOf}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j7 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f26975b) {
                            this.f26975b = j;
                        }
                        try {
                            com.google.android.gms.internal.measurement.y2 y2Var = (com.google.android.gms.internal.measurement.y2) m0.f2(com.google.android.gms.internal.measurement.z2.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            y2Var.b();
                            ((com.google.android.gms.internal.measurement.z2) y2Var.f5042d).F(string);
                            long j10 = cursorQuery.getLong(2);
                            y2Var.b();
                            ((com.google.android.gms.internal.measurement.z2) y2Var.f5042d).G(j10);
                            arrayList2.add(new i(j, j7, z10, (com.google.android.gms.internal.measurement.z2) y2Var.e()));
                        } catch (IOException e4) {
                            j0 j0Var = ((c1) lVar.f1504d).f26889y;
                            c1.g(j0Var);
                            j0Var.B.d(j0.A1(str), e4, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                j0 j0Var2 = ((c1) lVar.f1504d).f26889y;
                c1.g(j0Var2);
                j0Var2.B.d(j0.A1(str), e10, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public j(l lVar, String str, long j) {
        this.f26976c = lVar;
        cc.s.e(str);
        this.f26974a = str;
        this.f26975b = lVar.d2("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }
}
