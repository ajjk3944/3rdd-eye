package mr;

import com.google.android.gms.internal.measurement.e5;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Member f16976a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f16977b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f16978c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16979d;

    public v(Member member, Type type, Class cls, Type[] typeArr) {
        List listA0;
        this.f16976a = member;
        this.f16977b = type;
        this.f16978c = cls;
        if (cls != null) {
            br.a0 a0Var = new br.a0(2);
            a0Var.a(cls);
            a0Var.c(typeArr);
            ArrayList arrayList = a0Var.f2897a;
            listA0 = e5.I(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listA0 = mq.l.A0(typeArr);
        }
        this.f16979d = listA0;
    }

    @Override // mr.g
    public final List a() {
        return this.f16979d;
    }

    @Override // mr.g
    public final Member b() {
        return this.f16976a;
    }

    public void c(Object[] objArr) {
        io.sentry.config.a.F(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.f16976a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // mr.g
    public final Type i() {
        return this.f16977b;
    }
}
