package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import sh.AbstractC7978m;
import sh.C7974i;

/* loaded from: classes4.dex */
public abstract class q {
    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6518l e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new C6519m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC6518l f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new C6519m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7974i g(MatchResult matchResult) {
        return AbstractC7978m.s(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C7974i h(MatchResult matchResult, int i10) {
        return AbstractC7978m.s(matchResult.start(i10), matchResult.end(i10));
    }
}
