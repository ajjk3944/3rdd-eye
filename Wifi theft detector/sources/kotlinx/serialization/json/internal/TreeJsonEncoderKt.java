package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.h;

/* loaded from: classes4.dex */
public abstract class TreeJsonEncoderKt {
    public static final boolean b(kotlinx.serialization.descriptors.f fVar) {
        return (fVar.getKind() instanceof kotlinx.serialization.descriptors.e) || fVar.getKind() == h.b.f22785a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlinx.serialization.json.b c(z9.a aVar, Object obj, kotlinx.serialization.e serializer) {
        kotlin.jvm.internal.p.e(aVar, "<this>");
        kotlin.jvm.internal.p.e(serializer, "serializer");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        new y(aVar, new l9.l() { // from class: kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(kotlinx.serialization.json.b it) {
                kotlin.jvm.internal.p.e(it, "it");
                ref$ObjectRef.element = it;
            }

            @Override // l9.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                a((kotlinx.serialization.json.b) obj2);
                return y8.s.f25199a;
            }
        }).e(serializer, obj);
        T t10 = ref$ObjectRef.element;
        if (t10 != 0) {
            return (kotlinx.serialization.json.b) t10;
        }
        kotlin.jvm.internal.p.t("result");
        return null;
    }
}
