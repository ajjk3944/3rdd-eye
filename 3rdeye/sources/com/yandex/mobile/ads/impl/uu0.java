package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface uu0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final yu0 f34220a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaFormat f34221b;

        /* renamed from: c, reason: collision with root package name */
        public final dc0 f34222c;

        /* renamed from: d, reason: collision with root package name */
        public final Surface f34223d;

        /* renamed from: e, reason: collision with root package name */
        public final MediaCrypto f34224e;

        private a(yu0 yu0Var, MediaFormat mediaFormat, dc0 dc0Var, Surface surface, MediaCrypto mediaCrypto) {
            this.f34220a = yu0Var;
            this.f34221b = mediaFormat;
            this.f34222c = dc0Var;
            this.f34223d = surface;
            this.f34224e = mediaCrypto;
        }

        public static a a(yu0 yu0Var, MediaFormat mediaFormat, dc0 dc0Var, MediaCrypto mediaCrypto) {
            return new a(yu0Var, mediaFormat, dc0Var, null, mediaCrypto);
        }

        public static a a(yu0 yu0Var, MediaFormat mediaFormat, dc0 dc0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(yu0Var, mediaFormat, dc0Var, surface, mediaCrypto);
        }
    }

    public interface b {
        uu0 a(a aVar) throws IOException;
    }

    public interface c {
        void a(long j4);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    MediaFormat a();

    void a(int i);

    void a(int i, int i10, long j4, int i11);

    void a(int i, long j4);

    void a(int i, zu zuVar, long j4);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    void a(boolean z10, int i);

    int b();

    ByteBuffer b(int i);

    ByteBuffer c(int i);

    void flush();

    void release();
}
