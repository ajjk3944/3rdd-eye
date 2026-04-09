package H4;

import A3.z;
import E.h;
import J3.k;
import Q4.m;
import Q4.t;
import V4.q;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import c.C0372L;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.signal.MainActivity;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import com.lefan.signal.ui.wifi.WifiSignalView;
import d5.AbstractC2282j;
import d5.o;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.m1;
import p5.l;
import q5.i;
import q5.n;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1807c;

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f1805a = i;
        this.f1806b = obj;
        this.f1807c = obj2;
    }

    @Override // p5.l
    public final Object f(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i = this.f1805a;
        int i3 = 3;
        Object obj2 = null;
        C0412i c0412i = C0412i.f5929a;
        Object obj3 = this.f1807c;
        Object obj4 = this.f1806b;
        int i6 = 0;
        switch (i) {
            case 0:
                DrawerLayout drawerLayout = (DrawerLayout) obj4;
                MainActivity mainActivity = (MainActivity) obj3;
                int i7 = MainActivity.f18804V;
                i.e((C0372L) obj, "$this$addCallback");
                View viewD = drawerLayout.d(8388611);
                if (viewD != null ? DrawerLayout.k(viewD) : false) {
                    View viewD2 = drawerLayout.d(8388611);
                    if (viewD2 == null) {
                        throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.h(8388611));
                    }
                    drawerLayout.b(viewD2, true);
                } else if (mainActivity.f18811U) {
                    mainActivity.finish();
                } else {
                    mainActivity.f18811U = true;
                    k kVarF = k.f(drawerLayout, mainActivity.getString(R.string.press_again_exit), 0);
                    kVarF.g(kVarF.f2117h.getText(R.string.action_cancel), new d(mainActivity, i6));
                    kVarF.h();
                    new Handler(Looper.getMainLooper()).postDelayed(new z(i3, mainActivity), 2000L);
                }
                return c0412i;
            case 1:
                TextView textView = (TextView) obj3;
                Double d6 = (Double) obj;
                if (((N4.c) obj4).f2990C0) {
                    if (R2.a.f3390d) {
                        Locale locale = F4.e.f1457a;
                        str2 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{d6}, 1));
                    } else {
                        str2 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{d6}, 1));
                    }
                    textView.setText(str2);
                } else {
                    Double dValueOf = Double.valueOf(d6.doubleValue() * 3.28084f);
                    if (R2.a.f3390d) {
                        Locale locale2 = F4.e.f1457a;
                        str = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{dValueOf}, 1));
                    } else {
                        str = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{dValueOf}, 1));
                    }
                    textView.setText(str);
                }
                return c0412i;
            case 2:
                Q4.c cVar = (Q4.c) obj4;
                q5.l lVar = (q5.l) obj3;
                List list = (List) obj;
                if (cVar.f3195C0 && !lVar.f23296a) {
                    cVar.f3196D0.o(list);
                }
                return c0412i;
            case 3:
                n nVar = (n) obj4;
                BluetoothActivity bluetoothActivity = (BluetoothActivity) obj3;
                List list2 = (List) obj;
                int i8 = BluetoothActivity.f18879D0;
                if (System.currentTimeMillis() - nVar.f23298a >= 1000) {
                    nVar.f23298a = System.currentTimeMillis();
                    K4.a aVar = bluetoothActivity.f18883O;
                    if (aVar == null) {
                        i.g("binding");
                        throw null;
                    }
                    TextView textView2 = aVar.f2172P;
                    Integer numValueOf = Integer.valueOf(list2.size());
                    if (R2.a.f3390d) {
                        Locale locale3 = F4.e.f1457a;
                        str3 = String.format(F4.e.b(), "(%d)", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    } else {
                        str3 = String.format(Locale.ENGLISH, "(%d)", Arrays.copyOf(new Object[]{numValueOf}, 1));
                    }
                    textView2.setText(str3);
                    bluetoothActivity.f18893Y.o(AbstractC2282j.g0(3, list2));
                    if (list2.size() > 3) {
                        MaterialButton materialButton = bluetoothActivity.f18906m0;
                        if (materialButton != null) {
                            materialButton.setVisibility(0);
                        }
                    } else {
                        MaterialButton materialButton2 = bluetoothActivity.f18906m0;
                        if (materialButton2 != null) {
                            materialButton2.setVisibility(8);
                        }
                    }
                }
                return c0412i;
            case 4:
                BluetoothActivity bluetoothActivity2 = (BluetoothActivity) obj4;
                MaterialButton materialButton3 = (MaterialButton) obj3;
                List list3 = (List) obj;
                K4.a aVar2 = bluetoothActivity2.f18883O;
                if (aVar2 == null) {
                    i.g("binding");
                    throw null;
                }
                TextView textView3 = aVar2.f2167J;
                Integer numValueOf2 = Integer.valueOf(list3.size());
                if (R2.a.f3390d) {
                    Locale locale4 = F4.e.f1457a;
                    str4 = String.format(F4.e.b(), "(%d)", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                } else {
                    str4 = String.format(Locale.ENGLISH, "(%d)", Arrays.copyOf(new Object[]{numValueOf2}, 1));
                }
                textView3.setText(str4);
                bluetoothActivity2.f18892X.o(AbstractC2282j.g0(3, list3));
                if (list3.size() > 3) {
                    materialButton3.setVisibility(0);
                } else {
                    materialButton3.setVisibility(8);
                }
                return c0412i;
            case 5:
                t tVar = (t) obj4;
                String str8 = (String) obj3;
                List list4 = (List) obj;
                i.b(list4);
                Iterator it = list4.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (i.a(((m) next).f3217d, str8)) {
                            obj2 = next;
                        }
                    }
                }
                m mVar = (m) obj2;
                if (mVar != null) {
                    m1 m1Var = tVar.f3231A0;
                    i.b(m1Var);
                    TextView textView4 = (TextView) m1Var.f22584d;
                    Integer numValueOf3 = Integer.valueOf(mVar.f3216c);
                    if (R2.a.f3390d) {
                        Locale locale5 = F4.e.f1457a;
                        str5 = String.format(F4.e.b(), "%d dBm", Arrays.copyOf(new Object[]{numValueOf3}, 1));
                    } else {
                        str5 = String.format(Locale.ENGLISH, "%d dBm", Arrays.copyOf(new Object[]{numValueOf3}, 1));
                    }
                    textView4.setText(str5);
                    m1 m1Var2 = tVar.f3231A0;
                    i.b(m1Var2);
                    ((WifiSignalView) m1Var2.f22585e).a(mVar.f3216c);
                } else {
                    m1 m1Var3 = tVar.f3231A0;
                    i.b(m1Var3);
                    ((TextView) m1Var3.f22584d).setText(tVar.r(R.string.no_signal));
                }
                return c0412i;
            case 6:
                TextView textView5 = (TextView) obj3;
                Double d7 = (Double) obj;
                if (((q5.l) obj4).f23296a) {
                    if (R2.a.f3390d) {
                        Locale locale6 = F4.e.f1457a;
                        str7 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{d7}, 1));
                    } else {
                        str7 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{d7}, 1));
                    }
                    textView5.setText(str7);
                } else {
                    Double dValueOf2 = Double.valueOf(d7.doubleValue() * 3.28084f);
                    if (R2.a.f3390d) {
                        Locale locale7 = F4.e.f1457a;
                        str6 = String.format(F4.e.b(), "%.2f", Arrays.copyOf(new Object[]{dValueOf2}, 1));
                    } else {
                        str6 = String.format(Locale.ENGLISH, "%.2f", Arrays.copyOf(new Object[]{dValueOf2}, 1));
                    }
                    textView5.setText(str6);
                }
                return c0412i;
            case 7:
                q qVar = (q) obj4;
                q5.l lVar2 = (q5.l) obj3;
                List list5 = (List) obj;
                boolean z6 = qVar.f3928D0;
                D4.a aVar3 = qVar.f3926B0;
                if ((z6 || aVar3.getItemCount() <= 0) && !lVar2.f23296a) {
                    i.b(list5);
                    if (list5.size() > 1) {
                        o.Q(list5, new h(6));
                    }
                    aVar3.o(list5);
                }
                return c0412i;
            default:
                q5.o oVar = (q5.o) obj4;
                PrivacyActivity privacyActivity = (PrivacyActivity) obj3;
                int i9 = PrivacyActivity.f18764P;
                i.e((C0372L) obj, "$this$addCallback");
                if (((WebView) oVar.f23299a).canGoBack()) {
                    ((WebView) oVar.f23299a).goBack();
                } else {
                    privacyActivity.finish();
                }
                return c0412i;
        }
    }
}
