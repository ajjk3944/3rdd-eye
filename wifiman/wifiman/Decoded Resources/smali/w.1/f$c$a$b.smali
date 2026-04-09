.class final Lw/f$c$a$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/f$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/f;

.field final synthetic b:Lw/G;

.field final synthetic c:Lw/d;


# direct methods
.method constructor <init>(Lw/f;Lw/G;Lw/d;)V
    .locals 0

    iput-object p1, p0, Lw/f$c$a$b;->a:Lw/f;

    iput-object p2, p0, Lw/f$c$a$b;->b:Lw/G;

    iput-object p3, p0, Lw/f$c$a$b;->c:Lw/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    iget-object v0, p0, Lw/f$c$a$b;->a:Lw/f;

    invoke-static {v0}, Lw/f;->E2(Lw/f;)Lw/c;

    move-result-object v0

    iget-object v7, p0, Lw/f$c$a$b;->a:Lw/f;

    :goto_0
    invoke-static {v0}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->u()Z

    move-result v1

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object v1

    invoke-virtual {v1}, LV/b;->v()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/f$a;

    invoke-virtual {v1}, Lw/f$a;->b()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll0/i;

    if-nez v2, :cond_0

    move v1, v8

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, v7

    invoke-static/range {v1 .. v6}, Lw/f;->V2(Lw/f;Ll0/i;JILjava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_1

    invoke-static {v0}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object v1

    invoke-static {v0}, Lw/c;->a(Lw/c;)LV/b;

    move-result-object v2

    invoke-virtual {v2}, LV/b;->o()I

    move-result v2

    sub-int/2addr v2, v8

    invoke-virtual {v1, v2}, LV/b;->z(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/f$a;

    invoke-virtual {v1}, Lw/f$a;->a()LIi/n;

    move-result-object v1

    sget-object v2, LYg/J;->a:LYg/J;

    invoke-static {v2}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lw/f$c$a$b;->a:Lw/f;

    invoke-static {v0}, Lw/f;->I2(Lw/f;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lw/f$c$a$b;->a:Lw/f;

    invoke-static {v0}, Lw/f;->F2(Lw/f;)Ll0/i;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    iget-object v1, p0, Lw/f$c$a$b;->a:Lw/f;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lw/f;->V2(Lw/f;Ll0/i;JILjava/lang/Object;)Z

    move-result v1

    if-ne v1, v8, :cond_2

    goto :goto_2

    :cond_2
    move v8, v0

    :goto_2
    if-eqz v8, :cond_3

    iget-object v1, p0, Lw/f$c$a$b;->a:Lw/f;

    invoke-static {v1, v0}, Lw/f;->M2(Lw/f;Z)V

    :cond_3
    iget-object v0, p0, Lw/f$c$a$b;->b:Lw/G;

    iget-object v1, p0, Lw/f$c$a$b;->a:Lw/f;

    iget-object v2, p0, Lw/f$c$a$b;->c:Lw/d;

    invoke-static {v1, v2}, Lw/f;->D2(Lw/f;Lw/d;)F

    move-result v1

    invoke-virtual {v0, v1}, Lw/G;->j(F)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lw/f$c$a$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
