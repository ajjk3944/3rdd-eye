package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h74 extends IllegalArgumentException {
    public h74(int i, int i2) {
        super(ga1.l(new StringBuilder(String.valueOf(i).length() + 32 + String.valueOf(i2).length()), "Unpaired surrogate at index ", i, " of ", i2));
    }
}
