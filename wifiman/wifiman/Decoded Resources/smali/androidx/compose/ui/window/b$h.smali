.class final Landroidx/compose/ui/window/b$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/window/q;

.field final synthetic b:Lmh/a;

.field final synthetic c:Landroidx/compose/ui/window/r;

.field final synthetic d:Lmh/p;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/window/b$h;->a:Landroidx/compose/ui/window/q;

    iput-object p2, p0, Landroidx/compose/ui/window/b$h;->b:Lmh/a;

    iput-object p3, p0, Landroidx/compose/ui/window/b$h;->c:Landroidx/compose/ui/window/r;

    iput-object p4, p0, Landroidx/compose/ui/window/b$h;->d:Lmh/p;

    iput p5, p0, Landroidx/compose/ui/window/b$h;->e:I

    iput p6, p0, Landroidx/compose/ui/window/b$h;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    iget-object v0, p0, Landroidx/compose/ui/window/b$h;->a:Landroidx/compose/ui/window/q;

    iget-object v1, p0, Landroidx/compose/ui/window/b$h;->b:Lmh/a;

    iget-object v2, p0, Landroidx/compose/ui/window/b$h;->c:Landroidx/compose/ui/window/r;

    iget-object v3, p0, Landroidx/compose/ui/window/b$h;->d:Lmh/p;

    iget p2, p0, Landroidx/compose/ui/window/b$h;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    iget v6, p0, Landroidx/compose/ui/window/b$h;->f:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/window/b$h;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
