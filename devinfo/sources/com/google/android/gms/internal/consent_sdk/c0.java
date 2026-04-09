package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public String f19285a;

    /* renamed from: b, reason: collision with root package name */
    public String f19286b;

    /* renamed from: c, reason: collision with root package name */
    public String f19287c;

    /* renamed from: d, reason: collision with root package name */
    public List f19288d;

    /* renamed from: e, reason: collision with root package name */
    public List f19289e;

    /* renamed from: f, reason: collision with root package name */
    public String f19290f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f19291h;

    public static c0 a(JsonReader jsonReader) throws IOException {
        int i4;
        c0 c0Var = new c0();
        c0Var.g = 1;
        List list = Collections.EMPTY_LIST;
        c0Var.f19288d = list;
        c0Var.f19289e = list;
        c0Var.f19291h = 1;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            int i10 = 3;
            switch (strNextName.hashCode()) {
                case -2001388947:
                    if (strNextName.equals("consent_signal")) {
                        String strNextString = jsonReader.nextString();
                        switch (strNextString.hashCode()) {
                            case -2058725357:
                                if (!strNextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 5;
                                c0Var.g = i10;
                            case -1969035850:
                                if (!strNextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 7;
                                c0Var.g = i10;
                            case -1263695752:
                                if (!strNextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 1;
                                c0Var.g = i10;
                            case -954325659:
                                if (!strNextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                c0Var.g = i10;
                            case -918677260:
                                if (!strNextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 8;
                                c0Var.g = i10;
                            case 429411856:
                                if (!strNextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 4;
                                c0Var.g = i10;
                            case 467888915:
                                if (!strNextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 2;
                                c0Var.g = i10;
                            case 1725474845:
                                if (!strNextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                                }
                                i10 = 6;
                                c0Var.g = i10;
                            default:
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(strNextString));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (strNextName.equals("error_message")) {
                        c0Var.f19287c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (strNextName.equals("consent_form_base_url")) {
                        c0Var.f19286b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (strNextName.equals("client_side_pingback_url")) {
                        c0Var.f19290f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (strNextName.equals("privacy_options_required")) {
                        String strNextString2 = jsonReader.nextString();
                        int iHashCode = strNextString2.hashCode();
                        if (iHashCode == -1888946261) {
                            if (!strNextString2.equals("NOT_REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            c0Var.f19291h = i10;
                        } else if (iHashCode != 389487519) {
                            if (iHashCode != 433141802 || !strNextString2.equals("UNKNOWN")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i10 = 1;
                            c0Var.f19291h = i10;
                        } else {
                            if (!strNextString2.equals("REQUIRED")) {
                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(strNextString2));
                            }
                            i10 = 2;
                            c0Var.f19291h = i10;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (strNextName.equals("actions")) {
                        c0Var.f19289e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            b0 b0Var = new b0();
                            b0Var.f19268b = 1;
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String strNextName2 = jsonReader.nextName();
                                int iHashCode2 = strNextName2.hashCode();
                                if (iHashCode2 != -2105551094) {
                                    if (iHashCode2 == 1583758243 && strNextName2.equals("action_type")) {
                                        String strNextString3 = jsonReader.nextString();
                                        int iHashCode3 = strNextString3.hashCode();
                                        if (iHashCode3 != 64208429) {
                                            if (iHashCode3 != 82862015) {
                                                if (iHashCode3 != 1856333582 || !strNextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i4 = 1;
                                                b0Var.f19268b = i4;
                                            } else {
                                                if (!strNextString3.equals("WRITE")) {
                                                    throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                                }
                                                i4 = 2;
                                                b0Var.f19268b = i4;
                                            }
                                        } else {
                                            if (!strNextString3.equals("CLEAR")) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(strNextString3));
                                            }
                                            i4 = 3;
                                            b0Var.f19268b = i4;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName2.equals("args_json")) {
                                    b0Var.f19267a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            c0Var.f19289e.add(b0Var);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (strNextName.equals("request_info_keys")) {
                        c0Var.f19288d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            c0Var.f19288d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (strNextName.equals("consent_form_payload")) {
                        c0Var.f19285a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return c0Var;
    }
}
