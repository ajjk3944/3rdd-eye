package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class in2 extends n8 {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f28757k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final p8 f28758a;

    /* renamed from: b, reason: collision with root package name */
    private final o8 f28759b;

    /* renamed from: d, reason: collision with root package name */
    private mn2 f28761d;

    /* renamed from: e, reason: collision with root package name */
    private s8 f28762e;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f28766j;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f28760c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f28763f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f28764g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f28765h = UUID.randomUUID().toString();

    public in2(o8 o8Var, p8 p8Var) {
        s8 nn2Var;
        this.f28759b = o8Var;
        this.f28758a = p8Var;
        d();
        if (p8Var.a() == q8.f32094c || p8Var.a() == q8.f32096e) {
            nn2Var = new nn2(p8Var.h());
        } else {
            nn2Var = new rn2(p8Var.e(), p8Var.d());
        }
        this.f28762e = nn2Var;
        this.f28762e.a();
        jn2.a().a(this);
        this.f28762e.a(o8Var);
    }

    private void d() {
        this.f28761d = new mn2(null);
    }

    public final void a(JSONObject jSONObject) {
        if (this.f28766j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
        this.f28762e.a(jSONObject);
        this.f28766j = true;
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final void b() {
        if (this.f28763f) {
            return;
        }
        this.f28763f = true;
        jn2.a().b(this);
        this.f28762e.a(po2.a().d());
        this.f28762e.a(this, this.f28758a);
    }

    public final ArrayList c() {
        return this.f28760c;
    }

    public final void e() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
        this.f28762e.f();
        this.i = true;
    }

    public final View f() {
        return this.f28761d.get();
    }

    public final boolean g() {
        return this.f28763f && !this.f28764g;
    }

    public final boolean h() {
        return this.f28763f;
    }

    public final String i() {
        return this.f28765h;
    }

    public final s8 j() {
        return this.f28762e;
    }

    public final boolean k() {
        return this.f28764g;
    }

    public final boolean l() {
        return this.f28759b.b();
    }

    public final boolean m() {
        return this.f28759b.c();
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final void a(View view, oc0 oc0Var, String str) {
        ao2 ao2Var;
        if (this.f28764g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f28757k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f28760c.iterator();
        while (true) {
            if (!it.hasNext()) {
                ao2Var = null;
                break;
            } else {
                ao2Var = (ao2) it.next();
                if (ao2Var.a().get() == view) {
                    break;
                }
            }
        }
        if (ao2Var == null) {
            this.f28760c.add(new ao2(view, oc0Var, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final void a() {
        if (this.f28764g) {
            return;
        }
        this.f28761d.clear();
        if (!this.f28764g) {
            this.f28760c.clear();
        }
        this.f28764g = true;
        this.f28762e.e();
        jn2.a().c(this);
        this.f28762e.b();
        this.f28762e = null;
    }

    @Override // com.yandex.mobile.ads.impl.n8
    public final void a(View view) {
        if (this.f28764g || this.f28761d.get() == view) {
            return;
        }
        this.f28761d = new mn2(view);
        this.f28762e.g();
        Collection<in2> collectionB = jn2.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (in2 in2Var : collectionB) {
            if (in2Var != this && in2Var.f28761d.get() == view) {
                in2Var.f28761d.clear();
            }
        }
    }
}
