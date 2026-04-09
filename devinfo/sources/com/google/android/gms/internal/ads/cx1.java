package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public interface cx1 {
    void B1();

    void D1();

    void H1();

    ByteBuffer a(int i4);

    void b(ArrayList arrayList);

    int c();

    void d(Bundle bundle);

    MediaFormat e();

    void f(Surface surface);

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(int i4);

    void i(int i4, bp1 bp1Var, long j, int i10);

    boolean j(kh0 kh0Var);

    void k(int i4, int i10, long j, int i11);

    void l(int i4, long j);

    void m(uh0 uh0Var);

    ByteBuffer n(int i4);

    void p(int i4);
}
