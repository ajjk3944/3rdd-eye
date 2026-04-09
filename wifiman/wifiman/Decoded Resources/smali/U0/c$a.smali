.class final LU0/c$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU0/c;->m(Landroid/text/Spannable;LL0/U;Ljava/util/List;Lmh/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/text/Spannable;

.field final synthetic b:Lmh/r;


# direct methods
.method constructor <init>(Landroid/text/Spannable;Lmh/r;)V
    .locals 0

    iput-object p1, p0, LU0/c$a;->a:Landroid/text/Spannable;

    iput-object p2, p0, LU0/c$a;->b:Lmh/r;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL0/D;II)V
    .locals 6

    iget-object v0, p0, LU0/c$a;->a:Landroid/text/Spannable;

    new-instance v1, LO0/o;

    iget-object v2, p0, LU0/c$a;->b:Lmh/r;

    invoke-virtual {p1}, LL0/D;->i()LQ0/k;

    move-result-object v3

    invoke-virtual {p1}, LL0/D;->n()LQ0/A;

    move-result-object v4

    if-nez v4, :cond_0

    sget-object v4, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v4}, LQ0/A$a;->e()LQ0/A;

    move-result-object v4

    :cond_0
    invoke-virtual {p1}, LL0/D;->l()LQ0/v;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, LQ0/v;->i()I

    move-result v5

    goto :goto_0

    :cond_1
    sget-object v5, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {v5}, LQ0/v$a;->b()I

    move-result v5

    :goto_0
    invoke-static {v5}, LQ0/v;->c(I)LQ0/v;

    move-result-object v5

    invoke-virtual {p1}, LL0/D;->m()LQ0/w;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LQ0/w;->m()I

    move-result p1

    goto :goto_1

    :cond_2
    sget-object p1, LQ0/w;->b:LQ0/w$a;

    invoke-virtual {p1}, LQ0/w$a;->a()I

    move-result p1

    :goto_1
    invoke-static {p1}, LQ0/w;->e(I)LQ0/w;

    move-result-object p1

    invoke-interface {v2, v3, v4, v5, p1}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    invoke-direct {v1, p1}, LO0/o;-><init>(Landroid/graphics/Typeface;)V

    const/16 p1, 0x21

    invoke-interface {v0, v1, p2, p3, p1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL0/D;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU0/c$a;->a(LL0/D;II)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
