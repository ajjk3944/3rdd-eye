package com.google.android.exoplayer2;

import android.media.MediaFormat;

/* loaded from: classes.dex */
public final class q1 implements rb.l, sb.a, i1 {

    /* renamed from: a, reason: collision with root package name */
    public rb.l f4414a;

    /* renamed from: d, reason: collision with root package name */
    public sb.a f4415d;

    /* renamed from: g, reason: collision with root package name */
    public rb.l f4416g;

    /* renamed from: r, reason: collision with root package name */
    public sb.a f4417r;

    @Override // sb.a
    public final void a(long j, float[] fArr) {
        sb.a aVar = this.f4417r;
        if (aVar != null) {
            aVar.a(j, fArr);
        }
        sb.a aVar2 = this.f4415d;
        if (aVar2 != null) {
            aVar2.a(j, fArr);
        }
    }

    @Override // sb.a
    public final void b() {
        sb.a aVar = this.f4417r;
        if (aVar != null) {
            aVar.b();
        }
        sb.a aVar2 = this.f4415d;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // rb.l
    public final void c(long j, long j7, Format format, MediaFormat mediaFormat) {
        long j10;
        long j11;
        Format format2;
        MediaFormat mediaFormat2;
        rb.l lVar = this.f4416g;
        if (lVar != null) {
            lVar.c(j, j7, format, mediaFormat);
            mediaFormat2 = mediaFormat;
            format2 = format;
            j11 = j7;
            j10 = j;
        } else {
            j10 = j;
            j11 = j7;
            format2 = format;
            mediaFormat2 = mediaFormat;
        }
        rb.l lVar2 = this.f4414a;
        if (lVar2 != null) {
            lVar2.c(j10, j11, format2, mediaFormat2);
        }
    }

    @Override // com.google.android.exoplayer2.i1
    public final void e(int i10, Object obj) {
        if (i10 == 6) {
            this.f4414a = (rb.l) obj;
            return;
        }
        if (i10 == 7) {
            this.f4415d = (sb.a) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        sb.l lVar = (sb.l) obj;
        if (lVar == null) {
            this.f4416g = null;
            this.f4417r = null;
        } else {
            this.f4416g = lVar.getVideoFrameMetadataListener();
            this.f4417r = lVar.getCameraMotionListener();
        }
    }
}
