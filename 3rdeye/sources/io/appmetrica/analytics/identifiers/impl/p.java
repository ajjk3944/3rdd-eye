package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: a, reason: collision with root package name */
    public static final p f39065a = new p();

    public p() {
        super(1);
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = t.f39069a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(iBinder) : (u) iInterfaceQueryLocalInterface;
    }
}
