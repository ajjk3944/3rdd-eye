package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.vt.tlj;
import com.bytedance.adsdk.vt.zin;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends yu {

    /* renamed from: cf, reason: collision with root package name */
    public String f7079cf;

    /* renamed from: jg, reason: collision with root package name */
    private final LinearLayout.LayoutParams f7080jg;
    private final List<String> ko;
    private LinearLayout mwh;
    private final List<TextView> rn;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lh(com.bytedance.adsdk.vt.bly r7, com.bytedance.adsdk.vt.lh.lh.fkw r8, android.content.Context r9) {
        /*
            r6 = this;
            r6.<init>(r7, r8)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r7.<init>(r8, r8)
            r6.f7080jg = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.ko = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.rn = r7
            com.bytedance.adsdk.vt.tlj r7 = r6.ryl
            if (r7 == 0) goto Ld4
            java.util.List<com.bytedance.adsdk.vt.tlj$ouw> r7 = r7.ra
            if (r7 == 0) goto Ld4
            int r8 = r7.size()
            if (r8 <= 0) goto Ld4
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r9)
            r6.mwh = r8
            r0 = 0
            r8.setOrientation(r0)
            java.lang.Object r8 = r7.get(r0)
            com.bytedance.adsdk.vt.tlj$ouw r8 = (com.bytedance.adsdk.vt.tlj.ouw) r8
            java.lang.String r8 = r8.ra
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L62
            r8.getClass()
            java.lang.String r1 = "left"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L5b
            java.lang.String r1 = "right"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L54
            goto L62
        L54:
            android.widget.LinearLayout r8 = r6.mwh
            r1 = 5
            r8.setGravity(r1)
            goto L69
        L5b:
            android.widget.LinearLayout r8 = r6.mwh
            r1 = 3
            r8.setGravity(r1)
            goto L69
        L62:
            android.widget.LinearLayout r8 = r6.mwh
            r1 = 17
            r8.setGravity(r1)
        L69:
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r9)
            r8.setOrientation(r0)
            r1 = 80
            r8.setGravity(r1)
            android.widget.LinearLayout r1 = r6.mwh
            r1.addView(r8)
            java.util.List r1 = r6.yu()
        L7f:
            int r2 = r7.size()
            if (r0 >= r2) goto Lbf
            java.lang.Object r2 = r7.get(r0)
            com.bytedance.adsdk.vt.tlj$ouw r2 = (com.bytedance.adsdk.vt.tlj.ouw) r2
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r9)
            if (r1 == 0) goto L9f
            int r4 = r1.size()
            if (r0 >= r4) goto L9f
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto La1
        L9f:
            java.lang.String r4 = ""
        La1:
            ouw(r3, r2, r4)
            int r2 = r2.f7214le
            if (r2 == 0) goto Lb9
            android.widget.LinearLayout$LayoutParams r4 = r6.f7080jg
            float r2 = (float) r2
            float r5 = com.bytedance.adsdk.vt.le.pno.ouw()
            float r5 = r5 * r2
            int r2 = (int) r5
            r4.bottomMargin = r2
            android.widget.LinearLayout$LayoutParams r2 = r6.f7080jg
            r8.addView(r3, r2)
            goto Lbc
        Lb9:
            r8.addView(r3)
        Lbc:
            int r0 = r0 + 1
            goto L7f
        Lbf:
            float r7 = com.bytedance.adsdk.vt.le.pno.ouw()
            android.widget.LinearLayout r8 = r6.mwh
            com.bytedance.adsdk.vt.tlj r9 = r6.ryl
            int r0 = r9.ouw
            float r0 = (float) r0
            float r0 = r0 * r7
            int r0 = (int) r0
            int r9 = r9.vt
            float r9 = (float) r9
            float r9 = r9 * r7
            int r7 = (int) r9
            ouw(r8, r0, r7)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.lh.lh.lh.<init>(com.bytedance.adsdk.vt.bly, com.bytedance.adsdk.vt.lh.lh.fkw, android.content.Context):void");
    }

    private static void ouw(TextView textView, tlj.ouw ouwVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(ouwVar.f7215lh)) {
            textView.setTextColor(Color.parseColor(ouwVar.f7215lh));
        }
        if (!TextUtils.isEmpty(ouwVar.yu)) {
            textView.setBackgroundColor(Color.parseColor(ouwVar.yu));
        }
        textView.setGravity(17);
        textView.setTextSize(ouwVar.fkw);
    }

    private List<String> yu() {
        com.bytedance.adsdk.vt.bly blyVar;
        List<tlj.ouw> list;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar == null || (blyVar = this.vt) == null || blyVar.rn == null) {
            return null;
        }
        String str = tljVar.f7212le;
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f7079cf)) && (list = ((yu) this).ryl.ra) != null) {
            String strOuw = this.f7079cf;
            if (TextUtils.isEmpty(strOuw)) {
                strOuw = zin.ouw(str);
            }
            if (!TextUtils.isEmpty(strOuw)) {
                int length = strOuw.length();
                this.ko.clear();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    tlj.ouw ouwVar = list.get(i4);
                    int iMax = ouwVar.ouw;
                    int iMax2 = ouwVar.vt;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.ko.add("");
                    } else {
                        if (list.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.ko.add(strOuw.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.ko;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.yu, com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i4) {
        List<tlj.ouw> list;
        if (this.mwh == null) {
            super.vt(canvas, matrix, i4);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ouw(i4);
        float f10 = this.tlj;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar != null && (list = tljVar.ra) != null && list.size() > 0) {
            this.mwh.setOrientation(0);
            this.mwh.setGravity(17);
            if (this.mwh.getChildCount() > 0) {
                LinearLayout linearLayout = (LinearLayout) this.mwh.getChildAt(0);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(80);
                this.mwh.removeAllViews();
                if (linearLayout.getChildCount() == list.size()) {
                    List<String> listYu = yu();
                    this.rn.clear();
                    int i10 = 0;
                    while (i10 < list.size()) {
                        tlj.ouw ouwVar = list.get(i10);
                        TextView textView = (TextView) linearLayout.getChildAt(i10);
                        this.rn.add(textView);
                        ouw(textView, ouwVar, (listYu == null || i10 >= listYu.size()) ? "" : listYu.get(i10));
                        i10++;
                    }
                    linearLayout.removeAllViews();
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        tlj.ouw ouwVar2 = list.get(i11);
                        TextView textView2 = this.rn.get(i11);
                        textView2.setAlpha(f10);
                        linearLayout.setAlpha(f10);
                        int i12 = ouwVar2.f7214le;
                        if (i12 != 0) {
                            this.f7080jg.bottomMargin = (int) (com.bytedance.adsdk.vt.le.pno.ouw() * i12);
                            linearLayout.addView(textView2, this.f7080jg);
                        } else {
                            linearLayout.addView(textView2);
                        }
                    }
                    this.mwh.setAlpha(f10);
                    this.mwh.addView(linearLayout);
                    float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
                    LinearLayout linearLayout2 = this.mwh;
                    com.bytedance.adsdk.vt.tlj tljVar2 = ((yu) this).ryl;
                    ouw(linearLayout2, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
                }
            }
        }
        this.mwh.draw(canvas);
        canvas.restore();
    }

    private static void ouw(View view, int i4, int i10) {
        view.layout(0, 0, i4, i10);
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
