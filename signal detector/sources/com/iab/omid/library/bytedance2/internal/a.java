package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f18652f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f18653a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f18654b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18655c;

    /* renamed from: d, reason: collision with root package name */
    private d f18656d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f18657e;

    private a(d dVar) {
        this.f18656d = dVar;
    }

    public static a a() {
        return f18652f;
    }

    private void c() throws JSONException {
        if (!this.f18655c || this.f18654b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f18654b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f18653a.a();
        Date date = this.f18654b;
        if (date == null || dateA.after(date)) {
            this.f18654b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f18655c) {
            return;
        }
        this.f18656d.a(context);
        this.f18656d.a(this);
        this.f18656d.e();
        this.f18657e = this.f18656d.c();
        this.f18655c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z6) throws JSONException {
        if (!this.f18657e && z6) {
            d();
        }
        this.f18657e = z6;
    }
}
