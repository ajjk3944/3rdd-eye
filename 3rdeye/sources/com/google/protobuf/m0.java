package com.google.protobuf;

import com.google.protobuf.AbstractC4026i;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: RopeByteString.java */
/* loaded from: classes2.dex */
public final class m0 extends AbstractC4026i {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final AbstractC4026i left;
    private final int leftLength;
    private final AbstractC4026i right;
    private final int totalLength;
    private final int treeDepth;

    /* compiled from: RopeByteString.java */
    public class a extends AbstractC4026i.c {
        AbstractC4026i.g current = nextPiece();
        final c pieces;

        public a() {
            this.pieces = new c(m0.this, null);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.i$g] */
        private AbstractC4026i.g nextPiece() {
            if (this.pieces.hasNext()) {
                return this.pieces.next().iterator2();
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current != null;
        }

        @Override // com.google.protobuf.AbstractC4026i.c, com.google.protobuf.AbstractC4026i.g
        public byte nextByte() {
            AbstractC4026i.g gVar = this.current;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte bNextByte = gVar.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return bNextByte;
        }
    }

    /* compiled from: RopeByteString.java */
    public static final class c implements Iterator<AbstractC4026i.AbstractC0357i> {
        private final ArrayDeque<m0> breadCrumbs;
        private AbstractC4026i.AbstractC0357i next;

        public /* synthetic */ c(AbstractC4026i abstractC4026i, a aVar) {
            this(abstractC4026i);
        }

        private AbstractC4026i.AbstractC0357i getLeafByLeft(AbstractC4026i abstractC4026i) {
            while (abstractC4026i instanceof m0) {
                m0 m0Var = (m0) abstractC4026i;
                this.breadCrumbs.push(m0Var);
                abstractC4026i = m0Var.left;
            }
            return (AbstractC4026i.AbstractC0357i) abstractC4026i;
        }

