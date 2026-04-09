package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.AbstractC6492s;
import pi.S;

/* loaded from: classes4.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final S f52173a;

    /* renamed from: b, reason: collision with root package name */
    private final u f52174b;

    public u(S type, u uVar) {
        AbstractC6492s.i(type, "type");
        this.f52173a = type;
        this.f52174b = uVar;
    }

    public final u a() {
        return this.f52174b;
    }

    public final S b() {
        return this.f52173a;
    }
}
