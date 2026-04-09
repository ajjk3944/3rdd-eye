package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ft;
import va.c;
import va.o;
import va.r;
import vb.b;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ft f9013a;

    @Override // android.app.Activity
    public final void onActivityResult(int i4, int i10, Intent intent) {
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.Z0(i4, i10, intent);
            }
        } catch (Exception e2) {
            i.k("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i4, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                if (!ftVar.e()) {
                    return;
                }
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
        super.onBackPressed();
        try {
            ft ftVar2 = this.f9013a;
            if (ftVar2 != null) {
                ftVar2.c();
            }
        } catch (RemoteException e10) {
            i.k("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.v(new b(configuration));
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i.c("AdActivity onCreate");
        o oVar = r.g.f36158b;
        oVar.getClass();
        c cVar = new c(oVar, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            i.e("useClientJar flag not found in activity intent extras.");
        }
        ft ftVar = (ft) cVar.d(this, booleanExtra);
        this.f9013a = ftVar;
        if (ftVar == null) {
            i.k("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            ftVar.P3(bundle);
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        i.c("AdActivity onDestroy");
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.l();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        i.c("AdActivity onPause");
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.B1();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.P0(i4, strArr, iArr);
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        i.c("AdActivity onRestart");
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.C1();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        i.c("AdActivity onResume");
        super.onResume();
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.D1();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.D(bundle);
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        i.c("AdActivity onStart");
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.A1();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        i.c("AdActivity onStop");
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.R();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            ft ftVar = this.f9013a;
            if (ftVar != null) {
                ftVar.d();
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        super.setContentView(i4);
        ft ftVar = this.f9013a;
        if (ftVar != null) {
            try {
                ftVar.J1();
            } catch (RemoteException e2) {
                i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        ft ftVar = this.f9013a;
        if (ftVar != null) {
            try {
                ftVar.J1();
            } catch (RemoteException e2) {
                i.k("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        ft ftVar = this.f9013a;
        if (ftVar != null) {
            try {
                ftVar.J1();
            } catch (RemoteException e2) {
                i.k("#007 Could not call remote method.", e2);
            }
        }
    }
}
