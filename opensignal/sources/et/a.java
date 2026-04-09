package et;

import br.l;
import rs.g;
import rs.o;
import tt.s;

/* loaded from: classes.dex */
public final class a extends ct.a {

    /* renamed from: m, reason: collision with root package name */
    public static final a f8347m;

    static {
        g gVar = new g();
        ms.b.a(gVar);
        o oVar = ms.b.f16988a;
        l.d(oVar, "packageFqName");
        o oVar2 = ms.b.f16990c;
        l.d(oVar2, "constructorAnnotation");
        o oVar3 = ms.b.f16989b;
        l.d(oVar3, "classAnnotation");
        o oVar4 = ms.b.f16991d;
        l.d(oVar4, "functionAnnotation");
        o oVar5 = ms.b.f16992e;
        l.d(oVar5, "propertyAnnotation");
        o oVar6 = ms.b.f16993f;
        l.d(oVar6, "propertyGetterAnnotation");
        o oVar7 = ms.b.f16994g;
        l.d(oVar7, "propertySetterAnnotation");
        o oVar8 = ms.b.f16996i;
        l.d(oVar8, "enumEntryAnnotation");
        o oVar9 = ms.b.f16995h;
        l.d(oVar9, "compileTimeValue");
        o oVar10 = ms.b.j;
        l.d(oVar10, "parameterAnnotation");
        o oVar11 = ms.b.k;
        l.d(oVar11, "typeAnnotation");
        o oVar12 = ms.b.f16997l;
        l.d(oVar12, "typeParameterAnnotation");
        f8347m = new a(gVar, oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12);
    }

    public static String a(qs.c cVar) {
        String strB;
        l.e(cVar, "fqName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(s.k0(cVar.b(), '.', '/'));
        sb2.append('/');
        if (cVar.d()) {
            strB = "default-package";
        } else {
            strB = cVar.f().b();
            l.d(strB, "fqName.shortName().asString()");
        }
        sb2.append(strB.concat(".kotlin_builtins"));
        return sb2.toString();
    }
}
