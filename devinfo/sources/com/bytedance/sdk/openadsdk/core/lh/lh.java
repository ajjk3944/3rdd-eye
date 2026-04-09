package com.bytedance.sdk.openadsdk.core.lh;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.zih;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class lh implements View.OnClickListener, View.OnTouchListener {
    private static long fkw = 0;

    /* renamed from: lh, reason: collision with root package name */
    private static float f8199lh = 0.0f;
    private static float ouw = 0.0f;
    protected static int uoy = 8;
    private static float vt;
    private static float yu;
    protected View ey;
    protected float ksc = -1.0f;
    protected float jae = -1.0f;

    /* renamed from: od, reason: collision with root package name */
    protected float f8202od = -1.0f;

    /* renamed from: cd, reason: collision with root package name */
    protected float f8200cd = -1.0f;
    protected long uq = -1;

    /* renamed from: pd, reason: collision with root package name */
    protected long f8203pd = -1;
    protected int fvf = -1;
    protected int bs = -1024;
    protected int fak = -1;
    protected boolean osn = true;
    public SparseArray<ouw> rrs = new SparseArray<>();

    /* renamed from: le, reason: collision with root package name */
    private int f8201le = 0;
    private int ra = 0;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {

        /* renamed from: lh, reason: collision with root package name */
        public double f8204lh;
        public int ouw;
        public double vt;
        public long yu;

        public ouw(int i4, double d10, double d11, long j) {
            this.ouw = i4;
            this.vt = d10;
            this.f8204lh = d11;
            this.yu = j;
        }
    }

    static {
        if (zih.ouw() != null) {
            uoy = zih.vt();
        }
        ouw = 0.0f;
        vt = 0.0f;
        f8199lh = 0.0f;
        yu = 0.0f;
        fkw = 0L;
    }

    private boolean ouw(View view, Point point) {
        int i4;
        int i10;
        int i11;
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                View childAt = viewGroup.getChildAt(i13);
                if (vt.vt(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i4 = point.x) >= (i10 = iArr[0]) && i4 <= childAt.getWidth() + i10 && (i11 = point.y) >= (i12 = iArr[1]) && i11 <= childAt.getHeight() + i12;
                }
                if (ouw(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            ouw(view, this.ksc, this.jae, this.f8202od, this.f8200cd, this.rrs, this.osn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lh.lh.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<ouw> sparseArray, boolean z3);

    public final boolean yu() {
        return this.osn;
    }
}
