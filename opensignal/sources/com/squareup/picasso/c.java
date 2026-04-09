package com.squareup.picasso;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import y1.h1;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5880a;

    public /* synthetic */ c(int i10) {
        this.f5880a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5880a) {
            case 0:
                return new StringBuilder("Picasso-");
            case 1:
                return new StringBuilder();
            case 2:
                return new PathMeasure();
            case 3:
                return new Path();
            case 4:
                return new Path();
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new float[4];
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Random();
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new io.sentry.util.h();
            case 9:
                return 0L;
            case 10:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(pu.b.f20649e);
                return simpleDateFormat;
            case 11:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                y1.n0 n0Var = new y1.n0(choreographer, dr.a.h(looperMyLooper));
                return se.b.M(n0Var, n0Var.H);
            default:
                return new h1();
        }
    }
}
