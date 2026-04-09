package Zc;

import Wc.b;
import b8.AbstractC4074a;
import gg.i;
import kd.InterfaceC6454d;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b implements Zc.a {

    /* renamed from: a, reason: collision with root package name */
    private final i f25268a;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f25269a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC4074a apply(Wc.b it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof b.C0898b) {
                return AbstractC4074a.b.f33000a;
            }
            if (it instanceof b.a.C0897b) {
                return AbstractC4074a.C1143a.f32999a;
            }
            if ((it instanceof b.a.C0896a) || (it instanceof b.c)) {
                return AbstractC4074a.c.f33001a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public b(InterfaceC6454d publicIpService) {
        AbstractC6492s.i(publicIpService, "publicIpService");
        i iVarI2 = publicIpService.a().N0(a.f25269a).z1(AbstractC4074a.b.f33000a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f25268a = iVarI2;
    }

    @Override // Zc.a
    public i a() {
        return this.f25268a;
    }
}
