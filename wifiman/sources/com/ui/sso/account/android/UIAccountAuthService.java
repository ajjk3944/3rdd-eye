package com.ui.sso.account.android;

import Oa.c;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ui/sso/account/android/UIAccountAuthService;", "Landroid/app/Service;", "<init>", "()V", "LYg/J;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "LOa/c;", SnmpConfigurator.O_AUTH_PROTOCOL, "LOa/c;", "mAuthenticator", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UIAccountAuthService extends Service {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c mAuthenticator;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC6492s.i(intent, "intent");
        c cVar = this.mAuthenticator;
        if (cVar != null) {
            return cVar.getIBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.mAuthenticator = new c(this);
    }
}
