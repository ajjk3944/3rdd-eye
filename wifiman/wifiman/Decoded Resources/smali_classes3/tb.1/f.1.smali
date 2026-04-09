.class public Ltb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/DataChannel$Observer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltb/f$a;,
        Ltb/f$b;,
        Ltb/f$c;
    }
.end annotation


# static fields
.field public static final m:Ltb/f$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lgg/y;

.field private c:Ljava/lang/String;

.field private d:Lorg/webrtc/DataChannel;

.field private final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private f:Ltb/f$b;

.field private final g:LHg/a;

.field private h:Lhg/c;

.field private final i:Lej/v;

.field private final j:Lej/f;

.field private final k:Lej/g;

.field private l:Lhg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltb/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltb/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltb/f;->m:Ltb/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lgg/y;)V
    .locals 2

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "webRtcScheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/f;->a:Ljava/lang/String;

    iput-object p2, p0, Ltb/f;->b:Lgg/y;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Ltb/f;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {}, LHg/a;->k1()LHg/a;

    move-result-object p1

    const-string/jumbo p2, "create(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/f;->g:LHg/a;

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p1

    const-string/jumbo p2, "disposed(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/f;->h:Lhg/c;

    new-instance p1, Lej/v;

    const-wide/32 v0, 0xfa000

    invoke-direct {p1, v0, v1}, Lej/v;-><init>(J)V

    iput-object p1, p0, Ltb/f;->i:Lej/v;

    invoke-virtual {p1}, Lej/v;->k()Lej/B;

    move-result-object v0

    invoke-static {v0}, Lej/p;->c(Lej/B;)Lej/f;

    move-result-object v0

    iput-object v0, p0, Ltb/f;->j:Lej/f;

    invoke-virtual {p1}, Lej/v;->l()Lej/D;

    move-result-object p1

    invoke-static {p1}, Lej/p;->d(Lej/D;)Lej/g;

    move-result-object p1

    iput-object p1, p0, Ltb/f;->k:Lej/g;

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/f;->l:Lhg/c;

    return-void
.end method

