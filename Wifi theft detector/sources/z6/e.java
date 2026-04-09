package z6;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.nads.nsdk.WADModel;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f25376a;

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f25377b;

    /* renamed from: c, reason: collision with root package name */
    public String f25378c;

    /* renamed from: d, reason: collision with root package name */
    public WADModel f25379d;

    /* renamed from: e, reason: collision with root package name */
    public a7.a f25380e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25381f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25382g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25383h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25384i = false;

    /* renamed from: j, reason: collision with root package name */
    public NativeAd f25385j;

    public e(Context context) {
        this.f25376a = context;
    }

    public NativeAd a() {
        return this.f25385j;
    }

    public Context b() {
        return this.f25376a;
    }

    public a7.a c() {
        return this.f25380e;
    }

    public WADModel d() {
        return this.f25379d;
    }

    public String e() {
        return this.f25378c;
    }

    public FrameLayout f() {
        return this.f25377b;
    }

    public boolean g() {
        return this.f25384i;
    }

    public void h(NativeAd nativeAd) {
        this.f25385j = nativeAd;
    }

    public void i(a7.a aVar) {
        this.f25380e = aVar;
    }

    public void j(WADModel wADModel) {
        this.f25379d = wADModel;
    }

    public void k(boolean z10) {
        this.f25383h = z10;
    }

    public void l(String str) {
        this.f25378c = str;
    }

    public void m(FrameLayout frameLayout) {
        this.f25377b = frameLayout;
    }
}
