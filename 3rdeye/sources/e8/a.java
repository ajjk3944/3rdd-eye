package E8;

import A9.C0575f;
import A9.U;
import E8.b;
import F8.d;
import F8.e;
import H0.f;
import N7.G8;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.applovin.impl.sdk.k;
import com.applovin.impl.u1;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.support.ContactSupportActivity;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.l;
import z0.C5849b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1480e;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i) {
        this.f1477b = i;
        this.f1478c = obj;
        this.f1479d = obj2;
        this.f1480e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f1480e;
        Object obj2 = this.f1479d;
        Object obj3 = this.f1478c;
        switch (this.f1477b) {
            case 0:
                final G8.a model = (G8.a) ((List) obj2).get(((b.a) obj).getAdapterPosition());
                d.b bVar = (d.b) obj3;
                bVar.getClass();
                l.f(model, "model");
                final e eVar = bVar.f1725a;
                f fVar = eVar.f1726b;
                if (fVar == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) fVar.f1984d).setVisibility(0);
                f fVar2 = eVar.f1726b;
                if (fVar2 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ConstraintLayout) fVar2.f1985e).setVisibility(0);
                f fVar3 = eVar.f1726b;
                if (fVar3 == null) {
                    l.l("binding");
                    throw null;
                }
                ((ImageView) fVar3.f1984d).setOnClickListener(new View.OnClickListener() { // from class: F8.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String str = model.f1939b;
                        e eVar2 = eVar;
                        Context context = eVar2.getContext();
                        if (context != null) {
                            Uri uriForFile = Build.VERSION.SDK_INT >= 24 ? C5849b.getUriForFile(context, G8.s(context.getPackageName(), ".com.zipoapps.premiumhelper.share"), new File(str)) : Uri.parse(str);
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.STREAM", uriForFile);
                            Intent intentCreateChooser = Intent.createChooser(intent, "Share Logs File");
                            if (intent.resolveActivity(context.getPackageManager()) == null) {
                                Toast.makeText(context, "No app available to handle this action", 0).show();
                                return;
                            }
                            com.zipoapps.premiumhelper.e.f37006D.getClass();
                            e.a.a().f();
                            eVar2.startActivity(intentCreateChooser);
                        }
                    }
                });
                C0575f.e(A2.l.y(eVar), U.f212b, null, new F8.b(eVar, model, null), 2);
                return;
            case 1:
                ((u1) obj3).a((Activity) obj2, (k) obj, view);
                return;
            default:
                int i = ContactSupportActivity.f37060f;
                com.zipoapps.premiumhelper.e.f37006D.getClass();
                com.zipoapps.premiumhelper.e eVarA = e.a.a();
                ContactSupportActivity contactSupportActivity = (ContactSupportActivity) obj3;
                Object value = contactSupportActivity.f37063e.getValue();
                l.e(value, "getValue(...)");
                String string = ((EditText) value).getText().toString();
                eVarA.f37036z.d(contactSupportActivity, (String) obj2, (String) obj, string);
                contactSupportActivity.finish();
                return;
        }
    }
}
