package app.thirdeye.scanner.widget;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;

public class WidgetUpdateService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this);

        // Update Quick Status widgets
        int[] quickStatusIds = appWidgetManager.getAppWidgetIds(
            new ComponentName(this, QuickStatusWidget.class));
        for (int id : quickStatusIds) {
            QuickStatusWidget.updateWidget(this, appWidgetManager, id);
        }

        // Update Network Info widgets
        int[] networkInfoIds = appWidgetManager.getAppWidgetIds(
            new ComponentName(this, NetworkInfoWidget.class));
        for (int id : networkInfoIds) {
            NetworkInfoWidget.updateWidget(this, appWidgetManager, id);
        }

        stopSelf();
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
