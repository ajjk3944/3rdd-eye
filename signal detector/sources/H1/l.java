package H1;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.C1801rP;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public long f1771a;

    /* renamed from: b, reason: collision with root package name */
    public long f1772b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1773c;

    public l() {
        this.f1771a = -9223372036854775807L;
        this.f1772b = -9223372036854775807L;
    }

    public synchronized Object a(Object obj) {
        k kVar;
        kVar = (k) ((LinkedHashMap) this.f1773c).get(obj);
        return kVar != null ? kVar.f1769a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j6 = iB;
        if (j6 >= this.f1771a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f1772b += j6;
        }
        k kVar = (k) ((LinkedHashMap) this.f1773c).put(obj, obj2 == null ? null : new k(iB, obj2));
        if (kVar != null) {
            this.f1772b -= kVar.f1770b;
            if (!kVar.f1769a.equals(obj2)) {
                c(obj, kVar.f1769a);
            }
        }
        e(this.f1771a);
        return kVar != null ? kVar.f1769a : null;
    }

    public synchronized void e(long j6) {
        while (this.f1772b > j6) {
            Iterator it = ((LinkedHashMap) this.f1773c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.f1772b -= kVar.f1770b;
            Object key = entry.getKey();
            it.remove();
            c(key, kVar.f1769a);
        }
    }

    public void f(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f1773c) == null) {
            this.f1773c = exc;
        }
        if (this.f1771a == -9223372036854775807L && C1801rP.f16518X.get() <= 0) {
            this.f1771a = 200 + jElapsedRealtime;
        }
        long j6 = this.f1771a;
        if (j6 == -9223372036854775807L || jElapsedRealtime < j6) {
            this.f1772b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f1773c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f1773c;
        this.f1773c = null;
        this.f1771a = -9223372036854775807L;
        this.f1772b = -9223372036854775807L;
        throw exc3;
    }

    public boolean g() {
        synchronized (this.f1773c) {
            try {
                p2.j.f22785C.f22797k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f1772b + this.f1771a > jElapsedRealtime) {
                    return false;
                }
                this.f1772b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(long j6) {
        synchronized (this.f1773c) {
            this.f1771a = j6;
        }
    }

    public l(int i, long j6) {
        switch (i) {
            case 2:
                this.f1772b = Long.MIN_VALUE;
                this.f1773c = new Object();
                this.f1771a = j6;
                break;
            default:
                this.f1773c = new LinkedHashMap(100, 0.75f, true);
                this.f1771a = j6;
                break;
        }
    }

    public void c(Object obj, Object obj2) {
    }
}
