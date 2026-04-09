package androidx.emoji2.text;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {
        @NonNull
        @DoNotInline
        public static Set<int[]> a() {
            return b.a();
        }
    }

    public static class b {
        public static Set a() {
            try {
                Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
                if (objInvoke == null) {
                    return Collections.EMPTY_SET;
                }
                Set set = (Set) objInvoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.EMPTY_SET;
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.EMPTY_SET;
            }
        }
    }

    public static Set a() {
        return Build.VERSION.SDK_INT >= 34 ? a.a() : b.a();
    }
}
