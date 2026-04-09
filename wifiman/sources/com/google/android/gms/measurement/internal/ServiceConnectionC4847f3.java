package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC4316c0;
import com.google.android.gms.internal.measurement.InterfaceC4325d0;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC4847f3 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f36448a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4820c3 f36449b;

    ServiceConnectionC4847f3(C4820c3 c4820c3, String str) {
        this.f36449b = c4820c3;
        this.f36448a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f36449b.f36357a.zzj().H().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC4325d0 interfaceC4325d0C = AbstractBinderC4316c0.c(iBinder);
            if (interfaceC4325d0C == null) {
                this.f36449b.f36357a.zzj().H().a("Install Referrer Service implementation was not found");
            } else {
                this.f36449b.f36357a.zzj().G().a("Install Referrer Service connected");
                this.f36449b.f36357a.zzl().z(new RunnableC4838e3(this, interfaceC4325d0C, this));
            }
        } catch (RuntimeException e10) {
            this.f36449b.f36357a.zzj().H().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f36449b.f36357a.zzj().G().a("Install Referrer Service disconnected");
    }
}
