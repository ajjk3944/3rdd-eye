package com.google.protobuf;

import com.google.protobuf.B;
import com.google.protobuf.C4038v;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes2.dex */
public final class p0 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final u0<?, ?> PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final u0<?, ?> PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final u0<?, ?> UNKNOWN_FIELD_SET_LITE_SCHEMA = new w0();

    private p0() {
    }

    public static int computeSizeBoolList(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return AbstractC4029l.computeBoolSize(i, true) * size;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(size) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i, List<AbstractC4026i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC4029l.computeTagSize(i) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iComputeTagSize += AbstractC4029l.computeBytesSizeNoTag(list.get(i10));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeEnumListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof A)) {
            int iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += AbstractC4029l.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeEnumSizeNoTag;
        }
        A a10 = (A) list;
        int iComputeEnumSizeNoTag2 = 0;
        while (i < size) {
            iComputeEnumSizeNoTag2 += AbstractC4029l.computeEnumSizeNoTag(a10.getInt(i));
            i++;
        }
        return iComputeEnumSizeNoTag2;
    }

    public static int computeSizeFixed32List(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return AbstractC4029l.computeFixed32Size(i, 0) * size;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(size * 4) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z10) {
            return AbstractC4029l.computeFixed64Size(i, 0L) * size;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(size * 8) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i, List<U> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iComputeGroupSize += AbstractC4029l.computeGroupSize(i, list.get(i10));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeInt32ListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof A)) {
            int iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += AbstractC4029l.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeInt32SizeNoTag;
        }
        A a10 = (A) list;
        int iComputeInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt32SizeNoTag2 += AbstractC4029l.computeInt32SizeNoTag(a10.getInt(i));
            i++;
        }
        return iComputeInt32SizeNoTag2;
    }

    public static int computeSizeInt64List(int i, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z10) {
            return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + AbstractC4029l.computeTagSize(i);
        }
        return (AbstractC4029l.computeTagSize(i) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K)) {
            int iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += AbstractC4029l.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeInt64SizeNoTag;
        }
        K k10 = (K) list;
        int iComputeInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeInt64SizeNoTag2 += AbstractC4029l.computeInt64SizeNoTag(k10.getLong(i));
            i++;
        }
        return iComputeInt64SizeNoTag2;
    }

    public static int computeSizeMessage(int i, Object obj, n0 n0Var) {
        return obj instanceof G ? AbstractC4029l.computeLazyFieldSize(i, (G) obj) : AbstractC4029l.computeMessageSize(i, (U) obj, n0Var);
    }

    public static int computeSizeMessageList(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC4029l.computeTagSize(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            iComputeTagSize = (obj instanceof G ? AbstractC4029l.computeLazyFieldSizeNoTag((G) obj) : AbstractC4029l.computeMessageSizeNoTag((U) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeSInt32ListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof A)) {
            int iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += AbstractC4029l.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeSInt32SizeNoTag;
        }
        A a10 = (A) list;
        int iComputeSInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt32SizeNoTag2 += AbstractC4029l.computeSInt32SizeNoTag(a10.getInt(i));
            i++;
        }
        return iComputeSInt32SizeNoTag2;
    }

    public static int computeSizeSInt64List(int i, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeSInt64ListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K)) {
            int iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += AbstractC4029l.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeSInt64SizeNoTag;
        }
        K k10 = (K) list;
        int iComputeSInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeSInt64SizeNoTag2 += AbstractC4029l.computeSInt64SizeNoTag(k10.getLong(i));
            i++;
        }
        return iComputeSInt64SizeNoTag2;
    }

    public static int computeSizeStringList(int i, List<?> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC4029l.computeTagSize(i) * size;
        if (!(list instanceof I)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iComputeTagSize = (obj instanceof AbstractC4026i ? AbstractC4029l.computeBytesSizeNoTag((AbstractC4026i) obj) : AbstractC4029l.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i10++;
            }
            return iComputeTagSize;
        }
        I i11 = (I) list;
        while (i10 < size) {
            Object raw = i11.getRaw(i10);
            iComputeTagSize = (raw instanceof AbstractC4026i ? AbstractC4029l.computeBytesSizeNoTag((AbstractC4026i) raw) : AbstractC4029l.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
            i10++;
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeUInt32ListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof A)) {
            int iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += AbstractC4029l.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
            return iComputeUInt32SizeNoTag;
        }
        A a10 = (A) list;
        int iComputeUInt32SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt32SizeNoTag2 += AbstractC4029l.computeUInt32SizeNoTag(a10.getInt(i));
            i++;
        }
        return iComputeUInt32SizeNoTag2;
    }

    public static int computeSizeUInt64List(int i, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!z10) {
            return (AbstractC4029l.computeTagSize(i) * size) + iComputeSizeUInt64ListNoTag;
        }
        return AbstractC4029l.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + AbstractC4029l.computeTagSize(i);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof K)) {
            int iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += AbstractC4029l.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
            return iComputeUInt64SizeNoTag;
        }
        K k10 = (K) list;
        int iComputeUInt64SizeNoTag2 = 0;
        while (i < size) {
            iComputeUInt64SizeNoTag2 += AbstractC4029l.computeUInt64SizeNoTag(k10.getLong(i));
            i++;
        }
        return iComputeUInt64SizeNoTag2;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, B.d<?> dVar, UB ub, u0<UT, UB> u0Var) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.findValueByNumber(iIntValue) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, u0Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Integer num = list.get(i11);
            int iIntValue2 = num.intValue();
            if (dVar.findValueByNumber(iIntValue2) != null) {
                if (i11 != i10) {
                    list.set(i10, num);
                }
                i10++;
            } else {
                ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, u0Var);
            }
        }
        if (i10 != size) {
            list.subList(i10, size).clear();
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return y0.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static u0<?, ?> getUnknownFieldSetSchema(boolean z10) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (u0) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends C4038v.c<FT>> void mergeExtensions(r<FT> rVar, T t10, T t11) {
        C4038v<T> extensions = rVar.getExtensions(t11);
        if (extensions.isEmpty()) {
            return;
        }
        rVar.getMutableExtensions(t10).mergeFrom(extensions);
    }

    public static <T> void mergeMap(O o10, T t10, T t11, long j4) {
        y0.putObject(t10, j4, o10.mergeFrom(y0.getObject(t10, j4), y0.getObject(t11, j4)));
    }

    public static <T, UT, UB> void mergeUnknownFields(u0<UT, UB> u0Var, T t10, T t11) {
        u0Var.setToMessage(t10, u0Var.merge(u0Var.getFromMessage(t10), u0Var.getFromMessage(t11)));
    }

    public static u0<?, ?> proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static u0<?, ?> proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC4042z.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean shouldUseTableSwitch(int i, int i10, int i11) {
        if (i10 < 40) {
            return true;
        }
        long j4 = i10 - i;
        long j10 = i11;
        return j4 + 10 <= ((j10 + 3) * 3) + ((2 * j10) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i10, UB ub, u0<UT, UB> u0Var) {
        if (ub == null) {
            ub = u0Var.getBuilderFromMessage(obj);
        }
        u0Var.addVarint(ub, i, i10);
        return ub;
    }

    public static String toCamelCase(String str, boolean z10) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z10 = true;
                } else if (i != 0 || z10) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z10) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z10 = false;
        }
        return sb.toString();
    }

    public static u0<?, ?> unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i, boolean z10, B0 b02) throws IOException {
        if (z10) {
            b02.writeBool(i, true);
        }
    }

    public static void writeBoolList(int i, List<Boolean> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeBoolList(i, list, z10);
    }

    public static void writeBytes(int i, AbstractC4026i abstractC4026i, B0 b02) throws IOException {
        if (abstractC4026i == null || abstractC4026i.isEmpty()) {
            return;
        }
        b02.writeBytes(i, abstractC4026i);
    }

    public static void writeBytesList(int i, List<AbstractC4026i> list, B0 b02) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeBytesList(i, list);
    }

    public static void writeDouble(int i, double d10, B0 b02) throws IOException {
        if (Double.doubleToRawLongBits(d10) != 0) {
            b02.writeDouble(i, d10);
        }
    }

    public static void writeDoubleList(int i, List<Double> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeDoubleList(i, list, z10);
    }

    public static void writeEnum(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeEnum(i, i10);
        }
    }

    public static void writeEnumList(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeEnumList(i, list, z10);
    }

    public static void writeFixed32(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeFixed32(i, i10);
        }
    }

    public static void writeFixed32List(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeFixed32List(i, list, z10);
    }

    public static void writeFixed64(int i, long j4, B0 b02) throws IOException {
        if (j4 != 0) {
            b02.writeFixed64(i, j4);
        }
    }

    public static void writeFixed64List(int i, List<Long> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeFixed64List(i, list, z10);
    }

    public static void writeFloat(int i, float f10, B0 b02) throws IOException {
        if (Float.floatToRawIntBits(f10) != 0) {
            b02.writeFloat(i, f10);
        }
    }

    public static void writeFloatList(int i, List<Float> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeFloatList(i, list, z10);
    }

    public static void writeGroupList(int i, List<?> list, B0 b02) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeGroupList(i, list);
    }

    public static void writeInt32(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeInt32(i, i10);
        }
    }

    public static void writeInt32List(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeInt32List(i, list, z10);
    }

    public static void writeInt64(int i, long j4, B0 b02) throws IOException {
        if (j4 != 0) {
            b02.writeInt64(i, j4);
        }
    }

    public static void writeInt64List(int i, List<Long> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeInt64List(i, list, z10);
    }

    public static void writeLazyFieldList(int i, List<?> list, B0 b02) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((G) it.next()).writeTo(b02, i);
        }
    }

    public static void writeMessage(int i, Object obj, B0 b02) throws IOException {
        if (obj != null) {
            b02.writeMessage(i, obj);
        }
    }

    public static void writeMessageList(int i, List<?> list, B0 b02) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeMessageList(i, list);
    }

    public static void writeSFixed32(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeSFixed32(i, i10);
        }
    }

    public static void writeSFixed32List(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeSFixed32List(i, list, z10);
    }

    public static void writeSFixed64(int i, long j4, B0 b02) throws IOException {
        if (j4 != 0) {
            b02.writeSFixed64(i, j4);
        }
    }

    public static void writeSFixed64List(int i, List<Long> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeSFixed64List(i, list, z10);
    }

    public static void writeSInt32(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeSInt32(i, i10);
        }
    }

    public static void writeSInt32List(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeSInt32List(i, list, z10);
    }

    public static void writeSInt64(int i, long j4, B0 b02) throws IOException {
        if (j4 != 0) {
            b02.writeSInt64(i, j4);
        }
    }

    public static void writeSInt64List(int i, List<Long> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeSInt64List(i, list, z10);
    }

    public static void writeString(int i, Object obj, B0 b02) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i, (String) obj, b02);
        } else {
            writeBytes(i, (AbstractC4026i) obj, b02);
        }
    }

    private static void writeStringInternal(int i, String str, B0 b02) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        b02.writeString(i, str);
    }

    public static void writeStringList(int i, List<String> list, B0 b02) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeStringList(i, list);
    }

    public static void writeUInt32(int i, int i10, B0 b02) throws IOException {
        if (i10 != 0) {
            b02.writeUInt32(i, i10);
        }
    }

    public static void writeUInt32List(int i, List<Integer> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeUInt32List(i, list, z10);
    }

    public static void writeUInt64(int i, long j4, B0 b02) throws IOException {
        if (j4 != 0) {
            b02.writeUInt64(i, j4);
        }
    }

    public static void writeUInt64List(int i, List<Long> list, B0 b02, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeUInt64List(i, list, z10);
    }

    public static boolean shouldUseTableSwitch(C4037u[] c4037uArr) {
        if (c4037uArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(c4037uArr[0].getFieldNumber(), c4037uArr[c4037uArr.length - 1].getFieldNumber(), c4037uArr.length);
    }

    public static int computeSizeGroupList(int i, List<U> list, n0 n0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iComputeGroupSize += AbstractC4029l.computeGroupSize(i, list.get(i10), n0Var);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i, List<?> list, B0 b02, n0 n0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeGroupList(i, list, n0Var);
    }

    public static void writeMessageList(int i, List<?> list, B0 b02, n0 n0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        b02.writeMessageList(i, list, n0Var);
    }

    public static int computeSizeMessageList(int i, List<?> list, n0 n0Var) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = AbstractC4029l.computeTagSize(i) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof G) {
                iComputeMessageSizeNoTag = AbstractC4029l.computeLazyFieldSizeNoTag((G) obj);
            } else {
                iComputeMessageSizeNoTag = AbstractC4029l.computeMessageSizeNoTag((U) obj, n0Var);
            }
            iComputeTagSize = iComputeMessageSizeNoTag + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, B.e eVar, UB ub, u0<UT, UB> u0Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int iIntValue = num.intValue();
                if (eVar.isInRange(iIntValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, u0Var);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
            return ub;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            if (!eVar.isInRange(iIntValue2)) {
                ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, u0Var);
                it.remove();
            }
        }
        return ub;
    }
}
