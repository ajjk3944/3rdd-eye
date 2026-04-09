package xh;

import Bh.InterfaceC2495e;
import Bh.InterfaceC2498h;
import Bh.InterfaceC2515z;
import Bh.V;
import Gh.AbstractC2914f;
import Yg.s;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import eh.AbstractC5467b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import pi.F0;
import pi.S;
import sh.C7974i;
import wh.AbstractC8355d0;
import wh.j1;

/* loaded from: classes4.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f66135a;

    /* renamed from: b, reason: collision with root package name */
    private final h f66136b;

    /* renamed from: c, reason: collision with root package name */
    private final Member f66137c;

    /* renamed from: d, reason: collision with root package name */
    private final a f66138d;

    /* renamed from: e, reason: collision with root package name */
    private final C7974i[] f66139e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f66140f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C7974i f66141a;

        /* renamed from: b, reason: collision with root package name */
        private final List[] f66142b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f66143c;

        public a(C7974i argumentRange, List[] unboxParameters, Method method) {
            AbstractC6492s.i(argumentRange, "argumentRange");
            AbstractC6492s.i(unboxParameters, "unboxParameters");
            this.f66141a = argumentRange;
            this.f66142b = unboxParameters;
            this.f66143c = method;
        }

        public final C7974i a() {
            return this.f66141a;
        }

        public final Method b() {
            return this.f66143c;
        }

        public final List[] c() {
            return this.f66142b;
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        private final Method f66144a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f66145b;

        /* renamed from: c, reason: collision with root package name */
        private final List f66146c;

        /* renamed from: d, reason: collision with root package name */
        private final List f66147d;

        /* renamed from: e, reason: collision with root package name */
        private final List f66148e;

        public b(InterfaceC2515z descriptor, AbstractC8355d0 container, String constructorDesc, List originalParameters) {
            Collection collectionE;
            AbstractC6492s.i(descriptor, "descriptor");
            AbstractC6492s.i(container, "container");
            AbstractC6492s.i(constructorDesc, "constructorDesc");
            AbstractC6492s.i(originalParameters, "originalParameters");
            Method methodZ = container.z("constructor-impl", constructorDesc);
            AbstractC6492s.f(methodZ);
            this.f66144a = methodZ;
            Method methodZ2 = container.z("box-impl", t.H0(constructorDesc, "V") + AbstractC2914f.f(container.b()));
            AbstractC6492s.f(methodZ2);
            this.f66145b = methodZ2;
            List list = originalParameters;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                S type = ((V) it.next()).getType();
                AbstractC6492s.h(type, "getType(...)");
                arrayList.add(o.p(F0.a(type), descriptor));
            }
            this.f66146c = arrayList;
            ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC3689v.v();
                }
                InterfaceC2498h interfaceC2498hC = ((V) obj).getType().N0().c();
                AbstractC6492s.g(interfaceC2498hC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC2495e interfaceC2495e = (InterfaceC2495e) interfaceC2498hC;
                List list2 = (List) this.f66146c.get(i10);
                if (list2 != null) {
                    List list3 = list2;
                    collectionE = new ArrayList(AbstractC3689v.w(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        collectionE.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class clsQ = j1.q(interfaceC2495e);
                    AbstractC6492s.f(clsQ);
                    collectionE = AbstractC3689v.e(clsQ);
                }
                arrayList2.add(collectionE);
                i10 = i11;
            }
            this.f66147d = arrayList2;
            this.f66148e = AbstractC3689v.y(arrayList2);
        }

        @Override // xh.h
        public List a() {
            return this.f66148e;
        }

        @Override // xh.h
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        public Void c() {
            return null;
        }

        @Override // xh.h
        public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Collection collectionE;
            AbstractC6492s.i(args, "args");
            List<s> listS1 = AbstractC3682n.s1(args, this.f66146c);
            ArrayList arrayList = new ArrayList();
            for (s sVar : listS1) {
                Object objA = sVar.a();
                List list = (List) sVar.c();
                if (list != null) {
                    List list2 = list;
                    collectionE = new ArrayList(AbstractC3689v.w(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        collectionE.add(((Method) it.next()).invoke(objA, null));
                    }
                } else {
                    collectionE = AbstractC3689v.e(objA);
                }
                AbstractC3689v.C(arrayList, collectionE);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f66144a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f66145b.invoke(null, Arrays.copyOf(array, array.length));
        }

        public final List d() {
            return this.f66147d;
        }

        @Override // xh.h
        public Type getReturnType() {
            Class<?> returnType = this.f66145b.getReturnType();
            AbstractC6492s.h(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[LOOP:1: B:25:0x007c->B:27:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(Bh.InterfaceC2492b r11, xh.h r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.n.<init>(Bh.b, xh.h, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(InterfaceC2495e makeKotlinParameterTypes) {
        AbstractC6492s.i(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return bi.k.g(makeKotlinParameterTypes);
    }

    private static final int e(S s10) {
        List listN = o.n(F0.a(s10));
        if (listN != null) {
            return listN.size();
        }
        return 1;
    }

    @Override // xh.h
    public List a() {
        return this.f66136b.a();
    }

    @Override // xh.h
    public Member b() {
        return this.f66137c;
    }

    @Override // xh.h
    public Object call(Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        Object objG;
        Object objG2;
        AbstractC6492s.i(args, "args");
        C7974i c7974iA = this.f66138d.a();
        List[] listArrC = this.f66138d.c();
        Method methodB = this.f66138d.b();
        if (!c7974iA.isEmpty()) {
            if (this.f66140f) {
                List listD = AbstractC3689v.d(args.length);
                int i10 = c7974iA.i();
                for (int i11 = 0; i11 < i10; i11++) {
                    listD.add(args[i11]);
                }
                int i12 = c7974iA.i();
                int iJ = c7974iA.j();
                if (i12 <= iJ) {
                    while (true) {
                        List<Method> list = listArrC[i12];
                        Object obj = args[i12];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listD;
                                if (obj != null) {
                                    objG2 = method.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    AbstractC6492s.h(returnType, "getReturnType(...)");
                                    objG2 = j1.g(returnType);
                                }
                                list2.add(objG2);
                            }
                        } else {
                            listD.add(obj);
                        }
                        if (i12 == iJ) {
                            break;
                        }
                        i12++;
                    }
                }
                int iJ2 = c7974iA.j() + 1;
                int iG0 = AbstractC3682n.g0(args);
                if (iJ2 <= iG0) {
                    while (true) {
                        listD.add(args[iJ2]);
                        if (iJ2 == iG0) {
                            break;
                        }
                        iJ2++;
                    }
                }
                args = AbstractC3689v.a(listD).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = c7974iA.i();
                    if (i13 > c7974iA.j() || i14 > i13) {
                        objG = args[i13];
                    } else {
                        List list3 = listArrC[i13];
                        Method method2 = list3 != null ? (Method) AbstractC3689v.R0(list3) : null;
                        objG = args[i13];
                        if (method2 != null) {
                            if (objG != null) {
                                objG = method2.invoke(objG, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                AbstractC6492s.h(returnType2, "getReturnType(...)");
                                objG = j1.g(returnType2);
                            }
                        }
                    }
                    objArr[i13] = objG;
                }
                args = objArr;
            }
        }
        Object objCall = this.f66136b.call(args);
        return (objCall == AbstractC5467b.g() || methodB == null || (objInvoke = methodB.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final C7974i f(int i10) {
        C7974i c7974i;
        if (i10 >= 0) {
            C7974i[] c7974iArr = this.f66139e;
            if (i10 < c7974iArr.length) {
                return c7974iArr[i10];
            }
        }
        C7974i[] c7974iArr2 = this.f66139e;
        if (c7974iArr2.length == 0) {
            c7974i = new C7974i(i10, i10);
        } else {
            int length = (i10 - c7974iArr2.length) + ((C7974i) AbstractC3682n.K0(c7974iArr2)).j() + 1;
            c7974i = new C7974i(length, length);
        }
        return c7974i;
    }

    @Override // xh.h
    public Type getReturnType() {
        return this.f66136b.getReturnType();
    }
}
