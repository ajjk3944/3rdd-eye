package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.AbstractC4016a;
import com.google.protobuf.AbstractC4042z;
import com.google.protobuf.AbstractC4042z.b;
import com.google.protobuf.B;
import com.google.protobuf.C4022e;
import com.google.protobuf.C4038v;
import com.google.protobuf.U;
import g0.C4356c;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4042z<MessageType extends AbstractC4042z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC4016a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC4042z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected v0 unknownFields = v0.getDefaultInstance();

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[A0.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr;
            try {
                iArr[A0.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$b */
    public static abstract class b<MessageType extends AbstractC4042z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC4016a.AbstractC0355a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        public b(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            h0.getInstance().schemaFor((h0) messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) newMutableInstance();
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a, com.google.protobuf.V
        public final boolean isInitialized() {
            return AbstractC4042z.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC4016a.AbstractC0355a.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a, com.google.protobuf.V
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((b<MessageType, BuilderType>) messagetype);
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo12clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C {
            copyOnWrite();
            try {
                h0.getInstance().schemaFor((h0) this.instance).mergeFrom(this.instance, bArr, i, i + i10, new C4022e.b(c4034q));
                return this;
            } catch (C e4) {
                throw e4;
            } catch (IOException e10) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e10);
            } catch (IndexOutOfBoundsException unused) {
                throw C.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr, int i, int i10) throws C {
            return (BuilderType) mergeFrom(bArr, i, i10, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractC4016a.AbstractC0355a, com.google.protobuf.U.a
        public BuilderType mergeFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
            copyOnWrite();
            try {
                h0.getInstance().schemaFor((h0) this.instance).mergeFrom(this.instance, C4028k.forCodedInput(abstractC4027j), c4034q);
                return this;
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof IOException) {
                    throw ((IOException) e4.getCause());
                }
                throw e4;
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$e */
    public interface e<MessageType extends d<MessageType, BuilderType>, BuilderType> extends V {
        @Override // com.google.protobuf.V
        /* synthetic */ U getDefaultInstanceForType();

        <Type> Type getExtension(AbstractC4032o<MessageType, Type> abstractC4032o);

        <Type> Type getExtension(AbstractC4032o<MessageType, List<Type>> abstractC4032o, int i);

        <Type> int getExtensionCount(AbstractC4032o<MessageType, List<Type>> abstractC4032o);

        <Type> boolean hasExtension(AbstractC4032o<MessageType, Type> abstractC4032o);

        @Override // com.google.protobuf.V
        /* synthetic */ boolean isInitialized();
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$f */
    public static final class f implements C4038v.c<f> {
        final B.d<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final A0.b type;

        public f(B.d<?> dVar, int i, A0.b bVar, boolean z10, boolean z11) {
            this.enumTypeMap = dVar;
            this.number = i;
            this.type = bVar;
            this.isRepeated = z10;
            this.isPacked = z11;
        }

        @Override // com.google.protobuf.C4038v.c
        public B.d<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // com.google.protobuf.C4038v.c
        public A0.c getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.C4038v.c
        public A0.b getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.C4038v.c
        public int getNumber() {
            return this.number;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C4038v.c
        public U.a internalMergeFrom(U.a aVar, U u8) {
            return ((b) aVar).mergeFrom((b) u8);
        }

        @Override // com.google.protobuf.C4038v.c
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.C4038v.c
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // java.lang.Comparable
        public int compareTo(f fVar) {
            return this.number - fVar.number;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$g */
    public static class g<ContainingType extends U, Type> extends AbstractC4032o<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final f descriptor;
        final U messageDefaultInstance;

        public g(ContainingType containingtype, Type type, U u8, f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.getLiteType() == A0.b.MESSAGE && u8 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = u8;
            this.descriptor = fVar;
        }

        public Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != A0.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularFromFieldSetType(it.next()));
            }
            return arrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.AbstractC4032o
        public Type getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.google.protobuf.AbstractC4032o
        public A0.b getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.AbstractC4032o
        public U getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // com.google.protobuf.AbstractC4032o
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.AbstractC4032o
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        public Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == A0.c.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == A0.c.ENUM ? Integer.valueOf(((B.c) obj).getNumber()) : obj;
        }

        public Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != A0.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$h */
    public enum h {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends d<MessageType, BuilderType>, BuilderType, T> g<MessageType, T> checkIsLite(AbstractC4032o<MessageType, T> abstractC4032o) {
        if (abstractC4032o.isLite()) {
            return (g) abstractC4032o;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends AbstractC4042z<T, ?>> T checkMessageInitialized(T t10) throws C {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t10);
    }

    private int computeSerializedSize(n0<?> n0Var) {
        return n0Var == null ? h0.getInstance().schemaFor((h0) this).getSerializedSize(this) : n0Var.getSerializedSize(this);
    }

    public static B.a emptyBooleanList() {
        return C4023f.emptyList();
    }

    public static B.b emptyDoubleList() {
        return C4031n.emptyList();
    }

    public static B.f emptyFloatList() {
        return C4040x.emptyList();
    }

    public static B.g emptyIntList() {
        return A.emptyList();
    }

    public static B.h emptyLongList() {
        return K.emptyList();
    }

    public static <E> B.i<E> emptyProtobufList() {
        return i0.emptyList();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == v0.getDefaultInstance()) {
            this.unknownFields = v0.newInstance();
        }
    }

    public static <T extends AbstractC4042z<?, ?>> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
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
        T t11 = (T) ((AbstractC4042z) y0.allocateInstance(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e4);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
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

    public static B.g mutableCopy(B.g gVar) {
        int size = gVar.size();
        return gVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(U u8, String str, Object[] objArr) {
        return new k0(u8, str, objArr);
    }

    public static <ContainingType extends U, Type> g<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, U u8, B.d<?> dVar, int i, A0.b bVar, boolean z10, Class cls) {
        return new g<>(containingtype, Collections.EMPTY_LIST, u8, new f(dVar, i, bVar, true, z10), cls);
    }

    public static <ContainingType extends U, Type> g<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, U u8, B.d<?> dVar, int i, A0.b bVar, Class cls) {
        return new g<>(containingtype, type, u8, new f(dVar, i, bVar, false, false), cls);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream) throws C {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, C4034q.getEmptyRegistry()));
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parseFrom(t10, AbstractC4027j.newInstance(byteBuffer), c4034q));
    }

    private static <T extends AbstractC4042z<T, ?>> T parsePartialDelimitedFrom(T t10, InputStream inputStream, C4034q c4034q) throws IOException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(new AbstractC4016a.AbstractC0355a.C0356a(inputStream, AbstractC4027j.readRawVarint32(i, inputStream)));
            T t11 = (T) parsePartialFrom(t10, abstractC4027jNewInstance, c4034q);
            try {
                abstractC4027jNewInstance.checkLastTagWas(0);
                return t11;
            } catch (C e4) {
                throw e4.setUnfinishedMessage(t11);
            }
        } catch (C e10) {
            if (e10.getThrownFromInputStream()) {
                throw new C((IOException) e10);
            }
            throw e10;
        } catch (IOException e11) {
            throw new C(e11);
        }
    }

    public static <T extends AbstractC4042z<T, ?>> T parsePartialFrom(T t10, AbstractC4027j abstractC4027j, C4034q c4034q) throws C {
        T t11 = (T) t10.newMutableInstance();
        try {
            n0 n0VarSchemaFor = h0.getInstance().schemaFor((h0) t11);
            n0VarSchemaFor.mergeFrom(t11, C4028k.forCodedInput(abstractC4027j), c4034q);
            n0VarSchemaFor.makeImmutable(t11);
            return t11;
        } catch (C e4) {
            e = e4;
            if (e.getThrownFromInputStream()) {
                e = new C((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (t0 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e11) {
            if (e11.getCause() instanceof C) {
                throw ((C) e11.getCause());
            }
            throw new C(e11).setUnfinishedMessage(t11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof C) {
                throw ((C) e12.getCause());
            }
            throw e12;
        }
    }

    public static <T extends AbstractC4042z<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(h.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return h0.getInstance().schemaFor((h0) this).hashCode(this);
    }

    public final <MessageType extends AbstractC4042z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(h.NEW_BUILDER);
    }

    public Object dynamicMethod(h hVar, Object obj) {
        return dynamicMethod(hVar, obj, null);
    }

    public abstract Object dynamicMethod(h hVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return h0.getInstance().schemaFor((h0) this).equals(this, (AbstractC4042z) obj);
        }
        return false;
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC4016a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U
    public final e0<MessageType> getParserForType() {
        return (e0) dynamicMethod(h.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC4016a
    public int getSerializedSize(n0 n0Var) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(n0Var);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(C4356c.h(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(n0Var);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U, com.google.protobuf.V
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        h0.getInstance().schemaFor((h0) this).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, AbstractC4026i abstractC4026i) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, abstractC4026i);
    }

    public final void mergeUnknownFields(v0 v0Var) {
        this.unknownFields = v0.mutableCopyOf(this.unknownFields, v0Var);
    }

    public void mergeVarintField(int i, int i10) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i10);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(h.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i, AbstractC4027j abstractC4027j) throws IOException {
        if (A0.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, abstractC4027j);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.AbstractC4016a
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(C4356c.h(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        return W.toString(this, super.toString());
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U
    public void writeTo(AbstractC4029l abstractC4029l) throws IOException {
        h0.getInstance().schemaFor((h0) this).writeTo(this, C4030m.forCodedOutput(abstractC4029l));
    }

    public static final <T extends AbstractC4042z<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(h.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = h0.getInstance().schemaFor((h0) t10).isInitialized(t10);
        if (z10) {
            t10.dynamicMethod(h.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t10 : null);
        }
        return zIsInitialized;
    }

    public final <MessageType extends AbstractC4042z<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((b) messagetype);
    }

    public Object dynamicMethod(h hVar) {
        return dynamicMethod(hVar, null, null);
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U, com.google.protobuf.V
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(h.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(h.NEW_BUILDER);
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U
    public final BuilderType toBuilder() {
        return (BuilderType) ((b) dynamicMethod(h.NEW_BUILDER)).mergeFrom((b) this);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$c */
    public static class c<T extends AbstractC4042z<T, ?>> extends AbstractC4018b<T> {
        private final T defaultInstance;

        public c(T t10) {
            this.defaultInstance = t10;
        }

        @Override // com.google.protobuf.AbstractC4018b, com.google.protobuf.e0
        public T parsePartialFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws C {
            return (T) AbstractC4042z.parsePartialFrom(this.defaultInstance, abstractC4027j, c4034q);
        }

        @Override // com.google.protobuf.AbstractC4018b, com.google.protobuf.e0
        public T parsePartialFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C {
            return (T) AbstractC4042z.parsePartialFrom(this.defaultInstance, bArr, i, i10, c4034q);
        }
    }

    public static B.h mutableCopy(B.h hVar) {
        int size = hVar.size();
        return hVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer) throws C {
        return (T) parseFrom(t10, byteBuffer, C4034q.getEmptyRegistry());
    }

    public static <T extends AbstractC4042z<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t10, inputStream, c4034q));
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, AbstractC4026i abstractC4026i) throws C {
        return (T) checkMessageInitialized(parseFrom(t10, abstractC4026i, C4034q.getEmptyRegistry()));
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.z$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC4042z<MessageType, BuilderType> implements e<MessageType, BuilderType> {
        protected C4038v<f> extensions = C4038v.emptySet();

        /* compiled from: GeneratedMessageLite.java */
        /* renamed from: com.google.protobuf.z$d$a */
        public class a {
            private final Iterator<Map.Entry<f, Object>> iter;
            private final boolean messageSetWireFormat;
            private Map.Entry<f, Object> next;

            public /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void writeUntil(int i, AbstractC4029l abstractC4029l) throws IOException {
                while (true) {
                    Map.Entry<f, Object> entry = this.next;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    f key = this.next.getKey();
                    if (this.messageSetWireFormat && key.getLiteJavaType() == A0.c.MESSAGE && !key.isRepeated()) {
                        abstractC4029l.writeMessageSetExtension(key.getNumber(), (U) this.next.getValue());
                    } else {
                        C4038v.writeField(key, this.next.getValue(), abstractC4029l);
                    }
                    if (this.iter.hasNext()) {
                        this.next = this.iter.next();
                    } else {
                        this.next = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator it = d.this.extensions.iterator();
                this.iter = it;
                if (it.hasNext()) {
                    this.next = (Map.Entry) it.next();
                }
                this.messageSetWireFormat = z10;
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC4027j abstractC4027j, g<?, ?> gVar, C4034q c4034q, int i) throws IOException {
            parseExtension(abstractC4027j, c4034q, gVar, A0.makeTag(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(AbstractC4026i abstractC4026i, C4034q c4034q, g<?, ?> gVar) throws IOException {
            U u8 = (U) this.extensions.getField(gVar.descriptor);
            U.a builder = u8 != null ? u8.toBuilder() : null;
            if (builder == null) {
                builder = gVar.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(abstractC4026i, c4034q);
            ensureExtensionsAreMutable().setField(gVar.descriptor, gVar.singularToFieldSetType(builder.build()));
        }

        private <MessageType extends U> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
            int uInt32 = 0;
            AbstractC4026i bytes = null;
            g<?, ?> gVarFindLiteExtensionByNumber = null;
            while (true) {
                int tag = abstractC4027j.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == A0.MESSAGE_SET_TYPE_ID_TAG) {
                    uInt32 = abstractC4027j.readUInt32();
                    if (uInt32 != 0) {
                        gVarFindLiteExtensionByNumber = c4034q.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == A0.MESSAGE_SET_MESSAGE_TAG) {
                    if (uInt32 == 0 || gVarFindLiteExtensionByNumber == null) {
                        bytes = abstractC4027j.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC4027j, gVarFindLiteExtensionByNumber, c4034q, uInt32);
                        bytes = null;
                    }
                } else if (!abstractC4027j.skipField(tag)) {
                    break;
                }
            }
            abstractC4027j.checkLastTagWas(A0.MESSAGE_SET_ITEM_END_TAG);
            if (bytes == null || uInt32 == 0) {
                return;
            }
            if (gVarFindLiteExtensionByNumber != null) {
                mergeMessageSetExtensionFromBytes(bytes, c4034q, gVarFindLiteExtensionByNumber);
            } else {
                mergeLengthDelimitedField(uInt32, bytes);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private boolean parseExtension(com.google.protobuf.AbstractC4027j r6, com.google.protobuf.C4034q r7, com.google.protobuf.AbstractC4042z.g<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 293
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC4042z.d.parseExtension(com.google.protobuf.j, com.google.protobuf.q, com.google.protobuf.z$g, int, int):boolean");
        }

        private void verifyExtensionContainingType(g<MessageType, ?> gVar) {
            if (gVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C4038v<f> ensureExtensionsAreMutable() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m13clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.isInitialized();
        }

        public int extensionsSerializedSize() {
            return this.extensions.getSerializedSize();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.getMessageSetSerializedSize();
        }

        @Override // com.google.protobuf.AbstractC4042z, com.google.protobuf.AbstractC4016a, com.google.protobuf.U, com.google.protobuf.V
        public /* bridge */ /* synthetic */ U getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC4042z.e
        public final <Type> Type getExtension(AbstractC4032o<MessageType, Type> abstractC4032o) {
            g<MessageType, ?> gVarCheckIsLite = AbstractC4042z.checkIsLite(abstractC4032o);
            verifyExtensionContainingType(gVarCheckIsLite);
            Object field = this.extensions.getField(gVarCheckIsLite.descriptor);
            return field == null ? gVarCheckIsLite.defaultValue : (Type) gVarCheckIsLite.fromFieldSetType(field);
        }

        @Override // com.google.protobuf.AbstractC4042z.e
        public final <Type> int getExtensionCount(AbstractC4032o<MessageType, List<Type>> abstractC4032o) {
            g<MessageType, ?> gVarCheckIsLite = AbstractC4042z.checkIsLite(abstractC4032o);
            verifyExtensionContainingType(gVarCheckIsLite);
            return this.extensions.getRepeatedFieldCount(gVarCheckIsLite.descriptor);
        }

        @Override // com.google.protobuf.AbstractC4042z.e
        public final <Type> boolean hasExtension(AbstractC4032o<MessageType, Type> abstractC4032o) {
            g<MessageType, ?> gVarCheckIsLite = AbstractC4042z.checkIsLite(abstractC4032o);
            verifyExtensionContainingType(gVarCheckIsLite);
            return this.extensions.hasField(gVarCheckIsLite.descriptor);
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m13clone();
            }
            this.extensions.mergeFrom(messagetype.extensions);
        }

        @Override // com.google.protobuf.AbstractC4042z, com.google.protobuf.AbstractC4016a, com.google.protobuf.U
        public /* bridge */ /* synthetic */ U.a newBuilderForType() {
            return newBuilderForType();
        }

        public d<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public d<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        public <MessageType extends U> boolean parseUnknownField(MessageType messagetype, AbstractC4027j abstractC4027j, C4034q c4034q, int i) throws IOException {
            int tagFieldNumber = A0.getTagFieldNumber(i);
            return parseExtension(abstractC4027j, c4034q, c4034q.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
        }

        public <MessageType extends U> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC4027j abstractC4027j, C4034q c4034q, int i) throws IOException {
            if (i != A0.MESSAGE_SET_ITEM_TAG) {
                return A0.getTagWireType(i) == 2 ? parseUnknownField(messagetype, abstractC4027j, c4034q, i) : abstractC4027j.skipField(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC4027j, c4034q);
            return true;
        }

        @Override // com.google.protobuf.AbstractC4042z, com.google.protobuf.AbstractC4016a, com.google.protobuf.U
        public /* bridge */ /* synthetic */ U.a toBuilder() {
            return toBuilder();
        }

        @Override // com.google.protobuf.AbstractC4042z.e
        public final <Type> Type getExtension(AbstractC4032o<MessageType, List<Type>> abstractC4032o, int i) {
            g<MessageType, ?> gVarCheckIsLite = AbstractC4042z.checkIsLite(abstractC4032o);
            verifyExtensionContainingType(gVarCheckIsLite);
            return (Type) gVarCheckIsLite.singularFromFieldSetType(this.extensions.getRepeatedField(gVarCheckIsLite.descriptor, i));
        }
    }

    public static B.f mutableCopy(B.f fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, abstractC4026i, c4034q));
    }

    public static B.b mutableCopy(B.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, byte[] bArr) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, C4034q.getEmptyRegistry()));
    }

    public static B.a mutableCopy(B.a aVar) {
        int size = aVar.size();
        return aVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, byte[] bArr, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, c4034q));
    }

    public static <E> B.i<E> mutableCopy(B.i<E> iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, InputStream inputStream) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, AbstractC4027j.newInstance(inputStream), C4034q.getEmptyRegistry()));
    }

    @Override // com.google.protobuf.AbstractC4016a, com.google.protobuf.U
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends AbstractC4042z<T, ?>> T parsePartialFrom(T t10, byte[] bArr, int i, int i10, C4034q c4034q) throws C {
        T t11 = (T) t10.newMutableInstance();
        try {
            n0 n0VarSchemaFor = h0.getInstance().schemaFor((h0) t11);
            n0VarSchemaFor.mergeFrom(t11, bArr, i, i + i10, new C4022e.b(c4034q));
            n0VarSchemaFor.makeImmutable(t11);
            return t11;
        } catch (C e4) {
            C c10 = e4;
            if (c10.getThrownFromInputStream()) {
                c10 = new C((IOException) c10);
            }
            throw c10.setUnfinishedMessage(t11);
        } catch (t0 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e11) {
            if (e11.getCause() instanceof C) {
                throw ((C) e11.getCause());
            }
            throw new C(e11).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw C.truncatedMessage().setUnfinishedMessage(t11);
        }
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, InputStream inputStream, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, AbstractC4027j.newInstance(inputStream), c4034q));
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, AbstractC4027j abstractC4027j) throws C {
        return (T) parseFrom(t10, abstractC4027j, C4034q.getEmptyRegistry());
    }

    public static <T extends AbstractC4042z<T, ?>> T parseFrom(T t10, AbstractC4027j abstractC4027j, C4034q c4034q) throws C {
        return (T) checkMessageInitialized(parsePartialFrom(t10, abstractC4027j, c4034q));
    }

    public static <T extends AbstractC4042z<T, ?>> T parsePartialFrom(T t10, AbstractC4027j abstractC4027j) throws C {
        return (T) parsePartialFrom(t10, abstractC4027j, C4034q.getEmptyRegistry());
    }

    private static <T extends AbstractC4042z<T, ?>> T parsePartialFrom(T t10, AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
        AbstractC4027j abstractC4027jNewCodedInput = abstractC4026i.newCodedInput();
        T t11 = (T) parsePartialFrom(t10, abstractC4027jNewCodedInput, c4034q);
        try {
            abstractC4027jNewCodedInput.checkLastTagWas(0);
            return t11;
        } catch (C e4) {
            throw e4.setUnfinishedMessage(t11);
        }
    }
}
