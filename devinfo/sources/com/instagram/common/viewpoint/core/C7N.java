package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.7N, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7N extends AbstractC1484hU {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public AbstractC0780Qm A00;
    public AbstractC0780Qm A01;

    private int A00(R2 r22, View view, AbstractC0780Qm abstractC0780Qm) {
        int containerCenter;
        int iA0F = abstractC0780Qm.A0F(view) + (abstractC0780Qm.A0D(view) / 2);
        if (r22.A1V()) {
            int iA0A = abstractC0780Qm.A0A();
            int childCenter = abstractC0780Qm.A0B();
            containerCenter = iA0A + (childCenter / 2);
        } else {
            int childCenter2 = abstractC0780Qm.A06();
            containerCenter = childCenter2 / 2;
        }
        return iA0F - containerCenter;
    }

    private View A01(R2 r22, AbstractC0780Qm abstractC0780Qm) {
        int i4;
        int iA0Y = r22.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        if (r22.A1V()) {
            int iA0A = abstractC0780Qm.A0A();
            int childCount = abstractC0780Qm.A0B();
            i4 = iA0A + (childCount / 2);
        } else {
            int childCount2 = abstractC0780Qm.A06();
            i4 = childCount2 / 2;
        }
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iA0Y; i11++) {
            View viewA0v = r22.A0v(i11);
            int iA0F = abstractC0780Qm.A0F(viewA0v);
            int childCount3 = abstractC0780Qm.A0D(viewA0v);
            int childCount4 = Math.abs((iA0F + (childCount3 / 2)) - i4);
            if (childCount4 < i10) {
                i10 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = viewA0v;
            }
        }
        return view;
    }

    private View A02(R2 r22, AbstractC0780Qm abstractC0780Qm) {
        int iA0Y = r22.A0Y();
        if (iA0Y == 0) {
            return null;
        }
        View view = null;
        int i4 = Integer.MAX_VALUE;
        if (A02[7].charAt(21) == '9') {
            throw new RuntimeException();
        }
        A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
        for (int childCount = 0; childCount < iA0Y; childCount++) {
            View viewA0v = r22.A0v(childCount);
            int iA0F = abstractC0780Qm.A0F(viewA0v);
            if (iA0F < i4) {
                i4 = iA0F;
                view = viewA0v;
            }
        }
        return view;
    }

    private AbstractC0780Qm A03(R2 r22) {
        if (this.A00 == null || this.A00.A02 != r22) {
            this.A00 = AbstractC0780Qm.A00(r22);
        }
        return this.A00;
    }

    private AbstractC0780Qm A04(R2 r22) {
        if (this.A01 == null || this.A01.A02 != r22) {
            this.A01 = AbstractC0780Qm.A01(r22);
        }
        return this.A01;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.AbstractC1484hU
    public final int A0C(R2 r22, int i4, int i10) {
        int iA0r;
        int centerPosition;
        int iA0b = r22.A0b();
        if (iA0b == 0) {
            return -1;
        }
        View viewA02 = null;
        if (r22.A23()) {
            viewA02 = A02(r22, A04(r22));
        } else if (r22.A22()) {
            viewA02 = A02(r22, A03(r22));
        }
        if (viewA02 == null || (iA0r = r22.A0r(viewA02)) == -1) {
            return -1;
        }
        if (r22.A22()) {
            centerPosition = i4 > 0 ? 1 : 0;
        } else {
            centerPosition = i10 > 0 ? 1 : 0;
        }
        boolean z3 = false;
        if (r22 instanceof RE) {
            int itemCount = iA0b - 1;
            PointF pointFA56 = ((RE) r22).A56(itemCount);
            if (pointFA56 != null) {
                z3 = pointFA56.x < 0.0f || pointFA56.y < 0.0f;
            }
        }
        return z3 ? centerPosition != 0 ? iA0r - 1 : iA0r : centerPosition != 0 ? iA0r + 1 : iA0r;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1484hU
    public final View A0D(R2 r22) {
        if (r22.A23()) {
            return A01(r22, A04(r22));
        }
        if (r22.A22()) {
            View viewA01 = A01(r22, A03(r22));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return viewA01;
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1484hU
    public final C1505hq A0E(R2 r22) {
        if (!(r22 instanceof RE)) {
            return null;
        }
        final Context context = super.A00.getContext();
        return new C1505hq(context) { // from class: com.facebook.ads.redexgen.X.7O
            @Override // com.instagram.common.viewpoint.core.C1505hq, com.instagram.common.viewpoint.core.RF
            public final void A0I(View view, RH rh2, RD rd) {
                int[] iArrA0H = this.A00.A0H(((AbstractC1484hU) this.A00).A00.getLayoutManager(), view);
                int time = iArrA0H[0];
                int dy = iArrA0H[1];
                int dx = A0M(Math.max(Math.abs(time), Math.abs(dy)));
                if (dx > 0) {
                    rd.A04(time, dy, dx, ((C1505hq) this).A04);
                }
            }

            @Override // com.instagram.common.viewpoint.core.C1505hq
            public final float A0J(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // com.instagram.common.viewpoint.core.C1505hq
            public final int A0L(int i4) {
                return Math.min(100, super.A0L(i4));
            }
        };
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1484hU
    public final int[] A0H(R2 r22, View view) {
        int[] iArr = new int[2];
        if (r22.A22()) {
            iArr[0] = A00(r22, view, A03(r22));
        } else {
            iArr[0] = 0;
        }
        if (r22.A23()) {
            iArr[1] = A00(r22, view, A04(r22));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
