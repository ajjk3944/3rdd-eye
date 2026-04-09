package bj;

import Xi.m;
import Zi.X;
import aj.AbstractC3868b;
import aj.EnumC3867a;
import aj.InterfaceC3872f;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class D {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33406a;

        static {
            int[] iArr = new int[EnumC3867a.values().length];
            try {
                iArr[EnumC3867a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3867a.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3867a.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33406a = iArr;
        }
    }

    public static final void b(Xi.m kind) {
        AbstractC6492s.i(kind, "kind");
        if (kind instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Xi.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Xi.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(Xi.f fVar, AbstractC3868b json) {
        AbstractC6492s.i(fVar, "<this>");
        AbstractC6492s.i(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC3872f) {
                return ((InterfaceC3872f) annotation).discriminator();
            }
        }
        return json.e().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Vi.o oVar, Vi.o oVar2, String str) {
        if ((oVar instanceof Vi.k) && X.a(oVar2.a()).contains(str)) {
            String strA = ((Vi.k) oVar).a().a();
            throw new IllegalStateException(("Sealed class '" + oVar2.a().a() + "' cannot be serialized as base class '" + strA + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
