.class public final synthetic LBe/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# instance fields
.field public final synthetic a:Landroidx/compose/ui/e;

.field public final synthetic b:LJ9/a;

.field public final synthetic c:Lmh/a;

.field public final synthetic d:LBe/V;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe/Y;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LBe/Y;->b:LJ9/a;

    iput-object p3, p0, LBe/Y;->c:Lmh/a;

    iput-object p4, p0, LBe/Y;->d:LBe/V;

    iput p5, p0, LBe/Y;->e:I

    iput p6, p0, LBe/Y;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, LBe/Y;->a:Landroidx/compose/ui/e;

    iget-object v1, p0, LBe/Y;->b:LJ9/a;

    iget-object v2, p0, LBe/Y;->c:Lmh/a;

    iget-object v3, p0, LBe/Y;->d:LBe/V;

    iget v4, p0, LBe/Y;->e:I

    iget v5, p0, LBe/Y;->f:I

    move-object v6, p1

    check-cast v6, LT/l;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, LBe/a0;->b(Landroidx/compose/ui/e;LJ9/a;Lmh/a;LBe/V;IILT/l;I)LYg/J;

    move-result-object p1

    return-object p1
.end method
