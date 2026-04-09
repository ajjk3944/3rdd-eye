.class final LN/j0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/j0;->d(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Lz/N;

.field final synthetic e:Ly/m;

.field final synthetic f:Lmh/q;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, LN/j0$g;->a:Lmh/a;

    iput-object p2, p0, LN/j0$g;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LN/j0$g;->c:Z

    iput-object p4, p0, LN/j0$g;->d:Lz/N;

    iput-object p5, p0, LN/j0$g;->e:Ly/m;

    iput-object p6, p0, LN/j0$g;->f:Lmh/q;

    iput p7, p0, LN/j0$g;->g:I

    iput p8, p0, LN/j0$g;->h:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 9

    iget-object v0, p0, LN/j0$g;->a:Lmh/a;

    iget-object v1, p0, LN/j0$g;->b:Landroidx/compose/ui/e;

    iget-boolean v2, p0, LN/j0$g;->c:Z

    iget-object v3, p0, LN/j0$g;->d:Lz/N;

    iget-object v4, p0, LN/j0$g;->e:Ly/m;

    iget-object v5, p0, LN/j0$g;->f:Lmh/q;

    iget p2, p0, LN/j0$g;->g:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v7

    iget v8, p0, LN/j0$g;->h:I

    move-object v6, p1

    invoke-static/range {v0 .. v8}, LN/j0;->d(Lmh/a;Landroidx/compose/ui/e;ZLz/N;Ly/m;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/j0$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
