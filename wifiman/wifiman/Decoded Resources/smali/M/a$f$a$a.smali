.class final LM/a$f$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a$f$a;->a(Lj0/d;)Lj0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Z

.field final synthetic c:Lm0/J0;

.field final synthetic d:Lm0/w0;


# direct methods
.method constructor <init>(Lmh/a;ZLm0/J0;Lm0/w0;)V
    .locals 0

    iput-object p1, p0, LM/a$f$a$a;->a:Lmh/a;

    iput-boolean p2, p0, LM/a$f$a$a;->b:Z

    iput-object p3, p0, LM/a$f$a$a;->c:Lm0/J0;

    iput-object p4, p0, LM/a$f$a$a;->d:Lm0/w0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/c;)V
    .locals 14

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, LM/a$f$a$a;->a:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LM/a$f$a$a;->b:Z

    if-eqz v0, :cond_1

    iget-object v2, p0, LM/a$f$a$a;->c:Lm0/J0;

    iget-object v7, p0, LM/a$f$a$a;->d:Lm0/w0;

    invoke-interface {p1}, Lo0/f;->D1()J

    move-result-wide v0

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object v11

    invoke-interface {v11}, Lo0/d;->c()J

    move-result-wide v12

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v3

    invoke-interface {v3}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v11}, Lo0/d;->e()Lo0/h;

    move-result-object v3

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v4, v5, v0, v1}, Lo0/h;->f(FFJ)V

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lo0/f;->Y(Lo0/f;Lm0/J0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-interface {p1}, Lm0/n0;->r()V

    invoke-interface {v11, v12, v13}, Lo0/d;->f(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v11}, Lo0/d;->d()Lm0/n0;

    move-result-object v0

    invoke-interface {v0}, Lm0/n0;->r()V

    invoke-interface {v11, v12, v13}, Lo0/d;->f(J)V

    throw p1

    :cond_1
    iget-object v2, p0, LM/a$f$a$a;->c:Lm0/J0;

    iget-object v7, p0, LM/a$f$a$a;->d:Lm0/w0;

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lo0/f;->Y(Lo0/f;Lm0/J0;JFLo0/g;Lm0/w0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/c;

    invoke-virtual {p0, p1}, LM/a$f$a$a;->a(Lo0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
