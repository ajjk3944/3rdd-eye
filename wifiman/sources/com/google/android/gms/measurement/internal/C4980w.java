package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C4452s2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4980w {

    /* renamed from: a, reason: collision with root package name */
    private final String f36838a;

    /* renamed from: b, reason: collision with root package name */
    private long f36839b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4933q f36840c;

    public C4980w(C4933q c4933q, String str) {
        this.f36840c = c4933q;
        AbstractC7901p.f(str);
        this.f36838a = str;
        this.f36839b = -1L;
    }

    public final List a() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursorQuery = this.f36840c.x().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f36838a, String.valueOf(this.f36839b)}, null, null, "rowid", "1000");
            } catch (SQLiteException e10) {
                this.f36840c.zzj().C().c("Data loss. Error querying raw events batch. appId", L2.r(this.f36838a), e10);
                if (0 != 0) {
                    cursor.close();
                }
            }
            if (!cursorQuery.moveToFirst()) {
                List listEmptyList = Collections.emptyList();
                cursorQuery.close();
                return listEmptyList;
            }
            do {
                long j10 = cursorQuery.getLong(0);
                long j11 = cursorQuery.getLong(3);
                boolean z10 = cursorQuery.getLong(5) == 1;
                byte[] blob = cursorQuery.getBlob(4);
                if (j10 > this.f36839b) {
                    this.f36839b = j10;
                }
                try {
                    C4452s2.a aVar = (C4452s2.a) s7.C(C4452s2.R(), blob);
                    String string = cursorQuery.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    aVar.F(string).H(cursorQuery.getLong(2));
                    arrayList.add(new C4964u(j10, j11, z10, (C4452s2) ((com.google.android.gms.internal.measurement.D4) aVar.p())));
                } catch (IOException e11) {
                    this.f36840c.zzj().C().c("Data loss. Failed to merge raw event. appId", L2.r(this.f36838a), e11);
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public C4980w(C4933q c4933q, String str, long j10) {
        this.f36840c = c4933q;
        AbstractC7901p.f(str);
        this.f36838a = str;
        this.f36839b = c4933q.E("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }
}
