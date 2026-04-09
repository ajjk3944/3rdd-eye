package io.sentry.cache.tape;

import io.sentry.b5;
import io.sentry.x5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import rs.a0;
import rs.w;

/* loaded from: classes.dex */
public final class d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12135a;

    /* renamed from: d, reason: collision with root package name */
    public final Object f12136d;

    /* renamed from: g, reason: collision with root package name */
    public Iterable f12137g;

    public d(e eVar, h hVar) {
        this.f12135a = 0;
        this.f12137g = eVar;
        this.f12136d = hVar;
    }

    public w a() {
        w wVar;
        Stack stack = (Stack) this.f12136d;
        w wVar2 = (w) this.f12137g;
        if (wVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            if (!stack.isEmpty()) {
                rs.e eVar = ((a0) stack.pop()).f21730r;
                while (eVar instanceof a0) {
                    a0 a0Var = (a0) eVar;
                    stack.push(a0Var);
                    eVar = a0Var.f21729g;
                }
                w wVar3 = (w) eVar;
                if (wVar3.f21779d.length != 0) {
                    wVar = wVar3;
                    break;
                }
            } else {
                wVar = null;
                break;
            }
        }
        this.f12137g = wVar;
        return wVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f12135a) {
            case 0:
                return ((h) this.f12136d).hasNext();
            default:
                return ((w) this.f12137g) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12135a) {
            case 0:
                byte[] bArr = (byte[]) ((h) this.f12136d).next();
                x5 x5Var = ((io.sentry.cache.f) ((e) this.f12137g).f12140g.f10078a).f12133a;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), io.sentry.cache.f.f12132c));
                    try {
                        io.sentry.e eVar = (io.sentry.e) x5Var.getSerializer().b(bufferedReader, io.sentry.e.class);
                        bufferedReader.close();
                        return eVar;
                    } finally {
                    }
                } catch (Throwable th2) {
                    x5Var.getLogger().f(b5.ERROR, th2, "Error reading entity from scope cache", new Object[0]);
                    return null;
                }
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f12135a) {
            case 0:
                ((h) this.f12136d).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public d(rs.e eVar) {
        this.f12135a = 1;
        this.f12136d = new Stack();
        while (eVar instanceof a0) {
            a0 a0Var = (a0) eVar;
            ((Stack) this.f12136d).push(a0Var);
            eVar = a0Var.f21729g;
        }
        this.f12137g = (w) eVar;
    }
}
