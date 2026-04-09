package on;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.survicate.surveys.infrastructure.network.RespondentApi;
import com.survicate.surveys.infrastructure.network.RespondentRequestFactory;
import com.survicate.surveys.infrastructure.network.SuggestionsRequestFactory;
import com.survicate.surveys.infrastructure.network.SurvicateHttpClient;
import com.survicate.surveys.infrastructure.network.SurvicateRespondentApi;
import com.survicate.surveys.infrastructure.network.SurvicateRespondentRequestFactory;
import com.survicate.surveys.infrastructure.network.SurvicateSuggestionsApi;
import com.survicate.surveys.infrastructure.network.SurvicateSuggestionsRequestFactory;
import com.survicate.surveys.infrastructure.network.SurvicateWorkspaceApi;
import com.survicate.surveys.infrastructure.network.SurvicateWorkspaceRequestFactory;
import com.survicate.surveys.infrastructure.network.WorkspaceApi;
import com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionApi;
import com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionSerializer;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionApi;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRepository;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRequestFactory;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionSerializer;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoaderImpl;
import com.survicate.surveys.infrastructure.serialization.JsonSerializationProvider;
import com.survicate.surveys.infrastructure.serialization.MoshiProvider;
import com.survicate.surveys.infrastructure.serialization.SurvicateJsonSerializer;
import com.survicate.surveys.infrastructure.serialization.SurvicateRespondentSerializer;
import com.survicate.surveys.infrastructure.serialization.SurvicateSerializer;
import com.survicate.surveys.infrastructure.serialization.SurvicateSuggestionsSerializer;
import com.survicate.surveys.infrastructure.serialization.SurvicateWorkspaceDeserializer;
import com.survicate.surveys.infrastructure.serialization.WorkspaceDeserializer;
import h7.r1;
import h9.r2;
import io.sentry.android.core.u0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import nk.j0;

/* loaded from: classes.dex */
public final class a0 {
    public a2.g A;
    public sm.f B;
    public SurvicateImageLoaderImpl C;
    public sm.m D;
    public sn.d E;
    public u0 F;
    public cg.e G;
    public r2 H;
    public of.b I;
    public SurvicateRespondentApi J;
    public SurvicateWorkspaceApi K;
    public SurvicateWorkspaceDeserializer L;
    public SurvicateWorkspaceRequestFactory M;
    public so.g N;
    public SurvicateSuggestionsApi O;
    public SurvicateSuggestionsRequestFactory P;
    public SurvicateSuggestionsSerializer Q;
    public SurvicateRespondentRequestFactory R;
    public SurvicateRespondentSerializer S;
    public i5.c T;
    public cg.e U;
    public r1 V;
    public SurvicateFollowUpQuestionRepository W;
    public SurvicateFollowUpQuestionApi X;
    public SurvicateFollowUpQuestionRequestFactory Y;
    public SurvicateFollowUpQuestionSerializer Z;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f19562a;

    /* renamed from: a0, reason: collision with root package name */
    public sm.m f19563a0;

    /* renamed from: b, reason: collision with root package name */
    public wo.d f19564b;

    /* renamed from: b0, reason: collision with root package name */
    public to.e f19565b0;

    /* renamed from: c, reason: collision with root package name */
    public e f19566c;

    /* renamed from: c0, reason: collision with root package name */
    public et.d f19567c0;

    /* renamed from: d, reason: collision with root package name */
    public k f19568d;

    /* renamed from: d0, reason: collision with root package name */
    public bm.d f19569d0;

    /* renamed from: e, reason: collision with root package name */
    public io.sentry.k f19570e;

    /* renamed from: e0, reason: collision with root package name */
    public io.sentry.hints.i f19571e0;

    /* renamed from: f, reason: collision with root package name */
    public cq.n f19572f;

    /* renamed from: f0, reason: collision with root package name */
    public js.e f19573f0;

    /* renamed from: g, reason: collision with root package name */
    public sm.f f19574g;

    /* renamed from: g0, reason: collision with root package name */
    public b9.e f19575g0;

    /* renamed from: h, reason: collision with root package name */
    public i0 f19576h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f19577i;
    public g1.f j;
    public om.f k;

    /* renamed from: l, reason: collision with root package name */
    public j0 f19578l;

    /* renamed from: m, reason: collision with root package name */
    public lu.c f19579m;

    /* renamed from: n, reason: collision with root package name */
    public SurvicateJsonSerializer f19580n;

    /* renamed from: o, reason: collision with root package name */
    public qm.c f19581o;

    /* renamed from: p, reason: collision with root package name */
    public SharedPreferences f19582p;

    /* renamed from: q, reason: collision with root package name */
    public g4.a f19583q;

    /* renamed from: r, reason: collision with root package name */
    public h7.h0 f19584r;

    /* renamed from: s, reason: collision with root package name */
    public kg.r f19585s;

