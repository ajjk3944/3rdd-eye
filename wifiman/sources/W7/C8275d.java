package w7;

import Zg.AbstractC3689v;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import s7.C7920g;
import u7.AbstractC8138a;
import z7.j;
import z7.y;

/* renamed from: w7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8275d {

    /* renamed from: a, reason: collision with root package name */
    public static final C8275d f64481a = new C8275d();

    /* renamed from: w7.d$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f64482a = new a();

        a() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke(C7920g it) {
            AbstractC6492s.i(it, "it");
            return 5000L;
        }
    }

    private C8275d() {
    }

    public final AbstractC8138a a() {
        return new z7.g("Mikrotik", AbstractC3689v.e(new j(C8272a.f64474a.a(), 5678, new byte[]{0, 0, 0, 0}, null)), new B7.a(), 5678, new y(null, 1, null), a.f64482a, false, null, 192, null);
    }
}
