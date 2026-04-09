package com.applovin.shadow.okio;

import java.util.Arrays;
import nk.f;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;
    public final byte[] data;
    public int limit;
    public Segment next;
    public boolean owner;
    public int pos;
    public Segment prev;
    public boolean shared;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public Segment() {
        this.data = new byte[SIZE];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i4;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        k.b(segment);
        if (segment.owner) {
            int i10 = this.limit - this.pos;
            Segment segment2 = this.prev;
            k.b(segment2);
            int i11 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            k.b(segment3);
            if (segment3.shared) {
                i4 = 0;
            } else {
                Segment segment4 = this.prev;
                k.b(segment4);
                i4 = segment4.pos;
            }
            if (i10 > i11 + i4) {
                return;
            }
            Segment segment5 = this.prev;
            k.b(segment5);
            writeTo(segment5, i10);
            pop();
            SegmentPool.recycle(this);
        }
    }

    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        k.b(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        k.b(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        k.e(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        k.b(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    public final Segment split(int i4) {
        Segment segmentTake;
        if (i4 <= 0 || i4 > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i4 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i10 = this.pos;
            m.O(bArr, 0, bArr2, i10, i10 + i4);
        }
        segmentTake.limit = segmentTake.pos + i4;
        this.pos += i4;
        Segment segment = this.prev;
        k.b(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        k.d(bArrCopyOf, "copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(Segment segment, int i4) {
        k.e(segment, "sink");
        if (!segment.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i10 = segment.limit;
        int i11 = i10 + i4;
        if (i11 > 8192) {
            if (segment.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = segment.pos;
            if (i11 - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = segment.data;
            m.O(bArr, 0, bArr, i12, i10);
            segment.limit -= segment.pos;
            segment.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = segment.data;
        int i13 = segment.limit;
        int i14 = this.pos;
        m.O(bArr2, i13, bArr3, i14, i14 + i4);
        segment.limit += i4;
        this.pos += i4;
    }

    public Segment(byte[] bArr, int i4, int i10, boolean z3, boolean z10) {
        k.e(bArr, "data");
        this.data = bArr;
        this.pos = i4;
        this.limit = i10;
        this.shared = z3;
        this.owner = z10;
    }
}
