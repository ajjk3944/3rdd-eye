package com.google.protobuf;

import com.google.protobuf.A0;
import com.google.protobuf.B0;
import com.google.protobuf.M;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4030m implements B0 {
    private final AbstractC4029l output;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: com.google.protobuf.m$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[A0.b.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[A0.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[A0.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C4030m(AbstractC4029l abstractC4029l) {
        AbstractC4029l abstractC4029l2 = (AbstractC4029l) B.checkNotNull(abstractC4029l, "output");
        this.output = abstractC4029l2;
        abstractC4029l2.wrapper = this;
    }

    public static C4030m forCodedOutput(AbstractC4029l abstractC4029l) {
        C4030m c4030m = abstractC4029l.wrapper;
        return c4030m != null ? c4030m : new C4030m(abstractC4029l);
    }

    private <V> void writeDeterministicBooleanMapEntry(int i, boolean z10, V v10, M.b<Boolean, V> bVar) throws IOException {
        this.output.writeTag(i, 2);
        this.output.writeUInt32NoTag(M.computeSerializedSize(bVar, Boolean.valueOf(z10), v10));
        M.writeTo(this.output, bVar, Boolean.valueOf(z10), v10);
    }

    private <V> void writeDeterministicIntegerMap(int i, M.b<Integer, V> bVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        Arrays.sort(iArr);
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = iArr[i11];
            V v10 = map.get(Integer.valueOf(i12));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(M.computeSerializedSize(bVar, Integer.valueOf(i12), v10));
            M.writeTo(this.output, bVar, Integer.valueOf(i12), v10);
        }
    }

    private <V> void writeDeterministicLongMap(int i, M.b<Long, V> bVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        Arrays.sort(jArr);
        for (int i11 = 0; i11 < size; i11++) {
            long j4 = jArr[i11];
            V v10 = map.get(Long.valueOf(j4));
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(M.computeSerializedSize(bVar, Long.valueOf(j4), v10));
            M.writeTo(this.output, bVar, Long.valueOf(j4), v10);
        }
    }

    private <K, V> void writeDeterministicMap(int i, M.b<K, V> bVar, Map<K, V> map) throws IOException {
        switch (a.$SwitchMap$com$google$protobuf$WireFormat$FieldType[bVar.keyType.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    writeDeterministicBooleanMapEntry(i, false, v10, bVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    writeDeterministicBooleanMapEntry(i, true, v11, bVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                writeDeterministicIntegerMap(i, bVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                writeDeterministicLongMap(i, bVar, map);
                return;
            case 12:
                writeDeterministicStringMap(i, bVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + bVar.keyType);
        }
    }

    private <V> void writeDeterministicStringMap(int i, M.b<String, V> bVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = it.next();
            i10++;
        }
        Arrays.sort(strArr);
        for (int i11 = 0; i11 < size; i11++) {
            String str = strArr[i11];
            V v10 = map.get(str);
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(M.computeSerializedSize(bVar, str, v10));
            M.writeTo(this.output, bVar, str, v10);
        }
    }

    private void writeLazyString(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.output.writeString(i, (String) obj);
        } else {
            this.output.writeBytes(i, (AbstractC4026i) obj);
        }
    }

    @Override // com.google.protobuf.B0
    public B0.a fieldOrder() {
        return B0.a.ASCENDING;
    }

    public int getTotalBytesWritten() {
        return this.output.getTotalBytesWritten();
    }

    @Override // com.google.protobuf.B0
    public void writeBool(int i, boolean z10) throws IOException {
        this.output.writeBool(i, z10);
    }

    @Override // com.google.protobuf.B0
    public void writeBoolList(int i, List<Boolean> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeBool(i, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeBoolSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeBoolSizeNoTag += AbstractC4029l.computeBoolSizeNoTag(list.get(i11).booleanValue());
        }
        this.output.writeUInt32NoTag(iComputeBoolSizeNoTag);
        while (i10 < list.size()) {
            this.output.writeBoolNoTag(list.get(i10).booleanValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeBytes(int i, AbstractC4026i abstractC4026i) throws IOException {
        this.output.writeBytes(i, abstractC4026i);
    }

    @Override // com.google.protobuf.B0
    public void writeBytesList(int i, List<AbstractC4026i> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.output.writeBytes(i, list.get(i10));
        }
    }

    @Override // com.google.protobuf.B0
    public void writeDouble(int i, double d10) throws IOException {
        this.output.writeDouble(i, d10);
    }

    @Override // com.google.protobuf.B0
    public void writeDoubleList(int i, List<Double> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeDouble(i, list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeDoubleSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeDoubleSizeNoTag += AbstractC4029l.computeDoubleSizeNoTag(list.get(i11).doubleValue());
        }
        this.output.writeUInt32NoTag(iComputeDoubleSizeNoTag);
        while (i10 < list.size()) {
            this.output.writeDoubleNoTag(list.get(i10).doubleValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    @Deprecated
    public void writeEndGroup(int i) throws IOException {
        this.output.writeTag(i, 4);
    }

    @Override // com.google.protobuf.B0
    public void writeEnum(int i, int i10) throws IOException {
        this.output.writeEnum(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeEnumList(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeEnum(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeEnumSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeEnumSizeNoTag += AbstractC4029l.computeEnumSizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeEnumSizeNoTag);
        while (i10 < list.size()) {
            this.output.writeEnumNoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeFixed32(int i, int i10) throws IOException {
        this.output.writeFixed32(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeFixed32List(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeFixed32(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFixed32SizeNoTag += AbstractC4029l.computeFixed32SizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed32SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeFixed32NoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeFixed64(int i, long j4) throws IOException {
        this.output.writeFixed64(i, j4);
    }

    @Override // com.google.protobuf.B0
    public void writeFixed64List(int i, List<Long> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeFixed64(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFixed64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFixed64SizeNoTag += AbstractC4029l.computeFixed64SizeNoTag(list.get(i11).longValue());
        }
        this.output.writeUInt32NoTag(iComputeFixed64SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeFixed64NoTag(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeFloat(int i, float f10) throws IOException {
        this.output.writeFloat(i, f10);
    }

    @Override // com.google.protobuf.B0
    public void writeFloatList(int i, List<Float> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeFloat(i, list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeFloatSizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeFloatSizeNoTag += AbstractC4029l.computeFloatSizeNoTag(list.get(i11).floatValue());
        }
        this.output.writeUInt32NoTag(iComputeFloatSizeNoTag);
        while (i10 < list.size()) {
            this.output.writeFloatNoTag(list.get(i10).floatValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    @Deprecated
    public void writeGroup(int i, Object obj) throws IOException {
        this.output.writeGroup(i, (U) obj);
    }

    @Override // com.google.protobuf.B0
    @Deprecated
    public void writeGroupList(int i, List<?> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i, list.get(i10));
        }
    }

    @Override // com.google.protobuf.B0
    public void writeInt32(int i, int i10) throws IOException {
        this.output.writeInt32(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeInt32List(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeInt32(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeInt32SizeNoTag += AbstractC4029l.computeInt32SizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeInt32SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeInt32NoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeInt64(int i, long j4) throws IOException {
        this.output.writeInt64(i, j4);
    }

    @Override // com.google.protobuf.B0
    public void writeInt64List(int i, List<Long> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeInt64(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeInt64SizeNoTag += AbstractC4029l.computeInt64SizeNoTag(list.get(i11).longValue());
        }
        this.output.writeUInt32NoTag(iComputeInt64SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeInt64NoTag(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public <K, V> void writeMap(int i, M.b<K, V> bVar, Map<K, V> map) throws IOException {
        if (this.output.isSerializationDeterministic()) {
            writeDeterministicMap(i, bVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.output.writeTag(i, 2);
            this.output.writeUInt32NoTag(M.computeSerializedSize(bVar, entry.getKey(), entry.getValue()));
            M.writeTo(this.output, bVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.B0
    public void writeMessage(int i, Object obj) throws IOException {
        this.output.writeMessage(i, (U) obj);
    }

    @Override // com.google.protobuf.B0
    public void writeMessageList(int i, List<?> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i, list.get(i10));
        }
    }

    @Override // com.google.protobuf.B0
    public final void writeMessageSetItem(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC4026i) {
            this.output.writeRawMessageSetExtension(i, (AbstractC4026i) obj);
        } else {
            this.output.writeMessageSetExtension(i, (U) obj);
        }
    }

    @Override // com.google.protobuf.B0
    public void writeSFixed32(int i, int i10) throws IOException {
        this.output.writeSFixed32(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeSFixed32List(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeSFixed32(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSFixed32SizeNoTag += AbstractC4029l.computeSFixed32SizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed32SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeSFixed32NoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeSFixed64(int i, long j4) throws IOException {
        this.output.writeSFixed64(i, j4);
    }

    @Override // com.google.protobuf.B0
    public void writeSFixed64List(int i, List<Long> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeSFixed64(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSFixed64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSFixed64SizeNoTag += AbstractC4029l.computeSFixed64SizeNoTag(list.get(i11).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSFixed64SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeSFixed64NoTag(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeSInt32(int i, int i10) throws IOException {
        this.output.writeSInt32(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeSInt32List(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeSInt32(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSInt32SizeNoTag += AbstractC4029l.computeSInt32SizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt32SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeSInt32NoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeSInt64(int i, long j4) throws IOException {
        this.output.writeSInt64(i, j4);
    }

    @Override // com.google.protobuf.B0
    public void writeSInt64List(int i, List<Long> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeSInt64(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeSInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeSInt64SizeNoTag += AbstractC4029l.computeSInt64SizeNoTag(list.get(i11).longValue());
        }
        this.output.writeUInt32NoTag(iComputeSInt64SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeSInt64NoTag(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    @Deprecated
    public void writeStartGroup(int i) throws IOException {
        this.output.writeTag(i, 3);
    }

    @Override // com.google.protobuf.B0
    public void writeString(int i, String str) throws IOException {
        this.output.writeString(i, str);
    }

    @Override // com.google.protobuf.B0
    public void writeStringList(int i, List<String> list) throws IOException {
        int i10 = 0;
        if (!(list instanceof I)) {
            while (i10 < list.size()) {
                this.output.writeString(i, list.get(i10));
                i10++;
            }
        } else {
            I i11 = (I) list;
            while (i10 < list.size()) {
                writeLazyString(i, i11.getRaw(i10));
                i10++;
            }
        }
    }

    @Override // com.google.protobuf.B0
    public void writeUInt32(int i, int i10) throws IOException {
        this.output.writeUInt32(i, i10);
    }

    @Override // com.google.protobuf.B0
    public void writeUInt32List(int i, List<Integer> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeUInt32(i, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt32SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeUInt32SizeNoTag += AbstractC4029l.computeUInt32SizeNoTag(list.get(i11).intValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt32SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeUInt32NoTag(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeUInt64(int i, long j4) throws IOException {
        this.output.writeUInt64(i, j4);
    }

    @Override // com.google.protobuf.B0
    public void writeUInt64List(int i, List<Long> list, boolean z10) throws IOException {
        int i10 = 0;
        if (!z10) {
            while (i10 < list.size()) {
                this.output.writeUInt64(i, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.output.writeTag(i, 2);
        int iComputeUInt64SizeNoTag = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iComputeUInt64SizeNoTag += AbstractC4029l.computeUInt64SizeNoTag(list.get(i11).longValue());
        }
        this.output.writeUInt32NoTag(iComputeUInt64SizeNoTag);
        while (i10 < list.size()) {
            this.output.writeUInt64NoTag(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.protobuf.B0
    public void writeGroup(int i, Object obj, n0 n0Var) throws IOException {
        this.output.writeGroup(i, (U) obj, n0Var);
    }

    @Override // com.google.protobuf.B0
    public void writeMessage(int i, Object obj, n0 n0Var) throws IOException {
        this.output.writeMessage(i, (U) obj, n0Var);
    }

    @Override // com.google.protobuf.B0
    public void writeGroupList(int i, List<?> list, n0 n0Var) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeGroup(i, list.get(i10), n0Var);
        }
    }

    @Override // com.google.protobuf.B0
    public void writeMessageList(int i, List<?> list, n0 n0Var) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            writeMessage(i, list.get(i10), n0Var);
        }
    }
}
