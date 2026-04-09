package com.yandex.mobile.ads.impl;

import N7.H7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public interface nh {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f30865a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f30866e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f30867a;

        /* renamed from: b, reason: collision with root package name */
        public final int f30868b;

        /* renamed from: c, reason: collision with root package name */
        public final int f30869c;

        /* renamed from: d, reason: collision with root package name */
        public final int f30870d;

        public a(int i, int i10, int i11) {
            this.f30867a = i;
            this.f30868b = i10;
            this.f30869c = i11;
            this.f30870d = s82.e(i11) ? s82.b(i11, i10) : -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f30867a);
            sb.append(", channelCount=");
            sb.append(this.f30868b);
            sb.append(", encoding=");
            return H7.p(sb, this.f30869c, ']');
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar) throws b;

    void a(ByteBuffer byteBuffer);

    boolean a();

    void b();

    ByteBuffer c();

    void d();

    void flush();

    boolean isActive();
}
