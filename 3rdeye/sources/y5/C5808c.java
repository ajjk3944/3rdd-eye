package y5;

import android.net.Uri;
import f9.InterfaceC4350h;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.net.URL;
import w5.C5726a;
import w5.C5727b;

/* compiled from: RemoteSettingsFetcher.kt */
/* renamed from: y5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5808c {

    /* renamed from: a, reason: collision with root package name */
    public final C5727b f48152a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4350h f48153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f48154c = "firebase-settings.crashlytics.com";

    public C5808c(C5727b c5727b, InterfaceC4350h interfaceC4350h) {
        this.f48152a = c5727b;
        this.f48153b = interfaceC4350h;
    }

    public static final URL a(C5808c c5808c) {
        c5808c.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority(c5808c.f48154c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp");
        C5727b c5727b = c5808c.f48152a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c5727b.f47382a).appendPath("settings");
        C5726a c5726a = c5727b.f47384c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c5726a.f47379c).appendQueryParameter("display_version", c5726a.f47378b).build().toString());
    }
}
