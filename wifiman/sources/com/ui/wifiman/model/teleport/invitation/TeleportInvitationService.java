package com.ui.wifiman.model.teleport.invitation;

import Wc.d;
import android.net.Uri;
import gg.z;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes4.dex */
public interface TeleportInvitationService {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LWc/d;", "<init>", "()V", "ClipboardEmpty", "InvitationNotValid", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$ClipboardEmpty;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends Exception implements d {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$ClipboardEmpty;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ClipboardEmpty extends Error {

            /* renamed from: a, reason: collision with root package name */
            public static final ClipboardEmpty f43336a = new ClipboardEmpty();

            private ClipboardEmpty() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ClipboardEmpty);
            }

            public int hashCode() {
                return 185431015;
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "ClipboardEmpty";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;", "Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "getMessage", "message", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvitationNotValid extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Uri uri;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvitationNotValid(Uri uri) {
                super(null);
                AbstractC6492s.i(uri, "uri");
                this.uri = uri;
                this.message = "Invitation not valid: " + uri;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvitationNotValid) && AbstractC6492s.d(this.uri, ((InvitationNotValid) other).uri);
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.uri.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "InvitationNotValid(uri=" + this.uri + ")";
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    z a();

    z b(Uri uri);
}
