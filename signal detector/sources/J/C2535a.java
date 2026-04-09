package j;

import android.graphics.drawable.Animatable;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2535a extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21220a;

    /* renamed from: b, reason: collision with root package name */
    public final Animatable f21221b;

    public /* synthetic */ C2535a(Animatable animatable, int i) {
        this.f21220a = i;
        this.f21221b = animatable;
    }

    @Override // com.bumptech.glide.d
    public final void Z() {
        switch (this.f21220a) {
            case 0:
                this.f21221b.start();
                break;
            default:
                ((M0.f) this.f21221b).start();
                break;
        }
    }

    @Override // com.bumptech.glide.d
    public final void c0() {
        switch (this.f21220a) {
            case 0:
                this.f21221b.stop();
                break;
            default:
                ((M0.f) this.f21221b).stop();
                break;
        }
    }
}
