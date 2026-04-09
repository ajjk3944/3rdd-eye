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

        public emc(int i, double d6, double d7, long j6) {
            this.emc = i;
            this.ypw = d6;
            this.xq = d7;
            this.dg = j6;
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
        int i;
        int i3;
        int i6;
        int i7;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (ypw.ypw(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i = point.x) >= (i3 = iArr[0]) && i <= childAt.getWidth() + i3 && (i6 = point.y) >= (i7 = iArr[1]) && i6 <= childAt.getHeight() + i7;
                }
                if (emc(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void emc(View view, float f2, float f5, float f6, float f7, SparseArray<emc> sparseArray, boolean z6);

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
