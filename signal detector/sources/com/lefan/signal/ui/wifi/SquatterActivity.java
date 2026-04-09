package com.lefan.signal.ui.wifi;

import A1.t;
import D4.a;
import F4.e;
import I5.b;
import K4.j;
import L2.m;
import L4.h;
import T2.g;
import Y4.C0229i;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatTextView;
import c5.C0410g;
import com.apm.insight.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lefan.signal.db.MacDataBaseRoom;
import com.lefan.signal.db.SquatterBean;
import com.lefan.signal.db.SquatterRoom;
import com.lefan.signal.db.SquatterRoom_Impl;
import com.lefan.signal.ui.wifi.SquatterActivity;
import e.C2291h;
import f.C2314a;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import q5.i;

/* loaded from: classes.dex */
public final class SquatterActivity extends AbstractActivityC2349g {

    /* renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f19359d0 = 0;

    /* renamed from: O, reason: collision with root package name */
    public j f19360O;

    /* renamed from: Q, reason: collision with root package name */
    public WifiManager f19362Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0410g f19363R;

    /* renamed from: S, reason: collision with root package name */
    public final C0410g f19364S;

    /* renamed from: T, reason: collision with root package name */
    public AppCompatTextView f19365T;

    /* renamed from: U, reason: collision with root package name */
    public AppCompatTextView f19366U;

    /* renamed from: V, reason: collision with root package name */
    public AppCompatTextView f19367V;

    /* renamed from: W, reason: collision with root package name */
    public String f19368W;

    /* renamed from: X, reason: collision with root package name */
    public String f19369X;

    /* renamed from: Y, reason: collision with root package name */
    public CircularProgressIndicator f19370Y;

    /* renamed from: Z, reason: collision with root package name */
    public m f19371Z;

    /* renamed from: P, reason: collision with root package name */
    public final a f19361P = new a(R.layout.item_squatter, 16);

    /* renamed from: a0, reason: collision with root package name */
    public final CopyOnWriteArrayList f19372a0 = new CopyOnWriteArrayList();
    public final t b0 = new t(3, this);

    /* renamed from: c0, reason: collision with root package name */
    public final C2291h f19373c0 = (C2291h) p(new C2314a(3), new C0229i(this));

    public SquatterActivity() {
        final int i = 0;
        this.f19363R = new C0410g(new p5.a(this) { // from class: Y4.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SquatterActivity f4475b;

            {
                this.f4475b = this;
            }

            @Override // p5.a
            public final Object b() {
                int i3 = i;
                SquatterActivity squatterActivity = this.f4475b;
                switch (i3) {
                    case 0:
                        int i6 = SquatterActivity.f19359d0;
                        return MacDataBaseRoom.f18839k.l(squatterActivity).o();
                    default:
                        int i7 = SquatterActivity.f19359d0;
                        return SquatterRoom.f18842k.m(squatterActivity).o();
                }
            }
        });
        final int i3 = 1;
        this.f19364S = new C0410g(new p5.a(this) { // from class: Y4.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SquatterActivity f4475b;

            {
                this.f4475b = this;
            }

            @Override // p5.a
            public final Object b() {
                int i32 = i3;
                SquatterActivity squatterActivity = this.f4475b;
                switch (i32) {
                    case 0:
                        int i6 = SquatterActivity.f19359d0;
                        return MacDataBaseRoom.f18839k.l(squatterActivity).o();
                    default:
                        int i7 = SquatterActivity.f19359d0;
                        return SquatterRoom.f18842k.m(squatterActivity).o();
                }
            }
        });
    }

