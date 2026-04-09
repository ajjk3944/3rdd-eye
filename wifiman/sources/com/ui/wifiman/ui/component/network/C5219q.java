package com.ui.wifiman.ui.component.network;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;
import s9.InterfaceC7929a;
import z.InterfaceC8683f;

/* renamed from: com.ui.wifiman.ui.component.network.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5219q {

    /* renamed from: a, reason: collision with root package name */
    public static final C5219q f44518a = new C5219q();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.ui.component.network.q$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a WIRED = new a("WIRED", 0);
        public static final a WIRELESS = new a("WIRELESS", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{WIRED, WIRELESS};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* renamed from: com.ui.wifiman.ui.component.network.q$b */
    public interface b {
        InterfaceC7929a a();

        s9.d b();

        String getId();

        s9.d getTitle();
    }

    /* renamed from: com.ui.wifiman.ui.component.network.q$c */
    public interface c {
        List a();

        b b();

        InterfaceC6839p c();
    }

    /* renamed from: com.ui.wifiman.ui.component.network.q$d */
    static final class d implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44519a = new d();

        d() {
        }

        public final float a(InterfaceC8683f interfaceC8683f, c it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(interfaceC8683f, "<this>");
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-22847058);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-22847058, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthMin>.<anonymous> (NetworkTopology.kt:114)");
            }
            float fJ = Y0.h.j(100);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return fJ;
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            return Y0.h.d(a((InterfaceC8683f) obj, (c) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue()));
        }
    }

    /* renamed from: com.ui.wifiman.ui.component.network.q$e */
    static final class e implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final e f44520a = new e();

        e() {
        }

        public final float a(InterfaceC8683f interfaceC8683f, c state, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(interfaceC8683f, "<this>");
            AbstractC6492s.i(state, "state");
            interfaceC3540l.U(-18399890);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-18399890, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthSplit>.<anonymous> (NetworkTopology.kt:105)");
            }
            float fJ = Y0.h.j(Y0.h.j(interfaceC8683f.b() - Y0.h.j(((Y0.h) interfaceC3540l.t(B.f44301a)).s() * 2)) / C5219q.f44518a.e(state));
            if (Y0.h.h(fJ, Y0.h.j(0)) < 0) {
                fJ = Y0.h.j(100);
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return fJ;
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            return Y0.h.d(a((InterfaceC8683f) obj, (c) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue()));
        }
    }

    /* renamed from: com.ui.wifiman.ui.component.network.q$f */
    static final class f implements mh.r {

        /* renamed from: a, reason: collision with root package name */
        public static final f f44521a = new f();

        f() {
        }

        public final float a(InterfaceC8683f interfaceC8683f, c state, InterfaceC3540l interfaceC3540l, int i10) {
            float fS;
            AbstractC6492s.i(interfaceC8683f, "<this>");
            AbstractC6492s.i(state, "state");
            interfaceC3540l.U(1026841722);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1026841722, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.<get-itemWidthSplitIfSpace>.<anonymous> (NetworkTopology.kt:118)");
            }
            C5219q c5219q = C5219q.f44518a;
            if (c5219q.f(interfaceC8683f, state, interfaceC3540l, (i10 & 14) | 384 | (i10 & 112))) {
                interfaceC3540l.U(-654429241);
                fS = ((Y0.h) c5219q.a().y(interfaceC8683f, state, interfaceC3540l, Integer.valueOf(i10 & 126))).s();
                interfaceC3540l.J();
            } else {
                interfaceC3540l.U(-654487707);
                fS = ((Y0.h) c5219q.b().y(interfaceC8683f, state, interfaceC3540l, Integer.valueOf(i10 & 126))).s();
                interfaceC3540l.J();
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return fS;
        }

        @Override // mh.r
        public /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3, Object obj4) {
            return Y0.h.d(a((InterfaceC8683f) obj, (c) obj2, (InterfaceC3540l) obj3, ((Number) obj4).intValue()));
        }
    }

    private C5219q() {
    }

    public final mh.r a() {
        return d.f44519a;
    }

    public final mh.r b() {
        return e.f44520a;
    }

    public final mh.r c() {
        return f.f44521a;
    }

    public final int d(InterfaceC8683f interfaceC8683f, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(interfaceC8683f, "<this>");
        interfaceC3540l.U(-738551481);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-738551481, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.getMaxVisibleItemCount (NetworkTopology.kt:101)");
        }
        int iFloor = (int) Math.floor((interfaceC8683f.b() - Y0.h.j(((Y0.h) interfaceC3540l.t(B.f44301a)).s() * 2)) / Y0.h.j(100));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return iFloor;
    }

    public final int e(c cVar) {
        AbstractC6492s.i(cVar, "<this>");
        return cVar.a().size() + 1;
    }

    public final boolean f(InterfaceC8683f interfaceC8683f, c state, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(interfaceC8683f, "<this>");
        AbstractC6492s.i(state, "state");
        interfaceC3540l.U(-784213728);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-784213728, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.isTopologyExpandable (NetworkTopology.kt:93)");
        }
        boolean z10 = d(interfaceC8683f, interfaceC3540l, ((i10 >> 3) & 112) | (i10 & 14)) < e(state);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z10;
    }

    public final int g(InterfaceC8683f interfaceC8683f, c state, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(interfaceC8683f, "<this>");
        AbstractC6492s.i(state, "state");
        interfaceC3540l.U(1738812676);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1738812676, i10, -1, "com.ui.wifiman.ui.component.network.NetworkTopology.visibleItemCount (NetworkTopology.kt:97)");
        }
        int iMax = Math.max(0, Math.min(d(interfaceC8683f, interfaceC3540l, ((i10 >> 3) & 112) | (i10 & 14)), e(state)));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return iMax;
    }
}
