package d5;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f20761a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0384a f20762b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20763c;

    /* renamed from: d5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0384a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0384a interfaceC0384a, Typeface typeface) {
        this.f20761a = typeface;
        this.f20762b = interfaceC0384a;
    }

    @Override // d5.g
    public void a(int i10) {
        d(this.f20761a);
    }

    @Override // d5.g
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f20763c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f20763c) {
            return;
        }
        this.f20762b.a(typeface);
    }
}
