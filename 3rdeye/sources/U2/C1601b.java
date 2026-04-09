package U2;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* renamed from: U2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601b implements L2.k<BitmapDrawable> {

    /* renamed from: b, reason: collision with root package name */
    public final O2.b f12391b;

    /* renamed from: c, reason: collision with root package name */
    public final C1602c f12392c;

    public C1601b(O2.b bVar, C1602c c1602c) {
        this.f12391b = bVar;
        this.f12392c = c1602c;
    }

    @Override // L2.k
    public final L2.c b(L2.h hVar) {
        return L2.c.TRANSFORMED;
    }

    @Override // L2.d
    public final boolean f(Object obj, File file, L2.h hVar) {
        return this.f12392c.f(new e(this.f12391b, ((BitmapDrawable) ((N2.u) obj).get()).getBitmap()), file, hVar);
    }
}
