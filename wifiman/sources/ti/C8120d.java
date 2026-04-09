package ti;

import Bh.l0;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import pi.S;

/* renamed from: ti.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C8120d {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f62661a;

    /* renamed from: b, reason: collision with root package name */
    private final S f62662b;

    /* renamed from: c, reason: collision with root package name */
    private final S f62663c;

    public C8120d(l0 typeParameter, S inProjection, S outProjection) {
        AbstractC6492s.i(typeParameter, "typeParameter");
        AbstractC6492s.i(inProjection, "inProjection");
        AbstractC6492s.i(outProjection, "outProjection");
        this.f62661a = typeParameter;
        this.f62662b = inProjection;
        this.f62663c = outProjection;
    }

    public final S a() {
        return this.f62662b;
    }

    public final S b() {
        return this.f62663c;
    }

    public final l0 c() {
        return this.f62661a;
    }

    public final boolean d() {
        return e.f52144a.c(this.f62662b, this.f62663c);
    }
}
