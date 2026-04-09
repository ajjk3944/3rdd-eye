package app.thirdeye.scanner.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class WidgetBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent updateIntent = new Intent(context, WidgetUpdateService.class);
            context.startService(updateIntent);
        }
    }
}
