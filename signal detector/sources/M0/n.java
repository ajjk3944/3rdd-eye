package M0;

/* loaded from: classes.dex */
public abstract class n extends m {

    /* renamed from: a, reason: collision with root package name */
    public J.e[] f2665a;

    /* renamed from: b, reason: collision with root package name */
    public String f2666b;

    /* renamed from: c, reason: collision with root package name */
    public int f2667c;

    public n() {
        this.f2665a = null;
        this.f2667c = 0;
    }

    public J.e[] getPathData() {
        return this.f2665a;
    }

    public String getPathName() {
        return this.f2666b;
    }

    public void setPathData(J.e[] eVarArr) {
        if (!com.bumptech.glide.d.h(this.f2665a, eVarArr)) {
            this.f2665a = com.bumptech.glide.d.p(eVarArr);
            return;
        }
        J.e[] eVarArr2 = this.f2665a;
        for (int i = 0; i < eVarArr.length; i++) {
            eVarArr2[i].f2012a = eVarArr[i].f2012a;
            int i3 = 0;
            while (true) {
                float[] fArr = eVarArr[i].f2013b;
                if (i3 < fArr.length) {
                    eVarArr2[i].f2013b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public n(n nVar) {
        this.f2665a = null;
        this.f2667c = 0;
        this.f2666b = nVar.f2666b;
        this.f2665a = com.bumptech.glide.d.p(nVar.f2665a);
    }
}
