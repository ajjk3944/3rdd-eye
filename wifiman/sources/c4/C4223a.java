package c4;

import android.graphics.Typeface;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4223a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f33834a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1176a f33835b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33836c;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public interface InterfaceC1176a {
        void a(Typeface typeface);
    }

    public C4223a(InterfaceC1176a interfaceC1176a, Typeface typeface) {
        this.f33834a = typeface;
        this.f33835b = interfaceC1176a;
    }

    private void d(Typeface typeface) {
        if (this.f33836c) {
            return;
        }
        this.f33835b.a(typeface);
    }

    @Override // c4.f
    public void a(int i10) {
        d(this.f33834a);
    }

    @Override // c4.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f33836c = true;
    }
}
