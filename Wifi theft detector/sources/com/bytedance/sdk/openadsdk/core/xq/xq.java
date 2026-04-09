package com.bytedance.sdk.openadsdk.core.xq;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.aa;

/* loaded from: classes.dex */
public abstract class xq implements View.OnClickListener, View.OnTouchListener {
    private static long bw = 0;
    private static float dg = 0.0f;
    protected static int dr = 8;
    private static float emc;
    private static float xq;
    private static float ypw;
    protected View lt;
    protected float ul = -1.0f;
    protected float ylm = -1.0f;
    protected float sra = -1.0f;
    protected float rie = -1.0f;
    protected long hxp = -1;
    protected long ee = -1;
    protected int db = -1;
    protected int sb = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int sf = -1;
    protected boolean xmt = true;
    public SparseArray<emc> cuf = new SparseArray<>();
    private int ycc = 0;
    private int uym = 0;

    public static class emc {
        public long dg;
        public int emc;
        public double xq;
        public double ypw;

        public emc(int i10, double d10, double d11, long j10) {
            this.emc = i10;
            this.ypw = d10;
            this.xq = d11;
            this.dg = j10;
        }
    }

    static {
        if (aa.emc() != null) {
            dr = aa.ypw();
        }
        emc = 0.0f;
        ypw = 0.0f;
        xq = 0.0f;
        dg = 0.0f;
        bw = 0L;
    }

    private boolean emc(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (ypw.ypw(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (emc(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void emc(View view, float f10, float f11, float f12, float f13, SparseArray<emc> sparseArray, boolean z10);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.uym.emc()) {
            emc(view, this.ul, this.ylm, this.sra, this.rie, this.cuf, this.xmt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.xq.xq.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public boolean ycc() {
        return this.xmt;
    }
}
