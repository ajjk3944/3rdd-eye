package com.yandex.mobile.ads.impl;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import b9.C1992A;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.yx;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class zx {

    /* renamed from: a, reason: collision with root package name */
    private final IntegrationInspectorActivity f36769a;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            a11.f24364a.b();
            zx zxVar = zx.this;
            String string = zxVar.f36769a.getString(R.string.logging_is_enabled);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            zx.a(zxVar, string);
            return C1992A.f18074a;
        }
    }

    public zx(IntegrationInspectorActivity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f36769a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i) {
    }

    public static final void a(zx zxVar, String str) {
        Toast.makeText(zxVar.f36769a, str, 0).show();
    }

    public final void a(yx event) {
        kotlin.jvm.internal.l.f(event, "event");
        if (event instanceof yx.c) {
            Toast.makeText(this.f36769a, ((yx.c) event).a(), 0).show();
            return;
        }
        if (event instanceof yx.e) {
            a(((yx.e) event).a());
            return;
        }
        if (event instanceof yx.d) {
            Uri uriA = ((yx.d) event).a();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", uriA);
            intent.setType("text/plain");
            this.f36769a.startActivity(intent);
            return;
        }
        if (event instanceof yx.b) {
            String string = this.f36769a.getString(R.string.logging_is_disabled);
            kotlin.jvm.internal.l.e(string, "getString(...)");
            String string2 = this.f36769a.getString(R.string.do_you_want_to_enable_logging);
            kotlin.jvm.internal.l.e(string2, "getString(...)");
            a(string, string2, new a());
            return;
        }
        if (event instanceof yx.a) {
            this.f36769a.finishAfterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC5480a interfaceC5480a, DialogInterface dialogInterface, int i) {
        if (interfaceC5480a != null) {
            interfaceC5480a.invoke();
        }
    }

    private final void a(String str) {
        new AlertDialog.Builder(this.f36769a).setMessage(str).setPositiveButton(this.f36769a.getString(R.string.ok), new Q4()).show();
    }

    private final void a(String str, String str2, final InterfaceC5480a<C1992A> interfaceC5480a) {
        new AlertDialog.Builder(this.f36769a).setTitle(str).setMessage(str2).setPositiveButton(this.f36769a.getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: com.yandex.mobile.ads.impl.R4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zx.a(interfaceC5480a, dialogInterface, i);
            }
        }).setNegativeButton(this.f36769a.getString(R.string.no), new S4()).show();
    }
}
