package D3;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class b extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f1259a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1260b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1261c;

    public b(a aVar, Typeface typeface) {
        this.f1259a = typeface;
        this.f1260b = aVar;
    }

    @Override // com.bumptech.glide.d
    public final void I(int i) {
        if (this.f1261c) {
            return;
        }
        this.f1260b.j(this.f1259a);
    }

    @Override // com.bumptech.glide.d
    public final void J(Typeface typeface, boolean z6) {
        if (this.f1261c) {
            return;
        }
        this.f1260b.j(typeface);
    }
}
