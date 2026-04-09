package z9;

import kotlinx.serialization.json.internal.f0;

/* loaded from: classes4.dex */
public final class j extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d configuration, aa.c module) {
        super(configuration, module, null);
        kotlin.jvm.internal.p.e(configuration, "configuration");
        kotlin.jvm.internal.p.e(module, "module");
        g();
    }

    public final void g() {
        if (kotlin.jvm.internal.p.a(a(), aa.d.a())) {
            return;
        }
        a().a(new f0(e().k(), e().c()));
    }
}
