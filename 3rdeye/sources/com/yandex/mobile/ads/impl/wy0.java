package com.yandex.mobile.ads.impl;

import d9.C4285c;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class wy0 implements br1<vy0> {

    /* renamed from: a, reason: collision with root package name */
    private final pc1 f35112a;

    /* renamed from: b, reason: collision with root package name */
    private final iz0 f35113b;

    public /* synthetic */ wy0() {
        this(new qc1(), new iz0());
    }

    @Override // com.yandex.mobile.ads.impl.br1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vy0 a(qq1 networkResponse) throws JSONException {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        String strA = this.f35112a.a(networkResponse);
        if (strA == null || strA.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            try {
                iq0 iq0Var = iq0.f28836a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                C4285c c4285c = new C4285c();
                Iterator<String> itKeys = jSONObject2.keys();
                kotlin.jvm.internal.l.e(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    kotlin.jvm.internal.l.c(next);
                    String string = jSONObject2.getString(next);
                    kotlin.jvm.internal.l.e(string, "getString(...)");
                    c4285c.put(next, string);
                }
                C4285c c4285cC = c4285c.c();
                if (c4285cC.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("networks");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    iz0 iz0Var = this.f35113b;
                    kotlin.jvm.internal.l.c(jSONObject3);
                    zy0 zy0VarA = iz0Var.a(jSONObject3);
                    if (zy0VarA != null) {
                        arrayList.add(zy0VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new vy0(arrayList, c4285cC);
            } catch (JSONException e4) {
                fp0.c(new Object[0]);
                throw new JSONException(e4.getMessage());
            }
        } catch (JSONException unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public wy0(pc1 networkResponseDecoder, iz0 mediationNetworkParser) {
        kotlin.jvm.internal.l.f(networkResponseDecoder, "networkResponseDecoder");
        kotlin.jvm.internal.l.f(mediationNetworkParser, "mediationNetworkParser");
        this.f35112a = networkResponseDecoder;
        this.f35113b = mediationNetworkParser;
    }
}
