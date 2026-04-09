package com.singular.sdk.internal;

import B4.i;
import N7.C1094a9;
import g0.C4356c;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class QueueFile implements Closeable, Iterable<byte[]> {
    static final int INITIAL_LENGTH = 4096;
    private static final int VERSIONED_HEADER = -2147483647;
    private static final byte[] ZEROES = new byte[4096];
    private final byte[] buffer;
    boolean closed;
    int elementCount;
    final File file;
    long fileLength;
    Element first;
    int headerLength;
    private Element last;
    int modCount = 0;
    final RandomAccessFile raf;
    boolean versioned;
    private final boolean zero;

    public static final class Builder {
        final File file;
        boolean zero = true;
        boolean forceLegacy = false;

        public Builder(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.file = file;
        }

        public QueueFile build() throws IOException {
            return new QueueFile(this.file, QueueFile.initializeFromFile(this.file, this.forceLegacy), this.zero, this.forceLegacy);
        }

        public Builder forceLegacy(boolean z10) {
            this.forceLegacy = z10;
            return this;
        }

        public Builder zero(boolean z10) {
            this.zero = z10;
            return this;
        }
    }

    public static class Element {
        static final int HEADER_LENGTH = 4;
        static final Element NULL = new Element(0, 0);
        final int length;
        final long position;

        public Element(long j4, int i) {
            this.position = j4;
            this.length = i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append("[position=");
            sb.append(this.position);
            sb.append(", length=");
            return i.j(sb, this.length, "]");
        }
    }

    public final class ElementIterator implements Iterator<byte[]> {
        int expectedModCount;
        int nextElementIndex = 0;
        private long nextElementPosition;

        public ElementIterator() {
            this.nextElementPosition = QueueFile.this.first.position;
            this.expectedModCount = QueueFile.this.modCount;
        }

        private void checkForComodification() {
            if (QueueFile.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            return this.nextElementIndex != QueueFile.this.elementCount;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.nextElementIndex != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                QueueFile.this.remove();
                this.expectedModCount = QueueFile.this.modCount;
                this.nextElementIndex--;
            } catch (IOException e4) {
                throw new RuntimeException("todo: throw a proper error", e4);
            }
        }

        @Override // java.util.Iterator
        public byte[] next() {
            if (QueueFile.this.closed) {
                throw new IllegalStateException("closed");
            }
            checkForComodification();
            if (QueueFile.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i = this.nextElementIndex;
            QueueFile queueFile = QueueFile.this;
            if (i >= queueFile.elementCount) {
                throw new NoSuchElementException();
            }
            try {
                Element element = queueFile.readElement(this.nextElementPosition);
                byte[] bArr = new byte[element.length];
                long jWrapPosition = QueueFile.this.wrapPosition(element.position + 4);
                this.nextElementPosition = jWrapPosition;
                QueueFile.this.ringRead(jWrapPosition, bArr, 0, element.length);
                this.nextElementPosition = QueueFile.this.wrapPosition(element.position + 4 + element.length);
                this.nextElementIndex++;
                return bArr;
            } catch (IOException e4) {
                throw new RuntimeException("todo: throw a proper error", e4);
            }
        }
    }

    public QueueFile(File file, RandomAccessFile randomAccessFile, boolean z10, boolean z11) throws IOException {
        long j4;
        long j10;
        byte[] bArr = new byte[32];
        this.buffer = bArr;
        this.file = file;
        this.raf = randomAccessFile;
        this.zero = z10;
        randomAccessFile.seek(0L);
        randomAccessFile.readFully(bArr);
        boolean z12 = (z11 || (bArr[0] & 128) == 0) ? false : true;
        this.versioned = z12;
        if (z12) {
            this.headerLength = 32;
            int i = readInt(bArr, 0) & Integer.MAX_VALUE;
            if (i != 1) {
                throw new IOException(C4356c.i(i, "Unable to read version ", " format. Supported versions are 1 and legacy."));
            }
            this.fileLength = readLong(bArr, 4);
            this.elementCount = readInt(bArr, 12);
            j4 = readLong(bArr, 16);
            j10 = readLong(bArr, 24);
        } else {
            this.headerLength = 16;
            this.fileLength = readInt(bArr, 0);
            this.elementCount = readInt(bArr, 4);
            j4 = readInt(bArr, 8);
            j10 = readInt(bArr, 12);
        }
        if (this.fileLength <= randomAccessFile.length()) {
            if (this.fileLength <= this.headerLength) {
                throw new IOException(C1094a9.f(new StringBuilder("File is corrupt; length stored in header ("), this.fileLength, ") is invalid."));
            }
            this.first = readElement(j4);
            this.last = readElement(j10);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.fileLength + ", Actual length: " + randomAccessFile.length());
    }

    private void expandIfNecessary(long j4) throws IOException {
        long j10;
        long j11;
        long j12 = j4 + 4;
        long jRemainingBytes = remainingBytes();
        if (jRemainingBytes >= j12) {
            return;
        }
        long j13 = this.fileLength;
        do {
            jRemainingBytes += j13;
            j13 <<= 1;
        } while (jRemainingBytes < j12);
        setLength(j13);
        long jWrapPosition = wrapPosition(this.last.position + 4 + r3.length);
        if (jWrapPosition <= this.first.position) {
            FileChannel channel = this.raf.getChannel();
            channel.position(this.fileLength);
            int i = this.headerLength;
            j10 = jWrapPosition - i;
            if (channel.transferTo(i, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j10 = 0;
        }
        long j14 = this.last.position;
        long j15 = this.first.position;
        if (j14 < j15) {
            long j16 = (this.fileLength + j14) - this.headerLength;
            writeHeader(j13, this.elementCount, j15, j16);
            this.last = new Element(j16, this.last.length);
            j11 = j13;
        } else {
            writeHeader(j13, this.elementCount, j15, j14);
            j11 = j13;
        }
        this.fileLength = j11;
        if (this.zero) {
            ringErase(this.headerLength, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RandomAccessFile initializeFromFile(File file, boolean z10) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFileOpen = open(file2);
            try {
                randomAccessFileOpen.setLength(4096L);
                randomAccessFileOpen.seek(0L);
                if (z10) {
                    randomAccessFileOpen.writeInt(4096);
                } else {
                    randomAccessFileOpen.writeInt(VERSIONED_HEADER);
                    randomAccessFileOpen.writeLong(4096L);
                }
                randomAccessFileOpen.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFileOpen.close();
                throw th;
            }
        }
        return open(file);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private static int readInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    private static long readLong(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 56) + ((bArr[i + 1] & 255) << 48) + ((bArr[i + 2] & 255) << 40) + ((bArr[i + 3] & 255) << 32) + ((bArr[i + 4] & 255) << 24) + ((bArr[i + 5] & 255) << 16) + ((bArr[i + 6] & 255) << 8) + (bArr[i + 7] & 255);
    }

    private long remainingBytes() {
        return this.fileLength - usedBytes();
    }

    private void ringErase(long j4, long j10) throws IOException {
        long j11 = j4;
        while (j10 > 0) {
            byte[] bArr = ZEROES;
            int iMin = (int) Math.min(j10, bArr.length);
            ringWrite(j11, bArr, 0, iMin);
            long j12 = iMin;
            j10 -= j12;
            j11 += j12;
        }
    }

    private void ringWrite(long j4, byte[] bArr, int i, int i10) throws IOException {
        long jWrapPosition = wrapPosition(j4);
        long j10 = i10 + jWrapPosition;
        long j11 = this.fileLength;
        if (j10 <= j11) {
            this.raf.seek(jWrapPosition);
            this.raf.write(bArr, i, i10);
            return;
        }
        int i11 = (int) (j11 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.write(bArr, i, i11);
        this.raf.seek(this.headerLength);
        this.raf.write(bArr, i + i11, i10 - i11);
    }

    private void setLength(long j4) throws IOException {
        this.raf.setLength(j4);
        this.raf.getChannel().force(true);
    }

    private long usedBytes() {
        if (this.elementCount == 0) {
            return this.headerLength;
        }
        long j4 = this.last.position;
        long j10 = this.first.position;
        return j4 >= j10 ? (j4 - j10) + 4 + r0.length + this.headerLength : (((j4 + 4) + r0.length) + this.fileLength) - j10;
    }

    private void writeHeader(long j4, int i, long j10, long j11) throws IOException {
        this.raf.seek(0L);
        if (!this.versioned) {
            writeInt(this.buffer, 0, (int) j4);
            writeInt(this.buffer, 4, i);
            writeInt(this.buffer, 8, (int) j10);
            writeInt(this.buffer, 12, (int) j11);
            this.raf.write(this.buffer, 0, 16);
            return;
        }
        writeInt(this.buffer, 0, VERSIONED_HEADER);
        writeLong(this.buffer, 4, j4);
        writeInt(this.buffer, 12, i);
        writeLong(this.buffer, 16, j10);
        writeLong(this.buffer, 24, j11);
        this.raf.write(this.buffer, 0, 32);
    }

    private static void writeInt(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    private static void writeLong(byte[] bArr, int i, long j4) {
        bArr[i] = (byte) (j4 >> 56);
        bArr[i + 1] = (byte) (j4 >> 48);
        bArr[i + 2] = (byte) (j4 >> 40);
        bArr[i + 3] = (byte) (j4 >> 32);
        bArr[i + 4] = (byte) (j4 >> 24);
        bArr[i + 5] = (byte) (j4 >> 16);
        bArr[i + 6] = (byte) (j4 >> 8);
        bArr[i + 7] = (byte) j4;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public void clear() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        writeHeader(4096L, 0, 0L, 0L);
        if (this.zero) {
            this.raf.seek(this.headerLength);
            this.raf.write(ZEROES, 0, 4096 - this.headerLength);
        }
        this.elementCount = 0;
        Element element = Element.NULL;
        this.first = element;
        this.last = element;
        if (this.fileLength > 4096) {
            setLength(4096L);
        }
        this.fileLength = 4096L;
        this.modCount++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.raf.close();
    }

    public File file() {
        return this.file;
    }

    public boolean isEmpty() {
        return this.elementCount == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<byte[]> iterator() {
        return new ElementIterator();
    }

    public byte[] peek() throws IOException {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (isEmpty()) {
            return null;
        }
        Element element = this.first;
        int i = element.length;
        if (i <= 32768) {
            byte[] bArr = new byte[i];
            ringRead(4 + element.position, bArr, 0, i);
            return bArr;
        }
        throw new IOException("QueueFile is probably corrupt, first.length is " + this.first.length);
    }

    public Element readElement(long j4) throws IOException {
        if (j4 == 0) {
            return Element.NULL;
        }
        ringRead(j4, this.buffer, 0, 4);
        return new Element(j4, readInt(this.buffer, 0));
    }

    public void remove() throws IOException {
        remove(1);
    }

    public void ringRead(long j4, byte[] bArr, int i, int i10) throws IOException {
        long jWrapPosition = wrapPosition(j4);
        long j10 = i10 + jWrapPosition;
        long j11 = this.fileLength;
        if (j10 <= j11) {
            this.raf.seek(jWrapPosition);
            this.raf.readFully(bArr, i, i10);
            return;
        }
        int i11 = (int) (j11 - jWrapPosition);
        this.raf.seek(jWrapPosition);
        this.raf.readFully(bArr, i, i11);
        this.raf.seek(this.headerLength);
        this.raf.readFully(bArr, i + i11, i10 - i11);
    }

    public int size() {
        return this.elementCount;
    }

    public String toString() {
        return "QueueFile[length=" + this.fileLength + ", size=" + this.elementCount + ", first=" + this.first + ", last=" + this.last + "]";
    }

    public long wrapPosition(long j4) {
        long j10 = this.fileLength;
        return j4 < j10 ? j4 : (this.headerLength + j4) - j10;
    }

    public void add(byte[] bArr, int i, int i10) throws IOException {
        long jWrapPosition;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i | i10) < 0 || i10 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (this.closed) {
            throw new IOException("closed");
        }
        expandIfNecessary(i10);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            jWrapPosition = this.headerLength;
        } else {
            jWrapPosition = wrapPosition(this.last.position + 4 + r1.length);
        }
        Element element = new Element(jWrapPosition, i10);
        writeInt(this.buffer, 0, i10);
        ringWrite(element.position, this.buffer, 0, 4);
        ringWrite(element.position + 4, bArr, i, i10);
        writeHeader(this.fileLength, this.elementCount + 1, zIsEmpty ? element.position : this.first.position, element.position);
        this.last = element;
        this.elementCount++;
        this.modCount++;
        if (zIsEmpty) {
            this.first = element;
        }
    }

    public void remove(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(C4356c.i(i, "Cannot remove negative (", ") number of elements."));
        }
        if (i == 0) {
            return;
        }
        if (i == this.elementCount) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i > this.elementCount) {
            throw new IllegalArgumentException(i.j(C4356c.j(i, "Cannot remove more elements (", ") than present in queue ("), this.elementCount, ")."));
        }
        Element element = this.first;
        long j4 = element.position;
        int i10 = element.length;
        long j10 = 0;
        int i11 = 0;
        long j11 = j4;
        while (i11 < i) {
            j10 += i10 + 4;
            long jWrapPosition = wrapPosition(j11 + 4 + i10);
            ringRead(jWrapPosition, this.buffer, 0, 4);
            i10 = readInt(this.buffer, 0);
            i11++;
            j11 = jWrapPosition;
        }
        writeHeader(this.fileLength, this.elementCount - i, j11, this.last.position);
        this.elementCount -= i;
        this.modCount++;
        this.first = new Element(j11, i10);
        if (this.zero) {
            ringErase(j4, j10);
        }
    }
}
