package com.google.protobuf;

import com.google.protobuf.AbstractC4016a;
import com.google.protobuf.AbstractC4016a.AbstractC0355a;
import com.google.protobuf.AbstractC4026i;
import com.google.protobuf.U;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: AbstractMessageLite.java */
/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4016a<MessageType extends AbstractC4016a<MessageType, BuilderType>, BuilderType extends AbstractC0355a<MessageType, BuilderType>> implements U {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0355a<MessageType extends AbstractC4016a<MessageType, BuilderType>, BuilderType extends AbstractC0355a<MessageType, BuilderType>> implements U.a {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll((Iterable) iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (T t10 : iterable) {
                if (t10 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t10);
            }
        }

        private String getReadingExceptionMessage(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        public static t0 newUninitializedMessageException(U u8) {
            return new t0(u8);
        }

        @Override // com.google.protobuf.U.a
        public abstract /* synthetic */ U build();

        @Override // com.google.protobuf.U.a
        public abstract /* synthetic */ U buildPartial();

        @Override // com.google.protobuf.U.a
        public abstract /* synthetic */ U.a clear();

        @Override // 
        /* renamed from: clone */
        public abstract BuilderType mo12clone();

        @Override // com.google.protobuf.U.a, com.google.protobuf.V
        public abstract /* synthetic */ U getDefaultInstanceForType();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        @Override // com.google.protobuf.U.a, com.google.protobuf.V
        public abstract /* synthetic */ boolean isInitialized();

        @Override // com.google.protobuf.U.a
        public boolean mergeDelimitedFrom(InputStream inputStream, C4034q c4034q) throws IOException {
            int i = inputStream.read();
            if (i == -1) {
                return false;
            }
            mergeFrom((InputStream) new C0356a(inputStream, AbstractC4027j.readRawVarint32(i, inputStream)), c4034q);
            return true;
        }

        @Override // com.google.protobuf.U.a
        public abstract BuilderType mergeFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException;

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            B.checkNotNull(iterable);
            if (!(iterable instanceof I)) {
                if (iterable instanceof f0) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    addAllCheckingNulls(iterable, list);
                    return;
                }
            }
            List<?> underlyingElements = ((I) iterable).getUnderlyingElements();
            I i = (I) list;
            int size = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (i.size() - size) + " is null.";
                    for (int size2 = i.size() - 1; size2 >= size; size2--) {
                        i.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC4026i) {
                    i.add((AbstractC4026i) obj);
                } else {
                    i.add((I) obj);
                }
            }
        }

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: com.google.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C0356a extends FilterInputStream {
            private int limit;

            public C0356a(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() throws IOException {
                return Math.min(super.available(), this.limit);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.limit <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.limit--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j4) throws IOException {
                int iSkip = (int) super.skip(Math.min(j4, this.limit));
                if (iSkip >= 0) {
                    this.limit -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i10) throws IOException {
                int i11 = this.limit;
                if (i11 <= 0) {
                    return -1;
                }
                int i12 = super.read(bArr, i, Math.min(i10, i11));
                if (i12 >= 0) {
                    this.limit -= i12;
                }
                return i12;
            }
        }

        @Override // com.google.protobuf.U.a
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(AbstractC4027j abstractC4027j) throws IOException {
            return (BuilderType) mergeFrom(abstractC4027j, C4034q.getEmptyRegistry());
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(AbstractC4026i abstractC4026i) throws C {
            try {
                AbstractC4027j abstractC4027jNewCodedInput = abstractC4026i.newCodedInput();
                mergeFrom(abstractC4027jNewCodedInput);
                abstractC4027jNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (C e4) {
                throw e4;
            } catch (IOException e10) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e10);
            }
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(AbstractC4026i abstractC4026i, C4034q c4034q) throws C {
            try {
                AbstractC4027j abstractC4027jNewCodedInput = abstractC4026i.newCodedInput();
                mergeFrom(abstractC4027jNewCodedInput, c4034q);
                abstractC4027jNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (C e4) {
                throw e4;
            } catch (IOException e10) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e10);
            }
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr) throws C {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length);
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr, int i, int i10) throws C {
            try {
                AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(bArr, i, i10);
                mergeFrom(abstractC4027jNewInstance);
                abstractC4027jNewInstance.checkLastTagWas(0);
                return this;
            } catch (C e4) {
                throw e4;
            } catch (IOException e10) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e10);
            }
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr, C4034q c4034q) throws C {
            return (BuilderType) mergeFrom(bArr, 0, bArr.length, c4034q);
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(byte[] bArr, int i, int i10, C4034q c4034q) throws C {
            try {
                AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(bArr, i, i10);
                mergeFrom(abstractC4027jNewInstance, c4034q);
                abstractC4027jNewInstance.checkLastTagWas(0);
                return this;
            } catch (C e4) {
                throw e4;
            } catch (IOException e10) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e10);
            }
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(InputStream inputStream) throws IOException {
            AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(inputStream);
            mergeFrom(abstractC4027jNewInstance);
            abstractC4027jNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(InputStream inputStream, C4034q c4034q) throws IOException {
            AbstractC4027j abstractC4027jNewInstance = AbstractC4027j.newInstance(inputStream);
            mergeFrom(abstractC4027jNewInstance, c4034q);
            abstractC4027jNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // com.google.protobuf.U.a
        public BuilderType mergeFrom(U u8) {
            if (getDefaultInstanceForType().getClass().isInstance(u8)) {
                return (BuilderType) internalMergeFrom((AbstractC4016a) u8);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC0355a.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC4026i abstractC4026i) throws IllegalArgumentException {
        if (!abstractC4026i.isValidUtf8()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.protobuf.U, com.google.protobuf.V
    public abstract /* synthetic */ U getDefaultInstanceForType();

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.U
    public abstract /* synthetic */ e0 getParserForType();

    @Override // com.google.protobuf.U
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(n0 n0Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = n0Var.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // com.google.protobuf.U, com.google.protobuf.V
    public abstract /* synthetic */ boolean isInitialized();

    @Override // com.google.protobuf.U
    public abstract /* synthetic */ U.a newBuilderForType();

    public t0 newUninitializedMessageException() {
        return new t0(this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.U
    public abstract /* synthetic */ U.a toBuilder();

    @Override // com.google.protobuf.U
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC4029l abstractC4029lNewInstance = AbstractC4029l.newInstance(bArr);
            writeTo(abstractC4029lNewInstance);
            abstractC4029lNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e4) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e4);
        }
    }

    @Override // com.google.protobuf.U
    public AbstractC4026i toByteString() {
        try {
            AbstractC4026i.h hVarNewCodedBuilder = AbstractC4026i.newCodedBuilder(getSerializedSize());
            writeTo(hVarNewCodedBuilder.getCodedOutput());
            return hVarNewCodedBuilder.build();
        } catch (IOException e4) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e4);
        }
    }

    @Override // com.google.protobuf.U
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        AbstractC4029l abstractC4029lNewInstance = AbstractC4029l.newInstance(outputStream, AbstractC4029l.computePreferredBufferSize(AbstractC4029l.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        abstractC4029lNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(abstractC4029lNewInstance);
        abstractC4029lNewInstance.flush();
    }

    @Override // com.google.protobuf.U
    public abstract /* synthetic */ void writeTo(AbstractC4029l abstractC4029l) throws IOException;

    @Override // com.google.protobuf.U
    public void writeTo(OutputStream outputStream) throws IOException {
        AbstractC4029l abstractC4029lNewInstance = AbstractC4029l.newInstance(outputStream, AbstractC4029l.computePreferredBufferSize(getSerializedSize()));
        writeTo(abstractC4029lNewInstance);
        abstractC4029lNewInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC0355a.addAll((Iterable) iterable, (List) list);
    }
}
