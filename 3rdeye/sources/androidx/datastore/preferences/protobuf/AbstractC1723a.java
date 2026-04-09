package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1723a;
import androidx.datastore.preferences.protobuf.AbstractC1723a.AbstractC0235a;
import androidx.datastore.preferences.protobuf.AbstractC1730h;
import androidx.datastore.preferences.protobuf.AbstractC1733k;
import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: AbstractMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1723a<MessageType extends AbstractC1723a<MessageType, BuilderType>, BuilderType extends AbstractC0235a<MessageType, BuilderType>> implements P {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0235a<MessageType extends AbstractC1723a<MessageType, BuilderType>, BuilderType extends AbstractC0235a<MessageType, BuilderType>> implements Q, Cloneable {
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    public final int d(f0 f0Var) {
        int iC = c();
        if (iC != -1) {
            return iC;
        }
        int iB = f0Var.b(this);
        e(iB);
        return iB;
    }

    public void e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final AbstractC1730h.e toByteString() {
        try {
            AbstractC1744w abstractC1744w = (AbstractC1744w) this;
            int serializedSize = abstractC1744w.getSerializedSize();
            AbstractC1730h.e eVar = AbstractC1730h.f15603c;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC1733k.f15650b;
            AbstractC1733k.b bVar = new AbstractC1733k.b(bArr, serializedSize);
            abstractC1744w.b(bVar);
            if (bVar.f15657e - bVar.f15658f == 0) {
                return new AbstractC1730h.e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e4) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e4);
        }
    }
}
