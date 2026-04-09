.class final Lp0/c$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp0/c;-><init>(Lp0/d;Lp0/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp0/c;


# direct methods
.method constructor <init>(Lp0/c;)V
    .locals 0

    iput-object p1, p0, Lp0/c$b;->a:Lp0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 7

    iget-object v0, p0, Lp0/c$b;->a:Lp0/c;

    invoke-static {v0}, Lp0/c;->b(Lp0/c;)Lm0/U0;

    move-result-object v0

    iget-object v1, p0, Lp0/c$b;->a:Lp0/c;

    invoke-static {v1}, Lp0/c;->c(Lp0/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lp0/c$b;->a:Lp0/c;

    invoke-virtual {v1}, Lp0/c;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lp0/c$b;->a:Lp0/c;

    invoke-static {v1}, Lp0/c;->a(Lp0/c;)Lmh/l;

    move-result-object v1

    sget-object v2, Lm0/u0;->a:Lm0/u0$a;

    invoke-virtual {v2}, Lm0/u0$a;->b()I

    move-result v2

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v3

    invoke-interface {v3}, Lo0/d;->c()J

    move-result-wide v4

    invoke-interface {v3}, Lo0/d;->d()Lm0/n0;

    move-result-object v6

    invoke-interface {v6}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v3}, Lo0/d;->e()Lo0/h;

    move-result-object v6

    invoke-interface {v6, v0, v2}, Lo0/h;->d(Lm0/U0;I)V

    invoke-interface {v1, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v3, v4, v5}, Lo0/d;->f(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v3}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v3, v4, v5}, Lo0/d;->f(J)V

    throw p1

    :cond_0
    iget-object v0, p0, Lp0/c$b;->a:Lp0/c;

    invoke-static {v0}, Lp0/c;->a(Lp0/c;)Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, Lp0/c$b;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
