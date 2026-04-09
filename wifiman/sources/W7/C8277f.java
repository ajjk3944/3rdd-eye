package w7;

import kotlin.jvm.internal.AbstractC6492s;
import u7.AbstractC8138a;
import u7.InterfaceC8139b;

/* renamed from: w7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8277f implements InterfaceC8139b {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8276e f64487a;

    public C8277f(AbstractC8276e builder) {
        AbstractC6492s.i(builder, "builder");
        this.f64487a = builder;
    }

    @Override // u7.InterfaceC8139b
    public AbstractC8138a b() {
        return this.f64487a.a();
    }
}
