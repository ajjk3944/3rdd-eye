package ah;

import al.p;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.y0;
import bh.w;
import com.airbnb.lottie.LottieAnimationView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.internal.ads.e80;
import com.google.android.gms.internal.measurement.j4;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.card.GpuCard;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import com.liuzh.deviceinfo.view.kv.KvCard;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import hh.v;
import hh.y;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import je.u;
import sh.f0;
import sh.k0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f386c;

    public /* synthetic */ g(int i4, Object obj, Object obj2) {
        this.f384a = i4;
        this.f385b = obj;
        this.f386c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [o9.b, q9.b, q9.b[]] */
    /* JADX WARN: Type inference failed for: r10v45 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        String string;
        int bindingAdapterPosition;
        float f10;
        int i4;
        String string2;
        String string3;
        int size;
        int size2;
        Drawable drawableLoadIcon;
        String string4;
        Drawable drawable;
        ?? r10;
        wj.j jVar;
        int i10 = this.f384a;
        boolean z3 = true;
        Object obj = this.f386c;
        Object obj2 = this.f385b;
        switch (i10) {
            case 0:
                i.e eVar = (i.e) obj;
                ProActivity.D((Context) obj2);
                DeviceInfoApp deviceInfoApp = fi.a.f24058a;
                try {
                    eVar.dismiss();
                } catch (Throwable unused) {
                }
                cg.a.f2848b.f(null, "proInsertClick");
                return;
            case 1:
                AccountProActivity accountProActivity = (AccountProActivity) obj2;
                fh.a aVar = (fh.a) obj;
                int i11 = AccountProActivity.H;
                bh.c cVar = bh.c.f2188a;
                ck.c cVar2 = null;
                if (!bh.c.c()) {
                    f.h hVar = accountProActivity.B;
                    if (hVar != null) {
                        hVar.a(Boolean.TRUE);
                        return;
                    } else {
                        nk.k.k("loginLauncher");
                        throw null;
                    }
                }
                w wVarE = accountProActivity.E();
                String strA = bh.c.a();
                nk.k.b(strA);
                String str = aVar.f24041e;
                nk.k.b(str);
                wVarE.getClass();
                x.v(y0.g(wVarE), null, null, new bh.o(strA, str, wVarE, cVar2, 0), 3);
                return;
            case 2:
                ej.m mVarE0 = ((ej.i) obj2).e0();
                mVarE0.getClass();
                mVarE0.f23527l.j(Integer.valueOf(((kj.h) obj).f28371d));
                return;
            case 3:
                int i12 = BindEmailActivity.E;
                hh.i iVarD = ((BindEmailActivity) obj2).D();
                x.v(y0.g(iVarD), null, null, new p((String) obj, iVarD, null, 19), 3);
                return;
            case 4:
                v vVar = (v) obj2;
                ed.n nVar = (ed.n) obj;
                ed.n nVar2 = vVar.Z;
                if (nVar2 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) nVar2.f23342a;
                nk.k.d(frameLayout, "getRoot(...)");
                com.liuzh.deviceinfo.utilities.m.a(frameLayout);
                y yVarI0 = vVar.i0();
                String strH0 = vVar.h0();
                ed.n nVar3 = vVar.Z;
                if (nVar3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                Editable text = ((TextInputEditText) nVar3.f23348h).getText();
                String string5 = (text == null || (string = text.toString()) == null) ? null : vk.i.V0(string).toString();
                int i13 = vVar.f25132a0;
                boolean zIsChecked = ((CheckBox) nVar.f23345d).isChecked();
                wi.e eVar2 = yVarI0.f25142b;
                if (strH0 != null && !vk.i.H0(strH0)) {
                    if (strH0.length() == 0 ? false : Pattern.compile("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,8})$").matcher(strH0).matches()) {
                        if (string5 == null || vk.i.H0(string5)) {
                            eVar2.h(hg.e.e(R.string.please_input_vcode));
                            return;
                        }
                        if (i13 == 1 && !zIsChecked) {
                            eVar2.h(hg.e.f(new Object[]{hg.e.e(R.string.privacy_policy), hg.e.e(R.string.term_of_service)}, R.string.please_read_s_and_s));
                            yVarI0.j.h(Boolean.TRUE);
                            return;
                        } else if (string5.length() != 4) {
                            eVar2.h(hg.e.e(R.string.wrong_verify_code));
                            return;
                        } else {
                            x.v(y0.g(yVarI0), null, null, new bl.o(strH0, string5, i13, yVarI0, (ck.c) null), 3);
                            return;
                        }
                    }
                }
                eVar2.h(hg.e.e(R.string.please_enter_correct_email));
                return;
            case 5:
                GpuCard gpuCard = (GpuCard) obj2;
                int i14 = GpuCard.f21183f;
                String str2 = ((di.a) obj).f22272d;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                String strReplace = str2.replace(" ", "\n");
                ScrollView scrollView = new ScrollView(gpuCard.getContext());
                int iN = cm.g.n(R.attr.dialogPreferredPadding, gpuCard.getContext());
                TextView textView = new TextView(gpuCard.getContext());
                textView.setTextSize(12.0f);
                textView.setTextColor(cm.g.l(android.R.attr.textColorSecondary, gpuCard.getContext()));
                int i15 = iN / 2;
                textView.setPadding(iN, i15, iN, i15);
                textView.setText(strReplace);
                scrollView.addView(textView);
                t7.m mVar = new t7.m(gpuCard.getContext());
                mVar.y(R.string.opengl_extensions);
                mVar.z(scrollView);
                mVar.x(android.R.string.ok, null);
                i.e eVarA = mVar.A();
                eVarA.setCanceledOnTouchOutside(false);
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                dj.b.s(eVarA, com.liuzh.deviceinfo.utilities.f.d());
                return;
            case 6:
                StorageCleanActivity storageCleanActivity = (StorageCleanActivity) obj;
                int i16 = StorageCleanActivity.K;
                ((Button) obj2).setClickable(false);
                e80 e80Var = storageCleanActivity.E;
                if (e80Var == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((ConstraintLayout) e80Var.f10737k).animate().alpha(0.0f).setListener(new jg.j(storageCleanActivity, 0)).start();
                e80 e80Var2 = storageCleanActivity.E;
                if (e80Var2 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) e80Var2.f10731c;
                constraintLayout.setAlpha(0.0f);
                constraintLayout.setVisibility(0);
                constraintLayout.animate().alpha(1.0f).start();
                e80 e80Var3 = storageCleanActivity.E;
                if (e80Var3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((LottieAnimationView) e80Var3.f10735h).f();
                e80 e80Var4 = storageCleanActivity.E;
                if (e80Var4 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((TextView) e80Var4.f10741o).setText(storageCleanActivity.getString(R.string.string_cleaing));
                bi.d.c(new jg.h(storageCleanActivity, 3));
                return;
            case 7:
                li.a aVar2 = ((KvCard) obj2).f21386b;
                int i17 = ((li.b) obj).f28822c;
                k0 k0Var = ((f0) aVar2).f33679a;
                try {
                    if (i17 == 1) {
                        Context contextW = k0Var.W();
                        String[] strArr = zg.c.f38280b;
                        if (wi.i.b(contextW, strArr)) {
                            Context contextP = k0Var.p();
                            new Intent();
                            k0Var.l0(contextP);
                            return;
                        } else if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_location_permission", false) ? true : wi.i.d(k0Var, strArr))) {
                            nh.a.j(k0Var.W(), "com.liuzh.deviceinfo");
                            return;
                        } else {
                            k0Var.f33711j0.a(strArr);
                            com.liuzh.deviceinfo.utilities.f.k("already_request_location_permission", true);
                        }
                    } else {
                        if (i17 == 3) {
                            if (wi.i.a(k0Var.W(), "android.permission.READ_PHONE_STATE")) {
                                Context contextP2 = k0Var.p();
                                new Intent();
                                k0Var.l0(contextP2);
                                return;
                            } else if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_read_phone_state_permission", false) ? true : wi.i.d(k0Var, "android.permission.READ_PHONE_STATE"))) {
                                nh.a.j(k0Var.W(), "com.liuzh.deviceinfo");
                                return;
                            } else {
                                k0Var.f33711j0.a(new String[]{"android.permission.READ_PHONE_STATE"});
                                com.liuzh.deviceinfo.utilities.f.k("already_request_read_phone_state_permission", true);
                                return;
                            }
                        }
                        if (i17 != 2) {
                            throw new IllegalArgumentException(u.r(i17, "unknown permission type: "));
                        }
                        if (!wi.h.f36757b) {
                            return;
                        }
                        if (wi.i.b(k0Var.W(), "android.permission.READ_PHONE_NUMBERS")) {
                            Context contextP3 = k0Var.p();
                            new Intent();
                            k0Var.l0(contextP3);
                            return;
                        } else if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_read_phone_numbers_permission", false) ? true : wi.i.d(k0Var, "android.permission.READ_PHONE_NUMBERS"))) {
                            nh.a.j(k0Var.W(), "com.liuzh.deviceinfo");
                            return;
                        } else {
                            k0Var.f33711j0.a(new String[]{"android.permission.READ_PHONE_NUMBERS"});
                            com.liuzh.deviceinfo.utilities.f.k("already_request_read_phone_numbers_permission", true);
                        }
                    }
                    return;
                } catch (ActivityNotFoundException | Exception unused2) {
                    return;
                }
            case 8:
                Context context = (Context) obj2;
                jj.i iVar = ((nj.h) obj).f29961d;
                iVar.getClass();
                nk.k.e(context, "context");
                p6.i iVar2 = (p6.i) jm.a.f27720a.f1137e;
                LinkedHashSet linkedHashSet = iVar.f27713f;
                ArrayList arrayList = new ArrayList(zj.o.T(linkedHashSet, 10));
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((aj.b) it.next()).c());
                }
                iVar2.I(context, zj.n.v0(arrayList), iVar.f27719n);
                return;
            case 9:
                Context context2 = (Context) obj2;
                jj.f fVar2 = ((rj.f) obj).f32999e;
                fVar2.getClass();
                nk.k.e(context2, "context");
                if (fVar2.f27700l < 0) {
                    fVar2.f27700l = 0;
                    fVar2.f27701m.h(0);
                    String string6 = context2.getString(R.string.fa_failed);
                    nk.k.d(string6, "getString(...)");
                    fVar2.f27692c.h(string6);
                    return;
                }
                List list = fVar2.f27699k;
                if (list == null) {
                    return;
                }
                p6.i iVar3 = (p6.i) jm.a.f27720a.f1137e;
                iVar3.getClass();
                cg.a.f2848b.f(null, "duplicate_clean");
                fVar2.g.h(Boolean.TRUE);
                ArrayList arrayList2 = new ArrayList(fVar2.f27700l);
                ArrayList arrayList3 = new ArrayList(fVar2.f27700l);
                int size3 = 0;
                while (size3 < list.size()) {
                    rj.c cVar3 = (rj.c) list.get(size3);
                    if (cVar3 instanceof rj.b) {
                        rj.b bVar = (rj.b) cVar3;
                        ArrayList arrayList4 = bVar.f32990b;
                        boolean z10 = bVar.f32993e == arrayList4.size();
                        int i18 = bVar.f32993e;
                        boolean z11 = i18 > 0 && i18 < arrayList4.size();
                        boolean z12 = bVar.f32991c;
                        if (z10 || z11) {
                            boolean z13 = z10 || !z12;
                            if (z13) {
                                arrayList3.add(new yj.i(Integer.valueOf(size3), cVar3));
                            }
                            int size4 = arrayList4.size();
                            for (int i19 = 0; i19 < size4; i19++) {
                                if (((rj.a) arrayList4.get(i19)).f32988e) {
                                    String strC = ((rj.a) arrayList4.get(i19)).f32986c.c();
                                    nk.k.d(strC, "getPath(...)");
                                    arrayList2.add(strC);
                                    if (!z13) {
                                        int i20 = size3 + i19 + 1;
                                        arrayList3.add(new yj.i(Integer.valueOf(i20), list.get(i20)));
                                    }
                                }
                            }
                            if (z12) {
                                size3 += arrayList4.size();
                            }
                        } else if (z12) {
                            size3 += arrayList4.size();
                        }
                        size3++;
                    } else {
                        size3++;
                    }
                }
                iVar3.I(context2, new HashSet(arrayList2), new i0.f(fVar2, arrayList2, arrayList3, 7));
                return;
            case 10:
                rj.i iVar4 = (rj.i) obj2;
                rj.g gVar = (rj.g) obj;
                if (iVar4.f33009l || (bindingAdapterPosition = gVar.getBindingAdapterPosition()) == -1) {
                    return;
                }
                jj.f fVar3 = iVar4.f33007i;
                fVar3.getClass();
                if (nk.k.a(fVar3.g.d(), Boolean.TRUE)) {
                    String string7 = fVar3.f27696f.getString(R.string.fa_deleting_locked_tip);
                    nk.k.d(string7, "getString(...)");
                    fVar3.f27692c.h(string7);
                    return;
                }
                List list2 = fVar3.f27699k;
                if (list2 == null || list2.isEmpty() || bindingAdapterPosition < 0) {
                    return;
                }
                List list3 = fVar3.f27699k;
                nk.k.b(list3);
                if (bindingAdapterPosition >= list3.size()) {
                    return;
                }
                List list4 = fVar3.f27699k;
                nk.k.b(list4);
                Object obj3 = list4.get(bindingAdapterPosition);
                nk.k.c(obj3, "null cannot be cast to non-null type com.liuzho.lib.fileanalyzer.view.repeatfile.DisplayItem.GroupItem");
                rj.b bVar2 = (rj.b) obj3;
                bVar2.f32991c = !bVar2.f32991c;
                iVar4.notifyItemChanged(bindingAdapterPosition);
                ArrayList arrayList5 = bVar2.f32990b;
                if (bVar2.f32991c) {
                    List list5 = fVar3.f27699k;
                    nk.k.b(list5);
                    int i21 = bindingAdapterPosition + 1;
                    list5.addAll(i21, arrayList5);
                    iVar4.notifyItemRangeInserted(i21, arrayList5.size());
                    return;
                }
                int i22 = bindingAdapterPosition + 1;
                int size5 = arrayList5.size() + bindingAdapterPosition + 1;
                List list6 = fVar3.f27699k;
                nk.k.b(list6);
                list6.subList(i22, size5).clear();
                iVar4.notifyItemRangeRemoved(i22, size5 - i22);
                return;
            case 11:
                sh.b bVar3 = (sh.b) obj2;
                Intent intent = (Intent) obj;
                bVar3.getClass();
                try {
                    bVar3.b0(intent);
                    return;
                } catch (ActivityNotFoundException | SecurityException unused3) {
                    return;
                }
            case 12:
                sh.d dVar = (sh.d) obj2;
                dVar.getClass();
                com.liuzh.deviceinfo.utilities.f.f21257c.edit().putBoolean("got_camera_note", true).apply();
                dVar.Z.removeView((View) obj);
                return;
            case 13:
                wj.g gVar2 = (wj.g) obj;
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) ((ig.e) obj2).f25975k;
                appsAnalyzeActivity.I.removeAllViews();
                if (appsAnalyzeActivity.J == null) {
                    appsAnalyzeActivity.J = new wj.k(appsAnalyzeActivity.E);
                }
                v3.b bVar4 = appsAnalyzeActivity.Q;
                if (bVar4 != null) {
                    wj.k kVar = appsAnalyzeActivity.J;
                    int i23 = bVar4.f35793a;
                    int i24 = appsAnalyzeActivity.N.getLayoutParams().height;
                    v3.b bVar5 = appsAnalyzeActivity.Q;
                    f10 = 1.0f;
                    kVar.setPadding(i23, i24, bVar5.f35795c, bVar5.f35796d);
                } else {
                    f10 = 1.0f;
                }
                FrameLayout frameLayout2 = appsAnalyzeActivity.I;
                wj.k kVar2 = appsAnalyzeActivity.J;
                Context context3 = gVar2.f36781d;
                ArrayList arrayList6 = new ArrayList();
                vj.b bVar6 = gVar2.f36778a;
                if (bVar6 instanceof vj.a) {
                    HashMap map = ((vj.a) bVar6).f36257a;
                    List list7 = (List) map.get(1);
                    size2 = list7 == null ? 0 : list7.size();
                    if (size2 != 0) {
                        Drawable drawable2 = context3.getDrawable(R.drawable.appa_ic_cpu_bit_64);
                        if (drawable2 != null) {
                            drawable2 = wb.e.M(drawable2, cm.g.l(R.attr.colorAccent, context3));
                        }
                        arrayList6.add(new wj.i("64bit", size2, gVar2.a(0), list7, drawable2));
                    } else {
                        size2 = 0;
                    }
                    List list8 = (List) map.get(3);
                    int size6 = list8 == null ? 0 : list8.size();
                    List list9 = (List) map.get(2);
                    int size7 = size6 + (list9 == null ? 0 : list9.size());
                    if (size7 != 0) {
                        ArrayList arrayList7 = new ArrayList();
                        if (list8 != null) {
                            arrayList7.addAll(list8);
                        }
                        if (list9 != null) {
                            arrayList7.addAll(list9);
                        }
                        Drawable drawable3 = context3.getDrawable(R.drawable.appa_ic_cpu_bit_32);
                        if (drawable3 != null) {
                            drawable3 = wb.e.M(drawable3, cm.g.l(R.attr.colorAccent, context3));
                        }
                        arrayList6.add(new wj.i("32bit", size7, gVar2.a(1), arrayList7, drawable3));
                        size2 += size7;
                    }
                    List list10 = (List) map.get(-1);
                    int size8 = list10 == null ? 0 : list10.size();
                    if (size8 != 0) {
                        Drawable drawable4 = context3.getDrawable(R.drawable.appa_ic_cpu_bit_unknown);
                        if (drawable4 != null) {
                            drawable4 = wb.e.M(drawable4, cm.g.l(R.attr.colorAccent, context3));
                        }
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_unknown), size8, gVar2.a(2), list10, drawable4));
                        size2 += size8;
                    }
                    List list11 = (List) map.get(0);
                    int size9 = list11 == null ? 0 : list11.size();
                    if (size9 != 0) {
                        Drawable drawable5 = context3.getDrawable(R.drawable.appa_ic_cpu_bit_none);
                        if (drawable5 != null) {
                            drawable5 = wb.e.M(drawable5, cm.g.l(R.attr.colorAccent, context3));
                        }
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_no_native_lib), size9, gVar2.a(3), list11, drawable5));
                        size2 += size9;
                    }
                    string2 = context3.getString(R.string.appa_native_lib);
                    string3 = context3.getString(R.string.appa_native_lib_description);
                } else if (bVar6 instanceof vj.i) {
                    ArrayList arrayList8 = ((vj.i) bVar6).f36266a;
                    int size10 = arrayList8.size();
                    int i25 = 0;
                    int i26 = 0;
                    size2 = 0;
                    while (i26 < size10) {
                        Object obj4 = arrayList8.get(i26);
                        i26++;
                        vj.h hVar2 = (vj.h) obj4;
                        StringBuilder sb2 = new StringBuilder("API ");
                        int i27 = hVar2.f36264a;
                        boolean z14 = z3;
                        ArrayList arrayList9 = hVar2.f36265b;
                        sb2.append(i27);
                        arrayList6.add(new wj.i(sb2.toString(), arrayList9.size(), gVar2.a(i25), arrayList9, context3.getDrawable(pd.b.c(hVar2.f36264a))));
                        i25++;
                        size2 = arrayList9.size() + size2;
                        z3 = z14;
                    }
                    string2 = context3.getString(R.string.appa_target_sdk);
                    string3 = context3.getString(R.string.appa_target_sdk_description);
                } else if (bVar6 instanceof vj.f) {
                    ArrayList arrayList10 = ((vj.f) bVar6).f36262a;
                    int size11 = arrayList10.size();
                    int i28 = 0;
                    int i29 = 0;
                    size2 = 0;
                    while (i29 < size11) {
                        Object obj5 = arrayList10.get(i29);
                        i29++;
                        vj.e eVar3 = (vj.e) obj5;
                        StringBuilder sb3 = new StringBuilder("API ");
                        int i30 = eVar3.f36260a;
                        ArrayList arrayList11 = eVar3.f36261b;
                        sb3.append(i30);
                        arrayList6.add(new wj.i(sb3.toString(), arrayList11.size(), gVar2.a(i28), arrayList11, context3.getDrawable(pd.b.c(eVar3.f36260a))));
                        i28++;
                        size2 = arrayList11.size() + size2;
                    }
                    string2 = context3.getString(R.string.appa_min_sdk);
                    string3 = context3.getString(R.string.appa_min_sdk_description);
                } else if (bVar6 instanceof vj.d) {
                    HashMap map2 = ((vj.d) bVar6).f36259a;
                    Set<String> setKeySet = map2.keySet();
                    Drawable drawable6 = context3.getDrawable(android.R.mipmap.sym_def_app_icon);
                    int i31 = 0;
                    size2 = 0;
                    for (String str3 : setKeySet) {
                        List list12 = (List) map2.get(str3);
                        if (list12 != null) {
                            String string8 = str3 == null ? context3.getString(R.string.appa_unknown) : str3;
                            if ("system".equalsIgnoreCase(string8)) {
                                drawable = drawable6;
                                string4 = context3.getString(R.string.appa_system_pre_installed);
                            } else {
                                try {
                                    PackageManager packageManager = context3.getPackageManager();
                                    ApplicationInfo applicationInfo = packageManager.getPackageInfo(str3, 0).applicationInfo;
                                    string8 = applicationInfo.loadLabel(packageManager).toString();
                                    drawableLoadIcon = applicationInfo.loadIcon(packageManager);
                                } catch (Exception unused4) {
                                    drawableLoadIcon = drawable6;
                                }
                                string4 = TextUtils.isEmpty(string8.trim()) ? str3 : string8;
                                drawable = drawableLoadIcon;
                            }
                            arrayList6.add(new wj.i(string4, list12.size(), gVar2.a(i31), list12, drawable));
                            size2 = list12.size() + size2;
                            i31++;
                        }
                    }
                    string2 = context3.getString(R.string.appa_app_installer);
                    string3 = context3.getString(R.string.appa_installer_description);
                } else if (bVar6 instanceof vj.g) {
                    HashMap map3 = ((vj.g) bVar6).f36263a;
                    int i32 = 0;
                    size2 = 0;
                    for (String str4 : map3.keySet()) {
                        List list13 = (List) map3.get(str4);
                        if (list13 != null) {
                            arrayList6.add(new wj.i(str4, list13.size(), gVar2.a(i32), list13, context3.getDrawable(R.drawable.appa_ic_signature)));
                            size2 = list13.size() + size2;
                            i32++;
                        }
                    }
                    string2 = context3.getString(R.string.appa_sign_algorithm);
                    string3 = context3.getString(R.string.appa_sign_algorithm_description);
                } else {
                    if (!(bVar6 instanceof vj.c)) {
                        i4 = 0;
                        string2 = null;
                        string3 = null;
                        if (!arrayList6.isEmpty() || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                            return;
                        }
                        nk.k.b(ii.a.f26002b);
                        int i33 = gVar2.f36779b;
                        String str5 = i33 != 0 ? i33 != 1 ? i33 != 2 ? i33 != 3 ? i33 != 4 ? i33 != 5 ? "" : "app_ana_istlc_cli" : "app_ana_sig_cli" : "app_ana_abi_cli" : "app_ana_istl_cli" : "app_ana_min_cli" : "app_ana_tgt_cli";
                        if (!vk.i.H0(str5)) {
                            cg.a.f2848b.f(null, str5);
                        }
                        TextView textView2 = kVar2.f36801c;
                        PieChart pieChart = kVar2.f36799a;
                        kVar2.scrollTo(0, 0);
                        kVar2.f36800b.setText(string2);
                        Context context4 = pk.a.f32022a;
                        nk.k.b(context4);
                        String country = j4.q(context4).getCountry();
                        int i34 = ("CN".equalsIgnoreCase(country) || "TW".equalsIgnoreCase(country) || "HK".equalsIgnoreCase(country)) ? 140 : 240;
                        if (string3.length() > i34) {
                            String strSubstring = string3.substring(0, i34);
                            String string9 = kVar2.getResources().getString(R.string.appa_see_all);
                            SpannableString spannableString = new SpannableString(d.h.E(strSubstring, "...\n", string9));
                            int length = spannableString.length() - string9.length();
                            int length2 = string9.length() + length;
                            nk.k.b(ii.a.f26002b);
                            kVar2.getContext();
                            com.liuzh.deviceinfo.utilities.f fVar4 = com.liuzh.deviceinfo.utilities.f.f21256b;
                            spannableString.setSpan(new ForegroundColorSpan(com.liuzh.deviceinfo.utilities.f.a()), length, length2, 18);
                            spannableString.setSpan(new UnderlineSpan(), length, length2, 18);
                            textView2.setOnClickListener(new hh.a(kVar2, string2, string3, 3));
                            string3 = spannableString;
                            r10 = 0;
                        } else {
                            r10 = 0;
                            textView2.setOnClickListener(null);
                        }
                        textView2.setText(string3);
                        pieChart.f28997b = r10;
                        pieChart.f29018y = false;
                        pieChart.f29019z = r10;
                        pieChart.f29007n.f35213b = r10;
                        pieChart.invalidate();
                        ArrayList arrayList12 = new ArrayList();
                        ArrayList arrayList13 = new ArrayList();
                        int size12 = arrayList6.size();
                        int i35 = 0;
                        while (i35 < size12) {
                            Object obj6 = arrayList6.get(i35);
                            i35++;
                            wj.i iVar5 = (wj.i) obj6;
                            int i36 = iVar5.f36788a;
                            if (i36 != 0) {
                                arrayList12.add(new o9.i(i36, iVar5.f36789b));
                                arrayList13.add(Integer.valueOf(iVar5.f36790c));
                            }
                        }
                        o9.h hVar3 = new o9.h(string2, arrayList12);
                        hVar3.f30441a = arrayList13;
                        p9.c cVar4 = new p9.c();
                        cVar4.f31509a = new DecimalFormat("###,###,##0.0");
                        cVar4.f31510b = pieChart;
                        hVar3.f30445e = cVar4;
                        hVar3.f30472s = -7829368;
                        hVar3.f30471r = 2;
                        hVar3.f30470q = 2;
                        hVar3.f30468o = w9.g.c(f10);
                        hVar3.f30446f = false;
                        o9.g gVar3 = new o9.g();
                        gVar3.f30433a = -3.4028235E38f;
                        gVar3.f30434b = Float.MAX_VALUE;
                        gVar3.f30435c = -3.4028235E38f;
                        gVar3.f30436d = Float.MAX_VALUE;
                        gVar3.f30437e = -3.4028235E38f;
                        gVar3.f30438f = Float.MAX_VALUE;
                        gVar3.g = -3.4028235E38f;
                        gVar3.f30439h = Float.MAX_VALUE;
                        ArrayList arrayList14 = new ArrayList();
                        arrayList14.add(new o9.h[]{hVar3}[0]);
                        gVar3.f30440i = arrayList14;
                        gVar3.b();
                        n9.c cVar5 = new n9.c();
                        cVar5.f29855f = "";
                        pieChart.setRenderer(new wj.m(pieChart, pieChart.getAnimator(), pieChart.getViewPortHandler()));
                        pieChart.setUsePercentValues(true);
                        pieChart.setDescription(cVar5);
                        pieChart.setData(gVar3);
                        pieChart.setDrawCenterText(true);
                        pieChart.setExtraLeftOffset(26.0f);
                        pieChart.setExtraTopOffset(5.0f);
                        pieChart.setExtraRightOffset(26.0f);
                        pieChart.setExtraBottomOffset(5.0f);
                        pieChart.setEntryLabelColor(cm.g.l(android.R.attr.textColorPrimary, kVar2.getContext()));
                        pieChart.setEntryLabelTextSize(10.0f);
                        pieChart.getLegend().f29850a = false;
                        pieChart.setHoleColor(0);
                        pieChart.setCenterText(string2);
                        pieChart.setCenterTextColor(cm.g.l(R.attr.colorPrimaryDark, kVar2.getContext()));
                        pieChart.setCenterTextSize(12.0f);
                        pieChart.setOnChartValueSelectedListener(new a0(kVar2, i4, string2));
                        ViewGroup viewGroup = kVar2.f36802d;
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(kVar2.getContext());
                        int i37 = 0;
                        while (i37 < arrayList6.size()) {
                            wj.i iVar6 = (wj.i) arrayList6.get(i37);
                            View childAt = viewGroup.getChildAt(i37);
                            if (childAt != null) {
                                jVar = childAt.getTag() instanceof wj.j ? (wj.j) childAt.getTag() : new wj.j(childAt);
                            } else {
                                childAt = layoutInflaterFrom.inflate(R.layout.appa_app_analyze_result_detail_item, viewGroup, false);
                                jVar = new wj.j(childAt);
                                viewGroup.addView(childAt);
                            }
                            float f11 = (iVar6.f36788a * f10) / i4;
                            String str6 = kVar2.f36803e.format(f11 * 100.0f) + "%";
                            TextView textView3 = jVar.f36793a;
                            textView3.setText(iVar6.f36789b);
                            TextView textView4 = jVar.f36794b;
                            StringBuilder sb4 = new StringBuilder();
                            Context context5 = textView3.getContext();
                            int i38 = iVar6.f36788a;
                            sb4.append(context5.getString(R.string.appa_item_count_template, Integer.valueOf(i38)));
                            sb4.append(" (");
                            sb4.append(str6);
                            sb4.append(")");
                            textView4.setText(sb4.toString());
                            ProgressBar progressBar = jVar.f36795c;
                            progressBar.setMax(i4);
                            progressBar.setProgress(i38);
                            jVar.f36798f.setImageDrawable(iVar6.f36792e);
                            jVar.f36796d.setBackgroundColor(iVar6.f36790c);
                            jVar.f36797e.setOnClickListener(new com.applovin.mediation.nativeAds.a(25, iVar6));
                            childAt.setTag(jVar);
                            i37++;
                            layoutInflaterFrom = layoutInflaterFrom;
                        }
                        if (viewGroup.getChildCount() > arrayList6.size()) {
                            viewGroup.removeViews(arrayList6.size(), viewGroup.getChildCount() - arrayList6.size());
                        }
                        frameLayout2.addView(kVar2, -1, -1);
                        return;
                    }
                    Drawable drawable7 = context3.getDrawable(R.drawable.appa_ic_phone_android);
                    HashMap map4 = ((vj.c) bVar6).f36258a;
                    List list14 = (List) map4.get(0);
                    if (list14 != null) {
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_install_loc_auto), list14.size(), gVar2.a(0), list14, drawable7));
                        size = list14.size();
                    } else {
                        size = 0;
                    }
                    List list15 = (List) map4.get(1);
                    if (list15 != null) {
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_install_loc_internal_only), list15.size(), gVar2.a(1), list15, drawable7));
                        size += list15.size();
                    }
                    List list16 = (List) map4.get(2);
                    if (list16 != null) {
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_install_loc_prefer_external), list16.size(), gVar2.a(2), list16, drawable7));
                        size += list16.size();
                    }
                    List list17 = (List) map4.get(-1);
                    if (list17 != null) {
                        arrayList6.add(new wj.i(context3.getString(R.string.appa_unknown), list17.size(), gVar2.a(3), list17, drawable7));
                        size2 = list17.size() + size;
                    } else {
                        size2 = size;
                    }
                    string2 = context3.getString(R.string.appa_install_loc);
                    string3 = context3.getString(R.string.appa_install_loc_description);
                }
                i4 = size2;
                if (arrayList6.isEmpty()) {
                    return;
                } else {
                    return;
                }
            default:
                i.e eVar4 = (i.e) obj;
                zg.b bVar7 = ((yg.c) obj2).f37614p0;
                if (bVar7 != null) {
                    bVar7.e();
                }
                eVar4.dismiss();
                return;
        }
    }

    public /* synthetic */ g(nj.b bVar, Context context, int i4) {
        this.f384a = i4;
        this.f386c = bVar;
        this.f385b = context;
    }
}
