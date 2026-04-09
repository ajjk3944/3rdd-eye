package N7;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAnimator.kt */
/* renamed from: N7.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1402w2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9656a;

    /* compiled from: DivAnimator.kt */
    /* renamed from: N7.w2$a */
    public static final class a extends AbstractC1402w2 {

        /* renamed from: b, reason: collision with root package name */
        public final C1389v3 f9657b;

        public a(C1389v3 c1389v3) {
            this.f9657b = c1389v3;
        }
    }

    /* compiled from: DivAnimator.kt */
    /* renamed from: N7.w2$b */
    public static final class b extends AbstractC1402w2 {

        /* renamed from: b, reason: collision with root package name */
        public final C1212i7 f9658b;

        public b(C1212i7 c1212i7) {
            this.f9658b = c1212i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(N7.AbstractC1402w2 r9, A7.d r10, A7.d r11) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.AbstractC1402w2.a(N7.w2, A7.d, A7.d):boolean");
    }

    public final int b() {
        int iB;
        int iB2;
        int iHashCode;
        int iIntValue;
        int iB3;
        int iB4;
        Integer num = this.f9656a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof a) {
            C1389v3 c1389v3 = ((a) this).f9657b;
            Integer num2 = c1389v3.f9563l;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                int iHashCode3 = kotlin.jvm.internal.x.a(C1389v3.class).hashCode();
                List<C1175g0> list = c1389v3.f9553a;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    iB3 = 0;
                    while (it.hasNext()) {
                        iB3 += ((C1175g0) it.next()).b();
                    }
                } else {
                    iB3 = 0;
                }
                int iHashCode4 = c1389v3.f9555c.hashCode() + c1389v3.f9554b.hashCode() + iHashCode3 + iB3;
                List<C1175g0> list2 = c1389v3.f9556d;
                if (list2 != null) {
                    Iterator<T> it2 = list2.iterator();
                    iB4 = 0;
                    while (it2.hasNext()) {
                        iB4 += ((C1175g0) it2.next()).b();
                    }
                } else {
                    iB4 = 0;
                }
                int iHashCode5 = c1389v3.i.hashCode() + c1389v3.f9560h.b() + c1389v3.f9559g.hashCode() + c1389v3.f9558f.hashCode() + c1389v3.f9557e.hashCode() + iHashCode4 + iB4;
                A7.b<Integer> bVar = c1389v3.f9561j;
                iHashCode = c1389v3.f9562k.hashCode() + iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
                c1389v3.f9563l = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        } else {
            if (!(this instanceof b)) {
                throw new b9.j();
            }
            C1212i7 c1212i7 = ((b) this).f9658b;
            Integer num3 = c1212i7.f8416l;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                int iHashCode6 = kotlin.jvm.internal.x.a(C1212i7.class).hashCode();
                List<C1175g0> list3 = c1212i7.f8406a;
                if (list3 != null) {
                    Iterator<T> it3 = list3.iterator();
                    iB = 0;
                    while (it3.hasNext()) {
                        iB += ((C1175g0) it3.next()).b();
                    }
                } else {
                    iB = 0;
                }
                int iHashCode7 = c1212i7.f8408c.hashCode() + c1212i7.f8407b.hashCode() + iHashCode6 + iB;
                List<C1175g0> list4 = c1212i7.f8409d;
                if (list4 != null) {
                    Iterator<T> it4 = list4.iterator();
                    iB2 = 0;
                    while (it4.hasNext()) {
                        iB2 += ((C1175g0) it4.next()).b();
                    }
                } else {
                    iB2 = 0;
                }
                int iHashCode8 = c1212i7.i.hashCode() + c1212i7.f8413h.b() + c1212i7.f8412g.hashCode() + c1212i7.f8411f.hashCode() + c1212i7.f8410e.hashCode() + iHashCode7 + iB2;
                A7.b<Double> bVar2 = c1212i7.f8414j;
                iHashCode = c1212i7.f8415k.hashCode() + iHashCode8 + (bVar2 != null ? bVar2.hashCode() : 0);
                c1212i7.f8416l = Integer.valueOf(iHashCode);
                iIntValue = iHashCode;
            }
        }
        int i = iHashCode2 + iIntValue;
        this.f9656a = Integer.valueOf(i);
        return i;
    }

    public final InterfaceC1416x2 c() {
        if (this instanceof a) {
            return ((a) this).f9657b;
        }
        if (this instanceof b) {
            return ((b) this).f9658b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1430y2) D7.a.f1071b.f6863q1.getValue()).b(D7.a.f1070a, this);
    }
}
