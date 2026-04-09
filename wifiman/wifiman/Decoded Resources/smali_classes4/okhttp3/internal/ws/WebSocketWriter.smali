.class public final Lokhttp3/internal/ws/WebSocketWriter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0014\u0010\u0008\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010.R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010.R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u0010 R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\u00a8\u0006>"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketWriter;",
        "Ljava/io/Closeable;",
        "",
        "isClient",
        "Lej/f;",
        "sink",
        "Ljava/util/Random;",
        "random",
        "perMessageDeflate",
        "noContextTakeover",
        "",
        "minimumDeflateSize",
        "<init>",
        "(ZLej/f;Ljava/util/Random;ZZJ)V",
        "",
        "opcode",
        "Lej/h;",
        "payload",
        "LYg/J;",
        "g",
        "(ILej/h;)V",
        "j",
        "(Lej/h;)V",
        "p",
        "code",
        "reason",
        "a",
        "formatOpcode",
        "data",
        "h",
        "close",
        "()V",
        "Z",
        "b",
        "Lej/f;",
        "getSink",
        "()Lej/f;",
        "c",
        "Ljava/util/Random;",
        "getRandom",
        "()Ljava/util/Random;",
        "d",
        "e",
        "f",
        "J",
        "Lej/e;",
        "Lej/e;",
        "messageBuffer",
        "sinkBuffer",
        "i",
        "writerClosed",
        "Lokhttp3/internal/ws/MessageDeflater;",
        "Lokhttp3/internal/ws/MessageDeflater;",
        "messageDeflater",
        "",
        "k",
        "[B",
        "maskKey",
        "Lej/e$a;",
        "l",
        "Lej/e$a;",
        "maskCursor",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Z

.field private final b:Lej/f;

.field private final c:Ljava/util/Random;

.field private final d:Z

.field private final e:Z

.field private final f:J

.field private final g:Lej/e;

.field private final h:Lej/e;

.field private i:Z

.field private j:Lokhttp3/internal/ws/MessageDeflater;