    public final void C(String str, int i, String str2, String str3) {
        SquatterBean squatterBean;
        Object next;
        String strQ;
        String string;
        if (str == null || str.length() == 0 || str.equals(this.f19369X) || str.equals(this.f19368W)) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f19372a0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (true) {
            squatterBean = null;
            string = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (i.a(((SquatterBean) next).getIp(), str)) {
                    break;
                }
            }
        }
        SquatterBean squatterBean2 = (SquatterBean) next;
        boolean z6 = true;
        a aVar = this.f19361P;
        if (squatterBean2 == null) {
            squatterBean2 = new SquatterBean();
            squatterBean2.setIp(str);
            copyOnWriteArrayList.add(squatterBean2);
            aVar.notifyItemInserted(copyOnWriteArrayList.size() - 1);
        }
        String mac = squatterBean2.getMac();
        if (mac == null) {
            mac = str3;
        }
        squatterBean2.setMac(mac);
        String mac2 = squatterBean2.getMac();
        if (mac2 == null || mac2.length() == 0) {
            String brand = squatterBean2.getBrand();
            if (brand == null) {
                brand = str2;
            }
            squatterBean2.setBrand(brand);
            squatterBean2.setKnown(false);
            squatterBean2.setType(i);
        } else {
            h hVar = (h) this.f19364S.getValue();
            String mac3 = squatterBean2.getMac();
            i.b(mac3);
            hVar.getClass();
            C0.t tVarA = C0.t.a(1, "SELECT * FROM squatter WHERE mac = ?");
            tVarA.c(1, mac3);
            SquatterRoom_Impl squatterRoom_Impl = hVar.f2614a;
            squatterRoom_Impl.b();
            Cursor cursorL = squatterRoom_Impl.l(tVarA);
            try {
                int iP = b.p(cursorL, "id");
                int iP2 = b.p(cursorL, "brand");
                int iP3 = b.p(cursorL, "mac");
                int iP4 = b.p(cursorL, "type");
                int iP5 = b.p(cursorL, "host");
                int iP6 = b.p(cursorL, "isKnown");
                if (cursorL.moveToFirst()) {
                    SquatterBean squatterBean3 = new SquatterBean();
                    squatterBean3.setId(cursorL.getInt(iP));
                    squatterBean3.setBrand(cursorL.isNull(iP2) ? null : cursorL.getString(iP2));
                    squatterBean3.setMac(cursorL.isNull(iP3) ? null : cursorL.getString(iP3));
                    squatterBean3.setType(cursorL.getInt(iP4));
                    if (!cursorL.isNull(iP5)) {
                        string = cursorL.getString(iP5);
                    }
                    squatterBean3.setHost(string);
                    if (cursorL.getInt(iP6) == 0) {
                        z6 = false;
                    }
                    squatterBean3.setKnown(z6);
                    squatterBean = squatterBean3;
                }
                squatterBean2.setKnown(squatterBean != null ? squatterBean.isKnown() : false);
                squatterBean2.setType(squatterBean != null ? squatterBean.getType() : i);
                if ((squatterBean == null || (strQ = squatterBean.getBrand()) == null) && (strQ = g.q(squatterBean2.getMac(), (L4.g) this.f19363R.getValue())) == null) {
                    strQ = str2;
                }
                squatterBean2.setBrand(strQ);
            } finally {
                cursorL.close();
                tVarA.b();
            }
        }
        aVar.notifyItemChanged(copyOnWriteArrayList.indexOf(squatterBean2));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((SquatterBean) next2).isKnown()) {
                arrayList.add(next2);
            }
        }
        D(arrayList.size(), copyOnWriteArrayList.size());
    }

    public final void D(int i, int i3) {
        String str;
        Spanned spannedFromHtml;
        String str2;
        String str3;
        Spanned spannedFromHtml2;
        String str4;
        String str5;
        Spanned spannedFromHtml3;
        String str6;
        AppCompatTextView appCompatTextView = this.f19365T;
        if (appCompatTextView != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                String string = getString(R.string.f_0_wi_fi);
                i.d(string, "getString(...)");
                Integer numValueOf = Integer.valueOf(i3);
                if (R2.a.f3390d) {
                    Locale locale = e.f1457a;
                    str6 = String.format(e.b(), string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                } else {
                    str6 = String.format(Locale.ENGLISH, string, Arrays.copyOf(new Object[]{numValueOf}, 1));
                }
                spannedFromHtml3 = Html.fromHtml(str6, 0);
            } else {
                String string2 = getString(R.string.f_0_wi_fi);
                i.d(string2, "getString(...)");
                Integer numValueOf2 = Integer.valueOf(i3);
                if (R2.a.f3390d) {
                    Locale locale2 = e.f1457a;
                    str5 = String.format(e.b(), string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                } else {
                    str5 = String.format(Locale.ENGLISH, string2, Arrays.copyOf(new Object[]{numValueOf2}, 1));
                }
                spannedFromHtml3 = Html.fromHtml(str5);
            }
            appCompatTextView.setText(spannedFromHtml3);
        }
        AppCompatTextView appCompatTextView2 = this.f19366U;
        if (appCompatTextView2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                String string3 = getString(R.string.device_known_num);
                i.d(string3, "getString(...)");
                Integer numValueOf3 = Integer.valueOf(i);
                if (R2.a.f3390d) {
                    Locale locale3 = e.f1457a;
                    str4 = String.format(e.b(), string3, Arrays.copyOf(new Object[]{numValueOf3}, 1));
                } else {
                    str4 = String.format(Locale.ENGLISH, string3, Arrays.copyOf(new Object[]{numValueOf3}, 1));
                }
                spannedFromHtml2 = Html.fromHtml(str4, 0);
            } else {
                String string4 = getString(R.string.device_known_num);
                i.d(string4, "getString(...)");
                Integer numValueOf4 = Integer.valueOf(i);
                if (R2.a.f3390d) {
                    Locale locale4 = e.f1457a;
                    str3 = String.format(e.b(), string4, Arrays.copyOf(new Object[]{numValueOf4}, 1));
                } else {
                    str3 = String.format(Locale.ENGLISH, string4, Arrays.copyOf(new Object[]{numValueOf4}, 1));
                }
                spannedFromHtml2 = Html.fromHtml(str3);
            }
            appCompatTextView2.setText(spannedFromHtml2);
        }
        AppCompatTextView appCompatTextView3 = this.f19367V;
        if (appCompatTextView3 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                String string5 = getString(R.string.device_unknown_num);
                i.d(string5, "getString(...)");
                Integer numValueOf5 = Integer.valueOf(i3 - i);
                if (R2.a.f3390d) {
                    Locale locale5 = e.f1457a;
                    str2 = String.format(e.b(), string5, Arrays.copyOf(new Object[]{numValueOf5}, 1));
                } else {
                    str2 = String.format(Locale.ENGLISH, string5, Arrays.copyOf(new Object[]{numValueOf5}, 1));
                }
                spannedFromHtml = Html.fromHtml(str2, 0);
            } else {
                String string6 = getString(R.string.device_unknown_num);
                i.d(string6, "getString(...)");
                Integer numValueOf6 = Integer.valueOf(i3 - i);
                if (R2.a.f3390d) {
                    Locale locale6 = e.f1457a;
                    str = String.format(e.b(), string6, Arrays.copyOf(new Object[]{numValueOf6}, 1));
                } else {
                    str = String.format(Locale.ENGLISH, string6, Arrays.copyOf(new Object[]{numValueOf6}, 1));
                }
                spannedFromHtml = Html.fromHtml(str);
            }
            appCompatTextView3.setText(spannedFromHtml);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x025b  */
    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r20) throws java.net.SocketException {
        /*
            Method dump skipped, instructions count: 1259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.SquatterActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.activity_squatter_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        m mVar = this.f19371Z;
        if (mVar != null) {
            mVar.c();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_squatter_help) {
            startActivity(new Intent(this, (Class<?>) SquatterHelpActivity.class));
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            unregisterReceiver(this.b0);
        } catch (Throwable th) {
            R2.a.d(th);
        }
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("wifi_state");
        int i = Build.VERSION.SDK_INT;
        t tVar = this.b0;
        if (i >= 33) {
            registerReceiver(tVar, intentFilter, 4);
        } else {
            registerReceiver(tVar, intentFilter);
        }
    }
}
