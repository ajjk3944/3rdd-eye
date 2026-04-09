.class public final Lqg/d0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/d0$a;
    }
.end annotation


# instance fields
.field final c:J


# direct methods
.method public constructor <init>(Lgg/i;J)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/d0;->c:J

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 7

    new-instance v4, Lyg/f;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lyg/f;-><init>(Z)V

    invoke-interface {p1, v4}, LDj/b;->j(LDj/c;)V

    new-instance v6, Lqg/d0$a;

    iget-wide v0, p0, Lqg/d0;->c:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    move-wide v2, v0

    :cond_0
    iget-object v5, p0, Lqg/b;->b:Lgg/i;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lqg/d0$a;-><init>(LDj/b;JLyg/f;LDj/a;)V

    invoke-virtual {v6}, Lqg/d0$a;->c()V

    return-void
.end method
