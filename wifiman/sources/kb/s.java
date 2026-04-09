package kb;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes3.dex */
public final class s extends r {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f51388b;

    public s(InterfaceC6835l onResponse) {
        AbstractC6492s.i(onResponse, "onResponse");
        this.f51388b = onResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kb.r
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public t c() {
        return new t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kb.r
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(t response) {
        AbstractC6492s.i(response, "response");
        this.f51388b.invoke(response);
    }
}
