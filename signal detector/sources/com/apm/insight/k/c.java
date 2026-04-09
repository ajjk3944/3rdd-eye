package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f6233a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6234a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6234a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6234a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6234a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f6235a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f6236b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f6237c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f6237c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f6235a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f6235a = jSONObject;
            }
            this.f6236b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f6235a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f6235a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i = AnonymousClass1.f6234a[this.f6237c.ordinal()];
            if (i == 1) {
                return this.f6235a.optString("data", null);
            }
            if (i == 2) {
                return this.f6235a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f6235a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f6233a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f6233a.isEmpty()) {
            f6233a.poll();
        }
        f6233a = null;
    }
}
