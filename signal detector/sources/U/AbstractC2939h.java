package u;

import d5.C2273a;
import java.util.ConcurrentModificationException;
import v.AbstractC2959a;

/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2939h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f23701a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23702b = new Object();

    public static final void a(C2941j c2941j) {
        int i = c2941j.f23709d;
        int[] iArr = c2941j.f23707b;
        Object[] objArr = c2941j.f23708c;
        int i3 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f23702b) {
                if (i6 != i3) {
                    iArr[i3] = iArr[i6];
                    objArr[i3] = obj;
                    objArr[i6] = null;
                }
                i3++;
            }
        }
        c2941j.f23706a = false;
        c2941j.f23709d = i3;
    }

    public static final void b(C2937f c2937f, int i) {
        c2937f.f23694a = new int[i];
        c2937f.f23695b = new Object[i];
    }

    public static final int c(C2937f c2937f, Object obj, int i) {
        int i3 = c2937f.f23696c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC2959a.a(c2937f.f23694a, i3, i);
            if (iA < 0 || q5.i.a(obj, c2937f.f23695b[iA])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i3 && c2937f.f23694a[i6] == i) {
                if (q5.i.a(obj, c2937f.f23695b[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && c2937f.f23694a[i7] == i; i7--) {
                if (q5.i.a(obj, c2937f.f23695b[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final C2273a d(C2941j c2941j) {
        q5.i.e(c2941j, "<this>");
        return new C2273a(2, c2941j);
    }
}
