package z6;

import N7.Ba;
import N7.X9;
import N7.Z;
import O6.A;
import android.view.View;
import android.view.ViewGroup;
import i7.C4460a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p9.l;

/* compiled from: DivPathUtils.kt */
/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5862a {

    /* compiled from: DivPathUtils.kt */
    /* renamed from: z6.a$a, reason: collision with other inner class name */
    public static final class C0564a extends m implements l<X9.a, Z> {

        /* renamed from: g, reason: collision with root package name */
        public static final C0564a f48454g = new C0564a(1);

        @Override // p9.l
        public final Z invoke(X9.a aVar) {
            X9.a it = aVar;
            kotlin.jvm.internal.l.f(it, "it");
            return it.f7747c;
        }
    }

    /* compiled from: DivPathUtils.kt */
    /* renamed from: z6.a$b */
    public static final class b extends m implements l<Ba.a, Z> {

        /* renamed from: g, reason: collision with root package name */
        public static final b f48455g = new b(1);

        @Override // p9.l
        public final Z invoke(Ba.a aVar) {
            Ba.a it = aVar;
            kotlin.jvm.internal.l.f(it, "it");
            return it.f4959a;
        }
    }

    public static Z a(Z z10, String str, A7.d dVar) {
        if (z10 instanceof Z.m) {
            Z.m mVar = (Z.m) z10;
            X9 x92 = mVar.f7825c;
            kotlin.jvm.internal.l.f(x92, "<this>");
            String str2 = x92.f7730l;
            if (str2 == null && (str2 = x92.f7735q) == null) {
                str2 = "";
            }
            if (!str2.equals(str)) {
                z10 = null;
            }
            Z.m mVar2 = (Z.m) z10;
            return mVar2 != null ? mVar2 : c(mVar.f7825c.f7743y, str, dVar, C0564a.f48454g);
        }
        if (z10 instanceof Z.o) {
            return c(((Z.o) z10).f7827c.f4949q, str, dVar, b.f48455g);
        }
        if (z10 instanceof Z.a) {
            return b(C4460a.b(((Z.a) z10).f7813c, dVar), str);
        }
        boolean z11 = z10 instanceof Z.e;
        C5863b c5863b = C5863b.f48456g;
        if (z11) {
            return c(C4460a.i(((Z.e) z10).f7817c), str, dVar, c5863b);
        }
        if (z10 instanceof Z.c) {
            return b(C4460a.c(((Z.c) z10).f7815c, dVar), str);
        }
        if (z10 instanceof Z.i) {
            return b(C4460a.d(((Z.i) z10).f7821c, dVar), str);
        }
        if (z10 instanceof Z.b) {
            List<Z> list = ((Z.b) z10).f7814c.f6139q;
            if (list != null) {
                return c(list, str, dVar, c5863b);
            }
            return null;
        }
        if ((z10 instanceof Z.p) || (z10 instanceof Z.f) || (z10 instanceof Z.l) || (z10 instanceof Z.h) || (z10 instanceof Z.d) || (z10 instanceof Z.g) || (z10 instanceof Z.k) || (z10 instanceof Z.j) || (z10 instanceof Z.q) || (z10 instanceof Z.n)) {
            return null;
        }
        throw new b9.j();
    }

    public static Z b(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            i7.b bVar = (i7.b) it.next();
            Z zA = a(bVar.f38460a, str, bVar.f38461b);
            if (zA != null) {
                return zA;
            }
        }
        return null;
    }

    public static Z c(Iterable iterable, String str, A7.d dVar, l lVar) {
        Z zA;
        Iterator it = iterable.iterator();
        do {
            zA = null;
            if (!it.hasNext()) {
                break;
            }
            Z z10 = (Z) lVar.invoke(it.next());
            if (z10 != null) {
                zA = a(z10, str, dVar);
            }
        } while (zA == null);
        return zA;
    }

    public static A d(View view, C5865d path) throws i {
        kotlin.jvm.internal.l.f(view, "<this>");
        kotlin.jvm.internal.l.f(path, "path");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof A) {
            A a10 = (A) view;
            C5865d path2 = a10.getPath();
            if (kotlin.jvm.internal.l.b(path2 != null ? path2.c() : null, path.c())) {
                return a10;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        A a11 = null;
        while (true) {
            if (!(i < viewGroup.getChildCount())) {
                return a11;
            }
            int i10 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            A aD = d(childAt, path);
            if (aD != null) {
                if (String.valueOf(a11 != null ? a11.getPath() : null).equals(String.valueOf(aD.getPath()))) {
                    String message = "Error resolving state for '" + path + "'. Found multiple elements that respond to path '" + aD.getPath() + "'!";
                    kotlin.jvm.internal.l.f(message, "message");
                    throw new i(message, null);
                }
                a11 = aD;
            }
            i = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r7 != null) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b9.l e(android.view.View r7, N7.U3.a r8, z6.C5865d r9, A7.d r10) throws z6.i {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.l.f(r8, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "resolver"
            kotlin.jvm.internal.l.f(r10, r0)
            O6.A r0 = d(r7, r9)
            r1 = 0
            if (r0 != 0) goto L32
            z6.d r2 = r9.d()
            java.util.List<b9.l<java.lang.String, java.lang.String>> r3 = r2.f48459b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2b
            long r3 = r8.f6383b
            long r5 = r9.f48458a
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L2b
            goto L6d
        L2b:
            O6.A r7 = d(r7, r2)
            if (r7 != 0) goto L32
            goto L6d
        L32:
            if (r0 == 0) goto L3a
            N7.Z$m r7 = r0.getDiv()
            if (r7 != 0) goto L6e
        L3a:
            N7.Z r7 = r8.f6382a
            java.util.List<b9.l<java.lang.String, java.lang.String>> r8 = r9.f48459b
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L46
        L44:
            r7 = r1
            goto L63
        L46:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L4c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L63
            java.lang.Object r9 = r8.next()
            b9.l r9 = (b9.l) r9
            A r9 = r9.f18083b
            java.lang.String r9 = (java.lang.String) r9
            N7.Z r7 = a(r7, r9, r10)
            if (r7 != 0) goto L4c
            goto L44
        L63:
            boolean r8 = r7 instanceof N7.Z.m
            if (r8 == 0) goto L6a
            N7.Z$m r7 = (N7.Z.m) r7
            goto L6b
        L6a:
            r7 = r1
        L6b:
            if (r7 != 0) goto L6e
        L6d:
            return r1
        L6e:
            b9.l r8 = new b9.l
            r8.<init>(r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.C5862a.e(android.view.View, N7.U3$a, z6.d, A7.d):b9.l");
    }
}
