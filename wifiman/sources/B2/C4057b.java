package b2;

import b2.AbstractC4056a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4057b extends AbstractC4056a {
    public C4057b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // b2.AbstractC4056a
    public Object a(AbstractC4056a.b key) {
        AbstractC6492s.i(key, "key");
        return b().get(key);
    }

    public final void c(AbstractC4056a.b key, Object obj) {
        AbstractC6492s.i(key, "key");
        b().put(key, obj);
    }

    public C4057b(AbstractC4056a initialExtras) {
        AbstractC6492s.i(initialExtras, "initialExtras");
        b().putAll(initialExtras.b());
    }

    public /* synthetic */ C4057b(AbstractC4056a abstractC4056a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC4056a.C1139a.f32794b : abstractC4056a);
    }
}
