package com.lefan.signal.view;

import D4.c;
import L4.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.location.Geocoder;
import android.location.Location;
import android.util.AttributeSet;
import android.view.View;
import c5.C0410g;
import com.lefan.signal.db.CellInfoBean;
import java.util.ArrayList;
import java.util.List;
import q5.i;

/* loaded from: classes.dex */
public final class CellLocationView extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f19493n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0410g f19494a;

    /* renamed from: b, reason: collision with root package name */
    public Location f19495b;

    /* renamed from: c, reason: collision with root package name */
    public float f19496c;

    /* renamed from: d, reason: collision with root package name */
    public double f19497d;

    /* renamed from: e, reason: collision with root package name */
    public double f19498e;

    /* renamed from: f, reason: collision with root package name */
    public final double f19499f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19500g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f19501h;
    public final Paint i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f19502j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f19503k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f19504l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19505m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellLocationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19494a = new C0410g(new c(12, this));
        if (Geocoder.isPresent()) {
            new Geocoder(getContext());
        }
        this.f19496c = 1.0f;
        this.f19499f = 6371.393d;
        this.f19500g = 2;
        this.f19501h = new ArrayList();
        Paint paint = new Paint();
        this.i = paint;
        Paint paint2 = new Paint();
        this.f19502j = paint2;
        Paint paint3 = new Paint();
        this.f19503k = paint3;
        Paint paint4 = new Paint();
        this.f19504l = paint4;
        paint.setColor(-16711936);
        paint2.setColor(-16711936);
        paint2.setAlpha(50);
        paint3.setColor(-256);
        paint4.setColor(-256);
        paint4.setAlpha(50);
    }

    private final a getCellInfoDao() {
        return (a) this.f19494a.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        i.e(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f19495b == null || this.f19505m) {
            return;
        }
        this.f19505m = true;
        ArrayList arrayList = this.f19501h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            int i6 = i3 + 1;
            CellInfoBean cellInfoBean = (CellInfoBean) obj;
            int width = getWidth();
            int height = getHeight();
            PointF pointF = null;
            if (this.f19495b == null || cellInfoBean.getLatitude() == null || cellInfoBean.getLongitude() == null) {
                i = i6;
            } else {
                Double latitude = cellInfoBean.getLatitude();
                i.b(latitude);
                double dDoubleValue = latitude.doubleValue();
                Location location = this.f19495b;
                i.b(location);
                double latitude2 = dDoubleValue - location.getLatitude();
                Double longitude = cellInfoBean.getLongitude();
                i.b(longitude);
                double dDoubleValue2 = longitude.doubleValue();
                Location location2 = this.f19495b;
                i.b(location2);
                i = i6;
                pointF = new PointF((float) ((((dDoubleValue2 - location2.getLongitude()) / this.f19498e) * width) + (width / 2)), (float) (((latitude2 / this.f19497d) * height) + (height / 2)));
            }
            if (pointF != null) {
                if (cellInfoBean.isRegistered()) {
                    canvas.drawCircle(pointF.x, pointF.y, 10.0f, this.i);
                    if (cellInfoBean.getRadius() > 0.0d) {
                        canvas.drawCircle(pointF.x, pointF.y, (float) (cellInfoBean.getRadius() * this.f19496c), this.f19502j);
                    }
                } else {
                    canvas.drawCircle(pointF.x, pointF.y, 10.0f, this.f19503k);
                    if (cellInfoBean.getRadius() > 0.0d) {
                        canvas.drawCircle(pointF.x, pointF.y, (float) (cellInfoBean.getRadius() * this.f19496c), this.f19504l);
                    }
                }
            }
            i3 = i;
        }
        this.f19505m = false;
    }

    public final void setCellInfos(List<CellInfoBean> list) {
        i.e(list, "cell");
        ArrayList arrayList = this.f19501h;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }

    public final void setLocation(Location location) {
        i.e(location, "location");
        this.f19495b = location;
        double d6 = 2;
        int i = this.f19500g;
        double d7 = this.f19499f;
        double d8 = 180;
        this.f19498e = ((Math.asin(Math.sin(i / (d6 * d7)) / Math.cos((location.getLatitude() * 3.141592653589793d) / d8)) * d6) * d8) / 3.141592653589793d;
        this.f19497d = ((((i * 9) / 16) / d7) * d8) / 3.141592653589793d;
        this.f19496c = getWidth() / (i * 1000.0f);
        invalidate();
    }
}
