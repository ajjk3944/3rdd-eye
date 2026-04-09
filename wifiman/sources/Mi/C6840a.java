package mi;

import ki.AbstractC6472a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.text.t;

/* renamed from: mi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6840a extends AbstractC6472a {

    /* renamed from: r, reason: collision with root package name */
    public static final C6840a f54038r = new C6840a();

    /* JADX WARN: Illegal instructions before constructor call */
    private C6840a() {
        f fVarD = f.d();
        Vh.b.a(fVarD);
        AbstractC6492s.h(fVarD, "apply(...)");
        h.f packageFqName = Vh.b.f23437a;
        AbstractC6492s.h(packageFqName, "packageFqName");
        h.f constructorAnnotation = Vh.b.f23439c;
        AbstractC6492s.h(constructorAnnotation, "constructorAnnotation");
        h.f classAnnotation = Vh.b.f23438b;
        AbstractC6492s.h(classAnnotation, "classAnnotation");
        h.f functionAnnotation = Vh.b.f23440d;
        AbstractC6492s.h(functionAnnotation, "functionAnnotation");
        h.f propertyAnnotation = Vh.b.f23441e;
        AbstractC6492s.h(propertyAnnotation, "propertyAnnotation");
        h.f propertyGetterAnnotation = Vh.b.f23442f;
        AbstractC6492s.h(propertyGetterAnnotation, "propertyGetterAnnotation");
        h.f propertySetterAnnotation = Vh.b.f23443g;
        AbstractC6492s.h(propertySetterAnnotation, "propertySetterAnnotation");
        h.f enumEntryAnnotation = Vh.b.f23445i;
        AbstractC6492s.h(enumEntryAnnotation, "enumEntryAnnotation");
        h.f compileTimeValue = Vh.b.f23444h;
        AbstractC6492s.h(compileTimeValue, "compileTimeValue");
        h.f parameterAnnotation = Vh.b.f23446j;
        AbstractC6492s.h(parameterAnnotation, "parameterAnnotation");
        h.f typeAnnotation = Vh.b.f23447k;
        AbstractC6492s.h(typeAnnotation, "typeAnnotation");
        h.f typeParameterAnnotation = Vh.b.f23448l;
        AbstractC6492s.h(typeParameterAnnotation, "typeParameterAnnotation");
        super(fVarD, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, null, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, null, null, null, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    private final String s(Zh.c cVar) {
        if (cVar.d()) {
            return "default-package";
        }
        String strB = cVar.g().b();
        AbstractC6492s.h(strB, "asString(...)");
        return strB;
    }

    public final String q(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        return s(fqName) + ".kotlin_builtins";
    }

    public final String r(Zh.c fqName) {
        AbstractC6492s.i(fqName, "fqName");
        StringBuilder sb2 = new StringBuilder();
        String strB = fqName.b();
        AbstractC6492s.h(strB, "asString(...)");
        sb2.append(t.K(strB, '.', '/', false, 4, null));
        sb2.append('/');
        sb2.append(q(fqName));
        return sb2.toString();
    }
}
