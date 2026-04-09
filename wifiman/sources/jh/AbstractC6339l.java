package jh;

import Yg.J;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* renamed from: jh.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6339l {
    public static final long b(Reader reader, Writer out, int i10) throws IOException {
        AbstractC6492s.i(reader, "<this>");
        AbstractC6492s.i(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long c(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return b(reader, writer, i10);
    }

    public static final void d(Reader reader, InterfaceC6835l action) {
        AbstractC6492s.i(reader, "<this>");
        AbstractC6492s.i(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = e(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            J j10 = J.f24997a;
            AbstractC6329b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final InterfaceC8780j e(BufferedReader bufferedReader) {
        AbstractC6492s.i(bufferedReader, "<this>");
        return AbstractC8783m.h(new C6337j(bufferedReader));
    }

    public static final List f(Reader reader) {
        AbstractC6492s.i(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        d(reader, new InterfaceC6835l() { // from class: jh.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return AbstractC6339l.g(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(ArrayList arrayList, String it) {
        AbstractC6492s.i(it, "it");
        arrayList.add(it);
        return J.f24997a;
    }

    public static final String h(Reader reader) {
        AbstractC6492s.i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        c(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
