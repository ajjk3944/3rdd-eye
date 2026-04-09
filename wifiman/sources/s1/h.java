package s1;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f61036a;

    /* renamed from: b, reason: collision with root package name */
    private Configuration f61037b;

    public h(boolean z10) {
        this.f61036a = z10;
    }

    public final boolean a() {
        return this.f61036a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC6492s.i(newConfig, "newConfig");
        this.f61037b = newConfig;
    }
}
