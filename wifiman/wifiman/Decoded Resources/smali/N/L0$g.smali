.class final LN/L0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->d(LN/H0;Landroidx/compose/ui/e;ZLm0/i1;JJJFLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Z

.field final synthetic c:Lm0/i1;

.field final synthetic d:J

.field final synthetic e:J

.field final synthetic f:J

.field final synthetic g:F

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(LN/H0;Landroidx/compose/ui/e;ZLm0/i1;JJJFII)V
    .locals 0

    iput-object p2, p0, LN/L0$g;->a:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LN/L0$g;->b:Z

    iput-object p4, p0, LN/L0$g;->c:Lm0/i1;

    iput-wide p5, p0, LN/L0$g;->d:J

    iput-wide p7, p0, LN/L0$g;->e:J

    iput-wide p9, p0, LN/L0$g;->f:J

    iput p11, p0, LN/L0$g;->g:F

    iput p12, p0, LN/L0$g;->h:I

    iput p13, p0, LN/L0$g;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    iget-object v2, v0, LN/L0$g;->a:Landroidx/compose/ui/e;

    iget-boolean v3, v0, LN/L0$g;->b:Z

    iget-object v4, v0, LN/L0$g;->c:Lm0/i1;

    iget-wide v5, v0, LN/L0$g;->d:J

    iget-wide v7, v0, LN/L0$g;->e:J

    iget-wide v9, v0, LN/L0$g;->f:J

    iget v11, v0, LN/L0$g;->g:F

    iget v1, v0, LN/L0$g;->h:I

    or-int/lit8 v1, v1, 0x1

    invoke-static {v1}, LT/L0;->a(I)I

    move-result v13

    iget v14, v0, LN/L0$g;->i:I

    const/4 v1, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LN/L0;->d(LN/H0;Landroidx/compose/ui/e;ZLm0/i1;JJJFLT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/L0$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
