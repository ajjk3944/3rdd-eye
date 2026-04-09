package r1;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2875e implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f23343a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f23344b;

    /* renamed from: c, reason: collision with root package name */
    public final f f23345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23346d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23347e;

    public C2875e(Resources.Theme theme, Resources resources, f fVar, int i) {
        this.f23343a = theme;
        this.f23344b = resources;
        this.f23345c = fVar;
        this.f23346d = i;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return this.f23345c.a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f23347e;
        if (obj != null) {
            try {
                this.f23345c.e(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        try {
            Object objC = this.f23345c.c(this.f23346d, this.f23343a, this.f23344b);
            this.f23347e = objC;
            cVar.f(objC);
        } catch (Resources.NotFoundException e6) {
            cVar.d(e6);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
