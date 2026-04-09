package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes4.dex */
public class u {
    public r9.c b(Class cls) {
        return new g(cls);
    }

    public r9.f c(Class cls, String str) {
        return new s(cls, str);
    }

    public r9.p d(r9.p pVar) {
        z zVar = (z) pVar;
        return new z(pVar.g(), pVar.j(), zVar.n(), zVar.l() | 2);
    }

    public String k(m mVar) {
        String string = mVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String l(Lambda lambda) {
        return k(lambda);
    }

    public r9.p m(r9.e eVar, List list, boolean z10) {
        return new z(eVar, list, z10);
    }

    public r9.g a(FunctionReference functionReference) {
        return functionReference;
    }

    public r9.i e(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public r9.j f(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public r9.k g(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public r9.m h(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public r9.n i(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public r9.o j(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
