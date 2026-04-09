package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* renamed from: io.appmetrica.analytics.impl.ho, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4675ho implements InterfaceC4559db {
    @Override // io.appmetrica.analytics.impl.InterfaceC4559db
    public final String a(Context context) {
        ProtobufStateStorage<Object> protobufStateStorageA;
        C4647gm c4647gm;
        try {
            Om omA = Nm.a(C4647gm.class);
            if (omA == null || (protobufStateStorageA = omA.a(context, omA.c(context))) == null || (c4647gm = (C4647gm) protobufStateStorageA.read()) == null) {
                return null;
            }
            return c4647gm.f40953a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
