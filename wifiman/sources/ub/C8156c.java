package ub;

import Vi.InterfaceC3627a;
import Yg.J;
import Zg.U;
import aj.AbstractC3868b;
import aj.C3871e;
import aj.w;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mb.UnknownController;
import mb.x;
import mh.InterfaceC6835l;

/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8156c {

    /* renamed from: a, reason: collision with root package name */
    public static final C8156c f62925a = new C8156c();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3868b f62926b = w.b(null, new InterfaceC6835l() { // from class: ub.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return C8156c.e((C3871e) obj);
        }
    }, 1, null);

    private C8156c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J e(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.c("name");
        Json.d(true);
        Json.f(true);
        Json.g(true);
        cj.f fVar = new cj.f();
        fVar.d(O.b(x.class), new InterfaceC6835l() { // from class: ub.b
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8156c.f((String) obj);
            }
        });
        Json.h(fVar.h());
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3627a f(String str) {
        return UnknownController.INSTANCE.serializer();
    }

    public final Map c(Map map) {
        AbstractC6492s.i(map, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return U.t(linkedHashMap);
        }
        AbstractC5487d.a(((Map.Entry) it.next()).getValue());
        throw new NoWhenBranchMatchedException();
    }

    public final AbstractC3868b d() {
        return f62926b;
    }
}
