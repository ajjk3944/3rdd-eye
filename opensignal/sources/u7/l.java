package u7;

/* loaded from: classes.dex */
public abstract class l extends k {

    /* renamed from: a, reason: collision with root package name */
    public k3.f[] f23410a;

    /* renamed from: b, reason: collision with root package name */
    public String f23411b;

    /* renamed from: c, reason: collision with root package name */
    public int f23412c;

    public l() {
        this.f23410a = null;
        this.f23412c = 0;
    }

    public k3.f[] getPathData() {
        return this.f23410a;
    }

    public String getPathName() {
        return this.f23411b;
    }

    public void setPathData(k3.f[] fVarArr) {
        k3.f[] fVarArr2 = this.f23410a;
        boolean z10 = false;
        if (fVarArr2 != null && fVarArr != null && fVarArr2.length == fVarArr.length) {
            int i10 = 0;
            while (true) {
                if (i10 >= fVarArr2.length) {
                    z10 = true;
                    break;
                }
                k3.f fVar = fVarArr2[i10];
                char c4 = fVar.f14019a;
                k3.f fVar2 = fVarArr[i10];
                if (c4 != fVar2.f14019a || fVar.f14020b.length != fVar2.f14020b.length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!z10) {
            this.f23410a = ba.m.s(fVarArr);
            return;
        }
        k3.f[] fVarArr3 = this.f23410a;
        for (int i11 = 0; i11 < fVarArr.length; i11++) {
            fVarArr3[i11].f14019a = fVarArr[i11].f14019a;
            int i12 = 0;
            while (true) {
                float[] fArr = fVarArr[i11].f14020b;
                if (i12 < fArr.length) {
                    fVarArr3[i11].f14020b[i12] = fArr[i12];
                    i12++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f23410a = null;
        this.f23412c = 0;
        this.f23411b = lVar.f23411b;
        this.f23410a = ba.m.s(lVar.f23410a);
    }
}
