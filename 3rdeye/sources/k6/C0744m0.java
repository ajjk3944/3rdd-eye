package K6;

import H6.C0675l;
import K6.C0738k0;
import android.os.AsyncTask;
import android.os.Build;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.ref.WeakReference;
import w6.C5738b;

/* compiled from: DivGifImageBinder.kt */
/* renamed from: K6.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744m0 extends j6.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0738k0 f3530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O6.j f3531b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744m0(C0675l c0675l, C0738k0 c0738k0, O6.j jVar) {
        super(c0675l);
        this.f3530a = c0738k0;
        this.f3531b = jVar;
    }

    @Override // w6.C5739c
    public final void a() {
        this.f3531b.setGifUrl$div_release(null);
    }

    @Override // w6.C5739c
    public final void c(C5738b c5738b) {
        int i = Build.VERSION.SDK_INT;
        O6.j jVar = this.f3531b;
        if (i >= 28) {
            this.f3530a.getClass();
            new C0738k0.a(new WeakReference(jVar), c5738b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            jVar.setImage(c5738b.f47495a);
            jVar.setTag(R.id.image_loaded_flag, Boolean.TRUE);
        }
    }
}
