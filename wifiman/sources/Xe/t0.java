package xe;

import T.AbstractC3561w;
import T.H0;
import kotlin.NoWhenBranchMatchedException;
import mh.InterfaceC6824a;
import xe.I;

/* loaded from: classes4.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f66017a = AbstractC3561w.f(new InterfaceC6824a() { // from class: xe.s0
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return t0.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 b() {
        throw new IllegalStateException("No Navigation Analytics set");
    }

    public static final H0 d() {
        return f66017a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final P7.b e(Ae.p pVar) {
        if (!(pVar instanceof I)) {
            Z7.b.j("Unknown nav destination type: " + pVar, null, null, 6, null);
            return null;
        }
        if ((pVar instanceof I.C8469c) || (pVar instanceof I.C8481p)) {
            return null;
        }
        if (pVar instanceof I.t) {
            return P7.b.SETTINGS;
        }
        if (pVar instanceof I.C8468b) {
            return P7.b.APP_PREFERENCES;
        }
        if (pVar instanceof I.L) {
            return P7.b.APP_PREFERENCES_UNIT_SYSTEM;
        }
        if (pVar instanceof I.C8473g) {
            return P7.b.APP_PREFERENCES_CONSOLE_DIRECT_CONNECTION_EXPLANATION;
        }
        if (pVar instanceof I.C2328I) {
            return P7.b.APP_PREFERENCES_TELEPORT_QUICK_SETTINGS_EXPLANATION_ADD;
        }
        if (pVar instanceof I.J) {
            return P7.b.APP_PREFERENCES_TELEPORT_QUICK_SETTINGS_EXPLANATION_REMOVE;
        }
        if (pVar instanceof I.C8470d) {
            return P7.b.DEV_PREFERENCES;
        }
        if (pVar instanceof I.C8467a) {
            return P7.b.APP_FEEDBACK_FORM;
        }
        if (pVar instanceof I.s) {
            return P7.b.SSO_ACCOUNT_SETTINGS;
        }
        if (pVar instanceof I.C8483r) {
            return P7.b.SSO_ACCOUNT_PICKER;
        }
        if (pVar instanceof I.C8482q) {
            return P7.b.SSO_ACCOUNT_LOGOUT;
        }
        if (pVar instanceof I.C8471e) {
            return P7.b.DEVICE_DETAIL;
        }
        if (pVar instanceof M) {
            return P7.b.DISCOVERY_DISPLAY_PREFS_BLUETOOTH;
        }
        if (pVar instanceof N) {
            return P7.b.DISCOVERY_DISPLAY_PREFS_LAN;
        }
        if (pVar instanceof I.C8472f) {
            return P7.b.DEVICE_EDIT;
        }
        if (pVar instanceof I.R) {
            return P7.b.WIFI_SCAN_DISPLAY_PREFS_NETWORKS;
        }
        if (pVar instanceof I.Q) {
            return P7.b.WIFI_SCAN_DISPLAY_PREFS_QUALITY;
        }
        if (pVar instanceof I.O) {
            return P7.b.WIFI_NETWORK_DETAIL;
        }
        if (pVar instanceof I.P) {
            return P7.b.WIFI_NETWORK_DISPLAY_PREFS;
        }
        if (pVar instanceof I.M) {
            return P7.b.WIFI_SIGNAL_DETAIL;
        }
        if (pVar instanceof I.N) {
            return P7.b.WIFI_CHANNEL_DETAIL;
        }
        if (pVar instanceof I.K) {
            return P7.b.TELEPORT_VPN_PROFILE;
        }
        if (pVar instanceof I.G) {
            return P7.b.TELEPORT_INVITATION;
        }
        if (pVar instanceof I.H) {
            return P7.b.TELEPORT_INVITATION_PASTE_FAILED;
        }
        if (pVar instanceof I.E) {
            return P7.b.TELEPORT_CONSOLE_DELETE;
        }
        if (pVar instanceof I.F) {
            return P7.b.TELEPORT_CONSOLE_UNAVAILABLE;
        }
        if (pVar instanceof I.y) {
            return P7.b.SPEEDTEST_TEST;
        }
        if (pVar instanceof I.C) {
            return P7.b.SPEEDTEST_RESULT_HISTORY;
        }
        if (pVar instanceof I.B) {
            return P7.b.SPEEDTEST_RESULT;
        }
        if (pVar instanceof I.z) {
            return P7.b.SPEEDTEST_TEST_ERROR;
        }
        if (pVar instanceof I.A) {
            return P7.b.SPEEDTEST_FEEDBACK;
        }
        if (pVar instanceof I.D) {
            return P7.b.SPEEDTEST_SERVER_PICKER;
        }
        if (pVar instanceof I.C8477l) {
            return P7.b.ISP_DETAIL;
        }
        if (pVar instanceof I.C8478m) {
            return P7.b.NETWORK_LATENCY;
        }
        if (pVar instanceof I.C8479n) {
            return P7.b.NETWORK_LATENCY_ADD;
        }
        if (pVar instanceof I.x) {
            return P7.b.SPEED_FACTORS_EXPLANATION;
        }
        if (pVar instanceof I.C8474h) {
            return P7.b.FLOORPLAN;
        }
        if (pVar instanceof I.C8476k) {
            return P7.b.FLOORPLAN_SAVE;
        }
        if (pVar instanceof I.i) {
            return P7.b.FLOORPLAN_DELETE;
        }
        if (pVar instanceof I.C8475j) {
            return P7.b.FLOORPLAN_DETAIL;
        }
        if (pVar instanceof I.v) {
            return P7.b.SIGNAL_PLACE_ADD;
        }
        if (pVar instanceof I.w) {
            return P7.b.SIGNAL_PLACE_DETAIL;
        }
        if (pVar instanceof I.u) {
            return P7.b.SIGNAL_AP_COMPARISON_CONFIG;
        }
        if (pVar instanceof I.C8480o) {
            return P7.b.PERMISSION_EXPLANATION;
        }
        throw new NoWhenBranchMatchedException();
    }
}
