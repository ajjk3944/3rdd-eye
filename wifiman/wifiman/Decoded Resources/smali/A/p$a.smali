.class final LA/p$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/p;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZZLw/n;ZILf0/c$b;Lz/c$m;Lf0/c$c;Lz/c$e;Lmh/l;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LA/B;

.field final synthetic c:Lz/N;

.field final synthetic d:Z

.field final synthetic e:Z

.field final synthetic f:Lw/n;

.field final synthetic g:Z

.field final synthetic h:I

.field final synthetic i:Lf0/c$b;

.field final synthetic j:Lz/c$m;

.field final synthetic k:Lf0/c$c;

.field final synthetic l:Lz/c$e;

.field final synthetic m:Lmh/l;

.field final synthetic n:I

.field final synthetic o:I

.field final synthetic p:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LA/B;Lz/N;ZZLw/n;ZILf0/c$b;Lz/c$m;Lf0/c$c;Lz/c$e;Lmh/l;III)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LA/p$a;->a:Landroidx/compose/ui/e;

    move-object v1, p2

    iput-object v1, v0, LA/p$a;->b:LA/B;

    move-object v1, p3

    iput-object v1, v0, LA/p$a;->c:Lz/N;

    move v1, p4

    iput-boolean v1, v0, LA/p$a;->d:Z

    move v1, p5

    iput-boolean v1, v0, LA/p$a;->e:Z

    move-object v1, p6

    iput-object v1, v0, LA/p$a;->f:Lw/n;

    move v1, p7

    iput-boolean v1, v0, LA/p$a;->g:Z

    move v1, p8

    iput v1, v0, LA/p$a;->h:I

    move-object v1, p9

    iput-object v1, v0, LA/p$a;->i:Lf0/c$b;

    move-object v1, p10

    iput-object v1, v0, LA/p$a;->j:Lz/c$m;

    move-object v1, p11

    iput-object v1, v0, LA/p$a;->k:Lf0/c$c;

    move-object v1, p12

    iput-object v1, v0, LA/p$a;->l:Lz/c$e;

    move-object v1, p13

    iput-object v1, v0, LA/p$a;->m:Lmh/l;

    move/from16 v1, p14

    iput v1, v0, LA/p$a;->n:I

    move/from16 v1, p15

    iput v1, v0, LA/p$a;->o:I

    move/from16 v1, p16

    iput v1, v0, LA/p$a;->p:I

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    iget-object v1, v0, LA/p$a;->a:Landroidx/compose/ui/e;

    iget-object v2, v0, LA/p$a;->b:LA/B;

    iget-object v3, v0, LA/p$a;->c:Lz/N;

    iget-boolean v4, v0, LA/p$a;->d:Z

    iget-boolean v5, v0, LA/p$a;->e:Z

    iget-object v6, v0, LA/p$a;->f:Lw/n;

    iget-boolean v7, v0, LA/p$a;->g:Z

    iget v8, v0, LA/p$a;->h:I

    iget-object v9, v0, LA/p$a;->i:Lf0/c$b;

    iget-object v10, v0, LA/p$a;->j:Lz/c$m;

    iget-object v11, v0, LA/p$a;->k:Lf0/c$c;

    iget-object v12, v0, LA/p$a;->l:Lz/c$e;

    iget-object v13, v0, LA/p$a;->m:Lmh/l;

    iget v15, v0, LA/p$a;->n:I

    or-int/lit8 v15, v15, 0x1

    invoke-static {v15}, LT/L0;->a(I)I

    move-result v15

    move-object/from16 p1, v1

    iget v1, v0, LA/p$a;->o:I

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v16

    iget v1, v0, LA/p$a;->p:I

    move/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, LA/p;->a(Landroidx/compose/ui/e;LA/B;Lz/N;ZZLw/n;ZILf0/c$b;Lz/c$m;Lf0/c$c;Lz/c$e;Lmh/l;LT/l;III)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LA/p$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
