package p4;

import android.widget.Toast;
import com.lefan.signal.MainActivity;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2781h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22887b;

    public /* synthetic */ C2781h(int i, Object obj) {
        this.f22886a = i;
        this.f22887b = obj;
    }

    public final void a(B2.a aVar) {
        int i = this.f22886a;
        Object obj = this.f22887b;
        switch (i) {
            case 0:
                MainActivity mainActivity = (MainActivity) obj;
                int i3 = MainActivity.f18804V;
                if (aVar != null) {
                    Toast.makeText(mainActivity, aVar.f521b, 1).show();
                    break;
                }
                break;
            default:
                ((F4.c) obj).f("agree");
                break;
        }
    }
}
