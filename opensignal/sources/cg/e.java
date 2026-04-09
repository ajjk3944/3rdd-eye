package cg;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.util.Base64;
import android.util.Log;
import androidx.cardview.widget.CardView;
import ca.o;
import ca.u;
import ch.n;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import cv.w;
import h7.s1;
import h9.r2;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import k2.v;
import oh.p;
import ou.b0;
import ou.c0;
import p.l2;
import pb.o0;
import pb.p0;
import rs.r;

/* loaded from: classes.dex */
public final class e implements p0, com.google.android.exoplayer2.i, com.opensignal.sdk.common.measurements.base.f, ff.a, s1, v, ka.f, kf.c, r, o0, bf.f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e f3752a = new e();

    public static final float j(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i11 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i11];
            float f19 = fArr[i10];
            f11 = fArr2[i11];
            f12 = f18;
            f13 = fArr2[i10];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static final c0 k(c0 c0Var) {
        if ((c0Var != null ? c0Var.B : null) == null) {
            return c0Var;
        }
        b0 b0VarH = c0Var.h();
        b0VarH.f19875g = null;
        return b0VarH.a();
    }

    public static uo.b m(long j, Long l10, String str) {
        return new uo.b(j, e5.J(str), new un.g(j, l10));
    }

    public static byte[] n(String str) {
        br.l.e(str, "data");
        byte[] bArrDecode = Base64.decode(str, 2);
        br.l.d(bArrDecode, "decode(...)");
        return bArrDecode;
    }

    public static w q(String str) {
        br.l.e(str, "<this>");
        cv.j jVar = dv.c.f7592a;
        cv.g gVar = new cv.g();
        gVar.u0(str);
        return dv.c.d(gVar, false);
    }

    public static w r(File file) {
        String str = w.f6742d;
        br.l.e(file, "<this>");
        String string = file.toString();
        br.l.d(string, "toString(...)");
        return q(string);
    }

    public static boolean s(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer A(NetworkRegistrationInfo networkRegistrationInfo) {
        Parcel parcelObtain = Parcel.obtain();
        br.l.d(parcelObtain, "obtain(...)");
        networkRegistrationInfo.writeToParcel(parcelObtain, 1);
        parcelObtain.setDataPosition(0);
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readInt();
        parcelObtain.readBoolean();
        parcelObtain.readList(new ArrayList(), Integer.TYPE.getClassLoader());
        parcelObtain.readParcelable(a1.h.o().getClassLoader());
        parcelObtain.readParcelable(Parcelable.class.getClassLoader());
        parcelObtain.readParcelable(Parcelable.class.getClassLoader());
        int i10 = parcelObtain.readInt();
        n.b("ServiceStateParcelApi30", "getNrState() return: = [" + i10 + ']');
        return Integer.valueOf(i10);
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public Integer B(ServiceState serviceState) {
        return i3.g.s(this, serviceState);
    }

    @Override // ka.f
    public u c() {
        return new o(-9223372036854775807L);
    }

    @Override // kf.c
    public String e() {
        return null;
    }

    @Override // bf.f
    public /* synthetic */ Object f(r2 r2Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(r2Var);
    }

    @Override // ka.f
    public long g(ca.l lVar) {
        return -1L;
    }

    @Override // ff.a
    public void l(Bundle bundle) {
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    public void o(g1 g1Var) {
        int iE;
        int iE2;
        androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
        if (oVar.getCurrentTimeline().p() || oVar.isPlayingAd()) {
            return;
        }
        w1 currentTimeline = oVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            iE = -1;
        } else {
            int currentWindowIndex = oVar.getCurrentWindowIndex();
            int repeatMode = oVar.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = currentTimeline.e(currentWindowIndex, oVar.getShuffleModeEnabled(), repeatMode);
        }
        if (!(iE != -1)) {
            if (oVar.isCurrentWindowLive()) {
                w1 currentTimeline2 = oVar.getCurrentTimeline();
                if (!currentTimeline2.p() && currentTimeline2.m(oVar.getCurrentWindowIndex(), (v1) oVar.f1504d, 0L).f4748i) {
                    oVar.seekTo(oVar.getCurrentWindowIndex(), -9223372036854775807L);
                    return;
                }
                return;
            }
            return;
        }
        w1 currentTimeline3 = oVar.getCurrentTimeline();
        if (currentTimeline3.p()) {
            iE2 = -1;
        } else {
            int currentWindowIndex2 = oVar.getCurrentWindowIndex();
            int repeatMode2 = oVar.getRepeatMode();
            iE2 = currentTimeline3.e(currentWindowIndex2, oVar.getShuffleModeEnabled(), repeatMode2 != 1 ? repeatMode2 : 0);
        }
        if (iE2 != -1) {
            oVar.seekTo(iE2, -9223372036854775807L);
        }
    }

    public void p(g1 g1Var) {
        int iK;
        int iK2;
        int iK3;
        androidx.lifecycle.o oVar = (androidx.lifecycle.o) g1Var;
        if (oVar.getCurrentTimeline().p() || oVar.isPlayingAd()) {
            return;
        }
        w1 currentTimeline = oVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            iK = -1;
        } else {
            int currentWindowIndex = oVar.getCurrentWindowIndex();
            int repeatMode = oVar.getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = currentTimeline.k(currentWindowIndex, oVar.getShuffleModeEnabled(), repeatMode);
        }
        boolean z10 = iK != -1;
        if (oVar.isCurrentWindowLive() && !oVar.isCurrentWindowSeekable()) {
            if (z10) {
                w1 currentTimeline2 = oVar.getCurrentTimeline();
                if (currentTimeline2.p()) {
                    iK3 = -1;
                } else {
                    int currentWindowIndex2 = oVar.getCurrentWindowIndex();
                    int repeatMode2 = oVar.getRepeatMode();
                    iK3 = currentTimeline2.k(currentWindowIndex2, oVar.getShuffleModeEnabled(), repeatMode2 != 1 ? repeatMode2 : 0);
                }
                if (iK3 != -1) {
                    oVar.seekTo(iK3, -9223372036854775807L);
                    return;
                }
                return;
            }
            return;
        }
        if (z10) {
            long currentPosition = oVar.getCurrentPosition();
            oVar.getMaxSeekToPreviousPosition();
            if (currentPosition <= 3000) {
                w1 currentTimeline3 = oVar.getCurrentTimeline();
                if (currentTimeline3.p()) {
                    iK2 = -1;
                } else {
                    int currentWindowIndex3 = oVar.getCurrentWindowIndex();
                    int repeatMode3 = oVar.getRepeatMode();
                    iK2 = currentTimeline3.k(currentWindowIndex3, oVar.getShuffleModeEnabled(), repeatMode3 != 1 ? repeatMode3 : 0);
                }
                if (iK2 != -1) {
                    oVar.seekTo(iK2, -9223372036854775807L);
                    return;
                }
                return;
            }
        }
        oVar.seekTo(oVar.getCurrentWindowIndex(), 0L);
    }

    @Override // pb.p0
    public Object parse(Uri uri, InputStream inputStream) {
        return Long.valueOf(qb.v.E(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }

    @Override // com.opensignal.sdk.common.measurements.base.f
    public String t() {
        return "ServiceStateParcelApi30";
    }

    public void u(q3.a aVar, float f10) {
        t.a aVar2 = (t.a) ((Drawable) aVar.f20679d);
        CardView cardView = (CardView) aVar.f20680g;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f10 != aVar2.f22368e || aVar2.f22369f != useCompatPadding || aVar2.f22370g != preventCornerOverlap) {
            aVar2.f22368e = f10;
            aVar2.f22369f = useCompatPadding;
            aVar2.f22370g = preventCornerOverlap;
            aVar2.b(null);
            aVar2.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            aVar.Q0(0, 0, 0, 0);
            return;
        }
        t.a aVar3 = (t.a) ((Drawable) aVar.f20679d);
        float f11 = aVar3.f22368e;
        float f12 = aVar3.f22364a;
        int iCeil = (int) Math.ceil(t.b.a(f11, f12, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(t.b.b(f11, f12, cardView.getPreventCornerOverlap()));
        aVar.Q0(iCeil, iCeil2, iCeil, iCeil2);
    }

    public String v(ej.a aVar) {
        br.l.e(aVar, "dependency");
        if (!b9.c.l(aVar)) {
            return null;
        }
        if (aVar == ej.b.EXOPLAYER) {
            return p.A();
        }
        if (aVar == ej.c.MEDIA3) {
            return l2.E();
        }
        return null;
    }

    @Override // pb.o0
    public void a() {
    }

    @Override // kf.c
    public void b() {
    }

    @Override // ka.f
    public void d(long j) {
    }

    @Override // h7.s1
    public long i(long j) {
        return j;
    }

    @Override // kf.c
    public void h(long j, String str) {
    }
}
