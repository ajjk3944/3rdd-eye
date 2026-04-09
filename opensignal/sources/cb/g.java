package cb;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final List f3561c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3562d;

    public g(String str, long j, List list, List list2) {
        this.f3559a = str;
        this.f3560b = j;
        this.f3561c = Collections.unmodifiableList(list);
        this.f3562d = Collections.unmodifiableList(list2);
    }
}
