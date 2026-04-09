package ij;

import ch.n;

/* loaded from: classes.dex */
public final class a {
    public static final boolean a(a aVar) {
        aVar.getClass();
        try {
            System.loadLibrary("traceroute");
            return true;
        } catch (SecurityException e4) {
            n.c("Traceroute", "loadLibrary() called with exception " + e4);
            return false;
        } catch (UnsatisfiedLinkError e10) {
            n.c("Traceroute", "loadLibrary() called with exception " + e10);
            return false;
        }
    }
}
