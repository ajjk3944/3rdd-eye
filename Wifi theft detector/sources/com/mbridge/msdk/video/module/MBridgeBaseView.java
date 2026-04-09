package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.module.listener.a;
import com.mbridge.msdk.video.module.listener.impl.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class MBridgeBaseView extends RelativeLayout {
    public static final String TAG = "MBridgeBaseView";

    /* renamed from: a, reason: collision with root package name */
    protected Context f18951a;

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f18952b;

    /* renamed from: c, reason: collision with root package name */
    protected LayoutInflater f18953c;

    /* renamed from: d, reason: collision with root package name */
    protected int f18954d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f18955e;

    /* renamed from: f, reason: collision with root package name */
    protected float f18956f;

    /* renamed from: g, reason: collision with root package name */
    protected float f18957g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f18958h;

    /* renamed from: i, reason: collision with root package name */
    protected int f18959i;

    /* renamed from: j, reason: collision with root package name */
    protected boolean f18960j;

    /* renamed from: k, reason: collision with root package name */
    protected int f18961k;

    /* renamed from: l, reason: collision with root package name */
    protected int f18962l;
    public a notifyListener;

    public MBridgeBaseView(Context context) {
        this(context, null);
    }

    public JSONObject a(int i10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15033h, v0.b(c.n().d(), this.f18956f));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15034i, v0.b(c.n().d(), this.f18957g));
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15038m, i10);
                try {
                    this.f18954d = getContext().getResources().getConfiguration().orientation;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15036k, this.f18954d);
                jSONObject2.put(com.mbridge.msdk.foundation.same.a.f15037l, v0.d(getContext()));
                return jSONObject2;
            } catch (JSONException e11) {
                e = e11;
                jSONObject = jSONObject2;
                e.printStackTrace();
                return jSONObject;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    public String c() {
        return a(0).toString();
    }

    public void d() {
    }

    public void defaultShow() {
        q0.a(TAG, "defaultShow");
    }

    public int filterFindViewId(boolean z10, String str) {
        return z10 ? findDyID(str) : findID(str);
    }

    public int findColor(String str) {
        return i0.a(this.f18951a.getApplicationContext(), str, TtmlNode.ATTR_TTS_COLOR);
    }

    public int findDrawable(String str) {
        return i0.a(this.f18951a.getApplicationContext(), str, "drawable");
    }

    public int findDyID(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public int findID(String str) {
        return i0.a(this.f18951a.getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(this.f18951a.getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    public CampaignEx getCampaign() {
        return this.f18952b;
    }

    public LinearLayout.LayoutParams getParentLinearLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public RelativeLayout.LayoutParams getParentRelativeLayoutParams() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            return (RelativeLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public abstract void init(Context context);

    public boolean isLandscape() {
        return this.f18951a.getResources().getConfiguration().orientation == 2;
    }

    public boolean isNotNULL(View... viewArr) {
        if (viewArr == null) {
            return false;
        }
        int length = viewArr.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            if (viewArr[i10] == null) {
                return false;
            }
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.f18954d = configuration.orientation;
        super.onConfigurationChanged(configuration);
        Log.d(TAG, "onConfigurationChanged:" + configuration.orientation);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18956f = motionEvent.getRawX();
        this.f18957g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSelfConfigurationChanged(Configuration configuration) {
        this.f18954d = configuration.orientation;
        Log.d(TAG, "onSelfConfigurationChanged:" + configuration.orientation);
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f18952b = campaignEx;
    }

    public void setLayoutCenter(int i10, int i11) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.addRule(13);
            if (i10 != -999) {
                parentRelativeLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentRelativeLayoutParams.height = i11;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.gravity = 17;
            if (i10 != -999) {
                parentLinearLayoutParams.width = i10;
            }
            if (i11 != -999) {
                parentLinearLayoutParams.height = i11;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setLayoutParam(int i10, int i11, int i12, int i13) {
        RelativeLayout.LayoutParams parentRelativeLayoutParams = getParentRelativeLayoutParams();
        LinearLayout.LayoutParams parentLinearLayoutParams = getParentLinearLayoutParams();
        if (parentRelativeLayoutParams != null) {
            parentRelativeLayoutParams.topMargin = i11;
            parentRelativeLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentRelativeLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentRelativeLayoutParams.height = i13;
            }
            setLayoutParams(parentRelativeLayoutParams);
            return;
        }
        if (parentLinearLayoutParams != null) {
            parentLinearLayoutParams.topMargin = i11;
            parentLinearLayoutParams.leftMargin = i10;
            if (i12 != -999) {
                parentLinearLayoutParams.width = i12;
            }
            if (i13 != -999) {
                parentLinearLayoutParams.height = i13;
            }
            setLayoutParams(parentLinearLayoutParams);
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setNotifyListener(a aVar) {
        this.notifyListener = aVar;
    }

    public void setWrapContent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        } else {
            layoutParams.height = -2;
            layoutParams.width = -2;
        }
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet);
        this.f18954d = 1;
        this.notifyListener = new f();
        this.f18955e = false;
        this.f18961k = 1;
        this.f18962l = 0;
        this.f18951a = context;
        this.f18953c = LayoutInflater.from(context);
        this.f18958h = z10;
        this.f18959i = i10;
        this.f18960j = z11;
        this.f18961k = i11;
        this.f18962l = i12;
        init(context);
    }

    public MBridgeBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18954d = 1;
        this.notifyListener = new f();
        this.f18955e = false;
        this.f18961k = 1;
        this.f18962l = 0;
        this.f18951a = context;
        this.f18953c = LayoutInflater.from(context);
        init(context);
    }
}
