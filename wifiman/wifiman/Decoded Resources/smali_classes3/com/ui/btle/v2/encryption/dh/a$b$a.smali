.class public final Lcom/ui/btle/v2/encryption/dh/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/v2/encryption/dh/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/btle/v2/encryption/dh/a$b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/btle/v2/d;)[B
    .locals 5

    const-string/jumbo v0, "packet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/btle/v2/d;->a()[B

    move-result-object p1

    invoke-static {p1}, Lorg/msgpack/core/d;->b([B)Lorg/msgpack/core/f;

    move-result-object p1

    invoke-virtual {p1}, Lorg/msgpack/core/f;->w0()Lyj/o;

    move-result-object p1

    const-string/jumbo v0, "null cannot be cast to non-null type org.msgpack.value.impl.ImmutableArrayValueImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzj/c;

    invoke-static {}, Lcom/ui/btle/v2/encryption/dh/a$b;->values()[Lcom/ui/btle/v2/encryption/dh/a$b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/ui/btle/v2/encryption/dh/a$b;->getReadValue()Lyj/u;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lcom/ui/btle/v2/encryption/dh/a$b;->getReadValue()Lyj/u;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {p1, v3}, Lzj/c;->Z(I)Lyj/u;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/ui/btle/v2/encryption/dh/a$b;->PUBLIC_KEY:Lcom/ui/btle/v2/encryption/dh/a$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lzj/c;->Z(I)Lyj/u;

    move-result-object p1

    const-string/jumbo v0, "null cannot be cast to non-null type org.msgpack.value.impl.ImmutableBinaryValueImpl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzj/e;

    invoke-virtual {p1}, Lzj/a;->u()[B

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final b([B)[B
    .locals 7

    const-string/jumbo v0, "publicKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lcom/ui/btle/v2/encryption/dh/a$b;->values()[Lcom/ui/btle/v2/encryption/dh/a$b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lcom/ui/btle/v2/encryption/dh/a$b;->getWriteValue()Lyj/u;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lcom/ui/btle/v2/encryption/dh/a$b;->getWriteValue()Lyj/u;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lzj/e;

    invoke-direct {v1, p1}, Lzj/e;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lorg/msgpack/core/d;->a()Lorg/msgpack/core/b;

    move-result-object p1

    new-instance v1, Lzj/c;

    new-array v2, v3, [Lyj/u;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyj/u;

    invoke-direct {v1, v0}, Lzj/c;-><init>([Lyj/u;)V

    invoke-virtual {p1, v1}, Lorg/msgpack/core/e;->T(Lyj/u;)Lorg/msgpack/core/e;

    invoke-virtual {p1}, Lorg/msgpack/core/b;->r0()[B

    move-result-object p1

    const-string/jumbo v0, "messageBufferPacker.toByteArray()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
