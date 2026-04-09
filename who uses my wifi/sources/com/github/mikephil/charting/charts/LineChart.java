package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import defpackage.aa0;
import defpackage.cb1;
import defpackage.db1;
import defpackage.eb1;
import defpackage.fb1;
import defpackage.i60;
import defpackage.j60;
import defpackage.k41;
import defpackage.k50;
import defpackage.k60;
import defpackage.k9;
import defpackage.ke;
import defpackage.l50;
import defpackage.l9;
import defpackage.lo;
import defpackage.m50;
import defpackage.me;
import defpackage.ni0;
import defpackage.o9;
import defpackage.om;
import defpackage.u61;
import defpackage.uk1;
import defpackage.xn;
import defpackage.z90;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class LineChart extends k9 implements k60 {
    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        this.g = null;
        this.h = true;
        this.i = true;
        this.j = 0.9f;
        this.k = new xn(0);
        this.o = true;
        this.s = "No chart data available.";
        u61 u61Var = new u61();
        this.w = u61Var;
        this.y = 0.0f;
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = false;
        this.E = 0.0f;
        this.F = new ArrayList();
        this.G = false;
        setWillNotDraw(false);
        this.x = new ke();
        Context context2 = getContext();
        DisplayMetrics displayMetrics = k41.a;
        if (context2 == null) {
            k41.b = ViewConfiguration.getMinimumFlingVelocity();
            k41.c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
            k41.b = viewConfiguration.getScaledMinimumFlingVelocity();
            k41.c = viewConfiguration.getScaledMaximumFlingVelocity();
            k41.a = context2.getResources().getDisplayMetrics();
        }
        this.E = k41.c(500.0f);
        lo loVar = new lo();
        loVar.f = "Description Label";
        loVar.g = Paint.Align.RIGHT;
        loVar.d = k41.c(8.0f);
        this.p = loVar;
        k50 k50Var = new k50();
        k50Var.f = new l50[0];
        k50Var.g = 1;
        k50Var.h = 3;
        k50Var.i = 1;
        k50Var.j = 1;
        k50Var.k = 4;
        k50Var.l = 8.0f;
        k50Var.m = 3.0f;
        k50Var.n = 6.0f;
        k50Var.o = 5.0f;
        k50Var.p = 3.0f;
        k50Var.q = 0.95f;
        k50Var.r = 0.0f;
        k50Var.s = 0.0f;
        k50Var.t = new ArrayList(16);
        k50Var.u = new ArrayList(16);
        k50Var.v = new ArrayList(16);
        k50Var.d = k41.c(10.0f);
        k50Var.b = k41.c(5.0f);
        k50Var.c = k41.c(3.0f);
        this.q = k50Var;
        m50 m50Var = new m50(4, u61Var);
        m50Var.l = new ArrayList(16);
        m50Var.m = new Paint.FontMetrics();
        m50Var.n = new Path();
        m50Var.k = k50Var;
        Paint paint = new Paint(1);
        m50Var.i = paint;
        paint.setTextSize(k41.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        m50Var.j = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.t = m50Var;
        cb1 cb1Var = new cb1();
        cb1Var.y = 1;
        cb1Var.z = 1;
        cb1Var.c = k41.c(4.0f);
        this.n = cb1Var;
        this.l = new Paint(1);
        Paint paint3 = new Paint(1);
        this.m = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        Paint paint4 = this.m;
        Paint.Align align = Paint.Align.CENTER;
        paint4.setTextAlign(align);
        this.m.setTextSize(k41.c(12.0f));
        this.a0 = new eb1(1);
        this.b0 = new eb1(2);
        this.e0 = new uk1(u61Var);
        this.f0 = new uk1(u61Var);
        this.c0 = new fb1(u61Var, this.a0, this.e0);
        this.d0 = new fb1(u61Var, this.b0, this.f0);
        cb1 cb1Var2 = this.n;
        db1 db1Var = new db1(u61Var, this.e0, cb1Var2);
        db1Var.o = new Path();
        db1Var.p = new float[2];
        db1Var.q = new RectF();
        db1Var.r = new float[2];
        new RectF();
        new Path();
        db1Var.n = cb1Var2;
        Paint paint5 = db1Var.l;
        paint5.setColor(-16777216);
        paint5.setTextAlign(align);
        paint5.setTextSize(k41.c(10.0f));
        this.g0 = db1Var;
        me meVar = new me();
        meVar.b = new ArrayList();
        meVar.a = this;
        setHighlighter(meVar);
        l9 l9Var = new l9();
        l9Var.f = 0;
        l9Var.i = this;
        l9Var.h = new GestureDetector(getContext(), l9Var);
        l9Var.j = new Matrix();
        l9Var.k = new Matrix();
        l9Var.l = aa0.b(0.0f, 0.0f);
        l9Var.m = aa0.b(0.0f, 0.0f);
        l9Var.n = 1.0f;
        l9Var.o = 1.0f;
        l9Var.p = 1.0f;
        l9Var.s = 0L;
        l9Var.t = aa0.b(0.0f, 0.0f);
        l9Var.u = aa0.b(0.0f, 0.0f);
        l9Var.j = u61Var.a;
        l9Var.v = k41.c(3.0f);
        l9Var.w = k41.c(3.5f);
        this.r = l9Var;
        Paint paint6 = new Paint();
        this.Q = paint6;
        paint6.setStyle(style);
        this.Q.setColor(Color.rgb(240, 240, 240));
        Paint paint7 = new Paint();
        this.R = paint7;
        Paint.Style style2 = Paint.Style.STROKE;
        paint7.setStyle(style2);
        this.R.setColor(-16777216);
        this.R.setStrokeWidth(k41.c(1.0f));
        ke keVar = this.x;
        i60 i60Var = new i60(4, u61Var);
        i60Var.i = keVar;
        Paint paint8 = new Paint(1);
        i60Var.j = paint8;
        paint8.setStyle(style);
        new Paint(4);
        Paint paint9 = new Paint(1);
        i60Var.l = paint9;
        paint9.setColor(Color.rgb(63, 63, 63));
        paint9.setTextAlign(align);
        paint9.setTextSize(k41.c(9.0f));
        Paint paint10 = new Paint(1);
        i60Var.k = paint10;
        paint10.setStyle(style2);
        paint10.setStrokeWidth(2.0f);
        paint10.setColor(Color.rgb(255, 187, 115));
        i60Var.m = new o9(i60Var);
        i60Var.n = new Path();
        i60Var.s = Bitmap.Config.ARGB_8888;
        i60Var.t = new Path();
        i60Var.u = new Path();
        i60Var.v = new float[4];
        i60Var.w = new Path();
        i60Var.x = new HashMap();
        i60Var.y = new float[2];
        i60Var.o = this;
        Paint paint11 = new Paint(1);
        i60Var.p = paint11;
        paint11.setStyle(style);
        paint11.setColor(-1);
        this.u = i60Var;
        this.H = 100;
        this.I = false;
        this.J = false;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = 15.0f;
        this.W = false;
        this.h0 = new RectF();
        this.i0 = new Matrix();
        new Matrix();
        ni0 ni0Var = z90.i;
        z90 z90Var = (z90) ni0Var.b();
        z90Var.g = 0.0d;
        z90Var.h = 0.0d;
        this.j0 = z90Var;
        z90 z90Var2 = (z90) ni0Var.b();
        z90Var2.g = 0.0d;
        z90Var2.h = 0.0d;
        this.k0 = z90Var2;
        this.l0 = new float[2];
    }

    @Override // defpackage.k60
    public j60 getLineData() {
        return (j60) this.g;
    }

    @Override // defpackage.je, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        om omVar = this.u;
        if (omVar != null && (omVar instanceof i60)) {
            i60 i60Var = (i60) omVar;
            Canvas canvas = i60Var.r;
            if (canvas != null) {
                canvas.setBitmap(null);
                i60Var.r = null;
            }
            WeakReference weakReference = i60Var.q;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                i60Var.q.clear();
                i60Var.q = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
