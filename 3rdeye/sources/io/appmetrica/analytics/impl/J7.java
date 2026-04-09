package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class J7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final I7 f39684a;

    public J7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(K7 k72) {
        return MessageNano.toByteArray(this.f39684a.fromModel(k72));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f39684a.fromModel((K7) obj));
    }

    public J7(I7 i72) {
        this.f39684a = i72;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.K7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.H7 r0 = new io.appmetrica.analytics.impl.H7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.H7 r2 = (io.appmetrica.analytics.impl.H7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.H7 r2 = new io.appmetrica.analytics.impl.H7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.H7 r2 = new io.appmetrica.analytics.impl.H7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.I7 r0 = r1.f39684a
            io.appmetrica.analytics.impl.K7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.J7.toModel(byte[]):io.appmetrica.analytics.impl.K7");
    }

    public /* synthetic */ J7(I7 i72, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new I7(null, 1, null) : i72);
    }
}
