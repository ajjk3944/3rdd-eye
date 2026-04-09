package Vh;

import Zg.AbstractC3689v;
import Zg.Q;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.C7974i;

/* loaded from: classes4.dex */
public final class a extends Wh.a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0871a f23434g = new C0871a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f23435h = new a(1, 0, 7);

    /* renamed from: i, reason: collision with root package name */
    public static final a f23436i = new a(new int[0]);

    /* renamed from: Vh.a$a, reason: collision with other inner class name */
    public static final class C0871a {
        public /* synthetic */ C0871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(InputStream stream) {
            AbstractC6492s.i(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            C7974i c7974i = new C7974i(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(c7974i, 10));
            Iterator it = c7974i.iterator();
            while (it.hasNext()) {
                ((Q) it).d();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrH1 = AbstractC3689v.h1(arrayList);
            return new a(Arrays.copyOf(iArrH1, iArrH1.length));
        }

        private C0871a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC6492s.i(numbers, "numbers");
    }

    public boolean h() {
        return f(f23435h);
    }
}
