package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f13377a;

    /* renamed from: b, reason: collision with root package name */
    private int f13378b;

    /* renamed from: c, reason: collision with root package name */
    private String f13379c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Object> f13380d;

    /* renamed from: e, reason: collision with root package name */
    private int f13381e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f13382f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f13383g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13384h;

    /* renamed from: i, reason: collision with root package name */
    private long f13385i;

    /* renamed from: j, reason: collision with root package name */
    private float f13386j;

    public b(T t10, String str, String str2, int i10) {
        this.f13377a = t10;
        this.f13383g = str2;
        this.f13378b = i10;
        try {
            URL url = new URL(str);
            this.f13379c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append("resourceUrl: ");
            sb.append(this.f13379c);
            q0.a("DownloadMessage", sb.toString());
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public void a(String str, Object obj) {
        if (this.f13380d == null) {
            this.f13380d = new HashMap(4);
        }
        this.f13380d.put(str, obj);
    }

    public float b() {
        return this.f13386j;
    }

    public int c() {
        return this.f13378b;
    }

    public String d() {
        return this.f13379c;
    }

    public String e() {
        return this.f13383g;
    }

    public String f() {
        return this.f13382f;
    }

    public boolean g() {
        return this.f13384h;
    }

    public void a(String str) {
        this.f13382f = str;
    }

    public void a(boolean z10) {
        this.f13384h = z10;
    }

    public long a() {
        return this.f13385i;
    }

    public void a(long j10) {
        this.f13385i = j10;
    }

    public void a(float f10) {
        this.f13386j = f10;
    }
}
