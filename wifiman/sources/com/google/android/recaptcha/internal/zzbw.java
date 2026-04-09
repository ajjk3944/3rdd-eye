package com.google.android.recaptcha.internal;

import Ii.InterfaceC3052e0;
import Ii.InterfaceC3082u;
import Ii.InterfaceC3086w;
import Ii.InterfaceC3088x;
import Ii.InterfaceC3091y0;
import Ii.V;
import Yg.InterfaceC3661e;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import java.util.concurrent.CancellationException;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import zi.InterfaceC8780j;

/* loaded from: classes3.dex */
public final class zzbw implements V {
    private final /* synthetic */ InterfaceC3088x zza;

    zzbw(InterfaceC3088x interfaceC3088x) {
        this.zza = interfaceC3088x;
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3082u attachChild(InterfaceC3086w interfaceC3086w) {
        return this.zza.attachChild(interfaceC3086w);
    }

    @Override // Ii.V
    public final Object await(InterfaceC5380e interfaceC5380e) {
        return this.zza.await(interfaceC5380e);
    }

    @Override // Ii.InterfaceC3091y0
    @InterfaceC3661e
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public final Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return this.zza.fold(obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public final InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return this.zza.get(cVar);
    }

    @Override // Ii.InterfaceC3091y0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC8780j getChildren() {
        return this.zza.getChildren();
    }

    @Override // Ii.V
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // Ii.V
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // dh.InterfaceC5384i.b
    public final InterfaceC5384i.c getKey() {
        return this.zza.getKey();
    }

    @Override // Ii.V
    public final Si.c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // Ii.InterfaceC3091y0
    public final Si.a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3091y0 getParent() {
        return this.zza.getParent();
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3052e0 invokeOnCompletion(InterfaceC6835l interfaceC6835l) {
        return this.zza.invokeOnCompletion(interfaceC6835l);
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // Ii.InterfaceC3091y0
    public final Object join(InterfaceC5380e interfaceC5380e) {
        return this.zza.join(interfaceC5380e);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public final InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return this.zza.minusKey(cVar);
    }

    @Override // Ii.InterfaceC3091y0
    @InterfaceC3661e
    public final InterfaceC3091y0 plus(InterfaceC3091y0 interfaceC3091y0) {
        return this.zza.plus(interfaceC3091y0);
    }

    @Override // Ii.InterfaceC3091y0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // Ii.InterfaceC3091y0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // Ii.InterfaceC3091y0
    public final InterfaceC3052e0 invokeOnCompletion(boolean z10, boolean z11, InterfaceC6835l interfaceC6835l) {
        return this.zza.invokeOnCompletion(z10, z11, interfaceC6835l);
    }

    @Override // dh.InterfaceC5384i
    public final InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return this.zza.plus(interfaceC5384i);
    }

    @Override // Ii.InterfaceC3091y0
    @InterfaceC3661e
    public final /* synthetic */ boolean cancel(Throwable th2) {
        return this.zza.cancel(th2);
    }
}
