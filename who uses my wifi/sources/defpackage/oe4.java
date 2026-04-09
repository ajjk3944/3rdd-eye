package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oe4 extends Exception {
    public final int f;
    public final boolean g;
    public final ph4 h;

    public oe4(int i, ph4 ph4Var, boolean z) {
        super(ex0.j(new StringBuilder(String.valueOf(i).length() + 25), "AudioTrack write failed: ", i));
        this.g = z;
        this.f = i;
        this.h = ph4Var;
    }
}
