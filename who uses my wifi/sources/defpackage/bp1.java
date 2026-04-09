package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bp1 extends u94 {
    static {
        zt0.I(bp1.class);
    }

    public bp1(lx lxVar, ap1 ap1Var) {
        ByteBuffer byteBuffer = (ByteBuffer) lxVar.g;
        long jLimit = byteBuffer.limit();
        this.g = lxVar;
        this.i = lxVar.s();
        byteBuffer.position((int) (lxVar.s() + jLimit));
        this.j = lxVar.s();
        this.f = ap1Var;
    }

    @Override // defpackage.u94
    public final String toString() {
        String string = this.g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // defpackage.u94, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
