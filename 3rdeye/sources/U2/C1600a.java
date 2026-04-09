package U2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: U2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600a<DataType> implements L2.j<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final L2.j<DataType, Bitmap> f12389a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f12390b;

    public C1600a(Resources resources, L2.j<DataType, Bitmap> jVar) {
        this.f12390b = resources;
        this.f12389a = jVar;
    }

    @Override // L2.j
    public final boolean a(DataType datatype, L2.h hVar) throws IOException {
        return this.f12389a.a(datatype, hVar);
    }

    @Override // L2.j
    public final N2.u<BitmapDrawable> b(DataType datatype, int i, int i10, L2.h hVar) throws IOException {
        N2.u<Bitmap> uVarB = this.f12389a.b(datatype, i, i10, hVar);
        if (uVarB == null) {
            return null;
        }
        return new u(this.f12390b, uVarB);
    }
}
