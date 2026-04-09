.class public final synthetic LBe/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:Z

.field public final synthetic c:Lmh/a;

.field public final synthetic d:Lmh/q;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/o0;->a:Landroidx/compose/ui/e;

    iput-boolean p2, p0, LBe/o0;->b:Z

    iput-object p3, p0, LBe/o0;->c:Lmh/a;

    iput-object p4, p0, LBe/o0;->d:Lmh/q;

    iput p5, p0, LBe/o0;->e:I

    iput p6, p0, LBe/o0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LBe/o0;->a:Landroidx/compose/ui/e;

    iget-boolean v1, p0, LBe/o0;->b:Z

    iget-object v2, p0, LBe/o0;->c:Lmh/a;

    iget-object v3, p0, LBe/o0;->d:Lmh/q;

    iget v4, p0, LBe/o0;->e:I

    iget v5, p0, LBe/o0;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LBe/s0;->c(Landroidx/compose/ui/e;ZLmh/a;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
