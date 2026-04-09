package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultHlsExtractorFactory f4489a = new DefaultHlsExtractorFactory();

    n createExtractor(Uri uri, Format format, List list, qb.u uVar, Map map, ca.l lVar);
}
