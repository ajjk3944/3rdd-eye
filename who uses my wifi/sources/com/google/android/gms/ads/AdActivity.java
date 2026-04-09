package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bu1;
import defpackage.c92;
import defpackage.gi2;
import defpackage.oi0;
import defpackage.sv1;
import defpackage.te1;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public c92 f;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.V1(i, i2, intent);
            }
        } catch (Exception e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                if (!c92Var.e()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            c92 c92Var2 = this.f;
            if (c92Var2 != null) {
                c92Var2.b();
            }
        } catch (RemoteException e2) {
            gi2.p0("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.D(new oi0(configuration));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gi2.U("AdActivity onCreate");
        bu1 bu1Var = sv1.f.b;
        bu1Var.getClass();
        te1 te1Var = new te1(bu1Var, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            gi2.Z("useClientJar flag not found in activity intent extras.");
        }
        c92 c92Var = (c92) te1Var.d(this, booleanExtra);
        this.f = c92Var;
        if (c92Var == null) {
            gi2.p0("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            c92Var.X2(bundle);
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        gi2.U("AdActivity onDestroy");
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.x();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        gi2.U("AdActivity onPause");
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.i();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.O1(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        gi2.U("AdActivity onRestart");
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.j();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        gi2.U("AdActivity onResume");
        super.onResume();
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.k();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.c0(bundle);
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        gi2.U("AdActivity onStart");
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.g();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        gi2.U("AdActivity onStop");
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.S();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            c92 c92Var = this.f;
            if (c92Var != null) {
                c92Var.c();
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        c92 c92Var = this.f;
        if (c92Var != null) {
            try {
                c92Var.u();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        c92 c92Var = this.f;
        if (c92Var != null) {
            try {
                c92Var.u();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        c92 c92Var = this.f;
        if (c92Var != null) {
            try {
                c92Var.u();
            } catch (RemoteException e) {
                gi2.p0("#007 Could not call remote method.", e);
            }
        }
    }
}
