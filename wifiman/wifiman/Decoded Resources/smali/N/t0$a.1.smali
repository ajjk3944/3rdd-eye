.class final LN/t0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->a(FLandroidx/compose/ui/e;JFJILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:J

.field final synthetic c:Lo0/k;

.field final synthetic d:J


# direct methods
.method constructor <init>(FJLo0/k;J)V
    .locals 0

    iput p1, p0, LN/t0$a;->a:F

    iput-wide p2, p0, LN/t0$a;->b:J

    iput-object p4, p0, LN/t0$a;->c:Lo0/k;

    iput-wide p5, p0, LN/t0$a;->d:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 8

    iget v0, p0, LN/t0$a;->a:F

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, v0, v1

    iget-wide v0, p0, LN/t0$a;->b:J

    iget-object v2, p0, LN/t0$a;->c:Lo0/k;

    invoke-static {p1, v0, v1, v2}, LN/t0;->l(Lo0/f;JLo0/k;)V

    iget-wide v5, p0, LN/t0$a;->d:J

    iget-object v7, p0, LN/t0$a;->c:Lo0/k;

    const/high16 v3, 0x43870000    # 270.0f

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LN/t0;->m(Lo0/f;FFJLo0/k;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/t0$a;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
