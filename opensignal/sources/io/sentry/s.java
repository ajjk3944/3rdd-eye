package io.sentry;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* loaded from: classes.dex */
public final class s implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12727a;

    /* renamed from: b, reason: collision with root package name */
    public final x5 f12728b;

    public /* synthetic */ s(x5 x5Var, int i10) {
        this.f12727a = i10;
        this.f12728b = x5Var;
    }

    @Override // io.sentry.n1
    public final boolean a() {
        q qVarA;
        switch (this.f12727a) {
            case 0:
                return z4.d().c(this.f12728b.getFatalLogger());
            default:
                if (io.sentry.internal.a.f12347c == null) {
                    qVarA = io.sentry.internal.a.f12348d.a();
                    try {
                        if (io.sentry.internal.a.f12347c == null) {
                            io.sentry.internal.a.f12347c = new io.sentry.internal.a();
                        }
                        qVarA.close();
                    } finally {
                        try {
                            qVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                io.sentry.internal.a aVar = io.sentry.internal.a.f12347c;
                if (!aVar.f12349a) {
                    try {
                        qVarA = aVar.f12350b.a();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        aVar.f12349a = true;
                        throw th3;
                    }
                    try {
                        if (!aVar.f12349a) {
                            Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                            while (resources.hasMoreElements()) {
                                try {
                                    Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                    if (mainAttributes != null) {
                                        String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                        String value2 = mainAttributes.getValue("Implementation-Version");
                                        String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                        String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                        if (value != null && value2 != null) {
                                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                            if (value5 != null) {
                                                z4.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                z4.d().a("OpenTelemetry");
                                            }
                                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                            if (value6 != null) {
                                                z4.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                z4.d().a("OpenTelemetry-Agent");
                                            }
                                            if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                z4.d().a("OpenTelemetry-Agentless");
                                            }
                                            if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                z4.d().a("OpenTelemetry-Agentless-Spring");
                                            }
                                        }
                                        if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                            z4.d().b(value4, value2);
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        qVarA.close();
                        aVar.f12349a = true;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return z4.d().c(this.f12728b.getFatalLogger());
        }
    }
}
