package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class i implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    static String f18242i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* renamed from: j, reason: collision with root package name */
    static String f18243j = "DROP TABLE IF EXISTS %s";

    /* renamed from: a, reason: collision with root package name */
    private final e f18244a;

    /* renamed from: b, reason: collision with root package name */
    private int f18245b;

    /* renamed from: c, reason: collision with root package name */
    private int f18246c;

    /* renamed from: d, reason: collision with root package name */
    private final String f18247d;

    /* renamed from: e, reason: collision with root package name */
    private long f18248e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18249f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18250g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f18251h;

    public i(e eVar) {
        this.f18244a = eVar;
        this.f18247d = eVar.n();
    }

    public void a(boolean z10) {
        this.f18250g = z10;
    }

    public void b(boolean z10) {
        this.f18249f = z10;
    }

    public e d() {
        return this.f18244a;
    }

    public long g() {
        return this.f18248e;
    }

    public int h() {
        return this.f18245b;
    }

    public String i() {
        return this.f18251h;
    }

    public int j() {
        return this.f18246c;
    }

    public String k() {
        return this.f18247d;
    }

    public boolean l() {
        return this.f18250g;
    }

    public boolean m() {
        return this.f18249f;
    }

    public void a(int i10) {
        this.f18245b = i10;
    }

    public void b(int i10) {
        this.f18246c = i10;
    }

    public void a(long j10) {
        this.f18248e = j10;
    }

    public void a(String str) {
        this.f18251h = str;
    }
}
