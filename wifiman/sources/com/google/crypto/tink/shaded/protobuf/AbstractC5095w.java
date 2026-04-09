package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5074a;
import com.google.crypto.tink.shaded.protobuf.AbstractC5078e;
import com.google.crypto.tink.shaded.protobuf.AbstractC5097y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.snmp4j.mp.MPv3;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5095w extends AbstractC5074a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC5095w> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected i0 unknownFields = i0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$a */
    public static abstract class a extends AbstractC5074a.AbstractC1216a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5095w f38594a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC5095w f38595b;

        protected a(AbstractC5095w abstractC5095w) {
            this.f38594a = abstractC5095w;
            if (abstractC5095w.C()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f38595b = r();
        }

        private static void q(Object obj, Object obj2) {
            Y.a().d(obj).a(obj, obj2);
        }

        private AbstractC5095w r() {
            return this.f38594a.I();
        }

        public final AbstractC5095w i() {
            AbstractC5095w abstractC5095wK = k();
            if (abstractC5095wK.A()) {
                return abstractC5095wK;
            }
            throw AbstractC5074a.AbstractC1216a.f(abstractC5095wK);
        }

        public AbstractC5095w k() {
            if (!this.f38595b.C()) {
                return this.f38595b;
            }
            this.f38595b.D();
            return this.f38595b;
        }

        public a l() {
            a aVarG = o().G();
            aVarG.f38595b = k();
            return aVarG;
        }

        protected final void m() {
            if (this.f38595b.C()) {
                return;
            }
            n();
        }

        protected void n() {
            AbstractC5095w abstractC5095wR = r();
            q(abstractC5095wR, this.f38595b);
            this.f38595b = abstractC5095wR;
        }

        public AbstractC5095w o() {
            return this.f38594a;
        }

        public a p(AbstractC5095w abstractC5095w) {
            if (o().equals(abstractC5095w)) {
                return this;
            }
            m();
            q(this.f38595b, abstractC5095w);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$b */
    protected static class b extends AbstractC5075b {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5095w f38596b;

        public b(AbstractC5095w abstractC5095w) {
            this.f38596b = abstractC5095w;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$c */
    public static class c extends AbstractC5086m {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final boolean B(AbstractC5095w abstractC5095w, boolean z10) {
        byte bByteValue = ((Byte) abstractC5095w.p(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = Y.a().d(abstractC5095w).d(abstractC5095w);
        if (z10) {
            abstractC5095w.q(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC5095w : null);
        }
        return zD;
    }

    protected static AbstractC5097y.d F(AbstractC5097y.d dVar) {
        int size = dVar.size();
        return dVar.p(size == 0 ? 10 : size * 2);
    }

    protected static Object H(M m10, String str, Object[] objArr) {
        return new a0(m10, str, objArr);
    }

    protected static AbstractC5095w J(AbstractC5095w abstractC5095w, AbstractC5081h abstractC5081h, C5088o c5088o) {
        return j(M(abstractC5095w, abstractC5081h, c5088o));
    }

    protected static AbstractC5095w K(AbstractC5095w abstractC5095w, InputStream inputStream, C5088o c5088o) {
        return j(N(abstractC5095w, AbstractC5082i.f(inputStream), c5088o));
    }

    protected static AbstractC5095w L(AbstractC5095w abstractC5095w, byte[] bArr, C5088o c5088o) {
        return j(O(abstractC5095w, bArr, 0, bArr.length, c5088o));
    }

    private static AbstractC5095w M(AbstractC5095w abstractC5095w, AbstractC5081h abstractC5081h, C5088o c5088o) throws InvalidProtocolBufferException {
        AbstractC5082i abstractC5082iB0 = abstractC5081h.b0();
        AbstractC5095w abstractC5095wN = N(abstractC5095w, abstractC5082iB0, c5088o);
        try {
            abstractC5082iB0.a(0);
            return abstractC5095wN;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.p(abstractC5095wN);
        }
    }

    static AbstractC5095w N(AbstractC5095w abstractC5095w, AbstractC5082i abstractC5082i, C5088o c5088o) throws InvalidProtocolBufferException {
        AbstractC5095w abstractC5095wI = abstractC5095w.I();
        try {
            c0 c0VarD = Y.a().d(abstractC5095wI);
            c0VarD.j(abstractC5095wI, C5083j.O(abstractC5082i), c5088o);
            c0VarD.c(abstractC5095wI);
            return abstractC5095wI;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.p(abstractC5095wI);
        } catch (UninitializedMessageException e11) {
            throw e11.a().p(abstractC5095wI);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).p(abstractC5095wI);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    private static AbstractC5095w O(AbstractC5095w abstractC5095w, byte[] bArr, int i10, int i11, C5088o c5088o) throws InvalidProtocolBufferException {
        AbstractC5095w abstractC5095wI = abstractC5095w.I();
        try {
            c0 c0VarD = Y.a().d(abstractC5095wI);
            c0VarD.h(abstractC5095wI, bArr, i10, i10 + i11, new AbstractC5078e.a(c5088o));
            c0VarD.c(abstractC5095wI);
            return abstractC5095wI;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.p(abstractC5095wI);
        } catch (UninitializedMessageException e11) {
            throw e11.a().p(abstractC5095wI);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).p(abstractC5095wI);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.s().p(abstractC5095wI);
        }
    }

    protected static void P(Class cls, AbstractC5095w abstractC5095w) {
        abstractC5095w.E();
        defaultInstanceMap.put(cls, abstractC5095w);
    }

    private static AbstractC5095w j(AbstractC5095w abstractC5095w) throws InvalidProtocolBufferException {
        if (abstractC5095w == null || abstractC5095w.A()) {
            return abstractC5095w;
        }
        throw abstractC5095w.g().a().p(abstractC5095w);
    }

    private int n(c0 c0Var) {
        return c0Var == null ? Y.a().d(this).f(this) : c0Var.f(this);
    }

    protected static AbstractC5097y.d s() {
        return Z.f();
    }

    static AbstractC5095w t(Class cls) throws ClassNotFoundException {
        AbstractC5095w abstractC5095wU = defaultInstanceMap.get(cls);
        if (abstractC5095wU == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5095wU = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC5095wU == null) {
            abstractC5095wU = ((AbstractC5095w) l0.k(cls)).u();
            if (abstractC5095wU == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC5095wU);
        }
        return abstractC5095wU;
    }

    static Object z(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final boolean A() {
        return B(this, true);
    }

    boolean C() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void D() {
        Y.a().d(this).c(this);
        E();
    }

    void E() {
        this.memoizedSerializedSize &= MPv3.MAX_MESSAGE_ID;
    }

    public final a G() {
        return (a) p(d.NEW_BUILDER);
    }

    AbstractC5095w I() {
        return (AbstractC5095w) p(d.NEW_MUTABLE_INSTANCE);
    }

    void Q(int i10) {
        this.memoizedHashCode = i10;
    }

    void R(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & MPv3.MAX_MESSAGE_ID) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    public final a S() {
        return ((a) p(d.NEW_BUILDER)).p(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5074a
    int a(c0 c0Var) {
        if (!C()) {
            if (w() != Integer.MAX_VALUE) {
                return w();
            }
            int iN = n(c0Var);
            R(iN);
            return iN;
        }
        int iN2 = n(c0Var);
        if (iN2 >= 0) {
            return iN2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iN2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public void b(CodedOutputStream codedOutputStream) {
        Y.a().d(this).i(this, C5084k.P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public int d() {
        return a(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Y.a().d(this).e(this, (AbstractC5095w) obj);
        }
        return false;
    }

    public int hashCode() {
        if (C()) {
            return m();
        }
        if (x()) {
            Q(m());
        }
        return v();
    }

    Object i() {
        return p(d.BUILD_MESSAGE_INFO);
    }

    void k() {
        this.memoizedHashCode = 0;
    }

    void l() {
        R(MPv3.MAX_MESSAGE_ID);
    }

    int m() {
        return Y.a().d(this).g(this);
    }

    protected final a o() {
        return (a) p(d.NEW_BUILDER);
    }

    protected Object p(d dVar) {
        return r(dVar, null, null);
    }

    protected Object q(d dVar, Object obj) {
        return r(dVar, obj, null);
    }

    protected abstract Object r(d dVar, Object obj, Object obj2);

    public String toString() {
        return O.f(this, super.toString());
    }

    public final AbstractC5095w u() {
        return (AbstractC5095w) p(d.GET_DEFAULT_INSTANCE);
    }

    int v() {
        return this.memoizedHashCode;
    }

    int w() {
        return this.memoizedSerializedSize & MPv3.MAX_MESSAGE_ID;
    }

    boolean x() {
        return v() == 0;
    }
}
