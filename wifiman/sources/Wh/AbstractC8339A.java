package wh;

import Bh.AbstractC2510u;
import Bh.InterfaceC2492b;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import ch.AbstractC4260a;
import dh.InterfaceC5380e;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.reflect.full.IllegalCallableAccessException;
import lh.AbstractC6596a;
import th.k;
import vh.AbstractC8231b;
import vh.AbstractC8232c;
import wh.a1;

/* renamed from: wh.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8339A implements th.c, X0 {

    /* renamed from: a, reason: collision with root package name */
    private final a1.a f65004a;

    /* renamed from: b, reason: collision with root package name */
    private final a1.a f65005b;

    /* renamed from: c, reason: collision with root package name */
    private final a1.a f65006c;

    /* renamed from: d, reason: collision with root package name */
    private final a1.a f65007d;

    /* renamed from: e, reason: collision with root package name */
    private final a1.a f65008e;

    /* renamed from: f, reason: collision with root package name */
    private final Yg.m f65009f;

    /* renamed from: wh.A$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((th.k) obj).getName(), ((th.k) obj2).getName());
        }
    }

    public AbstractC8339A() {
        a1.a aVarC = a1.c(new C8380q(this));
        AbstractC6492s.h(aVarC, "lazySoft(...)");
        this.f65004a = aVarC;
        a1.a aVarC2 = a1.c(new r(this));
        AbstractC6492s.h(aVarC2, "lazySoft(...)");
        this.f65005b = aVarC2;
        a1.a aVarC3 = a1.c(new C8383s(this));
        AbstractC6492s.h(aVarC3, "lazySoft(...)");
        this.f65006c = aVarC3;
        a1.a aVarC4 = a1.c(new C8385t(this));
        AbstractC6492s.h(aVarC4, "lazySoft(...)");
        this.f65007d = aVarC4;
        a1.a aVarC5 = a1.c(new C8387u(this));
        AbstractC6492s.h(aVarC5, "lazySoft(...)");
        this.f65008e = aVarC5;
        this.f65009f = Yg.n.a(Yg.q.PUBLICATION, new C8389v(this));
    }

    private final Object O(Map map) throws IllegalCallableAccessException, NegativeArraySizeException {
        Object objR;
        List<th.k> parameters = getParameters();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(parameters, 10));
        for (th.k kVar : parameters) {
            if (map.containsKey(kVar)) {
                objR = map.get(kVar);
                if (objR == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kVar + ')');
                }
            } else if (kVar.S()) {
                objR = null;
            } else {
                if (!kVar.c()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
                }
                objR = R(kVar.getType());
            }
            arrayList.add(objR);
        }
        xh.h hVarX = X();
        if (hVarX != null) {
            try {
                return hVarX.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new Y0("This callable does not support a default call: " + d0());
    }

    private final Object R(th.p pVar) throws NegativeArraySizeException {
        Class clsB = AbstractC6596a.b(AbstractC8231b.b(pVar));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            AbstractC6492s.h(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new Y0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    private final Type T() {
        Type[] lowerBounds;
        if (!isSuspend()) {
            return null;
        }
        Object objD0 = AbstractC3689v.D0(V().a());
        ParameterizedType parameterizedType = objD0 instanceof ParameterizedType ? (ParameterizedType) objD0 : null;
        if (!AbstractC6492s.d(parameterizedType != null ? parameterizedType.getRawType() : null, InterfaceC5380e.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC6492s.h(actualTypeArguments, "getActualTypeArguments(...)");
        Object objQ0 = AbstractC3682n.Q0(actualTypeArguments);
        WildcardType wildcardType = objQ0 instanceof WildcardType ? (WildcardType) objQ0 : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) AbstractC3682n.Z(lowerBounds);
    }

    private final Object[] U() {
        return (Object[]) ((Object[]) this.f65008e.invoke()).clone();
    }

    private final int Z(th.k kVar) {
        if (!((Boolean) this.f65009f.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!j1.k(kVar.getType())) {
            return 1;
        }
        th.p type = kVar.getType();
        AbstractC6492s.g(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List listN = xh.o.n(pi.F0.a(((U0) type).u()));
        AbstractC6492s.f(listN);
        return listN.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] b(AbstractC8339A abstractC8339A) {
        int iZ;
        List<th.k> parameters = abstractC8339A.getParameters();
        int size = parameters.size() + (abstractC8339A.isSuspend() ? 1 : 0);
        if (((Boolean) abstractC8339A.f65009f.getValue()).booleanValue()) {
            iZ = 0;
            for (th.k kVar : parameters) {
                iZ += kVar.h() == k.a.VALUE ? abstractC8339A.Z(kVar) : 0;
            }
        } else {
            List list = parameters;
            if ((list instanceof Collection) && list.isEmpty()) {
                iZ = 0;
            } else {
                Iterator it = list.iterator();
                iZ = 0;
                while (it.hasNext()) {
                    if (((th.k) it.next()).h() == k.a.VALUE && (iZ = iZ + 1) < 0) {
                        AbstractC3689v.u();
                    }
                }
            }
        }
        int i10 = (iZ + 31) / 32;
        Object[] objArr = new Object[size + i10 + 1];
        for (th.k kVar2 : parameters) {
            if (kVar2.S() && !j1.l(kVar2.getType())) {
                objArr[kVar2.getIndex()] = j1.g(AbstractC8232c.f(kVar2.getType()));
            } else if (kVar2.c()) {
                objArr[kVar2.getIndex()] = abstractC8339A.R(kVar2.getType());
            }
        }
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[size + i11] = 0;
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c0(AbstractC8339A abstractC8339A) {
        List parameters = abstractC8339A.getParameters();
        if ((parameters instanceof Collection) && parameters.isEmpty()) {
            return false;
        }
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            if (j1.k(((th.k) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(AbstractC8339A abstractC8339A) {
        return j1.e(abstractC8339A.d0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList f(AbstractC8339A abstractC8339A) {
        int i10;
        InterfaceC2492b interfaceC2492bY = abstractC8339A.d0();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        if (abstractC8339A.b0()) {
            i10 = 0;
        } else {
            Bh.b0 b0VarI = j1.i(interfaceC2492bY);
            if (b0VarI != null) {
                arrayList.add(new C8396y0(abstractC8339A, 0, k.a.INSTANCE, new C8391w(b0VarI)));
                i10 = 1;
            } else {
                i10 = 0;
            }
            Bh.b0 b0VarK0 = interfaceC2492bY.k0();
            if (b0VarK0 != null) {
                arrayList.add(new C8396y0(abstractC8339A, i10, k.a.EXTENSION_RECEIVER, new C8393x(b0VarK0)));
                i10++;
            }
        }
        int size = interfaceC2492bY.i().size();
        while (i11 < size) {
            arrayList.add(new C8396y0(abstractC8339A, i10, k.a.VALUE, new C8395y(interfaceC2492bY, i11)));
            i11++;
            i10++;
        }
        if (abstractC8339A.a0() && (interfaceC2492bY instanceof Lh.a) && arrayList.size() > 1) {
            AbstractC3689v.B(arrayList, new a());
        }
        arrayList.trimToSize();
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.V i(Bh.b0 b0Var) {
        return b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.V k(Bh.b0 b0Var) {
        return b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bh.V p(InterfaceC2492b interfaceC2492b, int i10) {
        Object obj = interfaceC2492b.i().get(i10);
        AbstractC6492s.h(obj, "get(...)");
        return (Bh.V) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 q(AbstractC8339A abstractC8339A) {
        pi.S returnType = abstractC8339A.d0().getReturnType();
        AbstractC6492s.f(returnType);
        return new U0(returnType, new C8397z(abstractC8339A));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type u(AbstractC8339A abstractC8339A) {
        Type typeT = abstractC8339A.T();
        return typeT == null ? abstractC8339A.V().getReturnType() : typeT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List w(AbstractC8339A abstractC8339A) {
        List typeParameters = abstractC8339A.d0().getTypeParameters();
        AbstractC6492s.h(typeParameters, "getTypeParameters(...)");
        List<Bh.l0> list = typeParameters;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        for (Bh.l0 l0Var : list) {
            AbstractC6492s.f(l0Var);
            arrayList.add(new W0(abstractC8339A, l0Var));
        }
        return arrayList;
    }

    public final Object Q(Map args, InterfaceC5380e interfaceC5380e) throws IllegalCallableAccessException {
        AbstractC6492s.i(args, "args");
        List<th.k> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return V().call(isSuspend() ? new InterfaceC5380e[]{interfaceC5380e} : new InterfaceC5380e[0]);
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrU = U();
        if (isSuspend()) {
            objArrU[parameters.size()] = interfaceC5380e;
        }
        boolean zBooleanValue = ((Boolean) this.f65009f.getValue()).booleanValue();
        int i10 = 0;
        for (th.k kVar : parameters) {
            int iZ = zBooleanValue ? Z(kVar) : 1;
            if (args.containsKey(kVar)) {
                objArrU[kVar.getIndex()] = args.get(kVar);
            } else if (kVar.S()) {
                if (zBooleanValue) {
                    int i11 = i10 + iZ;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArrU[i13];
                        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrU[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArrU[i14];
                    AbstractC6492s.g(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrU[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!kVar.c()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kVar);
            }
            if (kVar.h() == k.a.VALUE) {
                i10 += iZ;
            }
        }
        if (!z10) {
            try {
                xh.h hVarV = V();
                Object[] objArrCopyOf = Arrays.copyOf(objArrU, size);
                AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
                return hVarV.call(objArrCopyOf);
            } catch (IllegalAccessException e11) {
                throw new IllegalCallableAccessException(e11);
            }
        }
        xh.h hVarX = X();
        if (hVarX != null) {
            try {
                return hVarX.call(objArrU);
            } catch (IllegalAccessException e12) {
                throw new IllegalCallableAccessException(e12);
            }
        }
        throw new Y0("This callable does not support a default call: " + d0());
    }

    public abstract xh.h V();

    public abstract AbstractC8355d0 W();

    public abstract xh.h X();

    /* renamed from: Y */
    public abstract InterfaceC2492b d0();

    protected final boolean a0() {
        return AbstractC6492s.d(getName(), "<init>") && W().b().isAnnotation();
    }

    public abstract boolean b0();

    @Override // th.c
    public Object call(Object... args) throws IllegalCallableAccessException {
        AbstractC6492s.i(args, "args");
        try {
            return V().call(args);
        } catch (IllegalAccessException e10) {
            throw new IllegalCallableAccessException(e10);
        }
    }

    @Override // th.c
    public Object callBy(Map args) {
        AbstractC6492s.i(args, "args");
        return a0() ? O(args) : Q(args, null);
    }

    @Override // th.InterfaceC8116b
    public List getAnnotations() {
        Object objInvoke = this.f65004a.invoke();
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // th.c
    public List getParameters() {
        Object objInvoke = this.f65005b.invoke();
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // th.c
    public th.p getReturnType() {
        Object objInvoke = this.f65006c.invoke();
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (th.p) objInvoke;
    }

    @Override // th.c
    public List getTypeParameters() {
        Object objInvoke = this.f65007d.invoke();
        AbstractC6492s.h(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // th.c
    public th.t getVisibility() {
        AbstractC2510u visibility = d0().getVisibility();
        AbstractC6492s.h(visibility, "getVisibility(...)");
        return j1.r(visibility);
    }

    @Override // th.c
    public boolean isAbstract() {
        return d0().l() == Bh.D.ABSTRACT;
    }

    @Override // th.c
    public boolean isFinal() {
        return d0().l() == Bh.D.FINAL;
    }

    @Override // th.c
    public boolean isOpen() {
        return d0().l() == Bh.D.OPEN;
    }
}
