package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.C0752Tp;
import java.io.InputStream;
import java.util.HashMap;
import u1.y;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final g f6543c = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6544a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6545b;

    public h() {
        this.f6544a = 0;
        this.f6545b = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.f
    public void b() {
        switch (this.f6544a) {
            case 1:
            case 2:
                break;
            default:
                ((y) this.f6545b).b();
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public Object c() {
        switch (this.f6544a) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6545b).rewind();
            case 2:
                return this.f6545b;
            default:
                y yVar = (y) this.f6545b;
                yVar.reset();
                return yVar;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f6545b).rewind();
    }

    public h(InputStream inputStream, C0752Tp c0752Tp) {
        this.f6544a = 3;
        y yVar = new y(inputStream, c0752Tp);
        this.f6545b = yVar;
        yVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6544a = 1;
        this.f6545b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.f6544a = 2;
        this.f6545b = obj;
    }

    private final void a() {
    }

    private final void d() {
    }
}
