package h5;

import a5.d0;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import java.util.Collections;
import java.util.List;
import oe.h0;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.r f9947a;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f9948d;

    /* renamed from: g, reason: collision with root package name */
    public final long f9949g;

    /* renamed from: r, reason: collision with root package name */
    public final List f9950r;

    /* renamed from: x, reason: collision with root package name */
    public final i f9951x;

    public l(androidx.media3.common.r rVar, List list, r rVar2, List list2) {
        a5.a.e(!list.isEmpty());
        this.f9947a = rVar;
        this.f9948d = h0.l(list);
        this.f9950r = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f9951x = rVar2.a(this);
        this.f9949g = d0.M(rVar2.f9965c, 1000000L, rVar2.f9964b);
    }

    public abstract String a();

    public abstract DashSegmentIndex b();

    public abstract i c();
}
