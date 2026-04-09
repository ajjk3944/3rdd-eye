.class final LN/t0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo0/k;

.field final synthetic c:F

.field final synthetic d:J

.field final synthetic e:LT/z1;

.field final synthetic f:LT/z1;

.field final synthetic g:LT/z1;

.field final synthetic h:LT/z1;


# direct methods
.method constructor <init>(JLo0/k;FJLT/z1;LT/z1;LT/z1;LT/z1;)V
    .locals 0

    iput-wide p1, p0, LN/t0$c;->a:J

    iput-object p3, p0, LN/t0$c;->b:Lo0/k;

    iput p4, p0, LN/t0$c;->c:F

    iput-wide p5, p0, LN/t0$c;->d:J

    iput-object p7, p0, LN/t0$c;->e:LT/z1;

    iput-object p8, p0, LN/t0$c;->f:LT/z1;

    iput-object p9, p0, LN/t0$c;->g:LT/z1;

    iput-object p10, p0, LN/t0$c;->h:LT/z1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 9

    iget-wide v0, p0, LN/t0$c;->a:J

    iget-object v2, p0, LN/t0$c;->b:Lo0/k;

    invoke-static {p1, v0, v1, v2}, LN/t0;->l(Lo0/f;JLo0/k;)V

    iget-object v0, p0, LN/t0$c;->e:LT/z1;

    invoke-static {v0}, LN/t0;->k(LT/z1;)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x43580000    # 216.0f

    mul-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float/2addr v0, v1

    iget-object v1, p0, LN/t0$c;->f:LT/z1;

    invoke-static {v1}, LN/t0;->i(LT/z1;)F

    move-result v1

    iget-object v2, p0, LN/t0$c;->g:LT/z1;

    invoke-static {v2}, LN/t0;->j(LT/z1;)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v1, -0x3d4c0000    # -90.0f

    add-float/2addr v0, v1

    iget-object v1, p0, LN/t0$c;->h:LT/z1;

    invoke-static {v1}, LN/t0;->h(LT/z1;)F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, LN/t0$c;->g:LT/z1;

    invoke-static {v1}, LN/t0;->j(LT/z1;)F

    move-result v1

    add-float v3, v1, v0

    iget v4, p0, LN/t0$c;->c:F

    iget-wide v6, p0, LN/t0$c;->d:J

    iget-object v8, p0, LN/t0$c;->b:Lo0/k;

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LN/t0;->n(Lo0/f;FFFJLo0/k;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/t0$c;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
