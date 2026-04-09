package sh;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONObject;
import p.o1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class p0 extends a {
    public ViewGroup Z;

    /* renamed from: a0, reason: collision with root package name */
    public LinearLayout f33746a0;

    /* renamed from: b0, reason: collision with root package name */
    public String f33747b0;

    /* renamed from: c0, reason: collision with root package name */
    public zg.b f33748c0;

    /* renamed from: d0, reason: collision with root package name */
    public zg.b f33749d0;

    /* renamed from: e0, reason: collision with root package name */
    public View f33750e0;

    /* renamed from: f0, reason: collision with root package name */
    public p6.i f33751f0 = ii.a.q();

    /* renamed from: g0, reason: collision with root package name */
    public final Handler f33752g0 = new Handler(Looper.getMainLooper());

    /* renamed from: h0, reason: collision with root package name */
    public final o1 f33753h0 = new o1(5, this);

    public static LinearLayout.LayoutParams i0(int i4) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i4;
        return layoutParams;
    }

    @Override // b5.z
    public final void F(Bundle bundle) {
        super.F(bundle);
        final int i4 = 0;
        this.f33748c0 = zg.c.g(W(), this, new f.b(this) { // from class: sh.o0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f33743b;

            {
                this.f33743b = this;
            }

            @Override // f.b
            public final void k(Object obj) {
                int i10 = i4;
                p0 p0Var = this.f33743b;
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 0:
                        if (bool.booleanValue()) {
                            Context contextW = p0Var.W();
                            String str = p0Var.f33747b0;
                            int i11 = StorageAnalyzeActivity.C;
                            Intent intent = new Intent(contextW, (Class<?>) StorageAnalyzeActivity.class);
                            intent.putExtra("analyze_path", str);
                            contextW.startActivity(intent);
                            break;
                        }
                        break;
                    default:
                        if (bool.booleanValue()) {
                            p0Var.b0(new Intent(p0Var.W(), (Class<?>) StorageCleanActivity.class));
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f33749d0 = zg.c.g(W(), this, new f.b(this) { // from class: sh.o0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f33743b;

            {
                this.f33743b = this;
            }

            @Override // f.b
            public final void k(Object obj) {
                int i102 = i10;
                p0 p0Var = this.f33743b;
                Boolean bool = (Boolean) obj;
                switch (i102) {
                    case 0:
                        if (bool.booleanValue()) {
                            Context contextW = p0Var.W();
                            String str = p0Var.f33747b0;
                            int i11 = StorageAnalyzeActivity.C;
                            Intent intent = new Intent(contextW, (Class<?>) StorageAnalyzeActivity.class);
                            intent.putExtra("analyze_path", str);
                            contextW.startActivity(intent);
                            break;
                        }
                        break;
                    default:
                        if (bool.booleanValue()) {
                            p0Var.b0(new Intent(p0Var.W(), (Class<?>) StorageCleanActivity.class));
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // b5.z
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) throws NoSuchFieldException, SecurityException {
        if (this.Z == null) {
            this.Z = (ViewGroup) layoutInflater.inflate(R.layout.tab_storage, viewGroup, false);
            com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
            int iD = com.liuzh.deviceinfo.utilities.f.d();
            dj.b.m((ScrollView) this.Z, iD);
            this.f33746a0 = (LinearLayout) this.Z.findViewById(R.id.content);
            bi.d.c(new com.applovin.mediation.nativeAds.adPlacer.a(this, layoutInflater, iD, 11));
        }
        return this.Z;
    }

    @Override // b5.z
    public final void L() {
        this.F = true;
        this.f33752g0.removeCallbacks(this.f33753h0);
    }

    @Override // b5.z
    public final void N() {
        this.F = true;
        Handler handler = this.f33752g0;
        o1 o1Var = this.f33753h0;
        handler.removeCallbacks(o1Var);
        handler.postDelayed(o1Var, 1200L);
    }

    @Override // b5.z
    public final void R(View view, Bundle bundle) {
        ph.d dVar = new ph.d(5, view);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        e4.m0.j(view, dVar);
    }

    public final void h0(View view, String str, vg.c cVar, boolean z3) {
        String str2;
        int i4;
        boolean z10;
        String str3;
        if (this.f33751f0 == null) {
            this.f33751f0 = ii.a.q();
        }
        double d10 = cVar.f36224d;
        double d11 = cVar.f36222b;
        ((TextView) view.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) view.findViewById(R.id.path);
        if (z3) {
            p6.i iVar = this.f33751f0;
            String strOptString = iVar != null ? ((JSONObject) iVar.f31385a).optString("CHANNELS") : null;
            if (TextUtils.isEmpty(strOptString)) {
                p6.i iVar2 = this.f33751f0;
                String strOptString2 = iVar2 != null ? ((JSONObject) iVar2.f31385a).optString("MEMORY") : null;
                if (TextUtils.isEmpty(strOptString2)) {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = "%.1f";
                    i4 = 0;
                    sb2.append(String.format(Locale.getDefault(), str2, Double.valueOf(cVar.f36223c)));
                    sb2.append(DeviceInfoApp.f21145f.getString(R.string.mb_free));
                    textView.setText(sb2.toString());
                    z10 = false;
                } else {
                    textView.setText(strOptString2);
                }
            } else {
                textView.setText(strOptString);
            }
            z10 = true;
            str2 = "%.1f";
            i4 = 0;
        } else {
            str2 = "%.1f";
            i4 = 0;
            textView.setText(cVar.f36226f);
            z10 = true;
        }
        int i10 = (int) ((d10 / d11) * 100.0d);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        dj.b.i(progressBar, com.liuzh.deviceinfo.utilities.f.a());
        progressBar.setProgress(i10);
        TextView textView2 = (TextView) view.findViewById(R.id.percent);
        n3.d dVar = (n3.d) textView2.getLayoutParams();
        dVar.f29594i = progressBar.getId();
        dVar.f29599l = progressBar.getId();
        textView2.setText(i10 + "%");
        String str4 = z3 ? " MB" : " GB";
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[1];
        objArr[i4] = Double.valueOf(d10);
        String strConcat = String.format(locale, str2, objArr).concat(str4);
        Locale locale2 = Locale.getDefault();
        Object[] objArr2 = new Object[1];
        objArr2[i4] = Double.valueOf(d11);
        String strConcat2 = String.format(locale2, str2, objArr2).concat(str4);
        Locale locale3 = Locale.getDefault();
        Object[] objArr3 = new Object[1];
        objArr3[i4] = Double.valueOf(cVar.f36223c);
        String strConcat3 = String.format(locale3, str2, objArr3).concat(str4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strConcat);
        sb3.append(" / ");
        sb3.append(strConcat2);
        if (z10) {
            str3 = ", " + DeviceInfoApp.f21145f.getString(R.string.free) + ": " + strConcat3;
        } else {
            str3 = "";
        }
        sb3.append(str3);
        ((TextView) view.findViewById(R.id.summary)).setText(sb3.toString());
        if (z3) {
            TextView textView3 = (TextView) view.findViewById(R.id.short_info);
            p6.i iVar3 = this.f33751f0;
            if (iVar3 != null) {
                String strOptString3 = ((JSONObject) iVar3.f31385a).optString("MEMORY");
                String strOptString4 = ((JSONObject) this.f33751f0.f31385a).optString("CHANNELS");
                if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                    textView3.setVisibility(i4);
                    textView3.setText(strOptString3);
                }
            }
        } else {
            String strX = com.liuzh.deviceinfo.utilities.l.x(cVar.f36226f);
            if (TextUtils.isEmpty(strX) && TextUtils.equals(cVar.f36226f, Environment.getRootDirectory().getAbsolutePath())) {
                strX = com.liuzh.deviceinfo.utilities.l.x("/");
            }
            if (!TextUtils.isEmpty(strX)) {
                TextView textView4 = (TextView) view.findViewById(R.id.short_info);
                textView4.setText(strX);
                textView4.setVisibility(0);
            }
        }
        MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.btn_analyze);
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.btn_clean);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.btn_analyze_topend);
        int iD = com.liuzh.deviceinfo.utilities.f.d();
        if (t6.i0.n(view.getContext())) {
            iD = com.liuzh.deviceinfo.utilities.f.e();
        }
        ColorStateList colorStateListC = dj.b.c(iD);
        dj.b.h(materialButton, iD);
        materialButton.setIconTint(colorStateListC);
        dj.b.h(materialButton2, iD);
        materialButton2.setIconTint(colorStateListC);
        dj.b.h(materialButton3, iD);
        materialButton3.setIconTint(colorStateListC);
        if (com.liuzh.deviceinfo.utilities.d.k()) {
            com.liuzh.deviceinfo.utilities.y.k(materialButton);
            com.liuzh.deviceinfo.utilities.y.k(materialButton2);
            com.liuzh.deviceinfo.utilities.y.k(materialButton3);
        }
    }
}
