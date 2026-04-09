package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ec, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0484Ec implements NA {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7969c;

    public /* synthetic */ C0484Ec(Object obj, int i, Object obj2) {
        this.f7967a = i;
        this.f7968b = obj;
        this.f7969c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f7967a) {
            case 0:
                InterfaceC2075wc interfaceC2075wc = (InterfaceC2075wc) obj;
                interfaceC2075wc.d((String) this.f7968b, (InterfaceC0466Db) this.f7969c);
                return interfaceC2075wc;
            default:
                C0732Sm c0732Sm = (C0732Sm) this.f7968b;
                JSONObject jSONObject = (JSONObject) this.f7969c;
                List list = (List) obj;
                c0732Sm.getClass();
                if (list == null || list.isEmpty()) {
                    return null;
                }
                String strOptString = jSONObject.optString("text");
                Integer numC = C0732Sm.c("bg_color", jSONObject);
                Integer numC2 = C0732Sm.c("text_color", jSONObject);
                int iOptInt = jSONObject.optInt("text_size", -1);
                jSONObject.optBoolean("allow_pub_rendering");
                int iOptInt2 = jSONObject.optInt("animation_ms", TTAdConstant.STYLE_SIZE_RADIO_1_1);
                return new BinderC0431Ba(strOptString, list, numC, numC2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, c0732Sm.f11234h.f8131e);
        }
    }
}
