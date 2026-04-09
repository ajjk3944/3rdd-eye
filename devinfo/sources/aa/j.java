package aa;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import b4.o;
import b5.u0;
import b5.z;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.CpuCard;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.monitor.MonitorActivity;
import com.liuzh.deviceinfo.widget.WidgetsActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.i3;
import p.z2;
import sh.a0;
import sh.k0;
import sh.p0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f283b;

    public /* synthetic */ j(int i4, Object obj) {
        this.f282a = i4;
        this.f283b = obj;
    }

    public void a(LinearLayout linearLayout, String str, boolean z3) {
        View viewInflate = ((k0) this.f283b).q().inflate(R.layout.item_feature_supported, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        int i4 = R.id.icon;
        ImageView imageView = (ImageView) wb.e.s(R.id.icon, viewInflate);
        if (imageView != null) {
            i4 = R.id.text;
            TextView textView = (TextView) wb.e.s(R.id.text, viewInflate);
            if (textView != null) {
                textView.setText(str);
                imageView.setImageResource(z3 ? R.drawable.ic_correct : R.drawable.ic_wrong);
                imageView.setColorFilter(z3 ? linearLayout.getContext().getColor(R.color.colorPrimary) : -65536);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        Message message;
        Message message2;
        Message message3;
        boolean zIs5GHzBandSupported;
        int i4 = this.f282a;
        Message messageObtain = null;
        String strFlattenToShortString = null;
        messageObtain = null;
        Object obj = this.f283b;
        switch (i4) {
            case 0:
                ((l) obj).f290w.showPrivacyActivity();
                break;
            case 1:
                com.google.android.material.datepicker.l lVar = (com.google.android.material.datepicker.l) obj;
                int i10 = lVar.f20467d0;
                if (i10 != 2) {
                    if (i10 == 1) {
                        lVar.d0(2);
                        lVar.f20469f0.announceForAccessibility(lVar.u(R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    lVar.d0(1);
                    lVar.f20470g0.announceForAccessibility(lVar.u(R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            case 2:
                i.d dVar = (i.d) obj;
                if (view == dVar.j && (message3 = dVar.f25261l) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == dVar.f25262m && (message2 = dVar.f25264o) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == dVar.f25265p && (message = dVar.f25267r) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                dVar.F.obtainMessage(1, dVar.f25253b).sendToTarget();
                break;
            case 3:
                CpuCard cpuCard = (CpuCard) obj;
                ScrollView scrollView = new ScrollView(cpuCard.getContext());
                int iN = cm.g.n(R.attr.dialogPreferredPadding, cpuCard.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, a4.a.b(58.0f));
                marginLayoutParams.topMargin = iN;
                int i11 = iN / 2;
                marginLayoutParams.bottomMargin = i11;
                scrollView.addView(new ProgressBar(cpuCard.getContext()), marginLayoutParams);
                TextView textView = new TextView(cpuCard.getContext());
                textView.setTextSize(12.0f);
                textView.setTextColor(cm.g.l(android.R.attr.textColorSecondary, cpuCard.getContext()));
                textView.setPadding(iN, i11, iN, i11);
                t7.m mVar = new t7.m(cpuCard.getContext());
                ((i.b) mVar.f34474c).f25233d = "/proc/cpuinfo";
                mVar.z(scrollView);
                mVar.x(android.R.string.ok, null);
                i.e eVarA = mVar.A();
                eVarA.setCanceledOnTouchOutside(false);
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                dj.b.s(eVarA, com.liuzh.deviceinfo.utilities.f.d());
                bi.d.c(new o(this, scrollView, textView, 17));
                break;
            case 4:
                oc.f fVar2 = (oc.f) obj;
                if (fVar2.f30508k && fVar2.isShowing()) {
                    if (!fVar2.f30510m) {
                        TypedArray typedArrayObtainStyledAttributes = fVar2.getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                        fVar2.f30509l = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        fVar2.f30510m = true;
                    }
                    if (fVar2.f30509l) {
                        fVar2.cancel();
                        break;
                    }
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 24) {
                    try {
                        IBinder iBinder = (IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", String.class).invoke(null, "statusbar");
                        if (iBinder != null && iBinder.getInterfaceDescriptor() != null) {
                            Class<?> cls = Class.forName(iBinder.getInterfaceDescriptor());
                            Object objInvoke = cls.getClasses()[0].getMethod("asInterface", IBinder.class).invoke(null, iBinder);
                            Method method = cls.getMethod("toggleRecentApps", null);
                            method.setAccessible(true);
                            method.invoke(objInvoke, null);
                            break;
                        }
                    } catch (Throwable unused) {
                    }
                }
                WidgetsActivity widgetsActivity = (WidgetsActivity) obj;
                Toast.makeText(view.getContext(), widgetsActivity.getString(R.string.go_recents_lock_app, widgetsActivity.getString(R.string.app_name)), 1).show();
                break;
            case 6:
                ((n.a) obj).d();
                break;
            case 7:
                z2 z2Var = (z2) obj;
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = z2Var.f30931p;
                if (view != z2Var.f30935t) {
                    if (view != z2Var.f30937v) {
                        if (view != z2Var.f30936u) {
                            if (view != z2Var.f30938w) {
                                if (view == searchView$SearchAutoComplete) {
                                    z2Var.l();
                                    break;
                                }
                            } else {
                                SearchableInfo searchableInfo = z2Var.f30926e0;
                                if (searchableInfo != null) {
                                    try {
                                        if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                            if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                                z2Var.getContext().startActivity(z2Var.k(z2Var.I, searchableInfo));
                                                break;
                                            }
                                        } else {
                                            Intent intent = new Intent(z2Var.H);
                                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                                            if (searchActivity != null) {
                                                strFlattenToShortString = searchActivity.flattenToShortString();
                                            }
                                            intent.putExtra("calling_package", strFlattenToShortString);
                                            z2Var.getContext().startActivity(intent);
                                            break;
                                        }
                                    } catch (ActivityNotFoundException unused2) {
                                        Log.w("SearchView", "Could not find voice search activity");
                                        return;
                                    }
                                }
                            }
                        } else {
                            z2Var.q();
                            break;
                        }
                    } else {
                        z2Var.m();
                        break;
                    }
                } else {
                    z2Var.w(false);
                    searchView$SearchAutoComplete.requestFocus();
                    searchView$SearchAutoComplete.setImeVisibility(true);
                    View.OnClickListener onClickListener = z2Var.N;
                    if (onClickListener != null) {
                        onClickListener.onClick(z2Var);
                        break;
                    }
                }
                break;
            case 8:
                i3 i3Var = ((Toolbar) obj).M;
                o.o oVar = i3Var != null ? i3Var.f30717b : null;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            case 9:
                u0 u0VarO = ((sh.b) obj).o();
                nk.k.e(u0VarO, "fm");
                if (!u0VarO.K && !u0VarO.P()) {
                    z zVarD = u0VarO.D("DoubleBatteryDialog");
                    if (zVarD != null) {
                        b5.a aVar = new b5.a(u0VarO);
                        aVar.j(zVarD);
                        aVar.g();
                    }
                    new rg.a().i0(u0VarO, "DoubleBatteryDialog");
                    break;
                }
                break;
            case 10:
                ((sh.l) obj).i0();
                break;
            case 11:
                a0 a0Var = (a0) obj;
                a0Var.f33634q0.removeAllViews();
                a0Var.f33634q0.setVisibility(8);
                break;
            case 12:
                ScrollView scrollView2 = new ScrollView(view.getContext());
                LinearLayout linearLayout = new LinearLayout(view.getContext());
                scrollView2.addView(linearLayout, new ViewGroup.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                linearLayout.setPadding(a4.a.b(16.0f), a4.a.b(16.0f), a4.a.b(16.0f), a4.a.b(16.0f));
                String string = view.getContext().getString(R.string.wifi_direct);
                boolean zHasSystemFeature = DeviceInfoApp.f21145f.getPackageManager().hasSystemFeature("android.hardware.wifi.direct");
                WifiManager wifiManager = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
                if (wifiManager != null) {
                    try {
                        zHasSystemFeature = wifiManager.isP2pSupported() && zHasSystemFeature;
                    } catch (Exception unused3) {
                    }
                }
                a(linearLayout, string, zHasSystemFeature);
                a(linearLayout, view.getContext().getString(R.string.wifi_aware), wi.h.f36757b ? DeviceInfoApp.f21145f.getPackageManager().hasSystemFeature("android.hardware.wifi.aware") : false);
                String string2 = view.getContext().getString(R.string.wifi_5ghz);
                WifiManager wifiManager2 = (WifiManager) DeviceInfoApp.f21145f.getSystemService("wifi");
                if (wifiManager2 == null) {
                    zIs5GHzBandSupported = false;
                } else {
                    try {
                        zIs5GHzBandSupported = wifiManager2.is5GHzBandSupported();
                    } catch (Exception unused4) {
                    }
                }
                a(linearLayout, string2, zIs5GHzBandSupported);
                a(linearLayout, view.getContext().getString(R.string.wifi_6ghz), a4.a.s());
                a(linearLayout, view.getContext().getString(R.string.wifi_passpoint), wi.h.f36761f ? true : wi.h.f36758c ? DeviceInfoApp.f21145f.getPackageManager().hasSystemFeature("android.hardware.wifi.passpoint") : false);
                t7.m mVar2 = new t7.m(view.getContext());
                mVar2.y(R.string.wifi_feature_supported);
                mVar2.z(scrollView2);
                mVar2.x(android.R.string.ok, null);
                mVar2.A().setCanceledOnTouchOutside(false);
                break;
            case 13:
                p0 p0Var = (p0) obj;
                if (!p0Var.c0() && !TextUtils.isEmpty(p0Var.f33747b0)) {
                    if (!zg.c.d(p0Var.W())) {
                        if (!zg.c.i(p0Var)) {
                            rg.f.j0(R.string.storage_analyze_permission_summary, p0Var);
                            break;
                        } else {
                            p0Var.f33749d0.e();
                            zg.c.e();
                            break;
                        }
                    } else {
                        p0Var.b0(new Intent(p0Var.W(), (Class<?>) StorageCleanActivity.class));
                        break;
                    }
                }
                break;
            case 14:
                MonitorActivity monitorActivity = (MonitorActivity) obj;
                monitorActivity.startActivity(new Intent(monitorActivity, (Class<?>) CustomMonitorActivity.class));
                break;
            default:
                xa.i iVar = (xa.i) obj;
                iVar.f37063w = 2;
                iVar.f37044b.finish();
                break;
        }
    }
}
