.class public final synthetic Lw9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Ls9/b;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lw9/a;

.field public final synthetic g:Lw9/b;

.field public final synthetic h:LL0/U;

.field public final synthetic i:Ls/g;

.field public final synthetic j:LN/f;

.field public final synthetic k:Ls/G;

.field public final synthetic l:Lz/c$e;

.field public final synthetic m:Ly/m;

.field public final synthetic n:Lmh/a;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;III)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lw9/f;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, Lw9/f;->b:Ls9/b;

    move-object v1, p3

    iput-object v1, v0, Lw9/f;->c:Ljava/lang/String;

    move v1, p4

    iput-boolean v1, v0, Lw9/f;->d:Z

    move v1, p5

    iput-boolean v1, v0, Lw9/f;->e:Z

    move-object v1, p6

    iput-object v1, v0, Lw9/f;->f:Lw9/a;

    move-object v1, p7

    iput-object v1, v0, Lw9/f;->g:Lw9/b;

    move-object v1, p8

    iput-object v1, v0, Lw9/f;->h:LL0/U;

    move-object v1, p9

    iput-object v1, v0, Lw9/f;->i:Ls/g;

    move-object v1, p10

    iput-object v1, v0, Lw9/f;->j:LN/f;

    move-object v1, p11

    iput-object v1, v0, Lw9/f;->k:Ls/G;

    move-object v1, p12

    iput-object v1, v0, Lw9/f;->l:Lz/c$e;

    move-object v1, p13

    iput-object v1, v0, Lw9/f;->m:Ly/m;

    move-object/from16 v1, p14

    iput-object v1, v0, Lw9/f;->n:Lmh/a;

    move/from16 v1, p15

    iput v1, v0, Lw9/f;->o:I

    move/from16 v1, p16

    iput v1, v0, Lw9/f;->p:I

    move/from16 v1, p17

    iput v1, v0, Lw9/f;->q:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lw9/f;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, Lw9/f;->b:Ls9/b;

    iget-object v3, v0, Lw9/f;->c:Ljava/lang/String;

    iget-boolean v4, v0, Lw9/f;->d:Z

    iget-boolean v5, v0, Lw9/f;->e:Z

    iget-object v6, v0, Lw9/f;->f:Lw9/a;

    iget-object v7, v0, Lw9/f;->g:Lw9/b;

    iget-object v8, v0, Lw9/f;->h:LL0/U;

    iget-object v9, v0, Lw9/f;->i:Ls/g;

    iget-object v10, v0, Lw9/f;->j:LN/f;

    iget-object v11, v0, Lw9/f;->k:Ls/G;

    iget-object v12, v0, Lw9/f;->l:Lz/c$e;

    iget-object v13, v0, Lw9/f;->m:Ly/m;

    iget-object v14, v0, Lw9/f;->n:Lmh/a;

    iget v15, v0, Lw9/f;->o:I

    move-object/from16 v20, v1

    iget v1, v0, Lw9/f;->p:I

    move/from16 v16, v1

    iget v1, v0, Lw9/f;->q:I

    move/from16 v17, v1

    move-object/from16 v18, p1

    check-cast v18, LT/l;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v19

    move-object/from16 v1, v20

    invoke-static/range {v1 .. v19}, Lw9/g;->a(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;ZZLw9/a;Lw9/b;LL0/U;Ls/g;LN/f;Ls/G;Lz/c$e;Ly/m;Lmh/a;IIILT/l;I)LYg/J;

    move-result-object v1

    return-object v1
.end method
