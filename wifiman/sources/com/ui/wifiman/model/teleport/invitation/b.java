package com.ui.wifiman.model.teleport.invitation;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ui.wifiman.model.teleport.invitation.TeleportInvitationService;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.util.UUID;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;

/* loaded from: classes4.dex */
public final class b implements TeleportInvitationService {

    /* renamed from: c, reason: collision with root package name */
    public static final a f43364c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f43365a;

    /* renamed from: b, reason: collision with root package name */
    private final ClipboardManager f43366b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.model.teleport.invitation.b$b, reason: collision with other inner class name */
    public static final class C1461b implements C {
        public C1461b() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            ClipData.Item itemAt;
            try {
                ClipData primaryClip = b.this.f43366b.getPrimaryClip();
                CharSequence charSequenceCoerceToText = (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) ? null : itemAt.coerceToText(b.this.f43365a);
                if (charSequenceCoerceToText == null || t.m0(charSequenceCoerceToText) || charSequenceCoerceToText.length() > 500) {
                    throw TeleportInvitationService.Error.ClipboardEmpty.f43336a;
                }
                interfaceC5910A.onSuccess(Uri.parse(charSequenceCoerceToText.toString()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Uri uri) {
            b bVar = b.this;
            AbstractC6492s.f(uri);
            return bVar.b(uri);
        }
    }

    public static final class d implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f43369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f43370b;

        public d(Uri uri, b bVar) {
            this.f43369a = uri;
            this.f43370b = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                if (!AbstractC6492s.d(this.f43369a.getScheme(), "https")) {
                    throw new TeleportInvitationService.Error.InvitationNotValid(this.f43369a);
                }
                if (!AbstractC6492s.d(this.f43369a.getHost(), "teleport.ui.link")) {
                    throw new TeleportInvitationService.Error.InvitationNotValid(this.f43369a);
                }
                if (this.f43369a.getPathSegments() == null || this.f43369a.getPathSegments().size() != 1) {
                    throw new TeleportInvitationService.Error.InvitationNotValid(this.f43369a);
                }
                b bVar = this.f43370b;
                String str = this.f43369a.getPathSegments().get(0);
                AbstractC6492s.h(str, "get(...)");
                if (!bVar.f(str)) {
                    throw new TeleportInvitationService.Error.InvitationNotValid(this.f43369a);
                }
                String str2 = this.f43369a.getPathSegments().get(0);
                AbstractC6492s.h(str2, "get(...)");
                interfaceC5910A.onSuccess(new TeleportCloud.e.b(str2));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public b(Context applicationContext, ClipboardManager clipboardManager) {
        AbstractC6492s.i(applicationContext, "applicationContext");
        AbstractC6492s.i(clipboardManager, "clipboardManager");
        this.f43365a = applicationContext;
        this.f43366b = clipboardManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(String str) {
        try {
            UUID.fromString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.ui.wifiman.model.teleport.invitation.TeleportInvitationService
    public z a() {
        z zVarI = z.i(new C1461b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarS = zVarI.s(new c());
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    @Override // com.ui.wifiman.model.teleport.invitation.TeleportInvitationService
    public z b(Uri uri) {
        AbstractC6492s.i(uri, "uri");
        z zVarI = z.i(new d(uri, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }
}
