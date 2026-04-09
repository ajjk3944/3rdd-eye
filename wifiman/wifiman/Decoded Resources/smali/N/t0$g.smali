.class final LN/t0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/t0;->g(FLandroidx/compose/ui/e;JJILT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:I

.field final synthetic c:F

.field final synthetic d:J


# direct methods
.method constructor <init>(JIFJ)V
    .locals 0

    iput-wide p1, p0, LN/t0$g;->a:J

    iput p3, p0, LN/t0$g;->b:I

    iput p4, p0, LN/t0$g;->c:F

    iput-wide p5, p0, LN/t0$g;->d:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 9

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v7

    iget-wide v0, p0, LN/t0$g;->a:J

    iget v2, p0, LN/t0$g;->b:I

    invoke-static {p1, v0, v1, v7, v2}, LN/t0;->p(Lo0/f;JFI)V

    iget v4, p0, LN/t0$g;->c:F

    iget-wide v5, p0, LN/t0$g;->d:J

    iget v8, p0, LN/t0$g;->b:I

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, LN/t0;->o(Lo0/f;FFJFI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LN/t0$g;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
