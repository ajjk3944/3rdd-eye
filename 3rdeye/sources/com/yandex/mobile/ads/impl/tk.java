package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class tk extends my {

    /* renamed from: j, reason: collision with root package name */
    private long f33650j;

    /* renamed from: k, reason: collision with root package name */
    private int f33651k;

    /* renamed from: l, reason: collision with root package name */
    private int f33652l;

    public tk() {
        super(2);
        this.f33652l = 32;
    }

    public final boolean a(my myVar) {
        ByteBuffer byteBuffer;
        if (myVar.i()) {
            throw new IllegalArgumentException();
        }
        if (myVar.d()) {
            throw new IllegalArgumentException();
        }
        if (myVar.f()) {
            throw new IllegalArgumentException();
        }
        if (m()) {
            if (this.f33651k >= this.f33652l || myVar.e() != e()) {
                return false;
            }
            ByteBuffer byteBuffer2 = myVar.f30572d;
            if (byteBuffer2 != null && (byteBuffer = this.f30572d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.f33651k;
        this.f33651k = i + 1;
        if (i == 0) {
            this.f30574f = myVar.f30574f;
            if (myVar.g()) {
                d(1);
            }
        }
        if (myVar.e()) {
            d(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer3 = myVar.f30572d;
        if (byteBuffer3 != null) {
            e(byteBuffer3.remaining());
            this.f30572d.put(byteBuffer3);
        }
        this.f33650j = myVar.f30574f;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.my, com.yandex.mobile.ads.impl.am
    public final void b() {
        super.b();
        this.f33651k = 0;
    }

    public final void f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.f33652l = i;
    }

    public final long k() {
        return this.f33650j;
    }

    public final int l() {
        return this.f33651k;
    }

    public final boolean m() {
        return this.f33651k > 0;
    }
}
