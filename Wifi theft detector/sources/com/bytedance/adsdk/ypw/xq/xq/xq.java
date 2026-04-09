package com.bytedance.adsdk.ypw.xq.xq;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ypw.ru;
import com.bytedance.adsdk.ypw.ul;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends dg {
    private final List<TextView> gbl;
    private LinearLayout msw;
    private final List<String> ru;
    private String sup;
    private final LinearLayout.LayoutParams zz;

    public xq(com.bytedance.adsdk.ypw.zz zzVar, bw bwVar, Context context) {
        List<ru.emc> listXq;
        super(zzVar, bwVar);
        this.zz = new LinearLayout.LayoutParams(-2, -2);
        this.ru = new ArrayList();
        this.gbl = new ArrayList();
        com.bytedance.adsdk.ypw.ru ruVar = ((dg) this).uym;
        if (ruVar == null || (listXq = ruVar.xq()) == null || listXq.size() <= 0) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.msw = linearLayout;
        int i10 = 0;
        linearLayout.setOrientation(0);
        ypw(listXq.get(0).uym);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.msw.addView(linearLayout2);
        List<String> listSup = sup();
        while (i10 < listXq.size()) {
            ru.emc emcVar = listXq.get(i10);
            TextView textView = new TextView(context);
            emc(textView, emcVar, (listSup == null || i10 >= listSup.size()) ? "" : listSup.get(i10));
            int i11 = emcVar.ycc;
            if (i11 != 0) {
                this.zz.bottomMargin = (int) (i11 * com.bytedance.adsdk.ypw.ycc.ycc.emc());
                linearLayout2.addView(textView, this.zz);
            } else {
                linearLayout2.addView(textView);
            }
            i10++;
        }
        float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
        emc(this.msw, (int) (((dg) this).uym.emc() * fEmc), (int) (((dg) this).uym.ypw() * fEmc));
    }

    private void emc(TextView textView, ru.emc emcVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(emcVar.xq)) {
            textView.setTextColor(Color.parseColor(emcVar.xq));
        }
        if (!TextUtils.isEmpty(emcVar.dg)) {
            textView.setBackgroundColor(Color.parseColor(emcVar.dg));
        }
        textView.setGravity(17);
        textView.setTextSize(emcVar.bw);
    }

    private List<String> sup() {
        com.bytedance.adsdk.ypw.zz zzVar;
        ul ulVarHxp;
        List<ru.emc> listXq;
        if (((dg) this).uym == null || (zzVar = this.ypw) == null || (ulVarHxp = zzVar.hxp()) == null) {
            return null;
        }
        String strDg = ((dg) this).uym.dg();
        if ((!TextUtils.isEmpty(strDg) || !TextUtils.isEmpty(this.sup)) && (listXq = ((dg) this).uym.xq()) != null) {
            String strEmc = this.sup;
            if (TextUtils.isEmpty(strEmc)) {
                strEmc = ulVarHxp.emc(strDg);
            }
            if (!TextUtils.isEmpty(strEmc)) {
                int length = strEmc.length();
                this.ru.clear();
                for (int i10 = 0; i10 < listXq.size(); i10++) {
                    ru.emc emcVar = listXq.get(i10);
                    int iMax = emcVar.emc;
                    int iMax2 = emcVar.ypw;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.ru.add("");
                    } else {
                        if (listXq.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.ru.add(strEmc.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.ru;
            }
        }
        return null;
    }

    private void xq(float f10) {
        List<ru.emc> listXq;
        com.bytedance.adsdk.ypw.ru ruVar = ((dg) this).uym;
        if (ruVar == null || (listXq = ruVar.xq()) == null || listXq.size() <= 0) {
            return;
        }
        this.msw.setOrientation(0);
        this.msw.setGravity(17);
        if (this.msw.getChildCount() <= 0) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) this.msw.getChildAt(0);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(80);
        this.msw.removeAllViews();
        if (linearLayout.getChildCount() != listXq.size()) {
            return;
        }
        List<String> listSup = sup();
        this.gbl.clear();
        int i10 = 0;
        while (i10 < listXq.size()) {
            ru.emc emcVar = listXq.get(i10);
            TextView textView = (TextView) linearLayout.getChildAt(i10);
            this.gbl.add(textView);
            emc(textView, emcVar, (listSup == null || i10 >= listSup.size()) ? "" : listSup.get(i10));
            i10++;
        }
        linearLayout.removeAllViews();
        for (int i11 = 0; i11 < listXq.size(); i11++) {
            ru.emc emcVar2 = listXq.get(i11);
            TextView textView2 = this.gbl.get(i11);
            textView2.setAlpha(f10);
            linearLayout.setAlpha(f10);
            int i12 = emcVar2.ycc;
            if (i12 != 0) {
                this.zz.bottomMargin = (int) (i12 * com.bytedance.adsdk.ypw.ycc.ycc.emc());
                linearLayout.addView(textView2, this.zz);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.msw.setAlpha(f10);
        this.msw.addView(linearLayout);
        float fEmc = com.bytedance.adsdk.ypw.ycc.ycc.emc();
        emc(this.msw, (int) (((dg) this).uym.emc() * fEmc), (int) (((dg) this).uym.ypw() * fEmc));
    }

    private void ypw(String str) {
        if (TextUtils.isEmpty(str)) {
            this.msw.setGravity(17);
            return;
        }
        str.getClass();
        if (str.equals(TtmlNode.LEFT)) {
            this.msw.setGravity(3);
        } else if (str.equals(TtmlNode.RIGHT)) {
            this.msw.setGravity(5);
        } else {
            this.msw.setGravity(17);
        }
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.dg, com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i10) {
        if (this.msw != null) {
            canvas.save();
            canvas.concat(matrix);
            emc(i10);
            xq(ycc());
            this.msw.draw(canvas);
            canvas.restore();
            return;
        }
        super.ypw(canvas, matrix, i10);
    }

    private static void emc(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void emc(String str) {
        this.sup = str;
    }
}
