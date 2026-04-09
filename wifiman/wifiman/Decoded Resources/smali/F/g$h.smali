.class final LF/g$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/g;->e(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LL0/d;

.field final synthetic c:Lmh/l;

.field final synthetic d:Z

.field final synthetic e:Ljava/util/Map;

.field final synthetic f:LL0/U;

.field final synthetic g:I

.field final synthetic h:Z

.field final synthetic i:I

.field final synthetic j:I

.field final synthetic k:LQ0/k$b;

.field final synthetic l:LL/g;

.field final synthetic m:Lm0/y0;

.field final synthetic n:Lmh/l;

.field final synthetic o:I

.field final synthetic p:I

.field final synthetic q:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF/g$h;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, LF/g$h;->b:LL0/d;

    move-object v1, p3

    iput-object v1, v0, LF/g$h;->c:Lmh/l;

    move v1, p4

    iput-boolean v1, v0, LF/g$h;->d:Z

    move-object v1, p5

    iput-object v1, v0, LF/g$h;->e:Ljava/util/Map;

    move-object v1, p6

    iput-object v1, v0, LF/g$h;->f:LL0/U;

    move v1, p7

    iput v1, v0, LF/g$h;->g:I

    move v1, p8

    iput-boolean v1, v0, LF/g$h;->h:Z

    move v1, p9

    iput v1, v0, LF/g$h;->i:I

    move v1, p10

    iput v1, v0, LF/g$h;->j:I

    move-object v1, p11

    iput-object v1, v0, LF/g$h;->k:LQ0/k$b;

    move-object v1, p13

    iput-object v1, v0, LF/g$h;->m:Lm0/y0;

    move-object/from16 v1, p14

    iput-object v1, v0, LF/g$h;->n:Lmh/l;

    move/from16 v1, p15

    iput v1, v0, LF/g$h;->o:I

    move/from16 v1, p16

    iput v1, v0, LF/g$h;->p:I

    move/from16 v1, p17

    iput v1, v0, LF/g$h;->q:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, LF/g$h;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LF/g$h;->b:LL0/d;

    iget-object v3, v0, LF/g$h;->c:Lmh/l;

    iget-boolean v4, v0, LF/g$h;->d:Z

    iget-object v5, v0, LF/g$h;->e:Ljava/util/Map;

    iget-object v6, v0, LF/g$h;->f:LL0/U;

    iget v7, v0, LF/g$h;->g:I

    iget-boolean v8, v0, LF/g$h;->h:Z

    iget v9, v0, LF/g$h;->i:I

    iget v10, v0, LF/g$h;->j:I

    iget-object v11, v0, LF/g$h;->k:LQ0/k$b;

    iget-object v12, v0, LF/g$h;->l:LL/g;

    iget-object v13, v0, LF/g$h;->m:Lm0/y0;

    iget-object v14, v0, LF/g$h;->n:Lmh/l;

    move-object/from16 p1, v1

    iget v1, v0, LF/g$h;->o:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v16

    iget v1, v0, LF/g$h;->p:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v17

    iget v1, v0, LF/g$h;->q:I

    move/from16 v18, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v18}, LF/g;->g(Landroidx/compose/ui/e;LL0/d;Lmh/l;ZLjava/util/Map;LL0/U;IZIILQ0/k$b;LL/g;Lm0/y0;Lmh/l;LT/l;III)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/g$h;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
