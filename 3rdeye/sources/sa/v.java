package sa;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: Retrofit.java */
/* loaded from: classes3.dex */
public final class v implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final r f46335a = r.f46281c;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f46336b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f46337c;

    public v(w wVar) {
        this.f46337c = wVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        x xVarB;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f46336b;
        }
        r rVar = this.f46335a;
        if (rVar.f46282a && method.isDefault()) {
            return rVar.b(method, obj, objArr);
        }
        w wVar = this.f46337c;
        x xVar = (x) wVar.f46338a.get(method);
        if (xVar == null) {
            synchronized (wVar.f46338a) {
                try {
                    xVarB = (x) wVar.f46338a.get(method);
                    if (xVarB == null) {
                        xVarB = x.b(wVar, method);
                        wVar.f46338a.put(method, xVarB);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            xVar = xVarB;
        }
        return xVar.a(objArr);
    }
}
