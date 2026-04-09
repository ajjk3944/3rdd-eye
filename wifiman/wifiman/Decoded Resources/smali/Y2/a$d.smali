.class final LY2/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY2/a;->b(LY2/b;ILandroidx/compose/ui/e;Lmh/l;JJFFFLm0/i1;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:LY2/b;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lmh/l;LY2/b;III)V
    .locals 0

    iput-object p1, p0, LY2/a$d;->a:Lmh/l;

    iput-object p2, p0, LY2/a$d;->b:LY2/b;

    iput p3, p0, LY2/a$d;->c:I

    iput p4, p0, LY2/a$d;->d:I

    iput p5, p0, LY2/a$d;->e:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LY0/d;)J
    .locals 4

    const-string v0, "$this$offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LY2/a$d;->a:Lmh/l;

    iget-object v0, p0, LY2/a$d;->b:LY2/b;

    invoke-interface {v0}, LY2/b;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, LY2/a$d;->b:LY2/b;

    invoke-interface {v0}, LY2/b;->b()F

    move-result v0

    iget-object v1, p0, LY2/a$d;->a:Lmh/l;

    iget-object v2, p0, LY2/a$d;->b:LY2/b;

    invoke-interface {v2}, LY2/b;->a()I

    move-result v2

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr v1, p1

    int-to-float v1, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    mul-float/2addr v1, v0

    int-to-float p1, p1

    add-float/2addr v1, p1

    iget p1, p0, LY2/a$d;->c:I

    add-int/lit8 p1, p1, -0x1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lsh/m;->d(II)I

    move-result p1

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-static {v1, v2, p1}, Lsh/m;->j(FFF)F

    move-result p1

    iget v1, p0, LY2/a$d;->d:I

    iget v2, p0, LY2/a$d;->e:I

    add-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int p1, v1

    invoke-static {p1, v0}, LY0/o;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/d;

    invoke-virtual {p0, p1}, LY2/a$d;->a(LY0/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->b(J)LY0/n;

    move-result-object p1

    return-object p1
.end method
