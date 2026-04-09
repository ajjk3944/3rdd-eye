package n1;

import com.google.android.gms.internal.measurement.z3;
import i2.e0;
import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final t f29554a = new t();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        int i4 = 0;
        if (z3.o(sVar) && z3.o(sVar2)) {
            e0 e0VarS = i2.k.s(sVar);
            e0 e0VarS2 = i2.k.s(sVar2);
            if (!nk.k.a(e0VarS, e0VarS2)) {
                e0[] e0VarArr = new e0[16];
                int i10 = 0;
                while (e0VarS != null) {
                    int i11 = i10 + 1;
                    if (e0VarArr.length < i11) {
                        int length = e0VarArr.length;
                        ?? r52 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(e0VarArr, 0, r52, 0, length);
                        e0VarArr = r52;
                    }
                    if (i10 != 0) {
                        System.arraycopy(e0VarArr, 0, e0VarArr, 0 + 1, i10 + 0);
                    }
                    e0VarArr[0] = e0VarS;
                    i10++;
                    e0VarS = e0VarS.v();
                }
                e0[] e0VarArr2 = new e0[16];
                int i12 = 0;
                while (e0VarS2 != null) {
                    int i13 = i12 + 1;
                    if (e0VarArr2.length < i13) {
                        int length2 = e0VarArr2.length;
                        ?? r53 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(e0VarArr2, 0, r53, 0, length2);
                        e0VarArr2 = r53;
                    }
                    if (i12 != 0) {
                        System.arraycopy(e0VarArr2, 0, e0VarArr2, 0 + 1, i12 + 0);
                    }
                    e0VarArr2[0] = e0VarS2;
                    i12++;
                    e0VarS2 = e0VarS2.v();
                }
                int iMin = Math.min(i10 - 1, i12 - 1);
                if (iMin >= 0) {
                    while (nk.k.a(e0VarArr[i4], e0VarArr2[i4])) {
                        if (i4 != iMin) {
                            i4++;
                        }
                    }
                    return nk.k.f(e0VarArr[i4].w(), e0VarArr2[i4].w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (z3.o(sVar)) {
                return -1;
            }
            if (z3.o(sVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
