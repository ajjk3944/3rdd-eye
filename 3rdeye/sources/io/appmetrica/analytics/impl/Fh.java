package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Fh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C4940s5 f39438a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f39439b;

    /* renamed from: c, reason: collision with root package name */
    public E7 f39440c;

    /* renamed from: d, reason: collision with root package name */
    public B9 f39441d;

    /* renamed from: e, reason: collision with root package name */
    public final C4555d7 f39442e;

    /* renamed from: f, reason: collision with root package name */
    public List f39443f;

    /* renamed from: g, reason: collision with root package name */
    public int f39444g;

    /* renamed from: h, reason: collision with root package name */
    public int f39445h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public Eh f39446j;

    /* renamed from: k, reason: collision with root package name */
    public final C5014v3 f39447k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f39448l;

    /* renamed from: m, reason: collision with root package name */
    public final C4933ro f39449m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4739kb f39450n;

    /* renamed from: o, reason: collision with root package name */
    public final C4745kh f39451o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f39452p;

    /* renamed from: q, reason: collision with root package name */
    public final Rb f39453q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f39454r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f39455s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f39456t;

    /* renamed from: u, reason: collision with root package name */
    public int f39457u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39458v;

    public Fh(C4940s5 c4940s5, C4745kh c4745kh, Rb rb, FullUrlFormer<C5028vh> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c4940s5, c4745kh, rb, fullUrlFormer, requestDataHolder, responseDataHolder, c4940s5.h(), c4940s5.o(), c4940s5.t(), requestBodyEncrypter);
    }

    public final B9 a(Eh eh, List list, C5028vh c5028vh) {
        B9 b92 = new B9();
        C4970t9 c4970t9 = new C4970t9();
        c4970t9.f41677a = WrapUtils.getOrDefaultIfEmpty(this.f39440c.f39339b, c5028vh.getUuid());
        c4970t9.f41678b = WrapUtils.getOrDefaultIfEmpty(this.f39440c.f39338a, c5028vh.getDeviceId());
        this.f39444g = CodedOutputByteBufferNano.computeMessageSize(4, c4970t9) + this.f39444g;
        b92.f39163b = c4970t9;
        C4699in c4699inA = Ga.f39501F.A();
        Ch ch = new Ch(this, b92);
        synchronized (c4699inA) {
            c4699inA.f41093a.a(ch);
        }
        List list2 = eh.f39368a;
        b92.f39162a = (C5095y9[]) list2.toArray(new C5095y9[list2.size()]);
        b92.f39164c = a(eh.f39370c);
        b92.f39166e = (String[]) list.toArray(new String[list.size()]);
        this.f39444g = CodedOutputByteBufferNano.computeTagSize(8) + this.f39444g;
        return b92;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f39438a.f41600b.f41171b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f39452p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f39454r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f39455s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5028vh) this.f39438a.f41608k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((C5082xl) Ga.f39501F.y()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onCreateTask() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Fh.onCreateTask():boolean");
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f39456t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        String strA;
        if (z10) {
            a(false);
        } else if (this.f39455s.getResponseCode() == 400) {
            a(true);
        }
        if (z10) {
            for (int i = 0; i < this.f39446j.f39368a.size(); i++) {
                for (C5045w9 c5045w9 : ((C5095y9) this.f39446j.f39368a.get(i)).f42132c) {
                    if (c5045w9 != null && (strA = AbstractC4512bg.a(c5045w9)) != null) {
                        this.f39448l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f39456t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f39458v = true;
        this.f39438a.f41603e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f39458v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((D5) this.f39438a.f41613p).f39287d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f39438a.f41603e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((D5) this.f39438a.f41613p).f39287d.set(true);
        if (this.f39458v) {
            ((D5) this.f39438a.f41613p).f();
        }
    }

    public Fh(C4940s5 c4940s5, C4745kh c4745kh, Rb rb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C4555d7 c4555d7, PublicLogger publicLogger, C4933ro c4933ro, RequestBodyEncrypter requestBodyEncrypter) {
        this(c4940s5, publicLogger, c4555d7, c4745kh, c4933ro, rb, new C5014v3(1024000, "event value in ReportTask", publicLogger), AbstractC4962t1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Fh(C4940s5 c4940s5, PublicLogger publicLogger, C4555d7 c4555d7, C4745kh c4745kh, C4933ro c4933ro, Rb rb, C5014v3 c5014v3, Zj zj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f39439b = new LinkedHashMap();
        this.f39444g = 0;
        this.f39445h = 0;
        this.i = -1;
        this.f39458v = false;
        this.f39456t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f39451o = c4745kh;
        this.f39438a = c4940s5;
        this.f39442e = c4555d7;
        this.f39448l = publicLogger;
        this.f39447k = c5014v3;
        this.f39449m = c4933ro;
        this.f39453q = rb;
        this.f39450n = zj;
        this.f39454r = requestDataHolder;
        this.f39455s = responseDataHolder;
        this.f39452p = fullUrlFormer;
    }

    public static C4893q9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C4893q9[] c4893q9Arr = new C4893q9[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C4893q9 c4893q9 = new C4893q9();
                c4893q9.f41470a = next;
                c4893q9.f41471b = jSONObject.getString(next);
                c4893q9Arr[i] = c4893q9;
            } catch (Throwable unused) {
            }
            i++;
        }
        return c4893q9Arr;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public final void a(boolean z10) {
        boolean z11;
        C4933ro c4933ro = this.f39449m;
        int i = this.f39457u;
        synchronized (c4933ro) {
            C4959so c4959so = c4933ro.f41594a;
            c4959so.a(c4959so.a().put("report_request_id", i));
        }
        C5095y9[] c5095y9Arr = this.f39441d.f39162a;
        int i10 = 0;
        while (i10 < c5095y9Arr.length) {
            try {
                C5095y9 c5095y9 = c5095y9Arr[i10];
                long jLongValue = ((Long) this.f39443f.get(i10)).longValue();
                Tk tk = (Tk) AbstractC4486ag.f40521b.get(c5095y9.f42131b.f42062c);
                if (tk == null) {
                    tk = Tk.FOREGROUND;
                }
                z11 = z10;
                try {
                    this.f39442e.a(jLongValue, tk.f40197a, c5095y9.f42132c.length, z11);
                    AbstractC4486ag.a(c5095y9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z11 = z10;
            }
            i10++;
            z10 = z11;
        }
        C4555d7 c4555d7 = this.f39442e;
        long jA = this.f39438a.f41607j.a();
        c4555d7.f40710b.lock();
        try {
            if (P5.f39956a.booleanValue()) {
                c4555d7.d();
            }
            SQLiteDatabase writableDatabase = c4555d7.f40711c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", N5.f39892c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused3) {
        }
        c4555d7.f40710b.unlock();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6 A[LOOP:1: B:44:0x00e0->B:46:0x00e6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Eh a(io.appmetrica.analytics.impl.C5028vh r17) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Fh.a(io.appmetrica.analytics.impl.vh):io.appmetrica.analytics.impl.Eh");
    }

    public static C4625g0 a(ContentValues contentValues) {
        C5068x7 model = new C5093y7(null, 1, null).toModel(contentValues);
        return new C4625g0((String) WrapUtils.getOrDefault(model.f42052g.f41904g, ""), ((Long) WrapUtils.getOrDefault(model.f42052g.f41905h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:8:0x0026, B:9:0x002c, B:11:0x0033, B:13:0x0039, B:28:0x006c, B:30:0x0072, B:43:0x009b, B:51:0x00b5, B:53:0x00c4, B:60:0x00d0, B:59:0x00cf, B:56:0x00ca, B:61:0x00d6, B:64:0x00e8, B:71:0x00fa, B:67:0x00ef, B:48:0x00aa, B:72:0x0105, B:74:0x010b, B:26:0x0066), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.Dh a(long r18, io.appmetrica.analytics.impl.C5070x9 r20, io.appmetrica.analytics.impl.C5028vh r21, java.util.ArrayList r22, int r23) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Fh.a(long, io.appmetrica.analytics.impl.x9, io.appmetrica.analytics.impl.vh, java.util.ArrayList, int):io.appmetrica.analytics.impl.Dh");
    }

    public final Cursor a() {
        SQLiteDatabase readableDatabase;
        C4555d7 c4555d7 = this.f39442e;
        LinkedHashMap linkedHashMap = this.f39439b;
        c4555d7.f40709a.lock();
        try {
            readableDatabase = c4555d7.f40711c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, C4555d7.a(linkedHashMap), C4555d7.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        c4555d7.f40709a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j4, Tk tk) {
        SQLiteDatabase readableDatabase;
        C4555d7 c4555d7 = this.f39442e;
        c4555d7.f40709a.lock();
        try {
            readableDatabase = c4555d7.f40711c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j4), Integer.toString(tk.f40197a)}, null, null, "number_in_session ASC", null) : null;
        c4555d7.f40709a.unlock();
        return cursorQuery;
    }
}
