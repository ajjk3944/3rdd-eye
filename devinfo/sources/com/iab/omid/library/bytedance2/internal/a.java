package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f21050f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f21051a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f21052b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21053c;

    /* renamed from: d, reason: collision with root package name */
    private d f21054d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21055e;

    private a(d dVar) {
        this.f21054d = dVar;
    }

    public static a a() {
        return f21050f;
    }

    private void c() throws JSONException {
        if (!this.f21053c || this.f21052b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f21052b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f21051a.a();
        Date date = this.f21052b;
        if (date == null || dateA.after(date)) {
            this.f21052b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f21053c) {
            return;
        }
        this.f21054d.a(context);
        this.f21054d.a(this);
        this.f21054d.e();
        this.f21055e = this.f21054d.c();
        this.f21053c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z3) throws JSONException {
        if (!this.f21055e && z3) {
            d();
        }
        this.f21055e = z3;
    }
}
