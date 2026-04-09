package w8;

import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import i8.C4461a;
import p9.InterfaceC5480a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements InterfaceC5480a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47559c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47560d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f47558b = i;
        this.f47559c = obj;
        this.f47560d = obj2;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() throws Throwable {
        switch (this.f47558b) {
            case 0:
                ((i) this.f47559c).b((AppCompatActivity) this.f47560d, null);
                break;
            case 1:
                ((i) this.f47559c).b((AppCompatActivity) this.f47560d, null);
                break;
            default:
                ((C4461a) this.f47559c).t((String) this.f47560d, "user_status");
                break;
        }
        return C1992A.f18074a;
    }
}
