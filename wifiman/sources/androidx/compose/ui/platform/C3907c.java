package androidx.compose.ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3907c extends AbstractC3904b {

    /* renamed from: d, reason: collision with root package name */
    public static final a f29335d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f29336e = 8;

    /* renamed from: f, reason: collision with root package name */
    private static C3907c f29337f;

    /* renamed from: c, reason: collision with root package name */
    private BreakIterator f29338c;

    /* renamed from: androidx.compose.ui.platform.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3907c a(Locale locale) {
            if (C3907c.f29337f == null) {
                C3907c.f29337f = new C3907c(locale, null);
            }
            C3907c c3907c = C3907c.f29337f;
            AbstractC6492s.g(c3907c, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
            return c3907c;
        }

        private a() {
        }
    }

    public /* synthetic */ C3907c(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale);
    }

    private final void i(Locale locale) {
        this.f29338c = BreakIterator.getCharacterInstance(locale);
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
        do {
            BreakIterator breakIterator = this.f29338c;
            if (breakIterator == null) {
                AbstractC6492s.v("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f29338c;
                if (breakIterator2 == null) {
                    AbstractC6492s.v("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i10, iFollowing);
            }
            BreakIterator breakIterator3 = this.f29338c;
            if (breakIterator3 == null) {
                AbstractC6492s.v("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f29338c;
            if (breakIterator == null) {
                AbstractC6492s.v("impl");
                breakIterator = null;
            }
            if (breakIterator.isBoundary(i10)) {
                BreakIterator breakIterator2 = this.f29338c;
                if (breakIterator2 == null) {
                    AbstractC6492s.v("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i10);
            }
            BreakIterator breakIterator3 = this.f29338c;
            if (breakIterator3 == null) {
                AbstractC6492s.v("impl");
                breakIterator3 = null;
            }
            i10 = breakIterator3.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractC3904b
    public void e(String str) {
        super.e(str);
        BreakIterator breakIterator = this.f29338c;
        if (breakIterator == null) {
            AbstractC6492s.v("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    private C3907c(Locale locale) {
        i(locale);
    }
}
