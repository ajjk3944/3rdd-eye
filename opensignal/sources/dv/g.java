package dv;

import br.l;
import cv.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final w f7606a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7608c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7609d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7610e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7611f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7612g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7613h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7614i;
    public final int j;
    public final Long k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f7615l;

    /* renamed from: m, reason: collision with root package name */
    public final Long f7616m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f7617n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f7618o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f7619p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f7620q;

    public g(w wVar, boolean z10, String str, long j, long j7, long j10, int i10, long j11, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        l.e(wVar, "canonicalPath");
        l.e(str, "comment");
        this.f7606a = wVar;
        this.f7607b = z10;
        this.f7608c = str;
        this.f7609d = j;
        this.f7610e = j7;
        this.f7611f = j10;
        this.f7612g = i10;
        this.f7613h = j11;
        this.f7614i = i11;
        this.j = i12;
        this.k = l10;
        this.f7615l = l11;
        this.f7616m = l12;
        this.f7617n = num;
        this.f7618o = num2;
        this.f7619p = num3;
        this.f7620q = new ArrayList();
    }

    public /* synthetic */ g(w wVar, boolean z10, String str, long j, long j7, long j10, int i10, long j11, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(wVar, z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j, (i13 & 16) != 0 ? -1L : j7, (i13 & 32) != 0 ? -1L : j10, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j11, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
