package qb;

import Yg.J;
import aj.C3871e;
import aj.w;
import cb.EnumC4235a;
import cj.C4270b;
import cj.f;
import com.ui.unifi.core.base.net.traces.TracesClient;
import gg.AbstractC5912b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6835l;
import rb.SupportPinTraceBody;
import rb.TracesBody;
import wb.C8294d;

/* renamed from: qb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7447b implements TracesClient {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7448c f58606a;

    public C7447b(EnumC4235a environment) throws SecurityException {
        AbstractC6492s.i(environment, "environment");
        Object objB = new C8294d(environment.getTracesUrl(), null, null, null, null, null, w.b(null, new InterfaceC6835l() { // from class: qb.a
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C7447b.b((C3871e) obj);
            }
        }, 1, null), null, null, 446, null).d().b(InterfaceC7448c.class);
        AbstractC6492s.h(objB, "create(...)");
        this.f58606a = (InterfaceC7448c) objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J b(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.d(true);
        Json.f(true);
        Json.c("name");
        f fVar = new f();
        C4270b c4270b = new C4270b(O.b(rb.f.class), null);
        c4270b.c(O.b(SupportPinTraceBody.class), SupportPinTraceBody.INSTANCE.serializer());
        c4270b.a(fVar);
        Json.h(fVar.h());
        return J.f24997a;
    }

    @Override // com.ui.unifi.core.base.net.traces.TracesClient
    public AbstractC5912b reportTrace(TracesBody tracesBody) {
        AbstractC6492s.i(tracesBody, "tracesBody");
        return this.f58606a.reportTrace(tracesBody);
    }
}
