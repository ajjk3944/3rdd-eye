package androidx.lifecycle;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.CellIdentity;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.view.View;
import androidx.media3.common.z0;
import com.google.android.exoplayer2.Player$Listener;
import com.google.android.exoplayer2.g1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.w1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.a1;
import zc.c1;
import zc.k1;

/* loaded from: classes.dex */
public abstract class o implements androidx.media3.common.s0, bt.d, g1, sr.a, y8.e, k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1503a;

    /* renamed from: d, reason: collision with root package name */
    public Object f1504d;

    public /* synthetic */ o(int i10, Object obj) {
        this.f1503a = i10;
        this.f1504d = obj;
    }

    public static /* synthetic */ void S0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void T0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static JSONArray c1(CellIdentity cellIdentity) {
        Set additionalPlmns = Collections.EMPTY_SET;
        if (a2.b.z(cellIdentity)) {
            additionalPlmns = a2.b.h(cellIdentity).getAdditionalPlmns();
        } else if (cellIdentity instanceof CellIdentityLte) {
            additionalPlmns = ((CellIdentityLte) cellIdentity).getAdditionalPlmns();
        } else if (cellIdentity instanceof CellIdentityWcdma) {
            additionalPlmns = ((CellIdentityWcdma) cellIdentity).getAdditionalPlmns();
        } else if (fh.b.w(cellIdentity)) {
            additionalPlmns = fh.b.i(cellIdentity).getAdditionalPlmns();
        } else if (cellIdentity instanceof CellIdentityGsm) {
            additionalPlmns = ((CellIdentityGsm) cellIdentity).getAdditionalPlmns();
        }
        JSONArray jSONArray = new JSONArray();
        if (additionalPlmns != null) {
            Iterator it = additionalPlmns.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        return jSONArray;
    }

    @Override // zc.k1
    public gc.a C0() {
        throw null;
    }

    @Override // zc.k1
    public a1 J() {
        throw null;
    }

    @Override // y8.e
    public List O0() {
        return (List) this.f1504d;
    }

    @Override // y8.e
    public boolean Q0() {
        List list = (List) this.f1504d;
        return list.isEmpty() || (list.size() == 1 && ((f9.a) list.get(0)).c());
    }

    public void U0(String str, com.squareup.picasso.s sVar) {
        fh.d dVar = new fh.d(Integer.valueOf(sVar.f5978d), "TYPE");
        fh.d dVar2 = new fh.d(Integer.valueOf(sVar.f5979g), "SUBTYPE");
        fh.d dVar3 = new fh.d((Boolean) sVar.f5980r, "IS_CONNECTED");
        fh.f fVar = (fh.f) this.f1504d;
        long jY0 = Y0();
        fVar.getClass();
        fVar.h(new fh.e(str, new fh.d[]{dVar, dVar2, dVar3}, jY0, 0));
    }

    public abstract void V0(u uVar);

    public void W0(CellInfo cellInfo, ch.f fVar) throws JSONException {
        long timeStamp;
        long millis;
        JSONObject jSONObject = (JSONObject) this.f1504d;
        if (fVar.f()) {
            millis = cellInfo.getTimestampMillis();
            timeStamp = TimeUnit.MILLISECONDS.toNanos(millis);
        } else {
            timeStamp = cellInfo.getTimeStamp();
            millis = TimeUnit.NANOSECONDS.toMillis(cellInfo.getTimeStamp());
        }
        jSONObject.put("timestamp_absolute", System.currentTimeMillis() - (SystemClock.elapsedRealtime() - millis));
        jSONObject.put("timestamp", timeStamp);
    }

    public abstract void X0(kg.r rVar);

    public abstract long Y0();

    @Override // zc.k1
    public zc.d Z() {
        throw null;
    }

    public abstract void Z0(o oVar);

    public void a1() {
        ch.n.b("TriggerDataSource", "dataSourceUpdated() " + getClass().getName() + " called with listener " + g1());
        hk.k kVarG1 = g1();
        if (kVarG1 != null) {
            List listI1 = i1();
            br.l.e(listI1, "triggerTypeList");
            ch.n.b("TaskScheduler", "onTrigger() called with: triggerDataSource = " + this + ", triggerTypeList = " + listI1);
            synchronized (kVarG1.f10841n) {
                ch.n.b("TaskScheduler", "Checking triggers against ".concat(getClass().getSimpleName()));
                kVarG1.p();
                kVarG1.j(this);
                kVarG1.k(h1());
            }
        }
    }

    public void addMediaItem(int i10, androidx.media3.common.e0 e0Var) {
        ((d5.z) this).addMediaItems(i10, oe.h0.p(e0Var));
    }

    public void addMediaItems(List list) {
        ((d5.z) this).addMediaItems(Integer.MAX_VALUE, list);
    }

    public void b1(cj.e eVar, o oVar) {
        ch.d dVar = (ch.d) this.f1504d;
        Bundle bundle = (Bundle) oVar.f1504d;
        switch (eVar == null ? -1 : cj.b.f3979a[eVar.ordinal()]) {
            case 1:
                ch.n.b("CommandExecutor", "Initialise SDK");
                String string = bundle.getString("API_KEY", "");
                n1(oVar, new dj.b(dVar, string != null ? string : ""));
                return;
            case 2:
            case 3:
                ch.n.b("CommandExecutor", "Start monitoring");
                n1(oVar, new dj.g(dVar));
                return;
            case 4:
                ch.n.b("CommandExecutor", "Stop monitoring");
                n1(oVar, new dj.h(dVar, 0));
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                ch.n.b("CommandExecutor", "scheduleTask");
                long j = bundle.getLong("SCHEDULE_TASK_ID");
                String string2 = bundle.getString("SCHEDULE_TASK_TYPE", "");
                String str = string2 == null ? "" : string2;
                String string3 = bundle.getString("SCHEDULE_JOB_NAME", "");
                String str2 = string3 == null ? "" : string3;
                String string4 = bundle.getString("TASK_NAME_OVERRIDE", "");
                n1(oVar, new dj.c((ch.d) this.f1504d, j, str, str2, gk.c.f9614o, string4 == null ? "" : string4));
                return;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                ch.n.b("CommandExecutor", "Reschedule Tasks");
                n1(oVar, new cj.q(dVar));
                return;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ch.n.b("CommandExecutor", "consentUpdated");
                n1(oVar, new dj.e(dVar, bundle.getBoolean("CONSENT_GIVEN", false)));
                return;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                ch.n.b("CommandExecutor", "appVisibilityUpdated");
                n1(oVar, new dj.d(dVar, bundle.getBoolean("APP_VISIBLE", false)));
                return;
            case 9:
                ch.n.b("CommandExecutor", "pokeSdkAfterUpgrade");
                n1(oVar, new io.sentry.internal.debugmeta.c(dVar));
                return;
            case 10:
                ch.n.b("CommandExecutor", "updateSdkConfigJsonCommand");
                String string5 = bundle.getString("SDK_TASK_CONFIG", "");
                n1(oVar, new dj.j(dVar, string5 != null ? string5 : ""));
                return;
            case 11:
                ch.n.b("CommandExecutor", "stopTask");
                n1(oVar, new dj.i(dVar, bundle.getLong("TASK_ID")));
                return;
            case 12:
                n1(oVar, new dj.a(dVar));
                return;
            case 13:
                String string6 = bundle.getString("REGISTRATION_KEY");
                om.f fVarU = dVar.U();
                if (dVar.Z4 == null) {
                    dVar.Z4 = new io.sentry.hints.i(6);
                }
                io.sentry.hints.i iVar = dVar.Z4;
                if (iVar != null) {
                    n1(oVar, new dj.f(fVarU, string6, iVar));
                    return;
                } else {
                    br.l.l("_registrationKeyValidator");
                    throw null;
                }
            default:
                ch.n.g("CommandExecutor", "executionType is null");
                ch.n.g("CommandExecutor", ic.a.z(bundle));
                Z0(oVar);
                return;
        }
    }

    @Override // com.google.android.exoplayer2.g1
    public void c0(Player$Listener player$Listener) {
        L(player$Listener);
    }

    public boolean canAdvertiseSession() {
        return true;
    }

    public void clearMediaItems() {
        ((d5.z) this).removeMediaItems(0, Integer.MAX_VALUE);
    }

    public abstract String d1();

    public abstract n e1();

    public abstract gk.c f1(gk.c cVar, int i10, long j);

    public hk.k g1() {
        return (hk.k) this.f1504d;
    }

    @Override // sr.a
    public sr.h getAnnotations() {
        sr.h hVar = (sr.h) this.f1504d;
        if (hVar != null) {
            return hVar;
        }
        T0(1);
        throw null;
    }

    public int getBufferedPercentage() {
        d5.z zVar = (d5.z) this;
        long bufferedPosition = zVar.getBufferedPosition();
        long duration = zVar.getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return a5.d0.h((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    public long getContentDuration() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return -9223372036854775807L;
        }
        return a5.d0.P(currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).J);
    }

    public long getCurrentLiveOffset() {
        z0 z0Var = (z0) this.f1504d;
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p() || currentTimeline.m(zVar.getCurrentMediaItemIndex(), z0Var, 0L).f1847y == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (a5.d0.u(z0Var.B) - z0Var.f1847y) - zVar.getContentPosition();
    }

    public Object getCurrentManifest() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return null;
        }
        return currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).f1845r;
    }

    public androidx.media3.common.e0 getCurrentMediaItem() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return null;
        }
        return currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).f1844g;
    }

    @Override // com.google.android.exoplayer2.g1
    public int getCurrentWindowIndex() {
        return ((d5.z) this).getCurrentMediaItemIndex();
    }

    public androidx.media3.common.e0 getMediaItemAt(int i10) {
        return ((d5.z) this).getCurrentTimeline().m(i10, (z0) this.f1504d, 0L).f1844g;
    }

    public int getMediaItemCount() {
        return ((d5.z) this).getCurrentTimeline().o();
    }

    public int getNextMediaItemIndex() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return -1;
        }
        int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
        zVar.R1();
        int i10 = zVar.f7113c0;
        if (i10 == 1) {
            i10 = 0;
        }
        zVar.R1();
        return currentTimeline.e(currentMediaItemIndex, zVar.f7114d0, i10);
    }

    public int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    public int getPreviousMediaItemIndex() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        if (currentTimeline.p()) {
            return -1;
        }
        int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
        zVar.R1();
        int i10 = zVar.f7113c0;
        if (i10 == 1) {
            i10 = 0;
        }
        zVar.R1();
        return currentTimeline.k(currentMediaItemIndex, zVar.f7114d0, i10);
    }

    public int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // bt.d
    public ht.x getType() {
        ht.x xVar = (ht.x) this.f1504d;
        if (xVar != null) {
            return xVar;
        }
        S0(1);
        throw null;
    }

    public abstract jj.m0 h1();

    public boolean hasNext() {
        return hasNextMediaItem();
    }

    public boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    public boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    public boolean hasPrevious() {
        return hasPreviousMediaItem();
    }

    public boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    public boolean hasPreviousWindow() {
        return hasPreviousMediaItem();
    }

    public abstract List i1();

    public boolean isCommandAvailable(int i10) {
        switch (this.f1503a) {
            case 1:
                d5.z zVar = (d5.z) this;
                zVar.R1();
                return zVar.f7124m0.f1731a.f1732a.get(i10);
            default:
                return r0().f4085a.f20777a.get(i10);
        }
    }

    public boolean isCurrentMediaItemDynamic() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).E;
    }

    public boolean isCurrentMediaItemLive() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).a();
    }

    public boolean isCurrentMediaItemSeekable() {
        d5.z zVar = (d5.z) this;
        androidx.media3.common.a1 currentTimeline = zVar.getCurrentTimeline();
        return !currentTimeline.p() && currentTimeline.m(zVar.getCurrentMediaItemIndex(), (z0) this.f1504d, 0L).D;
    }

    public boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    public boolean isCurrentWindowLive() {
        switch (this.f1503a) {
            case 1:
                return isCurrentMediaItemLive();
            default:
                w1 currentTimeline = getCurrentTimeline();
                return !currentTimeline.p() && currentTimeline.m(getCurrentWindowIndex(), (v1) this.f1504d, 0L).a();
        }
    }

    public boolean isCurrentWindowSeekable() {
        switch (this.f1503a) {
            case 1:
                return isCurrentMediaItemSeekable();
            default:
                w1 currentTimeline = getCurrentTimeline();
                return !currentTimeline.p() && currentTimeline.m(getCurrentWindowIndex(), (v1) this.f1504d, 0L).f4747h;
        }
    }

    public boolean isPlaying() {
        d5.z zVar = (d5.z) this;
        return zVar.getPlaybackState() == 3 && zVar.getPlayWhenReady() && zVar.getPlaybackSuppressionReason() == 0;
    }

    public boolean j1(gk.c cVar) {
        br.l.e(cVar, "schedule");
        ((df.c) this.f1504d).getClass();
        return System.currentTimeMillis() >= cVar.f9622h;
    }

    public void k0(Network network, NetworkCapabilities networkCapabilities) {
        a1();
    }

    public boolean k1() {
        o4.w0 w0VarA;
        o4.s0 s0Var = (o4.s0) this.f1504d;
        View view = s0Var.f18852c.f1413e0;
        if (view != null) {
            o4.w0.Companion.getClass();
            w0VarA = o4.u0.a(view);
        } else {
            w0VarA = null;
        }
        o4.w0 w0Var = s0Var.f18850a;
        if (w0VarA == w0Var) {
            return true;
        }
        o4.w0 w0Var2 = o4.w0.VISIBLE;
        return (w0VarA == w0Var2 || w0Var == w0Var2) ? false : true;
    }

    public void l1(com.squareup.picasso.s sVar) {
        ch.n.b("OnNetworkChangedListene", "onNetworkChanged() called with: networkType = [" + sVar + "]");
        U0("NETWORK_CHANGED", sVar);
    }

    public abstract void m1(u uVar);

    public void moveMediaItem(int i10, int i11) {
        if (i10 != i11) {
            ((d5.z) this).moveMediaItems(i10, i10 + 1, i11);
        }
    }

    public void n1(o oVar, cj.n nVar) {
        ((ch.d) this.f1504d).I().execute(new ch.a(nVar, this, oVar, 1));
    }

    public void next() {
        seekToNextMediaItem();
    }

    public abstract void o1(int i10, long j, boolean z10);

    public void p1(int i10, long j) {
        d5.z zVar = (d5.z) this;
        long currentPosition = zVar.getCurrentPosition() + j;
        long duration = zVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        o1(zVar.getCurrentMediaItemIndex(), Math.max(currentPosition, 0L), false);
    }

    public void pause() {
        ((d5.z) this).setPlayWhenReady(false);
    }

    public void play() {
        ((d5.z) this).setPlayWhenReady(true);
    }

    public void previous() {
        seekToPreviousMediaItem();
    }

    public void q1(int i10) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            return;
        }
        d5.z zVar = (d5.z) this;
        if (previousMediaItemIndex == zVar.getCurrentMediaItemIndex()) {
            o1(zVar.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            o1(previousMediaItemIndex, -9223372036854775807L, false);
        }
    }

    public void r1(hk.k kVar) {
        this.f1504d = kVar;
    }

    public void removeMediaItem(int i10) {
        ((d5.z) this).removeMediaItems(i10, i10 + 1);
    }

    public void s1() {
        a1 a1Var = ((c1) this.f1504d).B;
        c1.g(a1Var);
        a1Var.s1();
    }

    public void seekBack() {
        d5.z zVar = (d5.z) this;
        zVar.R1();
        p1(11, -zVar.R);
    }

    public void seekForward() {
        d5.z zVar = (d5.z) this;
        zVar.R1();
        p1(12, zVar.S);
    }

    @Override // com.google.android.exoplayer2.g1
    public void seekTo(int i10, long j) {
        o1(i10, j, false);
    }

    public void seekToDefaultPosition() {
        o1(((d5.z) this).getCurrentMediaItemIndex(), -9223372036854775807L, false);
    }

    public void seekToNext() {
        d5.z zVar = (d5.z) this;
        if (zVar.getCurrentTimeline().p() || zVar.isPlayingAd()) {
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                o1(zVar.getCurrentMediaItemIndex(), -9223372036854775807L, false);
                return;
            }
            return;
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        if (nextMediaItemIndex == zVar.getCurrentMediaItemIndex()) {
            o1(zVar.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            o1(nextMediaItemIndex, -9223372036854775807L, false);
        }
    }

    public void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            return;
        }
        d5.z zVar = (d5.z) this;
        if (nextMediaItemIndex == zVar.getCurrentMediaItemIndex()) {
            o1(zVar.getCurrentMediaItemIndex(), -9223372036854775807L, true);
        } else {
            o1(nextMediaItemIndex, -9223372036854775807L, false);
        }
    }

    public void seekToNextWindow() {
        seekToNextMediaItem();
    }

    public void seekToPrevious() {
        d5.z zVar = (d5.z) this;
        if (zVar.getCurrentTimeline().p() || zVar.isPlayingAd()) {
            return;
        }
        boolean zHasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (zHasPreviousMediaItem) {
                q1(7);
                return;
            }
            return;
        }
        if (zHasPreviousMediaItem) {
            long currentPosition = zVar.getCurrentPosition();
            zVar.getMaxSeekToPreviousPosition();
            if (currentPosition <= 3000) {
                q1(7);
                return;
            }
        }
        o1(zVar.getCurrentMediaItemIndex(), 0L, false);
    }

    public void seekToPreviousMediaItem() {
        q1(6);
    }

    public void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    public void setMediaItem(androidx.media3.common.e0 e0Var) {
        setMediaItems(oe.h0.p(e0Var));
    }

    public void setMediaItems(List list) {
        ((d5.z) this).setMediaItems(list, true);
    }

    public void setPlaybackSpeed(float f10) {
        d5.z zVar = (d5.z) this;
        zVar.setPlaybackParameters(new androidx.media3.common.n0(f10, zVar.getPlaybackParameters().f1726d));
    }

    public String toString() {
        switch (this.f1503a) {
            case 14:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f1504d;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // zc.k1
    public Context u0() {
        throw null;
    }

    @Override // zc.k1
    public zc.j0 x() {
        throw null;
    }

    public /* synthetic */ o(int i10, boolean z10) {
        this.f1503a = i10;
    }

    public void addMediaItem(androidx.media3.common.e0 e0Var) {
        addMediaItems(oe.h0.p(e0Var));
    }

    public void seekTo(long j) {
        o1(((d5.z) this).getCurrentMediaItemIndex(), j, false);
    }

    public void setMediaItem(androidx.media3.common.e0 e0Var, long j) {
        ((d5.z) this).setMediaItems(oe.h0.p(e0Var), 0, j);
    }

    public o(c1 c1Var) {
        this.f1503a = 15;
        cc.s.h(c1Var);
        this.f1504d = c1Var;
    }

    public void seekToDefaultPosition(int i10) {
        o1(i10, -9223372036854775807L, false);
    }

    public void setMediaItem(androidx.media3.common.e0 e0Var, boolean z10) {
        ((d5.z) this).setMediaItems(oe.h0.p(e0Var), z10);
    }

    public o(sr.h hVar) {
        this.f1503a = 12;
        if (hVar != null) {
            this.f1504d = hVar;
        } else {
            T0(0);
            throw null;
        }
    }

    public o(ht.x xVar) {
        this.f1503a = 2;
        if (xVar != null) {
            this.f1504d = xVar;
        } else {
            S0(0);
            throw null;
        }
    }

    public o(ch.d dVar) {
        this.f1503a = 4;
        br.l.e(dVar, "serviceLocator");
        this.f1504d = dVar;
    }

    public o(CellInfo cellInfo, ch.f fVar) throws JSONException {
        this.f1503a = 7;
        JSONObject jSONObject = new JSONObject();
        this.f1504d = jSONObject;
        try {
            jSONObject.put("registered", cellInfo.isRegistered());
            W0(cellInfo, fVar);
            jSONObject.put("connection_status", fVar.d() ? Integer.valueOf(cellInfo.getCellConnectionStatus()) : JSONObject.NULL);
        } catch (JSONException e4) {
            ch.n.e("CellInfoJson", e4);
        }
    }

    public o(int i10) {
        this.f1503a = i10;
        switch (i10) {
            case 1:
                this.f1504d = new z0();
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f1504d = new v1();
                break;
            default:
                this.f1504d = new a2.g(2);
                break;
        }
    }

    public o(o4.s0 s0Var) {
        this.f1503a = 11;
        br.l.e(s0Var, "operation");
        this.f1504d = s0Var;
    }
}
