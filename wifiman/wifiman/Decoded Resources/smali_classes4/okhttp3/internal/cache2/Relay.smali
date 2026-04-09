.class public final Lokhttp3/internal/cache2/Relay;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache2/Relay$Companion;,
        Lokhttp3/internal/cache2/Relay$RelaySource;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u0000 \u00112\u00020\u0001:\u0002@AJ\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010\u000bR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0017\u0010%\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001fR$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R\u0017\u00102\u001a\u00020.8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010/\u001a\u0004\u00080\u00101R\"\u00108\u001a\u0002038\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00104\u001a\u0004\u0008\"\u00105\"\u0004\u00086\u00107R\u0017\u00109\u001a\u00020.8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010/\u001a\u0004\u0008\u0015\u00101R\"\u0010?\u001a\u00020:8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008)\u0010;\u001a\u0004\u0008\'\u0010<\"\u0004\u0008=\u0010>\u00a8\u0006B"
    }
    d2 = {
        "Lokhttp3/internal/cache2/Relay;",
        "",
        "Lej/h;",
        "prefix",
        "",
        "upstreamSize",
        "metadataSize",
        "LYg/J;",
        "o",
        "(Lej/h;JJ)V",
        "p",
        "(J)V",
        "a",
        "Ljava/io/RandomAccessFile;",
        "Ljava/io/RandomAccessFile;",
        "e",
        "()Ljava/io/RandomAccessFile;",
        "k",
        "(Ljava/io/RandomAccessFile;)V",
        "file",
        "Lej/D;",
        "b",
        "Lej/D;",
        "g",
        "()Lej/D;",
        "setUpstream",
        "(Lej/D;)V",
        "upstream",
        "c",
        "J",
        "i",
        "()J",
        "m",
        "upstreamPos",
        "d",
        "Lej/h;",
        "metadata",
        "bufferMaxSize",
        "Ljava/lang/Thread;",
        "f",
        "Ljava/lang/Thread;",
        "j",
        "()Ljava/lang/Thread;",
        "n",
        "(Ljava/lang/Thread;)V",
        "upstreamReader",
        "Lej/e;",
        "Lej/e;",
        "h",
        "()Lej/e;",
        "upstreamBuffer",
        "",
        "Z",
        "()Z",
        "setComplete",
        "(Z)V",
        "complete",
        "buffer",
        "",
        "I",
        "()I",
        "l",
        "(I)V",
        "sourceCount",
        "Companion",
        "RelaySource",
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


# static fields
.field public static final k:Lokhttp3/internal/cache2/Relay$Companion;

.field public static final l:Lej/h;

.field public static final m:Lej/h;


# instance fields
.field private a:Ljava/io/RandomAccessFile;

.field private b:Lej/D;

.field private c:J

.field private final d:Lej/h;

.field private final e:J

.field private f:Ljava/lang/Thread;

.field private final g:Lej/e;

.field private h:Z

.field private final i:Lej/e;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/internal/cache2/Relay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/internal/cache2/Relay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lokhttp3/internal/cache2/Relay;->k:Lokhttp3/internal/cache2/Relay$Companion;

    sget-object v0, Lej/h;->d:Lej/h$a;

    const-string v1, "OkHttp cache v1\n"

    invoke-virtual {v0, v1}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/cache2/Relay;->l:Lej/h;

    const-string v1, "OkHttp DIRTY :(\n"

    invoke-virtual {v0, v1}, Lej/h$a;->d(Ljava/lang/String;)Lej/h;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/cache2/Relay;->m:Lej/h;

    return-void
.end method

.method private final o(Lej/h;JJ)V
    .locals 6

    new-instance v3, Lej/e;

    invoke-direct {v3}, Lej/e;-><init>()V

    invoke-virtual {v3, p1}, Lej/e;->H0(Lej/h;)Lej/e;

    invoke-virtual {v3, p2, p3}, Lej/e;->P0(J)Lej/e;

    invoke-virtual {v3, p4, p5}, Lej/e;->P0(J)Lej/e;

    invoke-virtual {v3}, Lej/e;->D0()J

    move-result-wide p1

    const-wide/16 p3, 0x20

    cmp-long p1, p1, p3

    if-nez p1, :cond_0

    new-instance v0, Lokhttp3/internal/cache2/FileOperator;

    iget-object p1, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-string p2, "file!!.channel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lokhttp3/internal/cache2/FileOperator;-><init>(Ljava/nio/channels/FileChannel;)V

    const-wide/16 v1, 0x0

    const-wide/16 v4, 0x20

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/cache2/FileOperator;->b(JLej/e;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final p(J)V
    .locals 6

    new-instance v3, Lej/e;

    invoke-direct {v3}, Lej/e;-><init>()V

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->d:Lej/h;

    invoke-virtual {v3, v0}, Lej/e;->H0(Lej/h;)Lej/e;

    new-instance v0, Lokhttp3/internal/cache2/FileOperator;

    iget-object v1, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    const-string v2, "file!!.channel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lokhttp3/internal/cache2/FileOperator;-><init>(Ljava/nio/channels/FileChannel;)V

    const-wide/16 v1, 0x20

    add-long/2addr v1, p1

    iget-object p1, p0, Lokhttp3/internal/cache2/Relay;->d:Lej/h;

    invoke-virtual {p1}, Lej/h;->b0()I

    move-result p1

    int-to-long v4, p1

    invoke-virtual/range {v0 .. v5}, Lokhttp3/internal/cache2/FileOperator;->b(JLej/e;J)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    invoke-direct {p0, p1, p2}, Lokhttp3/internal/cache2/Relay;->p(J)V

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    sget-object v3, Lokhttp3/internal/cache2/Relay;->l:Lej/h;

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->d:Lej/h;

    invoke-virtual {v0}, Lej/h;->b0()I

    move-result v0

    int-to-long v6, v0

    move-object v2, p0

    move-wide v4, p1

    invoke-direct/range {v2 .. v7}, Lokhttp3/internal/cache2/Relay;->o(Lej/h;JJ)V

    iget-object p1, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/nio/channels/FileChannel;->force(Z)V

    monitor-enter p0

    const/4 p1, 0x1

    :try_start_0
    iput-boolean p1, p0, Lokhttp3/internal/cache2/Relay;->h:Z

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object p1, p0, Lokhttp3/internal/cache2/Relay;->b:Lej/D;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lokhttp3/internal/Util;->m(Ljava/io/Closeable;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lokhttp3/internal/cache2/Relay;->b:Lej/D;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b()Lej/e;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->i:Lej/e;

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/internal/cache2/Relay;->e:J

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lokhttp3/internal/cache2/Relay;->h:Z

    return v0
.end method

.method public final e()Ljava/io/RandomAccessFile;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    return-object v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lokhttp3/internal/cache2/Relay;->j:I

    return v0
.end method

.method public final g()Lej/D;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->b:Lej/D;

    return-object v0
.end method

.method public final h()Lej/e;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->g:Lej/e;

    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/internal/cache2/Relay;->c:J

    return-wide v0
.end method

.method public final j()Ljava/lang/Thread;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/cache2/Relay;->f:Ljava/lang/Thread;

    return-object v0
.end method

.method public final k(Ljava/io/RandomAccessFile;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/cache2/Relay;->a:Ljava/io/RandomAccessFile;

    return-void
.end method

.method public final l(I)V
    .locals 0

    iput p1, p0, Lokhttp3/internal/cache2/Relay;->j:I

    return-void
.end method

.method public final m(J)V
    .locals 0

    iput-wide p1, p0, Lokhttp3/internal/cache2/Relay;->c:J

    return-void
.end method

.method public final n(Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Lokhttp3/internal/cache2/Relay;->f:Ljava/lang/Thread;

    return-void
.end method
