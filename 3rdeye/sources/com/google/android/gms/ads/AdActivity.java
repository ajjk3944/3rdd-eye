package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbto;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class AdActivity extends Activity {

    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbto zza;

    private final void zza() {
        zzbto zzbtoVar = this.zza;
        if (zzbtoVar != null) {
            try {
                zzbtoVar.zzx();
            } catch (RemoteException e4) {
                zzo.zzl("#007 Could not call remote method.", e4);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzh(i, i10, intent);
            }
        } catch (Exception e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onActivityResult(i, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                if (!zzbtoVar.zzH()) {
                    return;
                }
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onBackPressed();
        try {
            zzbto zzbtoVar2 = this.zza;
            if (zzbtoVar2 != null) {
                zzbtoVar2.zzi();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzk(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zze("AdActivity onCreate");
        zzbto zzbtoVarZzq = zzbb.zza().zzq(this);
        this.zza = zzbtoVarZzq;
        if (zzbtoVarZzq == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbtoVarZzq.zzl(bundle);
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.zze("AdActivity onDestroy");
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzm();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.zze("AdActivity onPause");
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzo();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzp(i, strArr, iArr);
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.zze("AdActivity onRestart");
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzq();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.zze("AdActivity onResume");
        super.onResume();
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzr();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzs(bundle);
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.zze("AdActivity onStart");
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzt();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.zze("AdActivity onStop");
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzu();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbto zzbtoVar = this.zza;
            if (zzbtoVar != null) {
                zzbtoVar.zzv();
            }
        } catch (RemoteException e4) {
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
