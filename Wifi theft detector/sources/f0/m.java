package f0;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21016a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f21017b;

    public m(boolean z10) {
        this.f21016a = z10;
    }

    public final boolean a() {
        return this.f21016a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(boolean z10, Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.p.e(newConfig, "newConfig");
        this.f21017b = newConfig;
    }
}
