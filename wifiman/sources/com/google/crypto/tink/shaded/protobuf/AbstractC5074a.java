package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5081h;
import com.google.crypto.tink.shaded.protobuf.M;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5074a implements M {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1216a implements M.a {
        protected static UninitializedMessageException f(M m10) {
            return new UninitializedMessageException(m10);
        }
    }

    private String f(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    abstract int a(c0 c0Var);

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public AbstractC5081h e() {
        try {
            AbstractC5081h.C1217h c1217hT = AbstractC5081h.T(d());
            b(c1217hT.b());
            return c1217hT.a();
        } catch (IOException e10) {
            throw new RuntimeException(f("ByteString"), e10);
        }
    }

    UninitializedMessageException g() {
        return new UninitializedMessageException(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[d()];
            CodedOutputStream codedOutputStreamU = CodedOutputStream.U(bArr);
            b(codedOutputStreamU);
            codedOutputStreamU.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(f("byte array"), e10);
        }
    }
}
