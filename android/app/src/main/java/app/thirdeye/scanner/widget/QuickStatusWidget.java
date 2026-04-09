package app.thirdeye.scanner.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.app.PendingIntent;
import android.os.Build;
import app.thirdeye.scanner.R;
import app.thirdeye.scanner.MainActivity;

public class QuickStatusWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateWidget(context, appWidgetManager, appWidgetId);
        }
    }

    static void updateWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId) {
        try {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_quick_status);

            // Get WiFi data
            WidgetDataHelper.WifiData wifiData = WidgetDataHelper.getCurrentWifiData(context);

            // Set icon tints (API 21+)
            try {
                views.setInt(R.id.widget_wifi_icon, "setColorFilter", 0xFF22D3EE);
                views.setInt(R.id.widget_refresh, "setColorFilter", 0xFF9CA3AF);
            } catch (Exception e) {
                // Ignore tint errors
            }

            if (wifiData != null && wifiData.isConnected) {
            views.setTextViewText(R.id.widget_ssid, wifiData.ssid);
            views.setTextViewText(R.id.widget_signal_text, wifiData.signalDbm + " dBm  Connected");

            // Update signal bars color based on strength
            int activeColor = getSignalColor(wifiData.signalDbm);
            int inactiveColor = 0xFF334155;
            int bars = getSignalBars(wifiData.signalDbm);

            views.setInt(R.id.signal_bar_1, "setBackgroundColor", bars >= 1 ? activeColor : inactiveColor);
            views.setInt(R.id.signal_bar_2, "setBackgroundColor", bars >= 2 ? activeColor : inactiveColor);
            views.setInt(R.id.signal_bar_3, "setBackgroundColor", bars >= 3 ? activeColor : inactiveColor);
            views.setInt(R.id.signal_bar_4, "setBackgroundColor", bars >= 4 ? activeColor : inactiveColor);
        } else {
            views.setTextViewText(R.id.widget_ssid, "Not Connected");
            views.setTextViewText(R.id.widget_signal_text, "No WiFi");
            int inactiveColor = 0xFF334155;
            views.setInt(R.id.signal_bar_1, "setBackgroundColor", inactiveColor);
            views.setInt(R.id.signal_bar_2, "setBackgroundColor", inactiveColor);
            views.setInt(R.id.signal_bar_3, "setBackgroundColor", inactiveColor);
            views.setInt(R.id.signal_bar_4, "setBackgroundColor", inactiveColor);
        }

        // Tap to open app
        Intent openAppIntent = new Intent(context, MainActivity.class);
        openAppIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        int flags = PendingIntent.FLAG_UPDATE_CURRENT;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            flags |= PendingIntent.FLAG_IMMUTABLE;
        }
        PendingIntent openAppPending = PendingIntent.getActivity(context, 0, openAppIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_ssid, openAppPending);

        // Refresh button
        Intent refreshIntent = new Intent(context, QuickStatusWidget.class);
        refreshIntent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        refreshIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, new int[]{appWidgetId});
        PendingIntent refreshPending = PendingIntent.getBroadcast(context, appWidgetId, refreshIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_refresh, refreshPending);

        appWidgetManager.updateAppWidget(appWidgetId, views);
        } catch (Exception e) {
            // Log error but don't crash
            android.util.Log.e("QuickStatusWidget", "Error updating widget", e);
        }
    }

    private static int getSignalBars(int dbm) {
        if (dbm >= -50) return 4;
        if (dbm >= -60) return 3;
        if (dbm >= -70) return 2;
        if (dbm >= -80) return 1;
        return 0;
    }

    private static int getSignalColor(int dbm) {
        if (dbm >= -60) return 0xFF4ADE80;  // green-400
        if (dbm >= -70) return 0xFFFBBF24;  // amber-400
        return 0xFFF87171;                   // red-400
    }

    @Override
    public void onEnabled(Context context) {
        // First widget added
    }

    @Override
    public void onDisabled(Context context) {
        // Last widget removed
    }
}
