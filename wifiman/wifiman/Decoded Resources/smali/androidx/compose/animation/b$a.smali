.class final Landroidx/compose/animation/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/b;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/t;

.field final synthetic b:Landroidx/compose/animation/b;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/t;Landroidx/compose/animation/b;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/b$a;->a:[Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/animation/b$a;->b:Landroidx/compose/animation/b;

    iput p3, p0, Landroidx/compose/animation/b$a;->c:I

    iput p4, p0, Landroidx/compose/animation/b$a;->d:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget-object v0, p0, Landroidx/compose/animation/b$a;->a:[Landroidx/compose/ui/layout/t;

    iget-object v1, p0, Landroidx/compose/animation/b$a;->b:Landroidx/compose/animation/b;

    iget v2, p0, Landroidx/compose/animation/b$a;->c:I

    iget v3, p0, Landroidx/compose/animation/b$a;->d:I

    array-length v4, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v0, v5

    if-eqz v7, :cond_0

    invoke-virtual {v1}, Landroidx/compose/animation/b;->a()Landroidx/compose/animation/e;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/animation/e;->n()Lf0/c;

    move-result-object v8

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v6

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v9

    invoke-static {v6, v9}, LY0/s;->a(II)J

    move-result-wide v9

    invoke-static {v2, v3}, LY0/s;->a(II)J

    move-result-wide v11

    sget-object v13, LY0/t;->Ltr:LY0/t;

    invoke-interface/range {v8 .. v13}, Lf0/c;->a(JJLY0/t;)J

    move-result-wide v8

    invoke-static {v8, v9}, LY0/n;->h(J)I

    move-result v10

    invoke-static {v8, v9}, LY0/n;->i(J)I

    move-result v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, p1

    move v8, v10

    move v10, v13

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/b$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
