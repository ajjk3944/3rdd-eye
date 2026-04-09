package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.U;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: MapEntryLite.java */
/* loaded from: classes2.dex */
public class M<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final b<K, V> metadata;
    private final V value;

    /* compiled from: MapEntryLite.java */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[A0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[A0.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MapEntryLite.java */
    public static class b<K, V> {
        public final K defaultKey;
        public final V defaultValue;
        public final A0.b keyType;
        public final A0.b valueType;

        public b(A0.b bVar, K k10, A0.b bVar2, V v10) {
            this.keyType = bVar;
            this.defaultKey = k10;
            this.valueType = bVar2;
            this.defaultValue = v10;
        }
    }

    private M(A0.b bVar, K k10, A0.b bVar2, V v10) {
        this.metadata = new b<>(bVar, k10, bVar2, v10);
        this.key = k10;
        this.value = v10;
    }

    public static <K, V> int computeSerializedSize(b<K, V> bVar, K k10, V v10) {
        return C4038v.computeElementSize(bVar.valueType, 2, v10) + C4038v.computeElementSize(bVar.keyType, 1, k10);
    }

    public static <K, V> M<K, V> newDefaultInstance(A0.b bVar, K k10, A0.b bVar2, V v10) {
        return new M<>(bVar, k10, bVar2, v10);
    }

    public static <T> T parseField(AbstractC4027j abstractC4027j, C4034q c4034q, A0.b bVar, T t10) throws IOException {
        int i = a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.ordinal()];
        if (i == 1) {
            U.a builder = ((U) t10).toBuilder();
            abstractC4027j.readMessage(builder, c4034q);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(abstractC4027j.readEnum());
        }
        if (i != 3) {
            return (T) C4038v.readPrimitiveField(abstractC4027j, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void writeTo(AbstractC4029l abstractC4029l, b<K, V> bVar, K k10, V v10) throws IOException {
        C4038v.writeElement(abstractC4029l, bVar.keyType, 1, k10);
        C4038v.writeElement(abstractC4029l, bVar.valueType, 2, v10);
    }

    public int computeMessageSize(int i, K k10, V v10) {
        return AbstractC4029l.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k10, v10)) + AbstractC4029l.computeTagSize(i);
    }

    public K getKey() {
        return this.key;
    }

    public b<K, V> getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(AbstractC4026i abstractC4026i, C4034q c4034q) throws IOException {
        return parseEntry(abstractC4026i.newCodedInput(), this.metadata, c4034q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(N<K, V> n9, AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
        int iPushLimit = abstractC4027j.pushLimit(abstractC4027j.readRawVarint32());
        b<K, V> bVar = this.metadata;
        Object field = bVar.defaultKey;
        Object field2 = bVar.defaultValue;
        while (true) {
            int tag = abstractC4027j.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == A0.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(abstractC4027j, c4034q, this.metadata.keyType, field);
            } else if (tag == A0.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(abstractC4027j, c4034q, this.metadata.valueType, field2);
            } else if (!abstractC4027j.skipField(tag)) {
                break;
            }
        }
        abstractC4027j.checkLastTagWas(0);
        abstractC4027j.popLimit(iPushLimit);
        n9.put(field, field2);
    }

    public void serializeTo(AbstractC4029l abstractC4029l, int i, K k10, V v10) throws IOException {
        abstractC4029l.writeTag(i, 2);
        abstractC4029l.writeUInt32NoTag(computeSerializedSize(this.metadata, k10, v10));
        writeTo(abstractC4029l, this.metadata, k10, v10);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(AbstractC4027j abstractC4027j, b<K, V> bVar, C4034q c4034q) throws IOException {
        Object field = bVar.defaultKey;
        Object field2 = bVar.defaultValue;
        while (true) {
            int tag = abstractC4027j.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == A0.makeTag(1, bVar.keyType.getWireType())) {
                field = parseField(abstractC4027j, c4034q, bVar.keyType, field);
            } else if (tag == A0.makeTag(2, bVar.valueType.getWireType())) {
                field2 = parseField(abstractC4027j, c4034q, bVar.valueType, field2);
            } else if (!abstractC4027j.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private M(b<K, V> bVar, K k10, V v10) {
        this.metadata = bVar;
        this.key = k10;
        this.value = v10;
    }
}
