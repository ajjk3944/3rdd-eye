.class abstract Lcom/google/crypto/tink/shaded/protobuf/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/crypto/tink/shaded/protobuf/C$c;,
        Lcom/google/crypto/tink/shaded/protobuf/C$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/google/crypto/tink/shaded/protobuf/C;

.field private static final b:Lcom/google/crypto/tink/shaded/protobuf/C;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/C$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/C$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/C$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/C;->a:Lcom/google/crypto/tink/shaded/protobuf/C;

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/C$c;

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/C$c;-><init>(Lcom/google/crypto/tink/shaded/protobuf/C$a;)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/C;->b:Lcom/google/crypto/tink/shaded/protobuf/C;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/C;-><init>()V

    return-void
.end method

.method static a()Lcom/google/crypto/tink/shaded/protobuf/C;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/C;->a:Lcom/google/crypto/tink/shaded/protobuf/C;

    return-object v0
.end method

.method static b()Lcom/google/crypto/tink/shaded/protobuf/C;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/C;->b:Lcom/google/crypto/tink/shaded/protobuf/C;

    return-object v0
.end method


# virtual methods
.method abstract c(Ljava/lang/Object;J)V
.end method

.method abstract d(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method

.method abstract e(Ljava/lang/Object;J)Ljava/util/List;
.end method
