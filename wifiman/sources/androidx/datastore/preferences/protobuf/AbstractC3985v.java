package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC3965a;
import androidx.datastore.preferences.protobuf.AbstractC3987x;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3985v extends AbstractC3965a {
    private static Map<Object, AbstractC3985v> defaultInstanceMap = new ConcurrentHashMap();
    protected j0 unknownFields = j0.e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static abstract class a extends AbstractC3965a.AbstractC1095a {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC3985v f30960a;

        /* renamed from: b, reason: collision with root package name */
        protected AbstractC3985v f30961b;

        /* renamed from: c, reason: collision with root package name */
        protected boolean f30962c = false;

        protected a(AbstractC3985v abstractC3985v) {
            this.f30960a = abstractC3985v;
            this.f30961b = (AbstractC3985v) abstractC3985v.o(d.NEW_MUTABLE_INSTANCE);
        }

        private void w(AbstractC3985v abstractC3985v, AbstractC3985v abstractC3985v2) {
            Y.a().d(abstractC3985v).a(abstractC3985v, abstractC3985v2);
        }

        public final AbstractC3985v n() {
            AbstractC3985v abstractC3985vY = y();
            if (abstractC3985vY.v()) {
                return abstractC3985vY;
            }
            throw AbstractC3965a.AbstractC1095a.k(abstractC3985vY);
        }

        @Override // androidx.datastore.preferences.protobuf.M.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractC3985v y() {
            if (this.f30962c) {
                return this.f30961b;
            }
            this.f30961b.x();
            this.f30962c = true;
            return this.f30961b;
        }

        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarH = c().h();
            aVarH.u(y());
            return aVarH;
        }

        protected void q() {
            if (this.f30962c) {
                AbstractC3985v abstractC3985v = (AbstractC3985v) this.f30961b.o(d.NEW_MUTABLE_INSTANCE);
                w(abstractC3985v, this.f30961b);
                this.f30961b = abstractC3985v;
                this.f30962c = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.N
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractC3985v c() {
            return this.f30960a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC3965a.AbstractC1095a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a f(AbstractC3985v abstractC3985v) {
            return u(abstractC3985v);
        }

        public a u(AbstractC3985v abstractC3985v) {
            q();
            w(this.f30961b, abstractC3985v);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$b */
    protected static class b extends AbstractC3966b {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC3985v f30963b;

        public b(AbstractC3985v abstractC3985v) {
            this.f30963b = abstractC3985v;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$c */
    public static class c extends AbstractC3976l {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.v$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static Object B(M m10, String str, Object[] objArr) {
        return new a0(m10, str, objArr);
    }

    protected static AbstractC3985v C(AbstractC3985v abstractC3985v, InputStream inputStream) {
        return k(D(abstractC3985v, AbstractC3972h.f(inputStream), C3978n.b()));
    }

    static AbstractC3985v D(AbstractC3985v abstractC3985v, AbstractC3972h abstractC3972h, C3978n c3978n) throws InvalidProtocolBufferException {
        AbstractC3985v abstractC3985v2 = (AbstractC3985v) abstractC3985v.o(d.NEW_MUTABLE_INSTANCE);
        try {
            c0 c0VarD = Y.a().d(abstractC3985v2);
            c0VarD.h(abstractC3985v2, C3973i.O(abstractC3972h), c3978n);
            c0VarD.c(abstractC3985v2);
            return abstractC3985v2;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage()).n(abstractC3985v2);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    protected static void E(Class cls, AbstractC3985v abstractC3985v) {
        defaultInstanceMap.put(cls, abstractC3985v);
    }

    private static AbstractC3985v k(AbstractC3985v abstractC3985v) throws InvalidProtocolBufferException {
        if (abstractC3985v == null || abstractC3985v.v()) {
            return abstractC3985v;
        }
        throw abstractC3985v.f().a().n(abstractC3985v);
    }

    protected static AbstractC3987x.b r() {
        return Z.f();
    }

    static AbstractC3985v s(Class cls) throws ClassNotFoundException {
        AbstractC3985v abstractC3985vC = defaultInstanceMap.get(cls);
        if (abstractC3985vC == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3985vC = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC3985vC == null) {
            abstractC3985vC = ((AbstractC3985v) m0.i(cls)).c();
            if (abstractC3985vC == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC3985vC);
        }
        return abstractC3985vC;
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static final boolean w(AbstractC3985v abstractC3985v, boolean z10) {
        byte bByteValue = ((Byte) abstractC3985v.o(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = Y.a().d(abstractC3985v).d(abstractC3985v);
        if (z10) {
            abstractC3985v.p(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC3985v : null);
        }
        return zD;
    }

    protected static AbstractC3987x.b z(AbstractC3987x.b bVar) {
        int size = bVar.size();
        return bVar.p(size == 0 ? 10 : size * 2);
    }

    @Override // androidx.datastore.preferences.protobuf.M
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final a h() {
        return (a) o(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.M
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final a l() {
        a aVar = (a) o(d.NEW_BUILDER);
        aVar.u(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3965a
    int b() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public int d() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = Y.a().d(this).f(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().getClass().isInstance(obj)) {
            return Y.a().d(this).e(this, (AbstractC3985v) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC3965a
    void g(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iG = Y.a().d(this).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    Object j() {
        return o(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public void m(CodedOutputStream codedOutputStream) {
        Y.a().d(this).i(this, C3974j.P(codedOutputStream));
    }

    protected final a n() {
        return (a) o(d.NEW_BUILDER);
    }

    protected Object o(d dVar) {
        return q(dVar, null, null);
    }

    protected Object p(d dVar, Object obj) {
        return q(dVar, obj, null);
    }

    protected abstract Object q(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.N
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final AbstractC3985v c() {
        return (AbstractC3985v) o(d.GET_DEFAULT_INSTANCE);
    }

    public String toString() {
        return O.e(this, super.toString());
    }

    public final boolean v() {
        return w(this, true);
    }

    protected void x() {
        Y.a().d(this).c(this);
    }
}
