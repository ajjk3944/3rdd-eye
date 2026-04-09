package k5;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements n5.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14098a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14099b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14100c;

    public m(String str, List list, boolean z10) {
        this.f14098a = str;
        this.f14099b = Collections.unmodifiableList(list);
        this.f14100c = z10;
    }
}
