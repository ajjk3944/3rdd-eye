package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kj1 implements gg1, dp2 {
    public static final kj1 h;
    public static final kj1 i;
    public final /* synthetic */ int f;
    public boolean g;

    static {
        int i2 = 0;
        h = new kj1(i2, true);
        i = new kj1(i2, false);
    }

    public /* synthetic */ kj1(int i2) {
        this.f = i2;
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        ap2 ap2Var = (ap2) obj;
        switch (this.f) {
            case 3:
                ap2Var.S(this.g);
                break;
            default:
                ap2Var.r0(this.g);
                break;
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                boolean z = !this.g;
                StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 33);
                sb.append("IncorrectFragmentation{expected=");
                sb.append(z);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kj1(int i2, boolean z) {
        this.f = i2;
        this.g = z;
    }

    public /* synthetic */ kj1(boolean z, vq2 vq2Var) {
        this.f = 1;
        this.g = z;
    }
}
