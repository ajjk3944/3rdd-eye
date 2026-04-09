package h5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9899b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9900c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9901d;

    /* renamed from: e, reason: collision with root package name */
    public final List f9902e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9903f;

    public a(int i10, int i11, List list, List list2, List list3, List list4) {
        this.f9898a = i10;
        this.f9899b = i11;
        this.f9900c = Collections.unmodifiableList(list);
        this.f9901d = Collections.unmodifiableList(list2);
        this.f9902e = Collections.unmodifiableList(list3);
        this.f9903f = Collections.unmodifiableList(list4);
    }
}
