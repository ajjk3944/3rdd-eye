package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yp0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f18819a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18820b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18821c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18822d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18823e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18824f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18825h;

    /* renamed from: i, reason: collision with root package name */
    public final String f18826i;
    public final ka1 j;

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f18827k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18828l;

    /* renamed from: m, reason: collision with root package name */
    public final String f18829m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18830n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONObject f18831o;

    /* renamed from: p, reason: collision with root package name */
    public final JSONObject f18832p;

    /* renamed from: q, reason: collision with root package name */
    public final String f18833q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18834r;

    /* renamed from: s, reason: collision with root package name */
    public final long f18835s;

    /* renamed from: t, reason: collision with root package name */
    public final long f18836t;

    public yp0(JsonReader jsonReader) throws IOException {
        String str;
        List listX = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str2 = "";
        int iNextInt = 0;
        String strNextString = "";
        String strNextString2 = strNextString;
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        boolean zNextBoolean = false;
        ka1 ka1Var = null;
        long j = -1;
        long j8 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listX = pd.b.x(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString2 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                pk pkVar = sk.f16353u9;
                str = str2;
                va.s sVar = va.s.f36163e;
                long j9 = j;
                rk rkVar = sVar.f36166c;
                rk rkVar2 = sVar.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    ka1 ka1Var2 = new ka1();
                    jsonReader.beginObject();
                    String strNextString8 = str;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        int iHashCode = strNextName2.hashCode();
                        if (iHashCode != -1724546052) {
                            if (iHashCode == 3059181 && strNextName2.equals("code")) {
                                jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName2.equals("description")) {
                            strNextString8 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    ka1Var2.f13113b = strNextString8;
                    ka1Var = ka1Var2;
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    if (((Boolean) rkVar2.a(sk.Hb)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) rkVar2.a(sk.f16434z7)).booleanValue()) {
                                try {
                                    Bundle bundleD = pd.b.D(pd.b.y(jsonReader));
                                    if (bundleD != null) {
                                        bundle = bundleD;
                                    }
                                } catch (IOException | JSONException unused) {
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) rkVar2.a(sk.Aa)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (!"adRequestUrl".equals(strNextName)) {
                            pk pkVar2 = sk.Ba;
                            if (((Boolean) rkVar2.a(pkVar2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) rkVar2.a(pkVar2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = pd.b.y(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else if (((Boolean) rkVar2.a(sk.Ja)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = pd.b.y(jsonReader);
                                } else if (((Boolean) rkVar2.a(sk.C2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleD2 = pd.b.D(pd.b.y(jsonReader));
                                        if (bundleD2 != null) {
                                            double d10 = bundleD2.getDouble("start_time");
                                            j8 = (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) ? -1L : (long) d10;
                                            double d11 = bundleD2.getDouble("end_time");
                                            j = (d11 > 9.223372036854776E18d || d11 < -9.223372036854776E18d) ? -1L : (long) d11;
                                        }
                                    } catch (IOException | JSONException unused3) {
                                    } catch (IllegalStateException unused4) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                j = j9;
                            }
                        } else if (((Boolean) rkVar2.a(sk.Aa)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                        str2 = str;
                    }
                    j = j9;
                    str2 = str;
                }
                j = j9;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j10 = j;
        jsonReader.endObject();
        this.f18819a = listX;
        this.f18821c = iNextInt;
        if (((Boolean) am.f9359d.u()).booleanValue()) {
            this.f18822d = -1;
        } else {
            oa oaVar = kl.f13189a;
            if (((Long) oaVar.u()).longValue() > -1) {
                this.f18822d = ((Long) oaVar.u()).intValue();
            } else {
                this.f18822d = iNextInt2;
            }
        }
        this.f18820b = strNextString;
        this.f18823e = strNextString2;
        this.f18824f = iNextInt3;
        this.g = jNextLong;
        this.j = ka1Var;
        this.f18825h = zNextBoolean;
        this.f18826i = strNextString3;
        this.f18827k = bundle;
        this.f18828l = strNextString4;
        this.f18829m = strNextString5;
        this.f18830n = strNextString6;
        this.f18831o = jSONObject;
        this.f18832p = jSONObject2;
        this.f18833q = strNextString7;
        oa oaVar2 = yl.f18795a;
        this.f18834r = ((Long) oaVar2.u()).longValue() > 0 ? ((Long) oaVar2.u()).intValue() : iMax;
        this.f18835s = j8;
        this.f18836t = j10;
    }
}
