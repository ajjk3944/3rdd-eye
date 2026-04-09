package com.applovin.mediation.nativeAds;

import al.p;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.lifecycle.f1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import b5.o;
import b5.o0;
import b8.d;
import bh.t;
import bh.u;
import ck.c;
import com.google.android.material.datepicker.m;
import com.google.android.material.textfield.TextInputEditText;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.analyzer.StorageAnalyzeActivity;
import com.liuzh.deviceinfo.card.DeviceOverviewOtherCard;
import com.liuzh.deviceinfo.clean.StorageCleanActivity;
import com.liuzh.deviceinfo.location.RealtimeSatelliteActivity;
import com.liuzh.deviceinfo.pro.ProActivity;
import com.liuzh.deviceinfo.pro.account.delete.DeleteAccountActivity;
import com.liuzh.deviceinfo.pro.account.mode.User;
import com.liuzh.deviceinfo.pro.account.register.RegisterActivity;
import com.liuzh.deviceinfo.pro.account.register.ResetPwdActivity;
import com.liuzh.deviceinfo.tab.screen.ScreenSizeActivity;
import com.liuzh.deviceinfo.view.MoreAppsItemView;
import dh.g;
import fb.r;
import gh.e;
import hh.q;
import hh.v;
import hh.y;
import i0.f;
import ig.l;
import ih.b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;
import kd.w;
import nk.k;
import nk.s;
import qh.h;
import sh.a0;
import sh.n;
import sh.p0;
import vk.i;
import xk.g0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6408b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f6407a = i4;
        this.f6408b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string;
        String string2;
        d dVar;
        int i4 = this.f6407a;
        int i10 = 5;
        int i11 = 16;
        c cVar = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.f6408b;
        switch (i4) {
            case 0:
                ((MaxNativeAd) obj).performClick();
                return;
            case 1:
                ((m) obj).j0();
                throw null;
            case 2:
                int i15 = DeleteAccountActivity.D;
                g gVar = (g) ((DeleteAccountActivity) obj).B.getValue();
                String strA = bh.c.a();
                k.b(strA);
                x.v(y0.g(gVar), null, null, new p(strA, gVar, cVar, i11), 3);
                return;
            case 3:
                ProActivity.D((Context) obj);
                return;
            case 4:
                ProActivity.D(((ViewGroup) obj).getContext());
                return;
            case 5:
                gh.d dVar2 = (gh.d) obj;
                f fVar = dVar2.f24732p0;
                c cVar2 = null;
                if (fVar == null) {
                    k.k("binding");
                    throw null;
                }
                LinearLayout linearLayout = (LinearLayout) fVar.f25416b;
                k.d(linearLayout, "getRoot(...)");
                com.liuzh.deviceinfo.utilities.m.a(linearLayout);
                e eVar = (e) dVar2.f24733q0.getValue();
                f fVar2 = dVar2.f24732p0;
                if (fVar2 == null) {
                    k.k("binding");
                    throw null;
                }
                Editable text = ((AppCompatEditText) fVar2.f25417c).getText();
                String string3 = text != null ? text.toString() : null;
                wi.e eVar2 = eVar.f24734b;
                if (string3 == null || i.H0(string3)) {
                    return;
                }
                while (i12 < string3.length()) {
                    char cCharAt = string3.charAt(i12);
                    if (cCharAt != '-' && (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')))) {
                        eVar2.h(hg.e.e(R.string.redeem_code_invalidate));
                        return;
                    }
                    i12++;
                }
                User userB = bh.c.b();
                k.b(userB);
                if (userB.getVip().getVipExpire() == -1) {
                    eVar2.h(hg.e.e(R.string.lifetime_user_no_needed_redeem_tip_use_code_future));
                    return;
                }
                String strA2 = bh.c.a();
                k.b(strA2);
                x.v(y0.g(eVar), null, null, new t(strA2, string3, eVar, cVar2, 10), 3);
                return;
            case 6:
                hh.k kVar = (hh.k) obj;
                q qVar = (q) kVar.f25101d0.getValue();
                String str = kVar.f25099b0;
                if (str == null) {
                    k.k("email");
                    throw null;
                }
                String str2 = kVar.f25100c0;
                if (str2 == null) {
                    k.k("vcode");
                    throw null;
                }
                int i16 = kVar.f25098a0;
                f1 f1Var = kVar.Z;
                if (f1Var == null) {
                    k.k("binding");
                    throw null;
                }
                Editable text2 = ((TextInputEditText) f1Var.f1136d).getText();
                String string4 = (text2 == null || (string2 = text2.toString()) == null) ? null : i.V0(string2).toString();
                f1 f1Var2 = kVar.Z;
                if (f1Var2 == null) {
                    k.k("binding");
                    throw null;
                }
                Editable text3 = ((TextInputEditText) f1Var2.f1137e).getText();
                String string5 = (text3 == null || (string = text3.toString()) == null) ? null : i.V0(string).toString();
                wi.e eVar3 = qVar.f25117b;
                if (string4 == null || i.H0(string4)) {
                    eVar3.h(hg.e.e(R.string.please_input_pwd));
                    return;
                }
                if (string4.length() < 6) {
                    eVar3.h(hg.e.f(new Object[]{6}, R.string.pwd_require_min_len));
                    return;
                }
                if (string4.length() > 16) {
                    eVar3.h(hg.e.f(new Object[]{16}, R.string.pwd_require_max_len));
                    return;
                }
                if (!string4.equals(string5)) {
                    eVar3.h(hg.e.e(R.string.two_pwd_different));
                    return;
                } else if (i16 == 1) {
                    x.v(y0.g(qVar), null, null, new hh.p(str, str2, string4, qVar, null, 0), 3);
                    return;
                } else {
                    if (i16 != 2) {
                        throw new IllegalArgumentException(r5.c.h(i16, "unknown vtype[", "]"));
                    }
                    x.v(y0.g(qVar), null, null, new hh.p(str, str2, string4, qVar, null, 1), 3);
                    return;
                }
            case 7:
                o0 o0Var = RegisterActivity.B;
                ((RegisterActivity) obj).onBackPressed();
                return;
            case 8:
                int i17 = ResetPwdActivity.C;
                ((ResetPwdActivity) obj).o().f21584c.a();
                return;
            case 9:
                v vVar = (v) obj;
                y yVarI0 = vVar.i0();
                String strH0 = vVar.h0();
                int i18 = vVar.f25132a0;
                if (strH0 != null) {
                    yVarI0.getClass();
                    if (!i.H0(strH0)) {
                        if (strH0.length() != 0 ? Pattern.compile("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,8})$").matcher(strH0).matches() : false) {
                            x.v(y0.g(yVarI0), null, null, new u(strH0, i18, yVarI0, null), 3);
                            return;
                        }
                    }
                }
                yVarI0.f25142b.h(hg.e.e(R.string.please_enter_correct_email));
                return;
            case 10:
                sh.p pVar = ((sh.m) ((DeviceOverviewOtherCard) obj).f21174a).f33733a;
                if (wi.i.a(pVar.W(), "android.permission.READ_PHONE_STATE")) {
                    bi.d.a(new n(pVar, i14), 100L);
                    return;
                }
                if (!(!com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_read_phone_state_permission", false) ? true : wi.i.d(pVar, "android.permission.READ_PHONE_STATE"))) {
                    nh.a.k(pVar.W(), "com.liuzh.deviceinfo", true);
                    return;
                }
                try {
                    pVar.f33745b0.a("android.permission.READ_PHONE_STATE");
                    com.liuzh.deviceinfo.utilities.f.k("already_request_read_phone_state_permission", true);
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
            case 11:
                bi.d.c(new l(i12, (o) obj));
                return;
            case 12:
                b bVar = (b) obj;
                ih.c cVar3 = (ih.c) bVar.f25996r0.getValue();
                String strA3 = bh.c.a();
                k.b(strA3);
                User user = bVar.f25995q0;
                c cVar4 = null;
                if (user == null) {
                    k.k("userInfo");
                    throw null;
                }
                f fVar3 = bVar.f25994p0;
                if (fVar3 == null) {
                    k.k("binding");
                    throw null;
                }
                Editable text4 = ((AppCompatEditText) fVar3.f25417c).getText();
                String string6 = text4 != null ? text4.toString() : null;
                wi.e eVar4 = cVar3.f25997b;
                if (string6 == null || i.H0(string6)) {
                    eVar4.h(hg.e.e(R.string.please_input_nickname));
                    return;
                }
                if (string6.equals(user.getNickname())) {
                    cVar3.f26001f.h(Boolean.TRUE);
                    return;
                } else if (string6.length() < 2 || string6.length() > 16) {
                    eVar4.h(hg.e.e(R.string.nickname_len_hint));
                    return;
                } else {
                    x.v(y0.g(cVar3), null, null, new t(strA3, string6, cVar3, cVar4, 12), 3);
                    return;
                }
            case 13:
                int i19 = StorageCleanActivity.K;
                ((StorageCleanActivity) obj).finish();
                return;
            case 14:
                kd.d dVar3 = (kd.d) obj;
                EditText editText = dVar3.f28152i;
                if (editText == null) {
                    return;
                }
                Editable text5 = editText.getText();
                if (text5 != null) {
                    text5.clear();
                }
                dVar3.p();
                return;
            case 15:
                ((kd.l) obj).t();
                return;
            case 16:
                w wVar = (w) obj;
                EditText editText2 = wVar.f28241f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = wVar.f28241f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    wVar.f28241f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    wVar.f28241f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    wVar.f28241f.setSelection(selectionEnd);
                }
                wVar.p();
                return;
            case 17:
                MoreAppsItemView moreAppsItemView = (MoreAppsItemView) obj;
                int i20 = MoreAppsItemView.f21347r;
                com.liuzh.deviceinfo.utilities.d.j(moreAppsItemView.getContext(), moreAppsItemView.f21348q, "UsApp");
                return;
            case 18:
                ((pi.g) obj).A();
                return;
            case 19:
                qj.a aVar = (qj.a) obj;
                ej.m mVar = aVar.f32440b;
                kj.f fVar4 = (kj.f) mVar.g.d();
                if (fVar4 == null || (dVar = fVar4.f28362b) == null) {
                    return;
                }
                ArrayList arrayList = (ArrayList) dVar.f2075c;
                k.d(arrayList, "getLogFileList(...)");
                ArrayList arrayList2 = new ArrayList(zj.o.T(arrayList, 10));
                int size = arrayList.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj2 = arrayList.get(i21);
                    i21++;
                    arrayList2.add(((aj.b) obj2).c());
                }
                Set setV0 = zj.n.v0(arrayList2);
                ArrayList arrayList3 = (ArrayList) dVar.f2076d;
                k.d(arrayList3, "getEmptyFilesList(...)");
                ArrayList arrayList4 = new ArrayList(zj.o.T(arrayList3, 10));
                int size2 = arrayList3.size();
                int i22 = 0;
                while (i22 < size2) {
                    Object obj3 = arrayList3.get(i22);
                    i22++;
                    arrayList4.add(((aj.b) obj3).c());
                }
                LinkedHashSet linkedHashSetX = com.bumptech.glide.d.x(setV0, zj.n.v0(arrayList4));
                ArrayList arrayList5 = (ArrayList) dVar.f2077e;
                k.d(arrayList5, "getEmptyFolderList(...)");
                ArrayList arrayList6 = new ArrayList(zj.o.T(arrayList5, 10));
                int size3 = arrayList5.size();
                int i23 = 0;
                while (i23 < size3) {
                    Object obj4 = arrayList5.get(i23);
                    i23++;
                    arrayList6.add(((aj.b) obj4).c());
                }
                LinkedHashSet linkedHashSetX2 = com.bumptech.glide.d.x(linkedHashSetX, zj.n.v0(arrayList6));
                ArrayList arrayList7 = (ArrayList) dVar.f2074b;
                k.d(arrayList7, "getTmpFileList(...)");
                ArrayList arrayList8 = new ArrayList(zj.o.T(arrayList7, 10));
                int size4 = arrayList7.size();
                while (i13 < size4) {
                    Object obj5 = arrayList7.get(i13);
                    i13++;
                    arrayList8.add(((aj.b) obj5).c());
                }
                LinkedHashSet linkedHashSetX3 = com.bumptech.glide.d.x(linkedHashSetX2, zj.n.v0(arrayList8));
                i5.a aVarG = y0.g(mVar);
                el.e eVar5 = g0.f37189a;
                x.v(aVarG, cl.o.f2935a, null, new t(dVar, aVar, linkedHashSetX3, null, 22), 2);
                return;
            case 20:
                rj.f fVar5 = (rj.f) obj;
                s sVar = new s();
                sVar.f29984a = fVar5.f32999e.f27707s;
                t7.m mVar2 = new t7.m(fVar5.getContext());
                mVar2.y(R.string.fa_sort);
                int i24 = sVar.f29984a;
                eg.d dVar4 = new eg.d(7, sVar);
                i.b bVar2 = (i.b) mVar2.f34474c;
                bVar2.f25244q = bVar2.f25230a.getResources().getTextArray(R.array.fa_duplicate_sort);
                bVar2.f25246s = dVar4;
                bVar2.f25250w = i24;
                bVar2.f25249v = true;
                mVar2.x(android.R.string.ok, new h(i14, fVar5, sVar));
                jm.a.z().d(mVar2.A());
                return;
            case 21:
                sh.q qVar2 = (sh.q) obj;
                qVar2.U().startActivity(new Intent(qVar2.U(), (Class<?>) ScreenSizeActivity.class));
                return;
            case 22:
                ((a0) obj).m0();
                return;
            case 23:
                a0 a0Var = (a0) ((r) obj).f23968c;
                if (wi.i.b(a0Var.W(), zg.c.f38280b)) {
                    a0Var.b0(new Intent(a0Var.W(), (Class<?>) RealtimeSatelliteActivity.class));
                    return;
                } else {
                    a0Var.m0();
                    return;
                }
            case 24:
                p0 p0Var = (p0) obj;
                if (p0Var.c0()) {
                    return;
                }
                cg.a.f2848b.f(null, "storage_ana_click");
                if (TextUtils.isEmpty(p0Var.f33747b0)) {
                    return;
                }
                String str3 = p0Var.f33747b0;
                if (zg.c.d(p0Var.W())) {
                    Context contextW = p0Var.W();
                    int i25 = StorageAnalyzeActivity.C;
                    Intent intent = new Intent(contextW, (Class<?>) StorageAnalyzeActivity.class);
                    intent.putExtra("analyze_path", str3);
                    contextW.startActivity(intent);
                    return;
                }
                if (!zg.c.i(p0Var)) {
                    rg.f.j0(R.string.storage_analyze_permission_summary, p0Var);
                    return;
                } else {
                    p0Var.f33748c0.e();
                    zg.c.e();
                    return;
                }
            case 25:
                wj.i iVar = (wj.i) obj;
                se.b bVar3 = new se.b(view.getContext(), iVar.f36791d);
                String str4 = iVar.f36789b;
                t7.m mVar3 = new t7.m((Context) bVar3.f33556a);
                i.b bVar4 = (i.b) mVar3.f34474c;
                bVar4.f25233d = str4;
                bVar4.f25248u = null;
                bVar4.f25247t = R.layout.appa_dialog_app_list;
                mVar3.w(android.R.string.cancel, null);
                i.e eVarA = mVar3.A();
                o7.d dVar5 = ii.a.f26002b;
                k.b(dVar5);
                ((z2.k) dVar5.f30421b).d(eVarA);
                eVarA.setCanceledOnTouchOutside(false);
                RecyclerView recyclerView = (RecyclerView) eVarA.findViewById(R.id.recycler_view);
                if (recyclerView == null) {
                    eVarA.dismiss();
                    return;
                }
                ej.e eVar6 = new ej.e(i10, bVar3);
                bVar3.f33559d = eVar6;
                recyclerView.setAdapter(eVar6);
                View viewFindViewById = eVarA.findViewById(R.id.progressBar);
                if (viewFindViewById == null) {
                    eVarA.dismiss();
                    return;
                } else {
                    AsyncTask.execute(new oi.f(bVar3, eVarA, viewFindViewById, 12));
                    return;
                }
            case 26:
                ((xh.d) obj).U().onBackPressed();
                return;
            case 27:
                ((xh.w) obj).U().onBackPressed();
                return;
            case 28:
                yh.b bVar5 = (yh.b) obj;
                if (bVar5.c0()) {
                    return;
                }
                bVar5.f37618a0++;
                bVar5.h0();
                if (bVar5.f37618a0 == 5) {
                    bVar5.U().finish();
                    return;
                }
                return;
            default:
                yh.d dVar6 = (yh.d) obj;
                int count = dVar6.Z.getCount() * 2;
                if (count <= 256) {
                    dVar6.Z.setCount(count);
                    return;
                } else {
                    if (dVar6.c0()) {
                        return;
                    }
                    dVar6.U().finish();
                    return;
                }
        }
    }
}
