package y8;

import androidx.lifecycle.o;
import g4.j;
import java.util.List;
import u8.i;
import u8.m;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f25879g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, List list) {
        super(14, list);
        this.f25879g = i10;
    }

    @Override // y8.e
    public final u8.d E0() {
        switch (this.f25879g) {
            case 0:
                return new u8.e(0, (List) this.f1504d);
            case 1:
                return new i(0, (List) this.f1504d);
            case 2:
                return new u8.e(1, (List) this.f1504d);
            case 3:
                return new i(1, (List) this.f1504d);
            case 4:
                return new i(2, (List) this.f1504d);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return new m((List) this.f1504d);
            default:
                return new u8.e(2, (List) this.f1504d);
        }
    }
}
