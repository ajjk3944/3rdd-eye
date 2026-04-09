package m2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: m2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6753k {

    /* renamed from: a, reason: collision with root package name */
    private final q f53032a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f53033b;

    public C6753k(q database) {
        AbstractC6492s.i(database, "database");
        this.f53032a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        AbstractC6492s.h(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f53033b = setNewSetFromMap;
    }
}
