package Sh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f20704a = new F();

    private F() {
    }

    private final String c(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(String it) {
        AbstractC6492s.i(it, "it");
        return f20704a.c(it);
    }

    public final String[] b(String... signatures) {
        AbstractC6492s.i(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set d(String internalName, String... signatures) {
        AbstractC6492s.i(internalName, "internalName");
        AbstractC6492s.i(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public final Set e(String name, String... signatures) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signatures, "signatures");
        return d(h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final Set f(String name, String... signatures) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(signatures, "signatures");
        return d(i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String g(String name) {
        AbstractC6492s.i(name, "name");
        return "java/util/function/" + name;
    }

    public final String h(String name) {
        AbstractC6492s.i(name, "name");
        return "java/lang/" + name;
    }

    public final String i(String name) {
        AbstractC6492s.i(name, "name");
        return "java/util/" + name;
    }

    public final String j(String name, List parameters, String ret) {
        AbstractC6492s.i(name, "name");
        AbstractC6492s.i(parameters, "parameters");
        AbstractC6492s.i(ret, "ret");
        return name + '(' + AbstractC3689v.z0(parameters, "", null, null, 0, null, E.f20703a, 30, null) + ')' + c(ret);
    }

    public final String l(String internalName, String jvmDescriptor) {
        AbstractC6492s.i(internalName, "internalName");
        AbstractC6492s.i(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
