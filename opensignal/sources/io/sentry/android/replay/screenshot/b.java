package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.media.ImageReader;
import android.view.View;
import br.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.a0;
import io.sentry.android.replay.t;
import io.sentry.b5;
import io.sentry.x5;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import lq.j;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f11955a;

    /* renamed from: b, reason: collision with root package name */
    public final ReplayIntegration f11956b;

    /* renamed from: c, reason: collision with root package name */
    public final x5 f11957c;

    /* renamed from: d, reason: collision with root package name */
    public final t f11958d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Bitmap f11959e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.util.a f11960f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f11961g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f11962h;

    /* renamed from: i, reason: collision with root package name */
    public final g f11963i;
    public final AtomicBoolean j;
    public final AtomicReference k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f11964l;

    /* renamed from: m, reason: collision with root package name */
    public final a f11965m;

    public b(x5 x5Var, ReplayIntegration replayIntegration, t tVar, a0 a0Var) {
        l.e(a0Var, "executor");
        this.f11955a = a0Var;
        this.f11956b = replayIntegration;
        this.f11957c = x5Var;
        this.f11958d = tVar;
        this.f11960f = new io.sentry.util.a();
        this.f11961g = kc.f.E(j.NONE, new ht.g(6, this));
        this.f11962h = new AtomicBoolean(false);
        this.f11963i = new g();
        this.j = new AtomicBoolean(false);
        this.k = new AtomicReference(new c(tVar.f11985a, tVar.f11986b, new as.d(23, this)));
        this.f11964l = new AtomicReference(null);
        ic.a.b("ReplayCanvasStrategy");
        this.f11965m = new a(this, 0);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final boolean a() {
        return this.f11962h.get();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lq.h] */
    @Override // io.sentry.android.replay.screenshot.f
    public final void b(View view) {
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean.get()) {
            return;
        }
        c cVar = (c) this.k.getAndSet(null);
        if (cVar == null) {
            this.f11957c.getLogger().m(b5.DEBUG, "No free Picture available, skipping capture", new Object[0]);
            this.f11962h.set(false);
            return;
        }
        Picture picture = cVar.f11969r;
        t tVar = this.f11958d;
        Canvas canvasBeginRecording = picture.beginRecording(tVar.f11985a, tVar.f11986b);
        l.d(canvasBeginRecording, "beginRecording(...)");
        g gVar = this.f11963i;
        gVar.getClass();
        gVar.f11977a = canvasBeginRecording;
        gVar.setMatrix((Matrix) this.f11961g.getValue());
        view.draw(gVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            cVar.close();
        } else {
            this.f11964l.set(cVar);
            this.f11955a.f11842x.submit(new io.sentry.android.replay.util.c(this.f11965m, "screenshot_recorder.canvas"));
        }
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void c() {
        Bitmap bitmap;
        if (!this.f11962h.get() || (bitmap = this.f11959e) == null || bitmap.isRecycled()) {
            return;
        }
        this.f11956b.V(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void close() {
        ImageReader imageReader;
        ImageReader imageReader2;
        this.j.set(true);
        this.f11955a.f11842x.submit(new io.sentry.android.replay.util.c(new a(this, 1), "CanvasStrategy.close"));
        c cVar = (c) this.k.getAndSet(null);
        if (cVar != null && (imageReader2 = cVar.f11970x) != null) {
            imageReader2.close();
        }
        c cVar2 = (c) this.f11964l.getAndSet(null);
        if (cVar2 == null || (imageReader = cVar2.f11970x) == null) {
            return;
        }
        imageReader.close();
    }

    @Override // io.sentry.android.replay.screenshot.f
    public final void onContentChanged() {
    }
}
