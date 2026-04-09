package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class a0 extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, a0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected k1 unknownFields;

    public a0() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = k1.f1305f;
    }

    public static a0 d(Class cls) throws ClassNotFoundException {
        a0 a0Var = defaultInstanceMap.get(cls);
        if (a0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = (a0) q1.d(cls);
        a0Var2.getClass();
        a0 a0Var3 = (a0) a0Var2.c(z.GET_DEFAULT_INSTANCE);
        if (a0Var3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, a0Var3);
        return a0Var3;
    }

    public static Object e(Method method, a0 a0Var, Object... objArr) {
        try {
            return method.invoke(a0Var, objArr);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e4);
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

    public static final boolean f(a0 a0Var, boolean z10) {
        byte bByteValue = ((Byte) a0Var.c(z.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        a1 a1Var = a1.f1244c;
        a1Var.getClass();
        boolean zD = a1Var.a(a0Var.getClass()).d(a0Var);
        if (z10) {
            a0Var.c(z.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zD;
    }

    public static void j(Class cls, a0 a0Var) {
        a0Var.h();
        defaultInstanceMap.put(cls, a0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(d1 d1Var) {
        int iE;
        int iE2;
        if (g()) {
            if (d1Var == null) {
                a1 a1Var = a1.f1244c;
                a1Var.getClass();
                iE2 = a1Var.a(getClass()).e(this);
            } else {
                iE2 = d1Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            throw new IllegalStateException(h0.b.h(iE2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (d1Var == null) {
            a1 a1Var2 = a1.f1244c;
            a1Var2.getClass();
            iE = a1Var2.a(getClass()).e(this);
        } else {
            iE = d1Var.e(this);
        }
        k(iE);
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(n nVar) {
        a1 a1Var = a1.f1244c;
        a1Var.getClass();
        d1 d1VarA = a1Var.a(getClass());
        l0 l0Var = nVar.f1322a;
        if (l0Var == null) {
            l0Var = new l0(nVar);
        }
        d1VarA.b(this, l0Var);
    }

    public abstract Object c(z zVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = a1.f1244c;
        a1Var.getClass();
        return a1Var.a(getClass()).g(this, (a0) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            a1 a1Var = a1.f1244c;
            a1Var.getClass();
            return a1Var.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            a1 a1Var2 = a1.f1244c;
            a1Var2.getClass();
            this.memoizedHashCode = a1Var2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public final a0 i() {
        return (a0) c(z.NEW_MUTABLE_INSTANCE);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(h0.b.h(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = s0.f1349a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        s0.c(this, sb2, 0);
        return sb2.toString();
    }
}
