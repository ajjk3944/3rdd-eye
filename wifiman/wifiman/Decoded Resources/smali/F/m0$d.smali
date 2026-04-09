.class final LF/m0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m0;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/m0;

.field final synthetic b:LL0/d$c;

.field final synthetic c:LF/F;


# direct methods
.method constructor <init>(LF/m0;LL0/d$c;LF/F;)V
    .locals 0

    iput-object p1, p0, LF/m0$d;->a:LF/m0;

    iput-object p2, p0, LF/m0$d;->b:LL0/d$c;

    iput-object p3, p0, LF/m0$d;->c:LF/F;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF/P;)V
    .locals 4

    iget-object v0, p0, LF/m0$d;->a:LF/m0;

    iget-object v1, p0, LF/m0$d;->b:LL0/d$c;

    invoke-virtual {v1}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LL0/i;

    invoke-virtual {v1}, LL0/i;->b()LL0/N;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LL0/N;->d()LL0/D;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    iget-object v3, p0, LF/m0$d;->c:LF/F;

    invoke-virtual {v3}, LF/F;->f()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, LF/m0$d;->b:LL0/d$c;

    invoke-virtual {v3}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL0/i;

    invoke-virtual {v3}, LL0/i;->b()LL0/N;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, LL0/N;->a()LL0/D;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    invoke-static {v0, v1, v3}, LF/m0;->g(LF/m0;LL0/D;LL0/D;)LL0/D;

    move-result-object v1

    iget-object v3, p0, LF/m0$d;->c:LF/F;

    invoke-virtual {v3}, LF/F;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, LF/m0$d;->b:LL0/d$c;

    invoke-virtual {v3}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL0/i;

    invoke-virtual {v3}, LL0/i;->b()LL0/N;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, LL0/N;->b()LL0/D;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    invoke-static {v0, v1, v3}, LF/m0;->g(LF/m0;LL0/D;LL0/D;)LL0/D;

    move-result-object v1

    iget-object v3, p0, LF/m0$d;->c:LF/F;

    invoke-virtual {v3}, LF/F;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, LF/m0$d;->b:LL0/d$c;

    invoke-virtual {v3}, LL0/d$c;->g()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL0/i;

    invoke-virtual {v3}, LL0/i;->b()LL0/N;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LL0/N;->c()LL0/D;

    move-result-object v2

    :cond_3
    invoke-static {v0, v1, v2}, LF/m0;->g(LF/m0;LL0/D;LL0/D;)LL0/D;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, LF/m0$d;->b:LL0/d$c;

    invoke-virtual {v1}, LL0/d$c;->h()I

    move-result v2

    invoke-virtual {v1}, LL0/d$c;->f()I

    move-result v1

    invoke-virtual {p1, v0, v2, v1}, LF/P;->a(LL0/D;II)V

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF/P;

    invoke-virtual {p0, p1}, LF/m0$d;->a(LF/P;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
