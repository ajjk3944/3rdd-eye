package zc;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class w1 implements Runnable {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ d2 D;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27252a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27253d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f27254g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f27255r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f27256x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f27257y;

    public w1(d2 d2Var, String str, String str2, long j, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f27252a = str;
        this.f27253d = str2;
        this.f27254g = j;
        this.f27255r = bundle;
        this.f27256x = z10;
        this.f27257y = z11;
        this.B = z12;
        this.D = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.D.B1(this.f27252a, this.f27253d, this.f27254g, this.f27255r, this.f27256x, this.f27257y, this.B);
    }
}
