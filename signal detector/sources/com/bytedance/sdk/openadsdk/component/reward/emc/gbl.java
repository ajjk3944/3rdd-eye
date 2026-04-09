package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class gbl {
    protected int emc;
    private boolean xq;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc ypw;

    public static abstract class emc implements View.OnLayoutChangeListener {
        private int emc;
        private int ypw;

        private emc() {
        }

        public abstract void emc(int i, int i3);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
            int i12 = i6 - i;
            int i13 = i7 - i3;
            if (i12 == this.emc && i13 == this.ypw) {
                return;
            }
            this.emc = i12;
            this.ypw = i13;
            emc(i12, i13);
        }
    }

    public gbl(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.emc = 0;
        this.xq = false;
        this.ypw = emcVar;
        ypw();
        try {
            this.emc = vw.xq(emcVar.mxo, vw.emc());
            if (!emcVar.mxo.getWindow().hasFeature(1)) {
                emcVar.mxo.requestWindowFeature(1);
            }
            emcVar.mxo.getWindow().addFlags(16777344);
            if (emcVar.rqm == 2 || !vw.xq(emcVar.mxo)) {
                emcVar.mxo.getWindow().addFlags(1024);
            }
            this.xq = emcVar.jxk;
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    private float bw() {
        return vw.xq(this.ypw.mxo, vw.sup(this.ypw.mxo));
    }

    private float dg() {
        return vw.xq(this.ypw.mxo, vw.sz(this.ypw.mxo));
    }

    private static boolean emc(int i, int i3) {
        return i == 2 && i3 == 2;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void xq() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        if (emcVar.rqm != 2) {
            ypw(emcVar.mxo, 1);
        } else if (emcVar.ffd) {
            ypw(emcVar.mxo, 8);
        } else {
            ypw(emcVar.mxo, 0);
        }
    }

    private void ypw() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.ypw;
        emcVar.wad = emcVar.ypw.kx();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.ypw;
        emcVar2.rqm = emc(emcVar2.mxo, emcVar2.ypw);
    }

    private float[] ypw(int i) {
        float fBw = bw();
        float fDg = dg();
        int i3 = this.ypw.rqm;
        if ((i3 == 1) != (fBw > fDg)) {
            float f2 = fBw + fDg;
            fDg = f2 - fDg;
            fBw = f2 - fDg;
        }
        if (i3 == 1) {
            fBw -= i;
        } else {
            fDg -= i;
        }
        return new float[]{fDg, fBw};
    }

    public static class ypw {
        private emc emc;

        public void emc(Activity activity) {
            Window window;
            if (this.emc == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.emc);
            this.emc = null;
        }

        public void emc(final Activity activity, final int i, final float f2, final boolean z6) {
            if (this.emc == null) {
                try {
                    final boolean z7 = com.bytedance.sdk.openadsdk.core.aa.dg().yz() == 1;
                    final boolean zXq = vw.xq(activity);
                    if (zXq || z7) {
                        try {
                            this.emc = new emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.ypw.1
                                boolean emc;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void ypw() {
                                    try {
                                        int iXq = gbl.xq(activity, i);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iXq == 0) {
                                            int[] iArrYpw = gbl.ypw(activity, decorView, i, zXq, z7);
                                            if (iArrYpw[4] == 1) {
                                                this.emc = gbl.ypw(decorView, iArrYpw[0], iArrYpw[1], iArrYpw[2], iArrYpw[3], f2);
                                            }
                                        } else if (this.emc) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.emc = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.emc.gbl.emc
                                public void emc(int i3, int i6) {
                                    if (z6) {
                                        ypw();
                                    } else {
                                        emc();
                                    }
                                }

                                /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                private void emc() {
                                    /*
                                        r8 = this;
                                        int r0 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 2
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != r1) goto L2d
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getWidth()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.vw.sz(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                        goto L46
                                    L2d:
                                        android.app.Activity r0 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0.getHeight()     // Catch: java.lang.Throwable -> Lc4
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = com.bytedance.sdk.openadsdk.utils.vw.sup(r2)     // Catch: java.lang.Throwable -> Lc4
                                        int r2 = r2 - r0
                                        int r0 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Lc4
                                    L46:
                                        android.app.Activity r2 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.view.Window r2 = r2.getWindow()     // Catch: java.lang.Throwable -> Lc4
                                        android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r2.getPaddingLeft()     // Catch: java.lang.Throwable -> Lc4
                                        int r4 = r2.getPaddingRight()     // Catch: java.lang.Throwable -> Lc4
                                        int r5 = r2.getPaddingBottom()     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 != 0) goto Lba
                                        int r0 = r2.getPaddingTop()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        r7 = 1
                                        if (r6 != r7) goto L7c
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r7) goto L7c
                                        float r1 = com.bytedance.sdk.openadsdk.utils.vw.emc()     // Catch: java.lang.Throwable -> Lc4
                                    L79:
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r0 = r0 + r1
                                        goto La1
                                    L7c:
                                        int r6 = r3     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        android.app.Activity r6 = r4     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Resources r6 = r6.getResources()     // Catch: java.lang.Throwable -> Lc4
                                        android.content.res.Configuration r6 = r6.getConfiguration()     // Catch: java.lang.Throwable -> Lc4
                                        int r6 = r6.orientation     // Catch: java.lang.Throwable -> Lc4
                                        if (r6 != r1) goto La1
                                        boolean r1 = r5     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto L98
                                        float r1 = com.bytedance.sdk.openadsdk.utils.vw.emc()     // Catch: java.lang.Throwable -> Lc4
                                        int r1 = (int) r1     // Catch: java.lang.Throwable -> Lc4
                                        int r3 = r3 + r1
                                    L98:
                                        boolean r1 = r6     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto La1
                                        float r1 = com.bytedance.sdk.openadsdk.utils.vw.emc()     // Catch: java.lang.Throwable -> Lc4
                                        goto L79
                                    La1:
                                        boolean r1 = r2.isAttachedToWindow()     // Catch: java.lang.Throwable -> Lc4
                                        if (r1 == 0) goto Lac
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.emc = r7     // Catch: java.lang.Throwable -> Lc4
                                    Lac:
                                        float r0 = r7     // Catch: java.lang.Throwable -> Lc4
                                        r1 = 1120403456(0x42c80000, float:100.0)
                                        int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                        if (r0 != 0) goto Lc4
                                        r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                                        r2.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> Lc4
                                        return
                                    Lba:
                                        boolean r0 = r8.emc     // Catch: java.lang.Throwable -> Lc4
                                        if (r0 == 0) goto Lc4
                                        r0 = 0
                                        r2.setPadding(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> Lc4
                                        r8.emc = r0     // Catch: java.lang.Throwable -> Lc4
                                    Lc4:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.ypw.AnonymousClass1.emc():void");
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.emc);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int xq(Activity activity, int i) {
        int i3 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (emc(i, i3)) {
            return Math.abs(vw.sz(activity) - decorView.getWidth());
        }
        return Math.abs(vw.sup(activity) - decorView.getHeight());
    }

    public void emc(sf sfVar) {
        if (sfVar == null) {
            return;
        }
        sfVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = gbl.this.ypw.mxo.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public static int emc(Activity activity, rie rieVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return rieVar.ono();
    }

    private static void ypw(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        int i3 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ypw(View view, int i, int i3, int i6, int i7, float f2) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i, i3, i6, i7);
        if (f2 != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void emc(boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.emc(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] ypw(Activity activity, View view, int i, boolean z6, boolean z7) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fEmc;
        int i3 = 0;
        if (activity != null && view != null) {
            int i6 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i == 1) {
                if (i6 == 1) {
                    fEmc = vw.emc();
                    paddingTop2 += (int) fEmc;
                    i3 = 1;
                } else {
                    paddingLeft2 += (int) vw.emc();
                }
            } else if (i == 2) {
                if (i6 == 2) {
                    if (z6) {
                        paddingLeft2 += (int) vw.emc();
                        i3 = 1;
                    }
                    if (z7) {
                        fEmc = vw.emc();
                        paddingTop2 += (int) fEmc;
                        i3 = 1;
                    }
                } else {
                    paddingTop2 += (int) vw.emc();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i3};
        }
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
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
    }

    public float[] emc(int i) {
        float[] fArrYpw = new float[2];
        Activity activity = this.ypw.mxo;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.xq && paddingLeft == 0 && paddingTop == 0 && xq(activity, i) == 0) {
            int[] iArrYpw = ypw(activity, decorView, i, vw.xq(activity), com.bytedance.sdk.openadsdk.core.aa.dg().yz() == 1);
            int i3 = iArrYpw[0];
            paddingTop = iArrYpw[1];
            paddingLeft = i3;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 35 && this.ypw.ypw.kx() == 100.0f) {
            fArrYpw[0] = decorView.getWidth() - paddingLeft;
            fArrYpw[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrYpw[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrYpw[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrYpw[0] = vw.xq(activity, fArrYpw[0]);
        float fXq = vw.xq(activity, fArrYpw[1]);
        fArrYpw[1] = fXq;
        if (fArrYpw[0] < 10.0f || fXq < 10.0f) {
            fArrYpw = ypw(this.emc);
        }
        if (i6 != 26 && i6 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                    if (i == 2) {
                        float f2 = fArrYpw[0];
                        float f5 = fArrYpw[1];
                        if (f2 < f5) {
                            fArrYpw[1] = f2;
                            fArrYpw[0] = f5;
                        }
                    } else {
                        float f6 = fArrYpw[0];
                        float f7 = fArrYpw[1];
                        if (f6 > f7) {
                            fArrYpw[1] = f6;
                            fArrYpw[0] = f7;
                        }
                    }
                }
            }
            float f8 = fArrYpw[0];
            float f9 = fArrYpw[1];
        }
        return fArrYpw;
    }

    public void emc() {
        vw.emc(this.ypw.mxo);
        this.ypw.mxo.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (gbl.this.ypw.mxo.isFinishing()) {
                            return;
                        }
                        gbl.this.ypw.mxo.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.gbl.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                vw.emc(gbl.this.ypw.mxo);
                            }
                        }, 2500L);
                    } catch (Exception e6) {
                        ul.xq("TTAD.RFSM", e6.getMessage());
                    }
                }
            }
        });
    }
}
