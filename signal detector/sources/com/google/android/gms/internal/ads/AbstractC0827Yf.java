package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* renamed from: com.google.android.gms.internal.ads.Yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0827Yf extends TextureView implements InterfaceC1378jg {

    /* renamed from: a, reason: collision with root package name */
    public final C1055dg f12646a;

    /* renamed from: b, reason: collision with root package name */
    public final C1432kg f12647b;

    public AbstractC0827Yf(Context context) {
        super(context);
        this.f12646a = new C1055dg();
        this.f12647b = new C1432kg(context, this);
    }

    public void A(String str, String[] strArr, Integer num) {
        f(str);
    }

    public void B(int i) {
    }

    public void C(int i) {
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }

    public abstract String d();

    public abstract void e(C0946bg c0946bg);

    public abstract void f(String str);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract int j();

    public abstract int k();

    public abstract void m(int i);

    public abstract void n(float f2, float f5);

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract long r();

    public abstract long s();

    public abstract int y();

    public Integer z() {
        return null;
    }
}
