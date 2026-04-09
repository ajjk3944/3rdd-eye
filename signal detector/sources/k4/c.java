package K4;

import C0.t;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.work.impl.WorkDatabase_Impl;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.AbstractC0709Rg;
import com.google.android.gms.internal.ads.AbstractC1984ut;
import com.google.android.gms.internal.ads.C0447Bq;
import com.google.android.gms.internal.ads.C0583Jq;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0702Qq;
import com.google.android.gms.internal.ads.C0729Sj;
import com.google.android.gms.internal.ads.C0734So;
import com.google.android.gms.internal.ads.C0736Sq;
import com.google.android.gms.internal.ads.C0753Tq;
import com.google.android.gms.internal.ads.C0836Yo;
import com.google.android.gms.internal.ads.C1337is;
import com.google.android.gms.internal.ads.C1347j2;
import com.google.android.gms.internal.ads.C1424kP;
import com.google.android.gms.internal.ads.C1448kw;
import com.google.android.gms.internal.ads.C1821rs;
import com.google.android.gms.internal.ads.C1879sw;
import com.google.android.gms.internal.ads.C1929ts;
import com.google.android.gms.internal.ads.C1994v2;
import com.google.android.gms.internal.ads.C2041vw;
import com.google.android.gms.internal.ads.C2148xv;
import com.google.android.gms.internal.ads.C2199ys;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.D4;
import com.google.android.gms.internal.ads.I7;
import com.google.android.gms.internal.ads.I9;
import com.google.android.gms.internal.ads.InterfaceC0956bq;
import com.google.android.gms.internal.ads.InterfaceC1920tj;
import com.google.android.gms.internal.ads.K9;
import com.google.android.gms.internal.ads.NN;
import com.google.android.gms.internal.ads.OO;
import com.google.android.gms.internal.ads.PD;
import com.google.android.gms.internal.ads.PO;
import com.google.android.gms.internal.ads.Pr;
import com.google.android.gms.internal.ads.QO;
import com.google.android.gms.internal.ads.Qt;
import com.google.android.gms.internal.ads.RO;
import com.google.android.gms.internal.ads.TP;
import com.google.android.gms.internal.ads.UN;
import com.google.android.gms.internal.ads.VO;
import com.google.android.gms.internal.ads.Vt;
import com.google.android.gms.internal.ads.WO;
import com.google.android.gms.internal.ads.Wu;
import com.google.android.gms.internal.ads.XO;
import com.google.android.gms.internal.ads.Xt;
import com.google.android.gms.internal.ads.YO;
import com.google.android.gms.internal.ads.ZO;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.Slider;
import com.lefan.base.view.AdFreeCountDownTextClock;
import com.lefan.signal.ui.magnetic.MagneticTrendView;
import com.lefan.signal.ui.magnetic.MagneticView;
import e1.C2301d;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import t2.C2911G;
import t2.x;

