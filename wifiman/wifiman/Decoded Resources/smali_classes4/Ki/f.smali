.class public abstract LKi/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LKi/m;

.field public static final b:I

.field private static final c:I

.field public static final d:LNi/C;

.field private static final e:LNi/C;

.field private static final f:LNi/C;

.field private static final g:LNi/C;

.field private static final h:LNi/C;

.field private static final i:LNi/C;

.field private static final j:LNi/C;

.field private static final k:LNi/C;

.field private static final l:LNi/C;

.field private static final m:LNi/C;

.field private static final n:LNi/C;

.field private static final o:LNi/C;

.field private static final p:LNi/C;

.field private static final q:LNi/C;

.field private static final r:LNi/C;

.field private static final s:LNi/C;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, LKi/m;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LKi/m;-><init>(JLKi/m;LKi/e;I)V

    sput-object v6, LKi/f;->a:LKi/m;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const-string v7, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LNi/D;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LKi/f;->b:I

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LNi/D;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LKi/f;->c:I

    new-instance v0, LNi/C;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->d:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->e:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->f:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->g:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->h:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->i:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->j:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->k:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->l:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->m:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->n:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->o:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->p:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->q:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->r:LNi/C;

    new-instance v0, LNi/C;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, LNi/C;-><init>(Ljava/lang/String;)V

    sput-object v0, LKi/f;->s:LNi/C;

    return-void
.end method

.method private static final A(I)J
    .locals 2

    if-eqz p0, :cond_1

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_0

    int-to-long v0, p0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method private static final B(LIi/n;Ljava/lang/Object;Lmh/q;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0, p2}, LIi/n;->p(Ljava/lang/Object;Ljava/lang/Object;Lmh/q;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LIi/n;->C0(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic C(LIi/n;Ljava/lang/Object;Lmh/q;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LKi/f;->B(LIi/n;Ljava/lang/Object;Lmh/q;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic a(JZ)J
    .locals 0

    invoke-static {p0, p1, p2}, LKi/f;->v(JZ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic b(JI)J
    .locals 0

    invoke-static {p0, p1, p2}, LKi/f;->w(JI)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(JLKi/m;)LKi/m;
    .locals 0

    invoke-static {p0, p1, p2}, LKi/f;->x(JLKi/m;)LKi/m;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->q:LNi/C;

    return-object v0
.end method

.method public static final synthetic e()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->r:LNi/C;

    return-object v0
.end method

.method public static final synthetic f()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->i:LNi/C;

    return-object v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, LKi/f;->c:I

    return v0
.end method

.method public static final synthetic h()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->o:LNi/C;

    return-object v0
.end method

.method public static final synthetic i()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->k:LNi/C;

    return-object v0
.end method

.method public static final synthetic j()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->j:LNi/C;

    return-object v0
.end method

.method public static final synthetic k()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->e:LNi/C;

    return-object v0
.end method

.method public static final synthetic l()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->s:LNi/C;

    return-object v0
.end method

.method public static final synthetic m()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->p:LNi/C;

    return-object v0
.end method

.method public static final synthetic n()LKi/m;
    .locals 1

    sget-object v0, LKi/f;->a:LKi/m;

    return-object v0
.end method

.method public static final synthetic o()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->h:LNi/C;

    return-object v0
.end method

.method public static final synthetic p()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->g:LNi/C;

    return-object v0
.end method

.method public static final synthetic q()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->f:LNi/C;

    return-object v0
.end method

.method public static final synthetic r()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->m:LNi/C;

    return-object v0
.end method

.method public static final synthetic s()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->n:LNi/C;

    return-object v0
.end method

.method public static final synthetic t(I)J
    .locals 2

    invoke-static {p0}, LKi/f;->A(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic u(LIi/n;Ljava/lang/Object;Lmh/q;)Z
    .locals 0

    invoke-static {p0, p1, p2}, LKi/f;->B(LIi/n;Ljava/lang/Object;Lmh/q;)Z

    move-result p0

    return p0
.end method

.method private static final v(JZ)J
    .locals 2

    if-eqz p2, :cond_0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final w(JI)J
    .locals 2

    int-to-long v0, p2

    const/16 p2, 0x3c

    shl-long/2addr v0, p2

    add-long/2addr v0, p0

    return-wide v0
.end method

.method private static final x(JLKi/m;)LKi/m;
    .locals 7

    new-instance v6, LKi/m;

    invoke-virtual {p2}, LKi/m;->y()LKi/e;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, v6

    move-wide v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, LKi/m;-><init>(JLKi/m;LKi/e;I)V

    return-object v6
.end method

.method public static final y()Lth/g;
    .locals 1

    sget-object v0, LKi/f$a;->a:LKi/f$a;

    return-object v0
.end method

.method public static final z()LNi/C;
    .locals 1

    sget-object v0, LKi/f;->l:LNi/C;

    return-object v0
.end method
