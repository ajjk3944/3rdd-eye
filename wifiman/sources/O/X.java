package o;

import kotlin.jvm.internal.AbstractC6492s;
import p.AbstractC7173a;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f54942a = new Object();

    public static final Object c(W w10, int i10) {
        Object obj;
        AbstractC6492s.i(w10, "<this>");
        int iA = AbstractC7173a.a(w10.f54939b, w10.f54941d, i10);
        if (iA < 0 || (obj = w10.f54940c[iA]) == f54942a) {
            return null;
        }
        return obj;
    }

    public static final void d(W w10, int i10) {
        AbstractC6492s.i(w10, "<this>");
        int iA = AbstractC7173a.a(w10.f54939b, w10.f54941d, i10);
        if (iA >= 0) {
            Object[] objArr = w10.f54940c;
            Object obj = objArr[iA];
            Object obj2 = f54942a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                w10.f54938a = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(W w10) {
        int i10 = w10.f54941d;
        int[] iArr = w10.f54939b;
        Object[] objArr = w10.f54940c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f54942a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        w10.f54938a = false;
        w10.f54941d = i11;
    }
}
