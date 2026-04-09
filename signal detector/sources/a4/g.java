package a4;

import A2.C0117e;
import b4.C0351p;
import b4.InterfaceC0353r;
import d4.C2268b;
import d4.C2269c;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class g implements InterfaceC0353r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4694a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0353r f4695b;

    public /* synthetic */ g(InterfaceC0353r interfaceC0353r, int i) {
        this.f4694a = i;
        this.f4695b = interfaceC0353r;
    }

    @Override // b4.InterfaceC0353r
    public Object a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i = this.f4694a;
        InterfaceC0353r interfaceC0353r = this.f4695b;
        switch (i) {
            case 0:
                File file = (File) interfaceC0353r.a();
                if (file == null) {
                    return null;
                }
                X3.e eVar = C2268b.f19787c;
                File file2 = new File(file, "local_testing_config.xml");
                if (!file2.exists()) {
                    return C2269c.f19790c;
                }
                int i3 = 0;
                try {
                    FileReader fileReader = new FileReader(file2);
                    try {
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setInput(fileReader);
                        C2268b c2268b = new C2268b(xmlPullParserNewPullParser);
                        c2268b.a("local-testing-config", new d4.h(i3, c2268b));
                        C2269c c2269cB = c2268b.f19789b.B();
                        fileReader.close();
                        return c2269cB;
                    } catch (Throwable th) {
                        try {
                            fileReader.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException | RuntimeException | XmlPullParserException e6) {
                    C2268b.f19787c.d("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e6.getMessage());
                    return C2269c.f19790c;
                }
            default:
                o oVar = (o) interfaceC0353r.a();
                if (oVar != null) {
                    return oVar;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public /* synthetic */ g(J2.i iVar) {
        this.f4694a = 2;
        f fVar = new f(iVar, 0);
        InterfaceC0353r interfaceC0353rC = C0351p.c(new h(fVar, 1));
        InterfaceC0353r interfaceC0353rC2 = C0351p.c(new f(iVar, 1));
        InterfaceC0353r interfaceC0353rC3 = C0351p.c(new C0117e(25, fVar));
        InterfaceC0353r interfaceC0353rC4 = C0351p.c(new c1.g(interfaceC0353rC, interfaceC0353rC2, interfaceC0353rC3, C0351p.c(new U0.j(23, fVar)), 14));
        InterfaceC0353r interfaceC0353rC5 = C0351p.c(new h(fVar, 0));
        this.f4695b = C0351p.c(new g(C0351p.c(new V2.e(interfaceC0353rC4, C0351p.c(new c1.g(fVar, interfaceC0353rC5, interfaceC0353rC3, new g(interfaceC0353rC5, 0), 17)), interfaceC0353rC5, 19)), 1));
    }
}
