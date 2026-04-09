.class final LC/m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/m;->a(LC/C;Landroidx/compose/ui/e;Lz/N;LC/g;IFLf0/c$c;Lw/C;ZZLmh/l;Lx0/a;Lx/j;Lmh/r;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LC/C;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lz/N;

.field final synthetic d:LC/g;

.field final synthetic e:I

.field final synthetic f:F

.field final synthetic g:Lf0/c$c;

.field final synthetic h:Lw/C;

.field final synthetic i:Z

.field final synthetic j:Z

.field final synthetic k:Lmh/l;

.field final synthetic l:Lx0/a;

.field final synthetic m:Lx/j;

.field final synthetic n:Lmh/r;

.field final synthetic o:I

.field final synthetic p:I

.field final synthetic q:I


# direct methods
.method constructor <init>(LC/C;Landroidx/compose/ui/e;Lz/N;LC/g;IFLf0/c$c;Lw/C;ZZLmh/l;Lx0/a;Lx/j;Lmh/r;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LC/m$a;->a:LC/C;

    move-object v1, p2

    iput-object v1, v0, LC/m$a;->b:Landroidx/compose/ui/e;

    move-object v1, p3

    iput-object v1, v0, LC/m$a;->c:Lz/N;

    move-object v1, p4

    iput-object v1, v0, LC/m$a;->d:LC/g;

    move v1, p5

    iput v1, v0, LC/m$a;->e:I

    move v1, p6

    iput v1, v0, LC/m$a;->f:F

    move-object v1, p7

    iput-object v1, v0, LC/m$a;->g:Lf0/c$c;

    move-object v1, p8

    iput-object v1, v0, LC/m$a;->h:Lw/C;

    move v1, p9

    iput-boolean v1, v0, LC/m$a;->i:Z

    move v1, p10

    iput-boolean v1, v0, LC/m$a;->j:Z

    move-object v1, p11

    iput-object v1, v0, LC/m$a;->k:Lmh/l;

    move-object v1, p12

    iput-object v1, v0, LC/m$a;->l:Lx0/a;

    move-object v1, p13

    iput-object v1, v0, LC/m$a;->m:Lx/j;

    move-object/from16 v1, p14

    iput-object v1, v0, LC/m$a;->n:Lmh/r;

    move/from16 v1, p15

    iput v1, v0, LC/m$a;->o:I

    move/from16 v1, p16

    iput v1, v0, LC/m$a;->p:I

    move/from16 v1, p17

    iput v1, v0, LC/m$a;->q:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    iget-object v1, v0, LC/m$a;->a:LC/C;

    iget-object v2, v0, LC/m$a;->b:Landroidx/compose/ui/e;

    iget-object v3, v0, LC/m$a;->c:Lz/N;

    iget-object v4, v0, LC/m$a;->d:LC/g;

    iget v5, v0, LC/m$a;->e:I

    iget v6, v0, LC/m$a;->f:F

    iget-object v7, v0, LC/m$a;->g:Lf0/c$c;

    iget-object v8, v0, LC/m$a;->h:Lw/C;

    iget-boolean v9, v0, LC/m$a;->i:Z

    iget-boolean v10, v0, LC/m$a;->j:Z

    iget-object v11, v0, LC/m$a;->k:Lmh/l;

    iget-object v12, v0, LC/m$a;->l:Lx0/a;

    iget-object v13, v0, LC/m$a;->m:Lx/j;

    iget-object v14, v0, LC/m$a;->n:Lmh/r;

    move-object/from16 p1, v1

    iget v1, v0, LC/m$a;->o:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v16

    iget v1, v0, LC/m$a;->p:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v17

    iget v1, v0, LC/m$a;->q:I

    move/from16 v18, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v18}, LC/m;->a(LC/C;Landroidx/compose/ui/e;Lz/N;LC/g;IFLf0/c$c;Lw/C;ZZLmh/l;Lx0/a;Lx/j;Lmh/r;LT/l;III)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/m$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
