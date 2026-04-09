package Sg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;
import jcifs.smb1.smb1.N;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name */
    private static int f20611d;

    /* renamed from: a, reason: collision with root package name */
    private static final String f20608a = Rg.a.g("jcifs.smb1.netbios.lmhosts");

    /* renamed from: b, reason: collision with root package name */
    private static final Hashtable f20609b = new Hashtable();

    /* renamed from: c, reason: collision with root package name */
    private static long f20610c = 1;

    /* renamed from: e, reason: collision with root package name */
    private static Ug.e f20612e = Ug.e.a();

    static synchronized g a(b bVar) {
        g gVar;
        gVar = null;
        try {
            try {
                String str = f20608a;
                if (str != null) {
                    File file = new File(str);
                    long jLastModified = file.lastModified();
                    if (jLastModified > f20610c) {
                        f20610c = jLastModified;
                        f20609b.clear();
                        f20611d = 0;
                        c(new FileReader(file));
                    }
                    gVar = (g) f20609b.get(bVar);
                }
            } catch (FileNotFoundException e10) {
                if (Ug.e.f22464b > 1) {
                    f20612e.println("lmhosts file: " + f20608a);
                    e10.printStackTrace(f20612e);
                }
            } catch (IOException e11) {
                if (Ug.e.f22464b > 0) {
                    e11.printStackTrace(f20612e);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    public static synchronized g b(String str) {
        return a(new b(str, 32, null));
    }

    static void c(Reader reader) throws IOException {
        String line;
        int i10;
        BufferedReader bufferedReader = new BufferedReader(reader);
        while (true) {
            String line2 = bufferedReader.readLine();
            if (line2 == null) {
                return;
            }
            String strTrim = line2.toUpperCase().trim();
            if (strTrim.length() != 0) {
                if (strTrim.charAt(0) == '#') {
                    if (strTrim.startsWith("#INCLUDE ")) {
                        String str = "smb1:" + strTrim.substring(strTrim.indexOf(92)).replace('\\', '/');
                        if (f20611d > 0) {
                            try {
                                c(new InputStreamReader(new N(str)));
                                f20611d--;
                                do {
                                    line = bufferedReader.readLine();
                                    if (line != null) {
                                    }
                                } while (!line.toUpperCase().trim().startsWith("#END_ALTERNATE"));
                            } catch (IOException e10) {
                                f20612e.println("lmhosts URL: " + str);
                                e10.printStackTrace(f20612e);
                            }
                        } else {
                            c(new InputStreamReader(new N(str)));
                        }
                    } else if (strTrim.startsWith("#BEGIN_ALTERNATE")) {
                        f20611d++;
                    } else if (strTrim.startsWith("#END_ALTERNATE") && (i10 = f20611d) > 0) {
                        f20611d = i10 - 1;
                        throw new IOException("no lmhosts alternate includes loaded");
                    }
                } else if (Character.isDigit(strTrim.charAt(0))) {
                    char[] charArray = strTrim.toCharArray();
                    int i11 = 0;
                    int i12 = 0;
                    char c10 = '.';
                    while (i11 < charArray.length && c10 == '.') {
                        int i13 = 0;
                        while (i11 < charArray.length && (c10 = charArray[i11]) >= '0' && c10 <= '9') {
                            i13 = ((i13 * 10) + c10) - 48;
                            i11++;
                        }
                        i12 = (i12 << 8) + i13;
                        i11++;
                    }
                    while (i11 < charArray.length && Character.isWhitespace(charArray[i11])) {
                        i11++;
                    }
                    int i14 = i11;
                    while (i14 < charArray.length && !Character.isWhitespace(charArray[i14])) {
                        i14++;
                    }
                    b bVar = new b(strTrim.substring(i11, i14), 32, null);
                    f20609b.put(bVar, new g(bVar, i12, false, 0, false, false, true, true, g.f20675t));
                }
            }
        }
    }
}
