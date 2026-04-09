package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f3276a = new ConcurrentLinkedQueue<>();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3277a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f3277a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3277a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3277a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f3278a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f3279b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f3280c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f3280c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f3278a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f3278a = jSONObject;
            }
            this.f3279b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f3278a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f3278a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i4 = AnonymousClass1.f3277a[this.f3280c.ordinal()];
            if (i4 == 1) {
                return this.f3278a.optString("data", null);
            }
            if (i4 == 2) {
                return this.f3278a.optString("stack", null);
            }
            if (i4 != 3) {
                return null;
            }
            return this.f3278a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f3276a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f3276a.isEmpty()) {
            f3276a.poll();
        }
        f3276a = null;
    }
}
