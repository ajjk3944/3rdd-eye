package xu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25550a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25551b;

    /* renamed from: c, reason: collision with root package name */
    public String f25552c;

    public i(ArrayList arrayList) {
        this.f25550a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        br.l.e(obj, "proxy");
        br.l.e(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (br.l.a(name, "supports") && br.l.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (br.l.a(name, "unsupported") && br.l.a(Void.TYPE, returnType)) {
            this.f25551b = true;
            return null;
        }
        boolean zA = br.l.a(name, "protocols");
        ArrayList arrayList = this.f25550a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((br.l.a(name, "selectProtocol") || br.l.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list.get(i10);
                        br.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i10 == size) {
                                break;
                            }
                            i10++;
                        } else {
                            this.f25552c = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f25552c = str2;
                return str2;
            }
        }
        if ((!br.l.a(name, "protocolSelected") && !br.l.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        br.l.c(obj4, "null cannot be cast to non-null type kotlin.String");
        this.f25552c = (String) obj4;
        return null;
    }
}
