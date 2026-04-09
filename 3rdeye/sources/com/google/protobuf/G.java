package com.google.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class G {
    private static final C4034q EMPTY_REGISTRY = C4034q.getEmptyRegistry();
    private AbstractC4026i delayedBytes;
    private C4034q extensionRegistry;
    private volatile AbstractC4026i memoizedBytes;
    protected volatile U value;

    public G(C4034q c4034q, AbstractC4026i abstractC4026i) {
        checkArguments(c4034q, abstractC4026i);
        this.extensionRegistry = c4034q;
        this.delayedBytes = abstractC4026i;
    }

    private static void checkArguments(C4034q c4034q, AbstractC4026i abstractC4026i) {
        if (c4034q == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC4026i == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    public static G fromValue(U u8) {
        G g10 = new G();
        g10.setValue(u8);
        return g10;
    }

    private static U mergeValueAndBytes(U u8, AbstractC4026i abstractC4026i, C4034q c4034q) {
        try {
            return u8.toBuilder().mergeFrom(abstractC4026i, c4034q).build();
        } catch (C unused) {
            return u8;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        AbstractC4026i abstractC4026i = this.memoizedBytes;
        AbstractC4026i abstractC4026i2 = AbstractC4026i.EMPTY;
        if (abstractC4026i == abstractC4026i2) {
            return true;
        }
        if (this.value != null) {
            return false;
        }
        AbstractC4026i abstractC4026i3 = this.delayedBytes;
        return abstractC4026i3 == null || abstractC4026i3 == abstractC4026i2;
    }

    public void ensureInitialized(U u8) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = u8.getParserForType().parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = u8;
                    this.memoizedBytes = AbstractC4026i.EMPTY;
                }
            } catch (C unused) {
                this.value = u8;
                this.memoizedBytes = AbstractC4026i.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        U u8 = this.value;
        U u10 = g10.value;
        return (u8 == null && u10 == null) ? toByteString().equals(g10.toByteString()) : (u8 == null || u10 == null) ? u8 != null ? u8.equals(g10.getValue(u8.getDefaultInstanceForType())) : getValue(u10.getDefaultInstanceForType()).equals(u10) : u8.equals(u10);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        AbstractC4026i abstractC4026i = this.delayedBytes;
        if (abstractC4026i != null) {
            return abstractC4026i.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public U getValue(U u8) {
        ensureInitialized(u8);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(G g10) {
        AbstractC4026i abstractC4026i;
        if (g10.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(g10);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = g10.extensionRegistry;
        }
        AbstractC4026i abstractC4026i2 = this.delayedBytes;
        if (abstractC4026i2 != null && (abstractC4026i = g10.delayedBytes) != null) {
            this.delayedBytes = abstractC4026i2.concat(abstractC4026i);
            return;
        }
        if (this.value == null && g10.value != null) {
            setValue(mergeValueAndBytes(g10.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value == null || g10.value != null) {
            setValue(this.value.toBuilder().mergeFrom(g10.value).build());
        } else {
            setValue(mergeValueAndBytes(this.value, g10.delayedBytes, g10.extensionRegistry));
        }
    }

    public void mergeFrom(AbstractC4027j abstractC4027j, C4034q c4034q) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(abstractC4027j.readBytes(), c4034q);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = c4034q;
        }
        AbstractC4026i abstractC4026i = this.delayedBytes;
        if (abstractC4026i != null) {
            setByteString(abstractC4026i.concat(abstractC4027j.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(abstractC4027j, c4034q).build());
            } catch (C unused) {
            }
        }
    }

    public void set(G g10) {
        this.delayedBytes = g10.delayedBytes;
        this.value = g10.value;
        this.memoizedBytes = g10.memoizedBytes;
        C4034q c4034q = g10.extensionRegistry;
        if (c4034q != null) {
            this.extensionRegistry = c4034q;
        }
    }

    public void setByteString(AbstractC4026i abstractC4026i, C4034q c4034q) {
        checkArguments(c4034q, abstractC4026i);
        this.delayedBytes = abstractC4026i;
        this.extensionRegistry = c4034q;
        this.value = null;
        this.memoizedBytes = null;
    }

    public U setValue(U u8) {
        U u10 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = u8;
        return u10;
    }

    public AbstractC4026i toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        AbstractC4026i abstractC4026i = this.delayedBytes;
        if (abstractC4026i != null) {
            return abstractC4026i;
        }
        synchronized (this) {
            try {
                if (this.memoizedBytes != null) {
                    return this.memoizedBytes;
                }
                if (this.value == null) {
                    this.memoizedBytes = AbstractC4026i.EMPTY;
                } else {
                    this.memoizedBytes = this.value.toByteString();
                }
                return this.memoizedBytes;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void writeTo(B0 b02, int i) throws IOException {
        if (this.memoizedBytes != null) {
            b02.writeBytes(i, this.memoizedBytes);
            return;
        }
        AbstractC4026i abstractC4026i = this.delayedBytes;
        if (abstractC4026i != null) {
            b02.writeBytes(i, abstractC4026i);
        } else if (this.value != null) {
            b02.writeMessage(i, this.value);
        } else {
            b02.writeBytes(i, AbstractC4026i.EMPTY);
        }
    }

    public G() {
    }
}
