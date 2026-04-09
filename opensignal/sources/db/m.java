package db;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m implements xa.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7257a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7258b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7259c;

    public m(String str, List list, boolean z10) {
        this.f7257a = str;
        this.f7258b = Collections.unmodifiableList(list);
        this.f7259c = z10;
    }
}
