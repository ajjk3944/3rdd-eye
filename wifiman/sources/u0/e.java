package U0;

import L0.W;
import L0.Y;
import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class e {
    public static final TtsSpan a(W w10) {
        if (w10 instanceof Y) {
            return b((Y) w10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(Y y10) {
        return new TtsSpan.VerbatimBuilder(y10.a()).build();
    }
}
