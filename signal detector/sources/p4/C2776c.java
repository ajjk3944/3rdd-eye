package p4;

import a.AbstractC0241a;
import android.app.Activity;
import com.lefan.signal.MyApplication;
import j2.C2545a;
import j2.u;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2776c extends u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f22877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2777d f22878e;

    public C2776c(MyApplication myApplication, Activity activity, C2777d c2777d) {
        this.f22877d = activity;
        this.f22878e = c2777d;
    }

    @Override // j2.u
    public final void a() {
        MyApplication.f18812d = true;
        AbstractC0241a.m(this.f22877d, "Insert_ad_pair");
    }

    @Override // j2.u
    public final void b() {
        MyApplication.f18812d = false;
        C2777d c2777d = this.f22878e;
        c2777d.f22879a = null;
        MyApplication.f18816h = false;
        c2777d.a(this.f22877d);
    }

    @Override // j2.u
    public final void d(C2545a c2545a) {
        C2777d c2777d = this.f22878e;
        c2777d.f22879a = null;
        MyApplication.f18816h = false;
        c2777d.a(this.f22877d);
    }

    @Override // j2.u
    public final void e() {
        AbstractC0241a.n(this.f22877d, "Insert_ad_pair");
    }

    @Override // j2.u
    public final void g() {
    }
}
