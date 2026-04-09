package com.google.protobuf;

import com.google.protobuf.B0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes2.dex */
public final class v0 {
    private static final v0 DEFAULT_INSTANCE = new v0(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private v0() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.tags;
        if (i > iArr.length) {
            int i10 = this.count;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i) {
                i = i11;
            }
            if (i < 8) {
                i = 8;
            }
            this.tags = Arrays.copyOf(iArr, i);
            this.objects = Arrays.copyOf(this.objects, i);
        }
    }

    public static v0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i) {
        int i10 = 17;
        for (int i11 = 0; i11 < i; i11++) {
            i10 = (i10 * 31) + iArr[i11];
        }
        return i10;
    }

    private v0 mergeFrom(AbstractC4027j abstractC4027j) throws IOException {
        int tag;
        do {
            tag = abstractC4027j.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, abstractC4027j));
        return this;
    }

    public static v0 mutableCopyOf(v0 v0Var, v0 v0Var2) {
        int i = v0Var.count + v0Var2.count;
        int[] iArrCopyOf = Arrays.copyOf(v0Var.tags, i);
        System.arraycopy(v0Var2.tags, 0, iArrCopyOf, v0Var.count, v0Var2.count);
        Object[] objArrCopyOf = Arrays.copyOf(v0Var.objects, i);
        System.arraycopy(v0Var2.objects, 0, objArrCopyOf, v0Var.count, v0Var2.count);
        return new v0(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static v0 newInstance() {
        return new v0();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (!objArr[i10].equals(objArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
        for (int i10 = 0; i10 < i; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i, Object obj, B0 b02) throws IOException {
        int tagFieldNumber = A0.getTagFieldNumber(i);
        int tagWireType = A0.getTagWireType(i);
        if (tagWireType == 0) {
            b02.writeInt64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            b02.writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            b02.writeBytes(tagFieldNumber, (AbstractC4026i) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(C.invalidWireType());
            }
            b02.writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
        } else if (b02.fieldOrder() == B0.a.ASCENDING) {
            b02.writeStartGroup(tagFieldNumber);
            ((v0) obj).writeTo(b02);
            b02.writeEndGroup(tagFieldNumber);
        } else {
            b02.writeEndGroup(tagFieldNumber);
            ((v0) obj).writeTo(b02);
            b02.writeStartGroup(tagFieldNumber);
        }
    }

    public void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        int i = this.count;
        return i == v0Var.count && tagsEquals(this.tags, v0Var.tags, i) && objectsEquals(this.objects, v0Var.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int serializedSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = A0.getTagFieldNumber(i11);
            int tagWireType = A0.getTagWireType(i11);
            if (tagWireType == 0) {
                iComputeUInt64Size = AbstractC4029l.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = AbstractC4029l.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 2) {
                iComputeUInt64Size = AbstractC4029l.computeBytesSize(tagFieldNumber, (AbstractC4026i) this.objects[i10]);
            } else if (tagWireType == 3) {
                serializedSize = ((v0) this.objects[i10]).getSerializedSize() + (AbstractC4029l.computeTagSize(tagFieldNumber) * 2) + serializedSize;
            } else {
                if (tagWireType != 5) {
                    throw new IllegalStateException(C.invalidWireType());
                }
                iComputeUInt64Size = AbstractC4029l.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.memoizedSerializedSize = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            iComputeRawMessageSetExtensionSize += AbstractC4029l.computeRawMessageSetExtensionSize(A0.getTagFieldNumber(this.tags[i10]), (AbstractC4026i) this.objects[i10]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean mergeFieldFrom(int i, AbstractC4027j abstractC4027j) throws IOException {
        checkMutable();
        int tagFieldNumber = A0.getTagFieldNumber(i);
        int tagWireType = A0.getTagWireType(i);
        if (tagWireType == 0) {
            storeField(i, Long.valueOf(abstractC4027j.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i, Long.valueOf(abstractC4027j.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i, abstractC4027j.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            v0 v0Var = new v0();
            v0Var.mergeFrom(abstractC4027j);
            abstractC4027j.checkLastTagWas(A0.makeTag(tagFieldNumber, 4));
            storeField(i, v0Var);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw C.invalidWireType();
        }
        storeField(i, Integer.valueOf(abstractC4027j.readFixed32()));
        return true;
    }

    public v0 mergeLengthDelimitedField(int i, AbstractC4026i abstractC4026i) {
        checkMutable();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(A0.makeTag(i, 2), abstractC4026i);
        return this;
    }

    public v0 mergeVarintField(int i, int i10) {
        checkMutable();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(A0.makeTag(i, 0), Long.valueOf(i10));
        return this;
    }

    public final void printWithIndent(StringBuilder sb, int i) {
        for (int i10 = 0; i10 < this.count; i10++) {
            W.printField(sb, i, String.valueOf(A0.getTagFieldNumber(this.tags[i10])), this.objects[i10]);
        }
    }

    public void storeField(int i, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i10 = this.count;
        iArr[i10] = i;
        this.objects[i10] = obj;
        this.count = i10 + 1;
    }

    public void writeAsMessageSetTo(AbstractC4029l abstractC4029l) throws IOException {
        for (int i = 0; i < this.count; i++) {
            abstractC4029l.writeRawMessageSetExtension(A0.getTagFieldNumber(this.tags[i]), (AbstractC4026i) this.objects[i]);
        }
    }

    public void writeTo(AbstractC4029l abstractC4029l) throws IOException {
        for (int i = 0; i < this.count; i++) {
            int i10 = this.tags[i];
            int tagFieldNumber = A0.getTagFieldNumber(i10);
            int tagWireType = A0.getTagWireType(i10);
            if (tagWireType == 0) {
                abstractC4029l.writeUInt64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                abstractC4029l.writeFixed64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                abstractC4029l.writeBytes(tagFieldNumber, (AbstractC4026i) this.objects[i]);
            } else if (tagWireType == 3) {
                abstractC4029l.writeTag(tagFieldNumber, 3);
                ((v0) this.objects[i]).writeTo(abstractC4029l);
                abstractC4029l.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw C.invalidWireType();
                }
                abstractC4029l.writeFixed32(tagFieldNumber, ((Integer) this.objects[i]).intValue());
            }
        }
    }

    private v0(int i, int[] iArr, Object[] objArr, boolean z10) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z10;
    }

    private static int hashCode(Object[] objArr, int i) {
        int iHashCode = 17;
        for (int i10 = 0; i10 < i; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i = this.count;
        return ((((527 + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    public v0 mergeFrom(v0 v0Var) {
        if (v0Var.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + v0Var.count;
        ensureCapacity(i);
        System.arraycopy(v0Var.tags, 0, this.tags, this.count, v0Var.count);
        System.arraycopy(v0Var.objects, 0, this.objects, this.count, v0Var.count);
        this.count = i;
        return this;
    }

    public void writeAsMessageSetTo(B0 b02) throws IOException {
        if (b02.fieldOrder() == B0.a.DESCENDING) {
            for (int i = this.count - 1; i >= 0; i--) {
                b02.writeMessageSetItem(A0.getTagFieldNumber(this.tags[i]), this.objects[i]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            b02.writeMessageSetItem(A0.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
        }
    }

    public void writeTo(B0 b02) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (b02.fieldOrder() == B0.a.ASCENDING) {
            for (int i = 0; i < this.count; i++) {
                writeField(this.tags[i], this.objects[i], b02);
            }
            return;
        }
        for (int i10 = this.count - 1; i10 >= 0; i10--) {
            writeField(this.tags[i10], this.objects[i10], b02);
        }
    }
}
