.class final Landroidx/compose/ui/viewinterop/e$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/e;->b(Lmh/l;Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/l;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lmh/l;

.field final synthetic d:Lmh/l;

.field final synthetic e:Lmh/l;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Lmh/l;Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/e$g;->a:Lmh/l;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/e$g;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/e$g;->c:Lmh/l;

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/e$g;->d:Lmh/l;

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/e$g;->e:Lmh/l;

    iput p6, p0, Landroidx/compose/ui/viewinterop/e$g;->f:I

    iput p7, p0, Landroidx/compose/ui/viewinterop/e$g;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/e$g;->a:Lmh/l;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/e$g;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/e$g;->c:Lmh/l;

    iget-object v3, p0, Landroidx/compose/ui/viewinterop/e$g;->d:Lmh/l;

    iget-object v4, p0, Landroidx/compose/ui/viewinterop/e$g;->e:Lmh/l;

    iget p2, p0, Landroidx/compose/ui/viewinterop/e$g;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, Landroidx/compose/ui/viewinterop/e$g;->g:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Landroidx/compose/ui/viewinterop/e;->b(Lmh/l;Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/viewinterop/e$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
