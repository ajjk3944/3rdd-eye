package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import n2.C2687b;
import s2.BinderC2894d;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504Ff extends G.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8144b = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8145c;

    public C0504Ff(Context context) {
        super(4);
        this.f8145c = context;
    }

    private final void l() {
        C0538Hf c0538Hf = (C0538Hf) this.f8145c;
        C1431kf c1431kf = new C1431kf(c0538Hf.f8972e, c0538Hf.f8973f.f23784a);
        synchronized (c0538Hf.f8968a) {
            try {
                C1994v2 c1994v2 = p2.j.f22785C.f22799m;
                C1994v2.r(c0538Hf.f8975h, c1431kf);
            } catch (IllegalArgumentException e6) {
                u2.k.i("Cannot config CSI reporter.", e6);
            }
        }
    }

    @Override // G.m
    public final void j() {
        boolean zB;
        BitmapDrawable bitmapDrawable;
        switch (this.f8144b) {
            case 0:
                l();
                return;
            case 1:
                BinderC2894d binderC2894d = (BinderC2894d) this.f8145c;
                d4.h hVar = p2.j.f22785C.f22809w;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) hVar.f19807b).get(Integer.valueOf(binderC2894d.f23461c.f6853C.f22774f));
                if (bitmap != null) {
                    p2.f fVar = binderC2894d.f23461c.f6853C;
                    boolean z6 = fVar.f22772d;
                    float f2 = fVar.f22773e;
                    Activity activity = binderC2894d.f23460b;
                    if (!z6 || f2 <= 0.0f || f2 > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f2);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    C2911G.f23576l.post(new f1.i(this, 8, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    zB = C2687b.b((Context) this.f8145c);
                } catch (J2.g | IOException | IllegalStateException e6) {
                    u2.k.f("Fail to get isAdIdFakeForDebugLogging", e6);
                    zB = false;
                }
                synchronized (u2.h.f23803b) {
                    u2.h.f23804c = true;
                    u2.h.f23805d = zB;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(zB).length() + 38);
                sb.append("Update ad debug logging enablement as ");
                sb.append(zB);
                u2.k.h(sb.toString());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504Ff(C0538Hf c0538Hf) {
        super(4);
        Objects.requireNonNull(c0538Hf);
        this.f8145c = c0538Hf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0504Ff(BinderC2894d binderC2894d) {
        super(4);
        this.f8145c = binderC2894d;
    }
}
