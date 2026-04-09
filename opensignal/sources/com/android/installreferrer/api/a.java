package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import tb.c;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f4012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f4013b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f4013b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f4012a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i10 = tb.b.f22694d;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new tb.a(iBinder);
        }
        b bVar = this.f4013b;
        bVar.f4016c = aVar;
        bVar.f4014a = 2;
        this.f4012a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f4013b;
        bVar.f4016c = null;
        bVar.f4014a = 0;
        this.f4012a.onInstallReferrerServiceDisconnected();
    }
}
