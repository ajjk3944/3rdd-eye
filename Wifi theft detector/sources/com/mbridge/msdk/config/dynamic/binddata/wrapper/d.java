package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class d implements b<String> {

    /* renamed from: a, reason: collision with root package name */
    private String f14000a;

    /* renamed from: b, reason: collision with root package name */
    private String f14001b;

    /* renamed from: c, reason: collision with root package name */
    private View f14002c;

    /* renamed from: d, reason: collision with root package name */
    private int f14003d;

    /* renamed from: e, reason: collision with root package name */
    private AtomicBoolean f14004e = new AtomicBoolean(false);

    public d(String str, String str2, View view, int i10) {
        this.f14002c = view;
        this.f14000a = str;
        this.f14001b = str2;
        this.f14003d = i10;
    }

    private boolean b(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("mbridge_")) {
            return false;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.c.valueOf(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public View a() {
        return this.f14002c;
    }

    @Override // com.mbridge.msdk.config.dynamic.binddata.wrapper.b
    public void a(String str, Object obj) {
        if (b(this.f14000a)) {
            a(String.valueOf(obj));
        } else {
            b(str, obj);
        }
    }

    private void b(String str, Object obj) {
        KeyEvent.Callback callback = this.f14002c;
        if (callback instanceof com.mbridge.msdk.config.dynamic.baseview.inter.a) {
            ((com.mbridge.msdk.config.dynamic.baseview.inter.a) callback).updateBindData(str, obj);
        }
    }

    private void a(String str) {
        View view;
        if (this.f14004e.get() || (view = this.f14002c) == null) {
            return;
        }
        try {
            com.mbridge.msdk.config.dynamic.utils.a.a(view, this.f14000a, this.f14001b, str);
        } catch (Exception e10) {
            q0.b("ViewObserverImpl", e10.getMessage());
        }
    }
}
