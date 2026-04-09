package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f12218f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f12219a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f12220b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12221c;

    /* renamed from: d, reason: collision with root package name */
    private d f12222d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12223e;

    private a(d dVar) {
        this.f12222d = dVar;
    }

    public static a a() {
        return f12218f;
    }

    private void c() throws JSONException {
        if (!this.f12221c || this.f12220b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f12220b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f12219a.a();
        Date date = this.f12220b;
        if (date == null || dateA.after(date)) {
            this.f12220b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f12221c) {
            return;
        }
        this.f12222d.a(context);
        this.f12222d.a(this);
        this.f12222d.e();
        this.f12223e = this.f12222d.c();
        this.f12221c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f12223e && z10) {
            d();
        }
        this.f12223e = z10;
    }
}
