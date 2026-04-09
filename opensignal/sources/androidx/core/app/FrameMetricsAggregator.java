package androidx.core.app;

import a5.t;
import android.util.SparseIntArray;
import g3.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final t f1209a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i10) {
        t tVar = new t();
        tVar.f154b = new SparseIntArray[9];
        tVar.f155c = new ArrayList();
        tVar.f156d = new h(tVar);
        tVar.f153a = i10;
        this.f1209a = tVar;
    }
}
