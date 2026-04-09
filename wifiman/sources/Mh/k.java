package Mh;

import Bh.G;
import Jh.E;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final d f13212a;

    /* renamed from: b, reason: collision with root package name */
    private final p f13213b;

    /* renamed from: c, reason: collision with root package name */
    private final Yg.m f13214c;

    /* renamed from: d, reason: collision with root package name */
    private final Yg.m f13215d;

    /* renamed from: e, reason: collision with root package name */
    private final Oh.e f13216e;

    public k(d components, p typeParameterResolver, Yg.m delegateForDefaultTypeQualifiers) {
        AbstractC6492s.i(components, "components");
        AbstractC6492s.i(typeParameterResolver, "typeParameterResolver");
        AbstractC6492s.i(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f13212a = components;
        this.f13213b = typeParameterResolver;
        this.f13214c = delegateForDefaultTypeQualifiers;
        this.f13215d = delegateForDefaultTypeQualifiers;
        this.f13216e = new Oh.e(this, typeParameterResolver);
    }

    public final d a() {
        return this.f13212a;
    }

    public final E b() {
        return (E) this.f13215d.getValue();
    }

    public final Yg.m c() {
        return this.f13214c;
    }

    public final G d() {
        return this.f13212a.m();
    }

    public final oi.n e() {
        return this.f13212a.u();
    }

    public final p f() {
        return this.f13213b;
    }

    public final Oh.e g() {
        return this.f13216e;
    }
}
