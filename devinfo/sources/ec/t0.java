package ec;

import android.os.Bundle;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23068a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f23069b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23070c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23071d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23072e;

    public t0(long j, Bundle bundle, String str, String str2) {
        this.f23070c = str;
        this.f23071d = str2;
        this.f23072e = bundle;
        this.f23069b = j;
    }

    public static t0 c(u uVar) {
        String str = uVar.f23085a;
        String str2 = uVar.f23087c;
        return new t0(uVar.f23088d, uVar.f23086b.f(), str, str2);
    }

    public int a(vl.n nVar, long j) {
        TimeZone timeZone = sl.h.f33837a;
        ArrayList arrayList = nVar.f36360p;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i4);
            if (reference.get() != null) {
                i4++;
            } else {
                String str = "A connection to " + nVar.f36349c.f33052a.f33026h + " was leaked. Did you forget to close a response body?";
                bm.e eVar = bm.e.f2349a;
                bm.e.f2349a.k(str, ((vl.k) reference).f36330a);
                arrayList.remove(i4);
                if (arrayList.isEmpty()) {
                    nVar.f36361q = j - this.f23069b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[PHI: r8 r16 r17
  0x00ff: PHI (r8v6 android.database.Cursor) = (r8v7 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r16v3 com.google.android.gms.internal.measurement.b3) = (r16v5 com.google.android.gms.internal.measurement.b3), (r16v10 com.google.android.gms.internal.measurement.b3) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012a, B:46:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.measurement.b3 b(com.google.android.gms.internal.measurement.b3 r21, java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.t0.b(com.google.android.gms.internal.measurement.b3, java.lang.String):com.google.android.gms.internal.measurement.b3");
    }

    public u d() {
        return new u((String) this.f23070c, new t(new Bundle((Bundle) this.f23072e)), (String) this.f23071d, this.f23069b);
    }

    public String toString() {
        switch (this.f23068a) {
            case 0:
                String str = (String) this.f23071d;
                String string = ((Bundle) this.f23072e).toString();
                int length = String.valueOf(str).length();
                String str2 = (String) this.f23070c;
                StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
                je.u.B(sb2, "origin=", str, ",name=", str2);
                return d.h.w(sb2, ",params=", string);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t0(c cVar) {
        this.f23072e = cVar;
    }

    public t0(ul.d dVar) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        nk.k.e(dVar, "taskRunner");
        nk.k.e(timeUnit, "timeUnit");
        this.f23069b = timeUnit.toNanos(5L);
        this.f23070c = dVar.d();
        this.f23071d = new ul.b(this, d.h.w(new StringBuilder(), sl.h.f33838b, " ConnectionPool connection closer"));
        this.f23072e = new ConcurrentLinkedQueue();
    }
}
