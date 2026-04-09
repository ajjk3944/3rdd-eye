package com.google.ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.ar.core.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5041d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ L f38235a;

    C5041d(L l10) {
        this.f38235a = l10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i10 = extras.getInt("install.status");
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.f38235a.a(M.ACCEPTED);
            } else if (i10 == 4) {
                this.f38235a.a(M.COMPLETED);
            } else {
                if (i10 != 6) {
                    return;
                }
                this.f38235a.a(M.CANCELLED);
            }
        }
    }
}
