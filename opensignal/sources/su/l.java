package su;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import xu.n;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22356a = 2;

    /* renamed from: b, reason: collision with root package name */
    public long f22357b;

    /* renamed from: c, reason: collision with root package name */
    public Object f22358c;

    /* renamed from: d, reason: collision with root package name */
    public Object f22359d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f22360e;

    public l(long j, Bundle bundle, String str, String str2) {
        this.f22358c = str;
        this.f22359d = str2;
        this.f22360e = bundle;
        this.f22357b = j;
    }

    public static l d(zzbg zzbgVar) {
        String str = zzbgVar.f5405a;
        String str2 = zzbgVar.f5407g;
        return new l(zzbgVar.f5408r, zzbgVar.f5406d.j(), str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(ou.a r6, su.i r7, java.util.ArrayList r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f22360e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            su.k r1 = (su.k) r1
            java.lang.String r3 = "connection"
            br.l.d(r1, r3)
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L28
            vu.q r4 = r1.f22347g     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L23
            r2 = r3
        L23:
            if (r2 == 0) goto L33
            goto L28
        L26:
            r6 = move-exception
            goto L35
        L28:
            boolean r2 = r1.h(r6, r8)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L33
            r7.b(r1)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)
            return r3
        L33:
            monitor-exit(r1)
            goto L8
        L35:
            monitor-exit(r1)
            throw r6
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: su.l.a(ou.a, su.i, java.util.ArrayList, boolean):boolean");
    }

    public int b(k kVar, long j) {
        byte[] bArr = pu.b.f20645a;
        ArrayList arrayList = kVar.f22354p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + kVar.f22342b.f19904a.f19858h + " was leaked. Did you forget to close a response body?";
                n nVar = n.f25563a;
                n.f25563a.j(((g) reference).f22333a, str);
                arrayList.remove(i10);
                kVar.j = true;
                if (arrayList.isEmpty()) {
                    kVar.f22355q = j - this.f22357b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r8 r16 r17
  0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.z2) = (r16v5 com.google.android.gms.internal.measurement.z2), (r16v10 com.google.android.gms.internal.measurement.z2) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.measurement.z2 c(com.google.android.gms.internal.measurement.z2 r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.l.c(com.google.android.gms.internal.measurement.z2, java.lang.String):com.google.android.gms.internal.measurement.z2");
    }

    public zzbg e() {
        return new zzbg((String) this.f22358c, new zzbe(new Bundle((Bundle) this.f22360e)), (String) this.f22359d, this.f22357b);
    }

    public String toString() {
        switch (this.f22356a) {
            case 2:
                String str = (String) this.f22359d;
                String string = ((Bundle) this.f22360e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f22358c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                w.g.q(sb2, "origin=", str, ",name=", str2);
                return w.g.j(sb2, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l(zc.c cVar) {
        this.f22360e = cVar;
    }

    public l(ru.c cVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        br.l.e(cVar, "taskRunner");
        br.l.e(timeUnit, "timeUnit");
        this.f22357b = timeUnit.toNanos(5L);
        this.f22358c = cVar.e();
        this.f22359d = new qu.f(this, w.g.j(new StringBuilder(), pu.b.f20651g, " ConnectionPool"), 2);
        this.f22360e = new ConcurrentLinkedQueue();
    }

    public l(ag.b bVar, o2.g gVar, ThreadFactory threadFactory, long j) {
        this.f22358c = bVar;
        this.f22360e = gVar;
        this.f22357b = j;
    }
}
