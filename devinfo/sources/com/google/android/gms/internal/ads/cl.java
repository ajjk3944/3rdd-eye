package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cl extends ib.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10154a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10156c;

    public cl(dl dlVar, String str) {
        this.f10155b = str;
        Objects.requireNonNull(dlVar);
        this.f10156c = dlVar;
    }

    @Override // ib.a
    public final void a(String str) {
        int i4 = this.f10154a;
        String str2 = this.f10155b;
        Object obj = this.f10156c;
        switch (i4) {
            case 0:
                za.i.h("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    dl dlVar = (dl) obj;
                    ((u.p) dlVar.f10504i).a(dlVar.h(str2, str).toString());
                    break;
                } catch (JSONException e2) {
                    za.i.f("Error creating PACT Error Response JSON: ", e2);
                    return;
                }
            default:
                fb.a aVar = (fb.a) obj;
                za.i.h("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) zl.f19112c.u()).booleanValue() ? ",\"as\":".concat(aVar.f23867k.b().toString()) : "";
                Locale locale = Locale.getDefault();
                oa oaVar = zl.f19114e;
                int i10 = 0;
                String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) oaVar.u()).booleanValue() ? ((Long) zl.f19116h.u()).longValue() : 0L), strConcat);
                if (((Boolean) oaVar.u()).booleanValue()) {
                    try {
                        aVar.f23865h.execute(new fb.q(this, str3, i10));
                    } catch (RuntimeException e10) {
                        ua.j.C.f35265h.g("TaggingLibraryJsInterface.getQueryInfo.onFailure", e10);
                    }
                } else {
                    aVar.f23860b.evaluateJavascript(str3, null);
                }
                if (((Boolean) zl.f19112c.u()).booleanValue() && ((Boolean) zl.f19113d.u()).booleanValue()) {
                    fb.y yVar = aVar.f23868l;
                    yVar.getClass();
                    yVar.f23993c.execute(new fb.x(yVar, 0));
                    break;
                }
                break;
        }
    }

    @Override // ib.a
    public final void b(o7.d dVar) throws JSONException {
        String str;
        int i4 = this.f10154a;
        Object obj = this.f10156c;
        String str2 = this.f10155b;
        switch (i4) {
            case 0:
                try {
                    dl dlVar = (dl) obj;
                    ((u.p) dlVar.f10504i).a(dlVar.i(str2, ((va.k2) dVar.f30421b).f36130a).toString());
                    break;
                } catch (JSONException e2) {
                    za.i.f("Error creating PACT Signal Response JSON: ", e2);
                    return;
                }
            default:
                fb.a aVar = (fb.a) obj;
                String str3 = ((va.k2) dVar.f30421b).f36130a;
                int i10 = 1;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) zl.f19112c.u()).booleanValue()) {
                        jSONObject.put("as", aVar.f23867k.b());
                    }
                    jSONObject.put("sdk_ttl_ms", ((Boolean) zl.f19114e.u()).booleanValue() ? ((Long) zl.f19116h.u()).longValue() : 0L);
                    jSONObject.put("signal", str3);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    str = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, ((va.k2) dVar.f30421b).f36130a, Long.valueOf(((Boolean) zl.f19114e.u()).booleanValue() ? ((Long) zl.f19116h.u()).longValue() : 0L), ((Boolean) zl.f19112c.u()).booleanValue() ? ",\"as\":".concat(aVar.f23867k.b().toString()) : "");
                }
                if (((Boolean) zl.f19114e.u()).booleanValue()) {
                    try {
                        aVar.f23865h.execute(new fb.q(this, str, i10));
                    } catch (RuntimeException e10) {
                        ua.j.C.f35265h.g("TaggingLibraryJsInterface.getQueryInfo.onSuccess", e10);
                    }
                } else {
                    aVar.f23860b.evaluateJavascript(str, null);
                }
                if (((Boolean) zl.f19112c.u()).booleanValue() && ((Boolean) zl.f19113d.u()).booleanValue()) {
                    fb.y yVar = aVar.f23868l;
                    yVar.getClass();
                    yVar.f23993c.execute(new fb.x(yVar, 0));
                    break;
                }
                break;
        }
    }

    public cl(fb.a aVar, String str) {
        this.f10155b = str;
        this.f10156c = aVar;
    }
}
