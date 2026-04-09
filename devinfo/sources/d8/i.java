package d8;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f22023a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f22024b;

    /* renamed from: c, reason: collision with root package name */
    public final j f22025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22026d;

    /* renamed from: e, reason: collision with root package name */
    public Object f22027e;

    public i(Resources.Theme theme, Resources resources, j jVar, int i4) {
        this.f22023a = theme;
        this.f22024b = resources;
        this.f22025c = jVar;
        this.f22026d = i4;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f22025c.a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f22027e;
        if (obj != null) {
            try {
                this.f22025c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.i iVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object objC = this.f22025c.c(this.f22026d, this.f22023a, this.f22024b);
            this.f22027e = objC;
            cVar.f(objC);
        } catch (Resources.NotFoundException e2) {
            cVar.c(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
