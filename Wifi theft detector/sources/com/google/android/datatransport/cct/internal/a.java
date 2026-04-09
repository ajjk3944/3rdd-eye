package com.google.android.datatransport.cct.internal;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import w3.g;
import w3.h;
import w3.i;

/* loaded from: classes2.dex */
public final class a implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final Configurator f9691a = new a();

    /* renamed from: com.google.android.datatransport.cct.internal.a$a, reason: collision with other inner class name */
    public static final class C0195a implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final C0195a f9692a = new C0195a();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9693b = FieldDescriptor.of("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f9694c = FieldDescriptor.of("model");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f9695d = FieldDescriptor.of("hardware");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f9696e = FieldDescriptor.of("device");

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f9697f = FieldDescriptor.of(AppLovinEventTypes.USER_VIEWED_PRODUCT);

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f9698g = FieldDescriptor.of("osBuild");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f9699h = FieldDescriptor.of("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f9700i = FieldDescriptor.of("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        public static final FieldDescriptor f9701j = FieldDescriptor.of("locale");

        /* renamed from: k, reason: collision with root package name */
        public static final FieldDescriptor f9702k = FieldDescriptor.of("country");

        /* renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f9703l = FieldDescriptor.of("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        public static final FieldDescriptor f9704m = FieldDescriptor.of("applicationBuild");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(w3.a aVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9693b, aVar.m());
            objectEncoderContext.add(f9694c, aVar.j());
            objectEncoderContext.add(f9695d, aVar.f());
            objectEncoderContext.add(f9696e, aVar.d());
            objectEncoderContext.add(f9697f, aVar.l());
            objectEncoderContext.add(f9698g, aVar.k());
            objectEncoderContext.add(f9699h, aVar.h());
            objectEncoderContext.add(f9700i, aVar.e());
            objectEncoderContext.add(f9701j, aVar.g());
            objectEncoderContext.add(f9702k, aVar.c());
            objectEncoderContext.add(f9703l, aVar.i());
            objectEncoderContext.add(f9704m, aVar.b());
        }
    }

    public static final class b implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9705a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9706b = FieldDescriptor.of("logRequest");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(g gVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9706b, gVar.c());
        }
    }

    public static final class c implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final c f9707a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9708b = FieldDescriptor.of("clientType");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f9709c = FieldDescriptor.of("androidClientInfo");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9708b, clientInfo.c());
            objectEncoderContext.add(f9709c, clientInfo.b());
        }
    }

    public static final class d implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final d f9710a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9711b = FieldDescriptor.of("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f9712c = FieldDescriptor.of("eventCode");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f9713d = FieldDescriptor.of("eventUptimeMs");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f9714e = FieldDescriptor.of("sourceExtension");

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f9715f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f9716g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f9717h = FieldDescriptor.of("networkConnectionInfo");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(h hVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9711b, hVar.c());
            objectEncoderContext.add(f9712c, hVar.b());
            objectEncoderContext.add(f9713d, hVar.d());
            objectEncoderContext.add(f9714e, hVar.f());
            objectEncoderContext.add(f9715f, hVar.g());
            objectEncoderContext.add(f9716g, hVar.h());
            objectEncoderContext.add(f9717h, hVar.e());
        }
    }

    public static final class e implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final e f9718a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9719b = FieldDescriptor.of("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f9720c = FieldDescriptor.of("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f9721d = FieldDescriptor.of("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f9722e = FieldDescriptor.of("logSource");

        /* renamed from: f, reason: collision with root package name */
        public static final FieldDescriptor f9723f = FieldDescriptor.of("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        public static final FieldDescriptor f9724g = FieldDescriptor.of("logEvent");

        /* renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f9725h = FieldDescriptor.of("qosTier");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(i iVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9719b, iVar.g());
            objectEncoderContext.add(f9720c, iVar.h());
            objectEncoderContext.add(f9721d, iVar.b());
            objectEncoderContext.add(f9722e, iVar.d());
            objectEncoderContext.add(f9723f, iVar.e());
            objectEncoderContext.add(f9724g, iVar.c());
            objectEncoderContext.add(f9725h, iVar.f());
        }
    }

    public static final class f implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final f f9726a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f9727b = FieldDescriptor.of("networkType");

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f9728c = FieldDescriptor.of("mobileSubtype");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f9727b, networkConnectionInfo.c());
            objectEncoderContext.add(f9728c, networkConnectionInfo.b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        b bVar = b.f9705a;
        encoderConfig.registerEncoder(g.class, bVar);
        encoderConfig.registerEncoder(w3.c.class, bVar);
        e eVar = e.f9718a;
        encoderConfig.registerEncoder(i.class, eVar);
        encoderConfig.registerEncoder(w3.e.class, eVar);
        c cVar = c.f9707a;
        encoderConfig.registerEncoder(ClientInfo.class, cVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.b.class, cVar);
        C0195a c0195a = C0195a.f9692a;
        encoderConfig.registerEncoder(w3.a.class, c0195a);
        encoderConfig.registerEncoder(w3.b.class, c0195a);
        d dVar = d.f9710a;
        encoderConfig.registerEncoder(h.class, dVar);
        encoderConfig.registerEncoder(w3.d.class, dVar);
        f fVar = f.f9726a;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, fVar);
        encoderConfig.registerEncoder(com.google.android.datatransport.cct.internal.c.class, fVar);
    }
}
