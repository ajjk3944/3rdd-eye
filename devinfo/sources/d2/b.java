package d2;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.a3;
import com.google.android.gms.internal.measurement.b3;
import ec.m;
import ec.o1;
import ec.r1;
import ec.s0;
import ec.w0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import oi.f;
import pb.y;
import ti.k;
import ti.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public long f21938a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21939b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21940c;

    public b(m mVar, String str) {
        this.f21940c = mVar;
        y.e(str);
        this.f21939b = str;
        this.f21938a = -1L;
    }

    @Override // ti.l
    public void a(long j, long j8) {
        k kVar = (k) this.f21940c;
        r1 r1Var = kVar.f34684e;
        long[] jArr = (long[]) this.f21939b;
        jArr[0] = j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f21938a >= 1000 || jArr[0] == r1Var.f23043d) {
            this.f21938a = jCurrentTimeMillis;
            kVar.f34681b.post(new f(this, (l) r1Var.f23042c, jArr, 8));
        }
    }

    public void b(long j, long j8) {
        ((d) this.f21939b).a(j, Float.intBitsToFloat((int) (j8 >> 32)));
        ((d) this.f21940c).a(j, Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List d() {
        ArrayList arrayList;
        m mVar = (m) this.f21940c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.f21939b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = mVar.q0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f21938a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j8 = cursorQuery.getLong(3);
                        boolean z3 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f21938a) {
                            this.f21938a = j;
                        }
                        try {
                            a3 a3Var = (a3) w0.o0(b3.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            a3Var.b();
                            ((b3) a3Var.f19740b).F(string);
                            long j9 = cursorQuery.getLong(2);
                            a3Var.b();
                            ((b3) a3Var.f19740b).G(j9);
                            arrayList2.add(new ec.k(j, j8, z3, (b3) a3Var.f()));
                        } catch (IOException e2) {
                            s0 s0Var = ((o1) mVar.f218b).f22954f;
                            o1.m(s0Var);
                            s0Var.g.f(s0.J(str), e2, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e10) {
                s0 s0Var2 = ((o1) mVar.f218b).f22954f;
                o1.m(s0Var2);
                s0Var2.g.f(s0.J(str), e10, "Data loss. Error querying raw events batch. appId");
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    @Override // ti.l
    public /* synthetic */ boolean stop() {
        return false;
    }

    public b(m mVar, String str, long j) {
        this.f21940c = mVar;
        y.e(str);
        this.f21939b = str;
        this.f21938a = mVar.m0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public b() {
        this.f21939b = new d();
        this.f21940c = new d();
    }

    public b(k kVar, long[] jArr) {
        this.f21940c = kVar;
        this.f21939b = jArr;
        this.f21938a = System.currentTimeMillis();
    }

    @Override // ti.l
    public /* synthetic */ void c() {
    }

    @Override // ti.l
    public /* synthetic */ void success() {
    }
}
