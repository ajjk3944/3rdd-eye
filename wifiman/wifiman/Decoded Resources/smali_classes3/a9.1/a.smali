.class public final La9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La9/a$a;
    }
.end annotation


# static fields
.field public static final e:La9/a$a;


# instance fields
.field private a:[B

.field private b:I

.field private c:I

.field private final d:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La9/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La9/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, La9/a;->e:La9/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, La9/a;->a:[B

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, La9/a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method private final b([B)V
    .locals 5

    iget-object v0, p0, La9/a;->a:[B

    array-length v0, v0

    iget v1, p0, La9/a;->c:I

    array-length v2, p1

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_2

    sget-object v0, La9/a$b;->a:La9/a$b;

    invoke-static {v0}, Lb9/a;->c(Lmh/a;)V

    invoke-direct {p0}, La9/a;->e()I

    move-result v0

    array-length v1, p1

    add-int/2addr v0, v1

    iget-object v1, p0, La9/a;->a:[B

    array-length v1, v1

    invoke-direct {p0}, La9/a;->e()I

    move-result v2

    array-length p1, p1

    add-int/2addr v2, p1

    const/4 p1, 0x0

    if-lt v1, v2, :cond_0

    sget-object v0, La9/a$c;->a:La9/a$c;

    invoke-static {v0}, Lb9/a;->c(Lmh/a;)V

    iget-object v0, p0, La9/a;->a:[B

    iget v1, p0, La9/a;->b:I

    iget v2, p0, La9/a;->c:I

    invoke-static {v0, v0, p1, v1, v2}, LZg/n;->h([B[BIII)[B

    invoke-direct {p0}, La9/a;->e()I

    move-result v0

    iput p1, p0, La9/a;->b:I

    iput v0, p0, La9/a;->c:I

    sget-object p1, La9/a$d;->a:La9/a$d;

    invoke-static {p1}, Lb9/a;->c(Lmh/a;)V

    goto :goto_1

    :cond_0
    sget-object v1, La9/a$e;->a:La9/a$e;

    invoke-static {v1}, Lb9/a;->c(Lmh/a;)V

    new-instance v1, Lkotlin/jvm/internal/L;

    invoke-direct {v1}, Lkotlin/jvm/internal/L;-><init>()V

    iget-object v2, p0, La9/a;->a:[B

    array-length v2, v2

    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    :goto_0
    iget v2, v1, Lkotlin/jvm/internal/L;->a:I

    if-ge v2, v0, :cond_1

    mul-int/lit8 v2, v2, 0x2

    iput v2, v1, Lkotlin/jvm/internal/L;->a:I

    goto :goto_0

    :cond_1
    new-instance v0, La9/a$f;

    invoke-direct {v0, v1}, La9/a$f;-><init>(Lkotlin/jvm/internal/L;)V

    invoke-static {v0}, Lb9/a;->c(Lmh/a;)V

    iget v0, v1, Lkotlin/jvm/internal/L;->a:I

    new-array v0, v0, [B

    iget-object v2, p0, La9/a;->a:[B

    iget v3, p0, La9/a;->b:I

    iget v4, p0, La9/a;->c:I

    invoke-static {v2, v0, p1, v3, v4}, LZg/n;->h([B[BIII)[B

    invoke-direct {p0}, La9/a;->e()I

    move-result v2

    iput p1, p0, La9/a;->b:I

    iput v2, p0, La9/a;->c:I

    iput-object v0, p0, La9/a;->a:[B

    new-instance p1, La9/a$g;

    invoke-direct {p1, v1}, La9/a$g;-><init>(Lkotlin/jvm/internal/L;)V

    invoke-static {p1}, Lb9/a;->c(Lmh/a;)V

    :cond_2
    :goto_1
    return-void
.end method

.method private final c()[B
    .locals 5

    :try_start_0
    iget-object v0, p0, La9/a;->a:[B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, La9/a;->b:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-direct {p0}, La9/a;->e()I

    move-result v1

    sget-object v2, Lcom/ui/btle/v2/e$a$a;->a:Lcom/ui/btle/v2/e$a$a;

    invoke-virtual {v2}, Lcom/ui/btle/v2/e$a$a;->a()I

    move-result v3

    if-lt v1, v3, :cond_1

    const-string/jumbo v1, "buff"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/ui/btle/v2/e$a$a;->b(Ljava/nio/ByteBuffer;)S

    move-result v1

    const v3, 0xffff

    and-int/2addr v1, v3

    if-nez v1, :cond_0

    iget v0, p0, La9/a;->b:I

    invoke-virtual {v2}, Lcom/ui/btle/v2/e$a$a;->a()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, La9/a;->b:I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, La9/a;->e()I

    move-result v3

    if-gt v1, v3, :cond_1

    invoke-virtual {v2}, Lcom/ui/btle/v2/e$a$a;->a()I

    move-result v2

    sub-int v2, v1, v2

    new-array v3, v2, [B

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget v0, p0, La9/a;->b:I

    add-int/2addr v0, v1

    iput v0, p0, La9/a;->b:I

    invoke-static {v3}, Lcom/ui/btle/v2/f;->b([B)[B

    move-result-object v0
    :try_end_0
    .catch Lcom/ui/btle/v2/BTLEv2$Error$Protocol$InvalidPacketFragmentLength; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final e()I
    .locals 2

    iget v0, p0, La9/a;->c:I

    iget v1, p0, La9/a;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private final f([B)V
    .locals 4

    iget-object v0, p0, La9/a;->a:[B

    iget v1, p0, La9/a;->c:I

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v3, v2}, LZg/n;->h([B[BIII)[B

    iget v0, p0, La9/a;->c:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, La9/a;->c:I

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 1

    const-string/jumbo v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, La9/a;->b([B)V

    invoke-direct {p0, p1}, La9/a;->f([B)V

    invoke-direct {p0}, La9/a;->c()[B

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    iget-object v0, p0, La9/a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-static {p1}, Lcom/ui/btle/v2/f;->a([B)Lcom/ui/btle/v2/f;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, La9/a;->c()[B

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final d()Ljava/util/concurrent/LinkedBlockingQueue;
    .locals 1

    iget-object v0, p0, La9/a;->d:Ljava/util/concurrent/LinkedBlockingQueue;

    return-object v0
.end method
