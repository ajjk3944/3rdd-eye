package B4;

import Y4.C0227g;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.Q;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.C0758Ue;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lefan.base.activity.SuggestActivity;
import com.lefan.signal.MyApplication;
import com.lefan.signal.ad.FreeAdActivity;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.ui.other.OtherFragment;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.SquatterDetailActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import d5.AbstractC2282j;
import h.AbstractActivityC2349g;
import h0.C2351a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.K;
import t4.C2931b;
import z5.AbstractC3046w;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f752c;

    public /* synthetic */ r(PopupWindow popupWindow, Context context, String str) {
        this.f750a = 0;
        this.f751b = context;
        this.f752c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        K kS;
        boolean zMatches;
        boolean zMatches2;
        String string;
        boolean zMatches3;
        String string2;
        String str;
        Object objD;
        int i = this.f750a;
        Integer numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        boolean zMatches4 = false;
        int i3 = 0;
        Object obj = this.f752c;
        Object obj2 = this.f751b;
        switch (i) {
            case 0:
                Context context = (Context) obj2;
                com.bumptech.glide.c.M(context, (String) obj, context.getString(R.string.share_copy_title));
                return;
            case 1:
                q5.o oVar = (q5.o) obj2;
                y yVar = (y) obj;
                if (oVar.f23299a == null) {
                    Toast.makeText(F4.d.f1456a, yVar.r(R.string.apk_loading), 1).show();
                    return;
                }
                yVar.Z(false, false);
                Context contextM = yVar.m();
                Object obj3 = oVar.f23299a;
                q5.i.b(obj3);
                Object obj4 = oVar.f23299a;
                q5.i.b(obj4);
                I5.b.x(contextM, (File) obj3, ((File) obj4).getName(), "application/vnd.android.package-archive", yVar.r(R.string.share_apk_failed));
                return;
            case 2:
                FreeAdActivity freeAdActivity = (FreeAdActivity) obj;
                int i6 = FreeAdActivity.f18830R;
                int i7 = ((q5.m) obj2).f23297a;
                if (i7 != 1) {
                    if (i7 != 2) {
                        return;
                    }
                    freeAdActivity.D().a();
                    return;
                }
                C2931b c2931bD = freeAdActivity.D();
                c2931bD.getClass();
                if (c2931bD.f23674c == null || System.currentTimeMillis() - c2931bD.f23675d >= 10800000) {
                    c2931bD.a();
                    return;
                }
                C0758Ue c0758Ue = c2931bD.f23674c;
                if (c0758Ue != null) {
                    c0758Ue.f11702c.f12908a = new com.google.ads.mediation.d(c2931bD);
                    c0758Ue.b(freeAdActivity, new F4.c(26, c2931bD));
                    return;
                }
                return;
            case 3:
                J3.k kVar = (J3.k) obj2;
                kVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                kVar.a(1);
                return;
            case 4:
                N4.c cVar = (N4.c) obj2;
                Context contextM2 = cVar.m();
                String string3 = ((TextView) obj).getText().toString();
                String strR = cVar.r(R.string.altitude);
                if (contextM2 == null || string3 == null || string3.length() == 0) {
                    return;
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", string3);
                Intent intentCreateChooser = Intent.createChooser(intent, strR);
                if (intentCreateChooser.resolveActivity(contextM2.getPackageManager()) != null) {
                    contextM2.startActivity(intentCreateChooser);
                    return;
                } else {
                    F4.d.b(contextM2, contextM2.getString(R.string.none_share_app));
                    return;
                }
            case 5:
                N4.m mVar = (N4.m) obj2;
                String str2 = (String) obj;
                Context contextM3 = mVar.m();
                WifiManager wifiManager = mVar.f3022J0;
                if (str2 != null && str2.length() != 0 && wifiManager != null && contextM3 != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        List networkSuggestions = wifiManager.getNetworkSuggestions();
                        q5.i.d(networkSuggestions, "getNetworkSuggestions(...)");
                        Iterator it = networkSuggestions.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                WifiNetworkSuggestion wifiNetworkSuggestionF = Z4.a.f(it.next());
                                String ssid = wifiNetworkSuggestionF.getSsid();
                                if (ssid != null) {
                                    if (ssid.equals("\"" + str2 + "\"")) {
                                        numValueOf = Integer.valueOf(wifiNetworkSuggestionF.getPriority());
                                    }
                                }
                            }
                        }
                    } else if (G.c.a(contextM3, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                        q5.i.b(configuredNetworks);
                        Iterator<T> it2 = configuredNetworks.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                WifiConfiguration wifiConfiguration = (WifiConfiguration) it2.next();
                                String str3 = wifiConfiguration.SSID;
                                if (str3 != null && str3.equals(str2)) {
                                    numValueOf = Integer.valueOf(wifiConfiguration.networkId);
                                }
                            }
                        }
                    }
                }
                if (numValueOf == null) {
                    Intent intentX = com.bumptech.glide.d.x(mVar.m(), "android.settings.WIFI_SETTINGS");
                    if (intentX != null) {
                        MyApplication.f18812d = true;
                        mVar.W(intentX);
                        return;
                    }
                    return;
                }
                WifiManager wifiManager2 = mVar.f3022J0;
                int iIntValue = numValueOf.intValue();
                if (wifiManager2 != null) {
                    WifiInfo connectionInfo = wifiManager2.getConnectionInfo();
                    if (connectionInfo.getNetworkId() != iIntValue && Build.VERSION.SDK_INT < 29) {
                        wifiManager2.disableNetwork(connectionInfo.getNetworkId());
                        wifiManager2.disconnect();
                        wifiManager2.enableNetwork(iIntValue, true);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                O4.l lVar = (O4.l) obj;
                if (((TextInputLayout) obj2).f18547k.f2922q) {
                    return;
                }
                String url = lVar.f3099J0.getUrl();
                if (url != null && !url.startsWith("http")) {
                    WebSpeedBean webSpeedBean = lVar.f3099J0;
                    webSpeedBean.setUrl("https://" + webSpeedBean.getUrl());
                    TextInputEditText textInputEditText = lVar.f3095F0;
                    if (textInputEditText != null) {
                        textInputEditText.setText(lVar.f3099J0.getUrl());
                    }
                }
                lVar.i0();
                return;
            case 7:
                Q4.c cVar2 = (Q4.c) obj2;
                cVar2.f3195C0 = ((SwitchCompat) obj).isChecked();
                Context contextM4 = cVar2.m();
                if (contextM4 != null) {
                    boolean z6 = cVar2.f3195C0;
                    SharedPreferences sharedPreferences = contextM4.getSharedPreferences("sp", 0);
                    q5.i.b(sharedPreferences);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putBoolean("bluetooth_list_dialog_refresh", z6);
                    editorEdit.apply();
                    return;
                }
                return;
            case 8:
                OtherFragment otherFragment = (OtherFragment) obj2;
                TextView textView = (TextView) obj;
                T4.l lVar2 = otherFragment.f19099n0;
                if (lVar2 == null) {
                    q5.i.g("viewModel");
                    throw null;
                }
                if (lVar2.f3632n.d() == null) {
                    return;
                }
                K kL = otherFragment.l();
                String string4 = textView.getText().toString();
                String strR2 = otherFragment.r(R.string.coordinate);
                if (kL == null) {
                    return;
                }
                A a6 = new A();
                a6.f687A0 = string4;
                a6.f688B0 = strR2;
                a6.e0(kL, "share_copy_dialog");
                return;
            case 9:
                OtherFragment otherFragment2 = (OtherFragment) obj2;
                q5.l lVar3 = (q5.l) obj;
                AbstractActivityC2349g abstractActivityC2349gK = otherFragment2.k();
                if (abstractActivityC2349gK == null || (kS = abstractActivityC2349gK.s()) == null) {
                    return;
                }
                N4.c cVar3 = new N4.c();
                T4.l lVar4 = otherFragment2.f19099n0;
                if (lVar4 == null) {
                    q5.i.g("viewModel");
                    throw null;
                }
                cVar3.f2989B0 = lVar4;
                cVar3.f2991D0 = new C2351a(lVar3, 12, otherFragment2);
                cVar3.f0(kS, "altitudeDialog");
                return;
            case 10:
                V4.q qVar = (V4.q) obj2;
                qVar.f3928D0 = ((SwitchCompat) obj).isChecked();
                Context contextM5 = qVar.m();
                if (contextM5 != null) {
                    boolean z7 = qVar.f3928D0;
                    SharedPreferences sharedPreferences2 = contextM5.getSharedPreferences("sp", 0);
                    q5.i.b(sharedPreferences2);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putBoolean("satellite_list_dialog_refresh", z7);
                    editorEdit2.apply();
                    return;
                }
                return;
            case 11:
                SensorDetailActivity sensorDetailActivity = (SensorDetailActivity) obj2;
                MaterialButton materialButton = (MaterialButton) obj;
                if (sensorDetailActivity.f19269g0) {
                    materialButton.setIcon(sensorDetailActivity.getDrawable(R.drawable.ic_start));
                } else {
                    materialButton.setIcon(sensorDetailActivity.getDrawable(R.drawable.ic_stop));
                }
                sensorDetailActivity.f19269g0 = !sensorDetailActivity.f19269g0;
                return;
            case 12:
                PingActivity pingActivity = (PingActivity) obj;
                int i8 = PingActivity.b0;
                Editable text = ((AppCompatAutoCompleteTextView) obj2).getText();
                String string5 = (text == null || (string = text.toString()) == null) ? null : y5.l.j0(string).toString();
                if (string5 == null || string5.length() == 0) {
                    F4.d.b(pingActivity, pingActivity.getString(R.string.tools_traceroute_domain_or_ip_invalid));
                    return;
                }
                Pattern pattern = Z4.c.f4538a;
                if (string5.length() == 0) {
                    zMatches = false;
                } else {
                    Matcher matcher = Z4.c.f4538a.matcher(string5);
                    q5.i.d(matcher, "matcher(...)");
                    zMatches = matcher.matches();
                }
                if (!zMatches) {
                    if (string5.length() == 0) {
                        zMatches2 = false;
                    } else {
                        Matcher matcher2 = Z4.c.f4540c.matcher(string5);
                        q5.i.d(matcher2, "matcher(...)");
                        zMatches2 = matcher2.matches();
                    }
                    if (!zMatches2) {
                        F4.d.b(pingActivity, pingActivity.getString(R.string.tools_traceroute_domain_or_ip_invalid));
                        return;
                    }
                }
                if (pingActivity.f19357Z) {
                    Process process = pingActivity.f19358a0;
                    if (process != null) {
                        process.destroy();
                    }
                    pingActivity.f19357Z = false;
                    MaterialButton materialButton2 = pingActivity.f19348Q;
                    if (materialButton2 == null) {
                        q5.i.g("startBtn");
                        throw null;
                    }
                    materialButton2.setIcon(null);
                    MaterialButton materialButton3 = pingActivity.f19348Q;
                    if (materialButton3 == null) {
                        q5.i.g("startBtn");
                        throw null;
                    }
                    materialButton3.setText(pingActivity.getString(R.string.base_start));
                } else {
                    AbstractC3046w.l(Q.f(pingActivity), null, new C0227g(pingActivity, string5, null), 3);
                }
                pingActivity.f19357Z = !pingActivity.f19357Z;
                return;
            case 13:
                SquatterDetailActivity squatterDetailActivity = (SquatterDetailActivity) obj2;
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                SquatterBean squatterBean = squatterDetailActivity.f19377Q;
                q5.i.b(squatterBean);
                String mac = squatterBean.getMac();
                if (mac == null || mac.length() == 0) {
                    SquatterBean squatterBean2 = squatterDetailActivity.f19377Q;
                    q5.i.b(squatterBean2);
                    if (!squatterBean2.isMy()) {
                        SquatterBean squatterBean3 = squatterDetailActivity.f19377Q;
                        String brand = squatterBean3 != null ? squatterBean3.getBrand() : null;
                        if (brand == null || brand.length() == 0) {
                            return;
                        }
                        K kS2 = squatterDetailActivity.s();
                        SquatterBean squatterBean4 = squatterDetailActivity.f19377Q;
                        String brand2 = squatterBean4 != null ? squatterBean4.getBrand() : null;
                        String string6 = squatterDetailActivity.getString(R.string.phone_name);
                        if (kS2 == null) {
                            return;
                        }
                        A a7 = new A();
                        a7.f687A0 = brand2;
                        a7.f688B0 = string6;
                        a7.e0(kS2, "share_copy_dialog");
                        return;
                    }
                }
                m mVar2 = new m(squatterDetailActivity);
                mVar2.f725b = squatterDetailActivity.getString(R.string.modity_device_name);
                mVar2.f726c = squatterDetailActivity.getString(R.string.phone_name);
                mVar2.f733k = appCompatTextView.getText().toString();
                mVar2.f724a = new V2.h(appCompatTextView, 14, squatterDetailActivity);
                mVar2.show();
                return;
            case 14:
                SquatterDetailActivity squatterDetailActivity2 = (SquatterDetailActivity) obj2;
                int i9 = SquatterDetailActivity.f19374R;
                N4.f fVar = new N4.f();
                SquatterBean squatterBean5 = squatterDetailActivity2.f19377Q;
                q5.i.b(squatterBean5);
                fVar.f2998B0 = squatterBean5.getType();
                fVar.f3001E0 = new C2351a(squatterDetailActivity2, 17, (AppCompatImageView) obj);
                fVar.e0(squatterDetailActivity2.s(), "device_type_dialog");
                return;
            case 15:
                TraceRouteActivity traceRouteActivity = (TraceRouteActivity) obj;
                int i10 = TraceRouteActivity.f19379c0;
                Editable text2 = ((AppCompatAutoCompleteTextView) obj2).getText();
                String string7 = (text2 == null || (string2 = text2.toString()) == null) ? null : y5.l.j0(string2).toString();
                if (string7 == null || string7.length() == 0) {
                    F4.d.b(traceRouteActivity, traceRouteActivity.getString(R.string.tools_traceroute_domain_or_ip_invalid));
                    return;
                }
                Pattern pattern2 = Z4.c.f4538a;
                if (string7.length() == 0) {
                    zMatches3 = false;
                } else {
                    Matcher matcher3 = Z4.c.f4538a.matcher(string7);
                    q5.i.d(matcher3, "matcher(...)");
                    zMatches3 = matcher3.matches();
                }
                if (!zMatches3) {
                    if (string7.length() != 0) {
                        Matcher matcher4 = Z4.c.f4540c.matcher(string7);
                        q5.i.d(matcher4, "matcher(...)");
                        zMatches4 = matcher4.matches();
                    }
                    if (!zMatches4) {
                        F4.d.b(traceRouteActivity, traceRouteActivity.getString(R.string.tools_traceroute_domain_or_ip_invalid));
                        return;
                    }
                }
                if (traceRouteActivity.f19392a0) {
                    com.lefan.signal.tracroute.g gVar = traceRouteActivity.f19384S;
                    gVar.f18875e = true;
                    Process process2 = gVar.f18876f;
                    if (process2 != null) {
                        process2.destroy();
                    }
                } else {
                    AbstractC3046w.l(Q.f(traceRouteActivity), null, new Y4.r(traceRouteActivity, string7, null), 3);
                }
                traceRouteActivity.f19392a0 = !traceRouteActivity.f19392a0;
                return;
            case 16:
                String strO = (String) obj;
                TraceRouteActivity traceRouteActivity2 = (TraceRouteActivity) obj2;
                ArrayList arrayList = traceRouteActivity2.b0;
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj5 = arrayList.get(i3);
                    i3++;
                    com.lefan.signal.tracroute.f fVar2 = (com.lefan.signal.tracroute.f) obj5;
                    int i11 = fVar2.f18867b;
                    String str4 = fVar2.f18868c;
                    String str5 = fVar2.f18869d;
                    String string8 = traceRouteActivity2.getString(fVar2.f18870e ? R.string.tools_traceroute_inner_net : R.string.tools_traceroute_out_net);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) strO);
                    sb.append("\n");
                    sb.append(i11);
                    sb.append("\u3000\u3000\u3000");
                    sb.append(str4);
                    strO = AbstractC1135f5.o(sb, "\u3000\u3000\u3000", str5, "     ", string8);
                }
                K kS3 = traceRouteActivity2.s();
                String string9 = traceRouteActivity2.getString(R.string.tracert);
                if (kS3 == null) {
                    return;
                }
                A a8 = new A();
                a8.f687A0 = strO;
                a8.f688B0 = string9;
                a8.e0(kS3, "share_copy_dialog");
                return;
            case 17:
                BaseViewHolder baseViewHolder = (BaseViewHolder) obj2;
                J4.c cVar4 = (J4.c) obj;
                q5.i.e(baseViewHolder, "$viewHolder");
                q5.i.e(cVar4, "this$0");
                int bindingAdapterPosition = baseViewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition == -1) {
                    return;
                }
                cVar4.q(baseViewHolder.getItemViewType());
                if (AbstractC2282j.V(bindingAdapterPosition, cVar4.f4668b) == null) {
                    return;
                }
                q5.i.d(view, "it");
                cVar4.f4668b.get(bindingAdapterPosition);
                return;
            default:
                SuggestActivity suggestActivity = (SuggestActivity) obj2;
                int i12 = SuggestActivity.f18766W;
                StringBuffer stringBuffer = new StringBuffer();
                String string10 = suggestActivity.getString(R.string.suggest_question);
                HashMap map = suggestActivity.f18768P;
                stringBuffer.append(string10);
                stringBuffer.append("：\n");
                stringBuffer.append((CharSequence) ((TextInputEditText) obj).getText());
                stringBuffer.append("\n\n");
                stringBuffer.append(suggestActivity.getString(R.string.base_version));
                stringBuffer.append("：");
                try {
                    str = Build.VERSION.SDK_INT >= 33 ? suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName : suggestActivity.getPackageManager().getPackageInfo(suggestActivity.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e6) {
                    e6.printStackTrace();
                    str = "";
                }
                stringBuffer.append(str);
                String string11 = stringBuffer.toString();
                q5.i.d(string11, "toString(...)");
                try {
                    if (map.isEmpty()) {
                        Intent intent2 = new Intent("android.intent.action.SENDTO");
                        intent2.setData(Uri.parse("mailto:lefan2023@126.com"));
                        intent2.putExtra("android.intent.extra.TEXT", string11);
                        intent2.putExtra("android.intent.extra.SUBJECT", suggestActivity.getString(suggestActivity.getApplicationInfo().labelRes));
                        suggestActivity.startActivity(intent2);
                    } else {
                        Intent intent3 = new Intent("android.intent.action.SEND_MULTIPLE");
                        intent3.putExtra("android.intent.extra.EMAIL", new String[]{"lefan2023@126.com"});
                        intent3.putExtra("android.intent.extra.SUBJECT", suggestActivity.getString(suggestActivity.getApplicationInfo().labelRes));
                        intent3.putExtra("android.intent.extra.TEXT", string11);
                        intent3.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(map.values()));
                        intent3.setType("image/*");
                        intent3.setType("message/rfc882");
                        suggestActivity.startActivity(Intent.createChooser(intent3, suggestActivity.getString(R.string.choice_email)));
                    }
                    objD = C0412i.f5929a;
                } catch (Throwable th) {
                    objD = R2.a.d(th);
                }
                if (C0409f.a(objD) != null) {
                    F4.d.b(suggestActivity, suggestActivity.getString(R.string.send_email_error));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ r(Object obj, int i, Object obj2) {
        this.f750a = i;
        this.f751b = obj;
        this.f752c = obj2;
    }

    public /* synthetic */ r(String str, TraceRouteActivity traceRouteActivity) {
        this.f750a = 16;
        this.f752c = str;
        this.f751b = traceRouteActivity;
    }
}
