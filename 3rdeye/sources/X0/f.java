package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: DataMigrationInitializer.kt */
@h9.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
/* loaded from: classes.dex */
public final class f<T> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Serializable f13430l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f13431m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f13432n;

    /* renamed from: o, reason: collision with root package name */
    public int f13433o;

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13432n = obj;
        this.f13433o |= RecyclerView.UNDEFINED_DURATION;
        return T1.B.b(null, null, this);
    }
}
