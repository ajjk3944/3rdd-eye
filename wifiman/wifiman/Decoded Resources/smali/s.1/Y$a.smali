.class final Ls/Y$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/Y;->b(Landroidx/compose/ui/e;FLsh/e;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lsh/e;

.field final synthetic c:I


# direct methods
.method constructor <init>(FLsh/e;I)V
    .locals 0

    iput p1, p0, Ls/Y$a;->a:F

    iput-object p2, p0, Ls/Y$a;->b:Lsh/e;

    iput p3, p0, Ls/Y$a;->c:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 4

    new-instance v0, LJ0/f;

    iget v1, p0, Ls/Y$a;->a:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, p0, Ls/Y$a;->b:Lsh/e;

    invoke-static {v1, v2}, Lsh/m;->o(Ljava/lang/Comparable;Lsh/e;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget-object v2, p0, Ls/Y$a;->b:Lsh/e;

    iget v3, p0, Ls/Y$a;->c:I

    invoke-direct {v0, v1, v2, v3}, LJ0/f;-><init>(FLsh/e;I)V

    invoke-static {p1, v0}, LJ0/t;->h0(LJ0/w;LJ0/f;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, Ls/Y$a;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
