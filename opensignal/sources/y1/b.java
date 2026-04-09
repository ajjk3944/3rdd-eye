package y1;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class b extends i.x {

    /* renamed from: e, reason: collision with root package name */
    public static b f25629e;

    /* renamed from: f, reason: collision with root package name */
    public static b f25630f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25631c;

    /* renamed from: d, reason: collision with root package name */
    public BreakIterator f25632d;

    @Override // i.x
    public final int[] e(int i10) {
        switch (this.f25631c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f25632d;
                    if (breakIterator == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f25632d;
                        if (breakIterator2 == null) {
                            br.l.l("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f25632d;
                    if (breakIterator3 == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            default:
                if (i().length() <= 0 || i10 >= i().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!o(i10) && (!o(i10) || (i10 != 0 && o(i10 - 1)))) {
                    BreakIterator breakIterator4 = this.f25632d;
                    if (breakIterator4 == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f25632d;
                if (breakIterator5 == null) {
                    br.l.l("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !n(iFollowing2)) {
                    return null;
                }
                return h(i10, iFollowing2);
        }
    }

    @Override // i.x
    public final int[] k(int i10) {
        switch (this.f25631c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f25632d;
                    if (breakIterator == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f25632d;
                        if (breakIterator2 == null) {
                            br.l.l("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f25632d;
                    if (breakIterator3 == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            default:
                int length2 = i().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !o(i10 - 1) && !n(i10)) {
                    BreakIterator breakIterator4 = this.f25632d;
                    if (breakIterator4 == null) {
                        br.l.l("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f25632d;
                if (breakIterator5 == null) {
                    br.l.l("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !o(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !o(iPreceding2 - 1)) {
                    return h(iPreceding2, i10);
                }
                return null;
        }
    }

    public final void m(String str) {
        switch (this.f25631c) {
            case 0:
                this.f11119a = str;
                BreakIterator breakIterator = this.f25632d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    br.l.l("impl");
                    throw null;
                }
            default:
                this.f11119a = str;
                BreakIterator breakIterator2 = this.f25632d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    br.l.l("impl");
                    throw null;
                }
        }
    }

    public boolean n(int i10) {
        if (i10 <= 0 || !o(i10 - 1)) {
            return false;
        }
        return i10 == i().length() || !o(i10);
    }

    public boolean o(int i10) {
        if (i10 < 0 || i10 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i10));
    }
}
