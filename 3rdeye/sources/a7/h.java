package a7;

/* compiled from: Function.kt */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements p9.p<EnumC1667d, EnumC1667d, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public static final h f14225g = new h(2);

    @Override // p9.p
    public final Boolean invoke(EnumC1667d enumC1667d, EnumC1667d enumC1667d2) {
        EnumC1667d type = enumC1667d;
        EnumC1667d declaredType = enumC1667d2;
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(declaredType, "declaredType");
        return Boolean.valueOf(type == declaredType);
    }
}
