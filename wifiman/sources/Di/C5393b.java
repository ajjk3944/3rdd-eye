package di;

import Bh.G;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import pi.S;

/* renamed from: di.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5393b extends AbstractC5398g {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f46092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5393b(List value, InterfaceC6835l computeType) {
        super(value);
        AbstractC6492s.i(value, "value");
        AbstractC6492s.i(computeType, "computeType");
        this.f46092b = computeType;
    }

    @Override // di.AbstractC5398g
    public S a(G module) {
        AbstractC6492s.i(module, "module");
        S s10 = (S) this.f46092b.invoke(module);
        if (!kotlin.reflect.jvm.internal.impl.builtins.i.c0(s10) && !kotlin.reflect.jvm.internal.impl.builtins.i.q0(s10)) {
            kotlin.reflect.jvm.internal.impl.builtins.i.D0(s10);
        }
        return s10;
    }
}
