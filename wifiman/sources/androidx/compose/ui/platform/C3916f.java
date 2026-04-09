package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3916f extends AbstractC3904b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29363c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static C3916f f29364d;

    /* renamed from: androidx.compose.ui.platform.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3916f a() {
            if (C3916f.f29364d == null) {
                C3916f.f29364d = new C3916f(null);
            }
            C3916f c3916f = C3916f.f29364d;
            AbstractC6492s.g(c3916f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c3916f;
        }

        private a() {
        }
    }

    public /* synthetic */ C3916f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean i(int i10) {
        return i10 > 0 && d().charAt(i10 + (-1)) != '\n' && (i10 == d().length() || d().charAt(i10) == '\n');
    }

    private final boolean j(int i10) {
        return d().charAt(i10) != '\n' && (i10 == 0 || d().charAt(i10 - 1) == '\n');
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] a(int i10) {
        int length = d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && d().charAt(i10) == '\n' && !j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !i(i11)) {
            i11++;
        }
        return c(i10, i11);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] b(int i10) {
        int length = d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && d().charAt(i10 - 1) == '\n' && !i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !j(i11)) {
            i11--;
        }
        return c(i11, i10);
    }

    private C3916f() {
    }
}
