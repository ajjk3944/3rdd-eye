package k0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.b;

/* loaded from: classes.dex */
public class a {

    /* renamed from: k0.a$a, reason: collision with other inner class name */
    class DialogInterfaceOnClickListenerC0033a implements DialogInterface.OnClickListener {
        DialogInterfaceOnClickListenerC0033a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.cancel();
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        b.a aVar = new b.a(context);
        aVar.k(str).g(str2).d(false).h(str3, new DialogInterfaceOnClickListenerC0033a());
        aVar.a().show();
    }
}
