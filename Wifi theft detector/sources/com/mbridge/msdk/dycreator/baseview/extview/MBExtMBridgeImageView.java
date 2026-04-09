package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.b;
import com.mbridge.msdk.dycreator.engine.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MBExtMBridgeImageView extends MBridgeImageView implements InterBase {

    /* renamed from: s, reason: collision with root package name */
    private Map<String, String> f14349s;

    /* renamed from: t, reason: collision with root package name */
    private Map<String, Boolean> f14350t;

    /* renamed from: u, reason: collision with root package name */
    private String f14351u;

    /* renamed from: v, reason: collision with root package name */
    private int f14352v;

    /* renamed from: w, reason: collision with root package name */
    private int f14353w;

    /* renamed from: x, reason: collision with root package name */
    private int f14354x;

    /* renamed from: y, reason: collision with root package name */
    private int f14355y;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeImageView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14356a;

        static {
            int[] iArr = new int[c.values().length];
            f14356a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14356a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14356a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14356a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14356a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14356a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14356a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14356a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14356a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14356a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14356a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14356a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14356a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14356a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14356a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14356a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBExtMBridgeImageView(Context context) {
        super(context);
        this.f14351u = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                int i11 = AnonymousClass1.f14356a[cVar.ordinal()];
                if (i11 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i10);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i11 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i10);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = b.a().a(attributeValue2);
                    }
                } else if (i11 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i10);
                    if (attributeValue3.startsWith("f") || attributeValue3.startsWith("m")) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = b.a().a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f14349s;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f14349s.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f14349s;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f14349s.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f14349s;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f14349s.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f14349s;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f14349s.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f14349s;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f14349s.get("mbridgeStrategy");
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f14350t;
        if (map != null && map.containsKey("mbridgeAttached") && this.f14350t.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f14351u);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f14350t;
        if (map != null && map.containsKey("mbridgeDetached") && this.f14350t.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f14351u);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) throws NumberFormatException {
        String[] strArrSplit;
        HashMap<String, c> mapC = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            c cVar = mapC.get(attributeSet.getAttributeName(i10));
            if (cVar != null) {
                switch (AnonymousClass1.f14356a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i10);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i10), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i10);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit == null || strArrSplit.length > 2) {
                                if (strArrSplit == null || strArrSplit.length != 3) {
                                    setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                    break;
                                } else {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                        setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                        break;
                                    }
                                }
                            } else {
                                setBackgroundColor(b.a().d(attributeSet.getAttributeValue(i10)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.utils.b.f14595a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.utils.b.f14595a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i10);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int iA = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f14355y = iA;
                        this.f14354x = iA;
                        this.f14353w = iA;
                        this.f14352v = iA;
                        setPadding(iA, iA, iA, iA);
                        break;
                    case 9:
                        int iA2 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f14353w = iA2;
                        setPadding(this.f14352v, iA2, this.f14354x, this.f14355y);
                        break;
                    case 10:
                        int iA3 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f14355y = iA3;
                        setPadding(this.f14352v, this.f14353w, this.f14354x, iA3);
                        break;
                    case 11:
                        int iA4 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f14352v = iA4;
                        setPadding(iA4, this.f14353w, this.f14354x, this.f14355y);
                        break;
                    case 12:
                        int iA5 = b.a().a(attributeSet.getAttributeValue(i10));
                        this.f14354x = iA5;
                        setPadding(this.f14352v, this.f14353w, iA5, this.f14355y);
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f14350t = com.mbridge.msdk.dycreator.utils.c.a(str);
        if (campaignEx != null) {
            this.f14351u = campaignEx.getCampaignUnitId();
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f14351u = "";
        try {
            this.f14349s = com.mbridge.msdk.dycreator.utils.c.a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
            com.mbridge.msdk.dycreator.utils.c.a(this.f14349s, this);
        } catch (Exception e10) {
            q0.b("MBExtMBridgeImageView", e10.getMessage());
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14351u = "";
    }
}
