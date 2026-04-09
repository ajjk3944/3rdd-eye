package Z4;

import java.util.regex.Pattern;
import q5.i;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f4538a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f4539b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f4540c;

    static {
        Pattern patternCompile = Pattern.compile("^(?=^.{3,255}$)[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+$");
        i.d(patternCompile, "compile(...)");
        f4538a = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^(127\\.0\\.0\\.1)|(localhost)|(10\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|(100\\.(6[4-9]|[7-9]\\d|1[0-1]\\d|12[0-7])(\\.(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])){2})|(172\\.((1[6-9])|(2\\d)|(3[01]))\\.\\d{1,3}\\.\\d{1,3})|(192\\.168\\.\\d{1,3}\\.\\d{1,3})$");
        i.d(patternCompile2, "compile(...)");
        f4539b = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        i.d(patternCompile3, "compile(...)");
        f4540c = patternCompile3;
    }
}
