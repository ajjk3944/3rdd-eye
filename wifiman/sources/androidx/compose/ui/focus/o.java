package androidx.compose.ui.focus;

import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final a f28853b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final o f28854c = new o();

    /* renamed from: d, reason: collision with root package name */
    private static final o f28855d = new o();

    /* renamed from: a, reason: collision with root package name */
    private final V.b f28856a = new V.b(new k0.k[16], 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.f28855d;
        }

        public final o b() {
            return o.f28854c;
        }

        private a() {
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28857a = new b();

        b() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(s.j(focusTargetNode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x005d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(mh.InterfaceC6835l r18) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.o.c(mh.l):boolean");
    }

    public final boolean d() {
        return c(b.f28857a);
    }

    public final V.b e() {
        return this.f28856a;
    }

    public final void f() {
        d();
    }
}
