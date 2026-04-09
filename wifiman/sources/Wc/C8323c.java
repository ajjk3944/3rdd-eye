package wc;

import Zg.AbstractC3689v;
import ge.AbstractC5898a;
import h9.C5969a;
import kotlin.jvm.internal.AbstractC6492s;
import wc.C8322b;

/* renamed from: wc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8323c extends AbstractC5898a implements C8322b.a {

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f64821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8323c(h scanner, fe.u schedulers) {
        super(schedulers);
        AbstractC6492s.i(scanner, "scanner");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f64821d = scanner.a(f.BLE);
    }

    @Override // ge.AbstractC5898a
    protected gg.i g() {
        return this.f64821d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.AbstractC5898a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C8322b d(long j10, C8322b c8322b, C8321a c8321a) {
        if ((c8322b != null ? c8322b.a() : null) != null) {
            if ((c8321a != null ? c8321a.k() : null) != null) {
                return new C8322b(c8322b.c(), c8322b.a().compareTo(c8321a.k()) > 0 ? c8322b.a() : c8321a.k(), c(c8322b.b(), c8321a.k(), j10));
            }
        }
        if (c8322b != null) {
            return new C8322b(c8322b.c(), c8322b.a(), c(c8322b.b(), null, j10));
        }
        if (c8321a != null) {
            return new C8322b(c8321a.h(), c8321a.k() == null ? U7.a.f22147e.b() : c8321a.k(), AbstractC3689v.e(new Wc.c(j10, c8321a.k())));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.AbstractC5898a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C8322b e(C5969a id2) {
        AbstractC6492s.i(id2, "id");
        return new C8322b(id2, null, AbstractC3689v.l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.AbstractC5898a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5969a f(C8321a c8321a) {
        AbstractC6492s.i(c8321a, "<this>");
        return c8321a.d();
    }
}
