package com.google.android.exoplayer2;

import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements ne.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4793a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4794d;

    public /* synthetic */ z(int i10, Object obj) {
        this.f4793a = i10;
        this.f4794d = obj;
    }

    @Override // ne.n
    public final Object get() {
        switch (this.f4793a) {
            case 0:
                return Boolean.valueOf(((f0) this.f4794d).T);
            case 1:
                return (d5.e) this.f4794d;
            case 2:
                return this.f4794d;
            case 3:
                return (DefaultTrackSelector) this.f4794d;
            case 4:
                return Boolean.valueOf(((d5.e0) this.f4794d).U);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(((AtomicBoolean) this.f4794d).get());
            default:
                try {
                    return (o5.y) ((Class) this.f4794d).getConstructor(null).newInstance(null);
                } catch (Exception e4) {
                    throw new IllegalStateException(e4);
                }
        }
    }
}
