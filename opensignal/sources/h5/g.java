package h5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f9932a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9934c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9935d;

    public g(String str, long j, List list, List list2) {
        this.f9932a = str;
        this.f9933b = j;
        this.f9934c = Collections.unmodifiableList(list);
        this.f9935d = Collections.unmodifiableList(list2);
    }
}
