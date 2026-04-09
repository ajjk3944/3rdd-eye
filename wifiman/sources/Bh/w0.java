package Bh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f1822a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1823b;

    protected w0(String name, boolean z10) {
        AbstractC6492s.i(name, "name");
        this.f1822a = name;
        this.f1823b = z10;
    }

    public Integer a(w0 visibility) {
        AbstractC6492s.i(visibility, "visibility");
        return v0.f1810a.a(this, visibility);
    }

    public String b() {
        return this.f1822a;
    }

    public final boolean c() {
        return this.f1823b;
    }

    public w0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
