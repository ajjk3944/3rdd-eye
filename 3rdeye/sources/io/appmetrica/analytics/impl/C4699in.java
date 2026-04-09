package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.in, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4699in {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4751kn f41093a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4751kn f41094b;

    public C4699in(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f41093a = new Y2(new C4749kl(context));
            this.f41094b = new Y2(new C4586ed(context));
        } else {
            this.f41093a = new C4866p8();
            this.f41094b = new C4866p8();
        }
    }
}
