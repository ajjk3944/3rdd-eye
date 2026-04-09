package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f23544f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f23545a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f23546b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23547c;

    /* renamed from: d, reason: collision with root package name */
    private d f23548d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23549e;

    private a(d dVar) {
        this.f23548d = dVar;
    }

    public static a a() {
        return f23544f;
    }

    private void c() {
        if (!this.f23547c || this.f23546b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f23546b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f23545a.a();
        Date date = this.f23546b;
        if (date == null || dateA.after(date)) {
            this.f23546b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f23547c) {
            return;
        }
        this.f23548d.a(context);
        this.f23548d.a(this);
        this.f23548d.e();
        this.f23549e = this.f23548d.c();
        this.f23547c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f23549e && z10) {
            d();
        }
        this.f23549e = z10;
    }
}
