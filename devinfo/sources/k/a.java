package k;

import android.graphics.drawable.Animatable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27721a;

    /* renamed from: b, reason: collision with root package name */
    public final Animatable f27722b;

    public /* synthetic */ a(Animatable animatable, int i4) {
        this.f27721a = i4;
        this.f27722b = animatable;
    }

    @Override // com.bumptech.glide.d
    public final void A() {
        switch (this.f27721a) {
            case 0:
                this.f27722b.start();
                break;
            default:
                ((k6.e) this.f27722b).start();
                break;
        }
    }

    @Override // com.bumptech.glide.d
    public final void B() {
        switch (this.f27721a) {
            case 0:
                this.f27722b.stop();
                break;
            default:
                ((k6.e) this.f27722b).stop();
                break;
        }
    }
}
