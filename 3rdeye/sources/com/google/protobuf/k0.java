package com.google.protobuf;

/* compiled from: RawMessageInfo.java */
/* loaded from: classes2.dex */
public final class k0 implements S {
    private final U defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public k0(U u8, String str, Object[] objArr) {
        this.defaultInstance = u8;
        this.info = str;
        this.objects = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.flags = i | (cCharAt2 << i10);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    @Override // com.google.protobuf.S
    public U getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    @Override // com.google.protobuf.S
    public g0 getSyntax() {
        return (this.flags & 1) == 1 ? g0.PROTO2 : g0.PROTO3;
    }

    @Override // com.google.protobuf.S
    public boolean isMessageSetWireFormat() {
        return (this.flags & 2) == 2;
    }
}
