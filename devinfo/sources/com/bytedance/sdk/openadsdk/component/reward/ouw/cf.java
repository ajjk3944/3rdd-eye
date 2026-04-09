package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import je.u;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7938lh;
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouw;
    protected int vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static abstract class ouw implements View.OnLayoutChangeListener {
        private int ouw;
        private int vt;

        private ouw() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = i11 - i4;
            int i18 = i12 - i10;
            if (i17 == this.ouw && i18 == this.vt) {
                return;
            }
            this.ouw = i17;
            this.vt = i18;
            ouw();
        }

        public abstract void ouw();

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    public cf(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.vt = 0;
        this.f7938lh = false;
        this.ouw = ouwVar;
        ouwVar.f7969vh = ouwVar.vt.ex();
        ouwVar.ucs = ouw(ouwVar.jvy, ouwVar.vt);
        try {
            this.vt = osn.vt(ouwVar.jvy, osn.ouw());
            if (!ouwVar.jvy.getWindow().hasFeature(1)) {
                ouwVar.jvy.requestWindowFeature(1);
            }
            ouwVar.jvy.getWindow().addFlags(16777344);
            if (ouwVar.ucs == 2 || !osn.lh(ouwVar.jvy)) {
                ouwVar.jvy.getWindow().addFlags(Segment.SHARE_MINIMUM);
            }
            this.f7938lh = ouwVar.zjp;
        } catch (Throwable th2) {
            Log.e("TTAD.RFSM", "init: ", th2);
        }
    }

    private static boolean ouw(int i4, int i10) {
        return i4 == 2 && i10 == 2;
    }

    public final float lh() {
        return osn.vt(this.ouw.jvy, osn.jg(this.ouw.jvy));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void vt() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.ouw;
        if (ouwVar.ucs != 2) {
            vt(ouwVar.jvy, 1);
        } else if (ouwVar.mt) {
            vt(ouwVar.jvy, 8);
        } else {
            vt(ouwVar.jvy, 0);
        }
    }

    public final float yu() {
        return osn.vt(this.ouw.jvy, osn.mwh(this.ouw.jvy));
    }

    public final void ouw(jae jaeVar) {
        if (jaeVar == null) {
            return;
        }
        jaeVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.1
            @Override // java.lang.Runnable
            public final void run() {
                View viewFindViewById;
                try {
                    View decorView = cf.this.ouw.jvy.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public static int ouw(Activity activity, vpp vppVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return vppVar.jqy();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt {
        private ouw ouw;

        public final void ouw(Activity activity) {
            Window window;
            if (this.ouw == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.ouw);
            this.ouw = null;
        }

        public final void ouw(final Activity activity, final int i4, final float f10, final boolean z3) {
            if (this.ouw == null) {
                try {
                    final boolean z10 = com.bytedance.sdk.openadsdk.core.zih.yu().qbp() == 1;
                    final boolean zLh = osn.lh(activity);
                    if (zLh || z10) {
                        try {
                            this.ouw = new ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.vt.1
                                boolean ouw;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super((byte) 0);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:46:0x0127 A[Catch: all -> 0x014c, TryCatch #0 {all -> 0x014c, blocks: (B:4:0x000d, B:6:0x0021, B:8:0x0032, B:10:0x0043, B:12:0x004a, B:14:0x004e, B:18:0x0066, B:15:0x0051, B:17:0x0055, B:20:0x0082, B:22:0x0086, B:24:0x0094, B:26:0x00c7, B:28:0x00df, B:30:0x00e7, B:32:0x00f5, B:33:0x00f9, B:44:0x0121, B:46:0x0127, B:47:0x0139, B:49:0x013f, B:34:0x00fc, B:36:0x0100, B:38:0x010e, B:40:0x0112, B:41:0x0118, B:43:0x011c, B:51:0x0143, B:53:0x0147, B:25:0x00ae), top: B:56:0x000b }] */
                                /* JADX WARN: Removed duplicated region for block: B:49:0x013f A[Catch: all -> 0x014c, TryCatch #0 {all -> 0x014c, blocks: (B:4:0x000d, B:6:0x0021, B:8:0x0032, B:10:0x0043, B:12:0x004a, B:14:0x004e, B:18:0x0066, B:15:0x0051, B:17:0x0055, B:20:0x0082, B:22:0x0086, B:24:0x0094, B:26:0x00c7, B:28:0x00df, B:30:0x00e7, B:32:0x00f5, B:33:0x00f9, B:44:0x0121, B:46:0x0127, B:47:0x0139, B:49:0x013f, B:34:0x00fc, B:36:0x0100, B:38:0x010e, B:40:0x0112, B:41:0x0118, B:43:0x011c, B:51:0x0143, B:53:0x0147, B:25:0x00ae), top: B:56:0x000b }] */
                                /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
                                @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.cf.ouw
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void ouw() {
                                    /*
                                        Method dump skipped, instructions count: 333
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.vt.AnonymousClass1.ouw():void");
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.ouw);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    private static void vt(Activity activity, int i4) {
        if (activity.getRequestedOrientation() == i4) {
            return;
        }
        StringBuilder sbW = u.w(i4, "setActivityRequestedOrientation ori =", ",systemOrientation =");
        sbW.append(activity.getResources().getConfiguration().orientation);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", sbW.toString());
        activity.setRequestedOrientation(i4);
    }

    public final float[] ouw(int i4) {
        float[] fArr = new float[2];
        Activity activity = this.ouw.jvy;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.f7938lh && paddingLeft == 0 && paddingTop == 0 && ouw(activity, i4) == 0) {
            int[] iArrOuw = ouw(activity, decorView, i4, osn.lh(activity), com.bytedance.sdk.openadsdk.core.zih.yu().qbp() == 1);
            int i10 = iArrOuw[0];
            paddingTop = iArrOuw[1];
            paddingLeft = i10;
        }
        StringBuilder sbN = c.n(paddingLeft, "getAdContainerSize: paddingLeft = ", " , paddingTop = ", paddingTop, " , mIsAdaptDecorSize = ");
        sbN.append(this.f7938lh);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", sbN.toString());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 35 && this.ouw.vt.ex() == 100.0f) {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArr[0] = osn.vt(activity, fArr[0]);
        float fVt = osn.vt(activity, fArr[1]);
        fArr[1] = fVt;
        if (fArr[0] < 10.0f || fVt < 10.0f) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "get root view size error, so run backup");
            int i12 = this.vt;
            float fYu = yu();
            float fLh = lh();
            int i13 = this.ouw.ucs;
            if ((i13 == 1) != (fYu > fLh)) {
                float f10 = fYu + fLh;
                fLh = f10 - fLh;
                fYu = f10 - fLh;
            }
            if (i13 == 1) {
                fYu -= i12;
            } else {
                fLh -= i12;
            }
            fArr = new float[]{fLh, fYu};
        }
        if (i11 != 26 && i11 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i4) {
                    if (i4 == 2) {
                        float f11 = fArr[0];
                        float f12 = fArr[1];
                        if (f11 < f12) {
                            fArr[1] = f11;
                            fArr[0] = f12;
                        }
                    } else {
                        float f13 = fArr[0];
                        float f14 = fArr[1];
                        if (f13 > f14) {
                            fArr[1] = f13;
                            fArr[0] = f14;
                        }
                    }
                }
            }
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "getAdContainerSize: result = " + fArr[0] + " , " + fArr[1]);
        }
        return fArr;
    }

    public final void ouw() {
        osn.ouw(this.ouw.jvy);
        this.ouw.jvy.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i4) {
                if (i4 == 0) {
                    try {
                        if (cf.this.ouw.jvy.isFinishing()) {
                            return;
                        }
                        cf.this.ouw.jvy.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.cf.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                osn.ouw(cf.this.ouw.jvy);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        qbp.lh("TTAD.RFSM", e2.getMessage());
                    }
                }
            }
        });
    }

    public static int ouw(Activity activity, int i4) {
        int i10 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (ouw(i4, i10)) {
            return Math.abs(osn.jg(activity) - decorView.getWidth());
        }
        return Math.abs(osn.mwh(activity) - decorView.getHeight());
    }

    public static int[] ouw(Activity activity, View view, int i4, boolean z3, boolean z10) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fOuw;
        int i10 = 0;
        if (activity == null || view == null) {
            if (view != null) {
                paddingLeft = view.getPaddingLeft();
                paddingTop = view.getPaddingTop();
                paddingRight = view.getPaddingRight();
                paddingBottom = view.getPaddingBottom();
            } else {
                paddingLeft = 0;
                paddingBottom = 0;
                paddingTop = 0;
                paddingRight = 0;
            }
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", "calculateAdjustedPadding: activity/decorView is null, return current padding + adjustStatus=0");
            return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
        }
        int i11 = activity.getResources().getConfiguration().orientation;
        int paddingLeft2 = view.getPaddingLeft();
        int paddingTop2 = view.getPaddingTop();
        int paddingRight2 = view.getPaddingRight();
        int paddingBottom2 = view.getPaddingBottom();
        StringBuilder sbN = c.n(paddingLeft2, "calculateAdjustedPadding: initial paddingLeft = ", " , paddingTop = ", paddingTop2, " , paddingRight = ");
        sbN.append(paddingRight2);
        sbN.append(" , paddingBottom = ");
        sbN.append(paddingBottom2);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", sbN.toString());
        if (i4 == 1) {
            if (i11 == 1) {
                fOuw = osn.ouw();
                paddingTop2 += (int) fOuw;
                i10 = 1;
            } else {
                paddingLeft2 += (int) osn.ouw();
            }
        } else if (i4 == 2) {
            if (i11 == 2) {
                if (z3) {
                    paddingLeft2 += (int) osn.ouw();
                    i10 = 1;
                }
                if (z10) {
                    fOuw = osn.ouw();
                    paddingTop2 += (int) fOuw;
                    i10 = 1;
                }
            } else {
                paddingTop2 += (int) osn.ouw();
            }
        }
        StringBuilder sbN2 = c.n(i11, "calculateAdjustedPadding: systemOrientation = ", ", orientation = ", i4, ",adjustStatus =");
        u.x(i10, paddingLeft2, ",paddingLeft =", ",paddingTop =", sbN2);
        u.x(paddingTop2, paddingRight2, ",paddingRight =", ",paddingBottom =", sbN2);
        sbN2.append(paddingBottom2);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFSM", sbN2.toString());
        return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i10};
    }
}
