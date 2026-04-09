package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qs implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rs f15427b;

    public /* synthetic */ qs(rs rsVar, int i4) {
        this.f15426a = i4;
        this.f15427b = rsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) throws JSONException {
        switch (this.f15426a) {
            case 0:
                rs rsVar = this.f15427b;
                rsVar.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", rsVar.g);
                data.putExtra("eventLocation", rsVar.f15746k);
                data.putExtra("description", rsVar.j);
                long j = rsVar.f15744h;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j8 = rsVar.f15745i;
                if (j8 > -1) {
                    data.putExtra("endTime", j8);
                }
                data.setFlags(268435456);
                ya.f0 f0Var = ua.j.C.f35261c;
                ya.f0.u(rsVar.f15743f, data);
                break;
            default:
                this.f15427b.y("Operation denied by user.");
                break;
        }
    }
}
