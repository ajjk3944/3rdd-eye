package com.liuzh.deviceinfo.sensors;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import b5.u0;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import com.liuzh.deviceinfo.utilities.l;
import e4.m0;
import e4.v0;
import hg.a;
import java.util.WeakHashMap;
import je.u;
import km.i;
import nk.k;
import qg.b;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class SensorDetailActivity extends a {
    public static final /* synthetic */ int C = 0;
    public boolean B = true;

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        if (this.B) {
            f fVar = f.f21256b;
            SharedPreferences sharedPreferences = f.f21257c;
            if (sharedPreferences.getBoolean("can_show_rate_dialog", true) && sharedPreferences.getInt("enter_sensor_detail_count", 0) == 3) {
                this.B = false;
                new i(15, this).z("sensor_detail_back");
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_sensor_detail, (ViewGroup) null, false);
        int i4 = R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) e.s(R.id.content_container, viewInflate);
        if (frameLayout != null) {
            i4 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) e.s(R.id.toolbar, viewInflate);
            if (toolbar != null) {
                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                b bVar = new b(frameLayout2, frameLayout, toolbar);
                setContentView(frameLayout2);
                z(toolbar);
                A();
                zh.i.e(toolbar);
                String stringExtra = getIntent().getStringExtra("name");
                int intExtra = getIntent().getIntExtra("type", 0);
                int intExtra2 = getIntent().getIntExtra("icon", 0);
                String strA = l.a(intExtra, this);
                if (TextUtils.equals(strA, getString(R.string.unknown)) && !TextUtils.isEmpty(stringExtra)) {
                    strA = stringExtra;
                }
                setTitle(strA);
                lf.e eVar = new lf.e(6, bVar);
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(toolbar, eVar);
                if (bundle != null) {
                    return;
                }
                ph.e eVar2 = new ph.e();
                Bundle bundle2 = new Bundle();
                bundle2.putString("name", stringExtra);
                bundle2.putInt("type", intExtra);
                bundle2.putInt("icon", intExtra2);
                eVar2.Z(bundle2);
                u0 u0VarS = s();
                k.d(u0VarS, "getSupportFragmentManager(...)");
                b5.a aVar = new b5.a(u0VarS);
                int id2 = frameLayout.getId();
                String simpleName = ph.e.class.getSimpleName();
                if (id2 == 0) {
                    throw new IllegalArgumentException("Must use non-zero containerViewId");
                }
                aVar.h(id2, eVar2, simpleName, 2);
                aVar.e();
                f fVar = f.f21256b;
                SharedPreferences sharedPreferences = f.f21257c;
                int i10 = sharedPreferences.getInt("enter_sensor_detail_count", 0);
                if (i10 < Integer.MAX_VALUE) {
                    i10++;
                }
                u.z(sharedPreferences, "enter_sensor_detail_count", i10);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // hg.a, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        k.e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
