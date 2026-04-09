package ej;

import a0.x0;
import ah.o;
import android.animation.ObjectAnimator;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.f1;
import androidx.recyclerview.widget.t0;
import androidx.recyclerview.widget.x1;
import com.github.mikephil.charting.charts.PieChart;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.consent_sdk.a0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.monitor.CustomMonitorActivity;
import com.liuzh.deviceinfo.monitor.CustomMonitorConfig;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import com.liuzh.deviceinfo.pro.ProActivity;
import ec.z;
import java.util.ArrayList;
import java.util.Locale;
import sh.b1;
import sh.c1;
import ui.c0;
import ui.d0;
import ui.e0;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends t0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23498i;
    public final /* synthetic */ Object j;

    public /* synthetic */ e(int i4, Object obj) {
        this.f23498i = i4;
        this.j = obj;
    }

    @Override // androidx.recyclerview.widget.t0
    public final int getItemCount() {
        switch (this.f23498i) {
            case 0:
                i iVar = (i) this.j;
                if (iVar.f23508d0 != null) {
                    return iVar.c0().f28363c.size();
                }
                return 0;
            case 1:
                return ((sh.d) this.j).f33667d0.size();
            case 2:
                return ((c1) this.j).f33658c0.size();
            case 3:
                ArrayList arrayList = ((d0) this.j).f35357c0;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.size();
            case 4:
                return ((CustomMonitorActivity) this.j).C.size();
            default:
                return ((ArrayList) ((se.b) this.j).f33558c).size();
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public int getItemViewType(int i4) {
        switch (this.f23498i) {
            case 0:
                return ((kj.h) ((i) this.j).c0().f28363c.get(i4)).f28371d;
            default:
                return super.getItemViewType(i4);
        }
    }

    @Override // androidx.recyclerview.widget.t0
    public final void onBindViewHolder(x1 x1Var, final int i4) throws Resources.NotFoundException {
        FrameLayout.LayoutParams layoutParams;
        ArrayList arrayList;
        float blockSizeLong;
        boolean z3 = true;
        switch (this.f23498i) {
            case 0:
                nk.k.e(x1Var, "holder");
                int i10 = 2;
                if (x1Var instanceof ij.c) {
                    kj.h hVar = (kj.h) ((i) this.j).c0().f28363c.get(i4);
                    ij.c cVar = (ij.c) x1Var;
                    cVar.f26007c.setText(hVar.f28368a);
                    cVar.f26009e.setText(hVar.f28370c);
                    cVar.f26008d.setText(hVar.f28369b.getSize());
                    x1Var.itemView.setOnClickListener(new ah.g(i10, (i) this.j, hVar));
                    return;
                }
                if (!(x1Var instanceof ij.d)) {
                    if (!(x1Var instanceof ij.a)) {
                        if (x1Var instanceof ij.b) {
                            p6.i iVar = (p6.i) jm.a.f27720a.f1137e;
                            FrameLayout frameLayout = ((ij.b) x1Var).f26005c;
                            iVar.getClass();
                            Object tag = frameLayout.getTag(R.id.vtag_type);
                            if (tag == null) {
                                p6.i.C(frameLayout);
                                return;
                            }
                            String string = tag.toString();
                            if ("fileCard".equals(string)) {
                                if (!iVar.B() || nh.a.l(frameLayout.getContext(), "com.liuzho.file.explorer")) {
                                    p6.i.C(frameLayout);
                                    return;
                                }
                                return;
                            }
                            if (!"proCard".equals(string)) {
                                p6.i.C(frameLayout);
                                return;
                            } else {
                                if (o.f400d.c()) {
                                    p6.i.C(frameLayout);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    if (((i) this.j).f23513i0 || !((p6.i) jm.a.f27720a.f1137e).B()) {
                        ij.a aVar = (ij.a) x1Var;
                        aVar.a(0);
                        aVar.f26004c.removeAllViews();
                        aVar.f26004c.setVisibility(8);
                        return;
                    }
                    ij.a aVar2 = (ij.a) x1Var;
                    n.a aVar3 = ((i) this.j).f23509e0;
                    View viewA = aVar3 != null ? aVar3.a() : null;
                    FrameLayout frameLayout2 = aVar2.f26004c;
                    int iN = cm.g.n(R.attr.analyzer_content_padding_half, frameLayout2.getContext());
                    if (frameLayout2.getChildCount() != 0) {
                        aVar2.a(iN);
                        if (frameLayout2.getVisibility() != 0) {
                            frameLayout2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (viewA == null) {
                        aVar2.a(0);
                        if (frameLayout2.getVisibility() != 8) {
                            frameLayout2.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    com.bumptech.glide.c.s(viewA);
                    aVar2.a(iN);
                    ViewGroup.LayoutParams layoutParams2 = viewA.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams = new FrameLayout.LayoutParams(layoutParams2);
                        layoutParams.gravity = 17;
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
                    }
                    frameLayout2.addView(viewA, layoutParams);
                    frameLayout2.setVisibility(0);
                    frameLayout2.post(new ig.l(z3 ? 1 : 0, frameLayout2));
                    return;
                }
                ij.d dVar = (ij.d) x1Var;
                kj.b bVar = ((i) this.j).c0().f28367h;
                if (bVar == null || dVar.f26013e) {
                    return;
                }
                dVar.f26013e = true;
                PieChart pieChart = dVar.f26011c;
                pieChart.f28997b = null;
                pieChart.f29018y = false;
                pieChart.f29019z = null;
                pieChart.f29007n.f35213b = null;
                pieChart.invalidate();
                ArrayList arrayList2 = new ArrayList();
                synchronized (bVar.f28347c) {
                    arrayList = new ArrayList(bVar.f28347c);
                }
                Resources resources = ((ContextWrapper) jm.a.f27720a.f1134b).getResources();
                String packageName = ((ContextWrapper) jm.a.f27720a.f1134b).getPackageName();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    Pair pair = (Pair) arrayList.get(i11);
                    if (((Float) pair.first).floatValue() >= f) {
                        arrayList2.add(new o9.i(((Float) pair.first).floatValue(), (String) pair.second));
                        TextView textView = (TextView) dVar.itemView.findViewById(resources.getIdentifier("label" + (i11 + 1), FacebookMediationAdapter.KEY_ID, packageName));
                        if (textView != null) {
                            textView.setText((CharSequence) pair.second);
                        }
                    }
                    i11++;
                    f = 0.0f;
                }
                ((z) jm.a.f27720a.f1138f).getClass();
                int[] iArr = kj.b.f28343e;
                o9.h hVar2 = new o9.h("", arrayList2);
                int length = iArr.length;
                int[] iArr2 = new int[length];
                int i12 = 0;
                while (i12 < length) {
                    iArr2[i12] = ((ContextWrapper) jm.a.f27720a.f1134b).getColor(iArr[i12]);
                    StringBuilder sb2 = new StringBuilder("color");
                    int i13 = i12 + 1;
                    sb2.append(i13);
                    ImageView imageView = (ImageView) dVar.itemView.findViewById(resources.getIdentifier(sb2.toString(), FacebookMediationAdapter.KEY_ID, packageName));
                    if (imageView != null) {
                        imageView.setColorFilter(iArr2[i12]);
                    }
                    i12 = i13;
                }
                int i14 = w9.a.f36538a;
                ArrayList arrayList3 = new ArrayList();
                for (int i15 = 0; i15 < length; i15++) {
                    arrayList3.add(Integer.valueOf(iArr2[i15]));
                }
                hVar2.f30441a = arrayList3;
                hVar2.f30446f = false;
                hVar2.f30468o = w9.g.c(1.0f);
                o9.g gVar = new o9.g();
                ArrayList arrayList4 = gVar.f30440i;
                arrayList4.clear();
                arrayList4.add(hVar2);
                gVar.b();
                ArrayList arrayList5 = gVar.f30440i;
                int size = arrayList5.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList5.get(i16);
                    i16++;
                    ((o9.c) ((s9.a) obj)).f30446f = false;
                }
                dVar.f26011c.setData(gVar);
                try {
                    long j = 0;
                    for (long j8 : bVar.f28346b) {
                        j += j8;
                    }
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    blockSizeLong = (j * 100.0f) / (statFs.getBlockSizeLong() * statFs.getBlockCountLong());
                } catch (Exception unused) {
                    blockSizeLong = 0.0f;
                }
                if (blockSizeLong >= 0.1d) {
                    dVar.f26011c.setCenterText(String.format(Locale.US, "%.1f%%", Float.valueOf(blockSizeLong)));
                    dVar.f26011c.setCenterTextSize(11.0f);
                } else {
                    dVar.f26011c.setCenterText(String.format(Locale.US, "%.2f%%", Float.valueOf(blockSizeLong)));
                    dVar.f26011c.setCenterTextSize(12.0f);
                }
                dVar.f26011c.getLegend().f29850a = false;
                dVar.f26011c.setDescription(null);
                dVar.f26011c.setDrawEntryLabels(false);
                dVar.f26011c.setTouchEnabled(false);
                l9.a aVar4 = dVar.f26011c.f29013t;
                aVar4.getClass();
                l9.b bVar2 = l9.c.f28626a;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(aVar4, "phaseX", 0.0f, 1.0f);
                objectAnimatorOfFloat.setInterpolator(bVar2);
                objectAnimatorOfFloat.setDuration(800);
                objectAnimatorOfFloat.addUpdateListener(aVar4.f28624a);
                objectAnimatorOfFloat.start();
                dVar.f26011c.setHoleRadius(55.0f);
                dVar.f26011c.setHoleColor(0);
                PieChart pieChart2 = dVar.f26011c;
                pieChart2.setCenterTextColor(cm.g.l(android.R.attr.textColorPrimary, pieChart2.getContext()));
                dVar.f26011c.setTransparentCircleAlpha(0);
                dVar.f26012d.setText(bVar.f28345a);
                return;
            case 1:
                sh.c cVar2 = (sh.c) x1Var;
                vg.a aVar5 = (vg.a) ((sh.d) this.j).f33667d0.get(i4);
                cVar2.f33650c.setText(aVar5.f36217a);
                cVar2.f33651d.setText(aVar5.f36218b);
                return;
            case 2:
                b1 b1Var = (b1) x1Var;
                vg.e eVar = (vg.e) ((c1) this.j).f33658c0.get(i4);
                ((TextView) b1Var.f33649c.f146c).setText(eVar.f36233a);
                x0 x0Var = b1Var.f33649c;
                ((TextView) x0Var.f147d).setText(eVar.f36234b);
                TextView textView2 = (TextView) x0Var.f145b;
                textView2.setVisibility(eVar.f36236d != null ? 0 : 8);
                textView2.setText(eVar.f36236d);
                textView2.setBackground(wb.e.M(textView2.getBackground(), b1Var.itemView.getContext().getColor("Max".equals(eVar.f36236d) ? R.color.thermal_max : "Min".equals(eVar.f36236d) ? R.color.thermal_min : R.color.thermal_avg)));
                return;
            case 3:
                c0 c0Var = (c0) x1Var;
                e0 e0Var = (e0) ((d0) this.j).f35357c0.get(i4);
                e eVar2 = c0Var.f35354d;
                a0 a0Var = c0Var.f35353c;
                TextView textView3 = (TextView) a0Var.g;
                TextView textView4 = (TextView) a0Var.j;
                LinearLayout linearLayout = (LinearLayout) a0Var.f19262k;
                TextView textView5 = (TextView) a0Var.f19261i;
                textView3.setText(e0Var.f35360a);
                if (e0Var.f35362c >= 0) {
                    d0 d0Var = (d0) eVar2.j;
                    Drawable drawableL = jm.a.l(e0Var.f35362c, d0Var.W());
                    if (drawableL != null) {
                        int iC = a4.a.c(d0Var.t(), 14.0f);
                        drawableL.setBounds(0, 0, iC, iC);
                    }
                    textView5.setCompoundDrawablePadding(a4.a.c(d0Var.t(), 4.0f));
                    textView5.setCompoundDrawables(drawableL, null, null, null);
                    textView5.setVisibility(0);
                } else {
                    textView5.setCompoundDrawables(null, null, null, null);
                    textView5.setVisibility(8);
                }
                textView5.setText(e0Var.f35363d);
                ((TextView) a0Var.f19259f).setText(e0Var.f35363d);
                ((TextView) a0Var.f19260h).setText(wi.c.e(e0Var.f35361b));
                if (TextUtils.isEmpty(e0Var.f35364e)) {
                    linearLayout.setVisibility(8);
                } else {
                    linearLayout.setVisibility(0);
                    SpannableString spannableString = new SpannableString(e0Var.f35364e);
                    spannableString.setSpan(new URLSpan(e0Var.f35364e), 0, spannableString.length(), 33);
                    textView4.setText(spannableString);
                    textView4.setMovementMethod(LinkMovementMethod.getInstance());
                }
                ((ImageView) a0Var.f19256c).setRotation(e0Var.f35365f ? 180.0f : 0.0f);
                ((LinearLayout) a0Var.f19257d).setVisibility(e0Var.f35365f ? 0 : 8);
                return;
            case 4:
                wg.k kVar = (wg.k) x1Var;
                nk.k.e(kVar, "holder");
                f1 f1Var = kVar.f36683c;
                TextView textView6 = (TextView) f1Var.f1137e;
                final CustomMonitorActivity customMonitorActivity = (CustomMonitorActivity) this.j;
                ArrayList arrayList6 = customMonitorActivity.C;
                textView6.setText(((CustomMonitorConfig) arrayList6.get(i4)).getName());
                ((ImageView) f1Var.f1135c).setOnClickListener(new View.OnClickListener() { // from class: wg.i
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CustomMonitorActivity customMonitorActivity2 = customMonitorActivity;
                        f1 f1Var2 = new f1(customMonitorActivity2, view);
                        o.m mVar = (o.m) f1Var2.f1135c;
                        mVar.add(0, 1, 0, R.string.action_edit);
                        mVar.add(0, 2, 1, R.string.action_delete);
                        f1Var2.f1138f = new ej.d(i4, customMonitorActivity2, this);
                        o.w wVar = (o.w) f1Var2.f1137e;
                        if (wVar.b()) {
                            return;
                        }
                        if (wVar.f30304e == null) {
                            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                        }
                        wVar.d(0, 0, false, false);
                    }
                });
                SwitchCompat switchCompat = (SwitchCompat) f1Var.f1138f;
                switchCompat.setChecked(((CustomMonitorConfig) arrayList6.get(i4)).isShowing() && MonitorManager.f21223f.d(((CustomMonitorConfig) arrayList6.get(i4)).getId()));
                switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: wg.j
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                        CustomMonitorActivity customMonitorActivity2 = customMonitorActivity;
                        ArrayList arrayList7 = customMonitorActivity2.C;
                        nk.k.e(compoundButton, "switcher");
                        int i17 = i4;
                        if (!z10) {
                            arrayList7.set(i17, CustomMonitorConfig.copy$default((CustomMonitorConfig) arrayList7.get(i17), null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, false, null, 196607, null));
                            com.liuzh.deviceinfo.utilities.f.f21256b.o(arrayList7);
                            MonitorManager.f21223f.f(((CustomMonitorConfig) arrayList7.get(i17)).getId());
                            return;
                        }
                        int i18 = CustomMonitorActivity.F;
                        if (!customMonitorActivity2.D()) {
                            compoundButton.setChecked(false);
                            return;
                        }
                        if (!ah.o.f400d.c()) {
                            compoundButton.setChecked(false);
                            ProActivity.D(compoundButton.getContext());
                        } else {
                            arrayList7.set(i17, CustomMonitorConfig.copy$default((CustomMonitorConfig) arrayList7.get(i17), null, null, false, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0, 0, 0L, 0L, false, false, true, null, 196607, null));
                            com.liuzh.deviceinfo.utilities.f.f21256b.o(arrayList7);
                            MonitorManager.f21223f.g((CustomMonitorConfig) arrayList7.get(i17));
                        }
                    }
                });
                ((TextView) f1Var.f1136d).setText(n.g0(((CustomMonitorConfig) arrayList6.get(i4)).getContent(), null, null, null, new sl.b(9), 31));
                return;
            default:
                wj.a aVar6 = (wj.a) x1Var;
                wj.b bVar3 = (wj.b) ((ArrayList) ((se.b) this.j).f33558c).get(i4);
                if (bVar3 == null) {
                    return;
                }
                aVar6.f36765c.setText(bVar3.f36769a);
                aVar6.f36766d.setText(bVar3.f36771c);
                aVar6.f36767e.setText(bVar3.f36770b);
                nk.k.b(ii.a.f26002b);
                ImageView imageView2 = aVar6.f36768f;
                ApplicationInfo applicationInfo = bVar3.f36772d;
                nk.k.e(imageView2, "iv");
                nk.k.e(applicationInfo, "appInfo");
                ((com.bumptech.glide.m) ((com.bumptech.glide.m) com.bumptech.glide.b.d(imageView2).l(new Uri.Builder().scheme("android.resource").authority(applicationInfo.packageName).path(String.valueOf(applicationInfo.icon)).build()).k(android.R.drawable.sym_def_app_icon)).f(android.R.drawable.sym_def_app_icon)).z(imageView2);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[PHI: r2
  0x007a: PHI (r2v33 int) = (r2v32 int), (r2v35 int) binds: [B:7:0x0047, B:9:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0116 A[PHI: r2
  0x0116: PHI (r2v21 int) = (r2v20 int), (r2v23 int), (r2v24 int), (r2v25 int) binds: [B:20:0x00a6, B:22:0x00b2, B:24:0x00be, B:26:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167 A[PHI: r3
  0x0167: PHI (r3v11 int) = (r3v10 int), (r3v12 int) binds: [B:43:0x0142, B:45:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.x1 onCreateViewHolder(android.view.ViewGroup r20, int r21) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ej.e.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.x1");
    }
}
