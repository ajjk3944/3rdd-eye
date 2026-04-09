package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sc implements rc {
    public int f;
    public gg0 g;
    public int h;
    public int i;

    @Override // defpackage.rc
    public final int a(int i) {
        return this.h - i;
    }

    @Override // defpackage.rc
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.i;
    }

    @Override // defpackage.rc
    public final int getType() {
        return this.f;
    }

    public final String toString() {
        gg0 gg0Var = this.g;
        StringBuilder sb = new StringBuilder();
        int i = this.f;
        if (i == 0) {
            sb.append("NXDOMAIN ");
            sb.append(gg0Var);
        } else {
            sb.append("NXRRSET ");
            sb.append(gg0Var);
            sb.append(" ");
            sb.append(k31.a.e(i));
        }
        sb.append(" cl = ");
        sb.append(this.h);
        return sb.toString();
    }
}
