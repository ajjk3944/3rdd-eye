.class final LN/V0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0;->a(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/Z0;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lmh/p;

.field final synthetic d:LR0/c0;

.field final synthetic e:Lmh/p;

.field final synthetic f:Lmh/p;

.field final synthetic g:Lmh/p;

.field final synthetic h:Lmh/p;

.field final synthetic i:Z

.field final synthetic j:Z

.field final synthetic k:Z

.field final synthetic l:Ly/k;

.field final synthetic m:Lz/N;

.field final synthetic n:Lm0/i1;

.field final synthetic o:LN/S0;

.field final synthetic p:Lmh/p;

.field final synthetic q:I

.field final synthetic r:I


# direct methods
.method constructor <init>(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;II)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LN/V0$b;->a:LN/Z0;

    move-object v1, p2

    iput-object v1, v0, LN/V0$b;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, LN/V0$b;->c:Lmh/p;

    move-object v1, p4

    iput-object v1, v0, LN/V0$b;->d:LR0/c0;

    move-object v1, p5

    iput-object v1, v0, LN/V0$b;->e:Lmh/p;

    move-object v1, p6

    iput-object v1, v0, LN/V0$b;->f:Lmh/p;

    move-object v1, p7

    iput-object v1, v0, LN/V0$b;->g:Lmh/p;

    move-object v1, p8

    iput-object v1, v0, LN/V0$b;->h:Lmh/p;

    move v1, p9

    iput-boolean v1, v0, LN/V0$b;->i:Z

    move v1, p10

    iput-boolean v1, v0, LN/V0$b;->j:Z

    move v1, p11

    iput-boolean v1, v0, LN/V0$b;->k:Z

    move-object v1, p12

    iput-object v1, v0, LN/V0$b;->l:Ly/k;

    move-object v1, p13

    iput-object v1, v0, LN/V0$b;->m:Lz/N;

    move-object/from16 v1, p14

    iput-object v1, v0, LN/V0$b;->n:Lm0/i1;

    move-object/from16 v1, p15

    iput-object v1, v0, LN/V0$b;->o:LN/S0;

    move-object/from16 v1, p16

    iput-object v1, v0, LN/V0$b;->p:Lmh/p;

    move/from16 v1, p17

    iput v1, v0, LN/V0$b;->q:I

    move/from16 v1, p18

    iput v1, v0, LN/V0$b;->r:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    iget-object v1, v0, LN/V0$b;->a:LN/Z0;

    iget-object v2, v0, LN/V0$b;->b:Ljava/lang/String;

    iget-object v3, v0, LN/V0$b;->c:Lmh/p;

    iget-object v4, v0, LN/V0$b;->d:LR0/c0;

    iget-object v5, v0, LN/V0$b;->e:Lmh/p;

    iget-object v6, v0, LN/V0$b;->f:Lmh/p;

    iget-object v7, v0, LN/V0$b;->g:Lmh/p;

    iget-object v8, v0, LN/V0$b;->h:Lmh/p;

    iget-boolean v9, v0, LN/V0$b;->i:Z

    iget-boolean v10, v0, LN/V0$b;->j:Z

    iget-boolean v11, v0, LN/V0$b;->k:Z

    iget-object v12, v0, LN/V0$b;->l:Ly/k;

    iget-object v13, v0, LN/V0$b;->m:Lz/N;

    iget-object v14, v0, LN/V0$b;->n:Lm0/i1;

    iget-object v15, v0, LN/V0$b;->o:LN/S0;

    move-object/from16 p1, v1

    iget-object v1, v0, LN/V0$b;->p:Lmh/p;

    move-object/from16 v16, v1

    iget v1, v0, LN/V0$b;->q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v18

    iget v1, v0, LN/V0$b;->r:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v19

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v19}, LN/V0;->a(LN/Z0;Ljava/lang/String;Lmh/p;LR0/c0;Lmh/p;Lmh/p;Lmh/p;Lmh/p;ZZZLy/k;Lz/N;Lm0/i1;LN/S0;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/V0$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
