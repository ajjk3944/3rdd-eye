package B4;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c5.C0409f;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.Arrays;
import q2.C2834o;

/* loaded from: classes.dex */
public final class j extends k3.f {

    /* renamed from: A0, reason: collision with root package name */
    public C2834o f721A0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // k0.AbstractComponentCallbacksC2617v
    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        ApplicationInfo applicationInfo;
        q5.i.e(layoutInflater, "inflater");
        final int i = 0;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_icp, viewGroup, false);
        int i3 = R.id.about_logo;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a4.p.e(R.id.about_logo, viewInflate);
        if (appCompatImageView != null) {
            i3 = R.id.about_record;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a4.p.e(R.id.about_record, viewInflate);
            if (appCompatTextView != null) {
                i3 = R.id.about_record_link;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a4.p.e(R.id.about_record_link, viewInflate);
                if (appCompatTextView2 != null) {
                    i3 = R.id.about_version;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) a4.p.e(R.id.about_version, viewInflate);
                    if (appCompatTextView3 != null) {
                        i3 = R.id.icp_close;
                        MaterialButton materialButton = (MaterialButton) a4.p.e(R.id.icp_close, viewInflate);
                        if (materialButton != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            this.f721A0 = new C2834o(linearLayout, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3, materialButton, 10);
                            q5.i.d(linearLayout, "getRoot(...)");
                            Context contextM = m();
                            if (contextM != null && (applicationInfo = contextM.getApplicationInfo()) != null) {
                                int i6 = applicationInfo.icon;
                                C2834o c2834o = this.f721A0;
                                q5.i.b(c2834o);
                                ((AppCompatImageView) c2834o.f23253c).setImageResource(i6);
                            }
                            C2834o c2834o2 = this.f721A0;
                            q5.i.b(c2834o2);
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) c2834o2.f23256f;
                            Context contextM2 = m();
                            String str2 = null;
                            if (contextM2 == null) {
                                str = null;
                            } else {
                                try {
                                    str = Build.VERSION.SDK_INT >= 33 ? contextM2.getPackageManager().getPackageInfo(contextM2.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).versionName : contextM2.getPackageManager().getPackageInfo(contextM2.getPackageName(), 0).versionName;
                                } catch (PackageManager.NameNotFoundException e6) {
                                    e6.printStackTrace();
                                    str = "";
                                }
                            }
                            final int i7 = 1;
                            appCompatTextView4.setText(String.format("V %s", Arrays.copyOf(new Object[]{str}, 1)));
                            C2834o c2834o3 = this.f721A0;
                            q5.i.b(c2834o3);
                            ((MaterialButton) c2834o3.f23257g).setOnClickListener(new View.OnClickListener(this) { // from class: B4.i

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ j f720b;

                                {
                                    this.f720b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object objD;
                                    switch (i) {
                                        case 0:
                                            this.f720b.X();
                                            break;
                                        default:
                                            j jVar = this.f720b;
                                            try {
                                                jVar.W(new Intent("android.intent.action.VIEW", Uri.parse("https://beian.miit.gov.cn/")));
                                                objD = C0412i.f5929a;
                                            } catch (Throwable th) {
                                                objD = R2.a.d(th);
                                            }
                                            if (C0409f.a(objD) != null) {
                                                F4.d.b(jVar.m(), jVar.r(R.string.web_view_not_found));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            C2834o c2834o4 = this.f721A0;
                            q5.i.b(c2834o4);
                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) c2834o4.f23254d;
                            String strR = r(R.string.icp_s);
                            q5.i.d(strR, "getString(...)");
                            Context contextM3 = m();
                            String packageName = contextM3 != null ? contextM3.getPackageName() : null;
                            if (packageName != null) {
                                switch (packageName.hashCode()) {
                                    case -2035594866:
                                        if (packageName.equals("com.lefan.area")) {
                                            str2 = "豫ICP备18035111号-4A";
                                            break;
                                        }
                                        break;
                                    case -1941833075:
                                        if (packageName.equals("com.lefan.colour")) {
                                            str2 = "豫ICP备18035111号-2A";
                                            break;
                                        }
                                        break;
                                    case -1513635072:
                                        if (packageName.equals("com.lefan.imagebatch")) {
                                            str2 = "豫ICP备18035111号-7A";
                                            break;
                                        }
                                        break;
                                    case -1489458327:
                                        if (packageName.equals("com.lefan.signal")) {
                                            str2 = "豫ICP备18035111号-5A";
                                            break;
                                        }
                                        break;
                                    case -430708154:
                                        if (packageName.equals("com.lefan.apkanaly")) {
                                            str2 = "豫ICP备18035111号-3A";
                                            break;
                                        }
                                        break;
                                    case 110106840:
                                        if (packageName.equals("com.lefan.current")) {
                                            str2 = "豫ICP备18035111号-6A";
                                            break;
                                        }
                                        break;
                                }
                            }
                            appCompatTextView5.setText(String.format(strR, Arrays.copyOf(new Object[]{str2}, 1)));
                            C2834o c2834o5 = this.f721A0;
                            q5.i.b(c2834o5);
                            ((AppCompatTextView) c2834o5.f23255e).setOnClickListener(new View.OnClickListener(this) { // from class: B4.i

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ j f720b;

                                {
                                    this.f720b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object objD;
                                    switch (i7) {
                                        case 0:
                                            this.f720b.X();
                                            break;
                                        default:
                                            j jVar = this.f720b;
                                            try {
                                                jVar.W(new Intent("android.intent.action.VIEW", Uri.parse("https://beian.miit.gov.cn/")));
                                                objD = C0412i.f5929a;
                                            } catch (Throwable th) {
                                                objD = R2.a.d(th);
                                            }
                                            if (C0409f.a(objD) != null) {
                                                F4.d.b(jVar.m(), jVar.r(R.string.web_view_not_found));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            return linearLayout;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void D() {
        super.D();
        this.f721A0 = null;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n, k0.AbstractComponentCallbacksC2617v
    public final void K() {
        BottomSheetBehavior bottomSheetBehaviorH;
        super.K();
        Dialog dialog = this.v0;
        k3.e eVar = dialog instanceof k3.e ? (k3.e) dialog : null;
        if (eVar == null || (bottomSheetBehaviorH = eVar.h()) == null) {
            return;
        }
        bottomSheetBehaviorH.I(3);
        bottomSheetBehaviorH.f18134X = true;
    }

    @Override // k0.DialogInterfaceOnCancelListenerC2610n
    public final int a0() {
        return R.style.bottomDialog;
    }
}
