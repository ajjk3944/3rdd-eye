package com.bytedance.adsdk.ugeno.bly.ouw;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.bly.le.vt;
import com.bytedance.adsdk.ugeno.fkw;
import com.bytedance.adsdk.ugeno.ouw;
import com.bytedance.adsdk.ugeno.ra.ouw;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.ra.yu;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw extends vt {
    private boolean baa;
    private String byv;
    private int ehk;
    private boolean fg;
    private String fn;

    /* renamed from: ki, reason: collision with root package name */
    private ouw.C0035ouw f6833ki;
    private String qni;
    private String smu;
    private int xwt;

    public ouw(Context context) {
        super(context);
        this.smu = "row";
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void bs() {
        super.bs();
        if (this.fg) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setTextColor(((vt) this).ln);
        }
        if (this.baa) {
            if (this.qld) {
                ouw(this.yiz);
            } else {
                lh(this.osn);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void fvf() {
        super.fvf();
        if (this.fg) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setTextColor(this.xwt);
        }
        if (this.baa) {
            if (this.qld) {
                ouw(this.f6833ki);
            } else {
                lh(this.ehk);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() throws JSONException {
        super.vt();
        if (!TextUtils.isEmpty(this.qni)) {
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawables(null, null, null, null);
            if (this.qni.startsWith("local://")) {
                try {
                    String strReplace = this.qni.replace("local://", "");
                    Context context = this.vt;
                    vt(ra.ouw(context, yu.vt(context, strReplace)));
                } catch (Throwable unused) {
                }
            } else {
                fkw.ouw().f6878lh.ouw(this.bly, this.qni, new ouw.InterfaceC0033ouw() { // from class: com.bytedance.adsdk.ugeno.bly.ouw.ouw.1
                    @Override // com.bytedance.adsdk.ugeno.ouw.InterfaceC0033ouw
                    public final void ouw(final Bitmap bitmap) {
                        if (bitmap == null) {
                            return;
                        }
                        ra.ouw(new Runnable() { // from class: com.bytedance.adsdk.ugeno.bly.ouw.ouw.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ouw.this.vt(new BitmapDrawable(ouw.this.vt.getResources(), bitmap));
                            }
                        });
                    }
                });
            }
        }
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setGravity(17);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt, com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.smu = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.xwt = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                this.fg = true;
                break;
            case "image":
                this.qni = str2;
                break;
            case "highlightImage":
                this.fn = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.ra.ouw.lh(str2)) {
                    this.qld = true;
                    this.f6833ki = com.bytedance.adsdk.ugeno.ra.ouw.vt(str2);
                } else {
                    this.ehk = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, -16777216);
                    this.qld = false;
                }
                this.baa = true;
                break;
            case "highlightBackgroundImage":
                this.byv = str2;
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public void vt(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.smu;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
                    return;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                break;
            case 113114:
                str.equals("row");
                break;
        }
        ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
