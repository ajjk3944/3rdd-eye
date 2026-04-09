package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q82 extends gw3 implements y32 {
    public final jg2 i;
    public final Context j;
    public final WindowManager k;
    public final sq0 l;
    public DisplayMetrics m;
    public float n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;

    public q82(jg2 jg2Var, Context context, sq0 sq0Var) {
        super(jg2Var, "", 23, false);
        this.o = -1;
        this.p = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.i = jg2Var;
        this.j = context;
        this.l = sq0Var;
        this.k = (WindowManager) context.getSystemService("window");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[PHI: r5
  0x0063: PHI (r5v2 int) = (r5v1 int), (r5v5 int) binds: [B:11:0x0042, B:17:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.j
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L15
            hg4 r1 = defpackage.hg4.C
            lf4 r1 = r1.c
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = defpackage.lf4.q(r1)
            r1 = r1[r2]
            goto L16
        L15:
            r1 = r2
        L16:
            jg2 r3 = r8.i
            og2 r4 = r3.f
            zq r5 = r4.x()
            if (r5 == 0) goto L2a
            zq r5 = r4.x()
            boolean r5 = r5.b()
            if (r5 != 0) goto L76
        L2a:
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            iz1 r6 = defpackage.mz1.c0
            tw1 r7 = defpackage.tw1.e
            kz1 r7 = r7.c
            java.lang.Object r6 = r7.a(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L63
            if (r5 != 0) goto L54
            zq r5 = r4.x()
            if (r5 == 0) goto L53
            zq r5 = r4.x()
            int r5 = r5.c
            goto L54
        L53:
            r5 = r2
        L54:
            if (r3 != 0) goto L63
            zq r3 = r4.x()
            if (r3 == 0) goto L64
            zq r2 = r4.x()
            int r2 = r2.b
            goto L64
        L63:
            r2 = r3
        L64:
            sv1 r3 = defpackage.sv1.f
            j63 r6 = r3.a
            int r5 = r6.h(r0, r5)
            r8.t = r5
            j63 r3 = r3.a
            int r0 = r3.h(r0, r2)
            r8.u = r0
        L76:
            int r0 = r10 - r1
            int r1 = r8.t
            int r2 = r8.u
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> La3
            r3.<init>()     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "x"
            org.json.JSONObject r3 = r3.put(r5, r9)     // Catch: org.json.JSONException -> La3
            java.lang.String r5 = "y"
            org.json.JSONObject r0 = r3.put(r5, r0)     // Catch: org.json.JSONException -> La3
            java.lang.String r3 = "width"
            org.json.JSONObject r0 = r0.put(r3, r1)     // Catch: org.json.JSONException -> La3
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> La3
            java.lang.Object r1 = r8.g     // Catch: org.json.JSONException -> La3
            ag2 r1 = (defpackage.ag2) r1     // Catch: org.json.JSONException -> La3
            java.lang.String r2 = "onDefaultPositionReceived"
            r1.c(r2, r0)     // Catch: org.json.JSONException -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r1 = "Error occurred while dispatching default position."
            defpackage.gi2.c0(r1, r0)
        La9:
            sg2 r0 = r4.s
            o82 r0 = r0.C
            if (r0 == 0) goto Lb3
            r0.k = r9
            r0.l = r10
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q82.K(int, int):void");
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.m = new DisplayMetrics();
        Display defaultDisplay = this.k.getDefaultDisplay();
        defaultDisplay.getMetrics(this.m);
        this.n = this.m.density;
        this.q = defaultDisplay.getRotation();
        j63 j63Var = sv1.f.a;
        this.o = Math.round(r11.widthPixels / this.m.density);
        this.p = Math.round(r11.heightPixels / this.m.density);
        jg2 jg2Var = this.i;
        og2 og2Var = jg2Var.f;
        Activity activityG = jg2Var.g();
        if (activityG == null || activityG.getWindow() == null) {
            this.r = this.o;
            this.s = this.p;
        } else {
            lf4 lf4Var = hg4.C.c;
            int[] iArrP = lf4.p(activityG);
            this.r = Math.round(iArrP[0] / this.m.density);
            this.s = Math.round(iArrP[1] / this.m.density);
        }
        if (og2Var.x().b()) {
            this.t = this.o;
            this.u = this.p;
        } else {
            jg2Var.measure(0, 0);
        }
        J(this.o, this.p, this.r, this.s, this.n, this.q);
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        sq0 sq0Var = this.l;
        boolean zT = sq0Var.t(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        boolean zT2 = sq0Var.t(intent2);
        boolean zT3 = sq0Var.t(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        Context context = (Context) sq0Var.g;
        try {
            jSONObjectPut = new JSONObject().put("sms", zT2).put("tel", zT).put("calendar", zT3).put("storePicture", ((Boolean) yb.u(context, gz1.b)).booleanValue() && za1.a(context).f.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0).put("inlineVideo", true);
        } catch (JSONException e) {
            gi2.c0("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        jg2Var.c("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        jg2Var.getLocationOnScreen(iArr);
        sv1 sv1Var = sv1.f;
        j63 j63Var2 = sv1Var.a;
        int i = iArr[0];
        Context context2 = this.j;
        K(j63Var2.h(context2, i), sv1Var.a.h(context2, iArr[1]));
        if (gi2.q0(2)) {
            gi2.f0("Dispatching Ready Event.");
        }
        try {
            ((ag2) this.g).c("onReadyEventReceived", new JSONObject().put("js", og2Var.j.f));
        } catch (JSONException e2) {
            gi2.c0("Error occurred while dispatching ready Event.", e2);
        }
    }
}
