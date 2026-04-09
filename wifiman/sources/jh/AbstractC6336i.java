package jh;

import java.io.File;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jh.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6336i extends AbstractC6335h {
    public static String o(File file) {
        AbstractC6492s.i(file, "<this>");
        String name = file.getName();
        AbstractC6492s.h(name, "getName(...)");
        return t.e1(name, '.', "");
    }
}
