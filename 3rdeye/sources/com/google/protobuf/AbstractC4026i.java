package com.google.protobuf;

import N7.B8;
import N7.H7;
import g0.C4356c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* compiled from: ByteString.java */
/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4026i implements Iterable<Byte>, Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final AbstractC4026i EMPTY = new j(B.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final Comparator<AbstractC4026i> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final f byteArrayCopier;
    private int hash = 0;

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$a */
    public class a extends c {
        private final int limit;
        private int position = 0;

        public a() {
            this.limit = AbstractC4026i.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        @Override // com.google.protobuf.AbstractC4026i.c, com.google.protobuf.AbstractC4026i.g
        public byte nextByte() {
            int i = this.position;
            if (i >= this.limit) {
                throw new NoSuchElementException();
            }
            this.position = i + 1;
            return AbstractC4026i.this.internalByteAt(i);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$b */
    public class b implements Comparator<AbstractC4026i> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.i$g, java.util.Iterator] */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.i$g, java.util.Iterator] */
        @Override // java.util.Comparator
        public int compare(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
            ?? Iterator2 = abstractC4026i.iterator2();
            ?? Iterator22 = abstractC4026i2.iterator2();
            while (Iterator2.hasNext() && Iterator22.hasNext()) {
                int iCompareTo = Integer.valueOf(AbstractC4026i.toInt(Iterator2.nextByte())).compareTo(Integer.valueOf(AbstractC4026i.toInt(Iterator22.nextByte())));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            return Integer.valueOf(abstractC4026i.size()).compareTo(Integer.valueOf(abstractC4026i2.size()));
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$c */
    public static abstract class c implements g {
        @Override // com.google.protobuf.AbstractC4026i.g
        public abstract /* synthetic */ byte nextByte();

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$d */
    public static final class d implements f {
        private d() {
        }

        @Override // com.google.protobuf.AbstractC4026i.f
        public byte[] copyFrom(byte[] bArr, int i, int i10) {
            return Arrays.copyOfRange(bArr, i, i10 + i);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$e */
    public static final class e extends j {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        public e(byte[] bArr, int i, int i10) {
            super(bArr);
            AbstractC4026i.checkRange(i, i + i10, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i10;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.AbstractC4026i.j, com.google.protobuf.AbstractC4026i
        public byte byteAt(int i) {
            AbstractC4026i.checkIndex(i, size());
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.AbstractC4026i.j, com.google.protobuf.AbstractC4026i
        public void copyToInternal(byte[] bArr, int i, int i10, int i11) {
            System.arraycopy(this.bytes, getOffsetIntoBytes() + i, bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4026i.j
        public int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.AbstractC4026i.j, com.google.protobuf.AbstractC4026i
        public byte internalByteAt(int i) {
            return this.bytes[this.bytesOffset + i];
        }

        @Override // com.google.protobuf.AbstractC4026i.j, com.google.protobuf.AbstractC4026i
        public int size() {
            return this.bytesLength;
        }

        public Object writeReplace() {
            return AbstractC4026i.wrap(toByteArray());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$f */
    public interface f {
        byte[] copyFrom(byte[] bArr, int i, int i10);
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$g */
    public interface g extends Iterator<Byte> {
        byte nextByte();
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$h */
    public static final class h {
        private final byte[] buffer;
        private final AbstractC4029l output;

        public /* synthetic */ h(int i, a aVar) {
            this(i);
        }

        public AbstractC4026i build() {
            this.output.checkNoSpaceLeft();
            return new j(this.buffer);
        }

        public AbstractC4029l getCodedOutput() {
            return this.output;
        }

        private h(int i) {
            byte[] bArr = new byte[i];
            this.buffer = bArr;
            this.output = AbstractC4029l.newInstance(bArr);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$i, reason: collision with other inner class name */
    public static abstract class AbstractC0357i extends AbstractC4026i {
        public abstract boolean equalsRange(AbstractC4026i abstractC4026i, int i, int i10);

        @Override // com.google.protobuf.AbstractC4026i
        public final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final boolean isBalanced() {
            return true;
        }

        @Override // com.google.protobuf.AbstractC4026i, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.AbstractC4026i
        public void writeToReverse(AbstractC4025h abstractC4025h) throws IOException {
            writeTo(abstractC4025h);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$j */
    public static class j extends AbstractC0357i {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        public j(byte[] bArr) {
            bArr.getClass();
            this.bytes = bArr;
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final ByteBuffer asReadOnlyByteBuffer() {
            return ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final List<ByteBuffer> asReadOnlyByteBufferList() {
            return Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.AbstractC4026i
        public byte byteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final void copyTo(ByteBuffer byteBuffer) {
            byteBuffer.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.AbstractC4026i
        public void copyToInternal(byte[] bArr, int i, int i10, int i11) {
            System.arraycopy(this.bytes, i, bArr, i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC4026i) || size() != ((AbstractC4026i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int iPeekCachedHashCode = peekCachedHashCode();
            int iPeekCachedHashCode2 = jVar.peekCachedHashCode();
            if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                return equalsRange(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.AbstractC4026i.AbstractC0357i
        public final boolean equalsRange(AbstractC4026i abstractC4026i, int i, int i10) {
            if (i10 > abstractC4026i.size()) {
                throw new IllegalArgumentException("Length too large: " + i10 + size());
            }
            int i11 = i + i10;
            if (i11 > abstractC4026i.size()) {
                StringBuilder sbI = androidx.work.s.i("Ran off end of other: ", i, ", ", i10, ", ");
                sbI.append(abstractC4026i.size());
                throw new IllegalArgumentException(sbI.toString());
            }
            if (!(abstractC4026i instanceof j)) {
                return abstractC4026i.substring(i, i11).equals(substring(0, i10));
            }
            j jVar = (j) abstractC4026i;
            byte[] bArr = this.bytes;
            byte[] bArr2 = jVar.bytes;
            int offsetIntoBytes = getOffsetIntoBytes() + i10;
            int offsetIntoBytes2 = getOffsetIntoBytes();
            int offsetIntoBytes3 = jVar.getOffsetIntoBytes() + i;
            while (offsetIntoBytes2 < offsetIntoBytes) {
                if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                    return false;
                }
                offsetIntoBytes2++;
                offsetIntoBytes3++;
            }
            return true;
        }

        public int getOffsetIntoBytes() {
            return 0;
        }

        @Override // com.google.protobuf.AbstractC4026i
        public byte internalByteAt(int i) {
            return this.bytes[i];
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return z0.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final AbstractC4027j newCodedInput() {
            return AbstractC4027j.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final InputStream newInput() {
            return new ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final int partialHash(int i, int i10, int i11) {
            return B.partialHash(i, this.bytes, getOffsetIntoBytes() + i10, i11);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final int partialIsValidUtf8(int i, int i10, int i11) {
            int offsetIntoBytes = getOffsetIntoBytes() + i10;
            return z0.partialIsValidUtf8(i, this.bytes, offsetIntoBytes, i11 + offsetIntoBytes);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final AbstractC4026i substring(int i, int i10) {
            int iCheckRange = AbstractC4026i.checkRange(i, i10, size());
            return iCheckRange == 0 ? AbstractC4026i.EMPTY : new e(this.bytes, getOffsetIntoBytes() + i, iCheckRange);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final String toStringInternal(Charset charset) {
            return new String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final void writeTo(OutputStream outputStream) throws IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final void writeToInternal(OutputStream outputStream, int i, int i10) throws IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + i, i10);
        }

        @Override // com.google.protobuf.AbstractC4026i
        public final void writeTo(AbstractC4025h abstractC4025h) throws IOException {
            abstractC4025h.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$l */
    public static final class l implements f {
        private l() {
        }

        @Override // com.google.protobuf.AbstractC4026i.f
        public byte[] copyFrom(byte[] bArr, int i, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i, bArr2, 0, i10);
            return bArr2;
        }

        public /* synthetic */ l(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        byteArrayCopier = C4021d.isOnAndroidDevice() ? new l(aVar) : new d(aVar);
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new b();
    }

    private static AbstractC4026i balancedConcat(Iterator<AbstractC4026i> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(C4356c.i(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return it.next();
        }
        int i10 = i >>> 1;
        return balancedConcat(it, i10).concat(balancedConcat(it, i - i10));
    }

    public static void checkIndex(int i, int i10) {
        if (((i10 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(H7.n(i, i10, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(C4356c.h(i, "Index < 0: "));
        }
    }

    public static int checkRange(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C4356c.i(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(H7.n(i10, i11, "End index: ", " >= "));
    }

    public static AbstractC4026i copyFrom(byte[] bArr, int i, int i10) {
        checkRange(i, i + i10, bArr.length);
        return new j(byteArrayCopier.copyFrom(bArr, i, i10));
    }

    public static AbstractC4026i copyFromUtf8(String str) {
        return new j(str.getBytes(B.UTF_8));
    }

    public static final AbstractC4026i empty() {
        return EMPTY;
    }

    private static int extractHexDigit(String str, int i) {
        int iHexDigit = hexDigit(str.charAt(i));
        if (iHexDigit != -1) {
            return iHexDigit;
        }
        StringBuilder sbK = B8.k("Invalid hexString ", str, " must only contain [0-9a-fA-F] but contained ");
        sbK.append(str.charAt(i));
        sbK.append(" at index ");
        sbK.append(i);
        throw new NumberFormatException(sbK.toString());
    }

    public static AbstractC4026i fromHex(String str) {
        if (str.length() % 2 != 0) {
            StringBuilder sbK = B8.k("Invalid hexString ", str, " of length ");
            sbK.append(str.length());
            sbK.append(" must be even.");
            throw new NumberFormatException(sbK.toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i * 2;
            bArr[i] = (byte) (extractHexDigit(str, i10 + 1) | (extractHexDigit(str, i10) << 4));
        }
        return new j(bArr);
    }

    private static int hexDigit(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        if (c10 < 'a' || c10 > 'f') {
            return -1;
        }
        return c10 - 'W';
    }

    public static h newCodedBuilder(int i) {
        return new h(i, null);
    }

    public static k newOutput(int i) {
        return new k(i);
    }

    private static AbstractC4026i readChunk(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i10 = 0;
        while (i10 < i) {
            int i11 = inputStream.read(bArr, i10, i - i10);
            if (i11 == -1) {
                break;
            }
            i10 += i11;
        }
        if (i10 == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i10);
    }

    public static AbstractC4026i readFrom(InputStream inputStream) throws IOException {
        return readFrom(inputStream, MIN_READ_FROM_CHUNK_SIZE, MAX_READ_FROM_CHUNK_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte b10) {
        return b10 & 255;
    }

    private String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return s0.escapeBytes(this);
        }
        return s0.escapeBytes(substring(0, 47)) + "...";
    }

    public static Comparator<AbstractC4026i> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public static AbstractC4026i wrap(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new c0(byteBuffer);
        }
        return wrap(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public final AbstractC4026i concat(AbstractC4026i abstractC4026i) {
        if (Integer.MAX_VALUE - size() >= abstractC4026i.size()) {
            return m0.concatenate(this, abstractC4026i);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + abstractC4026i.size());
    }

    public abstract void copyTo(ByteBuffer byteBuffer);

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public abstract void copyToInternal(byte[] bArr, int i, int i10, int i11);

    public final boolean endsWith(AbstractC4026i abstractC4026i) {
        return size() >= abstractC4026i.size() && substring(size() - abstractC4026i.size()).equals(abstractC4026i);
    }

    public abstract boolean equals(Object obj);

    public abstract int getTreeDepth();

    public final int hashCode() {
        int iPartialHash = this.hash;
        if (iPartialHash == 0) {
            int size = size();
            iPartialHash = partialHash(size, 0, size);
            if (iPartialHash == 0) {
                iPartialHash = 1;
            }
            this.hash = iPartialHash;
        }
        return iPartialHash;
    }

    public abstract byte internalByteAt(int i);

    public abstract boolean isBalanced();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    public abstract AbstractC4027j newCodedInput();

    public abstract InputStream newInput();

    public abstract int partialHash(int i, int i10, int i11);

    public abstract int partialIsValidUtf8(int i, int i10, int i11);

    public final int peekCachedHashCode() {
        return this.hash;
    }

    public abstract int size();

    public final boolean startsWith(AbstractC4026i abstractC4026i) {
        return size() >= abstractC4026i.size() && substring(0, abstractC4026i.size()).equals(abstractC4026i);
    }

    public final AbstractC4026i substring(int i) {
        return substring(i, size());
    }

    public abstract AbstractC4026i substring(int i, int i10);

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return B.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e4) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e4);
            throw unsupportedEncodingException;
        }
    }

    public abstract String toStringInternal(Charset charset);

    public final String toStringUtf8() {
        return toString(B.UTF_8);
    }

    public abstract void writeTo(AbstractC4025h abstractC4025h) throws IOException;

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public final void writeTo(OutputStream outputStream, int i, int i10) throws IOException {
        checkRange(i, i + i10, size());
        if (i10 > 0) {
            writeToInternal(outputStream, i, i10);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i, int i10) throws IOException;

    public abstract void writeToReverse(AbstractC4025h abstractC4025h) throws IOException;

    public static k newOutput() {
        return new k(128);
    }

    public static AbstractC4026i readFrom(InputStream inputStream, int i) throws IOException {
        return readFrom(inputStream, i, i);
    }

    @Deprecated
    public final void copyTo(byte[] bArr, int i, int i10, int i11) {
        checkRange(i, i + i11, size());
        checkRange(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            copyToInternal(bArr, i, i10, i11);
        }
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    public static AbstractC4026i copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static AbstractC4026i readFrom(InputStream inputStream, int i, int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            AbstractC4026i chunk = readChunk(inputStream, i);
            if (chunk == null) {
                return copyFrom(arrayList);
            }
            arrayList.add(chunk);
            i = Math.min(i * 2, i10);
        }
    }

    /* compiled from: ByteString.java */
    /* renamed from: com.google.protobuf.i$k */
    public static final class k extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<AbstractC4026i> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public k(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i];
        }

        private byte[] copyArray(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private void flushFullBuffer(int i) {
            this.flushedBuffers.add(new j(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new j(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new j(copyArray(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized AbstractC4026i toByteString() {
            flushLastBuffer();
            return AbstractC4026i.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.bufferPos == this.buffer.length) {
                    flushFullBuffer(1);
                }
                byte[] bArr = this.buffer;
                int i10 = this.bufferPos;
                this.bufferPos = i10 + 1;
                bArr[i10] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            AbstractC4026i[] abstractC4026iArr;
            byte[] bArr;
            int i;
            synchronized (this) {
                ArrayList<AbstractC4026i> arrayList = this.flushedBuffers;
                abstractC4026iArr = (AbstractC4026i[]) arrayList.toArray(new AbstractC4026i[arrayList.size()]);
                bArr = this.buffer;
                i = this.bufferPos;
            }
            for (AbstractC4026i abstractC4026i : abstractC4026iArr) {
                abstractC4026i.writeTo(outputStream);
            }
            outputStream.write(copyArray(bArr, i));
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i10) {
            try {
                byte[] bArr2 = this.buffer;
                int length = bArr2.length;
                int i11 = this.bufferPos;
                if (i10 <= length - i11) {
                    System.arraycopy(bArr, i, bArr2, i11, i10);
                    this.bufferPos += i10;
                } else {
                    int length2 = bArr2.length - i11;
                    System.arraycopy(bArr, i, bArr2, i11, length2);
                    int i12 = i10 - length2;
                    flushFullBuffer(i12);
                    System.arraycopy(bArr, i + length2, this.buffer, 0, i12);
                    this.bufferPos = i12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static AbstractC4026i copyFrom(ByteBuffer byteBuffer, int i) {
        checkRange(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new j(bArr);
    }

    public static AbstractC4026i wrap(byte[] bArr) {
        return new j(bArr);
    }

    public final String toString(Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public static AbstractC4026i wrap(byte[] bArr, int i, int i10) {
        return new e(bArr, i, i10);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strTruncateAndEscapeForDisplay = truncateAndEscapeForDisplay();
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return B4.f.c(sb, strTruncateAndEscapeForDisplay, "\">");
    }

    public static AbstractC4026i copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static AbstractC4026i copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new j(str.getBytes(str2));
    }

    public static AbstractC4026i copyFrom(String str, Charset charset) {
        return new j(str.getBytes(charset));
    }

    public static AbstractC4026i copyFrom(Iterable<AbstractC4026i> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<AbstractC4026i> it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(iterable.iterator(), size);
    }
}
