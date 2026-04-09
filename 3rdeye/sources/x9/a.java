package X9;

import kotlin.jvm.internal.l;

/* compiled from: Task.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13668a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13669b;

    /* renamed from: c, reason: collision with root package name */
    public c f13670c;

    /* renamed from: d, reason: collision with root package name */
    public long f13671d;

    public a(String name, boolean z10) {
        l.f(name, "name");
        this.f13668a = name;
        this.f13669b = z10;
        this.f13671d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f13668a;
    }
}
