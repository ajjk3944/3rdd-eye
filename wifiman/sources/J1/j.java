package j1;

import java.util.ArrayList;
import java.util.Arrays;
import k1.o;

/* loaded from: classes.dex */
public abstract class j extends e implements i {

    /* renamed from: K0, reason: collision with root package name */
    public e[] f50027K0 = new e[4];

    /* renamed from: L0, reason: collision with root package name */
    public int f50028L0 = 0;

    public void a1(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f50028L0 + 1;
        e[] eVarArr = this.f50027K0;
        if (i10 > eVarArr.length) {
            this.f50027K0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f50027K0;
        int i11 = this.f50028L0;
        eVarArr2[i11] = eVar;
        this.f50028L0 = i11 + 1;
    }

    public void b1(ArrayList arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f50028L0; i11++) {
            oVar.a(this.f50027K0[i11]);
        }
        for (int i12 = 0; i12 < this.f50028L0; i12++) {
            k1.i.a(this.f50027K0[i12], i10, arrayList, oVar);
        }
    }

    public int c1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f50028L0; i13++) {
            e eVar = this.f50027K0[i13];
            if (i10 == 0 && (i12 = eVar.f49872H0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f49874I0) != -1) {
                return i11;
            }
        }
        return -1;
    }
}
