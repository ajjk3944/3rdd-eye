.class abstract Lqg/f0$c;
.super Lyg/f;
.source "SourceFile"

# interfaces
.implements Lgg/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation


# instance fields
.field protected final i:LDj/b;

.field protected final j:LFg/b;

.field protected final k:LDj/c;

.field private l:J


# direct methods
.method constructor <init>(LDj/b;LFg/b;LDj/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lyg/f;-><init>(Z)V

    iput-object p1, p0, Lqg/f0$c;->i:LDj/b;

    iput-object p2, p0, Lqg/f0$c;->j:LFg/b;

    iput-object p3, p0, Lqg/f0$c;->k:LDj/c;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    invoke-super {p0}, Lyg/f;->cancel()V

    iget-object v0, p0, Lqg/f0$c;->k:LDj/c;

    invoke-interface {v0}, LDj/c;->cancel()V

    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lqg/f0$c;->l:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lqg/f0$c;->l:J

    iget-object v0, p0, Lqg/f0$c;->i:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(LDj/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lyg/f;->r(LDj/c;)V

    return-void
.end method

.method protected final s(Ljava/lang/Object;)V
    .locals 5

    sget-object v0, Lyg/d;->INSTANCE:Lyg/d;

    invoke-virtual {p0, v0}, Lyg/f;->r(LDj/c;)V

    iget-wide v0, p0, Lqg/f0$c;->l:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    iput-wide v2, p0, Lqg/f0$c;->l:J

    invoke-virtual {p0, v0, v1}, Lyg/f;->p(J)V

    :cond_0
    iget-object v0, p0, Lqg/f0$c;->k:LDj/c;

    const-wide/16 v1, 0x1

    invoke-interface {v0, v1, v2}, LDj/c;->request(J)V

    iget-object v0, p0, Lqg/f0$c;->j:LFg/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method
