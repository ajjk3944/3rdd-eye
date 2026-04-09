package o5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a implements b0 {
    private Looper looper;
    private e5.o0 playerId;
    private androidx.media3.common.a1 timeline;
    private final ArrayList<a0> mediaSourceCallers = new ArrayList<>(1);
    private final HashSet<a0> enabledMediaSourceCallers = new HashSet<>(1);
    private final e0 eventDispatcher = new e0(new CopyOnWriteArrayList(), 0, null, 0);
    private final i5.f drmEventDispatcher = new i5.f(new CopyOnWriteArrayList(), 0, null);

    @Override // o5.b0
    public final void addDrmEventListener(Handler handler, i5.g gVar) {
        handler.getClass();
        gVar.getClass();
        i5.f fVar = this.drmEventDispatcher;
        fVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f11243c;
        i5.e eVar = new i5.e();
        eVar.f11240a = gVar;
        copyOnWriteArrayList.add(eVar);
    }

    @Override // o5.b0
    public final void addEventListener(Handler handler, f0 f0Var) {
        handler.getClass();
        f0Var.getClass();
        e0 e0Var = this.eventDispatcher;
        e0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = e0Var.f18924c;
        d0 d0Var = new d0();
        d0Var.f18913a = handler;
        d0Var.f18914b = f0Var;
        copyOnWriteArrayList.add(d0Var);
    }

    public final i5.f createDrmEventDispatcher(z zVar) {
        return new i5.f(this.drmEventDispatcher.f11243c, 0, zVar);
    }

    public final e0 createEventDispatcher(z zVar) {
        return new e0(this.eventDispatcher.f18924c, 0, zVar, 0L);
    }

    @Override // o5.b0
    public final void disable(a0 a0Var) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(a0Var);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    @Override // o5.b0
    public final void enable(a0 a0Var) {
        this.looper.getClass();
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(a0Var);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public final e5.o0 getPlayerId() {
        e5.o0 o0Var = this.playerId;
        a5.a.j(o0Var);
        return o0Var;
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    public final void prepareSource(a0 a0Var, b5.b0 b0Var) {
        prepareSource(a0Var, b0Var, e5.o0.f7910b);
    }

    public abstract void prepareSourceInternal(b5.b0 b0Var);

    public final void refreshSourceInfo(androidx.media3.common.a1 a1Var) {
        this.timeline = a1Var;
        Iterator<a0> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().a(this, a1Var);
        }
    }

    @Override // o5.b0
    public final void releaseSource(a0 a0Var) {
        this.mediaSourceCallers.remove(a0Var);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(a0Var);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // o5.b0
    public final void removeDrmEventListener(i5.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.drmEventDispatcher.f11243c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i5.e eVar = (i5.e) it.next();
            if (eVar.f11240a == gVar) {
                copyOnWriteArrayList.remove(eVar);
            }
        }
    }

    @Override // o5.b0
    public final void removeEventListener(f0 f0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.eventDispatcher.f18924c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (d0Var.f18914b == f0Var) {
                copyOnWriteArrayList.remove(d0Var);
            }
        }
    }

    @Override // o5.b0
    public final void prepareSource(a0 a0Var, b5.b0 b0Var, e5.o0 o0Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.looper;
        a5.a.e(looper == null || looper == looperMyLooper);
        this.playerId = o0Var;
        androidx.media3.common.a1 a1Var = this.timeline;
        this.mediaSourceCallers.add(a0Var);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(a0Var);
            prepareSourceInternal(b0Var);
        } else if (a1Var != null) {
            enable(a0Var);
            a0Var.a(this, a1Var);
        }
    }

    public final i5.f createDrmEventDispatcher(int i10, z zVar) {
        return new i5.f(this.drmEventDispatcher.f11243c, i10, zVar);
    }

    public final e0 createEventDispatcher(int i10, z zVar, long j) {
        return new e0(this.eventDispatcher.f18924c, i10, zVar, j);
    }

    public final e0 createEventDispatcher(z zVar, long j) {
        zVar.getClass();
        return new e0(this.eventDispatcher.f18924c, 0, zVar, j);
    }

    public void disableInternal() {
    }

    public void enableInternal() {
    }
}
