.class public abstract LRi/f;
.super LIi/p0;
.source "SourceFile"


# instance fields
.field private final d:I

.field private final e:I

.field private final f:J

.field private final g:Ljava/lang/String;

.field private h:LRi/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, LIi/p0;-><init>()V

    iput p1, p0, LRi/f;->d:I

    iput p2, p0, LRi/f;->e:I

    iput-wide p3, p0, LRi/f;->f:J

    iput-object p5, p0, LRi/f;->g:Ljava/lang/String;

    invoke-direct {p0}, LRi/f;->p0()LRi/a;

    move-result-object p1

    iput-object p1, p0, LRi/f;->h:LRi/a;

    return-void
.end method

.method private final p0()LRi/a;
    .locals 7

    new-instance v6, LRi/a;

    iget v1, p0, LRi/f;->d:I

    iget v2, p0, LRi/f;->e:I

    iget-wide v3, p0, LRi/f;->f:J

    iget-object v5, p0, LRi/f;->g:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LRi/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method


# virtual methods
.method public Y(Ldh/i;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, LRi/f;->h:LRi/a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LRi/a;->y(LRi/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public b0(Ldh/i;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, LRi/f;->h:LRi/a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LRi/a;->y(LRi/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public final q0(Ljava/lang/Runnable;ZZ)V
    .locals 1

    iget-object v0, p0, LRi/f;->h:LRi/a;

    invoke-virtual {v0, p1, p2, p3}, LRi/a;->v(Ljava/lang/Runnable;ZZ)V

    return-void
.end method
