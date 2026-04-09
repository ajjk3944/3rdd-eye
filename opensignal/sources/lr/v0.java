package lr;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class v0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15699d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0 f15700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(w0 w0Var, int i10) {
        super(0);
        this.f15699d = i10;
        this.f15700g = w0Var;
    }

    @Override // ar.a
    public final Object c() throws ba.l, SecurityException {
        switch (this.f15699d) {
            case 0:
                return new u0(this.f15700g);
            default:
                w0 w0Var = this.f15700g;
                Object objF = w0Var.F();
                try {
                    Object obj = j1.G;
                    Object objN = w0Var.E() ? kc.f.n(w0Var.D, w0Var.C()) : null;
                    if (objN == obj) {
                        objN = null;
                    }
                    w0Var.E();
                    AccessibleObject accessibleObject = objF != null ? (AccessibleObject) objF : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(vc.e.A(w0Var));
                    }
                    if (objF == null) {
                        return null;
                    }
                    if (objF instanceof Field) {
                        return ((Field) objF).get(objN);
                    }
                    if (!(objF instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objF + " neither field nor method");
                    }
                    int length = ((Method) objF).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objF).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objF;
                        if (objN == null) {
                            Class<?> cls = ((Method) objF).getParameterTypes()[0];
                            br.l.d(cls, "fieldOrMethod.parameterTypes[0]");
                            objN = z1.e(cls);
                        }
                        return method.invoke(null, objN);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objF;
                        Class<?> cls2 = ((Method) objF).getParameterTypes()[1];
                        br.l.d(cls2, "fieldOrMethod.parameterTypes[1]");
                        return method2.invoke(null, objN, z1.e(cls2));
                    }
                    throw new AssertionError("delegate method " + objF + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e4) {
                    throw new ba.l("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e4);
                }
        }
    }
}
