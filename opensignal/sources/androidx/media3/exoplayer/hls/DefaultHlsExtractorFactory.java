package androidx.media3.exoplayer.hls;

import a5.b0;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.Metadata;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import e5.o0;
import ir.f0;
import j5.b;
import j5.i;
import j5.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l6.h;
import lf.t1;
import ma.f;
import u5.k;
import u5.l;
import w6.c;
import w6.d;
import w6.u;

/* loaded from: classes.dex */
public final class DefaultHlsExtractorFactory implements i {
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
    private k createExtractorByFileType(int i10, r rVar, List<r> list, b0 b0Var) {
        if (i10 == 0) {
            return new w6.a();
        }
        if (i10 == 1) {
            return new c();
        }
        if (i10 == 2) {
            return new d(0);
        }
        if (i10 == 7) {
            return new k6.d(0L);
        }
        if (i10 == 8) {
            return createFragmentedMp4Extractor(b0Var, rVar, list);
        }
        if (i10 == 11) {
            return createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, rVar, list, b0Var);
        }
        if (i10 != 13) {
            return null;
        }
        return new t(rVar.f1786g, b0Var);
    }

    private static h createFragmentedMp4Extractor(b0 b0Var, r rVar, List<r> list) {
        int i10 = isFmp4Variant(rVar) ? 4 : 0;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new h(i10, b0Var, list, null);
    }

    private static u createTsExtractor(int i10, boolean z10, r rVar, List<r> list, b0 b0Var) {
        int i11 = i10 | 16;
        if (list != null) {
            i11 = i10 | 48;
        } else if (z10) {
            q qVar = new q();
            qVar.k = "application/cea-608";
            list = Collections.singletonList(new r(qVar));
        } else {
            list = Collections.EMPTY_LIST;
        }
        String str = rVar.E;
        if (!TextUtils.isEmpty(str)) {
            if (j0.a(str, "audio/mp4a-latm") == null) {
                i11 |= 2;
            }
            if (j0.a(str, "video/avc") == null) {
                i11 |= 4;
            }
        }
        return new u(2, b0Var, new f(i11, 2, list));
    }

    private static boolean isFmp4Variant(r rVar) {
        Metadata metadata = rVar.F;
        if (metadata == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f1549a;
            if (i10 >= entryArr.length) {
                return false;
            }
            if (entryArr[i10] instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) r2).f1850g.isEmpty();
            }
            i10++;
        }
    }

    private static boolean sniffQuietly(k kVar, l lVar) throws IOException {
        try {
            boolean zH = kVar.h(lVar);
            lVar.l();
            return zH;
        } catch (EOFException unused) {
            lVar.l();
            return false;
        } catch (Throwable th2) {
            lVar.l();
            throw th2;
        }
    }

    @Override // j5.i
    public /* bridge */ /* synthetic */ j5.l createExtractor(Uri uri, r rVar, List list, b0 b0Var, Map map, l lVar, o0 o0Var) throws IOException {
        return createExtractor(uri, rVar, (List<r>) list, b0Var, (Map<String, List<String>>) map, lVar, o0Var);
    }

    public DefaultHlsExtractorFactory(int i10, boolean z10) {
        this.payloadReaderFactoryFlags = i10;
        this.exposeCea608WhenMissingDeclarations = z10;
    }

    @Override // j5.i
    public b createExtractor(Uri uri, r rVar, List<r> list, b0 b0Var, Map<String, List<String>> map, l lVar, o0 o0Var) throws IOException {
        int iJ = f0.J(rVar.H);
        List<String> list2 = map.get("Content-Type");
        k kVar = null;
        int iJ2 = f0.J((list2 == null || list2.isEmpty()) ? null : list2.get(0));
        int iK = f0.K(uri);
        int[] iArr = DEFAULT_EXTRACTOR_ORDER;
        ArrayList arrayList = new ArrayList(iArr.length);
        addFileTypeIfValidAndNotPresent(iJ, arrayList);
        addFileTypeIfValidAndNotPresent(iJ2, arrayList);
        addFileTypeIfValidAndNotPresent(iK, arrayList);
        for (int i10 : iArr) {
            addFileTypeIfValidAndNotPresent(i10, arrayList);
        }
        lVar.l();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            k kVarCreateExtractorByFileType = createExtractorByFileType(iIntValue, rVar, list, b0Var);
            kVarCreateExtractorByFileType.getClass();
            k kVar2 = kVarCreateExtractorByFileType;
            if (sniffQuietly(kVar2, lVar)) {
                return new b(kVar2, rVar, b0Var);
            }
            if (kVar == null && (iIntValue == iJ || iIntValue == iJ2 || iIntValue == iK || iIntValue == 11)) {
                kVar = kVar2;
            }
        }
        kVar.getClass();
        return new b(kVar, rVar, b0Var);
    }
}
