package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xw extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18524c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18525d;

    public xw(Context context) {
        super(10);
        this.f18525d = context;
    }

    private final void C() {
        zw zwVar = (zw) this.f18525d;
        aw awVar = new aw(zwVar.f19197e, zwVar.f19198f.f38129a);
        synchronized (zwVar.f19193a) {
            try {
                w5 w5Var = ua.j.C.f35269m;
                w5.t(zwVar.f19199h, awVar);
            } catch (IllegalArgumentException e2) {
                za.i.i("Cannot config CSI reporter.", e2);
            }
        }
    }

    @Override // a8.a
    public final void z() {
        boolean isAdIdFakeForDebugLogging;
        BitmapDrawable bitmapDrawable;
        switch (this.f18524c) {
            case 0:
                C();
                return;
            case 1:
                xa.i iVar = (xa.i) this.f18525d;
                ol.d dVar = ua.j.C.f35279w;
                Bitmap bitmap = (Bitmap) dVar.f30585a.get(Integer.valueOf(iVar.f37045c.f9031o.f35249f));
                if (bitmap != null) {
                    ua.f fVar = iVar.f37045c.f9031o;
                    boolean z3 = fVar.f35247d;
                    float f10 = fVar.f35248e;
                    Activity activity = iVar.f37044b;
                    if (!z3 || f10 <= 0.0f || f10 > 25.0f) {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    } else {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f10);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                    }
                    ya.f0.f37440l.post(new fb.r(22, this, bitmapDrawable));
                    return;
                }
                return;
            default:
                try {
                    isAdIdFakeForDebugLogging = AdvertisingIdClient.getIsAdIdFakeForDebugLogging((Context) this.f18525d);
                } catch (IOException | IllegalStateException | nb.g | nb.h e2) {
                    za.i.f("Fail to get isAdIdFakeForDebugLogging", e2);
                    isAdIdFakeForDebugLogging = false;
                }
                synchronized (za.f.f38143b) {
                    za.f.f38144c = true;
                    za.f.f38145d = isAdIdFakeForDebugLogging;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(isAdIdFakeForDebugLogging).length() + 38);
                sb2.append("Update ad debug logging enablement as ");
                sb2.append(isAdIdFakeForDebugLogging);
                za.i.h(sb2.toString());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(zw zwVar) {
        super(10);
        Objects.requireNonNull(zwVar);
        this.f18525d = zwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw(xa.i iVar) {
        super(10);
        this.f18525d = iVar;
    }
}
