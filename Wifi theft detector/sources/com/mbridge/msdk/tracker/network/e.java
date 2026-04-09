package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes3.dex */
public class e implements x {

    /* renamed from: a, reason: collision with root package name */
    private int f18292a;

    /* renamed from: b, reason: collision with root package name */
    private long f18293b;

    /* renamed from: c, reason: collision with root package name */
    private int f18294c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18295d;

    public e() {
        this(2500, 1);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public long a() {
        return this.f18293b;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int b() {
        return this.f18292a;
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public int c() {
        return this.f18294c;
    }

    public e(int i10, int i11) {
        this(i10, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, i11);
    }

    @Override // com.mbridge.msdk.tracker.network.x
    public boolean a(b0 b0Var) {
        int i10 = this.f18294c + 1;
        this.f18294c = i10;
        return i10 <= this.f18295d;
    }

    public e(int i10, long j10, int i11) {
        this.f18293b = j10;
        this.f18292a = i10;
        this.f18295d = i11;
    }
}
