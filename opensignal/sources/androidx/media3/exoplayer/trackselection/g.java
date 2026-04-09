package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.content.Intent;
import androidx.media3.common.b1;
import io.sentry.android.core.u0;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements r, dd.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1891a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1892d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1893g;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10) {
        this.f1892d = obj;
        this.f1893g = obj2;
        this.f1891a = z10;
    }

    @Override // androidx.media3.exoplayer.trackselection.r
    public List b(int i10, b1 b1Var, int[] iArr) {
        return ((DefaultTrackSelector) this.f1892d).lambda$selectAudioTrack$3((l) this.f1893g, this.f1891a, i10, b1Var, iArr);
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        return (gc.b.e() && ((Integer) rVar.h()).intValue() == 402) ? kg.i.a((Context) this.f1892d, (Intent) this.f1893g, this.f1891a).e(new e7.d(0), new u0(11)) : rVar;
    }
}
