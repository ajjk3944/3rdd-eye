package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c83 {
    public final List a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final long g;
    public final boolean h;
    public final String i;
    public final ls3 j;
    public final Bundle k;
    public final String l;
    public final String m;
    public final String n;
    public final JSONObject o;
    public final JSONObject p;
    public final String q;
    public final int r;
    public final long s;
    public final long t;

    public c83(JsonReader jsonReader) throws IOException {
        String str;
        List listK = Collections.EMPTY_LIST;
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
        ls3 ls3Var = null;
        long j = -1;
        long j2 = -1;
        long jNextLong = 0;
        int iNextInt2 = -1;
        int iMax = 1;
        int iNextInt3 = 0;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listK = bd2.K(jsonReader);
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
                iz1 iz1Var = mz1.V8;
                str = str2;
                tw1 tw1Var = tw1.e;
                long j3 = j;
                kz1 kz1Var = tw1Var.c;
                kz1 kz1Var2 = tw1Var.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    ls3 ls3Var2 = new ls3();
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
                    ls3Var2.b = strNextString8;
                    ls3Var = ls3Var2;
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString3 = jsonReader.nextString();
                } else {
                    if (((Boolean) kz1Var2.a(mz1.ib)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString7 = jsonReader.nextString();
                    } else {
                        if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) kz1Var2.a(mz1.f7)).booleanValue()) {
                                try {
                                    Bundle bundleX = bd2.X(bd2.N(jsonReader));
                                    if (bundleX != null) {
                                        bundle = bundleX;
                                    }
                                } catch (IOException | JSONException unused) {
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) kz1Var2.a(mz1.ba)).booleanValue()) {
                                strNextString5 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (!"adRequestUrl".equals(strNextName)) {
                            iz1 iz1Var2 = mz1.ca;
                            if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString6 = jsonReader.nextString();
                            } else if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = bd2.N(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else if (((Boolean) kz1Var2.a(mz1.ka)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                    jSONObject2 = bd2.N(jsonReader);
                                } else if (((Boolean) kz1Var2.a(mz1.n2)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                    try {
                                        Bundle bundleX2 = bd2.X(bd2.N(jsonReader));
                                        if (bundleX2 != null) {
                                            double d = bundleX2.getDouble("start_time");
                                            j2 = (d > 9.223372036854776E18d || d < -9.223372036854776E18d) ? -1L : (long) d;
                                            double d2 = bundleX2.getDouble("end_time");
                                            j = (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) ? -1L : (long) d2;
                                        }
                                    } catch (IOException | JSONException unused3) {
                                    } catch (IllegalStateException unused4) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                                j = j3;
                            }
                        } else if (((Boolean) kz1Var2.a(mz1.ba)).booleanValue()) {
                            strNextString4 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                        str2 = str;
                    }
                    j = j3;
                    str2 = str;
                }
                j = j3;
                str2 = str;
            }
            str = str2;
            str2 = str;
        }
        long j4 = j;
        jsonReader.endObject();
        this.a = listK;
        this.c = iNextInt;
        if (((Boolean) c12.c.w()).booleanValue()) {
            this.d = -1;
        } else {
            so1 so1Var = j02.a;
            if (((Long) so1Var.w()).longValue() > -1) {
                this.d = ((Long) so1Var.w()).intValue();
            } else {
                this.d = iNextInt2;
            }
        }
        this.b = strNextString;
        this.e = strNextString2;
        this.f = iNextInt3;
        this.g = jNextLong;
        this.j = ls3Var;
        this.h = zNextBoolean;
        this.i = strNextString3;
        this.k = bundle;
        this.l = strNextString4;
        this.m = strNextString5;
        this.n = strNextString6;
        this.o = jSONObject;
        this.p = jSONObject2;
        this.q = strNextString7;
        so1 so1Var2 = w02.a;
        this.r = ((Long) so1Var2.w()).longValue() > 0 ? ((Long) so1Var2.w()).intValue() : iMax;
        this.s = j2;
        this.t = j4;
    }
}
