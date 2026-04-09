package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f14671a;

    /* renamed from: b, reason: collision with root package name */
    private double f14672b;

    /* renamed from: c, reason: collision with root package name */
    private String f14673c;

    /* renamed from: d, reason: collision with root package name */
    private String f14674d;

    /* renamed from: e, reason: collision with root package name */
    private int f14675e;

    /* renamed from: f, reason: collision with root package name */
    private long f14676f;

    /* renamed from: g, reason: collision with root package name */
    private int f14677g;

    /* renamed from: h, reason: collision with root package name */
    private long f14678h;

    /* renamed from: i, reason: collision with root package name */
    private String f14679i;

    /* renamed from: j, reason: collision with root package name */
    private long f14680j;

    public void a(long j10) {
        this.f14680j = j10;
    }

    public double b() {
        return this.f14672b;
    }

    public long c() {
        return this.f14680j;
    }

    public String d() {
        return this.f14673c;
    }

    public String e() {
        return this.f14674d;
    }

    public int f() {
        return this.f14675e;
    }

    public int g() {
        return this.f14677g;
    }

    public long h() {
        return this.f14678h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f14671a;
    }

    public void b(String str) {
        this.f14673c = str;
    }

    public void c(String str) {
        this.f14674d = str;
    }

    public void d(String str) {
        this.f14679i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f14671a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f14677g = i10;
    }

    public void c(long j10) {
        this.f14678h = j10;
    }

    public void a(String str) throws NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f14672b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f14676f = j10;
    }

    public void a(int i10) {
        this.f14675e = i10;
    }
}
