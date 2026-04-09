package f2;

import f2.C5509h;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: f2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5510i {

    /* renamed from: a, reason: collision with root package name */
    private final C5509h.a f46728a = new C5509h.a();

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5496B f46729b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f46730c;

    public final C5509h a() {
        return this.f46728a.a();
    }

    public final void b(boolean z10) {
        this.f46730c = z10;
        this.f46728a.b(z10);
    }

    public final void c(AbstractC5496B value) {
        AbstractC6492s.i(value, "value");
        this.f46729b = value;
        this.f46728a.c(value);
    }
}
