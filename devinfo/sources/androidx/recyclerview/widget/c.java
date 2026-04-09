package androidx.recyclerview.widget;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f1308a;

    /* renamed from: b, reason: collision with root package name */
    public int f1309b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1310c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f1311d = -1;

    public c(b bVar) {
        this.f1308a = bVar;
    }

    public final void a() {
        t0 t0Var = (t0) this.f1308a.f1307a;
        int i4 = this.f1309b;
        if (i4 == 0) {
            return;
        }
        if (i4 == 1) {
            t0Var.notifyItemRangeInserted(this.f1310c, this.f1311d);
        } else if (i4 == 2) {
            t0Var.notifyItemRangeRemoved(this.f1310c, this.f1311d);
        } else if (i4 == 3) {
            t0Var.notifyItemRangeChanged(this.f1310c, this.f1311d, null);
        }
        this.f1309b = 0;
    }

    public final void b(int i4, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f1309b == 3 && i4 <= (i12 = this.f1311d + (i11 = this.f1310c)) && (i13 = i4 + i10) >= i11) {
            this.f1310c = Math.min(i4, i11);
            this.f1311d = Math.max(i12, i13) - this.f1310c;
        } else {
            a();
            this.f1310c = i4;
            this.f1311d = i10;
            this.f1309b = 3;
        }
    }

    public final void c(int i4, int i10) {
        a();
        ((t0) this.f1308a.f1307a).notifyItemMoved(i4, i10);
    }
}
