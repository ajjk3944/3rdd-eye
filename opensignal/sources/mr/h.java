package mr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends v implements f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16964e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f16965f;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Constructor constructor, Object obj, int i10) {
        this.f16964e = i10;
        switch (i10) {
            case 1:
                Class declaringClass = constructor.getDeclaringClass();
                br.l.d(declaringClass, "constructor.declaringClass");
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                br.l.d(genericParameterTypes, "constructor.genericParameterTypes");
                super(constructor, declaringClass, null, genericParameterTypes);
                this.f16965f = obj;
                break;
            default:
                Class declaringClass2 = constructor.getDeclaringClass();
                br.l.d(declaringClass2, "constructor.declaringClass");
                Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
                br.l.d(genericParameterTypes2, "constructor.genericParameterTypes");
                super(constructor, declaringClass2, null, (Type[]) (genericParameterTypes2.length <= 2 ? new Type[0] : mq.l.h0(genericParameterTypes2, 1, genericParameterTypes2.length - 1)));
                this.f16965f = obj;
                break;
        }
    }

    @Override // mr.g
    public final Object s(Object[] objArr) {
        switch (this.f16964e) {
            case 0:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                Constructor constructor = (Constructor) this.f16976a;
                br.a0 a0Var = new br.a0(3);
                a0Var.a(this.f16965f);
                a0Var.c(objArr);
                a0Var.a(null);
                ArrayList arrayList = a0Var.f2897a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                Constructor constructor2 = (Constructor) this.f16976a;
                br.a0 a0Var2 = new br.a0(2);
                a0Var2.a(this.f16965f);
                a0Var2.c(objArr);
                ArrayList arrayList2 = a0Var2.f2897a;
                return constructor2.newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
        }
    }
}
