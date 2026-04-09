package qh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.f1;
import b5.u0;
import b5.z;
import com.google.android.gms.internal.ads.lv;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;
import je.u;
import km.o;
import km.y;
import nk.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends hg.c {

    /* renamed from: p0, reason: collision with root package name */
    public final f1 f32388p0;

    public d() {
        a6.e eVar = new a6.e(20, this);
        yj.f fVarT = a.a.t(yj.g.f37636b, new b2.b(25, new b2.b(24, this)));
        this.f32388p0 = new f1(v.a(f.class), new ej.h(fVarT, 12), eVar, new ej.h(fVarT, 13));
    }

    @Override // i.y, b5.s
    public final Dialog e0(Bundle bundle) {
        f0(false);
        View viewInflate = q().inflate(R.layout.dialog_reward_theme, (ViewGroup) null, false);
        int i4 = R.id.buy_pro;
        TextView textView = (TextView) wb.e.s(R.id.buy_pro, viewInflate);
        if (textView != null) {
            i4 = R.id.cancel;
            TextView textView2 = (TextView) wb.e.s(R.id.cancel, viewInflate);
            if (textView2 != null) {
                i4 = R.id.watch_ad;
                TextView textView3 = (TextView) wb.e.s(R.id.watch_ad, viewInflate);
                if (textView3 != null) {
                    final int i10 = 0;
                    textView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.b

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32385b;

                        {
                            this.f32385b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    d dVar = this.f32385b;
                                    dVar.d0(false, false);
                                    ProActivity.D(dVar.W());
                                    break;
                                case 1:
                                    this.f32385b.d0(false, false);
                                    break;
                                default:
                                    d dVar2 = this.f32385b;
                                    f fVarJ0 = dVar2.j0();
                                    i.g gVarU = dVar2.U();
                                    fVarJ0.getClass();
                                    fVarJ0.f32399k.j(new ng.a(true));
                                    u.k(gVarU, new ag.b(1, fVarJ0), ag.a.f360c);
                                    break;
                            }
                        }
                    });
                    final int i11 = 1;
                    textView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.b

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32385b;

                        {
                            this.f32385b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    d dVar = this.f32385b;
                                    dVar.d0(false, false);
                                    ProActivity.D(dVar.W());
                                    break;
                                case 1:
                                    this.f32385b.d0(false, false);
                                    break;
                                default:
                                    d dVar2 = this.f32385b;
                                    f fVarJ0 = dVar2.j0();
                                    i.g gVarU = dVar2.U();
                                    fVarJ0.getClass();
                                    fVarJ0.f32399k.j(new ng.a(true));
                                    u.k(gVarU, new ag.b(1, fVarJ0), ag.a.f360c);
                                    break;
                            }
                        }
                    });
                    final int i12 = 2;
                    textView3.setOnClickListener(new View.OnClickListener(this) { // from class: qh.b

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32385b;

                        {
                            this.f32385b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    d dVar = this.f32385b;
                                    dVar.d0(false, false);
                                    ProActivity.D(dVar.W());
                                    break;
                                case 1:
                                    this.f32385b.d0(false, false);
                                    break;
                                default:
                                    d dVar2 = this.f32385b;
                                    f fVarJ0 = dVar2.j0();
                                    i.g gVarU = dVar2.U();
                                    fVarJ0.getClass();
                                    fVarJ0.f32399k.j(new ng.a(true));
                                    u.k(gVarU, new ag.b(1, fVarJ0), ag.a.f360c);
                                    break;
                            }
                        }
                    });
                    j0().f32395e.j("");
                    final int i13 = 0;
                    j0().f32400l.e(this, new bh.i(new mk.c(this) { // from class: qh.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32387b;

                        {
                            this.f32387b = this;
                        }

                        @Override // mk.c
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    boolean z3 = ((ng.a) obj).f29942a;
                                    d dVar = this.f32387b;
                                    if (z3) {
                                        u0 u0VarO = dVar.o();
                                        nk.k.d(u0VarO, "getChildFragmentManager(...)");
                                        rg.c cVar = new rg.c();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("key.msg", null);
                                        cVar.Z(bundle2);
                                        cVar.f0(false);
                                        z zVarD = u0VarO.D("CommonLoadingDialog");
                                        if (zVarD != null) {
                                            b5.a aVar = new b5.a(u0VarO);
                                            aVar.j(zVarD);
                                            aVar.g();
                                        }
                                        cVar.i0(u0VarO, "CommonLoadingDialog");
                                    } else {
                                        u0 u0VarO2 = dVar.o();
                                        nk.k.d(u0VarO2, "getChildFragmentManager(...)");
                                        z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                                        if (zVarD2 != null) {
                                            b5.a aVar2 = new b5.a(u0VarO2);
                                            aVar2.j(zVarD2);
                                            aVar2.g();
                                        }
                                    }
                                    break;
                                case 1:
                                    String str = (String) obj;
                                    nk.k.b(str);
                                    if (!vk.i.H0(str)) {
                                        Toast.makeText(this.f32387b.W(), str, 0).show();
                                    }
                                    break;
                                case 2:
                                    if (((Boolean) obj).booleanValue()) {
                                        d dVar2 = this.f32387b;
                                        f fVarJ0 = dVar2.j0();
                                        i.g gVarU = dVar2.U();
                                        fVarJ0.getClass();
                                        o oVar = fVarJ0.f32401m;
                                        if (oVar != null) {
                                            y yVar = new y(12, fVarJ0);
                                            lv lvVar = (lv) oVar.f28445a;
                                            lvVar.f13641c.f15455a = new qi.d(1, (pi.g) oVar.f28446b, yVar);
                                            lvVar.b(gVarU, new o.e(8, yVar));
                                        }
                                        fVarJ0.f32401m = null;
                                        fVarJ0.g.j(Boolean.FALSE);
                                    }
                                    break;
                                default:
                                    if (((Boolean) obj).booleanValue()) {
                                        this.f32387b.d0(false, false);
                                    }
                                    break;
                            }
                            return yj.u.f37649a;
                        }
                    }, 10));
                    final int i14 = 1;
                    j0().f32396f.e(this, new bh.i(new mk.c(this) { // from class: qh.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32387b;

                        {
                            this.f32387b = this;
                        }

                        @Override // mk.c
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    boolean z3 = ((ng.a) obj).f29942a;
                                    d dVar = this.f32387b;
                                    if (z3) {
                                        u0 u0VarO = dVar.o();
                                        nk.k.d(u0VarO, "getChildFragmentManager(...)");
                                        rg.c cVar = new rg.c();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("key.msg", null);
                                        cVar.Z(bundle2);
                                        cVar.f0(false);
                                        z zVarD = u0VarO.D("CommonLoadingDialog");
                                        if (zVarD != null) {
                                            b5.a aVar = new b5.a(u0VarO);
                                            aVar.j(zVarD);
                                            aVar.g();
                                        }
                                        cVar.i0(u0VarO, "CommonLoadingDialog");
                                    } else {
                                        u0 u0VarO2 = dVar.o();
                                        nk.k.d(u0VarO2, "getChildFragmentManager(...)");
                                        z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                                        if (zVarD2 != null) {
                                            b5.a aVar2 = new b5.a(u0VarO2);
                                            aVar2.j(zVarD2);
                                            aVar2.g();
                                        }
                                    }
                                    break;
                                case 1:
                                    String str = (String) obj;
                                    nk.k.b(str);
                                    if (!vk.i.H0(str)) {
                                        Toast.makeText(this.f32387b.W(), str, 0).show();
                                    }
                                    break;
                                case 2:
                                    if (((Boolean) obj).booleanValue()) {
                                        d dVar2 = this.f32387b;
                                        f fVarJ0 = dVar2.j0();
                                        i.g gVarU = dVar2.U();
                                        fVarJ0.getClass();
                                        o oVar = fVarJ0.f32401m;
                                        if (oVar != null) {
                                            y yVar = new y(12, fVarJ0);
                                            lv lvVar = (lv) oVar.f28445a;
                                            lvVar.f13641c.f15455a = new qi.d(1, (pi.g) oVar.f28446b, yVar);
                                            lvVar.b(gVarU, new o.e(8, yVar));
                                        }
                                        fVarJ0.f32401m = null;
                                        fVarJ0.g.j(Boolean.FALSE);
                                    }
                                    break;
                                default:
                                    if (((Boolean) obj).booleanValue()) {
                                        this.f32387b.d0(false, false);
                                    }
                                    break;
                            }
                            return yj.u.f37649a;
                        }
                    }, 10));
                    final int i15 = 2;
                    j0().f32397h.e(this, new bh.i(new mk.c(this) { // from class: qh.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32387b;

                        {
                            this.f32387b = this;
                        }

                        @Override // mk.c
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    boolean z3 = ((ng.a) obj).f29942a;
                                    d dVar = this.f32387b;
                                    if (z3) {
                                        u0 u0VarO = dVar.o();
                                        nk.k.d(u0VarO, "getChildFragmentManager(...)");
                                        rg.c cVar = new rg.c();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("key.msg", null);
                                        cVar.Z(bundle2);
                                        cVar.f0(false);
                                        z zVarD = u0VarO.D("CommonLoadingDialog");
                                        if (zVarD != null) {
                                            b5.a aVar = new b5.a(u0VarO);
                                            aVar.j(zVarD);
                                            aVar.g();
                                        }
                                        cVar.i0(u0VarO, "CommonLoadingDialog");
                                    } else {
                                        u0 u0VarO2 = dVar.o();
                                        nk.k.d(u0VarO2, "getChildFragmentManager(...)");
                                        z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                                        if (zVarD2 != null) {
                                            b5.a aVar2 = new b5.a(u0VarO2);
                                            aVar2.j(zVarD2);
                                            aVar2.g();
                                        }
                                    }
                                    break;
                                case 1:
                                    String str = (String) obj;
                                    nk.k.b(str);
                                    if (!vk.i.H0(str)) {
                                        Toast.makeText(this.f32387b.W(), str, 0).show();
                                    }
                                    break;
                                case 2:
                                    if (((Boolean) obj).booleanValue()) {
                                        d dVar2 = this.f32387b;
                                        f fVarJ0 = dVar2.j0();
                                        i.g gVarU = dVar2.U();
                                        fVarJ0.getClass();
                                        o oVar = fVarJ0.f32401m;
                                        if (oVar != null) {
                                            y yVar = new y(12, fVarJ0);
                                            lv lvVar = (lv) oVar.f28445a;
                                            lvVar.f13641c.f15455a = new qi.d(1, (pi.g) oVar.f28446b, yVar);
                                            lvVar.b(gVarU, new o.e(8, yVar));
                                        }
                                        fVarJ0.f32401m = null;
                                        fVarJ0.g.j(Boolean.FALSE);
                                    }
                                    break;
                                default:
                                    if (((Boolean) obj).booleanValue()) {
                                        this.f32387b.d0(false, false);
                                    }
                                    break;
                            }
                            return yj.u.f37649a;
                        }
                    }, 10));
                    final int i16 = 3;
                    j0().j.e(this, new bh.i(new mk.c(this) { // from class: qh.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f32387b;

                        {
                            this.f32387b = this;
                        }

                        @Override // mk.c
                        public final Object invoke(Object obj) {
                            switch (i16) {
                                case 0:
                                    boolean z3 = ((ng.a) obj).f29942a;
                                    d dVar = this.f32387b;
                                    if (z3) {
                                        u0 u0VarO = dVar.o();
                                        nk.k.d(u0VarO, "getChildFragmentManager(...)");
                                        rg.c cVar = new rg.c();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putString("key.msg", null);
                                        cVar.Z(bundle2);
                                        cVar.f0(false);
                                        z zVarD = u0VarO.D("CommonLoadingDialog");
                                        if (zVarD != null) {
                                            b5.a aVar = new b5.a(u0VarO);
                                            aVar.j(zVarD);
                                            aVar.g();
                                        }
                                        cVar.i0(u0VarO, "CommonLoadingDialog");
                                    } else {
                                        u0 u0VarO2 = dVar.o();
                                        nk.k.d(u0VarO2, "getChildFragmentManager(...)");
                                        z zVarD2 = u0VarO2.D("CommonLoadingDialog");
                                        if (zVarD2 != null) {
                                            b5.a aVar2 = new b5.a(u0VarO2);
                                            aVar2.j(zVarD2);
                                            aVar2.g();
                                        }
                                    }
                                    break;
                                case 1:
                                    String str = (String) obj;
                                    nk.k.b(str);
                                    if (!vk.i.H0(str)) {
                                        Toast.makeText(this.f32387b.W(), str, 0).show();
                                    }
                                    break;
                                case 2:
                                    if (((Boolean) obj).booleanValue()) {
                                        d dVar2 = this.f32387b;
                                        f fVarJ0 = dVar2.j0();
                                        i.g gVarU = dVar2.U();
                                        fVarJ0.getClass();
                                        o oVar = fVarJ0.f32401m;
                                        if (oVar != null) {
                                            y yVar = new y(12, fVarJ0);
                                            lv lvVar = (lv) oVar.f28445a;
                                            lvVar.f13641c.f15455a = new qi.d(1, (pi.g) oVar.f28446b, yVar);
                                            lvVar.b(gVarU, new o.e(8, yVar));
                                        }
                                        fVarJ0.f32401m = null;
                                        fVarJ0.g.j(Boolean.FALSE);
                                    }
                                    break;
                                default:
                                    if (((Boolean) obj).booleanValue()) {
                                        this.f32387b.d0(false, false);
                                    }
                                    break;
                            }
                            return yj.u.f37649a;
                        }
                    }, 10));
                    t7.m mVar = new t7.m(W());
                    mVar.z((ScrollView) viewInflate);
                    return mVar.f();
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public final f j0() {
        return (f) this.f32388p0.getValue();
    }
}
