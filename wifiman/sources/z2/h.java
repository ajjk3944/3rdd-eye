package Z2;

import T.InterfaceC3551q0;
import T.o1;
import T.t1;
import Z2.c;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.compose.runtime.snapshots.k;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3551q0 f25164a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3551q0 f25165b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3551q0 f25166c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3551q0 f25167d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3551q0 f25168e;

    /* renamed from: f, reason: collision with root package name */
    private final k f25169f;

    /* renamed from: g, reason: collision with root package name */
    private Bundle f25170g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3551q0 f25171h;

    public h(d webContent) {
        AbstractC6492s.i(webContent, "webContent");
        this.f25164a = t1.d(null, null, 2, null);
        this.f25165b = t1.d(webContent, null, 2, null);
        this.f25166c = t1.d(c.b.f25088a, null, 2, null);
        this.f25167d = t1.d(null, null, 2, null);
        this.f25168e = t1.d(null, null, 2, null);
        this.f25169f = o1.f();
        this.f25171h = t1.d(null, null, 2, null);
    }

    public final d a() {
        return (d) this.f25165b.getValue();
    }

    public final k b() {
        return this.f25169f;
    }

    public final String c() {
        return (String) this.f25164a.getValue();
    }

    public final c d() {
        return (c) this.f25166c.getValue();
    }

    public final String e() {
        return (String) this.f25167d.getValue();
    }

    public final Bundle f() {
        return this.f25170g;
    }

    public final WebView g() {
        return (WebView) this.f25171h.getValue();
    }

    public final void h(d dVar) {
        AbstractC6492s.i(dVar, "<set-?>");
        this.f25165b.setValue(dVar);
    }

    public final void i(String str) {
        this.f25164a.setValue(str);
    }

    public final void j(c cVar) {
        AbstractC6492s.i(cVar, "<set-?>");
        this.f25166c.setValue(cVar);
    }

    public final void k(Bitmap bitmap) {
        this.f25168e.setValue(bitmap);
    }

    public final void l(String str) {
        this.f25167d.setValue(str);
    }

    public final void m(Bundle bundle) {
        this.f25170g = bundle;
    }

    public final void n(WebView webView) {
        this.f25171h.setValue(webView);
    }
}
