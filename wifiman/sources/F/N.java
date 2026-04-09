package F;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public abstract class N {
    public static final int a(String str, int i10) {
        androidx.emoji2.text.f fVarC = c();
        Integer num = null;
        if (fVarC != null) {
            Integer numValueOf = Integer.valueOf(fVarC.d(str, i10));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i10);
    }

    public static final int b(String str, int i10) {
        androidx.emoji2.text.f fVarC = c();
        Integer num = null;
        if (fVarC != null) {
            Integer numValueOf = Integer.valueOf(fVarC.f(str, Math.max(0, i10 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }

    private static final androidx.emoji2.text.f c() {
        if (!androidx.emoji2.text.f.k()) {
            return null;
        }
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.g() == 1) {
            return fVarC;
        }
        return null;
    }
}
