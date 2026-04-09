package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.B;
import com.google.protobuf.C4038v.c;
import com.google.protobuf.F;
import com.google.protobuf.U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* renamed from: com.google.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4038v<T extends c<T>> {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final C4038v DEFAULT_INSTANCE = new C4038v(true);
    private final q0<T, Object> fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.v$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$JavaType;

        static {
            int[] iArr = new int[A0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[A0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[A0.c.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$JavaType = iArr2;
            try {
                iArr2[A0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$JavaType[A0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.v$b */
    public static final class b<T extends c<T>> {
        private q0<T, Object> fields;
        private boolean hasLazyField;
        private boolean hasNestedBuilders;
        private boolean isMutable;

        public /* synthetic */ b(a aVar) {
            this();
        }

        private C4038v<T> buildImpl(boolean z10) {
            if (this.fields.isEmpty()) {
                return C4038v.emptySet();
            }
            this.isMutable = false;
            q0<T, Object> q0VarCloneAllFieldsMap = this.fields;
            if (this.hasNestedBuilders) {
                q0VarCloneAllFieldsMap = C4038v.cloneAllFieldsMap(q0VarCloneAllFieldsMap, false);
                replaceBuilders(q0VarCloneAllFieldsMap, z10);
            }
            C4038v<T> c4038v = new C4038v<>(q0VarCloneAllFieldsMap, null);
            ((C4038v) c4038v).hasLazyField = this.hasLazyField;
            return c4038v;
        }

        private void ensureIsMutable() {
            if (this.isMutable) {
                return;
            }
            this.fields = C4038v.cloneAllFieldsMap(this.fields, true);
            this.isMutable = true;
        }

        public static <T extends c<T>> b<T> fromFieldSet(C4038v<T> c4038v) {
            b<T> bVar = new b<>(C4038v.cloneAllFieldsMap(((C4038v) c4038v).fields, true));
            ((b) bVar).hasLazyField = ((C4038v) c4038v).hasLazyField;
            return bVar;
        }

        private void mergeFromField(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof F) {
                value = ((F) value).getValue();
            }
            if (key.isRepeated()) {
                List arrayList = (List) getFieldAllowBuilders(key);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.fields.put((q0<T, Object>) key, (T) arrayList);
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    arrayList.add(C4038v.cloneIfMutable(it.next()));
                }
                return;
            }
            if (key.getLiteJavaType() != A0.c.MESSAGE) {
                this.fields.put((q0<T, Object>) key, (T) C4038v.cloneIfMutable(value));
                return;
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(key);
            if (fieldAllowBuilders == null) {
                this.fields.put((q0<T, Object>) key, (T) C4038v.cloneIfMutable(value));
            } else if (fieldAllowBuilders instanceof U.a) {
                key.internalMergeFrom((U.a) fieldAllowBuilders, (U) value);
            } else {
                this.fields.put((q0<T, Object>) key, (T) key.internalMergeFrom(((U) fieldAllowBuilders).toBuilder(), (U) value).build());
            }
        }

        private static Object replaceBuilder(Object obj, boolean z10) {
            if (!(obj instanceof U.a)) {
                return obj;
            }
            U.a aVar = (U.a) obj;
            return z10 ? aVar.buildPartial() : aVar.build();
        }

        private static <T extends c<T>> void replaceBuilders(q0<T, Object> q0Var, boolean z10) {
            for (int i = 0; i < q0Var.getNumArrayEntries(); i++) {
                replaceBuilders(q0Var.getArrayEntryAt(i), z10);
            }
            Iterator it = q0Var.getOverflowEntries().iterator();
            while (it.hasNext()) {
                replaceBuilders((Map.Entry) it.next(), z10);
            }
        }

        private void verifyType(T t10, Object obj) {
            if (C4038v.isValidType(t10.getLiteType(), obj)) {
                return;
            }
            if (t10.getLiteType().getJavaType() != A0.c.MESSAGE || !(obj instanceof U.a)) {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }

        public void addRepeatedField(T t10, Object obj) {
            List arrayList;
            ensureIsMutable();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof U.a);
            verifyType(t10, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                arrayList = new ArrayList();
                this.fields.put((q0<T, Object>) t10, (T) arrayList);
            } else {
                arrayList = (List) fieldAllowBuilders;
            }
            arrayList.add(obj);
        }

        public C4038v<T> build() {
            return buildImpl(false);
        }

        public C4038v<T> buildPartial() {
            return buildImpl(true);
        }

        public void clearField(T t10) {
            ensureIsMutable();
            this.fields.remove(t10);
            if (this.fields.isEmpty()) {
                this.hasLazyField = false;
            }
        }

        public Map<T, Object> getAllFields() {
            if (!this.hasLazyField) {
                return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
            }
            q0 q0VarCloneAllFieldsMap = C4038v.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                q0VarCloneAllFieldsMap.makeImmutable();
                return q0VarCloneAllFieldsMap;
            }
            replaceBuilders(q0VarCloneAllFieldsMap, true);
            return q0VarCloneAllFieldsMap;
        }

        public Object getField(T t10) {
            return replaceBuilders(t10, getFieldAllowBuilders(t10), true);
        }

        public Object getFieldAllowBuilders(T t10) {
            Object obj = this.fields.get(t10);
            return obj instanceof F ? ((F) obj).getValue() : obj;
        }

        public Object getRepeatedField(T t10, int i) {
            if (this.hasNestedBuilders) {
                ensureIsMutable();
            }
            return replaceBuilder(getRepeatedFieldAllowBuilders(t10, i), true);
        }

        public Object getRepeatedFieldAllowBuilders(T t10, int i) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i);
            }
            throw new IndexOutOfBoundsException();
        }

        public int getRepeatedFieldCount(T t10) {
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
            }
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }

        public boolean hasField(T t10) {
            if (t10.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.fields.get(t10) != null;
        }

        public boolean isInitialized() {
            for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
                if (!C4038v.isInitialized(this.fields.getArrayEntryAt(i))) {
                    return false;
                }
            }
            Iterator it = this.fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                if (!C4038v.isInitialized((Map.Entry) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void mergeFrom(C4038v<T> c4038v) {
            ensureIsMutable();
            for (int i = 0; i < ((C4038v) c4038v).fields.getNumArrayEntries(); i++) {
                mergeFromField(((C4038v) c4038v).fields.getArrayEntryAt(i));
            }
            Iterator it = ((C4038v) c4038v).fields.getOverflowEntries().iterator();
            while (it.hasNext()) {
                mergeFromField((Map.Entry) it.next());
            }
        }

        public void setField(T t10, Object obj) {
            ensureIsMutable();
            if (!t10.isRepeated()) {
                verifyType(t10, obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    verifyType(t10, next);
                    this.hasNestedBuilders = this.hasNestedBuilders || (next instanceof U.a);
                }
                obj = arrayList;
            }
            if (obj instanceof F) {
                this.hasLazyField = true;
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof U.a);
            this.fields.put((q0<T, Object>) t10, (T) obj);
        }

        public void setRepeatedField(T t10, int i, Object obj) {
            ensureIsMutable();
            if (!t10.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.hasNestedBuilders = this.hasNestedBuilders || (obj instanceof U.a);
            Object fieldAllowBuilders = getFieldAllowBuilders(t10);
            if (fieldAllowBuilders == null) {
                throw new IndexOutOfBoundsException();
            }
            verifyType(t10, obj);
            ((List) fieldAllowBuilders).set(i, obj);
        }

        private b() {
            this(q0.newFieldMap(16));
        }

        private b(q0<T, Object> q0Var) {
            this.fields = q0Var;
            this.isMutable = true;
        }

        private static <T extends c<T>> void replaceBuilders(Map.Entry<T, Object> entry, boolean z10) {
            entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z10));
        }

        private static <T extends c<T>> Object replaceBuilders(T t10, Object obj, boolean z10) {
            if (obj == null || t10.getLiteJavaType() != A0.c.MESSAGE) {
                return obj;
            }
            if (t10.isRepeated()) {
                if (obj instanceof List) {
                    List arrayList = (List) obj;
                    for (int i = 0; i < arrayList.size(); i++) {
                        Object obj2 = arrayList.get(i);
                        Object objReplaceBuilder = replaceBuilder(obj2, z10);
                        if (objReplaceBuilder != obj2) {
                            if (arrayList == obj) {
                                arrayList = new ArrayList(arrayList);
                            }
                            arrayList.set(i, objReplaceBuilder);
                        }
                    }
                    return arrayList;
                }
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            return replaceBuilder(obj, z10);
        }
    }

    /* compiled from: FieldSet.java */
    /* renamed from: com.google.protobuf.v$c */
    public interface c<T extends c<T>> extends Comparable<T> {
        B.d<?> getEnumType();

        A0.c getLiteJavaType();

        A0.b getLiteType();

        int getNumber();

        U.a internalMergeFrom(U.a aVar, U u8);

        boolean isPacked();

        boolean isRepeated();
    }

    public /* synthetic */ C4038v(q0 q0Var, a aVar) {
        this(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> q0<T, Object> cloneAllFieldsMap(q0<T, Object> q0Var, boolean z10) {
        q0<T, Object> q0VarNewFieldMap = q0.newFieldMap(16);
        for (int i = 0; i < q0Var.getNumArrayEntries(); i++) {
            cloneFieldEntry(q0VarNewFieldMap, q0Var.getArrayEntryAt(i), z10);
        }
        Iterator it = q0Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(q0VarNewFieldMap, (Map.Entry) it.next(), z10);
        }
        return q0VarNewFieldMap;
    }

    private static <T extends c<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z10) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof F) {
            map.put(key, ((F) value).getValue());
        } else if (z10 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeElementSize(A0.b bVar, int i, Object obj) {
        int iComputeTagSize = AbstractC4029l.computeTagSize(i);
        if (bVar == A0.b.GROUP) {
            iComputeTagSize *= 2;
        }
        return computeElementSizeNoTag(bVar, obj) + iComputeTagSize;
    }

    public static int computeElementSizeNoTag(A0.b bVar, Object obj) {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                return AbstractC4029l.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return AbstractC4029l.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return AbstractC4029l.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return AbstractC4029l.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return AbstractC4029l.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return AbstractC4029l.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return AbstractC4029l.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return AbstractC4029l.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC4029l.computeGroupSizeNoTag((U) obj);
            case 10:
                return obj instanceof F ? AbstractC4029l.computeLazyFieldSizeNoTag((F) obj) : AbstractC4029l.computeMessageSizeNoTag((U) obj);
            case 11:
                return obj instanceof AbstractC4026i ? AbstractC4029l.computeBytesSizeNoTag((AbstractC4026i) obj) : AbstractC4029l.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof AbstractC4026i ? AbstractC4029l.computeBytesSizeNoTag((AbstractC4026i) obj) : AbstractC4029l.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return AbstractC4029l.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return AbstractC4029l.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return AbstractC4029l.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return AbstractC4029l.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return AbstractC4029l.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof B.c ? AbstractC4029l.computeEnumSizeNoTag(((B.c) obj).getNumber()) : AbstractC4029l.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(c<?> cVar, Object obj) {
        A0.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int iComputeElementSize = 0;
        if (!cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it.next());
            }
            return iComputeElementSize;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iComputeElementSize += computeElementSizeNoTag(liteType, it2.next());
        }
        return AbstractC4029l.computeUInt32SizeNoTag(iComputeElementSize) + AbstractC4029l.computeTagSize(number) + iComputeElementSize;
    }

    public static <T extends c<T>> C4038v<T> emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(A0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof V) {
            return ((V) obj).isInitialized();
        }
        if (obj instanceof F) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(A0.b bVar, Object obj) {
        B.checkNotNull(obj);
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$JavaType[bVar.getJavaType().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC4026i) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof B.c)) {
                }
                break;
            case 9:
                if ((obj instanceof U) || (obj instanceof F)) {
                }
                break;
        }
        return false;
    }

    private void mergeFromField(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof F) {
            value = ((F) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((q0<T, Object>) key, (T) field);
            return;
        }
        if (key.getLiteJavaType() != A0.c.MESSAGE) {
            this.fields.put((q0<T, Object>) key, (T) cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((q0<T, Object>) key, (T) cloneIfMutable(value));
        } else {
            this.fields.put((q0<T, Object>) key, (T) key.internalMergeFrom(((U) field2).toBuilder(), (U) value).build());
        }
    }

    public static <T extends c<T>> b<T> newBuilder() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> C4038v<T> newFieldSet() {
        return new C4038v<>();
    }

    public static Object readPrimitiveField(AbstractC4027j abstractC4027j, A0.b bVar, boolean z10) throws IOException {
        return z10 ? A0.readPrimitiveField(abstractC4027j, bVar, A0.d.STRICT) : A0.readPrimitiveField(abstractC4027j, bVar, A0.d.LOOSE);
    }

    private void verifyType(T t10, Object obj) {
        if (!isValidType(t10.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(AbstractC4029l abstractC4029l, A0.b bVar, int i, Object obj) throws IOException {
        if (bVar == A0.b.GROUP) {
            abstractC4029l.writeGroup(i, (U) obj);
        } else {
            abstractC4029l.writeTag(i, getWireFormatForFieldType(bVar, false));
            writeElementNoTag(abstractC4029l, bVar, obj);
        }
    }

    public static void writeElementNoTag(AbstractC4029l abstractC4029l, A0.b bVar, Object obj) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()]) {
            case 1:
                abstractC4029l.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC4029l.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                abstractC4029l.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                abstractC4029l.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                abstractC4029l.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                abstractC4029l.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                abstractC4029l.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                abstractC4029l.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC4029l.writeGroupNoTag((U) obj);
                break;
            case 10:
                abstractC4029l.writeMessageNoTag((U) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC4026i)) {
                    abstractC4029l.writeStringNoTag((String) obj);
                    break;
                } else {
                    abstractC4029l.writeBytesNoTag((AbstractC4026i) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC4026i)) {
                    abstractC4029l.writeByteArrayNoTag((byte[]) obj);
                    break;
                } else {
                    abstractC4029l.writeBytesNoTag((AbstractC4026i) obj);
                    break;
                }
            case 13:
                abstractC4029l.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                abstractC4029l.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                abstractC4029l.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                abstractC4029l.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                abstractC4029l.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof B.c)) {
                    abstractC4029l.writeEnumNoTag(((Integer) obj).intValue());
                    break;
                } else {
                    abstractC4029l.writeEnumNoTag(((B.c) obj).getNumber());
                    break;
                }
        }
    }

    public static void writeField(c<?> cVar, Object obj, AbstractC4029l abstractC4029l) throws IOException {
        A0.b liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            if (obj instanceof F) {
                writeElement(abstractC4029l, liteType, number, ((F) obj).getValue());
                return;
            } else {
                writeElement(abstractC4029l, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(abstractC4029l, liteType, number, it.next());
            }
            return;
        }
        abstractC4029l.writeTag(number, 2);
        Iterator it2 = list.iterator();
        int iComputeElementSizeNoTag = 0;
        while (it2.hasNext()) {
            iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it2.next());
        }
        abstractC4029l.writeUInt32NoTag(iComputeElementSizeNoTag);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            writeElementNoTag(abstractC4029l, liteType, it3.next());
        }
    }

    public void addRepeatedField(T t10, Object obj) {
        List arrayList;
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(t10, obj);
        Object field = getField(t10);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put((q0<T, Object>) t10, (T) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(T t10) {
        this.fields.remove(t10);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<T, Object>> descendingIterator() {
        return this.hasLazyField ? new F.c(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4038v) {
            return this.fields.equals(((C4038v) obj).fields);
        }
        return false;
    }

    public Map<T, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        q0 q0VarCloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            q0VarCloneAllFieldsMap.makeImmutable();
        }
        return q0VarCloneAllFieldsMap;
    }

    public Object getField(T t10) {
        Object obj = this.fields.get(t10);
        return obj instanceof F ? ((F) obj).getValue() : obj;
    }

    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize((Map.Entry) it.next());
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(T t10, int i) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(t10);
        if (field != null) {
            return ((List) field).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(T t10) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(t10);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iComputeFieldSize += computeFieldSize((c) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(T t10) {
        if (t10.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(t10) != null;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> iterator() {
        return this.hasLazyField ? new F.c(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof AbstractC4042z) {
                ((AbstractC4042z) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    public void mergeFrom(C4038v<T> c4038v) {
        for (int i = 0; i < c4038v.fields.getNumArrayEntries(); i++) {
            mergeFromField(c4038v.fields.getArrayEntryAt(i));
        }
        Iterator it = c4038v.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField((Map.Entry) it.next());
        }
    }

    public void setField(T t10, Object obj) {
        if (!t10.isRepeated()) {
            verifyType(t10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(t10, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof F) {
            this.hasLazyField = true;
        }
        this.fields.put((q0<T, Object>) t10, (T) obj);
    }

    public void setRepeatedField(T t10, int i, Object obj) {
        if (!t10.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(t10);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(t10, obj);
        ((List) field).set(i, obj);
    }

    public void writeMessageSetTo(AbstractC4029l abstractC4029l) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), abstractC4029l);
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo((Map.Entry) it.next(), abstractC4029l);
        }
    }

    public void writeTo(AbstractC4029l abstractC4029l) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue(), abstractC4029l);
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            writeField((c) entry.getKey(), entry.getValue(), abstractC4029l);
        }
    }

    private C4038v() {
        this.fields = q0.newFieldMap(16);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C4038v<T> m13clone() {
        C4038v<T> c4038vNewFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<K, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            c4038vNewFieldSet.setField((c) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        Iterator it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c4038vNewFieldSet.setField((c) entry.getKey(), entry.getValue());
        }
        c4038vNewFieldSet.hasLazyField = this.hasLazyField;
        return c4038vNewFieldSet;
    }

    private C4038v(boolean z10) {
        this(q0.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == A0.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof F) {
                return AbstractC4029l.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (F) value);
            }
            return AbstractC4029l.computeMessageSetExtensionSize(entry.getKey().getNumber(), (U) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != A0.c.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<T, Object> entry, AbstractC4029l abstractC4029l) throws IOException {
        T key = entry.getKey();
        if (key.getLiteJavaType() == A0.c.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof F) {
                value = ((F) value).getValue();
            }
            abstractC4029l.writeMessageSetExtension(entry.getKey().getNumber(), (U) value);
            return;
        }
        writeField(key, entry.getValue(), abstractC4029l);
    }

    private C4038v(q0<T, Object> q0Var) {
        this.fields = q0Var;
        makeImmutable();
    }
}
