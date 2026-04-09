package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import g8.y;
import java.io.InputStream;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final g f6521c = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6522a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6523b;

    public h() {
        this.f6522a = 0;
        this.f6523b = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public Object a() {
        switch (this.f6522a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6523b).rewind();
            case 2:
                return this.f6523b;
            default:
                y yVar = (y) this.f6523b;
                yVar.reset();
                return yVar;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f6522a) {
            case 1:
            case 2:
                break;
            default:
                ((y) this.f6523b).e();
                break;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6523b).rewind();
    }

    public h(InputStream inputStream, a8.g gVar) {
        this.f6522a = 3;
        y yVar = new y(inputStream, gVar);
        this.f6523b = yVar;
        yVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6522a = 1;
        this.f6523b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f6522a = 2;
        this.f6523b = obj;
    }

    private final void c() {
    }

    private final void d() {
    }
}
