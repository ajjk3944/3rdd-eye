package p1;

import android.content.Context;
import android.os.Build;
import b5.a1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements x {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f30956f = true;

    /* renamed from: a, reason: collision with root package name */
    public final j2.r f30957a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30958b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public t1.b f30959c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30960d;

    /* renamed from: e, reason: collision with root package name */
    public final e f30961e;

    public f(j2.r rVar) {
        this.f30957a = rVar;
        e eVar = new e(this);
        this.f30961e = eVar;
        if (rVar.isAttachedToWindow()) {
            Context context = rVar.getContext();
            if (!this.f30960d) {
                context.getApplicationContext().registerComponentCallbacks(eVar);
                this.f30960d = true;
            }
        }
        rVar.addOnAttachStateChangeListener(new a1(8, this));
    }

    @Override // p1.x
    public final void a(s1.b bVar) {
        synchronized (this.f30958b) {
            if (!bVar.f33247s) {
                bVar.f33247s = true;
                bVar.b();
            }
        }
    }

    @Override // p1.x
    public final s1.b b() {
        s1.d hVar;
        s1.b bVar;
        synchronized (this.f30958b) {
            try {
                j2.r rVar = this.f30957a;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    b.b(rVar);
                }
                if (i4 >= 29) {
                    hVar = new s1.f();
                } else if (f30956f) {
                    try {
                        hVar = new s1.e(this.f30957a, new r(), new r1.b());
                    } catch (Throwable unused) {
                        f30956f = false;
                        hVar = new s1.h(c(this.f30957a));
                    }
                } else {
                    hVar = new s1.h(c(this.f30957a));
                }
                bVar = new s1.b(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final t1.a c(j2.r rVar) {
        t1.b bVar = this.f30959c;
        if (bVar != null) {
            return bVar;
        }
        t1.b bVar2 = new t1.b(rVar.getContext());
        bVar2.setClipChildren(false);
        bVar2.setClipToPadding(false);
        bVar2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        rVar.addView(bVar2, -1);
        this.f30959c = bVar2;
        return bVar2;
    }
}
