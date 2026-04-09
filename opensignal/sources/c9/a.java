package c9;

import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3384a = io.sentry.internal.debugmeta.c.v("k", "x", "y");

    public static br.a0 a(d9.c cVar, r8.h hVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.V() == d9.a.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.w()) {
                d9.c cVar2 = cVar;
                r8.h hVar2 = hVar;
                arrayList.add(new u8.k(hVar2, q.b(cVar2, hVar2, e9.j.c(), f.f3403x, cVar.V() == d9.a.BEGIN_OBJECT, false)));
                cVar = cVar2;
                hVar = hVar2;
            }
            cVar.h();
            r.b(arrayList);
        } else {
            arrayList.add(new f9.a(p.b(cVar, e9.j.c())));
        }
        return new br.a0(arrayList);
    }

    public static y8.e b(d9.c cVar, r8.h hVar) {
        cVar.f();
        br.a0 a0VarA = null;
        y8.b bVarW = null;
        boolean z10 = false;
        y8.b bVarW2 = null;
        while (cVar.V() != d9.a.END_OBJECT) {
            int iZ = cVar.Z(f3384a);
            if (iZ == 0) {
                a0VarA = a(cVar, hVar);
            } else if (iZ != 1) {
                if (iZ != 2) {
                    cVar.f0();
                    cVar.i0();
                } else if (cVar.V() == d9.a.STRING) {
                    cVar.i0();
                    z10 = true;
                } else {
                    bVarW = i4.w(cVar, hVar, true);
                }
            } else if (cVar.V() == d9.a.STRING) {
                cVar.i0();
                z10 = true;
            } else {
                bVarW2 = i4.w(cVar, hVar, true);
            }
        }
        cVar.i();
        if (z10) {
            hVar.a("Lottie doesn't support expressions.");
        }
        return a0VarA != null ? a0VarA : new y8.c(bVarW2, bVarW);
    }
}
