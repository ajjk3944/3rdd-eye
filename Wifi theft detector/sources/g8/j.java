package g8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;

/* loaded from: classes3.dex */
public abstract class j {
    public static void a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse(context.getString(R.string.router_manager_rate_us)));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        } else {
            l.d(R.string.google_play_not_found);
        }
    }
}
