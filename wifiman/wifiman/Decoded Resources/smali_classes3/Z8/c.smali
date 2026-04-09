.class public final LZ8/c;
.super LZ8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ8/c$a;
    }
.end annotation


# instance fields
.field private final a:[B

.field private final b:Ljava/nio/ByteBuffer;

.field private final c:Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>([BS)V
    .locals 1

    const-string/jumbo v0, "encryptionKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LZ8/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, LZ8/c;->a:[B

    .line 4
    invoke-direct {p0, p2}, LZ8/c;->g(S)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LZ8/c;->b:Ljava/nio/ByteBuffer;

    .line 5
    invoke-direct {p0, p2}, LZ8/c;->g(S)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, LZ8/c;->c:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public synthetic constructor <init>([BSLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZ8/c;-><init>([BS)V

    return-void
.end method

.method public static final synthetic c(LZ8/c;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, LZ8/c;->c:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static final synthetic d(LZ8/c;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, LZ8/c;->b:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static final synthetic e(LZ8/c;)[B
    .locals 0

    iget-object p0, p0, LZ8/c;->a:[B

    return-object p0
.end method

.method public static final synthetic f(LZ8/c;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1}, LZ8/c;->h(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private final g(S)Ljava/nio/ByteBuffer;
    .locals 1

    const/16 v0, 0x18

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    const-string/jumbo p1, "nonce"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final h(Ljava/nio/ByteBuffer;)V
    .locals 2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-static {v0}, LYg/H;->b(S)S

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-short v0, v0

    invoke-static {v0}, LYg/H;->b(S)S

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public a([B)Lgg/z;
    .locals 1

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZ8/c$b;

    invoke-direct {v0, p0, p1}, LZ8/c$b;-><init>(LZ8/c;[B)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b([B)Lgg/z;
    .locals 1

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZ8/c$c;

    invoke-direct {v0, p0, p1}, LZ8/c$c;-><init>(LZ8/c;[B)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
