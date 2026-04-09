.class final LN/O0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lm0/i1;

.field final synthetic c:J

.field final synthetic d:J

.field final synthetic e:Ls/g;

.field final synthetic f:F

.field final synthetic g:Lmh/p;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;II)V
    .locals 0

    iput-object p1, p0, LN/O0$b;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LN/O0$b;->b:Lm0/i1;

    iput-wide p3, p0, LN/O0$b;->c:J

    iput-wide p5, p0, LN/O0$b;->d:J

    iput-object p7, p0, LN/O0$b;->e:Ls/g;

    iput p8, p0, LN/O0$b;->f:F

    iput-object p9, p0, LN/O0$b;->g:Lmh/p;

    iput p10, p0, LN/O0$b;->h:I

    iput p11, p0, LN/O0$b;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 12

    iget-object v0, p0, LN/O0$b;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LN/O0$b;->b:Lm0/i1;

    iget-wide v2, p0, LN/O0$b;->c:J

    iget-wide v4, p0, LN/O0$b;->d:J

    iget-object v6, p0, LN/O0$b;->e:Ls/g;

    iget v7, p0, LN/O0$b;->f:F

    iget-object v8, p0, LN/O0$b;->g:Lmh/p;

    iget p2, p0, LN/O0$b;->h:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v10

    iget v11, p0, LN/O0$b;->i:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/O0$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
