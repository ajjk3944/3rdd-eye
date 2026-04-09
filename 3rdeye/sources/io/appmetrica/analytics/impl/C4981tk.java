package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4981tk implements InterfaceC4509bd {
    @Override // io.appmetrica.analytics.impl.InterfaceC4509bd
    public final void a(Context context) {
        Om omA = Nm.a(C4647gm.class);
        ProtobufStateStorage<Object> protobufStateStorageA = omA.a(context, omA.d(context));
        C4647gm c4647gm = (C4647gm) protobufStateStorageA.read();
        C4621fm c4621fmA = c4647gm.a(c4647gm.f40964m);
        c4621fmA.f40890o = 0L;
        protobufStateStorageA.save(new C4647gm(c4621fmA));
    }
}
