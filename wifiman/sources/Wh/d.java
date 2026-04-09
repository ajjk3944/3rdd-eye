package Wh;

import Uh.o;
import Uh.p;
import Yg.y;
import Zg.AbstractC3689v;
import java.util.LinkedList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final p f23966a;

    /* renamed from: b, reason: collision with root package name */
    private final o f23967b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23968a;

        static {
            int[] iArr = new int[o.c.EnumC0835c.values().length];
            try {
                iArr[o.c.EnumC0835c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.c.EnumC0835c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.c.EnumC0835c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23968a = iArr;
        }
    }

    public d(p strings, o qualifiedNames) {
        AbstractC6492s.i(strings, "strings");
        AbstractC6492s.i(qualifiedNames, "qualifiedNames");
        this.f23966a = strings;
        this.f23967b = qualifiedNames;
    }

    private final y c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c cVarK = this.f23967b.K(i10);
            String strK = this.f23966a.K(cVarK.d0());
            o.c.EnumC0835c enumC0835cS = cVarK.S();
            AbstractC6492s.f(enumC0835cS);
            int i11 = a.f23968a[enumC0835cS.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strK);
            } else if (i11 == 2) {
                linkedList.addFirst(strK);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(strK);
                z10 = true;
            }
            i10 = cVarK.T();
        }
        return new y(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // Wh.c
    public String a(int i10) {
        y yVarC = c(i10);
        List list = (List) yVarC.a();
        String strZ0 = AbstractC3689v.z0((List) yVarC.c(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strZ0;
        }
        return AbstractC3689v.z0(list, MqttTopic.TOPIC_LEVEL_SEPARATOR, null, null, 0, null, null, 62, null) + '/' + strZ0;
    }

    @Override // Wh.c
    public boolean b(int i10) {
        return ((Boolean) c(i10).m()).booleanValue();
    }

    @Override // Wh.c
    public String getString(int i10) {
        String strK = this.f23966a.K(i10);
        AbstractC6492s.h(strK, "getString(...)");
        return strK;
    }
}
