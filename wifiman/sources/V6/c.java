package V6;

import Ki.w;
import S6.j;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class c implements com.bumptech.glide.request.e {

    /* renamed from: a, reason: collision with root package name */
    private final Ki.t f22987a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f22988b;

    public c(Ki.t producerScope, InterfaceC6835l failException) {
        AbstractC6492s.i(producerScope, "producerScope");
        AbstractC6492s.i(failException, "failException");
        this.f22987a = producerScope;
        this.f22988b = failException;
    }

    @Override // com.bumptech.glide.request.e
    public boolean a(Object resource, Object model, T2.d dVar, C2.a dataSource, boolean z10) {
        AbstractC6492s.i(resource, "resource");
        AbstractC6492s.i(model, "model");
        AbstractC6492s.i(dataSource, "dataSource");
        Ki.n.b(this.f22987a, new j.d(resource, d.b(dataSource)));
        w.a.a(this.f22987a.g(), null, 1, null);
        return true;
    }

    @Override // com.bumptech.glide.request.e
    public boolean b(GlideException glideException, Object obj, T2.d target, boolean z10) {
        AbstractC6492s.i(target, "target");
        this.f22988b.invoke(glideException);
        return false;
    }
}
