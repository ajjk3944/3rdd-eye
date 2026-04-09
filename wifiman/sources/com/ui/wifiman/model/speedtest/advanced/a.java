package com.ui.wifiman.model.speedtest.advanced;

import com.ui.wifiman.model.speedtest.Speedtest;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface a extends Speedtest {

    /* renamed from: com.ui.wifiman.model.speedtest.advanced.a$a, reason: collision with other inner class name */
    public static final class C1418a implements Speedtest.b {

        /* renamed from: a, reason: collision with root package name */
        private final String f42919a;

        /* renamed from: b, reason: collision with root package name */
        private final g f42920b;

        public /* synthetic */ C1418a(String str, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, gVar);
        }

        public final String a() {
            return this.f42919a;
        }

        public final g b() {
            return this.f42920b;
        }

        private C1418a(String consoleId, g gatewayIp) {
            AbstractC6492s.i(consoleId, "consoleId");
            AbstractC6492s.i(gatewayIp, "gatewayIp");
            this.f42919a = consoleId;
            this.f42920b = gatewayIp;
        }
    }
}
