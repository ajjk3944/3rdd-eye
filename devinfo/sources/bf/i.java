package bf;

import al.k;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.play_billing.m1;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import je.u;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final t4.d f2179b = new t4.d("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final t4.d f2180c = new t4.d("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final t4.d f2181d = new t4.d("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final te.c f2182a;

    public i(Context context, String str) {
        this.f2182a = new te.c(context, u.t("FirebaseHeartBeat", str));
    }

    public final synchronized long a(t4.b bVar) {
        long j;
        try {
            long jLongValue = ((Long) wd.b.t(bVar, f2180c, 0L)).longValue();
            String str = "";
            Set hashSet = new HashSet();
            String str2 = null;
            for (Map.Entry entry : bVar.a().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set<String> set = (Set) entry.getValue();
                    for (String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = ((t4.d) entry.getKey()).f34168a;
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet2.remove(str2);
            bVar.e(m1.D(str), hashSet2);
            j = jLongValue - 1;
            bVar.d(f2180c, Long.valueOf(j));
        } catch (Throwable th2) {
            throw th2;
        }
        return j;
    }

    public final synchronized void b() {
        this.f2182a.a(new b7.u(1, this));
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String strD = d(System.currentTimeMillis());
            te.c cVar = this.f2182a;
            cVar.getClass();
            for (Map.Entry entry : ((Map) x.z(ck.i.f2898a, new k(cVar, null, 16))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strD);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((t4.d) entry.getKey()).f34168a, new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized t4.d e(t4.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return m1.D(((t4.d) entry.getKey()).f34168a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f(t4.b bVar, String str) {
        try {
            t4.d dVarE = e(bVar, str);
            if (dVarE == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) wd.b.t(bVar, dVarE, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.c(dVarE);
            } else {
                bVar.e(dVarE, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g(long j, String str) throws Throwable {
        try {
            try {
                String strD = d(j);
                t4.d dVarD = m1.D(str);
                this.f2182a.a(new a0.a(this, strD, str, dVarD, 1));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized void h(long j) {
        this.f2182a.a(new b7.x(1, j));
    }
}
