package J8;

import A9.C0583j;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import va.a;

/* compiled from: InstallReferrer.kt */
/* loaded from: classes3.dex */
public final class w implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InstallReferrerClient f2903a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f2904b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0583j f2905c;

    public w(InstallReferrerClient installReferrerClient, x xVar, C0583j c0583j) {
        this.f2903a = installReferrerClient;
        this.f2904b = xVar;
        this.f2905c = c0583j;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        C0583j c0583j = this.f2905c;
        InstallReferrerClient installReferrerClient = this.f2903a;
        try {
            if (i == 0) {
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                com.zipoapps.premiumhelper.c cVar = this.f2904b.f2907b;
                kotlin.jvm.internal.l.c(installReferrer);
                cVar.getClass();
                SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
                editorEdit.putString("install_referrer", installReferrer);
                editorEdit.apply();
                a.b bVar = va.a.f47104a;
                bVar.o("PremiumHelper");
                bVar.a("Install referrer: ".concat(installReferrer), new Object[0]);
                if (c0583j.isActive()) {
                    c0583j.resumeWith(installReferrer);
                }
            } else if (c0583j.isActive()) {
                c0583j.resumeWith("");
            }
            try {
                installReferrerClient.endConnection();
            } catch (Throwable unused) {
            }
        } catch (RemoteException unused2) {
            if (c0583j.isActive()) {
                c0583j.resumeWith("");
            }
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
