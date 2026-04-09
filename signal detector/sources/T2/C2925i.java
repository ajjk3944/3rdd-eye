package t2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0581Jo;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.EnumC0530Go;
import com.google.android.gms.internal.ads.H9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k0.DialogInterfaceOnCancelListenerC2606j;
import q2.C2841s;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2925i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23614a;

    /* renamed from: b, reason: collision with root package name */
    public final C0581Jo f23615b;

    /* renamed from: c, reason: collision with root package name */
    public String f23616c;

    /* renamed from: d, reason: collision with root package name */
    public String f23617d;

    /* renamed from: e, reason: collision with root package name */
    public String f23618e;

    /* renamed from: f, reason: collision with root package name */
    public String f23619f;

    /* renamed from: h, reason: collision with root package name */
    public final int f23621h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f23622j;

    /* renamed from: k, reason: collision with root package name */
    public final W2.e f23623k;

    /* renamed from: g, reason: collision with root package name */
    public int f23620g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC2919c f23624l = new RunnableC2919c(this, 6);

    public C2925i(Context context) {
        this.f23614a = context;
        this.f23621h = ViewConfiguration.get(context).getScaledTouchSlop();
        p2.j jVar = p2.j.f22785C;
        jVar.f22806t.a();
        this.f23623k = (W2.e) jVar.f22806t.f21323d;
        this.f23615b = jVar.f22801o.f23637g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z6) {
        if (!z6) {
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
            this.f23620g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f23620g;
        if (i == -1) {
            return;
        }
        RunnableC2919c runnableC2919c = this.f23624l;
        W2.e eVar = this.f23623k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f23620g = 5;
                this.f23622j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                eVar.postDelayed(runnableC2919c, ((Long) C2841s.f23267e.f23270c.a(H9.f8606H5)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z6 = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z6 |= !c(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z6) {
                    return;
                }
            }
            this.f23620g = -1;
            eVar.removeCallbacks(runnableC2919c);
        }
    }

    public final void b() {
        String str;
        try {
            Context context = this.f23614a;
            if (!(context instanceof Activity)) {
                u2.k.g("Can not create dialog without Activity Context");
                return;
            }
            p2.j jVar = p2.j.f22785C;
            C2928l c2928l = jVar.f22801o;
            synchronized (c2928l.f23631a) {
                str = c2928l.f23633c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != jVar.f22801o.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int iE = e(arrayList, "Ad information", true);
            final int iE2 = e(arrayList, str2, true);
            final int iE3 = e(arrayList, str3, true);
            boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.ua)).booleanValue();
            final int iE4 = e(arrayList, "Open ad inspector", zBooleanValue);
            final int iE5 = e(arrayList, "Ad inspector settings", zBooleanValue);
            AlertDialog.Builder builderL = C2911G.l(context);
            builderL.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: t2.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final C2925i c2925i = this.f23593a;
                    C0581Jo c0581Jo = c2925i.f23615b;
                    if (i != iE) {
                        if (i == iE2) {
                            u2.k.c("Debug mode [Creative Preview] selected.");
                            AbstractC0640Nf.f10005a.execute(new RunnableC2919c(c2925i, 1));
                            return;
                        }
                        if (i == iE3) {
                            u2.k.c("Debug mode [Troubleshooting] selected.");
                            AbstractC0640Nf.f10005a.execute(new RunnableC2919c(c2925i, 2));
                            return;
                        }
                        if (i == iE4) {
                            final C0623Mf c0623Mf = AbstractC0640Nf.f10010f;
                            C0623Mf c0623Mf2 = AbstractC0640Nf.f10005a;
                            if (c0581Jo.g()) {
                                c0623Mf.execute(new RunnableC2919c(c2925i, 5));
                                return;
                            } else {
                                final int i3 = 0;
                                c0623Mf2.execute(new Runnable() { // from class: t2.h
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                p2.j jVar2 = p2.j.f22785C;
                                                C2928l c2928l2 = jVar2.f22801o;
                                                C2925i c2925i2 = c2925i;
                                                Context context2 = c2925i2.f23614a;
                                                if (!c2928l2.b(context2, c2925i2.f23617d, c2925i2.f23618e)) {
                                                    jVar2.f22801o.c(context2, c2925i2.f23617d, c2925i2.f23618e);
                                                    break;
                                                } else {
                                                    c0623Mf.execute(new RunnableC2919c(c2925i2, 4));
                                                    break;
                                                }
                                            default:
                                                p2.j jVar3 = p2.j.f22785C;
                                                C2928l c2928l3 = jVar3.f22801o;
                                                C2925i c2925i3 = c2925i;
                                                Context context3 = c2925i3.f23614a;
                                                if (!c2928l3.b(context3, c2925i3.f23617d, c2925i3.f23618e)) {
                                                    jVar3.f22801o.c(context3, c2925i3.f23617d, c2925i3.f23618e);
                                                    break;
                                                } else {
                                                    c0623Mf.execute(new RunnableC2919c(c2925i3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == iE5) {
                            final C0623Mf c0623Mf3 = AbstractC0640Nf.f10010f;
                            C0623Mf c0623Mf4 = AbstractC0640Nf.f10005a;
                            if (c0581Jo.g()) {
                                c0623Mf3.execute(new RunnableC2919c(c2925i, 0));
                                return;
                            } else {
                                final int i6 = 1;
                                c0623Mf4.execute(new Runnable() { // from class: t2.h
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                p2.j jVar2 = p2.j.f22785C;
                                                C2928l c2928l2 = jVar2.f22801o;
                                                C2925i c2925i2 = c2925i;
                                                Context context2 = c2925i2.f23614a;
                                                if (!c2928l2.b(context2, c2925i2.f23617d, c2925i2.f23618e)) {
                                                    jVar2.f22801o.c(context2, c2925i2.f23617d, c2925i2.f23618e);
                                                    break;
                                                } else {
                                                    c0623Mf3.execute(new RunnableC2919c(c2925i2, 4));
                                                    break;
                                                }
                                            default:
                                                p2.j jVar3 = p2.j.f22785C;
                                                C2928l c2928l3 = jVar3.f22801o;
                                                C2925i c2925i3 = c2925i;
                                                Context context3 = c2925i3.f23614a;
                                                if (!c2928l3.b(context3, c2925i3.f23617d, c2925i3.f23618e)) {
                                                    jVar3.f22801o.c(context3, c2925i3.f23617d, c2925i3.f23618e);
                                                    break;
                                                } else {
                                                    c0623Mf3.execute(new RunnableC2919c(c2925i3, 3));
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
                    Context context2 = c2925i.f23614a;
                    if (!(context2 instanceof Activity)) {
                        u2.k.g("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c2925i.f23616c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        C2911G c2911g = p2.j.f22785C.f22790c;
                        HashMap mapP = C2911G.p(uriBuild);
                        for (String str6 : mapP.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) mapP.get(str6));
                            sb.append("\n\n");
                        }
                        String strTrim = sb.toString().trim();
                        if (!TextUtils.isEmpty(strTrim)) {
                            str5 = strTrim;
                        }
                    }
                    C2911G c2911g2 = p2.j.f22785C.f22790c;
                    AlertDialog.Builder builderL2 = C2911G.l(context2);
                    builderL2.setMessage(str5);
                    builderL2.setTitle("Ad Information");
                    builderL2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: t2.f
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i7) {
                            C2925i c2925i2 = c2925i;
                            c2925i2.getClass();
                            C2911G c2911g3 = p2.j.f22785C.f22790c;
                            C2911G.u(c2925i2.f23614a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    builderL2.setNegativeButton("Close", DialogInterfaceOnClickListenerC2923g.f23610a);
                    builderL2.create().show();
                }
            });
            builderL.create().show();
        } catch (WindowManager.BadTokenException e6) {
            AbstractC2907C.n("", e6);
        }
    }

    public final boolean c(float f2, float f5, float f6, float f7) {
        float fAbs = Math.abs(this.i.x - f2);
        int i = this.f23621h;
        return fAbs < ((float) i) && Math.abs(this.i.y - f5) < ((float) i) && Math.abs(this.f23622j.x - f6) < ((float) i) && Math.abs(this.f23622j.y - f7) < ((float) i);
    }

    public final void d(Context context) {
        ArrayList arrayList = new ArrayList();
        int iE = e(arrayList, "None", true);
        final int iE2 = e(arrayList, "Shake", true);
        final int iE3 = e(arrayList, "Flick", true);
        int iOrdinal = this.f23615b.f9365r.ordinal();
        final int i = iOrdinal != 1 ? iOrdinal != 2 ? iE : iE3 : iE2;
        C2911G c2911g = p2.j.f22785C.f22790c;
        AlertDialog.Builder builderL = C2911G.l(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        builderL.setTitle("Setup gesture");
        builderL.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterfaceOnClickListenerC2920d(0, atomicInteger));
        builderL.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC2920d(1, this));
        builderL.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: t2.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                C2925i c2925i = this.f23603a;
                C0581Jo c0581Jo = c2925i.f23615b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == iE2) {
                        c0581Jo.i(EnumC0530Go.f8443b, true);
                    } else if (atomicInteger2.get() == iE3) {
                        c0581Jo.i(EnumC0530Go.f8444c, true);
                    } else {
                        c0581Jo.i(EnumC0530Go.f8442a, true);
                    }
                }
                c2925i.b();
            }
        });
        builderL.setOnCancelListener(new DialogInterfaceOnCancelListenerC2606j(1, this));
        builderL.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f23616c);
        sb.append(",DebugSignal: ");
        sb.append(this.f23619f);
        sb.append(",AFMA Version: ");
        sb.append(this.f23618e);
        sb.append(",Ad Unit ID: ");
        return A.f.p(sb, this.f23617d, "}");
    }
}
