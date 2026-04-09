.class final LC/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/c;->a(Landroidx/compose/ui/e;LC/C;Lz/N;ZLw/q;Lw/C;ZIFLC/g;Lx0/a;Lmh/l;Lf0/c$b;Lf0/c$c;Lx/j;Lmh/r;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LC/C;

.field final synthetic c:Lz/N;

.field final synthetic d:Z

.field final synthetic e:Lw/q;

.field final synthetic f:Lw/C;

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:F

.field final synthetic j:LC/g;

.field final synthetic k:Lx0/a;

.field final synthetic l:Lmh/l;

.field final synthetic m:Lf0/c$b;

.field final synthetic n:Lf0/c$c;

.field final synthetic o:Lx/j;

.field final synthetic p:Lmh/r;

.field final synthetic q:I

.field final synthetic r:I

.field final synthetic s:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LC/C;Lz/N;ZLw/q;Lw/C;ZIFLC/g;Lx0/a;Lmh/l;Lf0/c$b;Lf0/c$c;Lx/j;Lmh/r;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LC/c$a;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, LC/c$a;->b:LC/C;

    move-object v1, p3

    iput-object v1, v0, LC/c$a;->c:Lz/N;

    move v1, p4

    iput-boolean v1, v0, LC/c$a;->d:Z

    move-object v1, p5

    iput-object v1, v0, LC/c$a;->e:Lw/q;

    move-object v1, p6

    iput-object v1, v0, LC/c$a;->f:Lw/C;

    move v1, p7

    iput-boolean v1, v0, LC/c$a;->g:Z

    move v1, p8

    iput v1, v0, LC/c$a;->h:I

    move v1, p9

    iput v1, v0, LC/c$a;->i:F

    move-object v1, p10

    iput-object v1, v0, LC/c$a;->j:LC/g;

    move-object v1, p11

    iput-object v1, v0, LC/c$a;->k:Lx0/a;

    move-object v1, p12

    iput-object v1, v0, LC/c$a;->l:Lmh/l;

    move-object v1, p13

    iput-object v1, v0, LC/c$a;->m:Lf0/c$b;

    move-object/from16 v1, p14

    iput-object v1, v0, LC/c$a;->n:Lf0/c$c;

    move-object/from16 v1, p15

    iput-object v1, v0, LC/c$a;->o:Lx/j;

    move-object/from16 v1, p16

    iput-object v1, v0, LC/c$a;->p:Lmh/r;

    move/from16 v1, p17

    iput v1, v0, LC/c$a;->q:I

    move/from16 v1, p18

    iput v1, v0, LC/c$a;->r:I

    move/from16 v1, p19

    iput v1, v0, LC/c$a;->s:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    iget-object v1, v0, LC/c$a;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LC/c$a;->b:LC/C;

    iget-object v3, v0, LC/c$a;->c:Lz/N;

    iget-boolean v4, v0, LC/c$a;->d:Z

    iget-object v5, v0, LC/c$a;->e:Lw/q;

    iget-object v6, v0, LC/c$a;->f:Lw/C;

    iget-boolean v7, v0, LC/c$a;->g:Z

    iget v8, v0, LC/c$a;->h:I

    iget v9, v0, LC/c$a;->i:F

    iget-object v10, v0, LC/c$a;->j:LC/g;

    iget-object v11, v0, LC/c$a;->k:Lx0/a;

    iget-object v12, v0, LC/c$a;->l:Lmh/l;

    iget-object v13, v0, LC/c$a;->m:Lf0/c$b;

    iget-object v14, v0, LC/c$a;->n:Lf0/c$c;

    iget-object v15, v0, LC/c$a;->o:Lx/j;

    move-object/from16 p1, v1

    iget-object v1, v0, LC/c$a;->p:Lmh/r;

    move-object/from16 v16, v1

    iget v1, v0, LC/c$a;->q:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v18

    iget v1, v0, LC/c$a;->r:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v19

    iget v1, v0, LC/c$a;->s:I

    move/from16 v20, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v20}, LC/c;->a(Landroidx/compose/ui/e;LC/C;Lz/N;ZLw/q;Lw/C;ZIFLC/g;Lx0/a;Lmh/l;Lf0/c$b;Lf0/c$c;Lx/j;Lmh/r;LT/l;III)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LC/c$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
