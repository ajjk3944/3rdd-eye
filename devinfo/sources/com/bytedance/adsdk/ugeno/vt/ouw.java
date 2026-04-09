package com.bytedance.adsdk.ugeno.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw<E extends ViewGroup> extends lh {
    protected List<lh<View>> ouw;

    public ouw(Context context) {
        this(context, null);
    }

    public C0036ouw bly() {
        return new C0036ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh lh(String str) {
        lh<T> lhVarRa;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.ryl) && this.xdk == 0) {
            return this;
        }
        if (this.xdk != 0) {
            return null;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarRa = lhVar.ra(str)) != 0) {
                return lhVarRa;
            }
        }
        return null;
    }

    public void ouw(lh lhVar) {
        if (lhVar == null) {
            return;
        }
        this.ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((ViewGroup) this.fkw).addView(view);
        }
    }

    public final List<lh<View>> pno() {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void vt() throws JSONException {
        super.vt();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh yu(String str) {
        lh<T> lhVarPno;
        if (!TextUtils.isEmpty(str) && cf(str) != null) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarPno = lhVar.pno(str)) != 0) {
                return lhVarPno;
            }
        }
        return null;
    }

    private ouw(Context context, ouw ouwVar) {
        super(context, ouwVar);
        this.ouw = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh vt(String str) {
        lh<T> lhVarLe;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.ryl)) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarLe = lhVar.le(str)) != 0) {
                return lhVarLe;
            }
        }
        return null;
    }

    public void ouw(lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        this.ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((ViewGroup) this.fkw).addView(view, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh ouw(String str) {
        lh<T> lhVarFkw;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f6958cf)) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarFkw = lhVar.fkw(str)) != 0) {
                return lhVarFkw;
            }
        }
        return null;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.ugeno.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0036ouw {
        protected float bly;

        /* renamed from: cf, reason: collision with root package name */
        protected float f6975cf;
        protected ViewGroup.LayoutParams ex;
        protected float fkw;

        /* renamed from: jg, reason: collision with root package name */
        protected float f6976jg;
        protected boolean jqy;
        protected boolean ko;

        /* renamed from: le, reason: collision with root package name */
        protected float f6977le;
        protected float mwh;
        protected float pno;
        protected boolean qbp;
        protected float ra;
        protected boolean rn;
        protected float ryl;
        protected ouw tc;

        /* renamed from: th, reason: collision with root package name */
        protected boolean f6979th;
        protected float tlj;
        protected boolean vm;
        protected boolean vpp;
        protected boolean zih;
        protected boolean zin;
        protected float ouw = -2.0f;
        protected float vt = -2.0f;

        /* renamed from: lh, reason: collision with root package name */
        protected float f6978lh = 0.0f;
        protected float yu = 0.0f;

        public C0036ouw(ouw ouwVar) {
            this.tc = ouwVar;
        }

        public void ouw(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.f6975cf = ra.ouw(context, str2);
                    this.rn = true;
                    break;
                case "minWidth":
                    this.f6978lh = ra.ouw(context, str2);
                    break;
                case "height":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.vt = ra.ouw(context, str2);
                            break;
                        } else {
                            this.vt = -2.0f;
                            break;
                        }
                    } else {
                        this.vt = -1.0f;
                        break;
                    }
                case "margin":
                    this.fkw = ra.ouw(context, str2);
                    break;
                case "marginTop":
                    this.pno = ra.ouw(context, str2);
                    this.vpp = true;
                    break;
                case "padding":
                    this.tlj = ra.ouw(context, str2);
                    this.ko = true;
                    break;
                case "marginBottom":
                    this.bly = ra.ouw(context, str2);
                    this.jqy = true;
                    break;
                case "minHeight":
                    this.yu = ra.ouw(context, str2);
                    break;
                case "paddingTop":
                    this.ryl = ra.ouw(context, str2);
                    this.vm = true;
                    break;
                case "width":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ouw = ra.ouw(context, str2);
                            break;
                        } else {
                            this.ouw = -2.0f;
                            break;
                        }
                    } else {
                        this.ouw = -1.0f;
                        break;
                    }
                case "paddingBottom":
                    this.f6976jg = ra.ouw(context, str2);
                    this.f6979th = true;
                    break;
                case "paddingRight":
                    this.mwh = ra.ouw(context, str2);
                    this.zih = true;
                    break;
                case "marginRight":
                    this.ra = ra.ouw(context, str2);
                    this.zin = true;
                    break;
                case "marginLeft":
                    this.f6977le = ra.ouw(context, str2);
                    this.qbp = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.ouw + ", mHeight=" + this.vt + ", mMargin=" + this.fkw + ", mMarginLeft=" + this.f6977le + ", mMarginRight=" + this.ra + ", mMarginTop=" + this.pno + ", mMarginBottom=" + this.bly + ", mParams=" + this.ex + '}';
        }

        public ViewGroup.LayoutParams ouw() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.ouw, (int) this.vt);
            marginLayoutParams.leftMargin = (int) (this.qbp ? this.f6977le : this.fkw);
            marginLayoutParams.rightMargin = (int) (this.zin ? this.ra : this.fkw);
            marginLayoutParams.topMargin = (int) (this.vpp ? this.pno : this.fkw);
            marginLayoutParams.bottomMargin = (int) (this.jqy ? this.bly : this.fkw);
            return marginLayoutParams;
        }
    }
}
