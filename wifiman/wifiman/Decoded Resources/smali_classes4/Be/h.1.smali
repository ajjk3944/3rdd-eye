.class public final synthetic LBe/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:F

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;FJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/h;->a:Landroidx/compose/ui/e;

    iput p2, p0, LBe/h;->b:F

    iput-wide p3, p0, LBe/h;->c:J

    iput p5, p0, LBe/h;->d:I

    iput p6, p0, LBe/h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LBe/h;->a:Landroidx/compose/ui/e;

    iget v1, p0, LBe/h;->b:F

    iget-wide v2, p0, LBe/h;->c:J

    iget v4, p0, LBe/h;->d:I

    iget v5, p0, LBe/h;->e:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LBe/i;->a(Landroidx/compose/ui/e;FJIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
