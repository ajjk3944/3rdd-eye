package f0;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21018a;

    /* renamed from: b, reason: collision with root package name */
    public Configuration f21019b;

    public s(boolean z10) {
        this.f21018a = z10;
    }

    public final boolean a() {
        return this.f21018a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(boolean z10, Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.p.e(newConfig, "newConfig");
        this.f21019b = newConfig;
    }
}
