package v0;

import com.google.android.gms.internal.ads.lb;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u0.p f35555a;

    /* renamed from: b, reason: collision with root package name */
    public a f35556b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35557c;

    /* renamed from: f, reason: collision with root package name */
    public int f35560f;
    public int g;

    /* renamed from: l, reason: collision with root package name */
    public int f35564l;

    /* renamed from: d, reason: collision with root package name */
    public final lb f35558d = new lb();

    /* renamed from: e, reason: collision with root package name */
    public boolean f35559e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f35561h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f35562i = -1;
    public int j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f35563k = -1;

    public b(u0.p pVar, a aVar) {
        this.f35555a = pVar;
        this.f35556b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f35561h;
        if (arrayList.isEmpty()) {
            this.g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i4 = this.g;
        if (i4 > 0) {
            l0 l0Var = this.f35556b.f35553e;
            l0Var.X(h0.f35578c);
            l0Var.g[l0Var.f35588h - l0Var.f35586e[l0Var.f35587f - 1].f35582a] = i4;
            this.g = 0;
        }
        ArrayList arrayList = this.f35561h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f35556b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        aVar.getClass();
        if (size != 0) {
            l0 l0Var2 = aVar.f35553e;
            l0Var2.X(k.f35584c);
            pd.b.q(l0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i4 = this.f35564l;
        if (i4 > 0) {
            int i10 = this.f35562i;
            if (i10 >= 0) {
                b();
                l0 l0Var = this.f35556b.f35553e;
                l0Var.X(z.f35606c);
                int i11 = l0Var.f35588h - l0Var.f35586e[l0Var.f35587f - 1].f35582a;
                int[] iArr = l0Var.g;
                iArr[i11] = i10;
                iArr[i11 + 1] = i4;
                this.f35562i = -1;
            } else {
                int i12 = this.f35563k;
                int i13 = this.j;
                b();
                l0 l0Var2 = this.f35556b.f35553e;
                l0Var2.X(v.f35602c);
                int i14 = l0Var2.f35588h - l0Var2.f35586e[l0Var2.f35587f - 1].f35582a;
                int[] iArr2 = l0Var2.g;
                iArr2[i14 + 1] = i12;
                iArr2[i14] = i13;
                iArr2[i14 + 2] = i4;
                this.j = -1;
                this.f35563k = -1;
            }
            this.f35564l = 0;
        }
    }

    public final void d(boolean z3) {
        u0.p pVar = this.f35555a;
        int i4 = z3 ? pVar.G.f34735i : pVar.G.g;
        int i10 = i4 - this.f35560f;
        if (i10 < 0) {
            u0.r.a("Tried to seek backward");
        }
        if (i10 > 0) {
            l0 l0Var = this.f35556b.f35553e;
            l0Var.X(d.f35569c);
            l0Var.g[l0Var.f35588h - l0Var.f35586e[l0Var.f35587f - 1].f35582a] = i10;
            this.f35560f = i4;
        }
    }

    public final void e(int i4, int i10) {
        if (i10 > 0) {
            if (!(i4 >= 0)) {
                u0.r.a("Invalid remove index " + i4);
            }
            if (this.f35562i == i4) {
                this.f35564l += i10;
                return;
            }
            c();
            this.f35562i = i4;
            this.f35564l = i10;
        }
    }
}
