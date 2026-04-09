.class final LN/X$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/X;->a(Lmh/p;Lmh/a;Landroidx/compose/ui/e;Lmh/p;Ly/m;Lm0/i1;JJLN/V;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Lmh/p;

.field final synthetic e:Ly/m;

.field final synthetic f:Lm0/i1;

.field final synthetic g:J

.field final synthetic h:J

.field final synthetic i:LN/V;

.field final synthetic j:I

.field final synthetic k:I


# direct methods
.method constructor <init>(Lmh/p;Lmh/a;Landroidx/compose/ui/e;Lmh/p;Ly/m;Lm0/i1;JJLN/V;II)V
    .locals 0

    iput-object p1, p0, LN/X$b;->a:Lmh/p;

    iput-object p2, p0, LN/X$b;->b:Lmh/a;

    iput-object p3, p0, LN/X$b;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, LN/X$b;->d:Lmh/p;

    iput-object p5, p0, LN/X$b;->e:Ly/m;

    iput-object p6, p0, LN/X$b;->f:Lm0/i1;

    iput-wide p7, p0, LN/X$b;->g:J

    iput-wide p9, p0, LN/X$b;->h:J

    iput-object p11, p0, LN/X$b;->i:LN/V;

    iput p12, p0, LN/X$b;->j:I

    iput p13, p0, LN/X$b;->k:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LN/X$b;->a:Lmh/p;

    iget-object v2, v0, LN/X$b;->b:Lmh/a;

    iget-object v3, v0, LN/X$b;->c:Landroidx/compose/ui/e;

    iget-object v4, v0, LN/X$b;->d:Lmh/p;

    iget-object v5, v0, LN/X$b;->e:Ly/m;

    iget-object v6, v0, LN/X$b;->f:Lm0/i1;

    iget-wide v7, v0, LN/X$b;->g:J

    iget-wide v9, v0, LN/X$b;->h:J

    iget-object v11, v0, LN/X$b;->i:LN/V;

    iget v12, v0, LN/X$b;->j:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, LT/L0;->a(I)I

    move-result v13

    iget v14, v0, LN/X$b;->k:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LN/X;->a(Lmh/p;Lmh/a;Landroidx/compose/ui/e;Lmh/p;Ly/m;Lm0/i1;JJLN/V;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/X$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
