package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static a f6307a = new b(0);

    public static class a {
        private a() {
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }

        public /* synthetic */ a(byte b5) {
            this();
        }
    }

    @TargetApi(16)
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.i.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        public /* synthetic */ b(byte b5) {
            this();
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f6307a.a(memoryInfo);
    }
}
