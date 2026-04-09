package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class w extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected e1 unknownFields;

    public w() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = e1.f963f;
    }

    public static w d(Class cls) throws ClassNotFoundException {
        w wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = (w) ((w) k1.d(cls)).c(6);
        if (wVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, wVar2);
        return wVar2;
    }

    public static Object e(Method method, w wVar, Object... objArr) {
        try {
            return method.invoke(wVar, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(w wVar, boolean z3) {
        byte bByteValue = ((Byte) wVar.c(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        u0 u0Var = u0.f1071c;
        u0Var.getClass();
        boolean zD = u0Var.a(wVar.getClass()).d(wVar);
        if (z3) {
            wVar.c(2);
        }
        return zD;
    }

    public static void j(Class cls, w wVar) {
        wVar.h();
        defaultInstanceMap.put(cls, wVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(x0 x0Var) {
        int iE;
        int iE2;
        if (g()) {
            if (x0Var == null) {
                u0 u0Var = u0.f1071c;
                u0Var.getClass();
                iE2 = u0Var.a(getClass()).e(this);
            } else {
                iE2 = x0Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(je.u.r(iE2, "serialized size must be non-negative, was "));
        }
        int i4 = this.memoizedSerializedSize;
        if ((i4 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i4 & Integer.MAX_VALUE;
        }
        if (x0Var == null) {
            u0 u0Var2 = u0.f1071c;
            u0Var2.getClass();
            iE = u0Var2.a(getClass()).e(this);
        } else {
            iE = x0Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(m mVar) {
        u0 u0Var = u0.f1071c;
        u0Var.getClass();
        x0 x0VarA = u0Var.a(getClass());
        g0 g0Var = mVar.j;
        if (g0Var == null) {
            g0Var = new g0(mVar);
        }
        x0VarA.b(this, g0Var);
    }

    public abstract Object c(int i4);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u0 u0Var = u0.f1071c;
        u0Var.getClass();
        return u0Var.a(getClass()).g(this, (w) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            u0 u0Var = u0.f1071c;
            u0Var.getClass();
            return u0Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            u0 u0Var2 = u0.f1071c;
            u0Var2.getClass();
            this.memoizedHashCode = u0Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final w i() {
        return (w) c(4);
    }

    public final void k(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException(je.u.r(i4, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i4 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = n0.f1020a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        n0.c(this, sb2, 0);
        return sb2.toString();
    }
}
