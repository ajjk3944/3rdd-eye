.class final LN/L0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->c(Landroidx/compose/ui/e;Lmh/p;ZLm0/i1;JJFLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/p;

.field final synthetic c:Z

.field final synthetic d:Lm0/i1;

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:F

.field final synthetic h:Lmh/p;

.field final synthetic i:I

.field final synthetic j:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/p;ZLm0/i1;JJFLmh/p;II)V
    .locals 0

    iput-object p1, p0, LN/L0$e;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LN/L0$e;->b:Lmh/p;

    iput-boolean p3, p0, LN/L0$e;->c:Z

    iput-object p4, p0, LN/L0$e;->d:Lm0/i1;

    iput-wide p5, p0, LN/L0$e;->e:J

    iput-wide p7, p0, LN/L0$e;->f:J

    iput p9, p0, LN/L0$e;->g:F

    iput-object p10, p0, LN/L0$e;->h:Lmh/p;

    iput p11, p0, LN/L0$e;->i:I

    iput p12, p0, LN/L0$e;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 13

    iget-object v0, p0, LN/L0$e;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LN/L0$e;->b:Lmh/p;

    iget-boolean v2, p0, LN/L0$e;->c:Z

    iget-object v3, p0, LN/L0$e;->d:Lm0/i1;

    iget-wide v4, p0, LN/L0$e;->e:J

    iget-wide v6, p0, LN/L0$e;->f:J

    iget v8, p0, LN/L0$e;->g:F

    iget-object v9, p0, LN/L0$e;->h:Lmh/p;

    iget p2, p0, LN/L0$e;->i:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v11

    iget v12, p0, LN/L0$e;->j:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LN/L0;->c(Landroidx/compose/ui/e;Lmh/p;ZLm0/i1;JJFLmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/L0$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