.method public static synthetic a(Ltb/f;Lgg/t;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/f;->q(Ltb/f;Lgg/t;)V

    return-void
.end method

.method public static synthetic b(Ltb/f;)LYg/J;
    .locals 0

    invoke-static {p0}, Ltb/f;->s(Ltb/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltb/f;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ltb/f;->r(Ltb/f;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/f;Ljava/nio/ByteBuffer;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Ltb/f;->t(Ltb/f;Ljava/nio/ByteBuffer;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0}, Ltb/f;->z(Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ltb/f;Lorg/webrtc/DataChannel$State;)V
    .locals 0

    invoke-direct {p0, p1}, Ltb/f;->v(Lorg/webrtc/DataChannel$State;)V

    return-void
.end method

.method private final j()V
    .locals 2

    iget-object v0, p0, Ltb/f;->h:Lhg/c;

    invoke-interface {v0}, Lhg/c;->dispose()V

    const/4 v0, 0x0

    iput-object v0, p0, Ltb/f;->f:Ltb/f$b;

    invoke-virtual {p0}, Ltb/f;->l()Lorg/webrtc/DataChannel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/webrtc/DataChannel;->unregisterObserver()V

    :cond_0
    invoke-virtual {p0}, Ltb/f;->l()Lorg/webrtc/DataChannel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lorg/webrtc/DataChannel;->close()V

    :cond_1
    invoke-virtual {p0, v0}, Ltb/f;->A(Lorg/webrtc/DataChannel;)V

    invoke-virtual {p0}, Ltb/f;->k()Lhg/c;

    move-result-object v0

    invoke-interface {v0}, Lhg/c;->dispose()V

    iget-object v0, p0, Ltb/f;->j:Lej/f;

    invoke-static {v0}, Lokhttp3/internal/Util;->m(Ljava/io/Closeable;)V

    invoke-virtual {p0}, Ltb/f;->n()Lej/g;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->m(Ljava/io/Closeable;)V

    iget-object v0, p0, Ltb/f;->g:LHg/a;

    new-instance v1, Lcom/ui/unifi/core/base/net/webrtc/ClosedException;

    invoke-direct {v1}, Lcom/ui/unifi/core/base/net/webrtc/ClosedException;-><init>()V

    invoke-virtual {v0, v1}, LHg/a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final m()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ltb/f;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Uh oh! Trying to get DataChannel label while it was not initialised yet"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Ltb/f;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method private final p()V
    .locals 4

    invoke-virtual {p0}, Ltb/f;->k()Lhg/c;

    move-result-object v0

    invoke-interface {v0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ltb/a;

    invoke-direct {v0, p0}, Ltb/a;-><init>(Ltb/f;)V

    invoke-static {v0}, Lgg/s;->o(Lgg/u;)Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->M0(Lgg/y;)Lgg/s;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v0

    const-string/jumbo v1, "observeOn(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltb/b;

    invoke-direct {v1, p0}, Ltb/b;-><init>(Ltb/f;)V

    new-instance v2, Ltb/c;

    invoke-direct {v2, p0}, Ltb/c;-><init>(Ltb/f;)V

    new-instance v3, Ltb/d;

    invoke-direct {v3, p0}, Ltb/d;-><init>(Ltb/f;)V

    invoke-static {v0, v1, v2, v3}, LAg/f;->f(Lgg/s;Lmh/l;Lmh/a;Lmh/l;)Lhg/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ltb/f;->x(Lhg/c;)V

    :cond_0
    return-void
.end method

.method private static final q(Ltb/f;Lgg/t;)V
    .locals 3

    const-string/jumbo v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2800

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-interface {p1}, Lgg/t;->isDisposed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ltb/f;->n()Lej/g;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v0}, Ltb/g;->a(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-interface {p1, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lgg/h;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, p0}, Lgg/t;->c(Ljava/lang/Throwable;)Z

    :goto_2
    return-void
.end method

.method private static final r(Ltb/f;Ljava/lang/Throwable;)LYg/J;
    .locals 4

    const-string/jumbo v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-direct {p0}, Ltb/f;->m()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Uh oh! Error while observing data channel data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v1, v2}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Ltb/f;->i()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final s(Ltb/f;)LYg/J;
    .locals 3

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Closing data channel since end of stream reached!"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Ltb/f;->i()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final t(Ltb/f;Ljava/nio/ByteBuffer;)LYg/J;
    .locals 1

    const-string/jumbo v0, "byteBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ltb/f;->f:Ltb/f$b;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Ltb/f$b;->b(Ljava/nio/ByteBuffer;)V

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final v(Lorg/webrtc/DataChannel$State;)V
    .locals 2

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    if-eq p1, v0, :cond_0

    sget-object v0, Lorg/webrtc/DataChannel$State;->CLOSING:Lorg/webrtc/DataChannel$State;

    if-ne p1, v0, :cond_1

    :cond_0
    invoke-direct {p0}, Ltb/f;->j()V

    :cond_1
    invoke-virtual {p0}, Ltb/f;->o()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltb/f$c;

    invoke-interface {v1, p1}, Ltb/f$c;->a(Lorg/webrtc/DataChannel$State;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static final z(Ljava/lang/Throwable;)LYg/J;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Error processing state"

    invoke-virtual {v0, p0, v2, v1}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public A(Lorg/webrtc/DataChannel;)V
    .locals 0

    iput-object p1, p0, Ltb/f;->d:Lorg/webrtc/DataChannel;

    return-void
.end method

.method public final B(Ltb/f$b;)V
    .locals 1

    const-string/jumbo v0, "onMessageListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/f;->f:Ltb/f$b;

    invoke-direct {p0}, Ltb/f;->p()V

    return-void
.end method

.method public final g(Ltb/f$c;)V
    .locals 2

    const-string/jumbo v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ltb/f;->o()Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ltb/f;->l()Lorg/webrtc/DataChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->state()Lorg/webrtc/DataChannel$State;

    move-result-object v0

    const-string/jumbo v1, "state(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Ltb/f$c;->a(Lorg/webrtc/DataChannel$State;)V

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ltb/f;->f:Ltb/f$b;

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Ltb/f;->g:LHg/a;

    sget-object v1, Lorg/webrtc/DataChannel$State;->CLOSED:Lorg/webrtc/DataChannel$State;

    invoke-virtual {v0, v1}, LHg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public k()Lhg/c;
    .locals 1

    iget-object v0, p0, Ltb/f;->l:Lhg/c;

    return-object v0
.end method

.method public l()Lorg/webrtc/DataChannel;
    .locals 1

    iget-object v0, p0, Ltb/f;->d:Lorg/webrtc/DataChannel;

    return-object v0
.end method

.method public n()Lej/g;
    .locals 1

    iget-object v0, p0, Ltb/f;->k:Lej/g;

    return-object v0
.end method

.method public o()Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 1

    iget-object v0, p0, Ltb/f;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public onBufferedAmountChange(J)V
    .locals 0

    return-void
.end method

.method public onMessage(Lorg/webrtc/DataChannel$Buffer;)V
    .locals 6

    const-string/jumbo v0, "buf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Ltb/f;->j:Lej/f;

    iget-object p1, p1, Lorg/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    invoke-interface {v1, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    iget-object p1, p0, Ltb/f;->j:Lej/f;

    invoke-interface {p1}, Lej/f;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v1, LSj/a;->a:LSj/a$b;

    invoke-direct {p0}, Ltb/f;->m()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Error while writing data into buffer. DataChannel name: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v0, [Ljava/lang/Object;

    invoke-virtual {v1, p1, v2, v3}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Ltb/f;->n()Lej/g;

    move-result-object p1

    invoke-interface {p1}, Lej/g;->b()Lej/e;

    move-result-object p1

    invoke-virtual {p1}, Lej/e;->D0()J

    move-result-wide v1

    const-wide/32 v3, 0x7d000

    cmp-long p1, v1, v3

    if-lez p1, :cond_0

    sget-object p1, LSj/a;->a:LSj/a$b;

    invoke-direct {p0}, Ltb/f;->m()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "Uh oh, buffer size "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " exceeded the limit 512000. Channel: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v0}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Ltb/f;->i()V

    :cond_0
    return-void
.end method

.method public onStateChange()V
    .locals 3

    invoke-virtual {p0}, Ltb/f;->l()Lorg/webrtc/DataChannel;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string/jumbo v2, "Uh oh! Hub abused without DataChannel"

    invoke-virtual {v0, v2, v1}, LSj/a$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Ltb/f;->g:LHg/a;

    invoke-virtual {v0}, Lorg/webrtc/DataChannel;->state()Lorg/webrtc/DataChannel$State;

    move-result-object v0

    invoke-virtual {v1, v0}, LHg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final u()Lgg/b;
    .locals 2

    iget-object v0, p0, Ltb/f;->g:LHg/a;

    sget-object v1, Ltb/f$d;->a:Ltb/f$d;

    invoke-virtual {v0, v1}, Lgg/s;->N(Lkg/p;)Lgg/s;

    move-result-object v0

    sget-object v1, Ltb/f$e;->a:Ltb/f$e;

    invoke-virtual {v0, v1}, Lgg/s;->i0(Lkg/n;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->P()Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->y()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "ignoreElement(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w(Lorg/webrtc/DataChannel$Buffer;)V
    .locals 1

    const-string/jumbo v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ltb/f;->l()Lorg/webrtc/DataChannel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/webrtc/DataChannel;->send(Lorg/webrtc/DataChannel$Buffer;)Z

    :cond_0
    return-void
.end method

.method public x(Lhg/c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/f;->l:Lhg/c;

    return-void
.end method

.method public final y(Lorg/webrtc/DataChannel;)V
    .locals 8

    const-string/jumbo v0, "dataChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ltb/f;->A(Lorg/webrtc/DataChannel;)V

    invoke-virtual {p1}, Lorg/webrtc/DataChannel;->label()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltb/f;->c:Ljava/lang/String;

    iget-object v0, p0, Ltb/f;->g:LHg/a;

    iget-object v1, p0, Ltb/f;->b:Lgg/y;

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v2

    const-string/jumbo v0, "observeOn(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ltb/f$f;

    invoke-direct {v5, p0}, Ltb/f$f;-><init>(Ljava/lang/Object;)V

    new-instance v3, Ltb/e;

    invoke-direct {v3}, Ltb/e;-><init>()V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LAg/f;->i(Lgg/s;Lmh/l;Lmh/a;Lmh/l;ILjava/lang/Object;)Lhg/c;

    move-result-object v0

    iput-object v0, p0, Ltb/f;->h:Lhg/c;

    invoke-virtual {p1, p0}, Lorg/webrtc/DataChannel;->registerObserver(Lorg/webrtc/DataChannel$Observer;)V

    invoke-virtual {p0}, Ltb/f;->onStateChange()V

    return-void
.end method
