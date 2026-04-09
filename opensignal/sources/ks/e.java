package ks;

import h7.h0;
import h7.r1;
import js.o;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14496d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f14497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i10) {
        super(0);
        this.f14496d = i10;
        this.f14497g = oVar;
    }

    @Override // ks.d
    public final void g(String[] strArr) {
        switch (this.f14496d) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((g) ((r1) this.f14497g).f10199d).f14503r = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((g) ((r1) this.f14497g).f10199d).f14504x = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((g) ((h0) this.f14497g).f10078a).D = strArr;
                return;
        }
    }
}
