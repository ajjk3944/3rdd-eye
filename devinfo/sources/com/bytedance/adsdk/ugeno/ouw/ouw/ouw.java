package com.bytedance.adsdk.ugeno.ouw.ouw;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw {

    /* renamed from: lh, reason: collision with root package name */
    private String f6922lh;
    protected JSONObject ouw;
    protected com.bytedance.adsdk.ugeno.vt.lh vt;

    public ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, JSONObject jSONObject) {
        this.ouw = jSONObject;
        this.vt = lhVar;
        this.f6922lh = jSONObject.optString("type");
        ouw();
    }

    public final String lh() {
        return this.f6922lh;
    }

    public abstract void ouw();

    public abstract void ouw(int i4, int i10);

    public abstract void ouw(Canvas canvas);

    public abstract List<PropertyValuesHolder> vt();

    public abstract void vt(Canvas canvas);
}
