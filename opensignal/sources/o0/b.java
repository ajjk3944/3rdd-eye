package o0;

import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import n0.l0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final n0.p f18684a;

    /* renamed from: b, reason: collision with root package name */
    public a f18685b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18686c;

    /* renamed from: f, reason: collision with root package name */
    public int f18689f;

    /* renamed from: g, reason: collision with root package name */
    public int f18690g;

    /* renamed from: l, reason: collision with root package name */
    public int f18693l;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f18687d = new l0();

    /* renamed from: e, reason: collision with root package name */
    public boolean f18688e = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f18691h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f18692i = -1;
    public int j = -1;
    public int k = -1;

    public b(n0.p pVar, a aVar) {
        this.f18684a = pVar;
        this.f18685b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f18691h;
        if (arrayList.isEmpty()) {
            this.f18690g++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void b() {
        int i10 = this.f18690g;
        if (i10 > 0) {
            h0 h0Var = this.f18685b.f18682a;
            h0Var.e0(e0.f18701d);
            h0Var.f18708c[h0Var.f18709d - h0Var.f18706a[h0Var.f18707b - 1].f18526b] = i10;
            this.f18690g = 0;
        }
        ArrayList arrayList = this.f18691h;
        if (arrayList.isEmpty()) {
            return;
        }
        a aVar = this.f18685b;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = arrayList.get(i11);
        }
        aVar.getClass();
        if (size != 0) {
            h0 h0Var2 = aVar.f18682a;
            h0Var2.e0(j.f18713d);
            i4.G(h0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void c() {
        int i10 = this.f18693l;
        if (i10 > 0) {
            int i11 = this.f18692i;
            if (i11 >= 0) {
                b();
                h0 h0Var = this.f18685b.f18682a;
                h0Var.e0(x.f18731d);
                int i12 = h0Var.f18709d - h0Var.f18706a[h0Var.f18707b - 1].f18526b;
                int[] iArr = h0Var.f18708c;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f18692i = -1;
            } else {
                int i13 = this.k;
                int i14 = this.j;
                b();
                h0 h0Var2 = this.f18685b.f18682a;
                h0Var2.e0(u.f18728d);
                int i15 = h0Var2.f18709d - h0Var2.f18706a[h0Var2.f18707b - 1].f18526b;
                int[] iArr2 = h0Var2.f18708c;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.j = -1;
                this.k = -1;
            }
            this.f18693l = 0;
        }
    }

    public final void d(boolean z10) {
        n0.p pVar = this.f18684a;
        int i10 = z10 ? pVar.G.f17305i : pVar.G.f17303g;
        int i11 = i10 - this.f18689f;
        if (i11 < 0) {
            n0.q.c("Tried to seek backward");
        }
        if (i11 > 0) {
            h0 h0Var = this.f18685b.f18682a;
            h0Var.e0(d.f18698d);
            h0Var.f18708c[h0Var.f18709d - h0Var.f18706a[h0Var.f18707b - 1].f18526b] = i11;
            this.f18689f = i10;
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                n0.q.c("Invalid remove index " + i10);
            }
            if (this.f18692i == i10) {
                this.f18693l += i11;
                return;
            }
            c();
            this.f18692i = i10;
            this.f18693l = i11;
        }
    }
}
