package h2;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9880a;

    public u() {
        this.f9880a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f9880a == ((u) obj).f9880a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f9880a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f9880a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public u(boolean z10) {
        this.f9880a = z10;
    }
}
