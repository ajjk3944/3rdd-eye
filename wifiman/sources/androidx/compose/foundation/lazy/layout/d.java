package androidx.compose.foundation.lazy.layout;

import B.L;
import B.N;
import B.Q;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Q f28317a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f28318b;

    /* renamed from: c, reason: collision with root package name */
    private final N f28319c;

    /* renamed from: d, reason: collision with root package name */
    private h f28320d;

    private final class a implements L {

        /* renamed from: a, reason: collision with root package name */
        private final List f28321a = new ArrayList();

        public a() {
        }

        @Override // B.L
        public void a(int i10) {
            c(i10, e.f28323a);
        }

        public final List b() {
            return this.f28321a;
        }

        public void c(int i10, long j10) {
            h hVarC = d.this.c();
            if (hVarC == null) {
                return;
            }
            this.f28321a.add(hVarC.c(i10, j10, d.this.f28319c));
        }
    }

    public interface b {
        void b();

        void cancel();
    }

    public d(Q q10, InterfaceC6835l interfaceC6835l) {
        this.f28317a = q10;
        this.f28318b = interfaceC6835l;
        this.f28319c = new N();
    }

    public final List b() {
        InterfaceC6835l interfaceC6835l = this.f28318b;
        if (interfaceC6835l == null) {
            return AbstractC3689v.l();
        }
        a aVar = new a();
        interfaceC6835l.invoke(aVar);
        return aVar.b();
    }

    public final h c() {
        return this.f28320d;
    }

    public final Q d() {
        return this.f28317a;
    }

    public final b e(int i10, long j10) {
        b bVarD;
        h hVar = this.f28320d;
        return (hVar == null || (bVarD = hVar.d(i10, j10, this.f28319c)) == null) ? androidx.compose.foundation.lazy.layout.a.f28263a : bVarD;
    }

    public final void f(h hVar) {
        this.f28320d = hVar;
    }

    public /* synthetic */ d(Q q10, InterfaceC6835l interfaceC6835l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : q10, (i10 & 2) != 0 ? null : interfaceC6835l);
    }
}
