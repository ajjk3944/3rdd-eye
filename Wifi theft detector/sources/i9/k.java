package i9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.jvm.internal.p;
import kotlin.sequences.m;
import l9.l;
import y8.s;

/* loaded from: classes4.dex */
public abstract class k {
    public static final long a(Reader reader, Writer out, int i10) throws IOException {
        p.e(reader, "<this>");
        p.e(out, "out");
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

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(Reader reader, l action) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        p.e(reader, "<this>");
        p.e(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            s sVar = s.f25199a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final kotlin.sequences.g d(BufferedReader bufferedReader) {
        p.e(bufferedReader, "<this>");
        return m.e(new j(bufferedReader));
    }

    public static final String e(Reader reader) {
        p.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        p.d(string, "toString(...)");
        return string;
    }
}
