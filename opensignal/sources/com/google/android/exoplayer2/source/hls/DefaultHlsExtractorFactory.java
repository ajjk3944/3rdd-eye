package com.google.android.exoplayer2.source.hls;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lf.t1;
import ma.d0;

/* loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements k {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = {8, 13, 11, 2, 0, 1, 7};
    private final boolean exposeCea608WhenMissingDeclarations;
    private final int payloadReaderFactoryFlags;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    private static void addFileTypeIfValidAndNotPresent(int i10, List<Integer> list) {
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        if (t1.w(iArr, i10, 0, iArr.length) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    @SuppressLint({"SwitchIntDef"})
    private ca.k createExtractorByFileType(int i10, Format format, List<Format> list, qb.u uVar) {
        if (i10 == 0) {
            return new ma.a();
        }
        if (i10 == 1) {
            return new ma.c();
        }
        if (i10 == 2) {
            return new ma.d(0);
        }
        if (i10 == 7) {
            return new ia.c(0L);
        }
        if (i10 == 8) {
            return createFragmentedMp4Extractor(uVar, format, list);
        }
        if (i10 == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, uVar);
        }
        if (i10 != 13) {
            return null;
        }
        return new x(format.f4024g, uVar);
    }

    private static ja.i createFragmentedMp4Extractor(qb.u uVar, Format format, List<Format> list) {
        int i10 = isFmp4Variant(format) ? 4 : 0;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new ja.i(i10, uVar, list, null);
    }

    private static d0 createTsExtractor(int i10, boolean z10, Format format, List<Format> list, qb.u uVar) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 = i10 | 48;
        } else if (z10) {
            g0 g0Var = new g0();
            g0Var.k = "application/cea-608";
            list = Collections.singletonList(new Format(g0Var));
        } else {
            list = Collections.EMPTY_LIST;
        }
        String str = format.E;
        if (!TextUtils.isEmpty(str)) {
            if (qb.m.a(str, "audio/mp4a-latm") == null) {
                i11 |= 2;
            }
            if (qb.m.a(str, "video/avc") == null) {
                i11 |= 4;
            }
        }
        return new d0(2, uVar, new ma.f(i11, 0, list));
    }

    private static boolean isFmp4Variant(Format format) {
        Metadata metadata = format.F;
        if (metadata == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f4241a;
            if (i10 >= entryArr.length) {
                return false;
            }
            if (entryArr[i10] instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).f4462g.isEmpty();
            }
            i10++;
        }
    }

    private static boolean sniffQuietly(ca.k kVar, ca.l lVar) throws IOException {
        try {
            boolean zG = kVar.g(lVar);
            lVar.l();
            return zG;
        } catch (EOFException unused) {
            lVar.l();
            return false;
        } catch (Throwable th2) {
            lVar.l();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public /* bridge */ /* synthetic */ n createExtractor(Uri uri, Format format, List list, qb.u uVar, Map map, ca.l lVar) throws IOException {
        return createExtractor(uri, format, (List<Format>) list, uVar, (Map<String, List<String>>) map, lVar);
    }

    public DefaultHlsExtractorFactory(int i10, boolean z10) {
        this.payloadReaderFactoryFlags = i10;
        this.exposeCea608WhenMissingDeclarations = z10;
    }

    @Override // com.google.android.exoplayer2.source.hls.k
    public b createExtractor(Uri uri, Format format, List<Format> list, qb.u uVar, Map<String, List<String>> map, ca.l lVar) throws IOException {
        int iW = qb.b.w(format.H);
        List<String> list2 = map.get("Content-Type");
        ca.k kVar = null;
        int iW2 = qb.b.w((list2 == null || list2.isEmpty()) ? null : list2.get(0));
        int iX = qb.b.x(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iW, arrayList);
        addFileTypeIfValidAndNotPresent(iW2, arrayList);
        addFileTypeIfValidAndNotPresent(iX, arrayList);
        for (int i10 : iArr) {
            addFileTypeIfValidAndNotPresent(i10, arrayList);
        }
        lVar.l();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            ca.k kVarCreateExtractorByFileType = createExtractorByFileType(iIntValue, format, list, uVar);
            kVarCreateExtractorByFileType.getClass();
            ca.k kVar2 = kVarCreateExtractorByFileType;
            if (sniffQuietly(kVar2, lVar)) {
                return new b(kVar2, format, uVar);
            }
            if (kVar == null && (iIntValue == iW || iIntValue == iW2 || iIntValue == iX || iIntValue == 11)) {
                kVar = kVar2;
            }
        }
        kVar.getClass();
        return new b(kVar, format, uVar);
    }
}
