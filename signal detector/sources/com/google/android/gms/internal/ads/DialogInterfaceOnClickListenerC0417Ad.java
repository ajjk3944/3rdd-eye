package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import org.json.JSONException;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0417Ad implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0434Bd f7016b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0417Ad(C0434Bd c0434Bd, int i) {
        this.f7015a = i;
        this.f7016b = c0434Bd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f7015a) {
            case 0:
                C0434Bd c0434Bd = this.f7016b;
                c0434Bd.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", c0434Bd.f7373f);
                data.putExtra("eventLocation", c0434Bd.f7376j);
                data.putExtra("description", c0434Bd.i);
                long j6 = c0434Bd.f7374g;
                if (j6 > -1) {
                    data.putExtra("beginTime", j6);
                }
                long j7 = c0434Bd.f7375h;
                if (j7 > -1) {
                    data.putExtra("endTime", j7);
                }
                data.setFlags(268435456);
                C2911G c2911g = p2.j.f22785C.f22790c;
                C2911G.u(c0434Bd.f7372e, data);
                break;
            default:
                this.f7016b.z("Operation denied by user.");
                break;
        }
    }
}
