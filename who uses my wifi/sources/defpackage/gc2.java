package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gc2 extends f74 {
    public final /* synthetic */ int i = 0;
    public final Object j;

    public gc2(Context context) {
        super(6);
        this.j = context;
    }

    @Override // defpackage.f74
    public final void p1() {
        boolean zB;
        BitmapDrawable bitmapDrawable;
        switch (this.i) {
            case 0:
                try {
                    zB = k3.b((Context) this.j);
                } catch (IOException | IllegalStateException | nz e) {
                    gi2.c0("Fail to get isAdIdFakeForDebugLogging", e);
                    zB = false;
                }
                synchronized (wb4.b) {
                    wb4.c = true;
                    wb4.d = zB;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(zB).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(zB);
                gi2.i0(sb.toString());
                return;
            case 1:
                gd2 gd2Var = (gd2) this.j;
                Context context = gd2Var.e;
                String str = gd2Var.f.f;
                p21 p21Var = new p21();
                p21Var.h = context;
                p21Var.i = str;
                p21Var.f = (String) uk2.j.w();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                p21Var.g = linkedHashMap;
                linkedHashMap.put("s", "gmob_sdk");
                linkedHashMap.put("v", "3");
                linkedHashMap.put("os", Build.VERSION.RELEASE);
                linkedHashMap.put("api_v", Build.VERSION.SDK);
                hg4 hg4Var = hg4.C;
                lf4 lf4Var = hg4Var.c;
                linkedHashMap.put("device", lf4.O());
                linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
                linkedHashMap.put("is_lite_sdk", true != lf4.f(context) ? "0" : "1");
                ug0 ug0Var = hg4Var.p;
                ug0Var.getClass();
                n70 n70VarC = md2.a.c(new gs1(ug0Var, context));
                try {
                    linkedHashMap.put("network_coarse", Integer.toString(((ia2) n70VarC.get()).j));
                    linkedHashMap.put("network_fine", Integer.toString(((ia2) n70VarC.get()).k));
                } catch (Exception e2) {
                    hg4.C.h.d("CsiConfiguration.CsiConfiguration", e2);
                }
                iz1 iz1Var = mz1.ec;
                tw1 tw1Var = tw1.e;
                kz1 kz1Var = tw1Var.c;
                kz1 kz1Var2 = tw1Var.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) p21Var.g;
                    lf4 lf4Var2 = hg4.C.c;
                    linkedHashMap2.put("is_bstar", true != lf4.d(context) ? "0" : "1");
                }
                if (((Boolean) kz1Var2.a(mz1.ja)).booleanValue() && ((Boolean) kz1Var2.a(mz1.z2)).booleanValue()) {
                    hg4 hg4Var2 = hg4.C;
                    if (!yc0.s(hg4Var2.h.g)) {
                        ((LinkedHashMap) p21Var.g).put("plugin", hg4Var2.h.g);
                    }
                }
                synchronized (gd2Var.a) {
                    try {
                        ts0 ts0Var = hg4.C.m;
                        ts0.n(gd2Var.h, p21Var);
                    } catch (IllegalArgumentException unused) {
                        gi2.q0(5);
                    }
                }
                return;
            default:
                jh1 jh1Var = (jh1) this.j;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) hg4.C.w.g).get(Integer.valueOf(jh1Var.h.t.k));
                if (bitmap != null) {
                    zb4 zb4Var = jh1Var.h.t;
                    boolean z = zb4Var.i;
                    float f = zb4Var.j;
                    Activity activity = jh1Var.g;
                    if (!z || f <= 0.0f || f > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused2) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    lf4.l.post(new sz2(this, bitmapDrawable, 22));
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc2(jh1 jh1Var) {
        super(6);
        this.j = jh1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc2(gd2 gd2Var) {
        super(6);
        Objects.requireNonNull(gd2Var);
        this.j = gd2Var;
    }
}
