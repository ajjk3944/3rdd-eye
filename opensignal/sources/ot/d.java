package ot;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class d implements Iterable, cr.a {

    /* renamed from: a, reason: collision with root package name */
    public a f19796a;

    public final boolean isEmpty() {
        return this.f19796a.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f19796a.iterator();
    }
}
