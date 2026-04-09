package com.monetization.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import com.yandex.mobile.ads.impl.fp0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f23650a = new LinkedBlockingQueue();

    public final OpenDeviceIdentifierService a() throws InterruptedException {
        return (OpenDeviceIdentifierService) this.f23650a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder binder) throws InterruptedException {
        l.f(componentName, "componentName");
        l.f(binder, "binder");
        try {
            int i = OpenDeviceIdentifierService.Stub.f23648a;
            IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.f23650a.put((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OpenDeviceIdentifierService)) ? new OpenDeviceIdentifierService.Stub.Proxy(binder) : (OpenDeviceIdentifierService) iInterfaceQueryLocalInterface);
        } catch (Exception unused) {
            fp0.c(new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        l.f(componentName, "componentName");
        try {
            this.f23650a.clear();
        } catch (UnsupportedOperationException unused) {
            fp0.c(new Object[0]);
        }
    }
}
