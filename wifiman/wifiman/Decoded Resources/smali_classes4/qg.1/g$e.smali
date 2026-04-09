.class final Lqg/g$e;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final i:Lqg/g$f;

.field j:J


# direct methods
.method constructor <init>(Lqg/g$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/g$e;->i:Lqg/g$f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-wide v0, p0, Lqg/g$e;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lqg/g$e;->j:J

    invoke-virtual {p0, v0, v1}, Lyg/f;->p(J)V

    :cond_0
    iget-object v0, p0, Lqg/g$e;->i:Lqg/g$f;

    invoke-interface {v0}, Lqg/g$f;->d()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lqg/g$e;->j:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/g$e;->j:J

    iget-object v0, p0, Lqg/g$e;->i:Lqg/g$f;

    invoke-interface {v0, p1}, Lqg/g$f;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public j(LDj/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-wide v0, p0, Lqg/g$e;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lqg/g$e;->j:J

    invoke-virtual {p0, v0, v1}, Lyg/f;->p(J)V

    :cond_0
    iget-object v0, p0, Lqg/g$e;->i:Lqg/g$f;

    invoke-interface {v0, p1}, Lqg/g$f;->g(Ljava/lang/Throwable;)V

    return-void
.end method
