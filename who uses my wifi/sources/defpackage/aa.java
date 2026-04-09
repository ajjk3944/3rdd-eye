package defpackage;

import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aa implements y9 {
    public final w40 f;
    public float g = -1.0f;

    public aa(List list) {
        this.f = (w40) list.get(0);
    }

    @Override // defpackage.y9
    public final float b() {
        return this.f.a();
    }

    @Override // defpackage.y9
    public final boolean c(float f) {
        if (this.g == f) {
            return true;
        }
        this.g = f;
        return false;
    }

    @Override // defpackage.y9
    public final float d() {
        return this.f.b();
    }

    @Override // defpackage.y9
    public final w40 e() {
        return this.f;
    }

    @Override // defpackage.y9
    public final boolean f(float f) {
        return !this.f.c();
    }

    @Override // defpackage.y9
    public final boolean isEmpty() {
        return false;
    }
}
