package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* loaded from: classes.dex */
public final class p6 implements Queue, Collection, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final g f12508a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f12509d = new io.sentry.util.a();

    public p6(g gVar) {
        this.f12508a = gVar;
    }

    @Override // java.util.Queue, java.util.Collection
    public final boolean add(Object obj) {
        q qVarA = this.f12509d.a();
        try {
            boolean zAdd = this.f12508a.add(obj);
            qVarA.close();
            return zAdd;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        q qVarA = this.f12509d.a();
        try {
            boolean zAddAll = this.f12508a.addAll(collection);
            qVarA.close();
            return zAddAll;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        q qVarA = this.f12509d.a();
        try {
            this.f12508a.clear();
            qVarA.close();
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        q qVarA = this.f12509d.a();
        try {
            boolean zContains = this.f12508a.contains(obj);
            qVarA.close();
            return zContains;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        q qVarA = this.f12509d.a();
        try {
            boolean zContainsAll = this.f12508a.containsAll(collection);
            qVarA.close();
            return zContainsAll;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object element() {
        q qVarA = this.f12509d.a();
        try {
            Object objElement = this.f12508a.element();
            qVarA.close();
            return objElement;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        q qVarA = this.f12509d.a();
        try {
            boolean zEquals = this.f12508a.equals(obj);
            qVarA.close();
            return zEquals;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int hashCode() {
        q qVarA = this.f12509d.a();
        try {
            int iHashCode = this.f12508a.hashCode();
            qVarA.close();
            return iHashCode;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        q qVarA = this.f12509d.a();
        try {
            boolean zIsEmpty = this.f12508a.isEmpty();
            qVarA.close();
            return zIsEmpty;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f12508a.iterator();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        q qVarA = this.f12509d.a();
        try {
            boolean zOffer = this.f12508a.offer(obj);
            qVarA.close();
            return zOffer;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        q qVarA = this.f12509d.a();
        try {
            Object objPeek = this.f12508a.peek();
            qVarA.close();
            return objPeek;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        q qVarA = this.f12509d.a();
        try {
            Object objPoll = this.f12508a.poll();
            qVarA.close();
            return objPoll;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object remove() {
        q qVarA = this.f12509d.a();
        try {
            Object objRemove = this.f12508a.remove();
            qVarA.close();
            return objRemove;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        q qVarA = this.f12509d.a();
        try {
            boolean zRemoveAll = this.f12508a.removeAll(collection);
            qVarA.close();
            return zRemoveAll;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        q qVarA = this.f12509d.a();
        try {
            boolean zRetainAll = this.f12508a.retainAll(collection);
            qVarA.close();
            return zRetainAll;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final int size() {
        q qVarA = this.f12509d.a();
        try {
            int size = this.f12508a.size();
            qVarA.close();
            return size;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        q qVarA = this.f12509d.a();
        try {
            Object[] array = this.f12508a.toArray();
            qVarA.close();
            return array;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String toString() {
        q qVarA = this.f12509d.a();
        try {
            String string = this.f12508a.toString();
            qVarA.close();
            return string;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        q qVarA = this.f12509d.a();
        try {
            boolean zRemove = this.f12508a.remove(obj);
            qVarA.close();
            return zRemove;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        q qVarA = this.f12509d.a();
        try {
            Object[] array = this.f12508a.toArray(objArr);
            qVarA.close();
            return array;
        } catch (Throwable th2) {
            try {
                qVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
