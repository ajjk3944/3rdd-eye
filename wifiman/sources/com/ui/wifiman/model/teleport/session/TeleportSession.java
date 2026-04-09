package com.ui.wifiman.model.teleport.session;

import J7.G;
import Wc.d;
import gg.AbstractC5912b;
import gg.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface TeleportSession extends G {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LWc/d;", "<init>", "()V", "VPNProfileCreationCancelledBySystem", "Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error$VPNProfileCreationCancelledBySystem;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException implements d {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error$VPNProfileCreationCancelledBySystem;", "Lcom/ui/wifiman/model/teleport/session/TeleportSession$Error;", "<init>", "()V", "", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VPNProfileCreationCancelledBySystem extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final VPNProfileCreationCancelledBySystem f43482a = new VPNProfileCreationCancelledBySystem();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final String message = "When other VPN or Always ON VPN is currently running it's not possible to create other VPN profile";

            private VPNProfileCreationCancelledBySystem() {
                super(null);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return message;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f43484a;

        public a(boolean z10) {
            this.f43484a = z10;
        }

        public final boolean a() {
            return this.f43484a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f43484a == ((a) obj).f43484a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f43484a);
        }

        public String toString() {
            return "PermissionState(vpnProfileApproved=" + this.f43484a + ")";
        }
    }

    i a();

    AbstractC5912b b();

    i c();

    i d();

    AbstractC5912b e(String str);

    AbstractC5912b g(String str);
}
