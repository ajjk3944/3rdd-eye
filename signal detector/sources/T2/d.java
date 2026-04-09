package T2;

import q2.d1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f3569a;

    /* renamed from: b, reason: collision with root package name */
    public int f3570b;

    /* renamed from: c, reason: collision with root package name */
    public int f3571c;

    public d(int i, int i3, int i6) {
        this.f3569a = i;
        this.f3571c = i3;
        this.f3570b = i6;
    }

    public static d a(d1 d1Var) {
        return d1Var.f23191d ? new d(3, 0, 0) : d1Var.i ? new d(2, 0, 0) : d1Var.f23195h ? new d(0, 0, 0) : new d(1, d1Var.f23193f, d1Var.f23190c);
    }

    public boolean b() {
        return this.f3569a == 3;
    }

    public /* synthetic */ d(int i, int i3, int i6, boolean z6) {
        this.f3569a = i;
        this.f3570b = i3;
        this.f3571c = i6;
    }
}
