package a8;

import android.os.Bundle;
import c9.C2092m;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: AnalyticsPlatform.kt */
/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1669a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f14235a = C2092m.W("isForegroundSession", "days_since_install", "occurrence");

    public void a(com.zipoapps.premiumhelper.d application, boolean z10) {
        l.f(application, "application");
    }

    public abstract void b(c8.d dVar);

    public abstract void c(c8.d dVar);

    public abstract void d(String str);

    public abstract void e(String str, String str2);

    public abstract void f(Bundle bundle, String str);
}
