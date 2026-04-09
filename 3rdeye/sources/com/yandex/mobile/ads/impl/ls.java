package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ls<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    private final Object f30090b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f30091c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Set<E> f30092d = Collections.EMPTY_SET;

    /* renamed from: e, reason: collision with root package name */
    private List<E> f30093e = Collections.EMPTY_LIST;

    public final void a(E e4) {
        synchronized (this.f30090b) {
            try {
                ArrayList arrayList = new ArrayList(this.f30093e);
                arrayList.add(e4);
                this.f30093e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f30091c.get(e4);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f30092d);
                    hashSet.add(e4);
                    this.f30092d = Collections.unmodifiableSet(hashSet);
                }
                this.f30091c.put(e4, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(E e4) {
        int iIntValue;
        synchronized (this.f30090b) {
            try {
                iIntValue = this.f30091c.containsKey(e4) ? ((Integer) this.f30091c.get(e4)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void c(E e4) {
        synchronized (this.f30090b) {
            try {
                Integer num = (Integer) this.f30091c.get(e4);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f30093e);
                arrayList.remove(e4);
                this.f30093e = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f30091c.remove(e4);
                    HashSet hashSet = new HashSet(this.f30092d);
                    hashSet.remove(e4);
                    this.f30092d = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f30091c.put(e4, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f30090b) {
            it = this.f30093e.iterator();
        }
        return it;
    }

    public final Set<E> a() {
        Set<E> set;
        synchronized (this.f30090b) {
            set = this.f30092d;
        }
        return set;
    }
}
