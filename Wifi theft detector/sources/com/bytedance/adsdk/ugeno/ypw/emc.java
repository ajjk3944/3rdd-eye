package com.bytedance.adsdk.ugeno.ypw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.uym.msw;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public class emc<E extends ViewGroup> extends xq {
    protected List<xq<View>> emc;

    public emc(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public xq dg(String str) {
        xq<T> xqVarMsw;
        if (!TextUtils.isEmpty(str) && sz(str) != null) {
            return this;
        }
        for (xq<View> xqVar : this.emc) {
            if (xqVar != null && (xqVarMsw = xqVar.msw(str)) != 0) {
                return xqVarMsw;
            }
        }
        return null;
    }

    public void emc(xq xqVar) {
        if (xqVar == null) {
            return;
        }
        this.emc.add(xqVar);
        View viewGbl = xqVar.gbl();
        if (viewGbl != null) {
            ((ViewGroup) this.bw).addView(viewGbl);
        }
    }

    public C0102emc ru() {
        return new C0102emc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public xq xq(String str) {
        xq<T> xqVarUym;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.sup) && this.cn == 0) {
            return this;
        }
        if (this.cn != 0) {
            return null;
        }
        for (xq<View> xqVar : this.emc) {
            if (xqVar != null && (xqVarUym = xqVar.uym(str)) != 0) {
                return xqVarUym;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public void ypw() throws JSONException {
        super.ypw();
    }

    public List<xq<View>> zz() {
        return this.emc;
    }

    public emc(Context context, emc emcVar) {
        super(context, emcVar);
        this.emc = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public xq ypw(String str) {
        xq<T> xqVarYcc;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.sup)) {
            return this;
        }
        for (xq<View> xqVar : this.emc) {
            if (xqVar != null && (xqVarYcc = xqVar.ycc(str)) != 0) {
                return xqVarYcc;
            }
        }
        return null;
    }

    public void emc(xq xqVar, ViewGroup.LayoutParams layoutParams) {
        if (xqVar == null) {
            return;
        }
        this.emc.add(xqVar);
        View viewGbl = xqVar.gbl();
        if (viewGbl != null) {
            ((ViewGroup) this.bw).addView(viewGbl, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ypw.xq
    public xq emc(String str) {
        xq<T> xqVarBw;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.gbl)) {
            return this;
        }
        for (xq<View> xqVar : this.emc) {
            if (xqVar != null && (xqVarBw = xqVar.bw(str)) != 0) {
                return xqVarBw;
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ypw.emc$emc, reason: collision with other inner class name */
    public static class C0102emc {

        /* renamed from: aa, reason: collision with root package name */
        protected boolean f9215aa;
        protected float bw;
        protected boolean cf;
        protected emc ee;
        protected float gbl;
        protected ViewGroup.LayoutParams hxp;
        protected float msw;
        protected float qh;
        protected boolean rie;
        protected float ru;
        protected boolean sba;
        protected boolean sra;
        protected float sup;
        protected float sz;
        protected boolean ul;
        protected float uym;
        protected boolean vk;
        protected float ycc;
        protected boolean ylm;
        protected boolean yzg;
        protected float zz;
        protected float emc = -2.0f;
        protected float ypw = -2.0f;
        protected float xq = 0.0f;
        protected float dg = 0.0f;

        public C0102emc(emc emcVar) {
            this.ee = emcVar;
        }

        public void emc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.gbl = msw.emc(context, str2);
                    this.vk = true;
                    break;
                case "minWidth":
                    this.xq = msw.emc(context, str2);
                    break;
                case "height":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ypw = msw.emc(context, str2);
                            break;
                        } else {
                            this.ypw = -2.0f;
                            break;
                        }
                    } else {
                        this.ypw = -1.0f;
                        break;
                    }
                case "margin":
                    this.bw = msw.emc(context, str2);
                    break;
                case "marginTop":
                    this.msw = msw.emc(context, str2);
                    this.sra = true;
                    break;
                case "padding":
                    this.ru = msw.emc(context, str2);
                    this.cf = true;
                    break;
                case "marginBottom":
                    this.zz = msw.emc(context, str2);
                    this.rie = true;
                    break;
                case "minHeight":
                    this.dg = msw.emc(context, str2);
                    break;
                case "paddingTop":
                    this.sup = msw.emc(context, str2);
                    this.sba = true;
                    break;
                case "width":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.emc = msw.emc(context, str2);
                            break;
                        } else {
                            this.emc = -2.0f;
                            break;
                        }
                    } else {
                        this.emc = -1.0f;
                        break;
                    }
                case "paddingBottom":
                    this.qh = msw.emc(context, str2);
                    this.yzg = true;
                    break;
                case "paddingRight":
                    this.sz = msw.emc(context, str2);
                    this.f9215aa = true;
                    break;
                case "marginRight":
                    this.uym = msw.emc(context, str2);
                    this.ylm = true;
                    break;
                case "marginLeft":
                    this.ycc = msw.emc(context, str2);
                    this.ul = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.emc + ", mHeight=" + this.ypw + ", mMargin=" + this.bw + ", mMarginLeft=" + this.ycc + ", mMarginRight=" + this.uym + ", mMarginTop=" + this.msw + ", mMarginBottom=" + this.zz + ", mParams=" + this.hxp + '}';
        }

        public ViewGroup.LayoutParams emc() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.emc, (int) this.ypw);
            marginLayoutParams.leftMargin = (int) (this.ul ? this.ycc : this.bw);
            marginLayoutParams.rightMargin = (int) (this.ylm ? this.uym : this.bw);
            marginLayoutParams.topMargin = (int) (this.sra ? this.msw : this.bw);
            marginLayoutParams.bottomMargin = (int) (this.rie ? this.zz : this.bw);
            return marginLayoutParams;
        }
    }
}
