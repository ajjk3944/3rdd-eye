package N6;

import java.util.Arrays;

/* renamed from: N6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3370e {

    /* renamed from: a, reason: collision with root package name */
    private final p[] f15354a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15355b;

    public C3370e(p... pVarArr) {
        boolean z10;
        this.f15354a = pVarArr;
        if (pVarArr == null || pVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
            for (p pVar : pVarArr) {
                if (!pVar.b()) {
                    break;
                }
            }
            z10 = true;
        }
        this.f15355b = z10;
    }

    public boolean a() {
        return this.f15355b;
    }

    public boolean b(o oVar) {
        p[] pVarArr = this.f15354a;
        if (pVarArr == null || pVarArr.length == 0) {
            return true;
        }
        for (p pVar : pVarArr) {
            if (pVar.a(oVar)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "emulatedFilters=" + Arrays.toString(this.f15354a);
    }
}
