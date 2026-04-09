package com.google.android.gms.ads;

import S2.b;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.InterfaceC0672Pd;
import q2.C2810c;
import q2.C2834o;
import q2.r;
import u2.k;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0672Pd f6848a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i3, Intent intent) {
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.l1(i, i3, intent);
            }
        } catch (Exception e6) {
            k.k("#007 Could not call remote method.", e6);
        }
        super.onActivityResult(i, i3, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                if (!interfaceC0672Pd.e()) {
                    return;
                }
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
        super.onBackPressed();
        try {
            InterfaceC0672Pd interfaceC0672Pd2 = this.f6848a;
            if (interfaceC0672Pd2 != null) {
                interfaceC0672Pd2.b();
            }
        } catch (RemoteException e7) {
            k.k("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.L(new b(configuration));
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k.c("AdActivity onCreate");
        C2834o c2834o = r.f23260g.f23262b;
        c2834o.getClass();
        C2810c c2810c = new C2810c(c2834o, this);
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            k.e("useClientJar flag not found in activity intent extras.");
        }
        InterfaceC0672Pd interfaceC0672Pd = (InterfaceC0672Pd) c2810c.d(this, booleanExtra);
        this.f6848a = interfaceC0672Pd;
        if (interfaceC0672Pd == null) {
            k.k("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            interfaceC0672Pd.r3(bundle);
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        k.c("AdActivity onDestroy");
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.y();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        k.c("AdActivity onPause");
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.i();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.b1(i, strArr, iArr);
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        k.c("AdActivity onRestart");
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.j();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        k.c("AdActivity onResume");
        super.onResume();
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.k();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.g1(bundle);
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        k.c("AdActivity onStart");
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.h();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        k.c("AdActivity onStop");
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.I();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
            if (interfaceC0672Pd != null) {
                interfaceC0672Pd.d();
            }
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
        if (interfaceC0672Pd != null) {
            try {
                interfaceC0672Pd.r();
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
        if (interfaceC0672Pd != null) {
            try {
                interfaceC0672Pd.r();
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        InterfaceC0672Pd interfaceC0672Pd = this.f6848a;
        if (interfaceC0672Pd != null) {
            try {
                interfaceC0672Pd.r();
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
        }
    }
}
