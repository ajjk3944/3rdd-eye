package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f5055a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5056a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f5056a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5056a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5056a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f5057a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f5058b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f5059c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f5059c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f5057a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f5057a = jSONObject;
            }
            this.f5058b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public final String a() {
            return this.f5057a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f5057a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i10 = AnonymousClass1.f5056a[this.f5059c.ordinal()];
            if (i10 == 1) {
                return this.f5057a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f5057a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f5057a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f5055a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f5055a.isEmpty()) {
            f5055a.poll();
        }
        f5055a = null;
    }
}
