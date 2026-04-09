package p7;

import b9.C1992A;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;

/* compiled from: BatchBlockingQueue.kt */
/* renamed from: p7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BlockingQueueC5470b<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f45248b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f45249c;

    /* renamed from: d, reason: collision with root package name */
    public final Condition f45250d;

    public BlockingQueueC5470b(PriorityQueue priorityQueue) {
        this.f45248b = priorityQueue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f45249c = reentrantLock;
        this.f45250d = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean add(E e4) {
        offer(e4);
        return true;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(E e4) {
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lock();
        try {
            this.f45248b.offer(e4);
            this.f45250d.signal();
            C1992A c1992a = C1992A.f18074a;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lock();
        try {
            return (E) this.f45248b.peek();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Queue
    public final E poll() {
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lock();
        try {
            return (E) this.f45248b.poll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(E e4) {
        offer(e4);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final boolean remove(Object obj) {
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lock();
        try {
            return this.f45248b.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lock();
        try {
            return this.f45248b.size();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E take() throws InterruptedException {
        PriorityQueue priorityQueue = this.f45248b;
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lockInterruptibly();
        while (priorityQueue.isEmpty()) {
            try {
                this.f45250d.await();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        E e4 = (E) priorityQueue.poll();
        reentrantLock.unlock();
        return e4;
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection<? super E> collection, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final E poll(long j4, TimeUnit unit) throws InterruptedException {
        PriorityQueue priorityQueue = this.f45248b;
        l.f(unit, "unit");
        ReentrantLock reentrantLock = this.f45249c;
        reentrantLock.lockInterruptibly();
        try {
            long nanos = unit.toNanos(j4);
            while (priorityQueue.isEmpty() && nanos > 0) {
                nanos = this.f45250d.awaitNanos(nanos);
            }
            E e4 = (E) priorityQueue.poll();
            reentrantLock.unlock();
            return e4;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(E e4, long j4, TimeUnit unit) {
        l.f(unit, "unit");
        offer(e4);
        return true;
    }
}
