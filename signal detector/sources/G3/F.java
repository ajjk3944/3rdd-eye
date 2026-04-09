package G3;

import android.util.StateSet;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public int f1532a;

    /* renamed from: b, reason: collision with root package name */
    public o f1533b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f1534c;

    /* renamed from: d, reason: collision with root package name */
    public o[] f1535d;

    /* renamed from: e, reason: collision with root package name */
    public E f1536e;

    /* renamed from: f, reason: collision with root package name */
    public E f1537f;

    /* renamed from: g, reason: collision with root package name */
    public E f1538g;

    /* renamed from: h, reason: collision with root package name */
    public E f1539h;

    public F(o oVar) {
        b();
        a(StateSet.WILD_CARD, oVar);
    }

    public final void a(int[] iArr, o oVar) {
        int i = this.f1532a;
        if (i == 0 || iArr.length == 0) {
            this.f1533b = oVar;
        }
        int[][] iArr2 = this.f1534c;
        if (i >= iArr2.length) {
            int i3 = i + 10;
            int[][] iArr3 = new int[i3][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f1534c = iArr3;
            o[] oVarArr = new o[i3];
            System.arraycopy(this.f1535d, 0, oVarArr, 0, i);
            this.f1535d = oVarArr;
        }
        int[][] iArr4 = this.f1534c;
        int i6 = this.f1532a;
        iArr4[i6] = iArr;
        this.f1535d[i6] = oVar;
        this.f1532a = i6 + 1;
    }

    public final void b() {
        this.f1533b = new o();
        this.f1534c = new int[10][];
        this.f1535d = new o[10];
    }
}
