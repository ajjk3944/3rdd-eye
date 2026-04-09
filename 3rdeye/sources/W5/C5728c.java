package w5;

import android.os.Build;
import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5728c implements Z4.d<C5726a> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5728c f47385a = new C5728c();

    /* renamed from: b, reason: collision with root package name */
    public static final Z4.c f47386b = Z4.c.a("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final Z4.c f47387c = Z4.c.a("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final Z4.c f47388d = Z4.c.a("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final Z4.c f47389e = Z4.c.a("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final Z4.c f47390f = Z4.c.a("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f47391g = Z4.c.a("appProcessDetails");

    @Override // Z4.a
    public final void a(Object obj, Z4.e eVar) throws IOException {
        C5726a c5726a = (C5726a) obj;
        Z4.e eVar2 = eVar;
        eVar2.a(f47386b, c5726a.f47377a);
        eVar2.a(f47387c, c5726a.f47378b);
        eVar2.a(f47388d, c5726a.f47379c);
        eVar2.a(f47389e, Build.MANUFACTURER);
        eVar2.a(f47390f, c5726a.f47380d);
        eVar2.a(f47391g, c5726a.f47381e);
    }
}
