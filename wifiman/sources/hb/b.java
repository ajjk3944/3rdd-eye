package Hb;

import Yg.J;
import aj.AbstractC3868b;
import aj.C3871e;
import aj.w;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7819a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3868b f7820b = w.b(null, new InterfaceC6835l() { // from class: Hb.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return b.c((C3871e) obj);
        }
    }, 1, null);

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.f(true);
        Json.g(true);
        return J.f24997a;
    }

    public final AbstractC3868b b() {
        return f7820b;
    }
}
