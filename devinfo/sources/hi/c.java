package hi;

import com.google.gson.j;
import ed.a0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import km.o0;
import km.w0;
import rl.n;
import rl.t;
import va.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final o f25153a;

    static {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0 a0Var = new a0(1);
        a0Var.e(null, "https://liuzhosoft.com/server/devinfo/");
        n nVarB = a0Var.b();
        if (!"".equals(nVarB.f33118f.get(r2.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + nVarB);
        }
        arrayList.add(new lm.a(new j()));
        t tVar = b.f25152a;
        Objects.requireNonNull(tVar, "client == null");
        b4.n nVar = o0.f28447a;
        km.a aVar = o0.f28449c;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List listA = aVar.a(nVar);
        arrayList3.addAll(listA);
        List listB = aVar.b();
        ArrayList arrayList4 = new ArrayList(arrayList.size() + 1 + listB.size());
        arrayList4.add(new km.b(0));
        arrayList4.addAll(arrayList);
        arrayList4.addAll(listB);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList4);
        List listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList3);
        listA.size();
        f25153a = new o(tVar, nVarB, listUnmodifiableList, listUnmodifiableList2, nVar);
    }

    public static Object a(Class cls) {
        o oVar = f25153a;
        oVar.getClass();
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new w0(oVar, cls));
    }
}
