package u;

import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f23095a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23096b = new Object();

    public static final void a(f fVar, int i10) {
        fVar.f23064a = new int[i10];
        fVar.f23065d = new Object[i10];
    }

    public static final int b(f fVar, Object obj, int i10) {
        int i11 = fVar.f23066g;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = v.a.a(i11, i10, fVar.f23064a);
            if (iA < 0 || br.l.a(obj, fVar.f23065d[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.f23064a[i12] == i10) {
                if (br.l.a(obj, fVar.f23065d[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.f23064a[i13] == i10; i13--) {
                if (br.l.a(obj, fVar.f23065d[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
