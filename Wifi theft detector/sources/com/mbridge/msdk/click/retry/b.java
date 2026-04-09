package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    public static int f13060k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f13061l = 1;

    /* renamed from: a, reason: collision with root package name */
    private final String f13062a;

    /* renamed from: b, reason: collision with root package name */
    private int f13063b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<String> f13064c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f13065d = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f13066e;

    /* renamed from: f, reason: collision with root package name */
    private String f13067f;

    /* renamed from: g, reason: collision with root package name */
    private int f13068g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13069h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13070i;

    /* renamed from: j, reason: collision with root package name */
    private int f13071j;

    public b(String str, String str2) {
        this.f13062a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f13069h = z10;
    }

    public void b(boolean z10) {
        this.f13070i = z10;
    }

    public long c() {
        return this.f13065d;
    }

    public int d() {
        return this.f13071j;
    }

    public int e() {
        return this.f13063b;
    }

    public String f() {
        return this.f13067f;
    }

    public String g() {
        return this.f13062a;
    }

    public int h() {
        return this.f13068g;
    }

    public boolean i() {
        return this.f13069h;
    }

    public boolean j() {
        return this.f13070i;
    }

    public void a(int i10) {
        this.f13071j = i10;
    }

    public void b(int i10) {
        this.f13068g = i10;
    }

    public CampaignEx a() {
        return this.f13066e;
    }

    public void b(String str) {
        this.f13067f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f13066e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f13064c;
    }

    public void a(String str) {
        this.f13063b++;
        this.f13064c.add(str);
    }
}
