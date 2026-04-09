package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: io.appmetrica.analytics.impl.jf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4717jf {

    /* renamed from: c, reason: collision with root package name */
    public static final String f41114c = "jf";

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4481ab f41115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41116b;

    public AbstractC4717jf(InterfaceC4481ab interfaceC4481ab, String str) {
        this.f41115a = interfaceC4481ab;
        this.f41116b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T a(String str, float f10) {
        synchronized (this) {
            this.f41115a.a(str, f10);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T b(String str, String str2) {
        synchronized (this) {
            this.f41115a.a(str, str2);
        }
        return this;
    }

    public final C4743kf c(String str) {
        return new C4743kf(str, this.f41116b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T d(String str) {
        synchronized (this) {
            this.f41115a.remove(str);
        }
        return this;
    }

    public Set<String> c() {
        return this.f41115a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T a(String str, String[] strArr) {
        String string;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : strArr) {
                jSONArray.put(str2);
            }
            string = jSONArray.toString();
        } catch (Throwable unused) {
            string = null;
        }
        this.f41115a.a(str, string);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T b(String str, long j4) {
        synchronized (this) {
            this.f41115a.a(str, j4);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T b(String str, int i) {
        synchronized (this) {
            this.f41115a.a(i, str);
        }
        return this;
    }

    public final <T extends AbstractC4717jf> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j4) {
        return this.f41115a.getLong(str, j4);
    }

    public final int a(String str, int i) {
        return this.f41115a.getInt(str, i);
    }

    public final String a(String str, String str2) {
        return this.f41115a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC4717jf> T b(String str, boolean z10) {
        synchronized (this) {
            this.f41115a.a(str, z10);
        }
        return this;
    }

    public final boolean a(String str, boolean z10) {
        return this.f41115a.getBoolean(str, z10);
    }

    public final void b() {
        synchronized (this) {
            this.f41115a.b();
        }
    }

    public final boolean b(String str) {
        return this.f41115a.a(str);
    }
}
