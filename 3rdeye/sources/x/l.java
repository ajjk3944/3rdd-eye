package x;

import G0.p;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.p0;
import x.g;
import x.h;
import x.i;

/* compiled from: SessionConfigurationCompat.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final c f47623a;

    /* compiled from: SessionConfigurationCompat.java */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfiguration f47624a;

        /* renamed from: b, reason: collision with root package name */
        public final List<f> f47625b;

        public a(ArrayList arrayList, H.g gVar, p0 p0Var) {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, l.a(arrayList), gVar, p0Var);
            this.f47624a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                f fVar = null;
                if (outputConfiguration != null) {
                    int i = Build.VERSION.SDK_INT;
                    g jVar = i >= 33 ? new j(outputConfiguration) : i >= 28 ? new i(new i.a(outputConfiguration)) : i >= 26 ? new h(new h.a(outputConfiguration)) : i >= 24 ? new g(new g.a(outputConfiguration)) : null;
                    if (jVar != null) {
                        fVar = new f(jVar);
                    }
                }
                arrayList2.add(fVar);
            }
            this.f47625b = Collections.unmodifiableList(arrayList2);
        }

        @Override // x.l.c
        public final e a() {
            return e.a(this.f47624a.getInputConfiguration());
        }

        @Override // x.l.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f47624a.getStateCallback();
        }

        @Override // x.l.c
        public final Object c() {
            return this.f47624a;
        }

        @Override // x.l.c
        public final Executor d() {
            return this.f47624a.getExecutor();
        }

        @Override // x.l.c
        public final int e() {
            return this.f47624a.getSessionType();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f47624a, ((a) obj).f47624a);
            }
            return false;
        }

        @Override // x.l.c
        public final List<f> f() {
            return this.f47625b;
        }

        @Override // x.l.c
        public final void g(CaptureRequest captureRequest) {
            this.f47624a.setSessionParameters(captureRequest);
        }

        @Override // x.l.c
        public final void h(e eVar) {
            this.f47624a.setInputConfiguration(eVar.f47603a.f47604a);
        }

        public final int hashCode() {
            return this.f47624a.hashCode();
        }
    }

    /* compiled from: SessionConfigurationCompat.java */
    public interface c {
        e a();

        CameraCaptureSession.StateCallback b();

        Object c();

        Executor d();

        int e();

        List<f> f();

        void g(CaptureRequest captureRequest);

        void h(e eVar);
    }

    public l(ArrayList arrayList, H.g gVar, p0 p0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f47623a = new b(arrayList, gVar, p0Var);
        } else {
            this.f47623a = new a(arrayList, gVar, p0Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(p.b(((f) it.next()).f47605a.i()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f47623a.equals(((l) obj).f47623a);
    }

    public final int hashCode() {
        return this.f47623a.hashCode();
    }

    /* compiled from: SessionConfigurationCompat.java */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final List<f> f47626a;

        /* renamed from: b, reason: collision with root package name */
        public final p0 f47627b;

        /* renamed from: c, reason: collision with root package name */
        public final H.g f47628c;

        /* renamed from: d, reason: collision with root package name */
        public e f47629d = null;

        public b(ArrayList arrayList, H.g gVar, p0 p0Var) {
            this.f47626a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f47627b = p0Var;
            this.f47628c = gVar;
        }

        @Override // x.l.c
        public final e a() {
            return this.f47629d;
        }

        @Override // x.l.c
        public final CameraCaptureSession.StateCallback b() {
            return this.f47627b;
        }

        @Override // x.l.c
        public final Object c() {
            return null;
        }

        @Override // x.l.c
        public final Executor d() {
            return this.f47628c;
        }

        @Override // x.l.c
        public final int e() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f47629d, bVar.f47629d)) {
                    List<f> list = this.f47626a;
                    int size = list.size();
                    List<f> list2 = bVar.f47626a;
                    if (size == list2.size()) {
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).equals(list2.get(i))) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // x.l.c
        public final List<f> f() {
            return this.f47626a;
        }

        @Override // x.l.c
        public final void h(e eVar) {
            this.f47629d = eVar;
        }

        public final int hashCode() {
            int iHashCode = this.f47626a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            e eVar = this.f47629d;
            int iHashCode2 = (eVar == null ? 0 : eVar.f47603a.f47604a.hashCode()) ^ i;
            return (iHashCode2 << 5) - iHashCode2;
        }

        @Override // x.l.c
        public final void g(CaptureRequest captureRequest) {
        }
    }
}
