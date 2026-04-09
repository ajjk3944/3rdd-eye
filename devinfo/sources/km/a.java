package km;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class a implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28382b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f28383c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f28384d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f28385e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f28386f = new a(4);
    public static final a g = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28387a;

    public /* synthetic */ a(int i4) {
        this.f28387a = i4;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new q(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(int i4, Method method) {
        return "parameter #" + (i4 + 1);
    }

    public Object d(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    @Override // km.m
    public Object l(Object obj) {
        switch (this.f28387a) {
            case 0:
                return obj.toString();
            case 1:
                rl.c0 c0Var = (rl.c0) obj;
                try {
                    hm.e eVar = new hm.e();
                    c0Var.m().i(eVar);
                    rl.p pVarG = c0Var.g();
                    long jE = c0Var.e();
                    rl.b0 b0Var = rl.c0.f33050b;
                    rl.b0 b0Var2 = new rl.b0(pVarG, jE, eVar);
                    c0Var.close();
                    return b0Var2;
                } catch (Throwable th2) {
                    c0Var.close();
                    throw th2;
                }
            case 2:
                return (rl.x) obj;
            case 3:
                return (rl.c0) obj;
            case 4:
                ((rl.c0) obj).close();
                return yj.u.f37649a;
            default:
                ((rl.c0) obj).close();
                return null;
        }
    }
}
