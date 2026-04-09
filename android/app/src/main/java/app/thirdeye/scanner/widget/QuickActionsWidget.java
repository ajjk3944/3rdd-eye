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

public class QuickActionsWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateWidget(context, appWidgetManager, appWidgetId);
        }
    }

    static void updateWidget(Context context, AppWidgetManager appWidgetManager, int appWidgetId) {
        try {
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_quick_actions);

            int flags = PendingIntent.FLAG_UPDATE_CURRENT;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            flags |= PendingIntent.FLAG_IMMUTABLE;
        }

        // WiFi Scan button
        Intent wifiIntent = new Intent(context, MainActivity.class);
        wifiIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent wifiPending = PendingIntent.getActivity(context, 1, wifiIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_btn_wifi, wifiPending);

        // Speed Test button
        Intent speedIntent = new Intent(context, MainActivity.class);
        speedIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent speedPending = PendingIntent.getActivity(context, 2, speedIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_btn_speed, speedPending);

        // Network Scan button
        Intent netIntent = new Intent(context, MainActivity.class);
        netIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent netPending = PendingIntent.getActivity(context, 3, netIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_btn_network, netPending);

        // Camera Detect button
        Intent cameraIntent = new Intent(context, MainActivity.class);
        cameraIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent cameraPending = PendingIntent.getActivity(context, 4, cameraIntent, flags);
        views.setOnClickPendingIntent(R.id.widget_btn_camera, cameraPending);

        appWidgetManager.updateAppWidget(appWidgetId, views);
        } catch (Exception e) {
            // Log error but don't crash
            android.util.Log.e("QuickActionsWidget", "Error updating widget", e);
        }
    }

    @Override
    public void onEnabled(Context context) {
    }

    @Override
    public void onDisabled(Context context) {
    }
}
