package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f20924f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f20925a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f20926b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20927c;

    /* renamed from: d, reason: collision with root package name */
    private d f20928d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20929e;

    private a(d dVar) {
        this.f20928d = dVar;
    }

    public static a a() {
        return f20924f;
    }

    private void c() {
        if (!this.f20927c || this.f20926b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f20926b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f20925a.a();
        Date date = this.f20926b;
        if (date == null || dateA.after(date)) {
            this.f20926b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f20927c) {
            return;
        }
        this.f20928d.a(context);
        this.f20928d.a(this);
        this.f20928d.e();
        this.f20929e = this.f20928d.c();
        this.f20927c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z3) {
        if (!this.f20929e && z3) {
            d();
        }
        this.f20929e = z3;
    }
}
