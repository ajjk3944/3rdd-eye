package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e70 implements c32 {

    /* renamed from: a, reason: collision with root package name */
    private final bv f26696a = new bv();

    /* renamed from: b, reason: collision with root package name */
    private final f32 f26697b = new f32();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f26698c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    private int f26699d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26700e;

    public class a extends g32 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ny
        public final void h() {
            e70.this.a(this);
        }
    }

    public static final class b implements b32 {

        /* renamed from: b, reason: collision with root package name */
        private final long f26702b;

        /* renamed from: c, reason: collision with root package name */
        private final xj0<av> f26703c;

        public b(long j4, xj0<av> xj0Var) {
            this.f26702b = j4;
            this.f26703c = xj0Var;
        }

        @Override // com.yandex.mobile.ads.impl.b32
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.b32
        public final List<av> b(long j4) {
            return j4 >= this.f26702b ? this.f26703c : xj0.h();
        }

        @Override // com.yandex.mobile.ads.impl.b32
        public final long a(int i) {
            if (i == 0) {
                return this.f26702b;
            }
            throw new IllegalArgumentException();
        }

        @Override // com.yandex.mobile.ads.impl.b32
        public final int a(long j4) {
            return this.f26702b > j4 ? 0 : -1;
        }
    }

    public e70() {
        for (int i = 0; i < 2; i++) {
            this.f26698c.addFirst(new a());
        }
        this.f26699d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final f32 b() throws ly {
        if (this.f26700e) {
            throw new IllegalStateException();
        }
        if (this.f26699d != 0) {
            return null;
        }
        this.f26699d = 1;
        return this.f26697b;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void flush() {
        if (this.f26700e) {
            throw new IllegalStateException();
        }
        this.f26697b.b();
        this.f26699d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void release() {
        this.f26700e = true;
    }

    @Override // com.yandex.mobile.ads.impl.c32
    public final void a(long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final g32 a() throws ly {
        if (!this.f26700e) {
            if (this.f26699d != 2 || this.f26698c.isEmpty()) {
                return null;
            }
            g32 g32Var = (g32) this.f26698c.removeFirst();
            if (this.f26697b.f()) {
                g32Var.b(4);
            } else {
                f32 f32Var = this.f26697b;
                long j4 = f32Var.f30574f;
                bv bvVar = this.f26696a;
                ByteBuffer byteBuffer = f32Var.f30572d;
                byteBuffer.getClass();
                byte[] bArrArray = byteBuffer.array();
                bvVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
                parcelObtain.setDataPosition(0);
                Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                parcelObtain.recycle();
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                parcelableArrayList.getClass();
                g32Var.a(this.f26697b.f30574f, new b(j4, fm.a(av.f24819t, parcelableArrayList)), 0L);
            }
            this.f26697b.b();
            this.f26699d = 0;
            return g32Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.jy
    public final void a(f32 f32Var) throws ly {
        if (!this.f26700e) {
            if (this.f26699d == 1) {
                if (this.f26697b == f32Var) {
                    this.f26699d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(g32 g32Var) {
        if (this.f26698c.size() < 2) {
            if (!this.f26698c.contains(g32Var)) {
                g32Var.b();
                this.f26698c.addFirst(g32Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
