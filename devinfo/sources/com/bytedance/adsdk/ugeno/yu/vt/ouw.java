package com.bytedance.adsdk.ugeno.yu.vt;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw {
    public static final HashSet<String> ouw = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", "skip", "videoControl", "pauseVideo", "resumeVideo", "muteVideo", "preventEvent"));
    protected String fkw;

    /* renamed from: le, reason: collision with root package name */
    protected Map<String, String> f7011le;

    /* renamed from: lh, reason: collision with root package name */
    protected com.bytedance.adsdk.ugeno.vt.lh f7012lh;
    protected String pno;
    protected String ra;
    protected le.ouw vt;
    protected String yu;

    public ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        this.f7012lh = lhVar;
        this.vt = ouwVar;
        this.ra = str;
        if (ouwVar != null) {
            this.yu = ouwVar.f7010lh;
            this.fkw = ouwVar.yu;
            Map<String, String> map = ouwVar.fkw;
            this.f7011le = map;
            if (map == null || map.isEmpty() || !this.f7011le.containsKey("emitCustomEvent")) {
                return;
            }
            this.pno = this.f7011le.get("emitCustomEvent");
        }
    }

    private boolean yu() {
        return !TextUtils.isEmpty(this.pno);
    }

    public final void lh() {
        if (yu()) {
            le.ouw ouwVar = new le.ouw();
            ouwVar.f7010lh = "custom";
            ouwVar.yu = "emit";
            HashMap map = new HashMap();
            map.put("name", this.pno);
            ouwVar.fkw = map;
            new vt(this.f7012lh, this.fkw, ouwVar).ouw();
        }
    }

    public abstract void ouw();

    public void vt() {
        lh();
    }
}
