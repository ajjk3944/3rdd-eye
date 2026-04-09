package c3;

import e3.AbstractC5419d;
import e3.InterfaceC5417b;
import java.util.concurrent.Executor;

/* renamed from: c3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4210k implements InterfaceC5417b {

    /* renamed from: c3.k$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C4210k f33812a = new C4210k();
    }

    public static C4210k a() {
        return a.f33812a;
    }

    public static Executor b() {
        return (Executor) AbstractC5419d.d(AbstractC4209j.a());
    }

    @Override // Jg.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
