package com.liuzh.deviceinfo.widget;

import a4.a;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.text.TextUtils;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.d;
import j$.util.Objects;
import p6.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class OverViewWidget4x2 extends AppWidgetProvider {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f21394a;

    public static Bitmap a(int i4, Context context) {
        int iC = a.c(context.getResources(), 33.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        int iC2 = a.c(context.getResources(), 5.0f);
        paint.setStrokeWidth(iC2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(context.getColor(R.color.widget_progress_bg_color));
        int i10 = (iC2 / 2) + 1;
        float f10 = i10;
        float f11 = iC - i10;
        canvas.drawArc(f10, f10, f11, f11, 0.0f, 360.0f, false, paint);
        paint.setColor(context.getColor(R.color.colorPrimary));
        canvas.drawArc(f10, f10, f11, f11, -90.0f, (i4 / 100.0f) * 360.0f, false, paint);
        return bitmapCreateBitmap;
    }

    public static String b(Context context, i iVar) {
        String strK;
        BluetoothAdapter defaultAdapter;
        try {
            strK = Settings.Secure.getString(context.getContentResolver(), "bluetooth_name");
        } catch (Exception unused) {
            strK = null;
        }
        if (TextUtils.isEmpty(strK) && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            try {
                strK = defaultAdapter.getName();
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        if (iVar != null) {
            strK = iVar.K();
        }
        return TextUtils.isEmpty(strK) ? context.getString(R.string.pure_app_name) : strK;
    }

    public static void c() {
        Objects.toString(new Exception().getStackTrace()[1]);
        d.s(OverViewWidget4x2.class);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        bi.d.c(new oi.a(this, iArr, context, appWidgetManager, 3));
    }
}
