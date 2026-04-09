package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.ComponentCallbacksC1759l;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
final class zae extends zag {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ ComponentCallbacksC1759l zab;
    final /* synthetic */ int zac;

    public zae(Intent intent, ComponentCallbacksC1759l componentCallbacksC1759l, int i) {
        this.zaa = intent;
        this.zab = componentCallbacksC1759l;
        this.zac = i;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