        private AbstractC4026i.AbstractC0357i getNextNonEmptyLeaf() {
            AbstractC4026i.AbstractC0357i leafByLeft;
            do {
                ArrayDeque<m0> arrayDeque = this.breadCrumbs;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                leafByLeft = getLeafByLeft(this.breadCrumbs.pop().right);
            } while (leafByLeft.isEmpty());
            return leafByLeft;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(AbstractC4026i abstractC4026i) {
            if (!(abstractC4026i instanceof m0)) {
                this.breadCrumbs = null;
                this.next = (AbstractC4026i.AbstractC0357i) abstractC4026i;
                return;
            }
            m0 m0Var = (m0) abstractC4026i;
            ArrayDeque<m0> arrayDeque = new ArrayDeque<>(m0Var.getTreeDepth());
            this.breadCrumbs = arrayDeque;
            arrayDeque.push(m0Var);
            this.next = getLeafByLeft(m0Var.left);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public AbstractC4026i.AbstractC0357i next() {
            AbstractC4026i.AbstractC0357i abstractC0357i = this.next;
            if (abstractC0357i == null) {
                throw new NoSuchElementException();
            }
            this.next = getNextNonEmptyLeaf();
            return abstractC0357i;
        }
    }

    public /* synthetic */ m0(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2, a aVar) {
        this(abstractC4026i, abstractC4026i2);
    }

    public static AbstractC4026i concatenate(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
        if (abstractC4026i2.size() == 0) {
            return abstractC4026i;
        }
        if (abstractC4026i.size() == 0) {
            return abstractC4026i2;
        }
        int size = abstractC4026i2.size() + abstractC4026i.size();
        if (size < 128) {
            return concatenateBytes(abstractC4026i, abstractC4026i2);
        }
        if (abstractC4026i instanceof m0) {
            m0 m0Var = (m0) abstractC4026i;
            if (abstractC4026i2.size() + m0Var.right.size() < 128) {
                return new m0(m0Var.left, concatenateBytes(m0Var.right, abstractC4026i2));
            }
            if (m0Var.left.getTreeDepth() > m0Var.right.getTreeDepth() && m0Var.getTreeDepth() > abstractC4026i2.getTreeDepth()) {
                return new m0(m0Var.left, new m0(m0Var.right, abstractC4026i2));
            }
        }
        return size >= minLength(Math.max(abstractC4026i.getTreeDepth(), abstractC4026i2.getTreeDepth()) + 1) ? new m0(abstractC4026i, abstractC4026i2) : new b(null).balance(abstractC4026i, abstractC4026i2);
    }

    private static AbstractC4026i concatenateBytes(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
        int size = abstractC4026i.size();
        int size2 = abstractC4026i2.size();
        byte[] bArr = new byte[size + size2];
        abstractC4026i.copyTo(bArr, 0, 0, size);
        abstractC4026i2.copyTo(bArr, 0, size, size2);
        return AbstractC4026i.wrap(bArr);
    }

    private boolean equalsFragments(AbstractC4026i abstractC4026i) {
        a aVar = null;
        c cVar = new c(this, aVar);
        AbstractC4026i.AbstractC0357i next = cVar.next();
        c cVar2 = new c(abstractC4026i, aVar);
        AbstractC4026i.AbstractC0357i next2 = cVar2.next();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i10;
            int iMin = Math.min(size, size2);
            if (!(i == 0 ? next.equalsRange(next2, i10, iMin) : next2.equalsRange(next, i, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.totalLength;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == size) {
                i = 0;
                next = cVar.next();
            } else {
                i += iMin;
                next = next;
            }
            if (iMin == size2) {
                next2 = cVar2.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
        }
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static m0 newInstanceForTest(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
        return new m0(abstractC4026i, abstractC4026i2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.AbstractC4026i
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public byte byteAt(int i) {
        AbstractC4026i.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void copyToInternal(byte[] bArr, int i, int i10, int i11) {
        int i12 = i + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            this.left.copyToInternal(bArr, i, i10, i11);
        } else {
            if (i >= i13) {
                this.right.copyToInternal(bArr, i - i13, i10, i11);
                return;
            }
            int i14 = i13 - i;
            this.left.copyToInternal(bArr, i, i10, i14);
            this.right.copyToInternal(bArr, 0, i10 + i14, i11 - i14);
        }
    }

    @Override // com.google.protobuf.AbstractC4026i
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4026i)) {
            return false;
        }
        AbstractC4026i abstractC4026i = (AbstractC4026i) obj;
        if (this.totalLength != abstractC4026i.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int iPeekCachedHashCode = peekCachedHashCode();
        int iPeekCachedHashCode2 = abstractC4026i.peekCachedHashCode();
        if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
            return equalsFragments(abstractC4026i);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public byte internalByteAt(int i) {
        int i10 = this.leftLength;
        return i < i10 ? this.left.internalByteAt(i) : this.right.internalByteAt(i - i10);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public boolean isBalanced() {
        return this.totalLength >= minLength(this.treeDepth);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        AbstractC4026i abstractC4026i = this.right;
        return abstractC4026i.partialIsValidUtf8(iPartialIsValidUtf8, 0, abstractC4026i.size()) == 0;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public AbstractC4027j newCodedInput() {
        return AbstractC4027j.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public InputStream newInput() {
        return new d();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int partialHash(int i, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            return this.left.partialHash(i, i10, i11);
        }
        if (i10 >= i13) {
            return this.right.partialHash(i, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.right.partialHash(this.left.partialHash(i, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int partialIsValidUtf8(int i, int i10, int i11) {
        int i12 = i10 + i11;
        int i13 = this.leftLength;
        if (i12 <= i13) {
            return this.left.partialIsValidUtf8(i, i10, i11);
        }
        if (i10 >= i13) {
            return this.right.partialIsValidUtf8(i, i10 - i13, i11);
        }
        int i14 = i13 - i10;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i10, i14), 0, i11 - i14);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.AbstractC4026i
    public AbstractC4026i substring(int i, int i10) {
        int iCheckRange = AbstractC4026i.checkRange(i, i10, this.totalLength);
        if (iCheckRange == 0) {
            return AbstractC4026i.EMPTY;
        }
        if (iCheckRange == this.totalLength) {
            return this;
        }
        int i11 = this.leftLength;
        return i10 <= i11 ? this.left.substring(i, i10) : i >= i11 ? this.right.substring(i - i11, i10 - i11) : new m0(this.left.substring(i), this.right.substring(0, i10 - this.leftLength));
    }

    @Override // com.google.protobuf.AbstractC4026i
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return AbstractC4026i.wrap(toByteArray());
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeToInternal(OutputStream outputStream, int i, int i10) throws IOException {
        int i11 = i + i10;
        int i12 = this.leftLength;
        if (i11 <= i12) {
            this.left.writeToInternal(outputStream, i, i10);
        } else {
            if (i >= i12) {
                this.right.writeToInternal(outputStream, i - i12, i10);
                return;
            }
            int i13 = i12 - i;
            this.left.writeToInternal(outputStream, i, i13);
            this.right.writeToInternal(outputStream, 0, i10 - i13);
        }
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeToReverse(AbstractC4025h abstractC4025h) throws IOException {
        this.right.writeToReverse(abstractC4025h);
        this.left.writeToReverse(abstractC4025h);
    }

    /* compiled from: RopeByteString.java */
    public static class b {
        private final ArrayDeque<AbstractC4026i> prefixesStack;

        private b() {
            this.prefixesStack = new ArrayDeque<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AbstractC4026i balance(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
            doBalance(abstractC4026i);
            doBalance(abstractC4026i2);
            AbstractC4026i abstractC4026iPop = this.prefixesStack.pop();
            while (!this.prefixesStack.isEmpty()) {
                abstractC4026iPop = new m0(this.prefixesStack.pop(), abstractC4026iPop, null);
            }
            return abstractC4026iPop;
        }

        private void doBalance(AbstractC4026i abstractC4026i) {
            if (abstractC4026i.isBalanced()) {
                insert(abstractC4026i);
                return;
            }
            if (!(abstractC4026i instanceof m0)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + abstractC4026i.getClass());
            }
            m0 m0Var = (m0) abstractC4026i;
            doBalance(m0Var.left);
            doBalance(m0Var.right);
        }

        private int getDepthBinForLength(int i) {
            int iBinarySearch = Arrays.binarySearch(m0.minLengthByDepth, i);
            return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
        }

        private void insert(AbstractC4026i abstractC4026i) {
            a aVar;
            int depthBinForLength = getDepthBinForLength(abstractC4026i.size());
            int iMinLength = m0.minLength(depthBinForLength + 1);
            if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength) {
                this.prefixesStack.push(abstractC4026i);
                return;
            }
            int iMinLength2 = m0.minLength(depthBinForLength);
            AbstractC4026i abstractC4026iPop = this.prefixesStack.pop();
            while (true) {
                aVar = null;
                if (this.prefixesStack.isEmpty() || this.prefixesStack.peek().size() >= iMinLength2) {
                    break;
                } else {
                    abstractC4026iPop = new m0(this.prefixesStack.pop(), abstractC4026iPop, aVar);
                }
            }
            m0 m0Var = new m0(abstractC4026iPop, abstractC4026i, aVar);
            while (!this.prefixesStack.isEmpty()) {
                if (this.prefixesStack.peek().size() >= m0.minLength(getDepthBinForLength(m0Var.size()) + 1)) {
                    break;
                } else {
                    m0Var = new m0(this.prefixesStack.pop(), m0Var, aVar);
                }
            }
            this.prefixesStack.push(m0Var);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    private m0(AbstractC4026i abstractC4026i, AbstractC4026i abstractC4026i2) {
        this.left = abstractC4026i;
        this.right = abstractC4026i2;
        int size = abstractC4026i.size();
        this.leftLength = size;
        this.totalLength = abstractC4026i2.size() + size;
        this.treeDepth = Math.max(abstractC4026i.getTreeDepth(), abstractC4026i2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.AbstractC4026i, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new a();
    }

    @Override // com.google.protobuf.AbstractC4026i
    public void writeTo(AbstractC4025h abstractC4025h) throws IOException {
        this.left.writeTo(abstractC4025h);
        this.right.writeTo(abstractC4025h);
    }

    /* compiled from: RopeByteString.java */
    public class d extends InputStream {
        private AbstractC4026i.AbstractC0357i currentPiece;
        private int currentPieceIndex;
        private int currentPieceOffsetInRope;
        private int currentPieceSize;
        private int mark;
        private c pieceIterator;

        public d() {
            initialize();
        }

        private void advanceIfCurrentPieceFullyRead() {
            if (this.currentPiece != null) {
                int i = this.currentPieceIndex;
                int i10 = this.currentPieceSize;
                if (i == i10) {
                    this.currentPieceOffsetInRope += i10;
                    this.currentPieceIndex = 0;
                    if (!this.pieceIterator.hasNext()) {
                        this.currentPiece = null;
                        this.currentPieceSize = 0;
                    } else {
                        AbstractC4026i.AbstractC0357i next = this.pieceIterator.next();
                        this.currentPiece = next;
                        this.currentPieceSize = next.size();
                    }
                }
            }
        }

        private int availableInternal() {
            return m0.this.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
        }

        private void initialize() {
            c cVar = new c(m0.this, null);
            this.pieceIterator = cVar;
            AbstractC4026i.AbstractC0357i next = cVar.next();
            this.currentPiece = next;
            this.currentPieceSize = next.size();
            this.currentPieceIndex = 0;
            this.currentPieceOffsetInRope = 0;
        }

        private int readSkipInternal(byte[] bArr, int i, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                advanceIfCurrentPieceFullyRead();
                if (this.currentPiece == null) {
                    break;
                }
                int iMin = Math.min(this.currentPieceSize - this.currentPieceIndex, i11);
                if (bArr != null) {
                    this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, iMin);
                    i += iMin;
                }
                this.currentPieceIndex += iMin;
                i11 -= iMin;
            }
            return i10 - i11;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return availableInternal();
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i10) {
            bArr.getClass();
            if (i < 0 || i10 < 0 || i10 > bArr.length - i) {
                throw new IndexOutOfBoundsException();
            }
            int skipInternal = readSkipInternal(bArr, i, i10);
            if (skipInternal != 0) {
                return skipInternal;
            }
            if (i10 > 0 || availableInternal() == 0) {
                return -1;
            }
            return skipInternal;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            initialize();
            readSkipInternal(null, 0, this.mark);
        }

        @Override // java.io.InputStream
        public long skip(long j4) {
            if (j4 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j4 > 2147483647L) {
                j4 = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j4);
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            advanceIfCurrentPieceFullyRead();
            AbstractC4026i.AbstractC0357i abstractC0357i = this.currentPiece;
            if (abstractC0357i == null) {
                return -1;
            }
            int i = this.currentPieceIndex;
            this.currentPieceIndex = i + 1;
            return abstractC0357i.byteAt(i) & 255;
        }
    }
}
