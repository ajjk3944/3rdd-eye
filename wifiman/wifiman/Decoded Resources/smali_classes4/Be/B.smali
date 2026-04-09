.class public final synthetic LBe/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:LBe/z;

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;IFLBe/z;JII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/B;->a:Landroidx/compose/ui/e;

    iput p2, p0, LBe/B;->b:I

    iput p3, p0, LBe/B;->c:F

    iput-object p4, p0, LBe/B;->d:LBe/z;

    iput-wide p5, p0, LBe/B;->e:J

    iput p7, p0, LBe/B;->f:I

    iput p8, p0, LBe/B;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, LBe/B;->a:Landroidx/compose/ui/e;

    iget v1, p0, LBe/B;->b:I

    iget v2, p0, LBe/B;->c:F

    iget-object v3, p0, LBe/B;->d:LBe/z;

    iget-wide v4, p0, LBe/B;->e:J

    iget v6, p0, LBe/B;->f:I

    iget v7, p0, LBe/B;->g:I

    move-object v8, p1

    check-cast v8, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, LBe/C;->a(Landroidx/compose/ui/e;IFLBe/z;JIILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
