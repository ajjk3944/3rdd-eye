package h7;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b9.c f10014a;

    /* renamed from: b, reason: collision with root package name */
    public int f10015b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f10016c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f10017d = -1;

    public c(b9.c cVar) {
        this.f10014a = cVar;
    }

    public final void a() {
        mm.d dVar = (mm.d) this.f10014a.f2478d;
        int i10 = this.f10015b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            dVar.g(this.f10016c, this.f10017d);
        } else if (i10 == 2) {
            dVar.h(this.f10016c, this.f10017d);
        } else if (i10 == 3) {
            dVar.f10189a.d(this.f10016c, this.f10017d);
        }
        this.f10015b = 0;
    }

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (this.f10015b == 3 && i10 <= (i13 = this.f10017d + (i12 = this.f10016c)) && (i14 = i10 + i11) >= i12) {
            this.f10016c = Math.min(i10, i12);
            this.f10017d = Math.max(i13, i14) - this.f10016c;
        } else {
            a();
            this.f10016c = i10;
            this.f10017d = i11;
            this.f10015b = 3;
        }
    }

    public final void c(int i10, int i11) {
        a();
        ((mm.d) this.f10014a.f2478d).f(i10, i11);
    }
}
