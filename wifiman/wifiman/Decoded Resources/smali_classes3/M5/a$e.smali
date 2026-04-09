.class final LM5/a$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM5/a;->c(Lb6/b;Lx6/b;LY5/d;LY5/d;LY5/d;LY5/d;LC6/a;LC6/b;LB6/a;LO5/a;ZLx6/b;Lf6/a;Li6/a;LO5/c;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/RectF;

.field final synthetic b:Lb6/b;

.field final synthetic c:Lu6/f;

.field final synthetic d:Lx6/b;

.field final synthetic e:LA6/a;

.field final synthetic f:LO5/c;

.field final synthetic g:LO5/a;

.field final synthetic h:I

.field final synthetic i:LT/q0;

.field final synthetic j:Li6/a;

.field final synthetic k:LY5/b;

.field final synthetic l:Z

.field final synthetic m:Lmh/l;

.field final synthetic n:LT/q0;


# direct methods
.method constructor <init>(Landroid/graphics/RectF;Lb6/b;Lu6/f;Lx6/b;LA6/a;LB6/a;LC6/a;LO5/c;LO5/a;ILT/q0;Li6/a;Lf6/a;LY5/b;LC6/b;ZLmh/l;LT/q0;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LM5/a$e;->a:Landroid/graphics/RectF;

    move-object v1, p2

    iput-object v1, v0, LM5/a$e;->b:Lb6/b;

    move-object v1, p3

    iput-object v1, v0, LM5/a$e;->c:Lu6/f;

    move-object v1, p4

    iput-object v1, v0, LM5/a$e;->d:Lx6/b;

    move-object v1, p5

    iput-object v1, v0, LM5/a$e;->e:LA6/a;

    move-object v1, p8

    iput-object v1, v0, LM5/a$e;->f:LO5/c;

    move-object v1, p9

    iput-object v1, v0, LM5/a$e;->g:LO5/a;

    move v1, p10

    iput v1, v0, LM5/a$e;->h:I

    move-object v1, p11

    iput-object v1, v0, LM5/a$e;->i:LT/q0;

    move-object v1, p12

    iput-object v1, v0, LM5/a$e;->j:Li6/a;

    move-object/from16 v1, p14

    iput-object v1, v0, LM5/a$e;->k:LY5/b;

    move/from16 v1, p16

    iput-boolean v1, v0, LM5/a$e;->l:Z

    move-object/from16 v1, p17

    iput-object v1, v0, LM5/a$e;->m:Lmh/l;

    move-object/from16 v1, p18

    iput-object v1, v0, LM5/a$e;->n:LT/q0;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 11

    const-string v0, "$this$Canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM5/a$e;->a:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v0, v1, v1, v2, v3}, Ly6/i;->e(Landroid/graphics/RectF;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    iget-object v0, p0, LM5/a$e;->b:Lb6/b;

    iget-object v1, p0, LM5/a$e;->c:Lu6/f;

    invoke-virtual {v1}, Lu6/f;->c()Lk6/c;

    move-result-object v1

    iget-object v2, p0, LM5/a$e;->d:Lx6/b;

    invoke-interface {v0, v1, v2}, Lb6/b;->k(Lk6/c;Ljava/lang/Object;)V

    iget-object v0, p0, LM5/a$e;->b:Lb6/b;

    iget-object v1, p0, LM5/a$e;->c:Lu6/f;

    iget-object v2, p0, LM5/a$e;->d:Lx6/b;

    invoke-interface {v0, v1, v2}, Lb6/b;->f(Lu6/e;Ljava/lang/Object;)Lj6/b;

    move-result-object v0

    iget-object v3, p0, LM5/a$e;->e:LA6/a;

    iget-object v4, p0, LM5/a$e;->c:Lu6/f;

    iget-object v5, p0, LM5/a$e;->a:Landroid/graphics/RectF;

    iget-object v6, p0, LM5/a$e;->b:Lb6/b;

    const/4 v1, 0x0

    filled-new-array {v1}, [Lg6/a;

    move-result-object v9

    const/4 v7, 0x0

    move-object v8, v0

    invoke-virtual/range {v3 .. v9}, LA6/a;->a(Lu6/e;Landroid/graphics/RectF;Lb6/b;LB6/a;Lj6/b;[Lg6/a;)Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LM5/a$e;->f:LO5/c;

    iget-object v2, p0, LM5/a$e;->c:Lu6/f;

    iget-object v3, p0, LM5/a$e;->b:Lb6/b;

    invoke-interface {v3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-static {v2, v3, v0}, Le6/c;->a(Lu6/e;FLj6/b;)F

    move-result v2

    invoke-virtual {v1, v2}, LO5/c;->l(F)V

    iget-object v1, p0, LM5/a$e;->f:LO5/c;

    iget-object v2, p0, LM5/a$e;->g:LO5/a;

    invoke-virtual {v2}, LO5/a;->a()LE6/d;

    move-result-object v2

    invoke-virtual {v1, v2}, LO5/c;->j(LE6/d;)V

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v3

    iget v4, p0, LM5/a$e;->h:I

    iget-object v5, p0, LM5/a$e;->c:Lu6/f;

    iget-object p1, p0, LM5/a$e;->i:LT/q0;

    invoke-interface {p1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, LD6/a;

    iget-object p1, p0, LM5/a$e;->b:Lb6/b;

    invoke-interface {p1}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v8

    iget-object p1, p0, LM5/a$e;->f:LO5/c;

    invoke-virtual {p1}, LO5/c;->i()F

    move-result v9

    iget-object v10, p0, LM5/a$e;->j:Li6/a;

    move-object v7, v0

    invoke-static/range {v3 .. v10}, Le6/b;->a(Landroid/graphics/Canvas;ILu6/e;LD6/a;Lj6/b;Landroid/graphics/RectF;FLi6/a;)Le6/a;

    move-result-object p1

    iget-object v0, p0, LM5/a$e;->k:LY5/b;

    invoke-virtual {v0, p1}, LY5/b;->c(Le6/a;)V

    iget-object v0, p0, LM5/a$e;->b:Lb6/b;

    iget-object v1, p0, LM5/a$e;->d:Lx6/b;

    invoke-interface {v0, p1, v1}, Lb6/b;->a(Le6/a;Ljava/lang/Object;)V

    iget-object v0, p0, LM5/a$e;->k:LY5/b;

    invoke-virtual {v0, p1}, LY5/b;->b(Le6/a;)V

    iget-object v0, p0, LM5/a$e;->b:Lb6/b;

    iget-object v1, p0, LM5/a$e;->d:Lx6/b;

    invoke-interface {v0, p1, v1}, Lb6/b;->d(Le6/a;Ljava/lang/Object;)V

    iget-object p1, p0, LM5/a$e;->c:Lu6/f;

    invoke-virtual {p1}, Lu6/f;->t()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LM5/a$e;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
