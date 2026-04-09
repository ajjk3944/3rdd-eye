package com.bytedance.adsdk.ugeno.ouw;

import d.h;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    int bly = 1;
    long fkw;

    /* renamed from: le, reason: collision with root package name */
    ouw f6911le;

    /* renamed from: lh, reason: collision with root package name */
    int f6912lh;
    Map<String, TreeMap<Float, String>> ouw;
    String pno;
    String ra;
    JSONObject tlj;
    long vt;
    String yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw {
        public String ouw;
        public String vt;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb2.append(this.ouw);
        sb2.append(", mDuration=");
        sb2.append(this.vt);
        sb2.append(", mPlayCount=");
        sb2.append(this.f6912lh);
        sb2.append(", mPlayDirection=");
        sb2.append(this.yu);
        sb2.append(", mDelay=");
        sb2.append(this.fkw);
        sb2.append(", mName=");
        sb2.append(this.pno);
        sb2.append(", mPlayState=");
        sb2.append(this.bly);
        sb2.append(", mTransformOrigin='");
        sb2.append(this.f6911le);
        sb2.append("', mTimingFunction='");
        return h.w(sb2, this.ra, "'}");
    }
}
