package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import f4.InterfaceFutureC2326a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Gs implements Ms {

    /* renamed from: k, reason: collision with root package name */
    public static final C1875ss f8456k = new C1875ss(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: a, reason: collision with root package name */
    public final ID f8457a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8458b;

    /* renamed from: c, reason: collision with root package name */
    public final C1605nr f8459c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f8460d;

    /* renamed from: e, reason: collision with root package name */
    public final C0960bu f8461e;

    /* renamed from: f, reason: collision with root package name */
    public final C1497lr f8462f;

    /* renamed from: g, reason: collision with root package name */
    public final C0563In f8463g;

    /* renamed from: h, reason: collision with root package name */
    public final C2141xo f8464h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8465j;

    public Gs(ID id, ScheduledExecutorService scheduledExecutorService, String str, C1605nr c1605nr, Context context, C0960bu c0960bu, C1497lr c1497lr, C0563In c0563In, C2141xo c2141xo, int i) {
        this.f8457a = id;
        this.f8458b = scheduledExecutorService;
        this.f8465j = str;
        this.f8459c = c1605nr;
        this.f8460d = context;
        this.f8461e = c0960bu;
        this.f8462f = c1497lr;
        this.f8463g = c0563In;
        this.f8464h = c2141xo;
        this.i = i;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        int i = this.i;
        C1875ss c1875ss = f8456k;
        if (i == 2) {
            return AbstractC1984ut.e(c1875ss);
        }
        C0960bu c0960bu = this.f8461e;
        if (c0960bu.f13496s) {
            if (!Arrays.asList(((String) C2841s.f23267e.f23270c.a(H9.f8722c2)).split(",")).contains(I5.b.A(I5.b.B(c0960bu.f13482d)))) {
                return AbstractC1984ut.e(c1875ss);
            }
        }
        return AbstractC1984ut.B(new L6(27, this), this.f8457a);
    }

    public final void b(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C1767qr c1767qr = (C1767qr) ((Map.Entry) it.next()).getValue();
            String str = c1767qr.f16406a;
            Bundle bundle = this.f8461e.f13482d.f23176m;
            arrayList.add(d(str, Collections.singletonList(c1767qr.f16410e), bundle != null ? bundle.getBundle(str) : null, c1767qr.f16407b, c1767qr.f16408c));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 32;
    }

    public final AbstractC2221zD d(String str, List list, Bundle bundle, boolean z6, boolean z7) {
        Es es = new Es(this, str, list, bundle, z6, z7);
        ID id = this.f8457a;
        AbstractC2221zD abstractC2221zDR = AbstractC2221zD.r(AbstractC1984ut.B(es, id));
        E9 e9 = H9.W1;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            abstractC2221zDR = (AbstractC2221zD) AbstractC1984ut.E(abstractC2221zDR, ((Long) c2841s.f23270c.a(H9.f8650P1)).longValue(), TimeUnit.MILLISECONDS, this.f8458b);
        }
        return AbstractC1984ut.C(abstractC2221zDR, Throwable.class, new C2236zb(str, 3), id);
    }
}
