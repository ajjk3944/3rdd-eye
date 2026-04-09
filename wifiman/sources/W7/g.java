package w7;

import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import s7.C7920g;
import u7.AbstractC8138a;
import u7.InterfaceC8139b;
import z7.y;

/* loaded from: classes3.dex */
public final class g implements InterfaceC8139b {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64488a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(C7920g it) {
            AbstractC6492s.i(it, "it");
            return 30000L;
        }
    }

    @Override // u7.InterfaceC8139b
    public AbstractC8138a b() {
        return new z7.g("UiPassive", AbstractC3689v.l(), new C7.b(), 10001, new y(null, 1, null), a.f64488a, true, null, 128, null);
    }
}
