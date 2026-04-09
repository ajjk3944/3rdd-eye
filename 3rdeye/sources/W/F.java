package W;

import C.C0624k;
import C.RunnableC0615b;
import C.e0;
import C.k0;
import G.c;
import N7.G8;
import W.C1618f;
import W.C1626n;
import W.C1631t;
import W.O;
import W.Z;
import W.a0;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C1699l;
import androidx.camera.core.impl.C1711r0;
import androidx.camera.core.impl.InterfaceC1680b0;
import androidx.camera.core.impl.InterfaceC1715t0;
import androidx.camera.core.impl.K0;
import androidx.camera.core.impl.Q0;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import b0.C1811b;
import c0.C2031c;
import c0.C2032d;
import c0.C2034f;
import c0.C2035g;
import c0.C2036h;
import d0.AbstractC4257a;
import d0.k;
import g0.C4356c;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: Recorder.java */
/* loaded from: classes.dex */
public final class F implements Z {

    /* renamed from: d0, reason: collision with root package name */
    public static final Set<j> f13073d0 = Collections.unmodifiableSet(EnumSet.of(j.PENDING_RECORDING, j.PENDING_PAUSED));

    /* renamed from: e0, reason: collision with root package name */
    public static final Set<j> f13074e0 = Collections.unmodifiableSet(EnumSet.of(j.CONFIGURING, j.IDLING, j.RESETTING, j.STOPPING, j.ERROR));

    /* renamed from: f0, reason: collision with root package name */
    public static final b0 f13075f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final C1618f f13076g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final G8 f13077h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final H.g f13078i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final int f13079j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final long f13080k0;

    /* renamed from: A, reason: collision with root package name */
    public MediaMuxer f13081A;

    /* renamed from: B, reason: collision with root package name */
    public final C1711r0<AbstractC1630s> f13082B;

    /* renamed from: C, reason: collision with root package name */
    public Z.h f13083C;

    /* renamed from: D, reason: collision with root package name */
    public d0.s f13084D;

    /* renamed from: E, reason: collision with root package name */
    public B8.b f13085E;

    /* renamed from: F, reason: collision with root package name */
    public d0.s f13086F;

    /* renamed from: G, reason: collision with root package name */
    public B8.b f13087G;

    /* renamed from: H, reason: collision with root package name */
    public g f13088H;

    /* renamed from: I, reason: collision with root package name */
    public Uri f13089I;

    /* renamed from: J, reason: collision with root package name */
    public long f13090J;

    /* renamed from: K, reason: collision with root package name */
    public long f13091K;

    /* renamed from: L, reason: collision with root package name */
    public long f13092L;

    /* renamed from: M, reason: collision with root package name */
    public long f13093M;

    /* renamed from: N, reason: collision with root package name */
    public long f13094N;

    /* renamed from: O, reason: collision with root package name */
    public long f13095O;

    /* renamed from: P, reason: collision with root package name */
    public long f13096P;

    /* renamed from: Q, reason: collision with root package name */
    public long f13097Q;

    /* renamed from: R, reason: collision with root package name */
    public int f13098R;

    /* renamed from: S, reason: collision with root package name */
    public d0.i f13099S;

    /* renamed from: T, reason: collision with root package name */
    public final M.a f13100T;

    /* renamed from: U, reason: collision with root package name */
    public Throwable f13101U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f13102V;

    /* renamed from: W, reason: collision with root package name */
    public Z.a f13103W;

    /* renamed from: X, reason: collision with root package name */
    public ScheduledFuture<?> f13104X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f13105Y;

    /* renamed from: Z, reason: collision with root package name */
    public Y f13106Z;

    /* renamed from: a, reason: collision with root package name */
    public final C1711r0<O> f13107a;

    /* renamed from: a0, reason: collision with root package name */
    public Y f13108a0;

    /* renamed from: b, reason: collision with root package name */
    public final C1711r0<Boolean> f13109b;

    /* renamed from: b0, reason: collision with root package name */
    public double f13110b0;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f13111c;

    /* renamed from: c0, reason: collision with root package name */
    public i f13112c0;

    /* renamed from: d, reason: collision with root package name */
    public final H.g f13113d;

    /* renamed from: e, reason: collision with root package name */
    public final G8 f13114e;

    /* renamed from: f, reason: collision with root package name */
    public final G8 f13115f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13116g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13117h;
    public j i;

    /* renamed from: j, reason: collision with root package name */
    public j f13118j;

    /* renamed from: k, reason: collision with root package name */
    public int f13119k;

    /* renamed from: l, reason: collision with root package name */
    public C1623k f13120l;

    /* renamed from: m, reason: collision with root package name */
    public C1623k f13121m;

    /* renamed from: n, reason: collision with root package name */
    public long f13122n;

    /* renamed from: o, reason: collision with root package name */
    public h f13123o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13124p;

    /* renamed from: q, reason: collision with root package name */
    public C0624k f13125q;

    /* renamed from: r, reason: collision with root package name */
    public C0624k f13126r;

    /* renamed from: s, reason: collision with root package name */
    public Y.f f13127s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f13128t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f13129u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f13130v;

    /* renamed from: w, reason: collision with root package name */
    public k0 f13131w;

    /* renamed from: x, reason: collision with root package name */
    public Q0 f13132x;

    /* renamed from: y, reason: collision with root package name */
    public Surface f13133y;

    /* renamed from: z, reason: collision with root package name */
    public Surface f13134z;

    /* compiled from: Recorder.java */
    public class a implements I.c<Void> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z.h f13135b;

