package io.appmetrica.analytics.coreutils.internal.toggle;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public abstract class SimpleThreadSafeToggle implements Toggle {

    /* renamed from: a, reason: collision with root package name */
    private final String f39008a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39009b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f39010c;

    public SimpleThreadSafeToggle(boolean z10, String str) {
        this.f39008a = str;
        this.f39009b = z10;
        this.f39010c = new ArrayList();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized boolean getActualState() {
        return this.f39009b;
    }

    public final String getTag() {
        return this.f39008a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void registerObserver(ToggleObserver toggleObserver, boolean z10) {
        this.f39010c.add(toggleObserver);
        if (z10) {
            toggleObserver.onStateChanged(getActualState());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.Toggle
    public synchronized void removeObserver(ToggleObserver toggleObserver) {
        this.f39010c.remove(toggleObserver);
    }

    public final synchronized void updateState(boolean z10) {
        if (z10 != getActualState()) {
            this.f39009b = z10;
            Iterator it = this.f39010c.iterator();
            while (it.hasNext()) {
                ((ToggleObserver) it.next()).onStateChanged(z10);
            }
        }
    }

    public /* synthetic */ SimpleThreadSafeToggle(boolean z10, String str, int i, g gVar) {
        this((i & 1) != 0 ? false : z10, str);
    }
}
