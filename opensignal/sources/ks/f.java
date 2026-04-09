package ks;

import i.g0;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14498d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f14499g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g0 g0Var, int i10) {
        super(0);
        this.f14498d = i10;
        this.f14499g = g0Var;
    }

    @Override // ks.d
    public final void g(String[] strArr) {
        switch (this.f14498d) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((g) this.f14499g.f11051a).f14503r = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((g) this.f14499g.f11051a).f14504x = strArr;
                return;
        }
    }
}
