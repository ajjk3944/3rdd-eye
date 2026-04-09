package io.sentry.android.core;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.media3.common.b1;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.views.InputValidationResult;
import com.survicate.surveys.entities.views.InputValidator;
import h9.r2;
import io.sentry.b4;
import io.sentry.r3;
import io.sentry.x5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import u3.f1;
import u3.h1;

/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements b4, r3, io.sentry.util.d, InputValidator, u3.n, ne.h, je.y, k5.q, f6.a, dd.a, bg.a, j9.e, j9.g, bf.f, androidx.media3.common.h, dd.g, iq.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11779a;

    public /* synthetic */ u0(int i10) {
        this.f11779a = i10;
    }

    @Override // j9.g
    public void a(Exception exc) {
    }

    @Override // ne.h
    public Object apply(Object obj) {
        switch (this.f11779a) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ja.q) obj;
            case 15:
                lg.e eVar = (lg.e) obj;
                bm.d dVar = kg.o.f14386a;
                dVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    dVar.t(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            default:
                return (l6.o) obj;
        }
    }

    @Override // f6.a, ua.a
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // io.sentry.b4
    public void c(x5 x5Var) {
        io.sentry.util.a aVar = v0.f11786b;
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) throws Resources.NotFoundException {
        br.l.e(view, "view");
        f1 f1Var = h1Var.f23176a;
        Resources resources = view.getResources();
        br.l.d(resources, "getResources(...)");
        k3.d dVarF = resources.getBoolean(on.n.isLandscape) ? f1Var.f(143) : f1Var.f(135);
        br.l.b(dVarF);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(on.p.survicate_horizontal_insets_extra_padding);
        view.setPadding(dVarF.f14014a + dimensionPixelSize, view.getPaddingTop(), dVarF.f14016c + dimensionPixelSize, dVarF.f14017d);
        return h1Var;
    }

    @Override // androidx.media3.common.h
    public androidx.media3.common.i d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(o5.h1.f18957x);
        return parcelableArrayList == null ? new o5.h1(new b1[0]) : new o5.h1((b1[]) a5.a.p(b1.D, parcelableArrayList).toArray(new b1[0]));
    }

    @Override // io.sentry.util.d
    public Object e() {
        switch (this.f11779a) {
            case 2:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                    for (io.sentry.m mVar : io.sentry.m.values()) {
                        concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), mVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
            default:
                return io.sentry.config.a.R();
        }
    }

    @Override // bf.f
    public Object f(r2 r2Var) {
        Set setM = r2Var.m(bf.u.a(ng.a.class));
        ng.c cVar = ng.c.f17547b;
        if (cVar == null) {
            synchronized (ng.c.class) {
                try {
                    cVar = ng.c.f17547b;
                    if (cVar == null) {
                        cVar = new ng.c(0);
                        ng.c.f17547b = cVar;
                    }
                } finally {
                }
            }
        }
        return new ng.b(setM, cVar);
    }

    public void g(Object obj) {
        ((o5.u0) obj).f19070b.getClass();
    }

    @Override // io.sentry.r3
    public void i(io.sentry.z0 z0Var) {
        switch (this.f11779a) {
            case 1:
                br.l.e(z0Var, "it");
                z0Var.j(io.sentry.protocol.t.f12636d);
                break;
            default:
                z0Var.E(new io.sentry.android.replay.capture.e(5, z0Var));
                break;
        }
    }

    @Override // dd.a
    public Object j(dd.r rVar) throws IOException {
        int i10;
        Object obj;
        switch (this.f11779a) {
            case 11:
                i10 = 403;
                break;
            case 12:
                i10 = -1;
                break;
            default:
                synchronized (rVar.f7318a) {
                    cc.s.j("Task is not yet complete", rVar.f7320c);
                    if (rVar.f7321d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    if (IOException.class.isInstance(rVar.f7323f)) {
                        throw ((Throwable) IOException.class.cast(rVar.f7323f));
                    }
                    Exception exc = rVar.f7323f;
                    if (exc != null) {
                        throw new dd.f(exc);
                    }
                    obj = rVar.f7322e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                e0.q("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i10);
    }

    @Override // dd.g
    public dd.r o(Object obj) {
        switch (this.f11779a) {
            case 27:
                break;
            default:
                break;
        }
        return e5.u(null);
    }

    @Override // com.survicate.surveys.entities.views.InputValidator
    public InputValidationResult validate(Object obj) {
        br.l.e((String) obj, "it");
        return new InputValidationResult(true, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ u0(r2 r2Var) {
        this.f11779a = 14;
    }
}
