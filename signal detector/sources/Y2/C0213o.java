package Y2;

import android.os.Handler;
import android.webkit.WebView;

/* renamed from: Y2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213o extends WebView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4352d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final C0200b f4354b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4355c;

    public C0213o(C0214p c0214p, Handler handler, C0200b c0200b) {
        super(c0214p);
        this.f4355c = false;
        this.f4353a = handler;
        this.f4354b = c0200b;
    }

    public final void a(String str, String str2) {
        this.f4353a.post(new A1.d(this, str + "(" + str2 + ");", 19, false));
    }
}
