package a7;

import a7.g;

/* compiled from: Function.kt */
/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements p9.p<EnumC1667d, EnumC1667d, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f14226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar) {
        super(2);
        this.f14226g = gVar;
    }

    @Override // p9.p
    public final Boolean invoke(EnumC1667d enumC1667d, EnumC1667d enumC1667d2) {
        EnumC1667d type = enumC1667d;
        EnumC1667d declaredType = enumC1667d2;
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(declaredType, "declaredType");
        boolean z10 = true;
        if (type != declaredType) {
            this.f14226g.getClass();
            if (type != EnumC1667d.INTEGER || g.c.f14223a[declaredType.ordinal()] != 1) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
