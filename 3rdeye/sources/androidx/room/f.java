package androidx.room;

import androidx.room.c;
import c9.C2079C;
import c9.C2101v;
import java.util.Set;
import kotlin.jvm.internal.l;

/* compiled from: InvalidationTracker.android.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c.a f16818a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f16819b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f16820c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<String> f16821d;

    public f(c.a observer, int[] iArr, String[] strArr) {
        l.f(observer, "observer");
        this.f16818a = observer;
        this.f16819b = iArr;
        this.f16820c = strArr;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.f16821d = strArr.length == 0 ? C2101v.f18583b : C2079C.d(strArr[0]);
    }
}
