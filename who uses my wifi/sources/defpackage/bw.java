package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bw {
    public final String a;
    public final int b;

    public bw(String str, int i) {
        this.b = i;
        this.a = str;
    }

    public bw(String str) {
        this.a = str;
        this.b = 0;
    }

    public bw(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }
}
