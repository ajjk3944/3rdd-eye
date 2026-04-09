.class final Lv/k$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/k;->c(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/q;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:Lmh/l;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/e;Lmh/l;II)V
    .locals 0

    iput-object p1, p0, Lv/k$d;->a:Landroidx/compose/ui/window/q;

    iput-object p2, p0, Lv/k$d;->b:Lmh/a;

    iput-object p3, p0, Lv/k$d;->c:Landroidx/compose/ui/e;

    iput-object p4, p0, Lv/k$d;->d:Lmh/l;

    iput p5, p0, Lv/k$d;->e:I

    iput p6, p0, Lv/k$d;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    iget-object v0, p0, Lv/k$d;->a:Landroidx/compose/ui/window/q;

    iget-object v1, p0, Lv/k$d;->b:Lmh/a;

    iget-object v2, p0, Lv/k$d;->c:Landroidx/compose/ui/e;

    iget-object v3, p0, Lv/k$d;->d:Lmh/l;

    iget p2, p0, Lv/k$d;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    iget v6, p0, Lv/k$d;->f:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lv/k;->c(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/e;Lmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lv/k$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
