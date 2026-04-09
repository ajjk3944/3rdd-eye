package r;

import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f24130a = new Object();

    public static final Object c(l lVar, int i10) {
        Object obj;
        p.e(lVar, "<this>");
        int iA = s.a.a(lVar.f24127b, lVar.f24129d, i10);
        if (iA < 0 || (obj = lVar.f24128c[iA]) == f24130a) {
            return null;
        }
        return obj;
    }

    public static final Object d(l lVar, int i10, Object obj) {
        Object obj2;
        p.e(lVar, "<this>");
        int iA = s.a.a(lVar.f24127b, lVar.f24129d, i10);
        return (iA < 0 || (obj2 = lVar.f24128c[iA]) == f24130a) ? obj : obj2;
    }

    public static final void e(l lVar) {
        int i10 = lVar.f24129d;
        int[] iArr = lVar.f24127b;
        Object[] objArr = lVar.f24128c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24130a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        lVar.f24126a = false;
        lVar.f24129d = i11;
    }
}
