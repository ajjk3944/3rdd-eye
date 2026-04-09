package x3;

import androidx.appcompat.app.z;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class a implements Configurator {

    /* renamed from: a, reason: collision with root package name */
    public static final Configurator f24882a = new a();

    /* renamed from: x3.a$a, reason: collision with other inner class name */
    public static final class C0498a implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final C0498a f24883a = new C0498a();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24884b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f24885c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d, reason: collision with root package name */
        public static final FieldDescriptor f24886d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f24887e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(a4.a aVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24884b, aVar.d());
            objectEncoderContext.add(f24885c, aVar.c());
            objectEncoderContext.add(f24886d, aVar.b());
            objectEncoderContext.add(f24887e, aVar.a());
        }
    }

    public static final class b implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final b f24888a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24889b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(a4.b bVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24889b, bVar.a());
        }
    }

    public static final class c implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final c f24890a = new c();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24891b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f24892c = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24891b, logEventDropped.a());
            objectEncoderContext.add(f24892c, logEventDropped.b());
        }
    }

    public static final class d implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final d f24893a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24894b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f24895c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(a4.c cVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24894b, cVar.b());
            objectEncoderContext.add(f24895c, cVar.a());
        }
    }

    public static final class e implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final e f24896a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24897b = FieldDescriptor.of("clientMetrics");

        public void a(l lVar, ObjectEncoderContext objectEncoderContext) {
            throw null;
        }

        @Override // com.google.firebase.encoders.Encoder
        public /* bridge */ /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            z.a(obj);
            a(null, objectEncoderContext);
        }
    }

    public static final class f implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final f f24898a = new f();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24899b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f24900c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(a4.d dVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24899b, dVar.a());
            objectEncoderContext.add(f24900c, dVar.b());
        }
    }

    public static final class g implements ObjectEncoder {

        /* renamed from: a, reason: collision with root package name */
        public static final g f24901a = new g();

        /* renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f24902b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f24903c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(a4.e eVar, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(f24902b, eVar.b());
            objectEncoderContext.add(f24903c, eVar.a());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(l.class, e.f24896a);
        encoderConfig.registerEncoder(a4.a.class, C0498a.f24883a);
        encoderConfig.registerEncoder(a4.e.class, g.f24901a);
        encoderConfig.registerEncoder(a4.c.class, d.f24893a);
        encoderConfig.registerEncoder(LogEventDropped.class, c.f24890a);
        encoderConfig.registerEncoder(a4.b.class, b.f24888a);
        encoderConfig.registerEncoder(a4.d.class, f.f24898a);
    }
}