.field private final k:[B

.field private final l:Lej/e$a;


# direct methods
.method public constructor <init>(ZLej/f;Ljava/util/Random;ZZJ)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:Z

    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->b:Lej/f;

    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->c:Ljava/util/Random;

    iput-boolean p4, p0, Lokhttp3/internal/ws/WebSocketWriter;->d:Z

    iput-boolean p5, p0, Lokhttp3/internal/ws/WebSocketWriter;->e:Z

    iput-wide p6, p0, Lokhttp3/internal/ws/WebSocketWriter;->f:J

    new-instance p3, Lej/e;

    invoke-direct {p3}, Lej/e;-><init>()V

    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    invoke-interface {p2}, Lej/f;->b()Lej/e;

    move-result-object p2

    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x4

    new-array p3, p3, [B

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    if-eqz p1, :cond_1

    new-instance p2, Lej/e$a;

    invoke-direct {p2}, Lej/e$a;-><init>()V

    :cond_1
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    return-void
.end method

.method private final g(ILej/h;)V
    .locals 5

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->i:Z

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lej/h;->b0()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    or-int/lit16 p1, p1, 0x80

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, p1}, Lej/e;->L0(I)Lej/e;

    iget-boolean p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:Z

    if-eqz p1, :cond_0

    or-int/lit16 p1, v0, 0x80

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, p1}, Lej/e;->L0(I)Lej/e;

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->c:Ljava/util/Random;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-virtual {p1, v1}, Lej/e;->I0([B)Lej/e;

    if-lez v0, :cond_1

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {p1}, Lej/e;->D0()J

    move-result-wide v0

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {p1, p2}, Lej/e;->H0(Lej/h;)Lej/e;

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lej/e;->t0(Lej/e$a;)Lej/e$a;

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-virtual {p1, v0, v1}, Lej/e$a;->j(J)I

    sget-object p1, Lokhttp3/internal/ws/WebSocketProtocol;->a:Lokhttp3/internal/ws/WebSocketProtocol;

    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-virtual {p1, p2, v0}, Lokhttp3/internal/ws/WebSocketProtocol;->b(Lej/e$a;[B)V

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-virtual {p1}, Lej/e$a;->close()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {p1, v0}, Lej/e;->L0(I)Lej/e;

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {p1, p2}, Lej/e;->H0(Lej/h;)Lej/e;

    :cond_1
    :goto_0
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->b:Lej/f;

    invoke-interface {p1}, Lej/f;->flush()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(ILej/h;)V
    .locals 1

    sget-object v0, Lej/h;->e:Lej/h;

    if-nez p1, :cond_0

    if-eqz p2, :cond_3

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Lokhttp3/internal/ws/WebSocketProtocol;->a:Lokhttp3/internal/ws/WebSocketProtocol;

    invoke-virtual {v0, p1}, Lokhttp3/internal/ws/WebSocketProtocol;->c(I)V

    :cond_1
    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    invoke-virtual {v0, p1}, Lej/e;->Q0(I)Lej/e;

    if-eqz p2, :cond_2

    invoke-virtual {v0, p2}, Lej/e;->H0(Lej/h;)Lej/e;

    :cond_2
    invoke-virtual {v0}, Lej/e;->v0()Lej/h;

    move-result-object v0

    :cond_3
    const/16 p1, 0x8

    const/4 p2, 0x1

    :try_start_0
    invoke-direct {p0, p1, v0}, Lokhttp3/internal/ws/WebSocketWriter;->g(ILej/h;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->i:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->i:Z

    throw p1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->j:Lokhttp3/internal/ws/MessageDeflater;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/internal/ws/MessageDeflater;->close()V

    :cond_0
    return-void
.end method

.method public final h(ILej/h;)V
    .locals 5

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->i:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    invoke-virtual {v0, p2}, Lej/e;->H0(Lej/h;)Lej/e;

    or-int/lit16 v0, p1, 0x80

    iget-boolean v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->d:Z

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lej/h;->b0()I

    move-result p2

    int-to-long v1, p2

    iget-wide v3, p0, Lokhttp3/internal/ws/WebSocketWriter;->f:J

    cmp-long p2, v1, v3

    if-ltz p2, :cond_1

    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->j:Lokhttp3/internal/ws/MessageDeflater;

    if-nez p2, :cond_0

    new-instance p2, Lokhttp3/internal/ws/MessageDeflater;

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->e:Z

    invoke-direct {p2, v0}, Lokhttp3/internal/ws/MessageDeflater;-><init>(Z)V

    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->j:Lokhttp3/internal/ws/MessageDeflater;

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    invoke-virtual {p2, v0}, Lokhttp3/internal/ws/MessageDeflater;->a(Lej/e;)V

    or-int/lit16 v0, p1, 0xc0

    :cond_1
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    invoke-virtual {p1}, Lej/e;->D0()J

    move-result-wide p1

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, v0}, Lej/e;->L0(I)Lej/e;

    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x80

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v1, 0x7d

    cmp-long v1, p1, v1

    if-gtz v1, :cond_3

    long-to-int v1, p1

    or-int/2addr v0, v1

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, v0}, Lej/e;->L0(I)Lej/e;

    goto :goto_1

    :cond_3
    const-wide/32 v1, 0xffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_4

    or-int/lit8 v0, v0, 0x7e

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, v0}, Lej/e;->L0(I)Lej/e;

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    long-to-int v1, p1

    invoke-virtual {v0, v1}, Lej/e;->Q0(I)Lej/e;

    goto :goto_1

    :cond_4
    or-int/lit8 v0, v0, 0x7f

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v1, v0}, Lej/e;->L0(I)Lej/e;

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    invoke-virtual {v0, p1, p2}, Lej/e;->P0(J)Lej/e;

    :goto_1
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->a:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->c:Ljava/util/Random;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-virtual {v0, v1}, Lej/e;->I0([B)Lej/e;

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_5

    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    iget-object v3, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lej/e;->t0(Lej/e$a;)Lej/e$a;

    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-virtual {v2, v0, v1}, Lej/e$a;->j(J)I

    sget-object v0, Lokhttp3/internal/ws/WebSocketProtocol;->a:Lokhttp3/internal/ws/WebSocketProtocol;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->k:[B

    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/ws/WebSocketProtocol;->b(Lej/e$a;[B)V

    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->l:Lej/e$a;

    invoke-virtual {v0}, Lej/e$a;->close()V

    :cond_5
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->h:Lej/e;

    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->g:Lej/e;

    invoke-virtual {v0, v1, p1, p2}, Lej/e;->Z(Lej/e;J)V

    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->b:Lej/f;

    invoke-interface {p1}, Lej/f;->m()Lej/f;

    return-void

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final j(Lej/h;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/WebSocketWriter;->g(ILej/h;)V

    return-void
.end method

.method public final p(Lej/h;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/WebSocketWriter;->g(ILej/h;)V

    return-void
.end method
