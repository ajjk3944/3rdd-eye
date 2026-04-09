package N0;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f14872a;

    /* renamed from: b, reason: collision with root package name */
    private final BreakIterator f14873b;

    public e(CharSequence charSequence) {
        this.f14872a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f14873b = characterInstance;
    }

    @Override // N0.b
    public int e(int i10) {
        return this.f14873b.following(i10);
    }

    @Override // N0.b
    public int f(int i10) {
        return this.f14873b.preceding(i10);
    }
}
