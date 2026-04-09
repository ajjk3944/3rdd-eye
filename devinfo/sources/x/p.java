package x;

import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f36928a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f36929b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f36930c = new Object();

    public static final void a(f fVar, int i4) {
        fVar.f36879a = new int[i4];
        fVar.f36880b = new Object[i4];
    }

    public static final int b(f fVar, Object obj, int i4) {
        int i10 = fVar.f36881c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = y.a.a(fVar.f36879a, i10, i4);
            if (iA < 0 || nk.k.a(obj, fVar.f36880b[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && fVar.f36879a[i11] == i4) {
                if (nk.k.a(obj, fVar.f36880b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && fVar.f36879a[i12] == i4; i12--) {
                if (nk.k.a(obj, fVar.f36880b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
