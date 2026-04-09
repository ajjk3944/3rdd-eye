package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public class c2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19147a;

    /* renamed from: b, reason: collision with root package name */
    private final Activity f19148b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f19149c;

    /* renamed from: d, reason: collision with root package name */
    private a f19150d;

    public interface a {
        void a();

        void b();
    }

    public c2(Activity activity, com.applovin.impl.sdk.k kVar) {
        this.f19147a = kVar;
        this.f19148b = activity;
    }

    public void e() {
        this.f19148b.runOnUiThread(new L0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        this.f19150d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        AlertDialog alertDialog = this.f19149c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f19149c = new AlertDialog.Builder(this.f19148b).setTitle((CharSequence) this.f19147a.a(l4.f19896c1)).setMessage((CharSequence) this.f19147a.a(l4.f19904d1)).setCancelable(false).setPositiveButton((CharSequence) this.f19147a.a(l4.f19919f1), new C2.d(this, 1)).setNegativeButton((CharSequence) this.f19147a.a(l4.f19912e1), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.G
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f18803b.b(dialogInterface, i);
            }
        }).show();
    }

    public void a(a aVar) {
        this.f19150d = aVar;
    }

    public void a() {
        this.f19148b.runOnUiThread(new C2.h(this, 14));
    }

    public boolean b() {
        AlertDialog alertDialog = this.f19149c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        this.f19150d.b();
    }
}
