package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.content.b;
import com.google.android.gms.common.api.GoogleApiClient;
import l1.AbstractC5266a;

/* compiled from: com.google.android.gms:play-services-auth@@20.3.0 */
/* loaded from: classes.dex */
final class zbw implements AbstractC5266a.InterfaceC0487a {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // l1.AbstractC5266a.InterfaceC0487a
    public final b onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // l1.AbstractC5266a.InterfaceC0487a
    public final /* bridge */ /* synthetic */ void onLoadFinished(b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // l1.AbstractC5266a.InterfaceC0487a
    public final void onLoaderReset(b bVar) {
    }
}
