package di;

import Bh.G;
import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* renamed from: di.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5392a extends AbstractC5398g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5392a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c value) {
        super(value);
        AbstractC6492s.i(value, "value");
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC6492s.i(module, "module");
        return ((kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) b()).getType();
    }
}
