package fd;

import dc.C5341a;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.OkHttpClient;

/* renamed from: fd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5809c implements InterfaceC5808b {

    /* renamed from: a, reason: collision with root package name */
    private final C5341a f47300a;

    /* renamed from: b, reason: collision with root package name */
    private final OkHttpClient f47301b;

    public C5809c(C5341a buildConfig) {
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f47300a = buildConfig;
        this.f47301b = new OkHttpClient.Builder().a(new C5807a("wifiman/android", buildConfig.d())).c();
    }

    @Override // fd.InterfaceC5808b
    public OkHttpClient a() {
        return this.f47301b;
    }
}
