package Wg;

import Ej.b;
import Ej.c;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final b f23911a = c.i(a.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f23912b = Charset.forName("UTF-16LE");

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f23913c = Charset.forName("US-ASCII");

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f23914d;

    static {
        f23914d = System.getProperty("jcifs.maskSecretValue", "true") == "true";
    }

    public static String a(String str) {
        return (!f23914d || str == null) ? str : str.replaceFirst("^(smb.*:).*(@.*)$", "$1******$2");
    }
}
