package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class k51 {
    public boolean a = true;
    public boolean b = false;
    public boolean c = false;

    public de4 a() {
        if (this.a || !(this.b || this.c)) {
            return new de4(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
