package androidx.media3.common;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f1729b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1730c;

    public o(int i10) {
        this.f1728a = i10;
        switch (i10) {
            case 1:
                this.f1729b = new SparseBooleanArray();
                break;
            default:
                this.f1729b = new SparseBooleanArray();
                break;
        }
    }

    public final void a(int i10) {
        switch (this.f1728a) {
            case 0:
                a5.a.i(!this.f1730c);
                this.f1729b.append(i10, true);
                break;
            default:
                qb.b.j(!this.f1730c);
                this.f1729b.append(i10, true);
                break;
        }
    }

    public p b() {
        a5.a.i(!this.f1730c);
        this.f1730c = true;
        return new p(this.f1729b);
    }

    public qb.f c() {
        qb.b.j(!this.f1730c);
        this.f1730c = true;
        return new qb.f(this.f1729b);
    }
}
