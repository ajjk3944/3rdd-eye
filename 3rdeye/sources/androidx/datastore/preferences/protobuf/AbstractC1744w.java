package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1723a;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import androidx.datastore.preferences.protobuf.AbstractC1744w.a;
import androidx.datastore.preferences.protobuf.C1740s;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1744w<MessageType extends AbstractC1744w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1723a<MessageType, BuilderType> {
    private static Map<Object, AbstractC1744w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected l0 unknownFields = l0.f15661f;
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC1744w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC1723a.AbstractC0235a<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        public final MessageType f15702b;

        /* renamed from: c, reason: collision with root package name */
        public MessageType f15703c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15704d = false;

        public a(MessageType messagetype) {
            this.f15702b = messagetype;
            this.f15703c = (MessageType) messagetype.f(f.NEW_MUTABLE_INSTANCE);
        }

        public static void g(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2) {
            b0 b0Var = b0.f15581c;
            b0Var.getClass();
            b0Var.a(abstractC1744w.getClass()).c(abstractC1744w, abstractC1744w2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f15702b;
            messagetype.getClass();
            a aVar = (a) messagetype.f(f.NEW_BUILDER);
            AbstractC1744w abstractC1744wE = e();
            aVar.f();
            g(aVar.f15703c, abstractC1744wE);
            return aVar;
        }

        public final MessageType d() {
            MessageType messagetype = (MessageType) e();
            if (messagetype.i()) {
                return messagetype;
            }
            throw new I1.c();
        }

        public final MessageType e() {
            if (this.f15704d) {
                return this.f15703c;
            }
            MessageType messagetype = this.f15703c;
            messagetype.getClass();
            b0 b0Var = b0.f15581c;
            b0Var.getClass();
            b0Var.a(messagetype.getClass()).makeImmutable(messagetype);
            this.f15704d = true;
            return this.f15703c;
        }

        public final void f() {
            if (this.f15704d) {
                MessageType messagetype = (MessageType) this.f15703c.f(f.NEW_MUTABLE_INSTANCE);
                g(messagetype, this.f15703c);
                this.f15703c = messagetype;
                this.f15704d = false;
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b<T extends AbstractC1744w<T, ?>> extends AbstractC1724b<T> {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC1744w<MessageType, BuilderType> implements Q {
        protected C1740s<d> extensions = C1740s.f15691d;

        @Override // androidx.datastore.preferences.protobuf.AbstractC1744w, androidx.datastore.preferences.protobuf.Q
        public final AbstractC1744w a() {
            return (AbstractC1744w) f(f.GET_DEFAULT_INSTANCE);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1744w, androidx.datastore.preferences.protobuf.P
        public final a newBuilderForType() {
            return (a) f(f.NEW_BUILDER);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1744w, androidx.datastore.preferences.protobuf.P
        public final a toBuilder() {
            a aVar = (a) f(f.NEW_BUILDER);
            aVar.f();
            a.g(aVar.f15703c, this);
            return aVar;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public static final class d implements C1740s.b<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C1740s.b
        public final s0 getLiteJavaType() {
            throw null;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$e */
    public static class e<ContainingType extends P, Type> extends AbstractC1728f {
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.w$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <T extends AbstractC1744w<?, ?>> T g(Class<T> cls) throws ClassNotFoundException {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException("Class initialization cannot fail.", e4);
            }
        }
        if (t10 != null) {
            return t10;
        }
        AbstractC1744w abstractC1744w = (AbstractC1744w) o0.a(cls);
        abstractC1744w.getClass();
        T t11 = (T) abstractC1744w.f(f.GET_DEFAULT_INSTANCE);
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    public static Object h(Method method, P p10, Object... objArr) {
        try {
            return method.invoke(p10, objArr);
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

    public static <T extends AbstractC1744w<?, ?>> void j(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public AbstractC1744w a() {
        return (AbstractC1744w) f(f.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final void b(AbstractC1733k abstractC1733k) throws IOException {
        b0 b0Var = b0.f15581c;
        b0Var.getClass();
        f0 f0VarA = b0Var.a(getClass());
        C1734l c1734l = abstractC1733k.f15652a;
        if (c1734l == null) {
            c1734l = new C1734l(abstractC1733k);
        }
        f0VarA.e(this, c1734l);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1723a
    public final int c() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1723a
    public final void e(int i) {
        this.memoizedSerializedSize = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC1744w) f(f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        b0 b0Var = b0.f15581c;
        b0Var.getClass();
        return b0Var.a(getClass()).f(this, (AbstractC1744w) obj);
    }

    public abstract Object f(f fVar);

    @Override // androidx.datastore.preferences.protobuf.P
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            b0 b0Var = b0.f15581c;
            b0Var.getClass();
            this.memoizedSerializedSize = b0Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        b0 b0Var = b0.f15581c;
        b0Var.getClass();
        int iD = b0Var.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public final boolean i() {
        byte bByteValue = ((Byte) f(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        b0 b0Var = b0.f15581c;
        b0Var.getClass();
        boolean zIsInitialized = b0Var.a(getClass()).isInitialized(this);
        f(f.SET_MEMOIZED_IS_INITIALIZED);
        return zIsInitialized;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public a newBuilderForType() {
        return (a) f(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public a toBuilder() {
        a aVar = (a) f(f.NEW_BUILDER);
        aVar.f();
        a.g(aVar.f15703c, this);
        return aVar;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        S.c(this, sb, 0);
        return sb.toString();
    }
}
