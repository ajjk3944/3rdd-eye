package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class r50 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32480a = new a();

    public static final class a extends r50 {
    }

    public interface b {
        r50 a(hn hnVar);
    }

    public static void a(hn call) {
        kotlin.jvm.internal.l.f(call, "call");
    }

    public static void b(tn1 call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.l.f(proxy, "proxy");
    }

    public static void a(hn call, IOException ioe) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(ioe, "ioe");
    }

    public static void a(tn1 call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.l.f(proxy, "proxy");
    }

    public static void a(tn1 call, InetSocketAddress inetSocketAddress, Proxy proxy, IOException ioe) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(inetSocketAddress, "inetSocketAddress");
        kotlin.jvm.internal.l.f(proxy, "proxy");
        kotlin.jvm.internal.l.f(ioe, "ioe");
    }

    public static void a(hn call, un1 connection) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(connection, "connection");
    }

    public static void a(hn call, String domainName, List inetAddressList) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(domainName, "domainName");
        kotlin.jvm.internal.l.f(inetAddressList, "inetAddressList");
    }

    public static void a(hn call, String domainName) {
        kotlin.jvm.internal.l.f(call, "call");
        kotlin.jvm.internal.l.f(domainName, "domainName");
    }

    public static void a(tn1 call) {
        kotlin.jvm.internal.l.f(call, "call");
    }
}
