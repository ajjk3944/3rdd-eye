.class abstract Lcom/google/crypto/tink/shaded/protobuf/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/crypto/tink/shaded/protobuf/H;

.field private static final b:Lcom/google/crypto/tink/shaded/protobuf/H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/J;->c()Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/J;->a:Lcom/google/crypto/tink/shaded/protobuf/H;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/I;

    invoke-direct {v0}, Lcom/google/crypto/tink/shaded/protobuf/I;-><init>()V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/J;->b:Lcom/google/crypto/tink/shaded/protobuf/H;

    return-void
.end method

.method static a()Lcom/google/crypto/tink/shaded/protobuf/H;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/J;->a:Lcom/google/crypto/tink/shaded/protobuf/H;

    return-object v0
.end method

.method static b()Lcom/google/crypto/tink/shaded/protobuf/H;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/J;->b:Lcom/google/crypto/tink/shaded/protobuf/H;

    return-object v0
.end method

.method private static c()Lcom/google/crypto/tink/shaded/protobuf/H;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string/jumbo v1, "com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/H;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    return-object v0
.end method
