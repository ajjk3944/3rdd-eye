package e1;

import java.util.Comparator;
import x1.f0;

/* loaded from: classes.dex */
public final class s implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final s f7674a = new s();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        p pVar = (p) obj;
        p pVar2 = (p) obj2;
        int i10 = 0;
        if (d.r(pVar) && d.r(pVar2)) {
            f0 f0VarR = x1.k.r(pVar);
            f0 f0VarR2 = x1.k.r(pVar2);
            if (!br.l.a(f0VarR, f0VarR2)) {
                f0[] f0VarArr = new f0[16];
                int i11 = 0;
                while (f0VarR != null) {
                    int i12 = i11 + 1;
                    if (f0VarArr.length < i12) {
                        int length = f0VarArr.length;
                        ?? r52 = new Object[Math.max(i12, length * 2)];
                        System.arraycopy(f0VarArr, 0, r52, 0, length);
                        f0VarArr = r52;
                    }
                    if (i11 != 0) {
                        System.arraycopy(f0VarArr, 0, f0VarArr, 0 + 1, i11 + 0);
                    }
                    f0VarArr[0] = f0VarR;
                    i11++;
                    f0VarR = f0VarR.C();
                }
                f0[] f0VarArr2 = new f0[16];
                int i13 = 0;
                while (f0VarR2 != null) {
                    int i14 = i13 + 1;
                    if (f0VarArr2.length < i14) {
                        int length2 = f0VarArr2.length;
                        ?? r53 = new Object[Math.max(i14, length2 * 2)];
                        System.arraycopy(f0VarArr2, 0, r53, 0, length2);
                        f0VarArr2 = r53;
                    }
                    if (i13 != 0) {
                        System.arraycopy(f0VarArr2, 0, f0VarArr2, 0 + 1, i13 + 0);
                    }
                    f0VarArr2[0] = f0VarR2;
                    i13++;
                    f0VarR2 = f0VarR2.C();
                }
                int iMin = Math.min(i11 - 1, i13 - 1);
                if (iMin >= 0) {
                    while (br.l.a(f0VarArr[i10], f0VarArr2[i10])) {
                        if (i10 != iMin) {
                            i10++;
                        }
                    }
                    return br.l.g(f0VarArr[i10].D(), f0VarArr2[i10].D());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.r(pVar)) {
                return -1;
            }
            if (d.r(pVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
