package nk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Type type, Set set, Object obj, Method method, int i10, int i11, boolean z10, int i12) {
        super(type, set, obj, method, i10, i11, z10);
        this.f18348h = i12;
    }

    @Override // nk.d
    public Object b(w wVar) {
        switch (this.f18348h) {
            case 1:
                return c(wVar);
            default:
                return super.b(wVar);
        }
    }

    @Override // nk.d
    public void d(c0 c0Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f18348h) {
            case 0:
                r[] rVarArr = this.f18364f;
                Object[] objArr = new Object[rVarArr.length + 2];
                objArr[0] = c0Var;
                objArr[1] = obj;
                System.arraycopy(rVarArr, 0, objArr, 2, rVarArr.length);
                try {
                    this.f18362d.invoke(this.f18361c, objArr);
                    return;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                }
            default:
                super.d(c0Var, obj);
                return;
        }
    }
}
