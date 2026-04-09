package M;

import android.util.Size;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: SizeUtil.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f4110a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f4111b = new Size(Sdk$SDKError.b.WEBVIEW_ERROR_VALUE, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f4112c = new Size(640, 480);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f4113d = new Size(720, 480);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f4114e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f4115f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f4116g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
