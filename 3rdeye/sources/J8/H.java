package J8;

import android.os.Build;
import b9.C2001h;
import c9.C2077A;
import c9.C2078B;
import c9.C2097r;
import c9.C2100u;
import com.zipoapps.premiumhelper.e;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PermissionsAnalytics.kt */
/* loaded from: classes3.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f2816c;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f2817a;

    /* renamed from: b, reason: collision with root package name */
    public final b9.p f2818b = C2001h.b(new G1.e(this, 3));

    static {
        Map mapO = C2078B.o(new b9.l("android.permission.READ_CALENDAR", "r_calendar"), new b9.l("android.permission.WRITE_CALENDAR", "w_calendar"), new b9.l("android.permission.CAMERA", "camera"), new b9.l("android.permission.READ_CONTACTS", "r_contacts"), new b9.l("android.permission.WRITE_CONTACTS", "w_contacts"), new b9.l("android.permission.GET_ACCOUNTS", "get_accounts"), new b9.l("android.permission.ACCESS_FINE_LOCATION", "fine_location"), new b9.l("android.permission.ACCESS_COARSE_LOCATION", "coarse_location"), new b9.l("android.permission.RECORD_AUDIO", "rec_audio"), new b9.l("android.permission.READ_PHONE_STATE", "r_phone_state"), new b9.l("android.permission.CALL_PHONE", "call_phone"), new b9.l("android.permission.READ_CALL_LOG", "r_call_log"), new b9.l("android.permission.WRITE_CALL_LOG", "w_call_log"), new b9.l("com.android.voicemail.permission.ADD_VOICEMAIL", "add_voicemail"), new b9.l("android.permission.USE_SIP", "use_sip"), new b9.l("android.permission.PROCESS_OUTGOING_CALLS", "process_out_calls"), new b9.l("android.permission.BODY_SENSORS", "body_sensors"), new b9.l("android.permission.SEND_SMS", "send_sms"), new b9.l("android.permission.RECEIVE_SMS", "receive_sms"), new b9.l("android.permission.READ_SMS", "r_sms"), new b9.l("android.permission.RECEIVE_MMS", "receive_mms"), new b9.l("android.permission.RECEIVE_WAP_PUSH", "receive_wap_push"), new b9.l("android.permission.READ_EXTERNAL_STORAGE", "r_ext_storage"), new b9.l("android.permission.WRITE_EXTERNAL_STORAGE", "w_ext_storage"));
        int i = Build.VERSION.SDK_INT;
        Map mapO2 = C2100u.f18582b;
        LinkedHashMap linkedHashMapQ = C2078B.q(C2078B.q(C2078B.q(C2078B.q(mapO, i >= 26 ? C2078B.o(new b9.l("android.permission.ANSWER_PHONE_CALLS", "answer_calls"), new b9.l("android.permission.READ_PHONE_NUMBERS", "r_phone_numbers")) : mapO2), i >= 28 ? C2077A.m(new b9.l("android.permission.ACCEPT_HANDOVER", "accept_handover")) : mapO2), i >= 29 ? C2078B.o(new b9.l("android.permission.ACCESS_MEDIA_LOCATION", "media_location"), new b9.l("android.permission.ACTIVITY_RECOGNITION", "act_recognition"), new b9.l("android.permission.ACCESS_BACKGROUND_LOCATION", "access_bkg_loc")) : mapO2), i >= 31 ? C2078B.o(new b9.l("android.permission.BLUETOOTH_CONNECT", "btooth_connect"), new b9.l("android.permission.BLUETOOTH_ADVERTISE", "btooth_advertise"), new b9.l("android.permission.BLUETOOTH_SCAN", "btooth_scan"), new b9.l("android.permission.UWB_RANGING", "uwb_ranging")) : mapO2);
        if (i >= 33) {
            mapO2 = C2078B.o(new b9.l("android.permission.NEARBY_WIFI_DEVICES", "nearby_wifi"), new b9.l("android.permission.BODY_SENSORS_BACKGROUND", "body_sensors_bkg"), new b9.l("android.permission.POST_NOTIFICATIONS", "post_notifs"), new b9.l("android.permission.READ_MEDIA_IMAGES", "r_media_images"), new b9.l("android.permission.READ_MEDIA_AUDIO", "r_media_audio"), new b9.l("android.permission.READ_MEDIA_VIDEO", "r_media_video"));
        }
        f2816c = C2078B.q(linkedHashMapQ, mapO2);
    }

    public H(com.zipoapps.premiumhelper.d dVar) {
        this.f2817a = dVar;
    }

    public static void a(String permission, String isGranted) {
        kotlin.jvm.internal.l.f(permission, "permission");
        kotlin.jvm.internal.l.f(isGranted, "isGranted");
        String str = (String) C2097r.w0(y9.q.r0(permission, new String[]{"."}));
        if (str != null) {
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            com.zipoapps.premiumhelper.e eVarA = e.a.a();
            eVarA.f37021k.t(isGranted, y9.r.z0(24, str.concat("_granted")));
        }
    }
}
