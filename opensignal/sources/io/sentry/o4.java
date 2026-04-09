package io.sentry;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f12458b;

    public /* synthetic */ o4(t tVar, int i10) {
        this.f12457a = i10;
        this.f12458b = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12457a) {
            case 0:
                return Integer.valueOf(this.f12458b.D().length);
            case 1:
                return this.f12458b.D();
            case 2:
                return Integer.valueOf(this.f12458b.D().length);
            case 3:
                return this.f12458b.D();
            case 4:
                return Integer.valueOf(this.f12458b.D().length);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return this.f12458b.D();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(this.f12458b.D().length);
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(this.f12458b.D().length);
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return this.f12458b.D();
            case 9:
                return Integer.valueOf(this.f12458b.D().length);
            case 10:
                return this.f12458b.D();
            case 11:
                return this.f12458b.D();
            case 12:
                return Integer.valueOf(this.f12458b.D().length);
            case 13:
                return this.f12458b.D();
            case 14:
                return Integer.valueOf(this.f12458b.D().length);
            default:
                return this.f12458b.D();
        }
    }
}
