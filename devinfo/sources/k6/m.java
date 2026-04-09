package k6;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a, reason: collision with root package name */
    public v3.d[] f28003a;

    /* renamed from: b, reason: collision with root package name */
    public String f28004b;

    /* renamed from: c, reason: collision with root package name */
    public int f28005c;

    public m() {
        this.f28003a = null;
        this.f28005c = 0;
    }

    public v3.d[] getPathData() {
        return this.f28003a;
    }

    public String getPathName() {
        return this.f28004b;
    }

    public void setPathData(v3.d[] dVarArr) {
        if (!wb.e.e(this.f28003a, dVarArr)) {
            this.f28003a = wb.e.n(dVarArr);
            return;
        }
        v3.d[] dVarArr2 = this.f28003a;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            dVarArr2[i4].f35798a = dVarArr[i4].f35798a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i4].f35799b;
                if (i10 < fArr.length) {
                    dVarArr2[i4].f35799b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f28003a = null;
        this.f28005c = 0;
        this.f28004b = mVar.f28004b;
        this.f28003a = wb.e.n(mVar.f28003a);
    }
}
