package com.ui.wmw;

import Mf.a;
import Of.a;
import com.ui.wmw.wifi.a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface g {

    public static final class a {
        public static String a(String id2) {
            AbstractC6492s.i(id2, "id");
            return id2;
        }

        public static final boolean b(String str, String str2) {
            return AbstractC6492s.d(str, str2);
        }

        public static int c(String str) {
            return str.hashCode();
        }

        public static String d(String str) {
            return "ID(id=" + str + ")";
        }
    }

    gg.i a();

    a.InterfaceC0524a b();

    a.InterfaceC0626a c();

    a.InterfaceC1679a d();

    String e();
}
