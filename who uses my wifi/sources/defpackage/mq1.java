package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mq1 {
    public final Context a;
    public final zw2 b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final int h;
    public PointF i;
    public PointF j;
    public final wc1 k;
    public int g = 0;
    public final yf1 l = new yf1(this, 6);

    public mq1(Context context) {
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        hg4 hg4Var = hg4.C;
        hg4Var.t.a();
        this.k = (wc1) hg4Var.t.i;
        this.b = hg4Var.o.g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        yf1 yf1Var = this.l;
        wc1 wc1Var = this.k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                wc1Var.postDelayed(yf1Var, ((Long) tw1.e.c.a(mz1.n5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !c(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            wc1Var.removeCallbacks(yf1Var);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                gi2.f0("Can not create dialog without Activity Context");
                return;
            }
            hg4 hg4Var = hg4.C;
            us1 us1Var = hg4Var.o;
            synchronized (us1Var.a) {
                str = us1Var.c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != hg4Var.o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) tw1.e.c.a(mz1.X9)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderK = lf4.k(context);
            builderK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: hf1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final mq1 mq1Var = this.f;
                    zw2 zw2Var = mq1Var.b;
                    if (i != iE) {
                        if (i == iE2) {
                            gi2.U("Debug mode [Creative Preview] selected.");
                            md2.a.execute(new yf1(mq1Var, 1));
                            return;
                        }
                        if (i == iE3) {
                            gi2.U("Debug mode [Troubleshooting] selected.");
                            md2.a.execute(new yf1(mq1Var, 2));
                            return;
                        }
                        if (i == iE4) {
                            final ld2 ld2Var = md2.f;
                            ld2 ld2Var2 = md2.a;
                            if (zw2Var.f()) {
                                ld2Var.execute(new yf1(mq1Var, 5));
                                return;
                            } else {
                                final int i2 = 0;
                                ld2Var2.execute(new Runnable() { // from class: yn1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i2) {
                                            case 0:
                                                hg4 hg4Var2 = hg4.C;
                                                us1 us1Var2 = hg4Var2.o;
                                                mq1 mq1Var2 = mq1Var;
                                                Context context2 = mq1Var2.a;
                                                if (!us1Var2.b(context2, mq1Var2.d, mq1Var2.e)) {
                                                    hg4Var2.o.c(context2, mq1Var2.d, mq1Var2.e);
                                                    break;
                                                } else {
                                                    ld2Var.execute(new yf1(mq1Var2, 4));
                                                    break;
                                                }
                                            default:
                                                hg4 hg4Var3 = hg4.C;
                                                us1 us1Var3 = hg4Var3.o;
                                                mq1 mq1Var3 = mq1Var;
                                                Context context3 = mq1Var3.a;
                                                if (!us1Var3.b(context3, mq1Var3.d, mq1Var3.e)) {
                                                    hg4Var3.o.c(context3, mq1Var3.d, mq1Var3.e);
                                                    break;
                                                } else {
                                                    ld2Var.execute(new yf1(mq1Var3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == iE5) {
                            final ld2 ld2Var3 = md2.f;
                            ld2 ld2Var4 = md2.a;
                            if (zw2Var.f()) {
                                ld2Var3.execute(new yf1(mq1Var, 0));
                                return;
                            } else {
                                final int i3 = 1;
                                ld2Var4.execute(new Runnable() { // from class: yn1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                hg4 hg4Var2 = hg4.C;
                                                us1 us1Var2 = hg4Var2.o;
                                                mq1 mq1Var2 = mq1Var;
                                                Context context2 = mq1Var2.a;
                                                if (!us1Var2.b(context2, mq1Var2.d, mq1Var2.e)) {
                                                    hg4Var2.o.c(context2, mq1Var2.d, mq1Var2.e);
                                                    break;
                                                } else {
                                                    ld2Var3.execute(new yf1(mq1Var2, 4));
                                                    break;
                                                }
                                            default:
                                                hg4 hg4Var3 = hg4.C;
                                                us1 us1Var3 = hg4Var3.o;
                                                mq1 mq1Var3 = mq1Var;
                                                Context context3 = mq1Var3.a;
                                                if (!us1Var3.b(context3, mq1Var3.d, mq1Var3.e)) {
                                                    hg4Var3.o.c(context3, mq1Var3.d, mq1Var3.e);
                                                    break;
                                                } else {
                                                    ld2Var3.execute(new yf1(mq1Var3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = mq1Var.a;
                    if (!(context2 instanceof Activity)) {
                        gi2.f0("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = mq1Var.c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        lf4 lf4Var = hg4.C.c;
                        HashMap mapO = lf4.o(uriBuild);
                        for (String str6 : mapO.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapO.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    lf4 lf4Var2 = hg4.C.c;
                    AlertDialog.Builder builderK2 = lf4.k(context2);
                    builderK2.setMessage(str5);
                    builderK2.setTitle("Ad Information");
                    builderK2.setPositiveButton("Share", new qm1(mq1Var, str5, 0));
                    builderK2.setNegativeButton("Close", cn1.f);
                    builderK2.create().show();
                }
            });
            builderK.create().show();
        } catch (WindowManager.BadTokenException unused) {
            gi2.R();
        }
    }

    public final boolean c(float f, float f2, float f3, float f4) {
        float fAbs = Math.abs(this.i.x - f);
        int i = this.h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f2) < ((float) i) && Math.abs(this.j.x - f3) < ((float) i) && Math.abs(this.j.y - f4) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.b.r.ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        lf4 lf4Var = hg4.C.c;
        AlertDialog.Builder builderK = lf4.k(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderK.setTitle("Setup gesture");
        builderK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new k70(1, atomicInteger));
        builderK.setNegativeButton("Dismiss", new k70(2, this));
        builderK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: yk1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                mq1 mq1Var = this.f;
                zw2 zw2Var = mq1Var.b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iE2) {
                        zw2Var.h(ww2.g, true);
                    } else if (atomicInteger2.get() == iE3) {
                        zw2Var.h(ww2.h, true);
                    } else {
                        zw2Var.h(ww2.f, true);
                    }
                }
                mq1Var.b();
            }
        });
        builderK.setOnCancelListener(new uo(1, this));
        builderK.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return ex0.k(sb, this.d, "}");
    }
}
