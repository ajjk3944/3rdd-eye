package com.applovin.shadow.okhttp3.internal.http2;

import nk.f;
import nk.k;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Settings {
    public static final int COUNT = 10;
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_INITIAL_WINDOW_SIZE = 65535;
    public static final int ENABLE_PUSH = 2;
    public static final int HEADER_TABLE_SIZE = 1;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_FRAME_SIZE = 5;
    public static final int MAX_HEADER_LIST_SIZE = 6;
    private int set;
    private final int[] values = new int[10];

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private Companion() {
        }
    }

    public final void clear() {
        this.set = 0;
        m.V(0, this.values);
    }

    public final int get(int i4) {
        return this.values[i4];
    }

    public final boolean getEnablePush(boolean z3) {
        return (this.set & 4) != 0 ? this.values[2] == 1 : z3;
    }

    public final int getHeaderTableSize() {
        if ((this.set & 2) != 0) {
            return this.values[1];
        }
        return -1;
    }

    public final int getInitialWindowSize() {
        return (this.set & 128) != 0 ? this.values[7] : DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public final int getMaxConcurrentStreams() {
        if ((this.set & 16) != 0) {
            return this.values[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int getMaxFrameSize(int i4) {
        return (this.set & 32) != 0 ? this.values[5] : i4;
    }

    public final int getMaxHeaderListSize(int i4) {
        return (this.set & 64) != 0 ? this.values[6] : i4;
    }

    public final boolean isSet(int i4) {
        return ((1 << i4) & this.set) != 0;
    }

    public final void merge(Settings settings) {
        k.e(settings, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (settings.isSet(i4)) {
                set(i4, settings.get(i4));
            }
        }
    }

    public final Settings set(int i4, int i10) {
        if (i4 >= 0) {
            int[] iArr = this.values;
            if (i4 < iArr.length) {
                this.set = (1 << i4) | this.set;
                iArr[i4] = i10;
            }
        }
        return this;
    }

    public final int size() {
        return Integer.bitCount(this.set);
    }
}
