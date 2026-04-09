.class public Lej/l;
.super Lej/E;
.source "SourceFile"


# instance fields
.field private g:Lej/E;


# direct methods
.method public constructor <init>(Lej/E;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lej/E;-><init>()V

    iput-object p1, p0, Lej/l;->g:Lej/E;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/locks/Condition;)V
    .locals 1

    const-string v0, "condition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0, p1}, Lej/E;->a(Ljava/util/concurrent/locks/Condition;)V

    return-void
.end method

.method public b()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->b()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public c()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->c()Lej/E;

    move-result-object v0

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public e(J)Lej/E;
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0, p1, p2}, Lej/E;->e(J)Lej/E;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->f()Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->g()V

    return-void
.end method

.method public h(JLjava/util/concurrent/TimeUnit;)Lej/E;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0, p1, p2, p3}, Lej/E;->h(JLjava/util/concurrent/TimeUnit;)Lej/E;

    move-result-object p1

    return-object p1
.end method

.method public i()J
    .locals 2

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0}, Lej/E;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public j(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "monitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lej/l;->g:Lej/E;

    invoke-virtual {v0, p1}, Lej/E;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final k()Lej/E;
    .locals 1

    iget-object v0, p0, Lej/l;->g:Lej/E;

    return-object v0
.end method

.method public final l(Lej/E;)Lej/l;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lej/l;->g:Lej/E;

    return-object p0
.end method
