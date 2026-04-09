package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l82 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ m82 g;

    public /* synthetic */ l82(m82 m82Var, int i) {
        this.f = i;
        this.g = m82Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        switch (this.f) {
            case 0:
                m82 m82Var = this.g;
                m82Var.getClass();
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                data.putExtra("title", m82Var.k);
                data.putExtra("eventLocation", m82Var.o);
                data.putExtra("description", m82Var.n);
                long j = m82Var.l;
                if (j > -1) {
                    data.putExtra("beginTime", j);
                }
                long j2 = m82Var.m;
                if (j2 > -1) {
                    data.putExtra("endTime", j2);
                }
                data.setFlags(268435456);
                lf4 lf4Var = hg4.C.c;
                lf4.s(m82Var.j, data);
                break;
            default:
                this.g.G("Operation denied by user.");
                break;
        }
    }
}
