package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3922h extends AbstractC3904b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29386d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f29387e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static C3922h f29388f;

    /* renamed from: c, reason: collision with root package name */
    private BreakIterator f29389c;

    /* renamed from: androidx.compose.ui.platform.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3922h a(Locale locale) {
            if (C3922h.f29388f == null) {
                C3922h.f29388f = new C3922h(locale, null);
            }
            C3922h c3922h = C3922h.f29388f;
            AbstractC6492s.g(c3922h, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
            return c3922h;
        }

        private a() {
        }
    }

    public /* synthetic */ C3922h(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final boolean i(int i10) {
        return i10 > 0 && j(i10 + (-1)) && (i10 == d().length() || !j(i10));
    }

    private final boolean j(int i10) {
        if (i10 < 0 || i10 >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i10));
    }

    private final boolean k(int i10) {
        return j(i10) && (i10 == 0 || !j(i10 - 1));
    }

    private final void l(Locale locale) {
        this.f29389c = BreakIterator.getWordInstance(locale);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] a(int i10) {
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!j(i10) && !k(i10)) {
            BreakIterator breakIterator = this.f29389c;
            if (breakIterator == null) {
                AbstractC6492s.v("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f29389c;
        if (breakIterator2 == null) {
            AbstractC6492s.v("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !i(iFollowing)) {
            return null;
        }
        return c(i10, iFollowing);
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
        while (i10 > 0 && !j(i10 - 1) && !i(i10)) {
            BreakIterator breakIterator = this.f29389c;
            if (breakIterator == null) {
                AbstractC6492s.v("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f29389c;
        if (breakIterator2 == null) {
            AbstractC6492s.v("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !k(iPreceding)) {
            return null;
        }
        return c(iPreceding, i10);
    }

    @Override // androidx.compose.ui.platform.AbstractC3904b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f29389c;
        if (breakIterator == null) {
            AbstractC6492s.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C3922h(Locale locale) {
        l(locale);
    }
}