        public a(Z.h hVar) {
            this.f13135b = hVar;
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            C.S.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.f13135b.hashCode())));
        }

        @Override // I.c
        public final void onSuccess(Void r32) {
            C.S.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.f13135b.hashCode())));
        }
    }

    /* compiled from: Recorder.java */
    public class b implements d0.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f13136b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f13137c;

        public b(b.a aVar, h hVar) {
            this.f13136b = aVar;
            this.f13137c = hVar;
        }

        @Override // d0.l
        public final void a() {
            this.f13136b.b(null);
        }

        @Override // d0.l
        public final void b(B8.b bVar) {
            F.this.f13085E = bVar;
        }

        @Override // d0.l
        public final void c(d0.h hVar) {
            this.f13136b.d(hVar);
        }

        @Override // d0.l
        public final void d(d0.i iVar) throws Exception {
            boolean z10;
            F f10 = F.this;
            MediaMuxer mediaMuxer = f10.f13081A;
            h hVar = this.f13137c;
            if (mediaMuxer != null) {
                try {
                    f10.L(iVar, hVar);
                    iVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        iVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (f10.f13124p) {
                C.S.a("Recorder", "Drop video data since recording is stopping.");
                iVar.close();
                return;
            }
            d0.i iVar2 = f10.f13099S;
            if (iVar2 != null) {
                iVar2.close();
                f10.f13099S = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!iVar.a0()) {
                if (z10) {
                    C.S.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
                }
                C.S.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
                d0.s sVar = f10.f13084D;
                sVar.f37265h.execute(new D(sVar, 1));
                iVar.close();
                return;
            }
            f10.f13099S = iVar;
            if (!f10.m() || !f10.f13100T.c()) {
                C.S.a("Recorder", "Received video keyframe. Starting muxer...");
                f10.D(hVar);
            } else if (z10) {
                C.S.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
            } else {
                C.S.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
            }
        }
    }

    /* compiled from: Recorder.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N.f f13139a;

        public c(N.f fVar) {
            this.f13139a = fVar;
        }
    }

    /* compiled from: Recorder.java */
    public class d implements d0.l {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.a f13141b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N.f f13142c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h f13143d;

        public d(b.a aVar, N.f fVar, h hVar) {
            this.f13141b = aVar;
            this.f13142c = fVar;
            this.f13143d = hVar;
        }

        @Override // d0.l
        public final void a() {
            this.f13141b.b(null);
        }

        @Override // d0.l
        public final void b(B8.b bVar) {
            F.this.f13087G = bVar;
        }

        @Override // d0.l
        public final void c(d0.h hVar) {
            if (F.this.f13101U == null) {
                this.f13142c.accept(hVar);
            }
        }

        @Override // d0.l
        public final void d(d0.i iVar) throws Exception {
            F f10 = F.this;
            if (f10.f13088H == g.DISABLED) {
                iVar.close();
                throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
            }
            MediaMuxer mediaMuxer = f10.f13081A;
            h hVar = this.f13143d;
            if (mediaMuxer != null) {
                try {
                    f10.K(iVar, hVar);
                    iVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        iVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (f10.f13124p) {
                C.S.a("Recorder", "Drop audio data since recording is stopping.");
            } else {
                f10.f13100T.b(new d0.g(iVar));
                if (f10.f13099S != null) {
                    C.S.a("Recorder", "Received audio data. Starting muxer...");
                    f10.D(hVar);
                } else {
                    C.S.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
                }
            }
            iVar.close();
        }
    }

    /* compiled from: Recorder.java */
    public class e implements I.c<List<Void>> {
        public e() {
        }

        @Override // I.c
        public final void onFailure(Throwable th) {
            F f10 = F.this;
            A2.l.q("In-progress recording shouldn't be null", f10.f13123o != null);
            if (f10.f13123o.B()) {
                return;
            }
            C.S.a("Recorder", "Encodings end with error: " + th);
            f10.h(f10.f13081A == null ? 8 : 6);
        }

        @Override // I.c
        public final void onSuccess(List<Void> list) {
            C.S.a("Recorder", "Encodings end successfully.");
            F f10 = F.this;
            f10.h(f10.f13098R);
        }
    }

    /* compiled from: Recorder.java */
    public class f implements InterfaceC1715t0.a<Boolean> {
        public f() {
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void a(Boolean bool) {
            F.this.f13109b.g(bool);
        }

        @Override // androidx.camera.core.impl.InterfaceC1715t0.a
        public final void onError(Throwable th) {
            C1711r0<Boolean> c1711r0 = F.this.f13109b;
            c1711r0.getClass();
            c1711r0.g(new C1699l(th));
        }
    }

    /* compiled from: Recorder.java */
    public enum g {
        INITIALIZING,
        IDLING,
        DISABLED,
        ENABLED,
        ERROR_ENCODER,
        ERROR_SOURCE
    }

    /* compiled from: Recorder.java */
    public static abstract class h implements AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        public final G.c f13147b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f13148c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<d> f13149d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReference<c> f13150e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicReference<K0.b<Uri>> f13151f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f13152g;

        /* renamed from: h, reason: collision with root package name */
        public final C1711r0<Boolean> f13153h;

        /* compiled from: Recorder.java */
        public class a implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Context f13154a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1623k f13155b;

            public a(C1623k c1623k, Context context) {
                this.f13155b = c1623k;
                this.f13154a = context;
            }

            @Override // W.F.h.c
            public final Z.h a(Z.a aVar, H.g gVar) throws Z.i {
                return new Z.h(aVar, gVar, this.f13154a);
            }
        }

        /* compiled from: Recorder.java */
        public class b implements c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C1623k f13156a;

            public b(C1623k c1623k) {
                this.f13156a = c1623k;
            }

            @Override // W.F.h.c
            public final Z.h a(Z.a aVar, H.g gVar) throws Z.i {
                return new Z.h(aVar, gVar, null);
            }
        }

        /* compiled from: Recorder.java */
        public interface c {
            Z.h a(Z.a aVar, H.g gVar) throws Z.i;
        }

        /* compiled from: Recorder.java */
        public interface d {
            MediaMuxer a(int i, E.j jVar) throws IOException;
        }

        public h() {
            this.f13147b = Build.VERSION.SDK_INT >= 30 ? new G.c(new c.a()) : new G.c(new c.C0031c());
            this.f13148c = new AtomicBoolean(false);
            this.f13149d = new AtomicReference<>(null);
            this.f13150e = new AtomicReference<>(null);
            this.f13151f = new AtomicReference<>(new J());
            this.f13152g = new AtomicBoolean(false);
            this.f13153h = new C1711r0<>(Boolean.FALSE);
        }

        public final void A(final Context context) throws IOException {
            if (this.f13148c.getAndSet(true)) {
                throw new AssertionError("Recording " + this + " has already been initialized");
            }
            C1623k c1623k = (C1623k) this;
            final C1631t c1631t = c1623k.i;
            this.f13147b.f1799a.a("finalizeRecording");
            this.f13149d.set(new d() { // from class: W.G
                @Override // W.F.h.d
                public final MediaMuxer a(int i, E.j jVar) throws Throwable {
                    MediaMuxer mediaMuxerA;
                    Uri uri = Uri.EMPTY;
                    AbstractC1632u abstractC1632u = c1631t;
                    if (abstractC1632u instanceof r) {
                        ((r) abstractC1632u).getClass();
                        throw null;
                    }
                    if (abstractC1632u instanceof C1629q) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            throw null;
                        }
                        throw new IOException("MediaMuxer doesn't accept FileDescriptor as output destination.");
                    }
                    if (!(abstractC1632u instanceof C1631t)) {
                        throw new AssertionError("Invalid output options type: ".concat(abstractC1632u.getClass().getSimpleName()));
                    }
                    C1631t.a aVar = ((C1631t) abstractC1632u).f13299b;
                    ContentValues contentValues = new ContentValues(aVar.f());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 29) {
                        contentValues.put("is_pending", (Integer) 1);
                    }
                    try {
                        Uri uriInsert = aVar.e().insert(aVar.d(), contentValues);
                        if (uriInsert == null) {
                            throw new IOException("Unable to create MediaStore entry.");
                        }
                        if (i10 < 26) {
                            String strQ = com.google.gson.internal.c.q(aVar.e(), uriInsert);
                            if (strQ == null) {
                                throw new IOException("Unable to get path from uri " + uriInsert);
                            }
                            File parentFile = new File(strQ).getParentFile();
                            if (!(parentFile == null ? false : parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs())) {
                                C.S.g("Recorder", "Failed to create folder for ".concat(strQ));
                            }
                            mediaMuxerA = new MediaMuxer(strQ, i);
                        } else {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = aVar.e().openFileDescriptor(uriInsert, "rw");
                            mediaMuxerA = a0.b.a(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), i);
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        ((F) jVar.f1317b).f13089I = uriInsert;
                        return mediaMuxerA;
                    } catch (RuntimeException e4) {
                        throw new IOException("Unable to create MediaStore entry by " + e4, e4);
                    }
                }
            });
            if (c1623k.f13277l) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference<c> atomicReference = this.f13150e;
                if (i >= 31) {
                    atomicReference.set(new a(c1623k, context));
                } else {
                    atomicReference.set(new b(c1623k));
                }
            }
            K0.b<Uri> kVar = androidx.work.s.n(c1631t) ? Build.VERSION.SDK_INT >= 29 ? new E.k(c1631t, 2) : new K0.b() { // from class: W.H
                @Override // K0.b
                public final void accept(Object obj) throws Throwable {
                    Uri uri = (Uri) obj;
                    if (uri.equals(Uri.EMPTY)) {
                        return;
                    }
                    String strQ = com.google.gson.internal.c.q(c1631t.f13299b.e(), uri);
                    if (strQ != null) {
                        MediaScannerConnection.scanFile(context, new String[]{strQ}, null, new K());
                    } else {
                        C.S.a("Recorder", "Skipping media scanner scan. Unable to retrieve file path from URI: " + uri);
                    }
                }
            } : null;
            if (kVar != null) {
                this.f13151f.set(kVar);
            }
        }

        public abstract boolean B();

        public final MediaMuxer D(int i, E.j jVar) throws IOException {
            if (!this.f13148c.get()) {
                throw new AssertionError("Recording " + this + " has not been initialized");
            }
            d andSet = this.f13149d.getAndSet(null);
            if (andSet == null) {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
            try {
                return andSet.a(i, jVar);
            } catch (RuntimeException e4) {
                throw new IOException("Failed to create MediaMuxer by " + e4, e4);
            }
        }

        public final void F(a0 a0Var) {
            int i;
            String strI;
            AbstractC1632u abstractC1632uK = k();
            AbstractC1632u abstractC1632u = a0Var.f13232a;
            if (!Objects.equals(abstractC1632u, abstractC1632uK)) {
                throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + abstractC1632u + ", Expected: " + k() + "]");
            }
            String strConcat = "Sending VideoRecordEvent ".concat(a0Var.getClass().getSimpleName());
            boolean z10 = a0Var instanceof a0.a;
            if (z10 && (i = ((a0.a) a0Var).f13233b) != 0) {
                StringBuilder sbU = G8.u(strConcat);
                switch (i) {
                    case 0:
                        strI = "ERROR_NONE";
                        break;
                    case 1:
                        strI = "ERROR_UNKNOWN";
                        break;
                    case 2:
                        strI = "ERROR_FILE_SIZE_LIMIT_REACHED";
                        break;
                    case 3:
                        strI = "ERROR_INSUFFICIENT_STORAGE";
                        break;
                    case 4:
                        strI = "ERROR_SOURCE_INACTIVE";
                        break;
                    case 5:
                        strI = "ERROR_INVALID_OUTPUT_OPTIONS";
                        break;
                    case 6:
                        strI = "ERROR_ENCODING_FAILED";
                        break;
                    case 7:
                        strI = "ERROR_RECORDER_ERROR";
                        break;
                    case 8:
                        strI = "ERROR_NO_VALID_DATA";
                        break;
                    case 9:
                        strI = "ERROR_DURATION_LIMIT_REACHED";
                        break;
                    case 10:
                        strI = "ERROR_RECORDING_GARBAGE_COLLECTED";
                        break;
                    default:
                        strI = C4356c.i(i, "Unknown(", ")");
                        break;
                }
                sbU.append(" [error: " + strI + "]");
                strConcat = sbU.toString();
            }
            C.S.a("Recorder", strConcat);
            boolean z11 = a0Var instanceof a0.d;
            C1711r0<Boolean> c1711r0 = this.f13153h;
            if (z11 || (a0Var instanceof a0.c)) {
                c1711r0.g(Boolean.TRUE);
            } else if ((a0Var instanceof a0.b) || z10) {
                c1711r0.g(Boolean.FALSE);
            }
            if (d() == null || e() == null) {
                return;
            }
            try {
                d().execute(new C.T(10, this, a0Var));
            } catch (RejectedExecutionException e4) {
                C.S.c("Recorder", "The callback executor is invalid.", e4);
            }
        }

        public final void a(Uri uri) {
            if (this.f13148c.get()) {
                c(this.f13151f.getAndSet(null), uri);
            }
        }

        public final void c(K0.b<Uri> bVar, Uri uri) {
            if (bVar != null) {
                this.f13147b.f1799a.close();
                bVar.accept(uri);
            } else {
                throw new AssertionError("Recording " + this + " has already been finalized");
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            a(Uri.EMPTY);
        }

        public abstract Executor d();

        public abstract K0.b<a0> e();

        public final void finalize() throws Throwable {
            try {
                this.f13147b.f1799a.b();
                K0.b<Uri> andSet = this.f13151f.getAndSet(null);
                if (andSet != null) {
                    c(andSet, Uri.EMPTY);
                }
            } finally {
                super.finalize();
            }
        }

        public abstract AbstractC1632u k();

        public abstract long l();

        public abstract boolean n();
    }

    /* compiled from: Recorder.java */
    public class i {

        /* renamed from: a, reason: collision with root package name */
        public final k0 f13157a;

        /* renamed from: b, reason: collision with root package name */
        public final Q0 f13158b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13159c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13160d = false;

        /* renamed from: e, reason: collision with root package name */
        public int f13161e = 0;

        /* renamed from: f, reason: collision with root package name */
        public ScheduledFuture<?> f13162f = null;

        public i(k0 k0Var, Q0 q02, int i) {
            this.f13157a = k0Var;
            this.f13158b = q02;
            this.f13159c = i;
        }
    }

    /* compiled from: Recorder.java */
    public enum j {
        CONFIGURING,
        PENDING_RECORDING,
        PENDING_PAUSED,
        IDLING,
        RECORDING,
        PAUSED,
        STOPPING,
        RESETTING,
        ERROR
    }

    static {
        C1622j c1622j = C1635x.f13309c;
        A a10 = A.a(Arrays.asList(c1622j, C1635x.f13308b, C1635x.f13307a), new C1617e(c1622j, 1));
        C1626n.a aVarA = b0.a();
        aVarA.f13289a = a10;
        aVarA.b(-1);
        C1626n c1626nA = aVarA.a();
        f13075f0 = c1626nA;
        C1618f.a aVarA2 = AbstractC1630s.a();
        aVarA2.f13258c = -1;
        aVarA2.f13256a = c1626nA;
        f13076g0 = aVarA2.a();
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f13077h0 = new G8(21);
        f13078i0 = new H.g(E.u.F());
        f13079j0 = 3;
        f13080k0 = 1000L;
    }

    public F(C1618f c1618f, G8 g82, G8 g83) {
        this.f13117h = C1811b.f17055a.e(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.i = j.CONFIGURING;
        this.f13118j = null;
        this.f13119k = 0;
        this.f13120l = null;
        this.f13121m = null;
        this.f13122n = 0L;
        this.f13123o = null;
        this.f13124p = false;
        this.f13125q = null;
        this.f13126r = null;
        this.f13127s = null;
        this.f13128t = new ArrayList();
        this.f13129u = null;
        this.f13130v = null;
        this.f13133y = null;
        this.f13134z = null;
        this.f13081A = null;
        this.f13083C = null;
        this.f13084D = null;
        this.f13085E = null;
        this.f13086F = null;
        this.f13087G = null;
        this.f13088H = g.INITIALIZING;
        this.f13089I = Uri.EMPTY;
        this.f13090J = 0L;
        this.f13091K = 0L;
        this.f13092L = Long.MAX_VALUE;
        this.f13093M = Long.MAX_VALUE;
        this.f13094N = Long.MAX_VALUE;
        this.f13095O = Long.MAX_VALUE;
        this.f13096P = 0L;
        this.f13097Q = 0L;
        this.f13098R = 1;
        this.f13099S = null;
        this.f13100T = new M.a(60, null);
        this.f13101U = null;
        this.f13102V = false;
        this.f13103W = Z.a.INACTIVE;
        this.f13104X = null;
        this.f13105Y = false;
        this.f13108a0 = null;
        this.f13110b0 = 0.0d;
        this.f13112c0 = null;
        H.e eVarF = E.u.F();
        this.f13111c = eVarF;
        H.g gVar = new H.g(eVarF);
        this.f13113d = gVar;
        b0 b0VarA = c1618f.f13253a;
        AbstractC1613a abstractC1613a = c1618f.f13254b;
        int i10 = c1618f.f13255c;
        if (c1618f.f13253a.b() == -1) {
            if (b0VarA == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            C1626n.a aVarF = b0VarA.f();
            aVarF.b(f13075f0.b());
            b0VarA = aVarF.a();
        }
        String strConcat = b0VarA == null ? " videoSpec" : "";
        strConcat = abstractC1613a == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f13082B = new C1711r0<>(new C1618f(b0VarA, abstractC1613a, i10));
        int i11 = this.f13119k;
        O.a aVarL = l(this.i);
        C1625m c1625m = O.f13174a;
        this.f13107a = new C1711r0<>(new C1625m(i11, aVarL, null));
        this.f13109b = new C1711r0<>(Boolean.FALSE);
        this.f13114e = g82;
        this.f13115f = g83;
        this.f13106Z = new Y(g82, gVar, eVarF);
    }

    public static Object k(K0 k02) {
        try {
            return k02.d().get();
        } catch (InterruptedException | ExecutionException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static O.a l(j jVar) {
        return (jVar == j.RECORDING || (jVar == j.STOPPING && ((DeactivateEncoderSurfaceBeforeStopEncoderQuirk) C1811b.f17055a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class)) == null)) ? O.a.ACTIVE : O.a.INACTIVE;
    }

    public static boolean o(M m10, C1623k c1623k) {
        return c1623k != null && m10.f13171d == c1623k.f13278m;
    }

    public static void q(d0.s sVar) {
        if (androidx.work.s.n(sVar)) {
            sVar.f37265h.execute(new D(sVar, 2));
        }
    }

    public final void A(Surface surface) {
        int iHashCode;
        if (this.f13133y == surface) {
            return;
        }
        this.f13133y = surface;
        synchronized (this.f13116g) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            C(iHashCode);
        }
    }

    public final void B(j jVar) {
        if (this.i == jVar) {
            throw new AssertionError("Attempted to transition to state " + jVar + ", but Recorder is already in state " + jVar);
        }
        C.S.a("Recorder", "Transitioning Recorder internal state: " + this.i + " --> " + jVar);
        Set<j> set = f13073d0;
        O.a aVarL = null;
        if (set.contains(jVar)) {
            if (!set.contains(this.i)) {
                if (!f13074e0.contains(this.i)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.i);
                }
                j jVar2 = this.i;
                this.f13118j = jVar2;
                aVarL = l(jVar2);
            }
        } else if (this.f13118j != null) {
            this.f13118j = null;
        }
        this.i = jVar;
        if (aVarL == null) {
            aVarL = l(jVar);
        }
        int i10 = this.f13119k;
        C0624k c0624k = this.f13125q;
        C1625m c1625m = O.f13174a;
        this.f13107a.g(new C1625m(i10, aVarL, c0624k));
    }

    public final void C(int i10) {
        if (this.f13119k == i10) {
            return;
        }
        C.S.a("Recorder", "Transitioning streamId: " + this.f13119k + " --> " + i10);
        this.f13119k = i10;
        O.a aVarL = l(this.i);
        C0624k c0624k = this.f13125q;
        C1625m c1625m = O.f13174a;
        this.f13107a.g(new C1625m(i10, aVarL, c0624k));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0027, B:15:0x0032, B:17:0x0038, B:19:0x0046, B:20:0x004a, B:21:0x0052, B:23:0x0058, B:26:0x0068, B:30:0x0074, B:34:0x0097, B:36:0x00a6, B:41:0x00b3, B:58:0x00d7, B:59:0x00e0, B:61:0x00e4, B:62:0x00ec, B:64:0x00f8, B:73:0x0122, B:69:0x0118, B:74:0x0127, B:79:0x0154, B:81:0x016a, B:82:0x017a, B:83:0x0186, B:85:0x018c, B:77:0x014a, B:48:0x00c2, B:55:0x00d0, B:89:0x019a), top: B:103:0x0027, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0027, B:15:0x0032, B:17:0x0038, B:19:0x0046, B:20:0x004a, B:21:0x0052, B:23:0x0058, B:26:0x0068, B:30:0x0074, B:34:0x0097, B:36:0x00a6, B:41:0x00b3, B:58:0x00d7, B:59:0x00e0, B:61:0x00e4, B:62:0x00ec, B:64:0x00f8, B:73:0x0122, B:69:0x0118, B:74:0x0127, B:79:0x0154, B:81:0x016a, B:82:0x017a, B:83:0x0186, B:85:0x018c, B:77:0x014a, B:48:0x00c2, B:55:0x00d0, B:89:0x019a), top: B:103:0x0027, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c A[Catch: all -> 0x0064, LOOP:2: B:83:0x0186->B:85:0x018c, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:14:0x0027, B:15:0x0032, B:17:0x0038, B:19:0x0046, B:20:0x004a, B:21:0x0052, B:23:0x0058, B:26:0x0068, B:30:0x0074, B:34:0x0097, B:36:0x00a6, B:41:0x00b3, B:58:0x00d7, B:59:0x00e0, B:61:0x00e4, B:62:0x00ec, B:64:0x00f8, B:73:0x0122, B:69:0x0118, B:74:0x0127, B:79:0x0154, B:81:0x016a, B:82:0x017a, B:83:0x0186, B:85:0x018c, B:77:0x014a, B:48:0x00c2, B:55:0x00d0, B:89:0x019a), top: B:103:0x0027, inners: #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(W.F.h r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.F.D(W.F$h):void");
    }

    public final void E(h hVar) throws Z.i, d0.y {
        InterfaceC1680b0.a aVarE;
        AbstractC1630s abstractC1630s = (AbstractC1630s) k(this.f13082B);
        Y.f fVar = this.f13127s;
        String str = abstractC1630s.c() != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i10 = (abstractC1630s.c() != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (fVar == null || fVar.e() == null) {
            aVarE = null;
        } else {
            aVarE = fVar.e();
            String strD = aVarE.d();
            int iE = aVarE.e();
            if (Objects.equals(strD, "audio/none")) {
                C.S.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + str + "(profile: " + i10 + ")]");
            } else if (abstractC1630s.c() == -1) {
                C.S.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strD + "(profile: " + iE + ")]");
                str = strD;
                i10 = iE;
            } else if (str.equals(strD) && i10 == iE) {
                C.S.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strD + "(profile: " + i10 + ")]");
                str = strD;
            } else {
                C.S.a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strD + "(profile: " + iE + "), chosen mime type: " + str + "(profile: " + i10 + ")]");
            }
            aVarE = null;
        }
        C2036h.a aVar = new C2036h.a();
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        aVar.f18350a = str;
        aVar.f18351b = -1;
        aVar.f18351b = Integer.valueOf(i10);
        if (aVarE != null) {
            aVar.f18352c = aVarE;
        }
        String str2 = aVar.f18350a == null ? " mimeType" : "";
        if (!str2.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str2));
        }
        C2036h c2036h = new C2036h(aVar.f18350a, aVar.f18351b.intValue(), aVar.f18352c);
        Q0 q02 = Q0.UPTIME;
        AbstractC1613a abstractC1613aB = abstractC1630s.b();
        InterfaceC1680b0.a aVar2 = c2036h.f18349c;
        Z.a aVar3 = (Z.a) (aVar2 != null ? new C2034f(abstractC1613aB, aVar2) : new C2035g(abstractC1613aB)).get();
        if (this.f13083C != null) {
            s();
        }
        if (!hVar.n()) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + hVar);
        }
        h.c andSet = hVar.f13150e.getAndSet(null);
        if (andSet == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + hVar);
        }
        Z.h hVarA = andSet.a(aVar3, f13078i0);
        this.f13083C = hVarA;
        C.S.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(hVarA.hashCode())));
        AbstractC1613a abstractC1613aB2 = abstractC1630s.b();
        AbstractC4257a abstractC4257a = (AbstractC4257a) (aVar2 != null ? new C2031c(c2036h.f18347a, c2036h.f18348b, q02, abstractC1613aB2, aVar3, aVar2) : new C2032d(c2036h.f18347a, c2036h.f18348b, q02, abstractC1613aB2, aVar3)).get();
        this.f13115f.getClass();
        d0.s sVar = new d0.s(this.f13111c, abstractC4257a);
        this.f13086F = sVar;
        k.b bVar = sVar.f37263f;
        if (!(bVar instanceof k.a)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        Z.h hVar2 = this.f13083C;
        hVar2.f13910a.execute(new RunnableC0615b(10, hVar2, (k.a) bVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(W.F.h r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.F.F(W.F$h, boolean):void");
    }

    public final void G(h hVar, long j4, int i10, Exception exc) throws Exception {
        if (this.f13123o != hVar || this.f13124p) {
            return;
        }
        this.f13124p = true;
        this.f13098R = i10;
        if (m()) {
            while (true) {
                M.a aVar = this.f13100T;
                if (aVar.c()) {
                    break;
                } else {
                    aVar.a();
                }
            }
            this.f13086F.n(j4);
        }
        d0.i iVar = this.f13099S;
        if (iVar != null) {
            iVar.close();
            this.f13099S = null;
        }
        if (this.f13103W != Z.a.ACTIVE_NON_STREAMING) {
            D d10 = new D(this.f13084D, 0);
            this.f13104X = E.u.H().schedule(new B.a(9, this.f13113d, d10), 1000L, TimeUnit.MILLISECONDS);
        } else {
            q(this.f13084D);
        }
        this.f13084D.n(j4);
    }

    public final void H(h hVar, boolean z10) {
        ArrayList arrayList = this.f13128t;
        if (!arrayList.isEmpty()) {
            I.q qVarB = I.j.b(arrayList);
            if (!qVarB.isDone()) {
                qVarB.cancel(true);
            }
            arrayList.clear();
        }
        arrayList.add(o0.b.a(new B.i(6, this, hVar)));
        if (m() && !z10) {
            arrayList.add(o0.b.a(new e0(4, this, hVar)));
        }
        I.j.a(I.j.b(arrayList), new e(), E.u.y());
    }

    public final void I() {
        h hVar = this.f13123o;
        if (hVar != null) {
            hVar.F(new a0.e(hVar.k(), j()));
        }
    }

    public final void J(j jVar) {
        if (!f13073d0.contains(this.i)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.i);
        }
        if (!f13074e0.contains(jVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + jVar);
        }
        if (this.f13118j != jVar) {
            this.f13118j = jVar;
            int i10 = this.f13119k;
            O.a aVarL = l(jVar);
            C0624k c0624k = this.f13125q;
            C1625m c1625m = O.f13174a;
            this.f13107a.g(new C1625m(i10, aVarL, c0624k));
        }
    }

    public final void K(d0.i iVar, h hVar) {
        long size = iVar.size() + this.f13090J;
        long j4 = this.f13096P;
        if (j4 != 0 && size > j4) {
            C.S.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f13096P)));
            r(hVar, 2, null);
            return;
        }
        long jR0 = iVar.r0();
        long j10 = this.f13093M;
        if (j10 == Long.MAX_VALUE) {
            this.f13093M = jR0;
            C.S.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jR0), Y.d.a(this.f13093M)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jR0 - Math.min(this.f13092L, j10));
            A2.l.q("There should be a previous data for adjusting the duration.", this.f13095O != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jR0 - this.f13095O) + nanos;
            long j11 = this.f13097Q;
            if (j11 != 0 && nanos2 > j11) {
                C.S.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f13097Q)));
                r(hVar, 9, null);
                return;
            }
        }
        this.f13081A.writeSampleData(this.f13129u.intValue(), iVar.w(), iVar.R());
        this.f13090J = size;
        this.f13095O = jR0;
    }

    public final void L(d0.i iVar, h hVar) {
        if (this.f13130v == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = iVar.size() + this.f13090J;
        long j4 = this.f13096P;
        long j10 = 0;
        if (j4 != 0 && size > j4) {
            C.S.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.f13096P)));
            r(hVar, 2, null);
            return;
        }
        long jR0 = iVar.r0();
        long j11 = this.f13092L;
        if (j11 == Long.MAX_VALUE) {
            this.f13092L = jR0;
            C.S.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jR0), Y.d.a(this.f13092L)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jR0 - Math.min(j11, this.f13093M));
            A2.l.q("There should be a previous data for adjusting the duration.", this.f13094N != Long.MAX_VALUE);
            long nanos2 = timeUnit.toNanos(jR0 - this.f13094N) + nanos;
            long j12 = this.f13097Q;
            if (j12 != 0 && nanos2 > j12) {
                C.S.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.f13097Q)));
                r(hVar, 9, null);
                return;
            }
            j10 = nanos;
        }
        this.f13081A.writeSampleData(this.f13130v.intValue(), iVar.w(), iVar.R());
        this.f13090J = size;
        this.f13091K = j10;
        this.f13094N = jR0;
        I();
    }

    @Override // W.Z
    public final void a(Z.a aVar) {
        this.f13113d.execute(new RunnableC0615b(8, this, aVar));
    }

    @Override // W.Z
    public final void b(k0 k0Var, Q0 q02) {
        synchronized (this.f13116g) {
            try {
                C.S.a("Recorder", "Surface is requested in state: " + this.i + ", Current surface: " + this.f13119k);
                if (this.i == j.ERROR) {
                    B(j.CONFIGURING);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13113d.execute(new N.d(this, k0Var, q02, 1));
    }

    @Override // W.Z
    public final InterfaceC1715t0<AbstractC1630s> c() {
        return this.f13082B;
    }

    @Override // W.Z
    public final InterfaceC1715t0<O> d() {
        return this.f13107a;
    }

    @Override // W.Z
    public final InterfaceC1715t0<Boolean> e() {
        return this.f13109b;
    }

    @Override // W.Z
    public final P f(C.r rVar) {
        return new N5.c((androidx.camera.core.impl.I) rVar);
    }

    public final void g(k0 k0Var, Q0 q02, boolean z10) {
        C1635x value;
        C1635x c1635x;
        if (k0Var.a()) {
            C.S.g("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        D7.c cVar = new D7.c(this, 10);
        H.g gVar = this.f13113d;
        k0Var.c(gVar, cVar);
        N5.c cVar2 = new N5.c((androidx.camera.core.impl.I) k0Var.f735e.a());
        C.C c10 = k0Var.f733c;
        C1627o c1627oE = cVar2.e(c10);
        Size size = k0Var.f732b;
        if (c1627oE == null) {
            c1635x = C1635x.f13313g;
        } else {
            TreeMap<Size, C1635x> treeMap = c1627oE.f13294b;
            Size size2 = M.c.f4110a;
            Map.Entry<Size, C1635x> entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry<Size, C1635x> entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            c1635x = value;
            if (c1635x == null) {
                c1635x = C1635x.f13313g;
            }
        }
        C.S.a("Recorder", "Using supported quality of " + c1635x + " for surface size " + size);
        if (c1635x != C1635x.f13313g) {
            C1627o c1627oE2 = cVar2.e(c10);
            Y.f fVarA = c1627oE2 == null ? null : c1627oE2.a(c1635x);
            this.f13127s = fVarA;
            if (fVarA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        i iVar = this.f13112c0;
        if (iVar != null && !iVar.f13160d) {
            iVar.f13160d = true;
            ScheduledFuture<?> scheduledFuture = iVar.f13162f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                iVar.f13162f = null;
            }
        }
        i iVar2 = new i(k0Var, q02, z10 ? f13079j0 : 0);
        this.f13112c0 = iVar2;
        x().addListener(new J4.h(iVar2, k0Var, q02, 2), gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0143 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:40:0x00e0, B:42:0x00e4, B:43:0x00f1, B:82:0x017e, B:47:0x00fc, B:49:0x0100, B:51:0x0106, B:57:0x0111, B:59:0x011c, B:62:0x0126, B:63:0x0139, B:66:0x013d, B:68:0x0143, B:69:0x0151, B:71:0x0155, B:73:0x015b, B:77:0x0163, B:78:0x016b, B:80:0x016f, B:96:0x01a7, B:97:0x01ae), top: B:106:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:40:0x00e0, B:42:0x00e4, B:43:0x00f1, B:82:0x017e, B:47:0x00fc, B:49:0x0100, B:51:0x0106, B:57:0x0111, B:59:0x011c, B:62:0x0126, B:63:0x0139, B:66:0x013d, B:68:0x0143, B:69:0x0151, B:71:0x0155, B:73:0x015b, B:77:0x0163, B:78:0x016b, B:80:0x016f, B:96:0x01a7, B:97:0x01ae), top: B:106:0x00e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.F.h(int):void");
    }

    public final void i(h hVar, int i10) {
        Uri uri = Uri.EMPTY;
        hVar.a(uri);
        AbstractC1632u abstractC1632uK = hVar.k();
        Throwable th = this.f13101U;
        int i11 = AbstractC1614b.f13234a;
        C1624l c1624lD = N.d(0L, 0L, new C1616d(1, 0.0d, th));
        A2.l.p(uri, "OutputUri cannot be null.");
        new C1620h(uri);
        A2.l.k("An error type is required.", i10 != 0);
        hVar.F(new a0.a(abstractC1632uK, c1624lD, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final W.C1624l j() {
        /*
            r9 = this;
            long r0 = r9.f13091K
            long r2 = r9.f13090J
            W.F$g r4 = r9.f13088H
            int r5 = r4.ordinal()
            if (r5 == 0) goto L44
            r6 = 2
            if (r5 == r6) goto L44
            r7 = 5
            r8 = 3
            if (r5 == r8) goto L2f
            r6 = 4
            if (r5 == r6) goto L2d
            if (r5 != r7) goto L19
            goto L45
        L19:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid internal audio state: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2d:
            r6 = r8
            goto L45
        L2f:
            W.F$h r4 = r9.f13123o
            if (r4 == 0) goto L3d
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.f13152g
            boolean r4 = r4.get()
            if (r4 == 0) goto L3d
            r6 = r7
            goto L45
        L3d:
            boolean r4 = r9.f13102V
            if (r4 == 0) goto L42
            goto L45
        L42:
            r6 = 0
            goto L45
        L44:
            r6 = 1
        L45:
            java.lang.Throwable r4 = r9.f13101U
            double r7 = r9.f13110b0
            int r5 = W.AbstractC1614b.f13234a
            W.d r5 = new W.d
            r5.<init>(r6, r7, r4)
            W.l r0 = W.N.d(r0, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W.F.j():W.l");
    }

    public final boolean m() {
        return this.f13088H == g.ENABLED;
    }

    public final boolean n() {
        h hVar = this.f13123o;
        return hVar != null && hVar.B();
    }

    public final h p(j jVar) {
        boolean z10;
        if (jVar == j.PENDING_PAUSED) {
            z10 = true;
        } else {
            if (jVar != j.PENDING_RECORDING) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z10 = false;
        }
        if (this.f13120l != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        C1623k c1623k = this.f13121m;
        if (c1623k == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.f13120l = c1623k;
        c1623k.f13153h.e(E.u.y(), new f());
        this.f13121m = null;
        if (z10) {
            B(j.PAUSED);
            return c1623k;
        }
        B(j.RECORDING);
        return c1623k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(W.F.h r11, int r12, java.lang.Exception r13) {
        /*
            r10 = this;
            java.lang.String r0 = "In-progress recording error occurred while in unexpected state: "
            W.F$h r1 = r10.f13123o
            if (r11 != r1) goto L58
            java.lang.Object r1 = r10.f13116g
            monitor-enter(r1)
            W.F$j r2 = r10.i     // Catch: java.lang.Throwable -> L32
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L32
            r3 = 0
            switch(r2) {
                case 0: goto L41;
                case 1: goto L1f;
                case 2: goto L1f;
                case 3: goto L41;
                case 4: goto L14;
                case 5: goto L14;
                case 6: goto L1f;
                case 7: goto L1f;
                case 8: goto L41;
                default: goto L13;
            }
        L13:
            goto L23
        L14:
            W.F$j r0 = W.F.j.STOPPING     // Catch: java.lang.Throwable -> L1b
            r10.B(r0)     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            goto L1f
        L1b:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L56
        L1f:
            W.k r0 = r10.f13120l     // Catch: java.lang.Throwable -> L32
            if (r11 != r0) goto L36
        L23:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L30
            r6 = -1
            r4 = r10
            r5 = r11
            r8 = r12
            r9 = r13
            r4.G(r5, r6, r8, r9)
            return
        L30:
            r4 = r10
            return
        L32:
            r0 = move-exception
            r4 = r10
        L34:
            r11 = r0
            goto L56
        L36:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3f
            java.lang.String r12 = "Internal error occurred for recording but it is not the active recording."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f
            throw r11     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            goto L34
        L41:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            W.F$j r13 = r4.i     // Catch: java.lang.Throwable -> L3f
            r12.append(r13)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L3f
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f
            throw r11     // Catch: java.lang.Throwable -> L3f
        L56:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r11
        L58:
            r4 = r10
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r12 = "Internal error occurred on recording that is not the current in-progress recording."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: W.F.r(W.F$h, int, java.lang.Exception):void");
    }

    public final void s() {
        Z.h hVar = this.f13083C;
        if (hVar == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.f13083C = null;
        C.S.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(hVar.hashCode())));
        I.j.a(o0.b.a(new M8.a(hVar, 8)), new a(hVar), E.u.y());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void t(boolean z10) {
        boolean z11;
        boolean z12;
        synchronized (this.f13116g) {
            try {
                z11 = true;
                z12 = false;
                switch (this.i) {
                    case CONFIGURING:
                    case IDLING:
                    case ERROR:
                        break;
                    case PENDING_RECORDING:
                    case PENDING_PAUSED:
                        J(j.RESETTING);
                        break;
                    case RECORDING:
                    case PAUSED:
                        A2.l.q("In-progress recording shouldn't be null when in state " + this.i, this.f13123o != null);
                        if (this.f13120l != this.f13123o) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!n()) {
                            B(j.RESETTING);
                            z12 = true;
                            z11 = false;
                        }
                        break;
                    case STOPPING:
                        B(j.RESETTING);
                        z11 = false;
                        break;
                    case RESETTING:
                    default:
                        z11 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z11) {
            if (z12) {
                G(this.f13123o, -1L, 4, null);
            }
        } else if (z10) {
            v();
        } else {
            u();
        }
    }

    public final void u() {
        if (this.f13086F != null) {
            C.S.a("Recorder", "Releasing audio encoder.");
            this.f13086F.f();
            this.f13086F = null;
            this.f13087G = null;
        }
        if (this.f13083C != null) {
            s();
        }
        y(g.INITIALIZING);
        v();
    }

    public final void v() {
        k0 k0Var;
        boolean z10 = true;
        if (this.f13084D != null) {
            C.S.a("Recorder", "Releasing video encoder.");
            Y y10 = this.f13108a0;
            if (y10 != null) {
                A2.l.q(null, y10.f13221d == this.f13084D);
                C.S.a("Recorder", "Releasing video encoder: " + this.f13084D);
                this.f13108a0.b();
                this.f13108a0 = null;
                this.f13084D = null;
                this.f13085E = null;
                A(null);
            } else {
                x();
            }
        }
        synchronized (this.f13116g) {
            try {
                switch (this.i.ordinal()) {
                    case 1:
                    case 2:
                        J(j.CONFIGURING);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (n()) {
                            z10 = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        B(j.CONFIGURING);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13105Y = false;
        if (!z10 || (k0Var = this.f13131w) == null || k0Var.a()) {
            return;
        }
        g(this.f13131w, this.f13132x, false);
    }

    public final void w() {
        if (f13073d0.contains(this.i)) {
            B(this.f13118j);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.i);
        }
    }

    public final A4.a<Void> x() {
        C.S.a("Recorder", "Try to safely release video encoder: " + this.f13084D);
        Y y10 = this.f13106Z;
        y10.a();
        return I.j.f(y10.f13226j);
    }

    public final void y(g gVar) {
        C.S.a("Recorder", "Transitioning audio state: " + this.f13088H + " --> " + gVar);
        this.f13088H = gVar;
    }

    public final void z(C0624k c0624k) {
        C.S.a("Recorder", "Update stream transformation info: " + c0624k);
        this.f13125q = c0624k;
        synchronized (this.f13116g) {
            C1711r0<O> c1711r0 = this.f13107a;
            int i10 = this.f13119k;
            O.a aVarL = l(this.i);
            C1625m c1625m = O.f13174a;
            c1711r0.g(new C1625m(i10, aVarL, c0624k));
        }
    }
}
