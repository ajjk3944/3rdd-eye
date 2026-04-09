package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wn0 implements ej {
    public final /* synthetic */ int a = 1;
    public final String b;
    public final c4 c;
    public final boolean d;
    public final j4 e;
    public final Object f;

    public wn0(String str, c4 c4Var, c4 c4Var2, h4 h4Var, boolean z) {
        this.b = str;
        this.c = c4Var;
        this.e = c4Var2;
        this.f = h4Var;
        this.d = z;
    }

    @Override // defpackage.ej
    public final vi a(i90 i90Var, u80 u80Var, da daVar) {
        switch (this.a) {
            case 0:
                return new vn0(i90Var, daVar, this);
            default:
                return new kp0(i90Var, daVar, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((j4) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public wn0(String str, j4 j4Var, b4 b4Var, c4 c4Var, boolean z) {
        this.b = str;
        this.e = j4Var;
        this.f = b4Var;
        this.c = c4Var;
        this.d = z;
    }
}
