package N0;

import M0.C;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final a f14874e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f14875f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f14876a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14877b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14878c;

    /* renamed from: d, reason: collision with root package name */
    private final BreakIterator f14879d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i10) {
            int type = Character.getType(i10);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private a() {
        }
    }

    public i(CharSequence charSequence, int i10, int i11, Locale locale) {
        this.f14876a = charSequence;
        if (i10 < 0 || i10 > charSequence.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i11 < 0 || i11 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f14879d = wordInstance;
        this.f14877b = Math.max(0, i10 - 50);
        this.f14878c = Math.min(charSequence.length(), i11 + 50);
        wordInstance.setText(new C(charSequence, i10, i11));
    }

    private final void a(int i10) {
        int i11 = this.f14877b;
        if (i10 > this.f14878c || i11 > i10) {
            throw new IllegalArgumentException(("Invalid offset: " + i10 + ". Valid range is [" + this.f14877b + " , " + this.f14878c + ']').toString());
        }
    }

    private final int b(int i10, boolean z10) {
        a(i10);
        if (j(i10)) {
            return (!this.f14879d.isBoundary(i10) || (h(i10) && z10)) ? this.f14879d.preceding(i10) : i10;
        }
        if (h(i10)) {
            return this.f14879d.preceding(i10);
        }
        return -1;
    }

    private final int c(int i10, boolean z10) {
        a(i10);
        if (h(i10)) {
            return (!this.f14879d.isBoundary(i10) || (j(i10) && z10)) ? this.f14879d.following(i10) : i10;
        }
        if (j(i10)) {
            return this.f14879d.following(i10);
        }
        return -1;
    }

    private final boolean h(int i10) {
        return i10 <= this.f14878c && this.f14877b + 1 <= i10 && Character.isLetterOrDigit(Character.codePointBefore(this.f14876a, i10));
    }

    private final boolean j(int i10) {
        return i10 < this.f14878c && this.f14877b <= i10 && Character.isLetterOrDigit(Character.codePointAt(this.f14876a, i10));
    }

    private final boolean l(int i10) {
        return !k(i10) && i(i10);
    }

    private final boolean m(int i10) {
        return k(i10) && !i(i10);
    }

    public final int d(int i10) {
        return c(i10, true);
    }

    public final int e(int i10) {
        return b(i10, true);
    }

    public final int f(int i10) {
        a(i10);
        while (i10 != -1 && !m(i10)) {
            i10 = o(i10);
        }
        return i10;
    }

    public final int g(int i10) {
        a(i10);
        while (i10 != -1 && !l(i10)) {
            i10 = n(i10);
        }
        return i10;
    }

    public final boolean i(int i10) {
        int i11 = this.f14877b + 1;
        if (i10 > this.f14878c || i11 > i10) {
            return false;
        }
        return f14874e.a(Character.codePointBefore(this.f14876a, i10));
    }

    public final boolean k(int i10) {
        int i11 = this.f14877b;
        if (i10 >= this.f14878c || i11 > i10) {
            return false;
        }
        return f14874e.a(Character.codePointAt(this.f14876a, i10));
    }

    public final int n(int i10) {
        a(i10);
        return this.f14879d.following(i10);
    }

    public final int o(int i10) {
        a(i10);
        return this.f14879d.preceding(i10);
    }
}
