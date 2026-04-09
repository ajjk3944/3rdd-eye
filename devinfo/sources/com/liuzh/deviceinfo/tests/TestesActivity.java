package com.liuzh.deviceinfo.tests;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import b5.u0;
import b5.z;
import d.m;
import e4.m0;
import e4.v0;
import hg.a;
import hg.d;
import java.util.WeakHashMap;
import qg.b;
import wb.e;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class TestesActivity extends a {
    public b B;

    public static void D(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) TestesActivity.class);
        intent.putExtra("fragmentCls", cls.getName());
        context.startActivity(intent);
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        z zVarC = s().C(R.id.content);
        if ((zVarC instanceof d) && ((d) zVarC).d0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InstantiationException {
        super.onCreate(bundle);
        m.a(this);
        View viewInflate = getLayoutInflater().inflate(com.liuzh.deviceinfo.R.layout.activity_testes, (ViewGroup) null, false);
        int i4 = com.liuzh.deviceinfo.R.id.content_container;
        FrameLayout frameLayout = (FrameLayout) e.s(com.liuzh.deviceinfo.R.id.content_container, viewInflate);
        if (frameLayout != null) {
            i4 = com.liuzh.deviceinfo.R.id.toolbar;
            Toolbar toolbar = (Toolbar) e.s(com.liuzh.deviceinfo.R.id.toolbar, viewInflate);
            if (toolbar != null) {
                FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                this.B = new b(frameLayout2, frameLayout, toolbar);
                setContentView(frameLayout2);
                z(this.B.f32327c);
                A();
                i.e(this.B.f32327c);
                Toolbar toolbar2 = this.B.f32327c;
                o.e eVar = new o.e(22, this);
                WeakHashMap weakHashMap = v0.f22405a;
                m0.j(toolbar2, eVar);
                if (bundle != null) {
                    return;
                }
                String stringExtra = getIntent().getStringExtra("fragmentCls");
                if (TextUtils.isEmpty(stringExtra)) {
                    finish();
                    return;
                }
                try {
                    Object objNewInstance = Class.forName(stringExtra).newInstance();
                    if (!(objNewInstance instanceof d)) {
                        finish();
                        return;
                    }
                    u0 u0VarS = s();
                    u0VarS.getClass();
                    b5.a aVar = new b5.a(u0VarS);
                    aVar.h(this.B.f32326b.getId(), (z) objNewInstance, stringExtra, 1);
                    aVar.e();
                    return;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                    finish();
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    @Override // i.g, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        d dVar = (d) s().C(this.B.f32326b.getId());
        if (dVar == null || !dVar.e0(i4, keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        d dVar = (d) s().C(this.B.f32326b.getId());
        if (dVar == null || !dVar.f0(i4, keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        z zVarC = s().C(R.id.content);
        if (zVarC instanceof d) {
            ((d) zVarC).g0(z3);
        }
    }
}