    /* renamed from: t, reason: collision with root package name */
    public no.c f19586t;

    /* renamed from: u, reason: collision with root package name */
    public so.e f19587u;

    /* renamed from: v, reason: collision with root package name */
    public cq.o f19588v;

    /* renamed from: w, reason: collision with root package name */
    public io.sentry.hints.i f19589w;

    /* renamed from: x, reason: collision with root package name */
    public om.f f19590x;

    /* renamed from: y, reason: collision with root package name */
    public io.sentry.k f19591y;

    /* renamed from: z, reason: collision with root package name */
    public SurvicateHttpClient f19592z;

    public a0(Context context) {
        this.f19562a = new WeakReference(context);
    }

    public final synchronized r1 A() {
        if (this.V == null) {
            synchronized (this) {
                try {
                    if (this.C == null) {
                        this.C = new SurvicateImageLoaderImpl((Context) this.f19562a.get());
                    }
                    this.V = new r1(this.C);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.V;
    }

    public final synchronized WorkspaceApi B() {
        if (this.K == null) {
            synchronized (this) {
                try {
                    if (this.M == null) {
                        this.M = new SurvicateWorkspaceRequestFactory(z());
                    }
                    this.K = new SurvicateWorkspaceApi(this.M, C(), i());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.K;
    }

    public final synchronized WorkspaceDeserializer C() {
        if (this.L == null) {
            synchronized (this) {
                try {
                    if (this.f19578l == null) {
                        this.f19578l = MoshiProvider.provideMoshi();
                    }
                    this.L = new SurvicateWorkspaceDeserializer(this.f19578l);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.L;
    }

    public final synchronized g4.a D() {
        try {
            if (this.f19583q == null) {
                this.f19583q = new g4.a(this.f19562a, l());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19583q;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized wo.d a() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: on.a0.a():wo.d");
    }

    public final synchronized io.sentry.k b() {
        try {
            if (this.f19570e == null) {
                this.f19570e = new io.sentry.k(new Handler(Looper.getMainLooper()), c());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19570e;
    }

    public final synchronized k c() {
        so.e eVar;
        g1.f fVarR;
        io.sentry.hints.i iVar;
        if (this.f19568d == null) {
            qm.c cVarW = w();
            synchronized (this) {
                try {
                    if (this.f19587u == null) {
                        this.f19587u = new so.e(s(), q(), l());
                    }
                    eVar = this.f19587u;
                    fVarR = r();
                    synchronized (this) {
                        try {
                            if (this.f19589w == null) {
                                this.f19589w = new io.sentry.hints.i(19);
                            }
                            iVar = this.f19589w;
                        } finally {
                        }
                    }
                } finally {
                }
            }
            this.f19568d = new k(cVarW, eVar, fVarR, iVar);
        }
        return this.f19568d;
    }

    public final synchronized bm.d d() {
        try {
            if (this.f19569d0 == null) {
                this.f19569d0 = new bm.d(y());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19569d0;
    }

    public final synchronized to.d e() {
        try {
            if (this.f19565b0 == null) {
                to.e eVar = new to.e();
                to.a aVar = to.a.OPTIONAL;
                to.b bVar = to.b.ENABLED;
                this.f19565b0 = eVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19565b0;
    }

    public final synchronized of.b f() {
        try {
            if (this.I == null) {
                iq.f fVarY = y();
                no.b bVarL = l();
                du.f fVar = wt.d0.f24610a;
                this.I = new of.b(fVarY, bVarL, bu.n.f2983a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.I;
    }

    public final synchronized FollowUpQuestionApi g() {
        if (this.X == null) {
            synchronized (this) {
                try {
                    if (this.Y == null) {
                        this.Y = new SurvicateFollowUpQuestionRequestFactory(h(), z());
                    }
                    SurvicateFollowUpQuestionRequestFactory survicateFollowUpQuestionRequestFactory = this.Y;
                    FollowUpQuestionSerializer followUpQuestionSerializerH = h();
                    SurvicateHttpClient survicateHttpClientI = i();
                    du.f fVar = wt.d0.f24610a;
                    this.X = new SurvicateFollowUpQuestionApi(survicateFollowUpQuestionRequestFactory, followUpQuestionSerializerH, survicateHttpClientI, du.e.f7570g);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.X;
    }

    public final synchronized FollowUpQuestionSerializer h() {
        try {
            if (this.Z == null) {
                this.Z = new SurvicateFollowUpQuestionSerializer(j());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.Z;
    }

    public final synchronized SurvicateHttpClient i() {
        try {
            if (this.f19592z == null) {
                this.f19592z = new SurvicateHttpClient();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19592z;
    }

    public final synchronized lu.c j() {
        try {
            if (this.f19579m == null) {
                this.f19579m = JsonSerializationProvider.provide();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19579m;
    }

    public final synchronized h7.h0 k() {
        Application application;
        try {
            if (this.f19584r == null && (application = (Application) this.f19562a.get()) != null) {
                h7.h0 h0Var = new h7.h0();
                no.a aVar = new no.a(2, false);
                h0Var.f10078a = aVar;
                aVar.g(h7.h0.B());
                application.registerReceiver(new a5.s(6, h0Var), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
                this.f19584r = h0Var;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19584r;
    }

    public final synchronized no.b l() {
        try {
            if (this.f19574g == null) {
                this.f19574g = new sm.f(18);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19574g;
    }

    public final synchronized RespondentApi m() {
        try {
            if (this.J == null) {
                this.J = new SurvicateRespondentApi(i(), n());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.J;
    }

    public final synchronized RespondentRequestFactory n() {
        if (this.R == null) {
            synchronized (this) {
                try {
                    if (this.S == null) {
                        this.S = new SurvicateRespondentSerializer(j());
                    }
                    this.R = new SurvicateRespondentRequestFactory(this.S, z());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.R;
    }

    public final synchronized iq.b o() {
        Context context;
        try {
            if (this.f19585s == null && (context = (Context) this.f19562a.get()) != null) {
                this.f19585s = new kg.r(context, l());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19585s;
    }

    public final synchronized b9.e p() {
        try {
            if (this.f19575g0 == null) {
                this.f19575g0 = new b9.e(wt.d0.f24610a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19575g0;
    }

    public final synchronized SurvicateSerializer q() {
        try {
            if (this.f19580n == null) {
                this.f19580n = new SurvicateJsonSerializer(j());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19580n;
    }

    public final synchronized g1.f r() {
        try {
            if (this.j == null) {
                g1.f fVar = new g1.f();
                fVar.f9211r = new LinkedHashMap();
                fVar.f9210g = mq.y.f16947a;
                this.j = fVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.j;
    }

    public final synchronized SharedPreferences s() {
        Application application;
        try {
            if (this.f19582p == null && (application = (Application) this.f19562a.get()) != null) {
                this.f19582p = application.getSharedPreferences("Survicate", 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19582p;
    }

    public final synchronized uo.c t() {
        if (this.N == null) {
            synchronized (this) {
                try {
                    if (this.O == null) {
                        this.O = new SurvicateSuggestionsApi(i(), u());
                    }
                    SurvicateSuggestionsApi survicateSuggestionsApi = this.O;
                    no.b bVarL = l();
                    du.f fVar = wt.d0.f24610a;
                    this.N = new so.g(survicateSuggestionsApi, bVarL, du.e.f7570g);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.N;
    }

    public final synchronized SuggestionsRequestFactory u() {
        if (this.P == null) {
            po.a aVarZ = z();
            synchronized (this) {
                try {
                    if (this.Q == null) {
                        this.Q = new SurvicateSuggestionsSerializer(j());
                    }
                    this.P = new SurvicateSuggestionsRequestFactory(aVarZ, this.Q);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.P;
    }

    public final synchronized i5.c v() {
        try {
            if (this.T == null) {
                i5.c cVar = new i5.c();
                cVar.f11238a = mq.w.f16945a;
                this.T = cVar;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.T;
    }

    public final synchronized qm.c w() {
        if (this.f19581o == null) {
            SharedPreferences sharedPreferencesS = s();
            SurvicateSerializer survicateSerializerQ = q();
            synchronized (this) {
                try {
                    if (this.f19563a0 == null) {
                        br.l.e(j(), "jsonSerialization");
                        this.f19563a0 = new sm.m();
                    }
                    this.f19581o = new qm.c(sharedPreferencesS, survicateSerializerQ, this.f19563a0, l());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19581o;
    }

    public final synchronized cq.o x() {
        if (this.f19588v == null) {
            g1.f fVarR = r();
            g1.f fVarR2 = r();
            k kVarC = c();
            k kVarC2 = c();
            k kVarC3 = c();
            k kVarC4 = c();
            of.b bVarF = f();
            h7.h0 h0VarK = k();
            iq.b bVarO = o();
            g1.f fVarR3 = r();
            g1.f fVarR4 = r();
            synchronized (this) {
                try {
                    if (this.G == null) {
                        this.G = new cg.e();
                    }
                    this.f19588v = new cq.o(fVarR, fVarR2, kVarC, kVarC2, kVarC3, kVarC4, bVarF, h0VarK, bVarO, fVarR3, fVarR4, this.G, y(), d(), l());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19588v;
    }

    public final synchronized iq.f y() {
        try {
            if (this.F == null) {
                this.F = new u0(29);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.F;
    }

    public final synchronized po.a z() {
        if (this.f19591y == null) {
            synchronized (this) {
                try {
                    if (this.f19590x == null) {
                        this.f19590x = new om.f((Context) this.f19562a.get(), l());
                    }
                    this.f19591y = new io.sentry.k(this.f19590x, D());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f19591y;
    }
}
