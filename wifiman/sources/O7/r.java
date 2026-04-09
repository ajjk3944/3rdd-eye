package o7;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
final class r implements q {

    /* renamed from: b, reason: collision with root package name */
    private final Context f55569b;

    /* renamed from: c, reason: collision with root package name */
    private final int f55570c;

    /* renamed from: d, reason: collision with root package name */
    private final String f55571d;

    public r(Context context) {
        AbstractC6492s.i(context, "context");
        this.f55569b = context;
        this.f55570c = Build.VERSION.SDK_INT;
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC6492s.h(RELEASE, "RELEASE");
        this.f55571d = RELEASE;
    }

    @Override // o7.q
    public boolean a() {
        return Settings.System.canWrite(this.f55569b);
    }

    @Override // o7.q
    public String b() {
        return this.f55571d;
    }

    @Override // o7.q
    public int c() {
        return this.f55570c;
    }
}
