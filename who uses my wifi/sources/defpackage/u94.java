package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class u94 implements Iterator, Closeable {
    public static final fp1 l = new fp1("eof ", 1);
    public ap1 f;
    public lx g;
    public cp1 h = null;
    public long i = 0;
    public long j = 0;
    public final ArrayList k = new ArrayList();

    static {
        zt0.I(u94.class);
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cp1 next() {
        cp1 cp1VarA;
        cp1 cp1Var = this.h;
        if (cp1Var != null && cp1Var != l) {
            this.h = null;
            return cp1Var;
        }
        lx lxVar = this.g;
        if (lxVar == null || this.i >= this.j) {
            this.h = l;
            throw new NoSuchElementException();
        }
        try {
            synchronized (lxVar) {
                ((ByteBuffer) this.g.g).position((int) this.i);
                cp1VarA = ((zo1) this.f).a(this.g, this);
                this.i = this.g.s();
            }
            return cp1VarA;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        cp1 cp1Var = this.h;
        fp1 fp1Var = l;
        if (cp1Var == fp1Var) {
            return false;
        }
        if (cp1Var != null) {
            return true;
        }
        try {
            this.h = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.h = fp1Var;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((cp1) arrayList.get(i)).toString());
            i++;
        }
    }

    public void close() {
    }
}
