package s1;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f61136a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f61137b;

    public r(boolean z10) {
        this.f61136a = z10;
    }

    public final boolean a() {
        return this.f61136a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC6492s.i(newConfig, "newConfig");
        this.f61137b = newConfig;
    }
}
