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
        int i = 0;
        linearLayout.setOrientation(0);
        ypw(listXq.get(0).uym);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(80);
        this.msw.addView(linearLayout2);
        List<String> listSup = sup();
        while (i < listXq.size()) {
            ru.emc emcVar = listXq.get(i);
            TextView textView = new TextView(context);
            emc(textView, emcVar, (listSup == null || i >= listSup.size()) ? "" : listSup.get(i));
            int i3 = emcVar.ycc;
            if (i3 != 0) {
                this.zz.bottomMargin = (int) (com.bytedance.adsdk.ypw.ycc.ycc.emc() * i3);
                linearLayout2.addView(textView, this.zz);
            } else {
                linearLayout2.addView(textView);
            }
            i++;
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
                for (int i = 0; i < listXq.size(); i++) {
                    ru.emc emcVar = listXq.get(i);
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

    private void xq(float f2) {
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
        int i = 0;
        while (i < listXq.size()) {
            ru.emc emcVar = listXq.get(i);
            TextView textView = (TextView) linearLayout.getChildAt(i);
            this.gbl.add(textView);
            emc(textView, emcVar, (listSup == null || i >= listSup.size()) ? "" : listSup.get(i));
            i++;
        }
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < listXq.size(); i3++) {
            ru.emc emcVar2 = listXq.get(i3);
            TextView textView2 = this.gbl.get(i3);
            textView2.setAlpha(f2);
            linearLayout.setAlpha(f2);
            int i6 = emcVar2.ycc;
            if (i6 != 0) {
                this.zz.bottomMargin = (int) (com.bytedance.adsdk.ypw.ycc.ycc.emc() * i6);
                linearLayout.addView(textView2, this.zz);
            } else {
                linearLayout.addView(textView2);
            }
        }
        this.msw.setAlpha(f2);
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
        if (str.equals("left")) {
            this.msw.setGravity(3);
        } else if (str.equals("right")) {
            this.msw.setGravity(5);
        } else {
            this.msw.setGravity(17);
        }
    }

    @Override // com.bytedance.adsdk.ypw.xq.xq.dg, com.bytedance.adsdk.ypw.xq.xq.emc
    public void ypw(Canvas canvas, Matrix matrix, int i) {
        if (this.msw != null) {
            canvas.save();
            canvas.concat(matrix);
            emc(i);
            xq(ycc());
            this.msw.draw(canvas);
            canvas.restore();
            return;
        }
        super.ypw(canvas, matrix, i);
    }

    private static void emc(View view, int i, int i3) {
        view.layout(0, 0, i, i3);
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void emc(String str) {
        this.sup = str;
    }
}
