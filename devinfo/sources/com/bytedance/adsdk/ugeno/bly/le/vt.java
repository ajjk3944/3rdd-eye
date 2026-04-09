package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt extends lh<ouw> {
    private float ajl;
    private TextUtils.TruncateAt baa;
    private int byv;
    private int ehk;
    private int eot;

    @Deprecated
    private TextUtils.TruncateAt fg;
    private int fn;

    /* renamed from: ki, reason: collision with root package name */
    private int f6831ki;
    private float kq;

    @Deprecated
    private float lai;
    protected int ln;
    private boolean mu;
    private float nn;
    protected String ouw;
    private float qni;
    private float sm;
    private float smu;

    /* renamed from: vf, reason: collision with root package name */
    private float f6832vf;

    @Deprecated
    private float xne;
    private int xwt;
    private float zjq;

    public vt(Context context) {
        super(context);
        this.ln = -16777216;
        this.qni = 12.0f;
        this.smu = -1.0f;
        this.byv = Integer.MAX_VALUE;
        this.f6831ki = 8388611;
        this.baa = TextUtils.TruncateAt.END;
        this.nn = -1.0f;
        this.zjq = 400.0f;
    }

    private void ouw(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((ouw) this.fkw).setEllipsize(truncateAt);
    }

    public void ryl(String str) {
        this.ouw = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.ouw = "";
        }
        ((ouw) this.fkw).setText(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void vt() throws JSONException {
        super.vt();
        if (TextUtils.equals("null", this.ouw)) {
            this.ouw = "";
        }
        ryl(this.ouw);
        ((ouw) this.fkw).setTextSize(1, this.qni);
        ((ouw) this.fkw).setTextColor(this.ln);
        ((ouw) this.fkw).setLines(this.ehk);
        ((ouw) this.fkw).setMaxLines(this.byv);
        ((ouw) this.fkw).setGravity(this.f6831ki);
        ((ouw) this.fkw).setIncludeFontPadding(false);
        ((ouw) this.fkw).setMinTextSize(ra.ouw(this.vt, this.smu));
        int i4 = this.xwt;
        this.xwt = i4;
        if (i4 != Integer.MAX_VALUE) {
            ((ouw) this.fkw).setPaintFlags(i4);
        }
        if (ex()) {
            ouw(this.baa);
        } else {
            ouw(this.fg);
        }
        if (this.nn > 0.0f) {
            if (ex()) {
                float f10 = this.nn;
                if (f10 <= 3.0f) {
                    ((ouw) this.fkw).setLineSpacing(0.0f, f10);
                } else if (Build.VERSION.SDK_INT >= 28) {
                    int iRound = Math.round(ra.ouw(this.vt, (f10 - (this.qni * 1.2f)) / 2.0f));
                    int paddingTop = ((ouw) this.fkw).getPaddingTop() + iRound;
                    int paddingBottom = ((ouw) this.fkw).getPaddingBottom() + iRound;
                    T t10 = this.fkw;
                    ((ouw) t10).setPadding(((ouw) t10).getPaddingLeft(), paddingTop, ((ouw) this.fkw).getPaddingRight(), paddingBottom);
                    ((ouw) this.fkw).setLineHeight(Math.round(ra.ouw(this.vt, this.nn)));
                }
            } else {
                ((ouw) this.fkw).setLineSpacing(0.0f, this.nn);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        ((ouw) this.fkw).setBreakStrategy(0);
        if (!ex()) {
            ((ouw) this.fkw).setShadowLayer(this.f6832vf, this.xne, this.lai, this.eot);
        } else if (this.mu) {
            if (this.f6832vf <= 0.0f) {
                this.f6832vf = 1.0E-5f;
            }
            ((ouw) this.fkw).setShadowLayer(this.f6832vf, this.ajl, this.sm, this.eot);
        }
        int i11 = this.fn;
        if (i11 == 1) {
            ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, i11);
        } else if (i10 >= 28) {
            ((ouw) this.fkw).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.zjq, i11 == 2));
        } else if (this.zjq >= 500.0f) {
            ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, 1);
        }
        if (ra.ouw(this.vt, this.qni) > 0.0f) {
            ((ouw) this.fkw).setLetterSpacing(this.kq / ra.ouw(this.vt, this.qni));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0159  */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ouw(java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bly.le.vt.ouw(java.lang.String, java.lang.String):void");
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.ouw = this;
        return ouwVar;
    }
}
