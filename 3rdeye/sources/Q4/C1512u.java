package Q4;

import Q4.f0;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: Q4.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1512u implements Z4.d<f0.e.d.AbstractC0144d> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1512u f11292a = new C1512u();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f11293b = Z4.c.a(AppLovinEventTypes.USER_VIEWED_CONTENT);

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        eVar.a(f11293b, ((f0.e.d.AbstractC0144d) obj).a());
    }
}
