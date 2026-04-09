package ph;

import android.content.Context;
import ch.n;
import com.google.android.exoplayer2.c1;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection$Factory;
import com.google.android.exoplayer2.y;
import h9.r2;
import java.lang.reflect.InvocationTargetException;
import oh.o;
import oh.p;

/* loaded from: classes.dex */
public final class j implements o {

    /* renamed from: a, reason: collision with root package name */
    public final p f20573a;

    public j(p pVar) {
        this.f20573a = pVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, pb.g] */
    public static y a(Context context, ak.a aVar, r2 r2Var, p pVar, com.google.android.exoplayer2.k kVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        com.google.android.exoplayer2.p pVar2 = new com.google.android.exoplayer2.p(context);
        qb.b.j(false);
        pVar2.f4363b = kVar;
        if (aVar != null) {
            androidx.media3.exoplayer.trackselection.b bVar = new androidx.media3.exoplayer.trackselection.b(aVar.f407a, aVar.f408d, aVar.f409g, aVar.f410r);
            try {
                int i10 = DefaultTrackSelector.f4553a;
                Object objNewInstance = DefaultTrackSelector.class.getConstructor(Context.class, ExoTrackSelection$Factory.class).newInstance(context, bVar);
                br.l.c(objNewInstance, "null cannot be cast to non-null type com.google.android.exoplayer2.trackselection.DefaultTrackSelector");
                DefaultTrackSelector defaultTrackSelector = (DefaultTrackSelector) objNewInstance;
                if (aVar.O) {
                    n.b("ExoplayerVideoPlayerFactory", "Ignoring Device Screen Resolution");
                    DefaultTrackSelector.Parameters.Builder builderBuildUpon = defaultTrackSelector.getParameters().buildUpon();
                    builderBuildUpon.clearViewportSizeConstraints();
                    defaultTrackSelector.setParameters(builderBuildUpon);
                }
                qb.b.j(false);
                pVar2.f4362a = defaultTrackSelector;
                n.b("ExoplayerVideoPlayerFactory", "AdaptiveTrackSelection set successfully");
            } catch (Exception e4) {
                n.d("ExoplayerVideoPlayerFactory", "AdaptiveTrackSelection exception", e4);
            }
            oh.e eVarB = oh.e.b(context, new ch.f());
            eVarB.f19455a = r2Var;
            pb.g gVarA = new yb.k(context, aVar, pVar, eVarB).a();
            qb.b.j(false);
            pVar2.f4364c = gVarA;
        }
        qb.b.j(false);
        return new y(null, pVar2.f4362a, pVar2.f4363b, pVar2.f4364c, null, false, null, 5000L, 15000L, null, 0L, null, null, null, c1.f4084b);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0172 A[PHI: r16
  0x0172: PHI (r16v2 boolean) = 
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v0 boolean)
  (r16v1 boolean)
  (r16v1 boolean)
  (r16v4 boolean)
 binds: [B:47:0x015d, B:49:0x016f, B:40:0x0133, B:42:0x0145, B:33:0x010c, B:35:0x0120, B:26:0x00e1, B:28:0x00f3, B:19:0x00b6, B:21:0x00c6, B:12:0x008c, B:14:0x009e, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oh.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final oh.i j(android.content.Context r18, int[] r19, ak.a r20, h9.r2 r21) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.j.j(android.content.Context, int[], ak.a, h9.r2):oh.i");
    }
}
