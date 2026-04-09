package h5;

import android.net.Uri;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends l {
    public final a2.g B;

    /* renamed from: y, reason: collision with root package name */
    public final i f9946y;

    public k(androidx.media3.common.r rVar, List list, q qVar, ArrayList arrayList) {
        super(rVar, list, qVar, arrayList);
        Uri.parse(((b) list.get(0)).f9904a);
        long j = qVar.f9962e;
        i iVar = j <= 0 ? null : new i(null, qVar.f9961d, j);
        this.f9946y = iVar;
        this.B = iVar == null ? new a2.g(new i(null, 0L, -1L)) : null;
    }

    @Override // h5.l
    public final String a() {
        return null;
    }

    @Override // h5.l
    public final DashSegmentIndex b() {
        return this.B;
    }

    @Override // h5.l
    public final i c() {
        return this.f9946y;
    }
}
