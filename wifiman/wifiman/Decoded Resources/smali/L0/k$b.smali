.class final LL0/k$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL0/k;->x(II)Lm0/U0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/U0;

.field final synthetic b:I

.field final synthetic c:I


# direct methods
.method constructor <init>(Lm0/U0;II)V
    .locals 0

    iput-object p1, p0, LL0/k$b;->a:Lm0/U0;

    iput p2, p0, LL0/k$b;->b:I

    iput p3, p0, LL0/k$b;->c:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/q;)V
    .locals 6

    iget-object v0, p0, LL0/k$b;->a:Lm0/U0;

    iget v1, p0, LL0/k$b;->b:I

    iget v2, p0, LL0/k$b;->c:I

    invoke-virtual {p1}, LL0/q;->e()LL0/p;

    move-result-object v3

    invoke-virtual {p1, v1}, LL0/q;->r(I)I

    move-result v1

    invoke-virtual {p1, v2}, LL0/q;->r(I)I

    move-result v2

    invoke-interface {v3, v1, v2}, LL0/p;->A(II)Lm0/U0;

    move-result-object v1

    invoke-virtual {p1, v1}, LL0/q;->j(Lm0/U0;)Lm0/U0;

    move-result-object v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lm0/U0;->d(Lm0/U0;Lm0/U0;JILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/q;

    invoke-virtual {p0, p1}, LL0/k$b;->a(LL0/q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
