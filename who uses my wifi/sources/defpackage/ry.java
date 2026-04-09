package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ry extends xc implements qy, l40, py {
    public final int l;
    public final int m;

    public ry(int i, Class cls, String str, String str2, int i2) {
        this(i, wc.f, cls, str, str2, i2, 0);
    }

    @Override // defpackage.qy
    public final int b() {
        return this.l;
    }

    public final l40 d() {
        dp0.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ry) {
            ry ryVar = (ry) obj;
            return this.i.equals(ryVar.i) && this.j.equals(ryVar.j) && this.m == ryVar.m && this.l == ryVar.l && i30.c(this.g, ryVar.g) && c().equals(ryVar.c());
        }
        if (!(obj instanceof ry)) {
            return false;
        }
        l40 l40Var = this.f;
        if (l40Var == null) {
            d();
            this.f = this;
            l40Var = this;
        }
        return obj.equals(l40Var);
    }

    public final int hashCode() {
        c();
        return this.j.hashCode() + ((this.i.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        l40 l40Var = this.f;
        if (l40Var == null) {
            d();
            this.f = this;
            l40Var = this;
        }
        if (l40Var != this) {
            return l40Var.toString();
        }
        String str = this.i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : ex0.h("function ", str, " (Kotlin reflection is not available)");
    }

    public ry(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.l = i;
        this.m = 0;
    }
}
