package ya;

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
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.ff0;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.sk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37450a;

    /* renamed from: b, reason: collision with root package name */
    public final ff0 f37451b;

    /* renamed from: c, reason: collision with root package name */
    public String f37452c;

    /* renamed from: d, reason: collision with root package name */
    public String f37453d;

    /* renamed from: e, reason: collision with root package name */
    public String f37454e;

    /* renamed from: f, reason: collision with root package name */
    public String f37455f;

    /* renamed from: h, reason: collision with root package name */
    public final int f37456h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f37457i;
    public PointF j;

    /* renamed from: k, reason: collision with root package name */
    public final ac.k f37458k;
    public int g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final c f37459l = new c(this, 6);

    public g(Context context) {
        this.f37450a = context;
        this.f37456h = ViewConfiguration.get(context).getScaledTouchSlop();
        ua.j jVar = ua.j.C;
        jVar.f35276t.f();
        this.f37458k = (ac.k) jVar.f35276t.f28605c;
        this.f37451b = (ff0) jVar.f35271o.g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z3) {
        if (!z3) {
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
            this.f37457i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i4 = this.g;
        if (i4 == -1) {
            return;
        }
        c cVar = this.f37459l;
        ac.k kVar = this.f37458k;
        if (i4 == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                kVar.postDelayed(cVar, ((Long) va.s.f36163e.f36166c.a(sk.H5)).longValue());
                return;
            }
            return;
        }
        if (i4 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z3 = false;
                for (int i10 = 0; i10 < historySize; i10++) {
                    z3 |= !c(motionEvent.getHistoricalX(0, i10), motionEvent.getHistoricalY(0, i10), motionEvent.getHistoricalX(1, i10), motionEvent.getHistoricalY(1, i10));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z3) {
                    return;
                }
            }
            this.g = -1;
            kVar.removeCallbacks(cVar);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f37450a;
            if (!(context instanceof Activity)) {
                za.i.g("Can not create dialog without Activity Context");
                return;
            }
            ua.j jVar = ua.j.C;
            t5.p pVar = jVar.f35271o;
            synchronized (pVar.f34254c) {
                str = (String) pVar.f34256e;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != jVar.f35271o.o() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) va.s.f36163e.f36166c.a(sk.f16387wa)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderL = f0.l(context);
            builderL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: ya.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    final g gVar = this.f37394a;
                    ff0 ff0Var = gVar.f37451b;
                    if (i4 != iE) {
                        if (i4 == iE2) {
                            za.i.c("Debug mode [Creative Preview] selected.");
                            fx.f11274a.execute(new c(gVar, 1));
                            return;
                        }
                        if (i4 == iE3) {
                            za.i.c("Debug mode [Troubleshooting] selected.");
                            fx.f11274a.execute(new c(gVar, 2));
                            return;
                        }
                        if (i4 == iE4) {
                            final ex exVar = fx.f11279f;
                            ex exVar2 = fx.f11274a;
                            if (ff0Var.g()) {
                                exVar.execute(new c(gVar, 5));
                                return;
                            } else {
                                final int i10 = 0;
                                exVar2.execute(new Runnable() { // from class: ya.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i10) {
                                            case 0:
                                                ua.j jVar2 = ua.j.C;
                                                t5.p pVar2 = jVar2.f35271o;
                                                g gVar2 = gVar;
                                                Context context2 = gVar2.f37450a;
                                                if (!pVar2.i(context2, gVar2.f37453d, gVar2.f37454e)) {
                                                    jVar2.f35271o.j(context2, gVar2.f37453d, gVar2.f37454e);
                                                    break;
                                                } else {
                                                    exVar.execute(new c(gVar2, 4));
                                                    break;
                                                }
                                            default:
                                                ua.j jVar3 = ua.j.C;
                                                t5.p pVar3 = jVar3.f35271o;
                                                g gVar3 = gVar;
                                                Context context3 = gVar3.f37450a;
                                                if (!pVar3.i(context3, gVar3.f37453d, gVar3.f37454e)) {
                                                    jVar3.f35271o.j(context3, gVar3.f37453d, gVar3.f37454e);
                                                    break;
                                                } else {
                                                    exVar.execute(new c(gVar3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i4 == iE5) {
                            final ex exVar3 = fx.f11279f;
                            ex exVar4 = fx.f11274a;
                            if (ff0Var.g()) {
                                exVar3.execute(new c(gVar, 0));
                                return;
                            } else {
                                final int i11 = 1;
                                exVar4.execute(new Runnable() { // from class: ya.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i11) {
                                            case 0:
                                                ua.j jVar2 = ua.j.C;
                                                t5.p pVar2 = jVar2.f35271o;
                                                g gVar2 = gVar;
                                                Context context2 = gVar2.f37450a;
                                                if (!pVar2.i(context2, gVar2.f37453d, gVar2.f37454e)) {
                                                    jVar2.f35271o.j(context2, gVar2.f37453d, gVar2.f37454e);
                                                    break;
                                                } else {
                                                    exVar3.execute(new c(gVar2, 4));
                                                    break;
                                                }
                                            default:
                                                ua.j jVar3 = ua.j.C;
                                                t5.p pVar3 = jVar3.f35271o;
                                                g gVar3 = gVar;
                                                Context context3 = gVar3.f37450a;
                                                if (!pVar3.i(context3, gVar3.f37453d, gVar3.f37454e)) {
                                                    jVar3.f35271o.j(context3, gVar3.f37453d, gVar3.f37454e);
                                                    break;
                                                } else {
                                                    exVar3.execute(new c(gVar3, 3));
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
                    Context context2 = gVar.f37450a;
                    if (!(context2 instanceof Activity)) {
                        za.i.g("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = gVar.f37452c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb2 = new StringBuilder();
                        f0 f0Var = ua.j.C.f35261c;
                        HashMap mapP = f0.p(uriBuild);
                        for (String str6 : mapP.keySet()) {
                            sb2.append(str6);
                            sb2.append(" = ");
                            sb2.append((String) mapP.get(str6));
                            sb2.append("\n\n");
                        }
                        String strTrim = sb2.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    f0 f0Var2 = ua.j.C.f35261c;
                    AlertDialog.Builder builderL2 = f0.l(context2);
                    builderL2.setMessage(str5);
                    builderL2.setTitle("Ad Information");
                    builderL2.setPositiveButton("Share", new hj.b(1, gVar, str5));
                    builderL2.setNegativeButton("Close", e.f37433a);
                    builderL2.create().show();
                }
            });
            builderL.create().show();
        } catch (WindowManager.BadTokenException e2) {
            a0.n("", e2);
        }
    }

    public final boolean c(float f10, float f11, float f12, float f13) {
        float fAbs = Math.abs(this.f37457i.x - f10);
        int i4 = this.f37456h;
        return fAbs < ((float) i4) && Math.abs(this.f37457i.y - f11) < ((float) i4) && Math.abs(this.j.x - f12) < ((float) i4) && Math.abs(this.j.y - f13) < ((float) i4);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f37451b.f11144r.ordinal();
        final int i4 = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        f0 f0Var = ua.j.C.f35261c;
        AlertDialog.Builder builderL = f0.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i4);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i4, new t.r(2, atomicInteger));
        builderL.setNegativeButton("Dismiss", new t.r(3, this));
        builderL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: ya.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                g gVar = this.f37426a;
                ff0 ff0Var = gVar.f37451b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i4) {
                    if (atomicInteger2.get() == iE2) {
                        ff0Var.i(cf0.f10097b, true);
                    } else if (atomicInteger2.get() == iE3) {
                        ff0Var.i(cf0.f10098c, true);
                    } else {
                        ff0Var.i(cf0.f10096a, true);
                    }
                }
                gVar.b();
            }
        });
        builderL.setOnCancelListener(new b5.p(1, this));
        builderL.create().show();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.f37452c);
        sb2.append(",DebugSignal: ");
        sb2.append(this.f37455f);
        sb2.append(",AFMA Version: ");
        sb2.append(this.f37454e);
        sb2.append(",Ad Unit ID: ");
        return d.h.w(sb2, this.f37453d, "}");
    }
}
