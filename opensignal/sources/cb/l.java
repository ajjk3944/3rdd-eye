package cb;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends Representation {

    /* renamed from: a, reason: collision with root package name */
    public final String f3573a;

    /* renamed from: d, reason: collision with root package name */
    public final i f3574d;

    /* renamed from: g, reason: collision with root package name */
    public final b9.e f3575g;

    public l(long j, Format format, List list, q qVar, List list2, String str) {
        super(j, format, list, qVar, list2);
        Uri.parse(((b) list.get(0)).f3530a);
        long j7 = qVar.f3586e;
        i iVar = j7 <= 0 ? null : new i(null, qVar.f3585d, j7);
        this.f3574d = iVar;
        this.f3573a = str;
        this.f3575g = iVar == null ? new b9.e(8, new i(null, 0L, -1L)) : null;
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final String getCacheKey() {
        return this.f3573a;
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final DashSegmentIndex getIndex() {
        return this.f3575g;
    }

    @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
    public final i getIndexUri() {
        return this.f3574d;
    }
}
