package jc;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f13605b;

    public i(a aVar, int i10) {
        this.f13604a = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(aVar);
                this.f13605b = aVar;
                break;
            default:
                Objects.requireNonNull(aVar);
                this.f13605b = aVar;
                break;
        }
    }

    @Override // jc.j
    public final int a() {
        switch (this.f13604a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // jc.j
    public final void b() {
        switch (this.f13604a) {
            case 0:
                this.f13605b.f13586a.a();
                break;
            default:
                this.f13605b.f13586a.c();
                break;
        }
    }
}
