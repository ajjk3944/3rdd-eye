package k8;

import android.graphics.Bitmap;
import java.util.Date;
import ou.a0;
import ou.s;
import q8.i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f14200a;

    /* renamed from: b, reason: collision with root package name */
    public final b f14201b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f14202c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14203d;

    /* renamed from: e, reason: collision with root package name */
    public final Date f14204e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14205f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f14206g;

    /* renamed from: h, reason: collision with root package name */
    public final long f14207h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14208i;
    public final String j;
    public final int k;

    public c(a0 a0Var, b bVar) {
        int i10;
        this.f14200a = a0Var;
        this.f14201b = bVar;
        this.k = -1;
        if (bVar != null) {
            this.f14207h = bVar.f14195d;
            this.f14208i = bVar.f14196g;
            s sVar = (s) bVar.B;
            int size = sVar.size();
            for (int i11 = 0; i11 < size; i11++) {
                String strB = sVar.b(i11);
                if (tt.s.g0(strB, "Date")) {
                    String strA = sVar.a("Date");
                    this.f14202c = strA != null ? tu.c.a(strA) : null;
                    this.f14203d = sVar.d(i11);
                } else if (tt.s.g0(strB, "Expires")) {
                    String strA2 = sVar.a("Expires");
                    this.f14206g = strA2 != null ? tu.c.a(strA2) : null;
                } else if (tt.s.g0(strB, "Last-Modified")) {
                    String strA3 = sVar.a("Last-Modified");
                    this.f14204e = strA3 != null ? tu.c.a(strA3) : null;
                    this.f14205f = sVar.d(i11);
                } else if (tt.s.g0(strB, "ETag")) {
                    this.j = sVar.d(i11);
                } else if (tt.s.g0(strB, "Age")) {
                    String strD = sVar.d(i11);
                    Bitmap.Config[] configArr = i.f20736a;
                    Long lP0 = tt.s.p0(strD);
                    if (lP0 != null) {
                        long jLongValue = lP0.longValue();
                        i10 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                    } else {
                        i10 = -1;
                    }
                    this.k = i10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, lq.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k8.d a() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.a():k8.d");
    }
}
