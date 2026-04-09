package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.pp1;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;

/* loaded from: classes3.dex */
public final class aq0 implements vh {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24792a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24792a = iArr;
        }
    }

    public aq0(l30 defaultDns) {
        kotlin.jvm.internal.l.f(defaultDns, "defaultDns");
    }

    @Override // com.yandex.mobile.ads.impl.vh
    public final pp1 a(ps1 ps1Var, pq1 response) throws IOException {
        Proxy proxyB;
        l30 l30VarC;
        InetAddress address;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        InetAddress address2;
        ta taVarA;
        kotlin.jvm.internal.l.f(response, "response");
        List<ao> listC = response.c();
        pp1 pp1VarO = response.o();
        rh0 rh0VarG = pp1VarO.g();
        boolean z10 = response.d() == 407;
        if (ps1Var == null || (proxyB = ps1Var.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (ao aoVar : listC) {
            if ("Basic".equalsIgnoreCase(aoVar.c())) {
                if (ps1Var == null || (taVarA = ps1Var.a()) == null || (l30VarC = taVarA.c()) == null) {
                    l30VarC = l30.f29868a;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    kotlin.jvm.internal.l.d(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    Proxy.Type type = proxyB.type();
                    if (type != null && a.f24792a[type.ordinal()] == 1) {
                        address2 = (InetAddress) C2097r.p0(l30VarC.a(rh0VarG.g()));
                    } else {
                        SocketAddress socketAddressAddress2 = proxyB.address();
                        kotlin.jvm.internal.l.d(socketAddressAddress2, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address2 = ((InetSocketAddress) socketAddressAddress2).getAddress();
                        kotlin.jvm.internal.l.e(address2, "getAddress(...)");
                    }
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, address2, inetSocketAddress.getPort(), rh0VarG.k(), aoVar.b(), aoVar.c(), rh0VarG.m(), Authenticator.RequestorType.PROXY);
                } else {
                    String strG = rh0VarG.g();
                    kotlin.jvm.internal.l.c(proxyB);
                    Proxy.Type type2 = proxyB.type();
                    if (type2 != null && a.f24792a[type2.ordinal()] == 1) {
                        address = (InetAddress) C2097r.p0(l30VarC.a(rh0VarG.g()));
                    } else {
                        SocketAddress socketAddressAddress3 = proxyB.address();
                        kotlin.jvm.internal.l.d(socketAddressAddress3, "null cannot be cast to non-null type java.net.InetSocketAddress");
                        address = ((InetSocketAddress) socketAddressAddress3).getAddress();
                        kotlin.jvm.internal.l.e(address, "getAddress(...)");
                    }
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strG, address, rh0VarG.i(), rh0VarG.k(), aoVar.b(), aoVar.c(), rh0VarG.m(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    kotlin.jvm.internal.l.e(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    kotlin.jvm.internal.l.e(password, "getPassword(...)");
                    return new pp1.a(pp1VarO).b(str, xu.a(userName, new String(password), aoVar.a())).a();
                }
            }
        }
        return null;
    }
}
