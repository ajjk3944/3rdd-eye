package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.applovin.impl.da;
import java.io.File;
import java.io.IOException;
import r5.a;
import r5.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            e.t(context, new da(1), new o.e(9, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                o.e eVar = new o.e(9, this);
                try {
                    e.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    eVar.m(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e2) {
                    eVar.m(7, e2);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            o.e eVar2 = new o.e(9, this);
            if (Build.VERSION.SDK_INT < 24) {
                eVar2.m(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                eVar2.m(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        o.e eVar3 = new o.e(9, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            eVar3.m(16, null);
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (e.c(i4 >= 34 ? a.a(context).getCacheDir() : i4 >= 24 ? a.a(context).getCodeCacheDir() : i4 == 23 ? context.getCodeCacheDir() : context.getCacheDir())) {
            eVar3.m(14, null);
        } else {
            eVar3.m(15, null);
        }
    }
}
