package mr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import lr.z1;

/* loaded from: classes.dex */
public final class w implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f16980a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16981b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.k f16982c;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w(mr.g r9, rr.d r10, boolean r11) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mr.w.<init>(mr.g, rr.d, boolean):void");
    }

    @Override // mr.g
    public final List a() {
        return this.f16980a.a();
    }

    @Override // mr.g
    public final Member b() {
        return this.f16980a.b();
    }

    @Override // mr.g
    public final Type i() {
        return this.f16980a.i();
    }

    @Override // mr.g
    public final Object s(Object[] objArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        br.l.e(objArr, "args");
        io.sentry.k kVar = this.f16982c;
        hr.d dVar = (hr.d) kVar.f12397d;
        Method[] methodArr = (Method[]) kVar.f12398g;
        Method method = (Method) kVar.f12399r;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        br.l.d(objArrCopyOf, "copyOf(this, size)");
        int i10 = dVar.f10863a;
        int i11 = dVar.f10864d;
        if (i10 <= i11) {
            while (true) {
                Method method2 = methodArr[i10];
                Object objE = objArr[i10];
                if (method2 != null) {
                    if (objE != null) {
                        objE = method2.invoke(objE, null);
                    } else {
                        Class<?> returnType = method2.getReturnType();
                        br.l.d(returnType, "method.returnType");
                        objE = z1.e(returnType);
                    }
                }
                objArrCopyOf[i10] = objE;
                if (i10 == i11) {
                    break;
                }
                i10++;
            }
        }
        Object objS = this.f16980a.s(objArrCopyOf);
        return (method == null || (objInvoke = method.invoke(null, objS)) == null) ? objS : objInvoke;
    }
}
