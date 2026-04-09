package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cs0 extends yr0 {
    @Override // defpackage.yr0
    public final void a(byte[] bArr) throws t91 {
        if (bArr.length > 0) {
            throw new t91("No value can be specified for no-default-alpn");
        }
    }

    @Override // defpackage.yr0
    public final byte[] b() {
        return new byte[0];
    }

    @Override // defpackage.yr0
    public final String toString() {
        return "";
    }
}
