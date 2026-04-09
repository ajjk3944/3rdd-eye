package b1;

import C0.InterfaceC2540u;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4054k implements InterfaceC2540u {

    /* renamed from: a, reason: collision with root package name */
    private final C4049f f32747a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f32748b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f32749c;

    public C4054k(C4049f c4049f, InterfaceC6835l interfaceC6835l) {
        this.f32747a = c4049f;
        this.f32748b = interfaceC6835l;
        this.f32749c = c4049f.a();
    }

    public final InterfaceC6835l a() {
        return this.f32748b;
    }

    public final C4049f b() {
        return this.f32747a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4054k) {
            C4054k c4054k = (C4054k) obj;
            if (AbstractC6492s.d(this.f32747a.a(), c4054k.f32747a.a()) && this.f32748b == c4054k.f32748b) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.InterfaceC2540u
    public Object g0() {
        return this.f32749c;
    }

    public int hashCode() {
        return (this.f32747a.a().hashCode() * 31) + this.f32748b.hashCode();
    }
}
