package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.util.Log;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends lh {

    /* renamed from: cf, reason: collision with root package name */
    private float f7016cf;

    /* renamed from: jg, reason: collision with root package name */
    private int f7017jg;
    private int ko;
    private int mwh;
    private AtomicBoolean rn;
    private float ryl;
    private String vm;
    private int zih;

    public fkw(Context context) {
        super(context);
        this.mwh = 0;
        this.f7017jg = Integer.MAX_VALUE;
        this.ko = Integer.MAX_VALUE;
        this.rn = new AtomicBoolean(true);
        this.zih = 0;
        this.vm = "up";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ouw(java.lang.Object... r15) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.yu.yu.fkw.ouw(java.lang.Object[]):boolean");
    }

    private boolean ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, float f10, float f11) {
        if (this.f7017jg <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.rn.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.zih == 1 && !ouw(lhVar.fkw, f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.ouw.ouw(this.f7018le, this.f7019lh.vt);
        int i4 = this.f7017jg;
        if (i4 != Integer.MAX_VALUE) {
            this.f7017jg = i4 - 1;
        }
        return true;
    }

    private static boolean ouw(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
