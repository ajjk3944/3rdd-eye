package ru.andr7e.siminfo;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.andr7e.simcellinfo.R;
import ru.andr7e.siminfo.d;

/* loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.c implements SharedPreferences.OnSharedPreferenceChangeListener, d.c {
    private static final String M0 = MainActivity.class.getSimpleName();
    static boolean N0 = false;
    private static String O0 = "";
    private MenuItem F0;
    private MenuItem G0;
    private Timer J0;
    private TimerTask K0;

    /* renamed from: c0, reason: collision with root package name */
    LinearLayout f3178c0;

    /* renamed from: d0, reason: collision with root package name */
    LinearLayout f3179d0;
    private SharedPreferences x0;

    /* renamed from: u, reason: collision with root package name */
    private boolean f3193u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f3194v = false;

    /* renamed from: w, reason: collision with root package name */
    private TextView f3195w = null;

    /* renamed from: x, reason: collision with root package name */
    private TextView f3196x = null;

    /* renamed from: y, reason: collision with root package name */
    private TextView f3197y = null;

    /* renamed from: z, reason: collision with root package name */
    private TextView f3198z = null;
    private TextView A = null;
    private TextView B = null;
    private TextView C = null;
    private TextView D = null;
    private TextView E = null;
    private TextView F = null;
    private ProgressBar G = null;
    private ProgressBar H = null;
    private ProgressBar I = null;
    private ProgressBar J = null;
    private TextView K = null;
    private TextView L = null;
    private TextView M = null;
    private TextView N = null;
    private TextView O = null;
    private TextView P = null;
    private TextView Q = null;
    private TextView R = null;
    private TextView S = null;
    private CardView T = null;
    private TextView U = null;
    private TextView V = null;
    private RecyclerView W = null;
    private CardView X = null;
    private TextView Y = null;
    private TextView Z = null;

    /* renamed from: a0, reason: collision with root package name */
    private ImageView f3176a0 = null;

    /* renamed from: b0, reason: collision with root package name */
    private ImageView f3177b0 = null;

    /* renamed from: e0, reason: collision with root package name */
    private ImageView f3180e0 = null;

    /* renamed from: f0, reason: collision with root package name */
    private ImageView f3181f0 = null;

    /* renamed from: g0, reason: collision with root package name */
    private ImageView f3182g0 = null;

    /* renamed from: h0, reason: collision with root package name */
    private ImageView f3183h0 = null;

    /* renamed from: i0, reason: collision with root package name */
    private CardView f3184i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    private ImageView f3185j0 = null;

    /* renamed from: k0, reason: collision with root package name */
    private ImageView f3186k0 = null;

    /* renamed from: l0, reason: collision with root package name */
    private TelephonyManager f3187l0 = null;

    /* renamed from: m0, reason: collision with root package name */
    private TelephonyManager f3188m0 = null;

    /* renamed from: n0, reason: collision with root package name */
    private TelephonyManager f3189n0 = null;

    /* renamed from: o0, reason: collision with root package name */
    private Object f3190o0 = null;

    /* renamed from: p0, reason: collision with root package name */
    private j f3191p0 = null;

    /* renamed from: q0, reason: collision with root package name */
    private h f3192q0 = null;
    private i r0 = null;
    boolean s0 = true;
    boolean t0 = false;
    boolean u0 = false;
    private o0.c v0 = new o0.c();
    private o0.c w0 = new o0.c();
    ru.andr7e.siminfo.g y0 = null;
    List<ru.andr7e.siminfo.b> z0 = new CopyOnWriteArrayList();
    List<CellInfo> A0 = new CopyOnWriteArrayList();
    long B0 = -1;
    ExecutorService C0 = null;
    TelephonyManager.CellInfoCallback D0 = null;
    private boolean E0 = false;
    private int H0 = 2000;
    private boolean I0 = false;
    long L0 = -1;

    class a implements View.OnLongClickListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f3199b;

        a(Context context) {
            this.f3199b = context;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            String string;
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            try {
                ServiceState serviceState = MainActivity.this.f3187l0.getServiceState();
                if (serviceState == null || (string = serviceState.toString()) == null || string.isEmpty()) {
                    return false;
                }
                k0.a.a(this.f3199b, "Info", string, "OK");
                return false;
            } catch (SecurityException unused) {
                return false;
            }
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f3201b;

        b(Context context) {
            this.f3201b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.H(p0.c.b(this.f3201b));
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3203b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3204c;

        c(boolean z2, int i2) {
            this.f3203b = z2;
            this.f3204c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.y0.w(mainActivity.z0);
            MainActivity.this.y0.g();
            MainActivity.this.p0(this.f3203b);
            MainActivity.this.n0(this.f3204c);
        }
    }

    class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3206b;

        d(String str) {
            this.f3206b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.o0(this.f3206b);
            MainActivity.this.p0(false);
            MainActivity.this.n0(0);
        }
    }

    class e extends TelephonyManager.CellInfoCallback {
        e() {
        }

        @Override // android.telephony.TelephonyManager.CellInfoCallback
        public void onCellInfo(List<CellInfo> list) {
            q0.a.b(MainActivity.M0, "onCellInfo: callback=" + list.size());
            MainActivity.this.A0.clear();
            MainActivity.this.A0.addAll(list);
            MainActivity.this.m0();
        }
    }

    class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3210c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3211d;

        f(String str, boolean z2, String str2) {
            this.f3209b = str;
            this.f3210c = z2;
            this.f3211d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.Y.setText(this.f3209b);
            MainActivity.this.F.setVisibility(i0.b.d(this.f3210c));
            MainActivity.this.Y.setVisibility(i0.b.d(this.f3210c));
            if (this.f3210c) {
                MainActivity.this.F.setText(this.f3211d);
            }
        }
    }

    class g extends TimerTask {
        g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (MainActivity.this.I0) {
                return;
            }
            MainActivity.this.l0();
        }
    }

    class h extends PhoneStateListener {
        h() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            MainActivity.this.d0(signalStrength, 0);
        }
    }

    class i extends PhoneStateListener {
        i() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            MainActivity.this.d0(signalStrength, 1);
        }
    }

    class j extends PhoneStateListener {
        j() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            MainActivity.this.c0(signalStrength);
        }
    }

    private void E0() {
        runOnUiThread(new b(this));
    }

    private void G(int i2) {
        boolean z2;
        ProgressBar progressBar;
        ProgressBar progressBar2;
        TextView textView;
        TextView textView2;
        if (i2 == 0) {
            z2 = this.t0;
            progressBar = this.G;
            progressBar2 = this.H;
            textView = this.f3195w;
            textView2 = this.f3196x;
        } else {
            z2 = this.u0;
            progressBar = this.I;
            progressBar2 = this.J;
            textView = this.K;
            textView2 = this.L;
        }
        int iD = i0.b.d(z2);
        textView.setVisibility(iD);
        progressBar.setVisibility(iD);
        if (z2) {
            return;
        }
        textView2.setVisibility(iD);
        progressBar2.setVisibility(iD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(p0.b bVar) {
        boolean zG = bVar.g();
        String strA = bVar.a(this.f3193u);
        String strB = bVar.b(this.f3193u);
        boolean zH = bVar.h();
        boolean zI = bVar.i();
        q0.a.b(M0, bVar.toString());
        CardView cardView = this.T;
        if (zG) {
            cardView.setVisibility(0);
        } else {
            cardView.setVisibility(8);
        }
        this.s0 = zG;
        this.t0 = zH;
        this.u0 = zI;
        boolean z2 = zH && zI && bVar.f3133x != bVar.f3134y;
        w0(strA, zH, bVar.f3115f, bVar.f3119j, bVar.f3117h, bVar.f3121l, bVar.f3125p, bVar.f3123n, bVar.f3127r, z2 ? bVar.f3133x : -1, 0);
        w0(strB, zI, bVar.f3116g, bVar.f3120k, bVar.f3118i, bVar.f3122m, bVar.f3126q, bVar.f3124o, bVar.f3128s, z2 ? bVar.f3134y : -1, 1);
        t0(!z2);
        if (p0.c.c() == 2) {
            this.f3190o0 = p0.h.e();
        }
        if (Build.VERSION.SDK_INT >= 24 && bVar.f()) {
            int iC = bVar.c();
            int iD = bVar.d();
            this.f3188m0 = this.f3187l0.createForSubscriptionId(iC);
            this.f3189n0 = this.f3187l0.createForSubscriptionId(iD);
        }
        Q();
    }

    private void Q() {
        G(0);
        G(1);
    }

    private static String W() {
        return Build.VERSION.SDK_INT >= 29 ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.ACCESS_COARSE_LOCATION";
    }

    public static String X(String str) {
        if (str.equals("0")) {
            return null;
        }
        return str;
    }

    private static String Z() {
        return "android.permission.READ_PHONE_STATE";
    }

    private void i0(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        TelephonyManager telephonyManager;
        PhoneStateListener phoneStateListener;
        Object obj = this.f3190o0;
        if (obj != null) {
            p0.h.f(obj, this.f3191p0, i2, 0);
            p0.h.f(this.f3190o0, this.f3191p0, i2, 1);
            return;
        }
        TelephonyManager telephonyManager2 = this.f3188m0;
        if (telephonyManager2 == null || this.f3189n0 == null) {
            telephonyManager = this.f3187l0;
            if (telephonyManager == null) {
                return;
            } else {
                phoneStateListener = this.f3191p0;
            }
        } else {
            telephonyManager2.listen(this.f3192q0, i2);
            telephonyManager = this.f3189n0;
            phoneStateListener = this.r0;
        }
        telephonyManager.listen(phoneStateListener, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(String str) {
        this.U.setText(str);
    }

    private void v0(o0.c cVar, int i2) {
        String strT;
        boolean z2;
        ProgressBar progressBar;
        ProgressBar progressBar2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (Build.VERSION.SDK_INT < 29 && cVar.f3053e == cVar.f3050b) {
            int i3 = cVar.f3052d;
            int i4 = cVar.f3049a;
        }
        int i5 = cVar.f3053e;
        if (i5 != 99) {
            strT = ru.andr7e.siminfo.f.t(cVar.f3052d, i5);
        } else if (cVar.f3054f > 0) {
            strT = "Level " + cVar.f3054f + " / 4";
        } else {
            strT = "-";
        }
        int i6 = cVar.f3052d;
        if (i6 == -1 || i6 == Integer.MAX_VALUE) {
            i6 = cVar.f3049a;
        }
        int iA = !(i6 == -1 || i6 == Integer.MAX_VALUE) ? o0.c.a(i6) : 0;
        int size = cVar.f3056h.size();
        boolean z3 = size > 1;
        boolean z4 = size >= 1;
        Iterator<o0.a> it = cVar.f3056h.iterator();
        while (it.hasNext()) {
            strT = strT + "\n" + it.next().toString();
        }
        if (i2 == 0) {
            z2 = this.t0;
            progressBar = this.G;
            progressBar2 = this.H;
            textView = this.f3195w;
            textView2 = this.f3196x;
            textView3 = this.f3197y;
        } else {
            z2 = this.u0;
            progressBar = this.I;
            progressBar2 = this.J;
            textView = this.K;
            textView2 = this.L;
            textView3 = this.M;
        }
        if (z4) {
            o0.a aVar = cVar.f3056h.get(0);
            String string = aVar.toString();
            if (this.f3194v) {
                string = "OLD\n" + strT + "\nOLD END\n" + string;
            }
            textView.setText(string);
            progressBar.setProgress(aVar.b() ? o0.c.a(aVar.a()) : 0);
            if (z3) {
                o0.a aVar2 = cVar.f3056h.get(1);
                int iA2 = aVar2.b() ? o0.c.a(aVar2.a()) : 0;
                textView2.setText(aVar2.toString());
                progressBar2.setProgress(iA2);
            }
        } else {
            textView.setText(strT);
            textView3.setText("");
            progressBar.setProgress(iA);
        }
        int iD = i0.b.d(z3);
        textView2.setVisibility(iD);
        progressBar2.setVisibility(iD);
        int iD2 = i0.b.d(z2);
        textView.setVisibility(iD2);
        progressBar.setVisibility(iD2);
        textView3.setVisibility(i0.b.d(false));
    }

    private void w0(String str, boolean z2, int i2, String str2, String str3, String str4, String str5, String str6, String str7, int i3, int i4) {
        int i5;
        String str8;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        int i6;
        TextView textView;
        LinearLayout linearLayout;
        int i7;
        TextView textView2;
        String strB;
        String str9 = M0;
        q0.a.b(str9, "slotId=" + i4);
        String string = getString(z2 ? R.string.ready : R.string.not_ready);
        int i8 = z2 ? 0 : 8;
        q0.a.b(str9, "networkType=" + i2);
        String str10 = getString(R.string.imei) + ": " + str;
        String str11 = getString(R.string.sim_state) + ": " + string;
        String strA = n0.g.a(i2);
        if (!strA.startsWith("Unk") || (strB = ru.andr7e.siminfo.c.b(str6)) == null) {
            i5 = i8;
        } else {
            i5 = i8;
            strA = strA + "/" + strB;
        }
        if ((i4 == 0 ? this.v0 : this.w0).b()) {
            str8 = str10;
            strA = strA + " (" + ru.andr7e.siminfo.b.c(5) + ")";
        } else {
            str8 = str10;
        }
        String str12 = getString(R.string.network_type) + ": " + strA;
        if (str5 != null) {
            sb = new StringBuilder();
            sb.append(getString(R.string.sim_operator_name));
            sb.append(": ");
            sb.append(!str5.isEmpty() ? str5 : "-");
        } else {
            sb = new StringBuilder();
            sb.append(getString(R.string.sim_operator_name));
            sb.append(": ");
            sb.append(str2);
        }
        String string2 = sb.toString();
        if (str5 != null && str2 != null && !str5.equals(str2)) {
            string2 = string2 + " (" + str2 + ")";
        }
        if (str6 != null) {
            sb2 = new StringBuilder();
            sb2.append(getString(R.string.sim_operator_code));
            sb2.append(": ");
            sb2.append(str6);
        } else {
            sb2 = new StringBuilder();
            sb2.append(getString(R.string.sim_operator_code));
            sb2.append(": ");
            sb2.append(str3);
        }
        String string3 = sb2.toString();
        if (str6 != null && str3 != null && !str6.equals(str3)) {
            string3 = string3 + " (" + str3 + ")";
        }
        if (str6 != null) {
            sb3 = new StringBuilder();
            sb3.append(getString(R.string.sim_country_code));
            sb3.append(": ");
            sb3.append(str7);
        } else {
            sb3 = new StringBuilder();
            sb3.append(getString(R.string.sim_country_code));
            sb3.append(": ");
            sb3.append(str4);
        }
        String string4 = sb3.toString();
        if (str7 != null && str4 != null && !str7.equals(str4)) {
            string4 = string4 + " (" + str4 + ")";
        }
        int i9 = (z2 && (i3 >= 0)) ? 0 : 8;
        u0(i3 == 1, i4);
        if (i4 == 0) {
            if (str != null) {
                this.f3198z.setText(str8);
                if (this.f3198z.getVisibility() == 8) {
                    textView2 = this.f3198z;
                    i7 = 0;
                }
                this.A.setText(str11);
                this.C.setText(string2);
                this.B.setText(str12);
                this.D.setText(string3);
                this.E.setText(string4);
                int i10 = i5;
                this.C.setVisibility(i10);
                this.B.setVisibility(i10);
                this.D.setVisibility(i10);
                this.E.setVisibility(i10);
                linearLayout = this.f3178c0;
            } else {
                i7 = 8;
                textView2 = this.f3198z;
            }
            textView2.setVisibility(i7);
            this.A.setText(str11);
            this.C.setText(string2);
            this.B.setText(str12);
            this.D.setText(string3);
            this.E.setText(string4);
            int i102 = i5;
            this.C.setVisibility(i102);
            this.B.setVisibility(i102);
            this.D.setVisibility(i102);
            this.E.setVisibility(i102);
            linearLayout = this.f3178c0;
        } else {
            int i11 = i5;
            String str13 = str8;
            if (str != null) {
                this.N.setText(str13);
                if (this.N.getVisibility() == 8) {
                    textView = this.N;
                    i6 = 0;
                }
                this.O.setText(str11);
                this.R.setText(string3);
                this.S.setText(string4);
                this.Q.setText(string2);
                this.P.setText(str12);
                this.Q.setVisibility(i11);
                this.P.setVisibility(i11);
                this.R.setVisibility(i11);
                this.S.setVisibility(i11);
                linearLayout = this.f3179d0;
            } else {
                i6 = 8;
                textView = this.N;
            }
            textView.setVisibility(i6);
            this.O.setText(str11);
            this.R.setText(string3);
            this.S.setText(string4);
            this.Q.setText(string2);
            this.P.setText(str12);
            this.Q.setVisibility(i11);
            this.P.setVisibility(i11);
            this.R.setVisibility(i11);
            this.S.setVisibility(i11);
            linearLayout = this.f3179d0;
        }
        linearLayout.setVisibility(i9);
    }

    void A0() {
        try {
            B0();
        } catch (SecurityException | Exception unused) {
        }
    }

    void B0() {
        String strT;
        boolean z2;
        int iA;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 >= 28) {
            ServiceState serviceState = this.f3187l0.getServiceState();
            String string = null;
            boolean z3 = false;
            if (i2 >= 28) {
                StringBuilder sb = new StringBuilder();
                int duplexMode = serviceState.getDuplexMode();
                String str = M0;
                q0.a.b(str, "duplexMode=" + duplexMode);
                strT = T(duplexMode);
                int channelNumber = serviceState.getChannelNumber();
                int[] cellBandwidths = serviceState.getCellBandwidths();
                boolean z4 = true;
                if (cellBandwidths == null || cellBandwidths.length <= 0) {
                    z2 = false;
                    z4 = false;
                } else {
                    q0.a.b(str, "bandwidths=" + cellBandwidths.length);
                    int i3 = 0;
                    for (int i4 : cellBandwidths) {
                        q0.a.b(M0, "bw=" + i4);
                        String strH = ru.andr7e.siminfo.f.h(i4, "");
                        if (strH != null) {
                            if (i3 > 0) {
                                sb.append(" + ");
                            }
                            sb.append(strH);
                            i3++;
                        }
                    }
                    if (i3 > 0) {
                        sb.append(" MHz");
                    }
                    z2 = true;
                }
                int iE = ru.andr7e.siminfo.c.e();
                if (n0.b.e() && channelNumber > 0 && ru.andr7e.siminfo.f.w(channelNumber) && z4 && iE == 3 && (iA = n0.f.a(channelNumber)) > 0) {
                    sb.append("\n");
                    sb.append(iA);
                    sb.append("A");
                    int i5 = 0;
                    for (int i6 : cellBandwidths) {
                        if (i5 > 0) {
                            sb.append(" ");
                            sb.append("-");
                            sb.append(" ");
                            sb.append("*");
                        }
                        i5++;
                    }
                }
                z3 = z2;
                string = sb.toString();
            } else {
                strT = null;
            }
            runOnUiThread(new f(strT, z3, string));
        }
    }

    void C0() {
        this.f3194v = this.x0.getBoolean("show_debug_signals", false);
    }

    void D0() {
        this.f3193u = this.x0.getBoolean("show_tac_of_imei", false);
    }

    void P(StringBuilder sb, TextView textView) {
        CharSequence text;
        if (textView.getVisibility() == 8 || (text = textView.getText()) == null) {
            return;
        }
        sb.append(text);
        sb.append("\n");
    }

    void R() {
        boolean zH0 = h0();
        MenuItem menuItem = this.F0;
        if (menuItem != null) {
            menuItem.setVisible(zH0);
        }
        MenuItem menuItem2 = this.G0;
        if (menuItem2 != null) {
            menuItem2.setVisible(zH0 ? false : true);
        }
    }

    void S() throws Resources.NotFoundException {
        StringBuilder sb = new StringBuilder();
        sb.append("SIM1");
        sb.append("\n");
        P(sb, this.f3195w);
        if (this.G.getVisibility() == 0) {
            sb.append(this.G.getProgress() + "%");
            sb.append("\n");
        }
        P(sb, this.f3196x);
        if (this.H.getVisibility() == 0) {
            sb.append(this.H.getProgress() + "%");
            sb.append("\n");
        }
        P(sb, this.f3197y);
        P(sb, this.C);
        P(sb, this.B);
        P(sb, this.D);
        P(sb, this.E);
        P(sb, this.A);
        P(sb, this.f3198z);
        sb.append("\n");
        sb.append("SIM2");
        sb.append("\n");
        P(sb, this.K);
        if (this.I.getVisibility() == 0) {
            sb.append(this.I.getProgress() + "%");
            sb.append("\n");
        }
        if (this.J.getVisibility() == 0) {
            sb.append(this.J.getProgress() + "%");
            sb.append("\n");
        }
        P(sb, this.M);
        P(sb, this.Q);
        P(sb, this.P);
        P(sb, this.R);
        P(sb, this.S);
        P(sb, this.O);
        P(sb, this.N);
        sb.append("\n");
        String string = getString(R.string.neighbor_cells);
        if (string != null) {
            sb.append((CharSequence) string);
            sb.append("\n");
        }
        P(sb, this.U);
        int i2 = 0;
        for (ru.andr7e.siminfo.b bVar : this.z0) {
            if (i2 > 0) {
                sb.append("\n");
            }
            sb.append("\n");
            ru.andr7e.siminfo.f.C(bVar, sb);
            i2++;
        }
        String string2 = sb.toString();
        if (string2.isEmpty()) {
            return;
        }
        String string3 = getResources().getString(R.string.copied_to_clipboard);
        i0.a.a(this, string2);
        Toast.makeText(this, string3 + "\n" + string2, 1).show();
    }

    String T(int i2) {
        if (i2 == 1) {
            return "FDD";
        }
        if (i2 == 2) {
            return "TDD";
        }
        return null;
    }

    public void U() {
        if (h0()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.B0;
        if (j2 >= 0 && jCurrentTimeMillis < j2 + 5000) {
            return;
        }
        E0();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f3187l0.getDataNetworkType();
            } else {
                this.f3187l0.getNetworkType();
            }
        } catch (SecurityException e2) {
            e2.printStackTrace();
            this.B0 = System.currentTimeMillis();
        }
        this.B0 = System.currentTimeMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void V() {
        /*
            r7 = this;
            boolean r0 = r7.h0()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
            r2 = 29
            r3 = 1
            if (r1 < r2) goto L1a
            r7.q0()     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
            long r1 = r7.L0     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L1b
        L1a:
            r0 = 1
        L1b:
            if (r0 == 0) goto L23
            r7.a0()     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
            r7.m0()     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
        L23:
            r7.A0()     // Catch: java.lang.Exception -> L27 java.lang.NoSuchMethodError -> L2f java.lang.SecurityException -> L3a
            goto L3e
        L27:
            r0 = move-exception
            java.lang.String r1 = ru.andr7e.siminfo.MainActivity.M0
            java.lang.String r0 = r0.getMessage()
            goto L36
        L2f:
            r0 = move-exception
            java.lang.String r1 = ru.andr7e.siminfo.MainActivity.M0
            java.lang.String r0 = r0.getMessage()
        L36:
            q0.a.a(r1, r0)
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.andr7e.siminfo.MainActivity.V():void");
    }

    ExecutorService Y() {
        if (this.C0 == null) {
            this.C0 = Executors.newSingleThreadExecutor();
        }
        return this.C0;
    }

    void a0() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<CellInfo> allCellInfo;
        this.A0.clear();
        if (Build.VERSION.SDK_INT >= 17) {
            if (p0.c.c() == 2) {
                Object obj = this.f3190o0;
                if (obj != null) {
                    List<CellInfo> listC = p0.h.c(obj, 0);
                    List<CellInfo> listC2 = p0.h.c(this.f3190o0, 1);
                    if (listC != null && !listC.isEmpty()) {
                        this.A0.addAll(listC);
                    }
                    if (listC2 != null && !listC2.isEmpty()) {
                        this.A0.addAll(listC2);
                    }
                }
                if (!this.A0.isEmpty() || (allCellInfo = this.f3187l0.getAllCellInfo()) == null || allCellInfo.isEmpty()) {
                    return;
                }
            } else {
                allCellInfo = this.f3187l0.getAllCellInfo();
                if (allCellInfo == null || allCellInfo.isEmpty()) {
                    return;
                }
            }
            this.A0.addAll(allCellInfo);
        }
    }

    void b0() {
        String strJ0;
        if (p0.c.c() == 2) {
            boolean z2 = this.t0;
            if (z2 && this.u0) {
                strJ0 = (("SIM1 " + k0(0)) + "\n") + "SIM2 " + k0(1);
            } else {
                strJ0 = z2 ? k0(0) : this.u0 ? k0(1) : null;
            }
        } else {
            strJ0 = j0();
        }
        runOnUiThread(new d(strJ0));
    }

    public void c0(SignalStrength signalStrength) {
        int iE;
        o0.c cVar;
        if (h0() || signalStrength == null) {
            return;
        }
        if (p0.c.c() == 2) {
            iE = o0.d.e(signalStrength);
            q0.a.b(M0, "slotId=" + iE);
        } else {
            iE = (this.t0 || !this.u0) ? 0 : 1;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (iE != 1) {
                o0.c.e(signalStrength, this.v0);
                v0(this.v0, 0);
                cVar = this.v0;
            } else {
                o0.c.e(signalStrength, this.w0);
                v0(this.w0, 1);
                cVar = this.w0;
            }
        } else if (iE != 1) {
            o0.c.c(signalStrength, this.v0);
            o0.c.d(signalStrength, this.v0);
            v0(this.v0, 0);
            cVar = this.v0;
        } else {
            o0.c.c(signalStrength, this.w0);
            o0.c.d(signalStrength, this.w0);
            v0(this.w0, 1);
            cVar = this.w0;
        }
        cVar.f();
    }

    public void d0(SignalStrength signalStrength, int i2) {
        o0.c cVar;
        if (h0() || signalStrength == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i2 != 1) {
                o0.c.e(signalStrength, this.v0);
                v0(this.v0, 0);
                cVar = this.v0;
            } else {
                o0.c.e(signalStrength, this.w0);
                v0(this.w0, 1);
                cVar = this.w0;
            }
        } else if (i2 != 1) {
            o0.c.c(signalStrength, this.v0);
            o0.c.d(signalStrength, this.v0);
            v0(this.v0, 0);
            cVar = this.v0;
        } else {
            o0.c.c(signalStrength, this.w0);
            o0.c.d(signalStrength, this.w0);
            v0(this.w0, 1);
            cVar = this.w0;
        }
        cVar.f();
    }

    void e0() {
        boolean zIsEnabled;
        boolean z2;
        EuiccManager euiccManager;
        if (Build.VERSION.SDK_INT < 28 || !getPackageManager().hasSystemFeature("android.hardware.telephony.euicc") || (euiccManager = (EuiccManager) getSystemService("euicc")) == null) {
            zIsEnabled = false;
            z2 = false;
        } else {
            zIsEnabled = euiccManager.isEnabled();
            z2 = true;
        }
        if (!z2) {
            this.f3184i0.setVisibility(8);
            return;
        }
        this.f3185j0.setVisibility(i0.b.d(zIsEnabled));
        this.f3186k0.setVisibility(i0.b.d(!zIsEnabled));
        this.f3184i0.setVisibility(0);
    }

    void f0() {
        if (O0.isEmpty()) {
            O0 = Locale.getDefault().getLanguage();
        }
        String strX = X(this.x0.getString("language_list", "0"));
        if (strX == null) {
            strX = O0;
        }
        m0.a.a(this, strX);
    }

    void g0(Menu menu) {
        this.F0 = menu.findItem(R.id.action_play);
        this.G0 = menu.findItem(R.id.action_pause);
    }

    boolean h0() {
        return this.E0;
    }

    public String j0() {
        return ru.andr7e.siminfo.c.h(this.f3187l0.getCellLocation());
    }

    @Override // ru.andr7e.siminfo.d.c
    public void k(ru.andr7e.siminfo.b bVar) {
        try {
            StringBuilder sb = new StringBuilder();
            ru.andr7e.siminfo.f.C(bVar, sb);
            k0.a.a(this, "Info", sb.toString(), "OK");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public String k0(int i2) {
        return ru.andr7e.siminfo.c.h(p0.h.d(this.f3190o0, i2));
    }

    void l0() {
        String str = M0;
        q0.a.b(str, "myRefresh");
        U();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.L0;
        if (j2 >= 0 && jCurrentTimeMillis < j2 + 3000) {
            return;
        }
        q0.a.b(str, "myRefresh do");
        V();
        this.L0 = System.currentTimeMillis();
    }

    public void m0() {
        int size = this.A0.size();
        q0.a.b(M0, "CellInfoList=" + size);
        boolean zIsEmpty = this.A0.isEmpty() ^ true;
        if (!zIsEmpty) {
            b0();
        } else {
            ru.andr7e.siminfo.c.a(this.z0, this.A0);
            runOnUiThread(new c(zIsEmpty, this.z0.size()));
        }
    }

    void n0(int i2) {
        String str = "";
        if (i2 > 0) {
            str = "" + i2;
        }
        this.V.setText(str);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String string = this.x0.getString("theme_list", "4");
        if (string != null && (string.equals("3") || string.equals("4"))) {
            int i2 = configuration.uiMode & 48;
            if (i2 == 16 || i2 == 32) {
                recreate();
            }
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.x0 = defaultSharedPreferences;
        int iA = n0.h.a(defaultSharedPreferences, this);
        if (iA > 0) {
            if (iA == 1) {
                i2 = R.style.AppTheme_Dark;
            } else if (iA == 2) {
                i2 = R.style.AppTheme_Black;
            }
            setTheme(i2);
        }
        D0();
        C0();
        z0();
        f0();
        setContentView(R.layout.activity_main);
        this.T = (CardView) findViewById(R.id.sim2CardView);
        this.f3195w = (TextView) findViewById(R.id.signalTextView10);
        this.f3196x = (TextView) findViewById(R.id.signalTextView11);
        this.f3197y = (TextView) findViewById(R.id.asuTextView);
        this.f3198z = (TextView) findViewById(R.id.imeiTextView);
        this.A = (TextView) findViewById(R.id.simStatustextView);
        this.B = (TextView) findViewById(R.id.networkTypeTextView);
        this.C = (TextView) findViewById(R.id.operatorNameTextView);
        this.D = (TextView) findViewById(R.id.operatorCodeTextView);
        this.E = (TextView) findViewById(R.id.countryTextView);
        this.F = (TextView) findViewById(R.id.aggregationTextView);
        this.G = (ProgressBar) findViewById(R.id.progressBar10);
        this.H = (ProgressBar) findViewById(R.id.progressBar11);
        this.K = (TextView) findViewById(R.id.signalTextView20);
        this.L = (TextView) findViewById(R.id.signalTextView21);
        this.M = (TextView) findViewById(R.id.asuTextView2);
        this.N = (TextView) findViewById(R.id.imeiTextView2);
        this.O = (TextView) findViewById(R.id.simStatustextView2);
        this.P = (TextView) findViewById(R.id.networkTypeTextView2);
        this.Q = (TextView) findViewById(R.id.operatorNameTextView2);
        this.R = (TextView) findViewById(R.id.operatorCodeTextView2);
        this.S = (TextView) findViewById(R.id.countryTextView2);
        this.I = (ProgressBar) findViewById(R.id.progressBar20);
        this.J = (ProgressBar) findViewById(R.id.progressBar21);
        this.f3178c0 = (LinearLayout) findViewById(R.id.data_transfer_for_sim1);
        this.f3179d0 = (LinearLayout) findViewById(R.id.data_transfer_for_sim2);
        this.f3180e0 = (ImageView) this.f3178c0.findViewById(R.id.dataActiveOnImageViewS);
        this.f3181f0 = (ImageView) this.f3178c0.findViewById(R.id.dataActiveOffImageViewS);
        this.f3182g0 = (ImageView) this.f3179d0.findViewById(R.id.dataActiveOnImageViewS);
        this.f3183h0 = (ImageView) this.f3179d0.findViewById(R.id.dataActiveOffImageViewS);
        this.U = (TextView) findViewById(R.id.neighborTextView);
        this.V = (TextView) findViewById(R.id.neighborCountTextView);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.neighborRecyclerView);
        this.W = recyclerView;
        s0(recyclerView);
        this.X = (CardView) findViewById(R.id.commonCardView);
        this.Y = (TextView) findViewById(R.id.duplexModeTextView);
        this.Z = (TextView) findViewById(R.id.dataActiveTextView);
        this.f3176a0 = (ImageView) findViewById(R.id.dataActiveOnImageView);
        this.f3177b0 = (ImageView) findViewById(R.id.dataActiveOffImageView);
        this.f3197y.setVisibility(8);
        this.M.setVisibility(8);
        this.X.setOnLongClickListener(new a(this));
        this.f3184i0 = (CardView) findViewById(R.id.esimCardView);
        this.f3185j0 = (ImageView) findViewById(R.id.esimAvailableOnImageView);
        this.f3186k0 = (ImageView) findViewById(R.id.esimAvailableOffImageView);
        this.x0.registerOnSharedPreferenceChangeListener(this);
        this.f3187l0 = (TelephonyManager) getSystemService("phone");
        this.f3191p0 = new j();
        this.f3192q0 = new h();
        this.r0 = new i();
        if (Build.VERSION.SDK_INT >= 23) {
            String strW = W();
            int iA2 = r.a.a(this, Z());
            int iA3 = r.a.a(this, strW);
            if (iA2 == 0 || iA3 == 0 || N0) {
                l0();
            } else {
                r0();
                N0 = true;
            }
        }
        e0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        g0(menu);
        R();
        boolean zF = MyApplication.e().f();
        MenuItem menuItemFindItem = menu.findItem(R.id.action_copy_info);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(zF);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.action_cell_list);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(n0.b.b());
        }
        MenuItem menuItemFindItem3 = menu.findItem(R.id.action_report);
        if (menuItemFindItem3 == null) {
            return true;
        }
        menuItemFindItem3.setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) throws Resources.NotFoundException, SecurityException {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_settings) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
            return true;
        }
        if (itemId == R.id.action_about) {
            startActivity(new Intent(this, (Class<?>) AboutActivity.class));
            return true;
        }
        if (itemId == R.id.action_report) {
            String str = M0;
            q0.a.b(str, "Start methods...");
            p0.d.a(this);
            try {
                q0.a.b(str, "getDeviceSoftwareVersion=" + this.f3187l0.getDeviceSoftwareVersion());
            } catch (SecurityException unused) {
            }
            q0.a.b(M0, "End methods...");
            return true;
        }
        if (itemId == R.id.action_copy_info) {
            S();
            return true;
        }
        if (itemId == R.id.action_cell_list && !MyApplication.e().c().isEmpty()) {
            Intent intent = new Intent(this, (Class<?>) ShowInfoListActivity.class);
            intent.putExtra("type", 0);
            startActivity(intent);
        }
        if (itemId == R.id.action_pause) {
            MenuItem menuItem2 = this.G0;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
            }
            MenuItem menuItem3 = this.F0;
            if (menuItem3 != null) {
                menuItem3.setVisible(true);
            }
            this.E0 = true;
            return true;
        }
        if (itemId != R.id.action_play) {
            return super.onOptionsItemSelected(menuItem);
        }
        MenuItem menuItem4 = this.G0;
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
        MenuItem menuItem5 = this.F0;
        if (menuItem5 != null) {
            menuItem5.setVisible(false);
        }
        this.E0 = false;
        return true;
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPause();
        y0();
        i0(0);
    }

    @Override // androidx.fragment.app.c, android.app.Activity, q.a.b
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 100 && iArr.length > 0) {
            if (iArr[0] == 0) {
                q0.a.b(M0, "granted");
                recreate();
            } else {
                q0.a.b(M0, "denied");
                l0();
            }
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onResume();
        x0();
        i0(256);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (str.equals("use_dark_theme") || str.equals("theme_list") || str.equals("language_list")) {
                recreate();
            } else if (str.equals("show_tac_of_imei")) {
                D0();
            } else if (str.equals("show_debug_signals")) {
                C0();
            } else if (!str.equals("gnb_5g_len_list")) {
            } else {
                z0();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    void p0(boolean z2) {
        this.W.setVisibility(i0.b.d(z2));
        this.U.setVisibility(i0.b.d(!z2));
    }

    void q0() {
        if (r.a.a(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        this.D0 = new e();
        this.f3187l0.requestCellInfoUpdate(Y(), this.D0);
    }

    public void r0() {
        q.a.h(this, new String[]{Z(), W()}, 100);
    }

    void s0(View view) {
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            ru.andr7e.siminfo.g gVar = new ru.andr7e.siminfo.g(this.z0, this);
            this.y0 = gVar;
            recyclerView.setAdapter(gVar);
        }
    }

    void t0(boolean z2) {
        if (!z2) {
            this.Z.setVisibility(8);
            this.f3176a0.setVisibility(8);
            this.f3177b0.setVisibility(8);
        } else {
            boolean z3 = this.f3187l0.getDataState() != 0;
            this.Z.setVisibility(0);
            this.f3176a0.setVisibility(i0.b.d(z3));
            this.f3177b0.setVisibility(i0.b.d(!z3));
        }
    }

    void u0(boolean z2, int i2) {
        ImageView imageView;
        if (i2 == 0) {
            this.f3180e0.setVisibility(i0.b.d(z2));
            imageView = this.f3181f0;
        } else {
            this.f3182g0.setVisibility(i0.b.d(z2));
            imageView = this.f3183h0;
        }
        imageView.setVisibility(i0.b.d(!z2));
    }

    public void x0() {
        try {
            this.K0 = new g();
            Timer timer = new Timer();
            this.J0 = timer;
            TimerTask timerTask = this.K0;
            int i2 = this.H0;
            timer.schedule(timerTask, i2, i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void y0() {
        Timer timer = this.J0;
        if (timer != null) {
            try {
                timer.cancel();
                this.J0.purge();
                this.J0 = null;
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    void z0() {
        MyApplication.e().i(i0.b.c(this.x0.getString("gnb_5g_len_list", "")));
    }
}