/* loaded from: classes.dex */
public final class c implements O0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2208a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2209b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2210c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2211d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2212e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2213f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2214g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2215h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2216j;

    public c(int i) {
        this.f2208a = i;
        switch (i) {
            case 3:
                this.f2209b = new ArrayBlockingQueue(100);
                this.f2212e = new LinkedHashMap();
                this.f2210c = new HashMap();
                this.i = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
                break;
        }
    }

    public ArrayList a() throws Throwable {
        t tVar;
        int iP;
        int iP2;
        int iP3;
        int iP4;
        int iP5;
        int iP6;
        int iP7;
        int iP8;
        int iP9;
        int iP10;
        int iP11;
        int iP12;
        int iP13;
        t tVarA = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        tVarA.f(1, TTAdConstant.MATE_VALID);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            iP = I5.b.p(cursorL, "required_network_type");
            iP2 = I5.b.p(cursorL, "requires_charging");
            iP3 = I5.b.p(cursorL, "requires_device_idle");
            iP4 = I5.b.p(cursorL, "requires_battery_not_low");
            iP5 = I5.b.p(cursorL, "requires_storage_not_low");
            iP6 = I5.b.p(cursorL, "trigger_content_update_delay");
            iP7 = I5.b.p(cursorL, "trigger_max_content_delay");
            iP8 = I5.b.p(cursorL, "content_uri_triggers");
            iP9 = I5.b.p(cursorL, "id");
            iP10 = I5.b.p(cursorL, "state");
            iP11 = I5.b.p(cursorL, "worker_class_name");
            iP12 = I5.b.p(cursorL, "input_merger_class_name");
            iP13 = I5.b.p(cursorL, "input");
            tVar = tVarA;
        } catch (Throwable th) {
            th = th;
            tVar = tVarA;
        }
        try {
            int iP14 = I5.b.p(cursorL, "output");
            int iP15 = I5.b.p(cursorL, "initial_delay");
            int iP16 = I5.b.p(cursorL, "interval_duration");
            int iP17 = I5.b.p(cursorL, "flex_duration");
            int iP18 = I5.b.p(cursorL, "run_attempt_count");
            int iP19 = I5.b.p(cursorL, "backoff_policy");
            int iP20 = I5.b.p(cursorL, "backoff_delay_duration");
            int iP21 = I5.b.p(cursorL, "period_start_time");
            int iP22 = I5.b.p(cursorL, "minimum_retention_duration");
            int iP23 = I5.b.p(cursorL, "schedule_requested_at");
            int iP24 = I5.b.p(cursorL, "run_in_foreground");
            int iP25 = I5.b.p(cursorL, "out_of_quota_policy");
            int i = iP14;
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                String string = cursorL.getString(iP9);
                int i3 = iP9;
                String string2 = cursorL.getString(iP11);
                int i6 = iP11;
                V0.c cVar = new V0.c();
                int i7 = iP;
                cVar.f3808a = com.bumptech.glide.d.A(cursorL.getInt(iP));
                cVar.f3809b = cursorL.getInt(iP2) != 0;
                cVar.f3810c = cursorL.getInt(iP3) != 0;
                cVar.f3811d = cursorL.getInt(iP4) != 0;
                cVar.f3812e = cursorL.getInt(iP5) != 0;
                int i8 = iP2;
                cVar.f3813f = cursorL.getLong(iP6);
                cVar.f3814g = cursorL.getLong(iP7);
                cVar.f3815h = com.bumptech.glide.d.g(cursorL.getBlob(iP8));
                e1.h hVar = new e1.h(string, string2);
                hVar.f19909b = com.bumptech.glide.d.C(cursorL.getInt(iP10));
                hVar.f19911d = cursorL.getString(iP12);
                hVar.f19912e = V0.f.a(cursorL.getBlob(iP13));
                int i9 = i;
                hVar.f19913f = V0.f.a(cursorL.getBlob(i9));
                int i10 = iP13;
                i = i9;
                int i11 = iP15;
                hVar.f19914g = cursorL.getLong(i11);
                iP15 = i11;
                int i12 = iP3;
                int i13 = iP16;
                hVar.f19915h = cursorL.getLong(i13);
                iP16 = i13;
                int i14 = iP17;
                hVar.i = cursorL.getLong(i14);
                int i15 = iP18;
                hVar.f19917k = cursorL.getInt(i15);
                int i16 = iP19;
                iP18 = i15;
                hVar.f19918l = com.bumptech.glide.d.z(cursorL.getInt(i16));
                iP17 = i14;
                int i17 = iP20;
                hVar.f19919m = cursorL.getLong(i17);
                iP20 = i17;
                int i18 = iP21;
                hVar.f19920n = cursorL.getLong(i18);
                iP21 = i18;
                int i19 = iP22;
                hVar.f19921o = cursorL.getLong(i19);
                iP22 = i19;
                int i20 = iP23;
                hVar.f19922p = cursorL.getLong(i20);
                int i21 = iP24;
                hVar.f19923q = cursorL.getInt(i21) != 0;
                int i22 = iP25;
                iP24 = i21;
                hVar.f19924r = com.bumptech.glide.d.B(cursorL.getInt(i22));
                hVar.f19916j = cVar;
                arrayList.add(hVar);
                iP19 = i16;
                iP3 = i12;
                iP25 = i22;
                iP23 = i20;
                iP13 = i10;
                iP9 = i3;
                iP11 = i6;
                iP = i7;
                iP2 = i8;
            }
            cursorL.close();
            tVar.b();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorL.close();
            tVar.b();
            throw th;
        }
    }

    public ArrayList b(int i) throws Throwable {
        t tVar;
        t tVarA = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        tVarA.f(1, i);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "required_network_type");
            int iP2 = I5.b.p(cursorL, "requires_charging");
            int iP3 = I5.b.p(cursorL, "requires_device_idle");
            int iP4 = I5.b.p(cursorL, "requires_battery_not_low");
            int iP5 = I5.b.p(cursorL, "requires_storage_not_low");
            int iP6 = I5.b.p(cursorL, "trigger_content_update_delay");
            int iP7 = I5.b.p(cursorL, "trigger_max_content_delay");
            int iP8 = I5.b.p(cursorL, "content_uri_triggers");
            int iP9 = I5.b.p(cursorL, "id");
            int iP10 = I5.b.p(cursorL, "state");
            int iP11 = I5.b.p(cursorL, "worker_class_name");
            int iP12 = I5.b.p(cursorL, "input_merger_class_name");
            int iP13 = I5.b.p(cursorL, "input");
            tVar = tVarA;
            try {
                int iP14 = I5.b.p(cursorL, "output");
                int iP15 = I5.b.p(cursorL, "initial_delay");
                int iP16 = I5.b.p(cursorL, "interval_duration");
                int iP17 = I5.b.p(cursorL, "flex_duration");
                int iP18 = I5.b.p(cursorL, "run_attempt_count");
                int iP19 = I5.b.p(cursorL, "backoff_policy");
                int iP20 = I5.b.p(cursorL, "backoff_delay_duration");
                int iP21 = I5.b.p(cursorL, "period_start_time");
                int iP22 = I5.b.p(cursorL, "minimum_retention_duration");
                int iP23 = I5.b.p(cursorL, "schedule_requested_at");
                int iP24 = I5.b.p(cursorL, "run_in_foreground");
                int iP25 = I5.b.p(cursorL, "out_of_quota_policy");
                int i3 = iP14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    String string = cursorL.getString(iP9);
                    int i6 = iP9;
                    String string2 = cursorL.getString(iP11);
                    int i7 = iP11;
                    V0.c cVar = new V0.c();
                    int i8 = iP;
                    cVar.f3808a = com.bumptech.glide.d.A(cursorL.getInt(iP));
                    cVar.f3809b = cursorL.getInt(iP2) != 0;
                    cVar.f3810c = cursorL.getInt(iP3) != 0;
                    cVar.f3811d = cursorL.getInt(iP4) != 0;
                    cVar.f3812e = cursorL.getInt(iP5) != 0;
                    int i9 = iP2;
                    cVar.f3813f = cursorL.getLong(iP6);
                    cVar.f3814g = cursorL.getLong(iP7);
                    cVar.f3815h = com.bumptech.glide.d.g(cursorL.getBlob(iP8));
                    e1.h hVar = new e1.h(string, string2);
                    hVar.f19909b = com.bumptech.glide.d.C(cursorL.getInt(iP10));
                    hVar.f19911d = cursorL.getString(iP12);
                    hVar.f19912e = V0.f.a(cursorL.getBlob(iP13));
                    int i10 = i3;
                    hVar.f19913f = V0.f.a(cursorL.getBlob(i10));
                    int i11 = iP15;
                    int i12 = iP13;
                    i3 = i10;
                    hVar.f19914g = cursorL.getLong(i11);
                    int i13 = iP3;
                    int i14 = iP16;
                    hVar.f19915h = cursorL.getLong(i14);
                    iP16 = i14;
                    int i15 = iP17;
                    hVar.i = cursorL.getLong(i15);
                    int i16 = iP18;
                    hVar.f19917k = cursorL.getInt(i16);
                    int i17 = iP19;
                    iP18 = i16;
                    hVar.f19918l = com.bumptech.glide.d.z(cursorL.getInt(i17));
                    iP17 = i15;
                    int i18 = iP20;
                    hVar.f19919m = cursorL.getLong(i18);
                    iP20 = i18;
                    int i19 = iP21;
                    hVar.f19920n = cursorL.getLong(i19);
                    iP21 = i19;
                    int i20 = iP22;
                    hVar.f19921o = cursorL.getLong(i20);
                    iP22 = i20;
                    int i21 = iP23;
                    hVar.f19922p = cursorL.getLong(i21);
                    int i22 = iP24;
                    hVar.f19923q = cursorL.getInt(i22) != 0;
                    int i23 = iP25;
                    iP24 = i22;
                    hVar.f19924r = com.bumptech.glide.d.B(cursorL.getInt(i23));
                    hVar.f19916j = cVar;
                    arrayList.add(hVar);
                    iP19 = i17;
                    iP3 = i13;
                    iP13 = i12;
                    iP25 = i23;
                    iP23 = i21;
                    iP15 = i11;
                    iP9 = i6;
                    iP11 = i7;
                    iP = i8;
                    iP2 = i9;
                }
                cursorL.close();
                tVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                tVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    public ArrayList c() throws Throwable {
        t tVar;
        t tVarA = t.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "required_network_type");
            int iP2 = I5.b.p(cursorL, "requires_charging");
            int iP3 = I5.b.p(cursorL, "requires_device_idle");
            int iP4 = I5.b.p(cursorL, "requires_battery_not_low");
            int iP5 = I5.b.p(cursorL, "requires_storage_not_low");
            int iP6 = I5.b.p(cursorL, "trigger_content_update_delay");
            int iP7 = I5.b.p(cursorL, "trigger_max_content_delay");
            int iP8 = I5.b.p(cursorL, "content_uri_triggers");
            int iP9 = I5.b.p(cursorL, "id");
            int iP10 = I5.b.p(cursorL, "state");
            int iP11 = I5.b.p(cursorL, "worker_class_name");
            int iP12 = I5.b.p(cursorL, "input_merger_class_name");
            int iP13 = I5.b.p(cursorL, "input");
            tVar = tVarA;
            try {
                int iP14 = I5.b.p(cursorL, "output");
                int iP15 = I5.b.p(cursorL, "initial_delay");
                int iP16 = I5.b.p(cursorL, "interval_duration");
                int iP17 = I5.b.p(cursorL, "flex_duration");
                int iP18 = I5.b.p(cursorL, "run_attempt_count");
                int iP19 = I5.b.p(cursorL, "backoff_policy");
                int iP20 = I5.b.p(cursorL, "backoff_delay_duration");
                int iP21 = I5.b.p(cursorL, "period_start_time");
                int iP22 = I5.b.p(cursorL, "minimum_retention_duration");
                int iP23 = I5.b.p(cursorL, "schedule_requested_at");
                int iP24 = I5.b.p(cursorL, "run_in_foreground");
                int iP25 = I5.b.p(cursorL, "out_of_quota_policy");
                int i = iP14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    String string = cursorL.getString(iP9);
                    int i3 = iP9;
                    String string2 = cursorL.getString(iP11);
                    int i6 = iP11;
                    V0.c cVar = new V0.c();
                    int i7 = iP;
                    cVar.f3808a = com.bumptech.glide.d.A(cursorL.getInt(iP));
                    cVar.f3809b = cursorL.getInt(iP2) != 0;
                    cVar.f3810c = cursorL.getInt(iP3) != 0;
                    cVar.f3811d = cursorL.getInt(iP4) != 0;
                    cVar.f3812e = cursorL.getInt(iP5) != 0;
                    int i8 = iP2;
                    cVar.f3813f = cursorL.getLong(iP6);
                    cVar.f3814g = cursorL.getLong(iP7);
                    cVar.f3815h = com.bumptech.glide.d.g(cursorL.getBlob(iP8));
                    e1.h hVar = new e1.h(string, string2);
                    hVar.f19909b = com.bumptech.glide.d.C(cursorL.getInt(iP10));
                    hVar.f19911d = cursorL.getString(iP12);
                    hVar.f19912e = V0.f.a(cursorL.getBlob(iP13));
                    int i9 = i;
                    hVar.f19913f = V0.f.a(cursorL.getBlob(i9));
                    int i10 = iP13;
                    i = i9;
                    int i11 = iP15;
                    hVar.f19914g = cursorL.getLong(i11);
                    iP15 = i11;
                    int i12 = iP3;
                    int i13 = iP16;
                    hVar.f19915h = cursorL.getLong(i13);
                    iP16 = i13;
                    int i14 = iP17;
                    hVar.i = cursorL.getLong(i14);
                    int i15 = iP18;
                    hVar.f19917k = cursorL.getInt(i15);
                    int i16 = iP19;
                    iP18 = i15;
                    hVar.f19918l = com.bumptech.glide.d.z(cursorL.getInt(i16));
                    iP17 = i14;
                    int i17 = iP20;
                    hVar.f19919m = cursorL.getLong(i17);
                    iP20 = i17;
                    int i18 = iP21;
                    hVar.f19920n = cursorL.getLong(i18);
                    iP21 = i18;
                    int i19 = iP22;
                    hVar.f19921o = cursorL.getLong(i19);
                    iP22 = i19;
                    int i20 = iP23;
                    hVar.f19922p = cursorL.getLong(i20);
                    int i21 = iP24;
                    hVar.f19923q = cursorL.getInt(i21) != 0;
                    int i22 = iP25;
                    iP24 = i21;
                    hVar.f19924r = com.bumptech.glide.d.B(cursorL.getInt(i22));
                    hVar.f19916j = cVar;
                    arrayList.add(hVar);
                    iP19 = i16;
                    iP3 = i12;
                    iP25 = i22;
                    iP23 = i20;
                    iP13 = i10;
                    iP9 = i3;
                    iP11 = i6;
                    iP = i7;
                    iP2 = i8;
                }
                cursorL.close();
                tVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                tVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    public ArrayList d() {
        t tVar;
        t tVarA = t.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "required_network_type");
            int iP2 = I5.b.p(cursorL, "requires_charging");
            int iP3 = I5.b.p(cursorL, "requires_device_idle");
            int iP4 = I5.b.p(cursorL, "requires_battery_not_low");
            int iP5 = I5.b.p(cursorL, "requires_storage_not_low");
            int iP6 = I5.b.p(cursorL, "trigger_content_update_delay");
            int iP7 = I5.b.p(cursorL, "trigger_max_content_delay");
            int iP8 = I5.b.p(cursorL, "content_uri_triggers");
            int iP9 = I5.b.p(cursorL, "id");
            int iP10 = I5.b.p(cursorL, "state");
            int iP11 = I5.b.p(cursorL, "worker_class_name");
            int iP12 = I5.b.p(cursorL, "input_merger_class_name");
            int iP13 = I5.b.p(cursorL, "input");
            tVar = tVarA;
            try {
                int iP14 = I5.b.p(cursorL, "output");
                int iP15 = I5.b.p(cursorL, "initial_delay");
                int iP16 = I5.b.p(cursorL, "interval_duration");
                int iP17 = I5.b.p(cursorL, "flex_duration");
                int iP18 = I5.b.p(cursorL, "run_attempt_count");
                int iP19 = I5.b.p(cursorL, "backoff_policy");
                int iP20 = I5.b.p(cursorL, "backoff_delay_duration");
                int iP21 = I5.b.p(cursorL, "period_start_time");
                int iP22 = I5.b.p(cursorL, "minimum_retention_duration");
                int iP23 = I5.b.p(cursorL, "schedule_requested_at");
                int iP24 = I5.b.p(cursorL, "run_in_foreground");
                int iP25 = I5.b.p(cursorL, "out_of_quota_policy");
                int i = iP14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    String string = cursorL.getString(iP9);
                    int i3 = iP9;
                    String string2 = cursorL.getString(iP11);
                    int i6 = iP11;
                    V0.c cVar = new V0.c();
                    int i7 = iP;
                    cVar.f3808a = com.bumptech.glide.d.A(cursorL.getInt(iP));
                    cVar.f3809b = cursorL.getInt(iP2) != 0;
                    cVar.f3810c = cursorL.getInt(iP3) != 0;
                    cVar.f3811d = cursorL.getInt(iP4) != 0;
                    cVar.f3812e = cursorL.getInt(iP5) != 0;
                    int i8 = iP2;
                    cVar.f3813f = cursorL.getLong(iP6);
                    cVar.f3814g = cursorL.getLong(iP7);
                    cVar.f3815h = com.bumptech.glide.d.g(cursorL.getBlob(iP8));
                    e1.h hVar = new e1.h(string, string2);
                    hVar.f19909b = com.bumptech.glide.d.C(cursorL.getInt(iP10));
                    hVar.f19911d = cursorL.getString(iP12);
                    hVar.f19912e = V0.f.a(cursorL.getBlob(iP13));
                    int i9 = i;
                    hVar.f19913f = V0.f.a(cursorL.getBlob(i9));
                    int i10 = iP13;
                    i = i9;
                    int i11 = iP15;
                    hVar.f19914g = cursorL.getLong(i11);
                    iP15 = i11;
                    int i12 = iP3;
                    int i13 = iP16;
                    hVar.f19915h = cursorL.getLong(i13);
                    iP16 = i13;
                    int i14 = iP17;
                    hVar.i = cursorL.getLong(i14);
                    int i15 = iP18;
                    hVar.f19917k = cursorL.getInt(i15);
                    int i16 = iP19;
                    iP18 = i15;
                    hVar.f19918l = com.bumptech.glide.d.z(cursorL.getInt(i16));
                    iP17 = i14;
                    int i17 = iP20;
                    hVar.f19919m = cursorL.getLong(i17);
                    iP20 = i17;
                    int i18 = iP21;
                    hVar.f19920n = cursorL.getLong(i18);
                    iP21 = i18;
                    int i19 = iP22;
                    hVar.f19921o = cursorL.getLong(i19);
                    iP22 = i19;
                    int i20 = iP23;
                    hVar.f19922p = cursorL.getLong(i20);
                    int i21 = iP24;
                    hVar.f19923q = cursorL.getInt(i21) != 0;
                    int i22 = iP25;
                    iP24 = i21;
                    hVar.f19924r = com.bumptech.glide.d.B(cursorL.getInt(i22));
                    hVar.f19916j = cVar;
                    arrayList.add(hVar);
                    iP19 = i16;
                    iP3 = i12;
                    iP25 = i22;
                    iP23 = i20;
                    iP13 = i10;
                    iP9 = i3;
                    iP11 = i6;
                    iP = i7;
                    iP2 = i8;
                }
                cursorL.close();
                tVar.b();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                tVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    public int e(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        t tVarA = t.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            tVarA.l(1);
        } else {
            tVarA.c(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            return cursorL.moveToFirst() ? com.bumptech.glide.d.C(cursorL.getInt(0)) : 0;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    public ArrayList f() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        t tVarA = t.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        tVarA.l(1);
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    public ArrayList g() {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        t tVarA = t.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        tVarA.c(1, "offline_ping_sender_work");
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            tVarA.b();
        }
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f2208a) {
        }
        return (LinearLayoutCompat) this.f2209b;
    }

    public e1.h h(String str) {
        t tVar;
        e1.h hVar;
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        t tVarA = t.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            tVarA.l(1);
        } else {
            tVarA.c(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(tVarA);
        try {
            int iP = I5.b.p(cursorL, "required_network_type");
            int iP2 = I5.b.p(cursorL, "requires_charging");
            int iP3 = I5.b.p(cursorL, "requires_device_idle");
            int iP4 = I5.b.p(cursorL, "requires_battery_not_low");
            int iP5 = I5.b.p(cursorL, "requires_storage_not_low");
            int iP6 = I5.b.p(cursorL, "trigger_content_update_delay");
            int iP7 = I5.b.p(cursorL, "trigger_max_content_delay");
            int iP8 = I5.b.p(cursorL, "content_uri_triggers");
            int iP9 = I5.b.p(cursorL, "id");
            int iP10 = I5.b.p(cursorL, "state");
            int iP11 = I5.b.p(cursorL, "worker_class_name");
            int iP12 = I5.b.p(cursorL, "input_merger_class_name");
            int iP13 = I5.b.p(cursorL, "input");
            int iP14 = I5.b.p(cursorL, "output");
            tVar = tVarA;
            try {
                int iP15 = I5.b.p(cursorL, "initial_delay");
                int iP16 = I5.b.p(cursorL, "interval_duration");
                int iP17 = I5.b.p(cursorL, "flex_duration");
                int iP18 = I5.b.p(cursorL, "run_attempt_count");
                int iP19 = I5.b.p(cursorL, "backoff_policy");
                int iP20 = I5.b.p(cursorL, "backoff_delay_duration");
                int iP21 = I5.b.p(cursorL, "period_start_time");
                int iP22 = I5.b.p(cursorL, "minimum_retention_duration");
                int iP23 = I5.b.p(cursorL, "schedule_requested_at");
                int iP24 = I5.b.p(cursorL, "run_in_foreground");
                int iP25 = I5.b.p(cursorL, "out_of_quota_policy");
                if (cursorL.moveToFirst()) {
                    String string = cursorL.getString(iP9);
                    String string2 = cursorL.getString(iP11);
                    V0.c cVar = new V0.c();
                    cVar.f3808a = com.bumptech.glide.d.A(cursorL.getInt(iP));
                    cVar.f3809b = cursorL.getInt(iP2) != 0;
                    cVar.f3810c = cursorL.getInt(iP3) != 0;
                    cVar.f3811d = cursorL.getInt(iP4) != 0;
                    cVar.f3812e = cursorL.getInt(iP5) != 0;
                    cVar.f3813f = cursorL.getLong(iP6);
                    cVar.f3814g = cursorL.getLong(iP7);
                    cVar.f3815h = com.bumptech.glide.d.g(cursorL.getBlob(iP8));
                    hVar = new e1.h(string, string2);
                    hVar.f19909b = com.bumptech.glide.d.C(cursorL.getInt(iP10));
                    hVar.f19911d = cursorL.getString(iP12);
                    hVar.f19912e = V0.f.a(cursorL.getBlob(iP13));
                    hVar.f19913f = V0.f.a(cursorL.getBlob(iP14));
                    hVar.f19914g = cursorL.getLong(iP15);
                    hVar.f19915h = cursorL.getLong(iP16);
                    hVar.i = cursorL.getLong(iP17);
                    hVar.f19917k = cursorL.getInt(iP18);
                    hVar.f19918l = com.bumptech.glide.d.z(cursorL.getInt(iP19));
                    hVar.f19919m = cursorL.getLong(iP20);
                    hVar.f19920n = cursorL.getLong(iP21);
                    hVar.f19921o = cursorL.getLong(iP22);
                    hVar.f19922p = cursorL.getLong(iP23);
                    hVar.f19923q = cursorL.getInt(iP24) != 0;
                    hVar.f19924r = com.bumptech.glide.d.B(cursorL.getInt(iP25));
                    hVar.f19916j = cVar;
                } else {
                    hVar = null;
                }
                cursorL.close();
                tVar.b();
                return hVar;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                tVar.b();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            tVar = tVarA;
        }
    }

    public void i(long j6, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        C2301d c2301d = (C2301d) this.f2211d;
        H0.j jVarA = c2301d.a();
        jVarA.f(1, j6);
        if (str == null) {
            jVarA.l(2);
        } else {
            jVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c2301d.c(jVarA);
        }
    }

    public void j(String str, V0.f fVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        C2301d c2301d = (C2301d) this.f2213f;
        H0.j jVarA = c2301d.a();
        byte[] bArrC = V0.f.c(fVar);
        if (bArrC == null) {
            jVarA.l(1);
        } else {
            jVarA.g(1, bArrC);
        }
        if (str == null) {
            jVarA.l(2);
        } else {
            jVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c2301d.c(jVarA);
        }
    }

    public void k(long j6, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        C2301d c2301d = (C2301d) this.f2214g;
        H0.j jVarA = c2301d.a();
        jVarA.f(1, j6);
        if (str == null) {
            jVarA.l(2);
        } else {
            jVarA.c(2, str);
        }
        workDatabase_Impl.c();
        try {
            jVarA.b();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
            c2301d.c(jVarA);
        }
    }

    public void l(int i, String... strArr) throws SQLException {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2209b;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            sb.append("?");
            if (i3 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String string = sb.toString();
        q5.i.e(string, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        H0.j jVarD = workDatabase_Impl.g().i().d(string);
        jVarD.f(1, com.bumptech.glide.d.b0(i));
        int i6 = 2;
        for (String str : strArr) {
            if (str == null) {
                jVarD.l(i6);
            } else {
                jVarD.c(i6, str);
            }
            i6++;
        }
        workDatabase_Impl.c();
        try {
            jVarD.b();
            workDatabase_Impl.m();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public synchronized PD m(Xt xt) {
        try {
            if (!((AtomicBoolean) this.i).getAndSet(true)) {
                List list = (List) xt.f12510b.f15173b;
                if (list.isEmpty()) {
                    ((PD) this.f2215h).e(new C0736Sq(3, C0753Tq.a(xt)));
                } else {
                    this.f2216j = xt;
                    C0702Qq c0702Qq = (C0702Qq) this.f2213f;
                    this.f2211d = new C0583Jq(xt, c0702Qq, (PD) this.f2215h);
                    c0702Qq.b(list);
                    Qt qtA = ((C0583Jq) this.f2211d).a();
                    while (qtA != null) {
                        q(qtA);
                        qtA = ((C0583Jq) this.f2211d).a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (PD) this.f2215h;
    }

    public XO n(VO vo) {
        RO roB;
        int i;
        boolean zBooleanValue;
        int iB;
        t(vo);
        C1879sw c1879sw = (C1879sw) this.f2216j;
        TP tp = (TP) vo.f11987a;
        C0729Sj c0729Sj = (C0729Sj) vo.f11988b;
        c1879sw.getClass();
        tp.getClass();
        String str = tp.f11397m;
        c0729Sj.getClass();
        int i3 = Build.VERSION.SDK_INT;
        int i6 = 2;
        if (i3 < 29 || (i = tp.f11379F) == -1) {
            roB = RO.f10906d;
        } else {
            Context context = (Context) c1879sw.f16823b;
            Boolean bool = (Boolean) c1879sw.f16824c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                if (context != null) {
                    String parameters = AbstractC0709Rg.b(context).getParameters("offloadVariableRateSupported");
                    c1879sw.f16824c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    c1879sw.f16824c = Boolean.FALSE;
                }
                zBooleanValue = ((Boolean) c1879sw.f16824c).booleanValue();
            }
            str.getClass();
            int iG = D4.g(str, tp.f11394j);
            if (iG == 0 || i3 < Vt.c(iG) || (iB = Vt.b(tp.f11378E)) == 0) {
                roB = RO.f10906d;
            } else {
                try {
                    AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iB).setEncoding(iG).build();
                    if (i3 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, c0729Sj.a());
                        if (playbackOffloadSupport == 0) {
                            roB = RO.f10906d;
                        } else {
                            C1347j2 c1347j2 = new C1347j2();
                            boolean z6 = i3 > 32 && playbackOffloadSupport == 2;
                            c1347j2.f14862a = true;
                            c1347j2.f14863b = z6;
                            c1347j2.f14864c = zBooleanValue;
                            roB = c1347j2.b();
                        }
                    } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, c0729Sj.a())) {
                        C1347j2 c1347j22 = new C1347j2();
                        c1347j22.f14862a = true;
                        c1347j22.f14864c = zBooleanValue;
                        roB = c1347j22.b();
                    } else {
                        roB = RO.f10906d;
                    }
                } catch (IllegalArgumentException unused) {
                    roB = RO.f10906d;
                }
            }
        }
        WO wo = new WO();
        if (Objects.equals(str, "audio/raw")) {
            int i7 = tp.f11380G;
            if (!Vt.a(i7)) {
                A.f.u(new StringBuilder(String.valueOf(i7).length() + 22), "Invalid PCM encoding: ", i7, "ATAudioOutputProvider");
                i6 = 0;
            } else if (i7 != 2) {
                i6 = 1;
            }
        } else if (((OO) this.f2214g).c(tp, c0729Sj) == null) {
            i6 = 0;
        }
        wo.f12224d = i6;
        wo.f12221a = roB.f10907a;
        wo.f12222b = roB.f10908b;
        wo.f12223c = roB.f10909c;
        return wo.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.ZO o(com.google.android.gms.internal.ads.VO r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.c.o(com.google.android.gms.internal.ads.VO):com.google.android.gms.internal.ads.ZO");
    }

    public LinkedHashMap p(LinkedHashMap linkedHashMap, Map map) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String str3 = (String) linkedHashMap2.get(str);
            I9 i9 = (I9) ((HashMap) this.f2210c).get(str);
            if (i9 == null) {
                i9 = I9.f9076b;
            }
            linkedHashMap2.put(str, i9.a(str3, str2));
        }
        return linkedHashMap2;
    }

    public void q(Qt qt) {
        InterfaceFutureC2326a interfaceFutureC2326aW;
        synchronized (this) {
            Iterator it = qt.f10757a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceFutureC2326aW = AbstractC1984ut.w(new C0836Yo(3));
                    break;
                }
                InterfaceC0956bq interfaceC0956bqA = ((InterfaceC1920tj) this.f2210c).a(qt.f10759b, (String) it.next());
                if (interfaceC0956bqA != null && interfaceC0956bqA.a((Xt) this.f2216j, qt)) {
                    interfaceFutureC2326aW = AbstractC1984ut.E(interfaceC0956bqA.b((Xt) this.f2216j, qt), qt.f10748R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f2212e);
                    break;
                }
            }
        }
        ((C0702Qq) this.f2213f).d((Xt) this.f2216j, qt, interfaceFutureC2326aW, (C2148xv) this.f2214g);
        interfaceFutureC2326aW.a(new CD(interfaceFutureC2326aW, 0 == true ? 1 : 0, new C0697Ql((Object) this, (Object) qt, 24, false)), (Executor) this.f2209b);
    }

    public C1424kP r(ZO zo) throws UnsupportedOperationException, YO, IllegalArgumentException {
        Context context;
        try {
            int i = zo.f12887f;
            int i3 = zo.f12888g;
            Context context2 = null;
            if (i3 != -1 && (context = (Context) this.f2209b) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = (Context) this.f2211d;
                if (context3 == null || context3.getDeviceId() != i3) {
                    this.f2211d = context.createDeviceContext(i3);
                }
                context2 = (Context) this.f2211d;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zo.f12886e.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zo.f12883b).setChannelMask(zo.f12884c).setEncoding(zo.f12882a).build()).setTransferMode(1).setBufferSizeInBytes(zo.f12885d).setSessionId(i);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (i6 >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new C1424kP(audioTrackBuild, zo, (C1448kw) this.f2212e, (C1994v2) this.f2213f);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new YO();
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw new YO(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new YO(e);
        }
    }

    public void s(LinkedHashMap linkedHashMap, K9 k9) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f2213f).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (k9 != null) {
            String str = k9.f9466b;
            String str2 = k9.f9465a;
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&it=");
                sb.append(str2);
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&blat=");
                sb.append(str);
            }
            string = sb.toString();
        }
        FileOutputStream fileOutputStream = null;
        if (!((AtomicBoolean) this.f2211d).get()) {
            C2911G c2911g = p2.j.f22785C.f22790c;
            new x((Context) this.f2214g, (String) this.f2215h, string, null).k();
            return;
        }
        File file = (File) this.f2216j;
        try {
            if (file == null) {
                u2.k.h("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e6) {
                        u2.k.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e6);
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    u2.k.i("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e8) {
                            u2.k.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e9) {
                            u2.k.i("CsiReporter: Cannot close file: sdk_csi_data.txt.", e9);
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void t(VO vo) {
        Context context;
        OO ooB;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) vo.f11989c;
        C0729Sj c0729Sj = (C0729Sj) vo.f11988b;
        u();
        C0447Bq c0447Bq = (C0447Bq) this.f2215h;
        if (c0447Bq == null && (context = (Context) this.f2209b) != null) {
            C0447Bq c0447Bq2 = new C0447Bq(context, new Wu(11, this), c0729Sj, audioDeviceInfo);
            this.f2215h = c0447Bq2;
            if (c0447Bq2.f7445a) {
                ooB = (OO) c0447Bq2.f7452h;
                ooB.getClass();
            } else {
                c0447Bq2.f7445a = true;
                QO qo = (QO) c0447Bq2.f7451g;
                if (qo != null) {
                    qo.f10613a.registerContentObserver(qo.f10614b, false, qo);
                }
                Context context2 = (Context) c0447Bq2.f7446b;
                PO po = (PO) c0447Bq2.f7449e;
                Handler handler = (Handler) c0447Bq2.f7448d;
                AbstractC0709Rg.b(context2).registerAudioDeviceCallback(po, handler);
                ooB = OO.b(context2, context2.registerReceiver((A1.t) c0447Bq2.f7450f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (C0729Sj) c0447Bq2.f7453j, (AudioDeviceInfo) c0447Bq2.i);
                c0447Bq2.f7452h = ooB;
            }
            this.f2214g = ooB;
        } else if (c0447Bq != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) c0447Bq.i)) {
                c0447Bq.i = audioDeviceInfo;
                c0447Bq.a(OO.a((Context) c0447Bq.f7446b, (C0729Sj) c0447Bq.f7453j, audioDeviceInfo));
            }
            C0447Bq c0447Bq3 = (C0447Bq) this.f2215h;
            if (!Objects.equals(c0729Sj, (C0729Sj) c0447Bq3.f7453j)) {
                c0447Bq3.f7453j = c0729Sj;
                c0447Bq3.a(OO.a((Context) c0447Bq3.f7446b, c0729Sj, (AudioDeviceInfo) c0447Bq3.i));
            }
        }
        ((OO) this.f2214g).getClass();
    }

    public void u() {
        if (((Context) this.f2209b) == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = (Looper) this.i;
        boolean z6 = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (!z6) {
            throw new IllegalStateException(Cr.E("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
        this.i = looperMyLooper;
    }

    public c(C0623Mf c0623Mf, ScheduledExecutorService scheduledExecutorService, InterfaceC1920tj interfaceC1920tj, C0702Qq c0702Qq, C2148xv c2148xv) {
        this.f2208a = 4;
        this.f2215h = new PD();
        this.i = new AtomicBoolean();
        this.f2209b = c0623Mf;
        this.f2212e = scheduledExecutorService;
        this.f2210c = interfaceC1920tj;
        this.f2213f = c0702Qq;
        this.f2214g = c2148xv;
    }

    public /* synthetic */ c(C2041vw c2041vw) {
        this.f2208a = 6;
        Context context = (Context) c2041vw.f17369b;
        this.f2209b = context;
        C1879sw c1879sw = (C1879sw) c2041vw.f17371d;
        c1879sw.getClass();
        this.f2216j = c1879sw;
        this.f2214g = (OO) c2041vw.f17370c;
        this.f2212e = context == null ? null : new C1448kw(10, this);
        this.f2213f = C1994v2.f17209f;
    }

    public c(UN un, NN nn, C1994v2 c1994v2, int i, int i3, int i6, int i7) {
        this.f2208a = 5;
        this.f2209b = un;
        this.f2210c = nn;
        this.f2213f = new I7();
        this.f2214g = c1994v2.B(un.f11650H, new C0734So(1, this));
        this.f2215h = new C1337is(this, i);
        this.i = new C1821rs(this, i3);
        this.f2211d = new C1929ts(this, i6);
        this.f2216j = new C2199ys(this, i7);
        Pr pr = new Pr(this);
        this.f2212e = pr;
        un.f11690n.a(pr);
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f2208a = 7;
        this.f2209b = workDatabase_Impl;
        this.f2212e = new L4.b(workDatabase_Impl, 12);
        this.f2210c = new C2301d(workDatabase_Impl, 3);
        this.f2213f = new C2301d(workDatabase_Impl, 4);
        this.f2214g = new C2301d(workDatabase_Impl, 5);
        this.f2215h = new C2301d(workDatabase_Impl, 6);
        this.i = new C2301d(workDatabase_Impl, 7);
        this.f2211d = new C2301d(workDatabase_Impl, 8);
        this.f2216j = new C2301d(workDatabase_Impl, 9);
        new C2301d(workDatabase_Impl, 10);
    }

    public c(LinearLayoutCompat linearLayoutCompat, AdFreeCountDownTextClock adFreeCountDownTextClock, AppBarLayout appBarLayout, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, MaterialButton materialButton, Toolbar toolbar, MaterialCardView materialCardView, MaterialButton materialButton2) {
        this.f2208a = 0;
        this.f2209b = linearLayoutCompat;
        this.f2212e = adFreeCountDownTextClock;
        this.f2210c = appBarLayout;
        this.f2213f = nestedScrollView;
        this.f2214g = appCompatTextView;
        this.f2215h = materialButton;
        this.f2211d = toolbar;
        this.f2216j = materialCardView;
        this.i = materialButton2;
    }

    public c(LinearLayoutCompat linearLayoutCompat, AppBarLayout appBarLayout, View view, LinearProgressIndicator linearProgressIndicator, MagneticTrendView magneticTrendView, MagneticView magneticView, Slider slider, TextView textView, Toolbar toolbar) {
        this.f2208a = 1;
        this.f2209b = linearLayoutCompat;
        this.f2210c = appBarLayout;
        this.f2212e = view;
        this.f2213f = linearProgressIndicator;
        this.f2214g = magneticTrendView;
        this.f2215h = magneticView;
        this.i = slider;
        this.f2216j = textView;
        this.f2211d = toolbar;
    }
}
