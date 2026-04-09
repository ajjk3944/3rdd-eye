package com.google.android.exoplayer2.source.dash.manifest;

import cb.b;
import cb.e;
import cb.i;
import cb.k;
import cb.l;
import cb.m;
import cb.q;
import cb.r;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import java.util.Collections;
import java.util.List;
import oe.h0;
import qb.v;

/* loaded from: classes.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final h0 baseUrls;
    public final Format format;
    public final List<e> inbandEventStreams;
    private final i initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    public static Representation newInstance(long j, Format format, List<b> list, r rVar) {
        return newInstance(j, format, list, rVar, null);
    }

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract i getIndexUri();

    public i getInitializationUri() {
        return this.initializationUri;
    }

    private Representation(long j, Format format, List<b> list, r rVar, List<e> list2) {
        qb.b.g(!list.isEmpty());
        this.revisionId = j;
        this.format = format;
        this.baseUrls = h0.l(list);
        this.inbandEventStreams = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.initializationUri = rVar.a(this);
        this.presentationTimeOffsetUs = v.H(rVar.f3589c, 1000000L, rVar.f3588b);
    }

    public static Representation newInstance(long j, Format format, List<b> list, r rVar, List<e> list2) {
        return newInstance(j, format, list, rVar, list2, null);
    }

    public static Representation newInstance(long j, Format format, List<b> list, r rVar, List<e> list2, String str) {
        if (rVar instanceof q) {
            return new l(j, format, list, (q) rVar, list2, str);
        }
        if (rVar instanceof m) {
            return new k(j, format, list, (m) rVar, list2);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
