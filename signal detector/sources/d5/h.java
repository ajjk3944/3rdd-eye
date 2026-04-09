package D5;

import a4.p;
import c5.C0409f;
import c5.C0412i;
import d5.AbstractC2282j;
import d5.AbstractC2283k;
import d5.s;
import h5.C2376j;
import h5.InterfaceC2375i;
import i5.EnumC2380a;
import java.util.ArrayList;
import java.util.List;
import p5.q;
import y5.l;
import z5.AbstractC3046w;

/* loaded from: classes3.dex */
public final class h extends j5.b implements C5.c {

    /* renamed from: d, reason: collision with root package name */
    public final C5.c f1303d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2375i f1304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1305f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2375i f1306g;

    /* renamed from: h, reason: collision with root package name */
    public j5.b f1307h;

    public h(C5.c cVar, InterfaceC2375i interfaceC2375i) {
        super(f.f1301a, C2376j.f20486a);
        this.f1303d = cVar;
        this.f1304e = interfaceC2375i;
        this.f1305f = ((Number) interfaceC2375i.o(0, g.f1302b)).intValue();
    }

    @Override // C5.c
    public final Object a(Object obj, j5.b bVar) {
        try {
            Object objN = n(bVar, obj);
            return objN == EnumC2380a.f20635a ? objN : C0412i.f5929a;
        } catch (Throwable th) {
            this.f1306g = new e(bVar.getContext(), th);
            throw th;
        }
    }

    @Override // j5.b, j5.c
    public final j5.c d() {
        j5.b bVar = this.f1307h;
        if (A.f.y(bVar)) {
            return bVar;
        }
        return null;
    }

    @Override // j5.b, h5.InterfaceC2370d
    public final InterfaceC2375i getContext() {
        InterfaceC2375i interfaceC2375i = this.f1306g;
        return interfaceC2375i == null ? C2376j.f20486a : interfaceC2375i;
    }

    @Override // j5.b
    public final StackTraceElement k() {
        return null;
    }

    @Override // j5.b
    public final Object l(Object obj) {
        Throwable thA = C0409f.a(obj);
        if (thA != null) {
            this.f1306g = new e(getContext(), thA);
        }
        j5.b bVar = this.f1307h;
        if (bVar != null) {
            bVar.e(obj);
        }
        return EnumC2380a.f20635a;
    }

    public final Object n(j5.b bVar, Object obj) {
        List listL;
        String strSubstring;
        InterfaceC2375i context = bVar.getContext();
        AbstractC3046w.f(context);
        InterfaceC2375i interfaceC2375i = this.f1306g;
        if (interfaceC2375i != context) {
            int i = 0;
            if (interfaceC2375i instanceof e) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((e) interfaceC2375i).f1299a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                q5.i.e(str, "<this>");
                y5.c cVar = new y5.c(str);
                if (cVar.hasNext()) {
                    Object next = cVar.next();
                    if (cVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (cVar.hasNext()) {
                            arrayList.add(cVar.next());
                        }
                        listL = arrayList;
                    } else {
                        listL = p.l(next);
                    }
                } else {
                    listL = s.f19824a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listL) {
                    if (!l.b0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(d5.l.P(arrayList2));
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList3.add(Integer.valueOf(length2));
                }
                Integer num = (Integer) AbstractC2282j.c0(arrayList3);
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listL.size();
                int iL = AbstractC2283k.L(listL);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listL) {
                    int i6 = i + 1;
                    if (i < 0) {
                        AbstractC2283k.O();
                        throw null;
                    }
                    String str3 = (String) obj4;
                    if ((i == 0 || i == iL) && l.b0(str3)) {
                        strSubstring = null;
                    } else {
                        q5.i.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(A.f.h(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        q5.i.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i = i6;
                }
                StringBuilder sb = new StringBuilder(length3);
                AbstractC2282j.W(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.o(0, new k(this))).intValue() != this.f1305f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1304e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1306g = context;
        }
        this.f1307h = bVar;
        q qVar = j.f1308a;
        C5.c cVar2 = this.f1303d;
        q5.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ((i) qVar).getClass();
        Object objA = cVar2.a(obj, this);
        if (!q5.i.a(objA, EnumC2380a.f20635a)) {
            this.f1307h = null;
        }
        return objA;
    }
}
