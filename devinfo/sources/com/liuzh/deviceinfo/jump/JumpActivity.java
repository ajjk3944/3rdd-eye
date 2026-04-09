package com.liuzh.deviceinfo.jump;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import hg.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class JumpActivity extends a {
    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("target_jump", -1);
        try {
            if (intExtra == 1) {
                PackageManager packageManager = getPackageManager();
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.android.deskclock");
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage("com.sec.android.app.clockpackage");
                }
                if (launchIntentForPackage != null) {
                    startActivity(launchIntentForPackage);
                }
            } else if (intExtra == 2) {
                ComponentName componentName = new ComponentName("com.android.calendar", "com.android.calendar.LaunchActivity");
                Intent intent = new Intent();
                intent.addFlags(268435456);
                intent.setComponent(componentName);
                startActivity(intent);
            }
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
        finish();
    }
}
