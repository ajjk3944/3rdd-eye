package t8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.MBridgeConstans;
import com.wifi.netdiscovery.data.HostInfo;
import com.wifihacker.detector.HackerApplication;
import com.wifihacker.detector.mvp.view.activity.base.BaseActivity;
import com.wifihacker.whousemywifi.wifirouter.wifisecurity.R;
import g8.h;
import g8.l;
import g8.r;
import g8.s;
import g8.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l8.a1;

/* loaded from: classes3.dex */
public class a extends u8.a<a1> implements View.OnClickListener, v8.a, OnUserEarnedRewardListener {

    /* renamed from: c, reason: collision with root package name */
    public q8.a f24409c;

    /* renamed from: d, reason: collision with root package name */
    public Toast f24410d;

    /* renamed from: e, reason: collision with root package name */
    public s8.a f24411e;

    /* renamed from: f, reason: collision with root package name */
    public g8.a f24412f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24413g = false;

    /* renamed from: t8.a$a, reason: collision with other inner class name */
    public class RunnableC0482a implements Runnable {
        public RunnableC0482a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 30) {
                a.this.O();
                return;
            }
            a.this.f24409c = new p8.b();
            a.this.f24409c.c(a.this.f24549b, a.this);
            a.this.f24409c.b();
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
            super.onScrollStateChanged(recyclerView, i10);
            if (i10 != 0) {
                ((a1) a.this.f24548a).f23216w.setVisibility(8);
            } else {
                ((a1) a.this.f24548a).f23216w.setVisibility(0);
            }
        }
    }

    public class c implements m8.a {
        public c() {
        }

        @Override // m8.a
        public void a(boolean z10) {
            h.k(a.this.f24549b, true, false);
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f24417a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f24418b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f24419c;

        public d(List list, List list2, List list3) {
            this.f24417a = list;
            this.f24418b = list2;
            this.f24419c = list3;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.H(false);
            ((a1) a.this.f24548a).D.D.setText(this.f24417a.size() + "");
            List list = this.f24418b;
            int size = list == null ? 0 : list.size();
            ((a1) a.this.f24548a).D.E.setText((this.f24417a.size() + size) + "");
            a.this.f24411e.i(this.f24419c, this.f24418b, false);
            HackerApplication.l().u(HackerApplication.l().m() + 10000);
        }
    }

    public class e implements i8.a {

        /* renamed from: t8.a$e$a, reason: collision with other inner class name */
        public class RunnableC0483a implements Runnable {
            public RunnableC0483a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g8.f.c(a.this.f24549b, a.this.f24411e.f(), null);
                a.this.H(false);
                HackerApplication.l().u(HackerApplication.l().m() + 10000);
                if (HackerApplication.l().q()) {
                    HackerApplication.l().y(false);
                    HackerApplication.l().z(false);
                    h.l(a.this.f24549b, null, false, false);
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f24423a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f24424b;

            public b(String str, String str2) {
                this.f24423a = str;
                this.f24424b = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                HostInfo hostInfo = new HostInfo();
                String str = this.f24423a;
                hostInfo.ipAddress = str;
                hostInfo.hostName = this.f24424b;
                if (TextUtils.equals(str, i8.b.k().h())) {
                    hostInfo.isMine = true;
                }
                if (TextUtils.equals(this.f24423a, i8.b.k().i())) {
                    hostInfo.isGateWay = true;
                }
                a.this.f24411e.c(hostInfo);
                ((a1) a.this.f24548a).D.D.setText(String.valueOf(a.this.f24411e.e()));
                HackerApplication.l().u(a.this.f24411e.e());
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.H(false);
            }
        }

        public e() {
        }

        @Override // i8.a
        public void a(String str, String str2) {
            a.this.f24549b.runOnUiThread(new b(str, str2));
        }

        @Override // i8.a
        public void b(HashMap map) {
            a.this.f24549b.runOnUiThread(new RunnableC0483a());
        }

        @Override // i8.a
        public void c() {
            a.this.f24549b.runOnUiThread(new c());
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f24427a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f24428b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f24429c;

        public f(List list, List list2, List list3) {
            this.f24427a = list;
            this.f24428b = list2;
            this.f24429c = list3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((a1) a.this.f24548a).D.D.setText(this.f24427a.size() + "");
            List list = this.f24428b;
            int size = list == null ? 0 : list.size();
            ((a1) a.this.f24548a).D.E.setText((this.f24427a.size() + size) + "");
            a.this.f24411e.i(this.f24429c, this.f24428b, false);
            HackerApplication.l().u(this.f24427a.size());
        }
    }

    public class g implements Runnable {

        /* renamed from: t8.a$g$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0484a implements View.OnClickListener {
            public ViewOnClickListenerC0484a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.k(a.this.f24549b, true, false);
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((Snackbar) Snackbar.i0(((a1) a.this.f24548a).f23216w, a.this.f24549b.getString(R.string.discover_new_device), 0).Q(8000)).k0(a.this.f24549b.getString(R.string.rescan), new ViewOnClickListenerC0484a()).l0(ContextCompat.getColor(a.this.f24549b, R.color.colorAccent)).U();
        }
    }

    public final void H(boolean z10) {
        if (z10) {
            ((a1) this.f24548a).A.setVisibility(0);
            ((a1) this.f24548a).C.setVisibility(8);
        } else {
            ((a1) this.f24548a).A.setVisibility(8);
            ((a1) this.f24548a).C.setVisibility(0);
        }
    }

    public boolean I() {
        return ((a1) this.f24548a).A.getVisibility() == 0;
    }

    public void J() {
        this.f24411e.notifyDataSetChanged();
    }

    public final List K(List list, List list2) {
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HostInfo) it.next()).hardwareAddress);
            }
        }
        if (arrayList.size() > 0) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (arrayList.contains(((HostInfo) it2.next()).hardwareAddress)) {
                    it2.remove();
                }
            }
        }
        return list2;
    }

    public final void L() {
        String strC = u.c(this.f24549b);
        if (!TextUtils.isEmpty(strC)) {
            ((a1) this.f24548a).D.H.setText(strC + " " + getString(R.string.connected));
        }
        ((a1) this.f24548a).D.G.setText(s.j(this.f24549b));
        ((a1) this.f24548a).D.F.setText(s.q(u.d(this.f24549b).getIpAddress()));
        if (Build.VERSION.SDK_INT >= 30) {
            ((a1) this.f24548a).D.G.setVisibility(8);
            ((a1) this.f24548a).D.F.setVisibility(0);
        }
    }

    public final void N() {
        String string = ((a1) this.f24548a).D.H.getText().toString();
        String strC = u.c(this.f24549b);
        if (TextUtils.isEmpty(strC)) {
            ((a1) this.f24548a).D.H.setText("---");
            return;
        }
        if (string.contains(strC)) {
            return;
        }
        ((a1) this.f24548a).D.H.setText(strC + " " + getString(R.string.connected));
        ((a1) this.f24548a).D.G.setText(s.j(this.f24549b));
        ((a1) this.f24548a).D.F.setText(s.q((long) u.d(this.f24549b).getIpAddress()));
    }

    public final void O() {
        if (i8.b.k().l()) {
            r.a(R.string.rescan_toast);
            return;
        }
        ((a1) this.f24548a).D.D.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        HackerApplication.l().u(0);
        H(true);
        i8.b.k().p(HackerApplication.l(), new e());
    }

    public void P(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.f24549b.runOnUiThread(new d(list, K(arrayList, list2), arrayList));
    }

    @Override // v8.a
    public void a(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.f24549b.runOnUiThread(new f(list, K(arrayList, list2), arrayList));
    }

    @Override // v8.a
    public void b() {
        ((a1) this.f24548a).D.D.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        ((a1) this.f24548a).D.E.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
        HackerApplication.l().u(0);
        H(true);
    }

    @Override // v8.a
    public void c() {
        Toast toast = this.f24410d;
        if (toast != null) {
            toast.setText(this.f24549b.getString(R.string.rescan_toast));
            this.f24410d.setDuration(0);
            this.f24410d.show();
        } else {
            BaseActivity baseActivity = this.f24549b;
            Toast toastMakeText = Toast.makeText(baseActivity, baseActivity.getString(R.string.rescan_toast), 0);
            this.f24410d = toastMakeText;
            toastMakeText.show();
        }
    }

    @Override // v8.a
    public void d() {
        l.b(new g());
    }

    @Override // v8.a
    public void e(List list, List list2) {
        HackerApplication.l().w(true);
        P(list, list2);
    }

    @Override // u8.a
    public int f() {
        return R.layout.fragment_device_list;
    }

    @Override // u8.a
    public void g(Bundle bundle) {
        L();
        if (s.t()) {
            ((a1) this.f24548a).D.f23365w.setVisibility(8);
            ((a1) this.f24548a).D.f23366x.setVisibility(8);
        }
        s8.a aVar = new s8.a(getActivity(), null, null);
        this.f24411e = aVar;
        aVar.j(this);
        ((a1) this.f24548a).B.setLayoutManager(new LinearLayoutManager(this.f24549b));
        ((a1) this.f24548a).B.setAdapter(this.f24411e);
        ViewDataBinding viewDataBinding = this.f24548a;
        ((a1) viewDataBinding).f23219z.f(((a1) viewDataBinding).B);
        HackerApplication.l().w(true);
        if (Build.VERSION.SDK_INT >= 30) {
            ((a1) this.f24548a).D.f23368z.setVisibility(8);
        }
        new Handler().postDelayed(new RunnableC0482a(), 450L);
    }

    @Override // u8.a
    public void i() {
        ((a1) this.f24548a).f23218y.setOnClickListener(this);
        ((a1) this.f24548a).f23216w.setOnClickListener(this);
        ((a1) this.f24548a).D.f23365w.setOnClickListener(this);
        ((a1) this.f24548a).D.f23366x.setOnClickListener(this);
        ((a1) this.f24548a).B.n(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 2 && i11 == 2) {
            this.f24411e.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cv_speed_test /* 2131230919 */:
                s.v(this.f24549b, this.f24412f.b());
                break;
            case R.id.cv_wifi_analyzer /* 2131230923 */:
                s.a(getContext());
                break;
            case R.id.fab_device /* 2131230994 */:
                s.d(this.f24549b, new c());
                break;
            case R.id.ll_header /* 2131231084 */:
                h.q(this.f24549b);
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 30) {
            i8.b.k().q(true);
            return;
        }
        q8.a aVar = this.f24409c;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        N();
        ((a1) this.f24548a).f23216w.setVisibility(0);
        M();
        g8.a aVarB = g8.b.c().b();
        this.f24412f = aVarB;
        ((a1) this.f24548a).D.C.setText(aVarB.a());
        List listN = HackerApplication.l().n();
        if (listN == null || listN.size() <= 0) {
            return;
        }
        P(listN, g8.f.b(this.f24549b));
        HackerApplication.l().x(null);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.f24413g = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void M() {
    }

    @Override // u8.a
    public void h() {
    }
}
