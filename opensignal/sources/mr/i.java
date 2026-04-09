package mr;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Member member, Type type, Class cls, Type[] typeArr, int i10) {
        super(member, type, cls, typeArr);
        this.f16966e = i10;
    }

    @Override // mr.g
    public final Object s(Object[] objArr) {
        switch (this.f16966e) {
            case 0:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                Constructor constructor = (Constructor) this.f16976a;
                br.a0 a0Var = new br.a0(2);
                a0Var.c(objArr);
                a0Var.a(null);
                ArrayList arrayList = a0Var.f2897a;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                br.l.e(objArr, "args");
                io.sentry.config.a.F(this, objArr);
                return ((Constructor) this.f16976a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
