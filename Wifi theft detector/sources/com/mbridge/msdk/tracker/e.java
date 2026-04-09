package com.mbridge.msdk.tracker;

import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f18227a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f18230d;

    /* renamed from: i, reason: collision with root package name */
    private h f18235i;

    /* renamed from: b, reason: collision with root package name */
    private int f18228b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18229c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f18233g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f18234h = 604800000;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18236j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18237k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f18232f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f18231e = UUID.randomUUID().toString();

    public e(String str) {
        this.f18227a = str;
    }

    public void a(int i10) {
        this.f18229c = i10;
    }

    public void b(int i10) {
        this.f18228b = i10;
    }

    public void c(long j10) {
        this.f18232f = j10;
    }

    public long d() {
        return this.f18233g;
    }

    public String g() {
        return this.f18227a;
    }

    public int h() {
        return this.f18229c;
    }

    public JSONObject i() {
        JSONObject jSONObject = this.f18230d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f18230d = jSONObject2;
        return jSONObject2;
    }

    public h j() {
        return this.f18235i;
    }

    public long k() {
        return this.f18234h;
    }

    public long l() {
        return this.f18232f;
    }

    public int m() {
        return this.f18228b;
    }

    public String n() {
        return this.f18231e;
    }

    public boolean o() {
        return this.f18237k;
    }

    public boolean p() {
        return this.f18236j;
    }

    public void a(JSONObject jSONObject) {
        this.f18230d = jSONObject;
    }

    public void b(long j10) {
        this.f18234h = j10;
    }

    public void a(String str) {
        this.f18231e = str;
    }

    public void a(long j10) {
        this.f18233g = j10;
    }

    public void a(h hVar) {
        this.f18235i = hVar;
    }

    public void a(boolean z10) {
        this.f18237k = z10;
    }
}
