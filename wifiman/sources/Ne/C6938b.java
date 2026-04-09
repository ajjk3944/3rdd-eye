package ne;

import S8.k;
import Wc.c;
import Zg.AbstractC3689v;
import fe.u;
import ge.AbstractC5898a;
import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import le.C6588i;
import le.InterfaceC6586g;
import ne.C6937a;

/* renamed from: ne.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6938b extends AbstractC5898a implements C6937a.InterfaceC1989a {

    /* renamed from: d, reason: collision with root package name */
    private final i f54627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6938b(InterfaceC6586g scannerService, u schedulers) {
        super(schedulers);
        AbstractC6492s.i(scannerService, "scannerService");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f54627d = scannerService.a();
    }

    @Override // ge.AbstractC5898a
    public /* bridge */ /* synthetic */ Object e(Object obj) {
        return i(((k) obj).g());
    }

    @Override // ge.AbstractC5898a
    public /* bridge */ /* synthetic */ Object f(Object obj) {
        return k.a(j((C6588i) obj));
    }

    @Override // ge.AbstractC5898a
    protected i g() {
        return this.f54627d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.AbstractC5898a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C6937a d(long j10, C6937a c6937a, C6588i c6588i) {
        if (c6937a != null && c6588i != null) {
            return new C6937a(c6937a.c(), (c6937a.a() == null || c6588i.q() == null || c6937a.a().compareTo(c6588i.q()) <= 0) ? c6588i.q() : c6937a.a(), c(c6937a.b(), c6588i.q(), j10), null);
        }
        if (c6937a != null) {
            return new C6937a(c6937a.c(), c6937a.a(), c(c6937a.b(), null, j10), null);
        }
        if (c6588i != null) {
            return new C6937a(c6588i.k(), c6588i.q(), AbstractC3689v.e(new c(j10, c6588i.q())), null);
        }
        return null;
    }

    protected C6937a i(String id2) {
        AbstractC6492s.i(id2, "id");
        return new C6937a(id2, null, AbstractC3689v.l(), null);
    }

    protected String j(C6588i itemIdentity) {
        AbstractC6492s.i(itemIdentity, "$this$itemIdentity");
        return itemIdentity.k();
    }
}
