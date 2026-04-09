package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5018v7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C4993u7 f41837a;

    public C5018v7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C5043w7 c5043w7) {
        return MessageNano.toByteArray(this.f41837a.fromModel(c5043w7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f41837a.fromModel((C5043w7) obj));
    }

    public C5018v7(C4993u7 c4993u7) {
        this.f41837a = c4993u7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f A[Catch: InvalidProtocolBufferNanoException -> 0x0015, TRY_LEAVE, TryCatch #0 {InvalidProtocolBufferNanoException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000f), top: B:10:0x0002 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C5043w7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.F7 r0 = new io.appmetrica.analytics.impl.F7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.F7 r2 = (io.appmetrica.analytics.impl.F7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.F7 r2 = new io.appmetrica.analytics.impl.F7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.F7 r2 = new io.appmetrica.analytics.impl.F7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.u7 r0 = r1.f41837a
            io.appmetrica.analytics.impl.w7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5018v7.toModel(byte[]):io.appmetrica.analytics.impl.w7");
    }

    public /* synthetic */ C5018v7(C4993u7 c4993u7, int i, kotlin.jvm.internal.g gVar) {
        if ((i & 1) != 0) {
            c4993u7 = new C4993u7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        this(c4993u7);
    }
}
