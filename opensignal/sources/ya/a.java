package ya;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.w1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a implements x {
    private Looper looper;
    private w1 timeline;
    private final ArrayList<w> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<w> enabledMediaSourceCallers = new HashSet<>(1);
    private final a0 eventDispatcher = new a0();
    private final ba.d drmEventDispatcher = new ba.d();

    @Override // ya.x
    public final void addDrmEventListener(Handler handler, ba.e eVar) {
        handler.getClass();
        eVar.getClass();
        ba.d dVar = this.drmEventDispatcher;
        dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.f2488c;
        ba.c cVar = new ba.c();
        cVar.f2485a = eVar;
        copyOnWriteArrayList.add(cVar);
    }

    @Override // ya.x
    public final void addEventListener(Handler handler, b0 b0Var) {
        handler.getClass();
        b0Var.getClass();
        a0 a0Var = this.eventDispatcher;
        a0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = a0Var.f26037c;
        z zVar = new z();
        zVar.f26201a = handler;
        zVar.f26202b = b0Var;
        copyOnWriteArrayList.add(zVar);
    }

    public final ba.d createDrmEventDispatcher(v vVar) {
        return new ba.d(this.drmEventDispatcher.f2488c, 0, vVar);
    }

    public final a0 createEventDispatcher(v vVar) {
        return new a0(this.eventDispatcher.f26037c, 0, vVar, 0L);
    }

    @Override // ya.x
    public final void disable(w wVar) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(wVar);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    @Override // ya.x
    public final void enable(w wVar) {
        this.looper.getClass();
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(wVar);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // ya.x
    public final void prepareSource(w wVar, pb.u0 u0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        qb.b.g(looper == null || looper == looperMyLooper);
        w1 w1Var = this.timeline;
        this.mediaSourceCallers.add(wVar);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(wVar);
            prepareSourceInternal(u0Var);
        } else if (w1Var != null) {
            enable(wVar);
            wVar.a(this, w1Var);
        }
    }

    public abstract void prepareSourceInternal(pb.u0 u0Var);

    public final void refreshSourceInfo(w1 w1Var) {
        this.timeline = w1Var;
        Iterator<w> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().a(this, w1Var);
        }
    }

    @Override // ya.x
    public final void releaseSource(w wVar) {
        this.mediaSourceCallers.remove(wVar);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(wVar);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // ya.x
    public final void removeDrmEventListener(ba.e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.drmEventDispatcher.f2488c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ba.c cVar = (ba.c) it.next();
            if (cVar.f2485a == eVar) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
    }

    @Override // ya.x
    public final void removeEventListener(b0 b0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.eventDispatcher.f26037c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (zVar.f26202b == b0Var) {
                copyOnWriteArrayList.remove(zVar);
            }
        }
    }

    public final ba.d createDrmEventDispatcher(int i10, v vVar) {
        return new ba.d(this.drmEventDispatcher.f2488c, i10, vVar);
    }

    public final a0 createEventDispatcher(int i10, v vVar, long j) {
        return new a0(this.eventDispatcher.f26037c, i10, vVar, j);
    }

    public final a0 createEventDispatcher(v vVar, long j) {
        vVar.getClass();
        return new a0(this.eventDispatcher.f26037c, 0, vVar, j);
    }

    public void disableInternal() {
    }

    public void enableInternal() {
    }
}
