package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.adsdk.ugeno.zz.dg.a;
import com.bytedance.adsdk.ugeno.zz.dg.b;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class dg extends com.bytedance.sdk.openadsdk.core.ycc.bw {
    private TextView bw;
    private aa dg;
    private vk emc;
    private com.bytedance.sdk.openadsdk.component.reward.emc.emc msw;
    private boolean uym;
    private TextView xq;
    private TextView ycc;
    private TextView ypw;

    public static class emc implements com.bytedance.sdk.component.bw.vk {
        private final WeakReference<ImageView> dg;
        private final rie emc;
        private final String xq;
        private final String ypw;

        public emc(ImageView imageView, rie rieVar, String str, String str2) {
            this.dg = new WeakReference<>(imageView);
            this.emc = rieVar;
            this.ypw = str;
            this.xq = str2;
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
            Object objYpw = gblVar.ypw();
            if (objYpw != null) {
                ImageView imageView = this.dg.get();
                if (objYpw instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objYpw);
                    }
                } else if (objYpw instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && a.a(objYpw)) {
                        b.a(objYpw).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objYpw);
                    }
                }
                com.bytedance.sdk.openadsdk.dg.xq.ypw(this.emc, this.xq, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.bw.vk
        public void emc(int i10, String str, @Nullable Throwable th) {
            emc(i10, str, this.ypw);
        }

        private void emc(final int i10, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(new com.bytedance.sdk.component.msw.msw("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("description", i10 + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(emc.this.emc, emc.this.xq, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public dg(@NonNull Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void bw() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(vw.ypw(context, 16.0f), vw.ypw(context, 12.0f), vw.ypw(context, 16.0f), vw.ypw(context, 12.0f));
        aa aaVar = new aa(context);
        this.dg = aaVar;
        aaVar.setBackgroundColor(0);
        this.dg.setId(com.bytedance.sdk.openadsdk.utils.vk.dg);
        addView(this.dg, new LinearLayout.LayoutParams(vw.ypw(context, 48.0f), vw.ypw(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = vw.ypw(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(bwVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        this.bw.setGravity(16);
        this.bw.setSingleLine(true);
        this.bw.setTextSize(2, 17.0f);
        this.bw.setId(com.bytedance.sdk.openadsdk.utils.vk.bw);
        this.bw.setTextColor(-16777216);
        bwVar.addView(this.bw, new LinearLayout.LayoutParams(-1, -2));
        vk vkVar = new vk(context);
        this.emc = vkVar;
        vkVar.setId(com.bytedance.sdk.openadsdk.utils.vk.uym);
        bwVar.addView(this.emc, new LinearLayout.LayoutParams(-2, vw.ypw(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ypw = mswVar2;
        mswVar2.setGravity(17);
        this.ypw.setEllipsize(truncateAt);
        this.ypw.setSingleLine(true);
        this.ypw.setTextColor(-1);
        this.ypw.setTextSize(2, 16.0f);
        this.ypw.setId(520093705);
        this.ypw.setBackground(emc(context));
        this.ypw.setText(this.msw.ypw.xxo());
        addView(this.ypw, new LinearLayout.LayoutParams(vw.ypw(context, 164.0f), vw.ypw(context, 36.0f)));
    }

    private void dg() {
        this.uym = true;
        rie rieVar = this.msw.ypw;
        int iFu = rieVar.fu();
        if ((iFu == 43 || iFu == 44) && dr.ypw(rieVar)) {
            xq();
        } else if (this.msw.rqm == 1) {
            ycc();
        } else {
            bw();
        }
        if (this.ypw == null) {
            this.ypw = (TextView) this.msw.iyl.findViewById(520093705);
        }
        TextView textView = this.ypw;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int width = ((ViewGroup) dg.this.ypw.getParent()).getWidth();
                    if (width > 0) {
                        dg.this.ypw.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!rieVar.ak()) {
                this.ypw.setText(rieVar.pxj() == 3 ? getButtonTextForNewStyleBar() : rieVar.xxo());
            } else if (rieVar.qio() != null && TextUtils.isEmpty(rieVar.qio().ycc())) {
                vw.emc((View) this.ypw, 8);
            }
        }
        if (this.dg != null && rieVar.ya() != null && !TextUtils.isEmpty(rieVar.ya().emc())) {
            String strEmc = rieVar.ya().emc();
            if (rieVar.ak()) {
                com.bytedance.sdk.openadsdk.ru.dg.emc(rieVar.ya()).xq(1).emc(new com.bytedance.sdk.openadsdk.ru.ypw(rieVar, rieVar.ya().emc(), new emc(this.dg, rieVar, strEmc, this.msw.bw)));
                if (rieVar.qio() != null && rieVar.qio().ypw() != null) {
                    rieVar.qio().ypw().ypw(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(rieVar.ya(), this.dg, rieVar);
            }
        }
        TextView textView2 = this.bw;
        if (textView2 != null) {
            textView2.setText(rieVar.xou());
        }
        TextView textView3 = this.ycc;
        if (textView3 != null) {
            textView3.setText(emc(rieVar));
        }
        if (this.xq != null) {
            String strRie = dr.rie(this.msw.ypw);
            if (TextUtils.isEmpty(strRie)) {
                strRie = "Play now";
            }
            this.xq.setText(strRie);
            this.xq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (dg.this.msw != null) {
                        com.bytedance.sdk.openadsdk.component.reward.ypw.emc(dg.this.msw);
                    }
                }
            });
        }
        vk vkVar = this.emc;
        if (vkVar != null) {
            vw.emc((TextView) null, vkVar, rieVar);
        }
        if (this.msw.rqm == 2 && rieVar.pxj() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ypw.getLayoutParams();
            layoutParams.height = vw.ypw(this.msw.vw, 55.0f);
            layoutParams.topMargin = vw.ypw(this.msw.vw, 20.0f);
            this.ypw.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = vw.ypw(this.msw.vw, 12.0f);
            setLayoutParams(layoutParams2);
        }
        ypw();
    }

    private String getCnOrEnBtnText() {
        return this.msw.ypw.sx() != 4 ? "View" : "Install";
    }

    private void ycc() {
        Context context = getContext();
        setPadding(vw.ypw(context, 16.0f), vw.ypw(context, 16.0f), vw.ypw(context, 16.0f), vw.ypw(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(0);
        bwVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = vw.ypw(context, 12.0f);
        addView(bwVar, layoutParams);
        aa aaVar = new aa(context);
        this.dg = aaVar;
        aaVar.setBackgroundColor(0);
        this.dg.setId(com.bytedance.sdk.openadsdk.utils.vk.dg);
        bwVar.addView(this.dg, new LinearLayout.LayoutParams(vw.ypw(context, 48.0f), vw.ypw(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = vw.ypw(context, 12.0f);
        bwVar.addView(bwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        this.bw.setGravity(16);
        this.bw.setSingleLine(true);
        this.bw.setTextSize(2, 17.0f);
        this.bw.setId(com.bytedance.sdk.openadsdk.utils.vk.bw);
        this.bw.setTextColor(-16777216);
        bwVar2.addView(this.bw, new LinearLayout.LayoutParams(-1, -2));
        vk vkVar = new vk(context);
        this.emc = vkVar;
        vkVar.setId(com.bytedance.sdk.openadsdk.utils.vk.uym);
        bwVar2.addView(this.emc, new LinearLayout.LayoutParams(-2, vw.ypw(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ypw = mswVar2;
        mswVar2.setGravity(17);
        this.ypw.setEllipsize(truncateAt);
        this.ypw.setSingleLine(true);
        this.ypw.setTextColor(-1);
        this.ypw.setTextSize(2, 16.0f);
        this.ypw.setId(520093705);
        this.ypw.setBackground(emc(context));
        this.ypw.setText(this.msw.ypw.xxo());
        addView(this.ypw, new LinearLayout.LayoutParams(-1, vw.ypw(context, 36.0f)));
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strXxo;
        String strXq = tp.xq(this.msw.vw);
        if (strXq == null) {
            strXq = "";
        }
        try {
            zEquals = strXq.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.msw.ypw.xxo())) {
            strXxo = this.msw.ypw.sx() != 4 ? "View" : "Install";
        } else {
            strXxo = this.msw.ypw.xxo();
            if (strXxo == null || !tp.ycc(strXxo) || strXxo.length() <= 2) {
                if (strXxo != null && !tp.ycc(strXxo) && strXxo.length() > 7 && zEquals) {
                    strXxo = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strXxo = getCnOrEnBtnText();
            }
        }
        if (zEquals && !tp.ycc(strXxo)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ypw.getLayoutParams();
            layoutParams.bottomMargin = vw.ypw(this.msw.vw, 4.0f);
            this.ypw.setLayoutParams(layoutParams);
        }
        return strXxo;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.uym) {
            return;
        }
        dg();
    }

    public void xq() {
        Context context = getContext();
        int iYpw = vw.ypw(context, 12.0f);
        setPadding(iYpw, iYpw, iYpw, iYpw);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        bwVar.setOrientation(0);
        bwVar.setGravity(16);
        addView(bwVar, layoutParams);
        aa aaVar = new aa(context);
        this.dg = aaVar;
        aaVar.setBackgroundColor(0);
        this.dg.setId(com.bytedance.sdk.openadsdk.utils.vk.dg);
        bwVar.addView(this.dg, new LinearLayout.LayoutParams(vw.ypw(context, 54.0f), vw.ypw(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = vw.ypw(context, 12.0f);
        bwVar.addView(bwVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        this.bw.setGravity(16);
        this.bw.setSingleLine(true);
        this.bw.setTextSize(2, 17.0f);
        this.bw.setId(com.bytedance.sdk.openadsdk.utils.vk.bw);
        this.bw.setTextColor(-16777216);
        bwVar2.addView(this.bw, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ycc = mswVar2;
        mswVar2.setTextColor(-16777216);
        this.ycc.setTextSize(2, 13.0f);
        this.ycc.setMaxLines(2);
        this.ycc.setAlpha(0.8f);
        this.ycc.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = vw.ypw(context, 4.0f);
        bwVar2.addView(this.ycc, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = vw.ypw(context, 12.0f);
        bwVar3.setOrientation(0);
        addView(bwVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.xq = mswVar3;
        mswVar3.setGravity(17);
        this.xq.setEllipsize(truncateAt);
        this.xq.setSingleLine(true);
        this.xq.setTextColor(-16777216);
        this.xq.setTextSize(2, 16.0f);
        this.xq.setBackground(ypw(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, vw.ypw(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = vw.ypw(context, 3.0f);
        bwVar3.addView(this.xq, layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.ypw = mswVar4;
        mswVar4.setGravity(17);
        this.ypw.setEllipsize(truncateAt);
        this.ypw.setSingleLine(true);
        this.ypw.setTextColor(-1);
        this.ypw.setTextSize(2, 16.0f);
        this.ypw.setId(520093705);
        this.ypw.setBackground(xq(context));
        this.ypw.setText(this.msw.ypw.xxo());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, vw.ypw(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = vw.ypw(context, 3.0f);
        bwVar3.addView(this.ypw, layoutParams6);
    }

    private String emc(rie rieVar) {
        return !TextUtils.isEmpty(rieVar.xou()) ? rieVar.xou() : !TextUtils.isEmpty(rieVar.vyk()) ? rieVar.vyk() : "";
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void ypw() {
        com.bytedance.sdk.openadsdk.core.xq.bw bwVarBw = this.msw.db.bw();
        final com.bytedance.sdk.openadsdk.core.xq.ypw ypwVarDg = this.msw.db.dg();
        final rie rieVar = this.msw.ypw;
        if (rieVar.xxs() == null) {
            return;
        }
        if (rieVar.pxj() != 5 && this.ypw != null) {
            if (rieVar.xxs().bw) {
                this.ypw.setOnClickListener(bwVarBw);
                this.ypw.setOnTouchListener(bwVarBw);
            } else {
                this.ypw.setOnClickListener(ypwVarDg);
            }
        }
        if (rieVar.pxj() == 1) {
            if (!rieVar.xxs().emc) {
                vw.emc((View) this, (View.OnClickListener) ypwVarDg, "TTBaseVideoActivity#mRlDownloadBar");
                this.bw.setOnClickListener(ypwVarDg);
                this.emc.setOnClickListener(ypwVarDg);
                this.dg.setOnClickListener(ypwVarDg);
                return;
            }
            vw.emc((View) this, (View.OnClickListener) bwVarBw, "TTBaseVideoActivity#mRlDownloadBar");
            vw.emc((View) this, (View.OnTouchListener) bwVarBw, "TTBaseVideoActivity#mRlDownloadBar");
            this.bw.setOnClickListener(bwVarBw);
            this.bw.setOnTouchListener(bwVarBw);
            this.emc.setOnClickListener(bwVarBw);
            this.emc.setOnTouchListener(bwVarBw);
            this.dg.setOnClickListener(bwVarBw);
            this.dg.setOnTouchListener(bwVarBw);
            return;
        }
        if (rieVar.pxj() != 5) {
            if (!rieVar.xxs().xq) {
                vw.emc((View) this, (View.OnClickListener) ypwVarDg, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                vw.emc((View) this, (View.OnClickListener) bwVarBw, "TTBaseVideoActivity#mRlDownloadBar");
                vw.emc((View) this, (View.OnTouchListener) bwVarBw, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!rieVar.xxs().bw) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = ypwVarDg;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (rieVar.qio() != null) {
                            rieVar.qio().emc().uym(dg.this.msw.ylm.sup());
                        }
                    } else {
                        if (rieVar.qio() == null || rieVar.qio().ypw() == null) {
                            return;
                        }
                        rieVar.qio().ypw().emc(dg.this.msw.ylm.sup());
                    }
                }
            };
            TextView textView = this.ypw;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.bw;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.bw.setOnClickListener(onClickListener);
            }
            aa aaVar = this.dg;
            if (aaVar != null) {
                aaVar.setTag(570425345, "VAST_ICON");
                this.dg.setOnClickListener(ypwVarDg);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.xq.uym uymVar = new com.bytedance.sdk.openadsdk.core.xq.uym("VAST_ACTION_BUTTON", rieVar.qio(), bwVarBw) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.3
        };
        com.bytedance.sdk.openadsdk.core.xq.uym uymVar2 = new com.bytedance.sdk.openadsdk.core.xq.uym(str, rieVar.qio(), bwVarBw) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.dg.4
        };
        TextView textView3 = this.ypw;
        if (textView3 != null) {
            textView3.setOnClickListener(uymVar);
            this.ypw.setOnTouchListener(uymVar);
        }
        aa aaVar2 = this.dg;
        if (aaVar2 != null) {
            aaVar2.setOnClickListener(uymVar2);
            this.dg.setOnTouchListener(uymVar2);
        }
        TextView textView4 = this.bw;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.bw.setOnClickListener(uymVar);
        this.bw.setOnTouchListener(uymVar);
    }

    public void emc() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.msw = emcVar;
        if (emcVar.ypw.pxj() == 1) {
            dg();
        }
    }

    private static Drawable emc(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(vw.ypw(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable ypw(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(vw.ypw(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable xq(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(vw.ypw(context, 8.0f));
        return gradientDrawable;
    }
}
