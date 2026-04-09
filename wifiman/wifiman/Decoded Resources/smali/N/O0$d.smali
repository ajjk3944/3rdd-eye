.class final LN/O0$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/O0;->b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Lm0/i1;

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:Ls/g;

.field final synthetic h:F

.field final synthetic i:Ly/m;

.field final synthetic j:Lmh/p;

.field final synthetic k:I

.field final synthetic l:I


# direct methods
.method constructor <init>(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;II)V
    .locals 0

    iput-object p1, p0, LN/O0$d;->a:Lmh/a;

    iput-object p2, p0, LN/O0$d;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LN/O0$d;->c:Z

    iput-object p4, p0, LN/O0$d;->d:Lm0/i1;

    iput-wide p5, p0, LN/O0$d;->e:J

    iput-wide p7, p0, LN/O0$d;->f:J

    iput-object p9, p0, LN/O0$d;->g:Ls/g;

    iput p10, p0, LN/O0$d;->h:F

    iput-object p11, p0, LN/O0$d;->i:Ly/m;

    iput-object p12, p0, LN/O0$d;->j:Lmh/p;

    iput p13, p0, LN/O0$d;->k:I

    iput p14, p0, LN/O0$d;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LN/O0$d;->a:Lmh/a;

    iget-object v2, v0, LN/O0$d;->b:Landroidx/compose/ui/e;

    iget-boolean v3, v0, LN/O0$d;->c:Z

    iget-object v4, v0, LN/O0$d;->d:Lm0/i1;

    iget-wide v5, v0, LN/O0$d;->e:J

    iget-wide v7, v0, LN/O0$d;->f:J

    iget-object v9, v0, LN/O0$d;->g:Ls/g;

    iget v10, v0, LN/O0$d;->h:F

    iget-object v11, v0, LN/O0$d;->i:Ly/m;

    iget-object v12, v0, LN/O0$d;->j:Lmh/p;

    iget v13, v0, LN/O0$d;->k:I

    or-int/lit8 v13, v13, 0x1

    invoke-static {v13}, LT/L0;->a(I)I

    move-result v14

    iget v15, v0, LN/O0$d;->l:I

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, LN/O0;->b(Lmh/a;Landroidx/compose/ui/e;ZLm0/i1;JJLs/g;FLy/m;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/O0$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
