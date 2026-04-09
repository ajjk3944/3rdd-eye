package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f12353f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f12354a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f12355b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12356c;

    /* renamed from: d, reason: collision with root package name */
    private d f12357d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12358e;

    private a(d dVar) {
        this.f12357d = dVar;
    }

    public static a a() {
        return f12353f;
    }

    private void c() throws JSONException {
        if (!this.f12356c || this.f12355b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f12355b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f12354a.a();
        Date date = this.f12355b;
        if (date == null || dateA.after(date)) {
            this.f12355b = dateA;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f12356c) {
            return;
        }
        this.f12357d.a(context);
        this.f12357d.a(this);
        this.f12357d.e();
        this.f12358e = this.f12357d.c();
        this.f12356c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f12358e && z10) {
            d();
        }
        this.f12358e = z10;
    }
}
