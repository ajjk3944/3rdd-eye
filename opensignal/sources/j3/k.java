package j3;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13193a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f13194b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f13195c = new Object();

    public static Typeface a(Context context, int i10) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i10, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r12, int r13, android.util.TypedValue r14, int r15, j3.b r16, boolean r17, boolean r18) throws java.lang.InterruptedException, android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.k.b(android.content.Context, int, android.util.TypedValue, int, j3.b, boolean, boolean):android.graphics.Typeface");
    }
}
