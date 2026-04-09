package zb;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c extends wd.b {
    public static void V(Context context, r rVar, IntentFilter intentFilter) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            context.registerReceiver(rVar, intentFilter, i4 >= 33 ? 2 : 0);
        } else {
            context.registerReceiver(rVar, intentFilter);
        }
    }
}
