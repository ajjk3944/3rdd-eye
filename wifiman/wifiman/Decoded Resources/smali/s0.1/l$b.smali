.class final Ls0/l$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/l;-><init>(Ls0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls0/l;


# direct methods
.method constructor <init>(Ls0/l;)V
    .locals 0

    iput-object p1, p0, Ls0/l$b;->a:Ls0/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 9

    iget-object v0, p0, Ls0/l$b;->a:Ls0/l;

    invoke-virtual {v0}, Ls0/l;->l()Ls0/c;

    move-result-object v0

    iget-object v1, p0, Ls0/l$b;->a:Ls0/l;

    invoke-static {v1}, Ls0/l;->f(Ls0/l;)F

    move-result v2

    invoke-static {v1}, Ls0/l;->g(Ls0/l;)F

    move-result v1

    sget-object v3, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v3}, Ll0/g$a;->c()J

    move-result-wide v3

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v5

    invoke-interface {v5}, Lo0/d;->c()J

    move-result-wide v6

    invoke-interface {v5}, Lo0/d;->d()Lm0/n0;

    move-result-object v8

    invoke-interface {v8}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v5}, Lo0/d;->e()Lo0/h;

    move-result-object v8

    invoke-interface {v8, v2, v1, v3, v4}, Lo0/h;->f(FFJ)V

    invoke-virtual {v0, p1}, Ls0/c;->a(Lo0/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v5, v6, v7}, Lo0/d;->f(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v5}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v5, v6, v7}, Lo0/d;->f(J)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, Ls0/l$b;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
