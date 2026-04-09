.class final LT0/d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT0/d;-><init>(Ljava/lang/String;LL0/U;Ljava/util/List;Ljava/util/List;LQ0/k$b;LY0/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT0/d;


# direct methods
.method constructor <init>(LT0/d;)V
    .locals 0

    iput-object p1, p0, LT0/d$a;->a:LT0/d;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LQ0/k;LQ0/A;II)Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, LT0/d$a;->a:LT0/d;

    invoke-virtual {v0}, LT0/d;->g()LQ0/k$b;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, LQ0/k$b;->a(LQ0/k;LQ0/A;II)LT/z1;

    move-result-object p1

    instance-of p2, p1, LQ0/U$b;

    if-nez p2, :cond_0

    new-instance p2, LT0/s;

    iget-object p3, p0, LT0/d$a;->a:LT0/d;

    invoke-static {p3}, LT0/d;->d(LT0/d;)LT0/s;

    move-result-object p3

    invoke-direct {p2, p1, p3}, LT0/s;-><init>(LT/z1;LT0/s;)V

    iget-object p1, p0, LT0/d$a;->a:LT0/d;

    invoke-static {p1, p2}, LT0/d;->e(LT0/d;LT0/s;)V

    invoke-virtual {p2}, LT0/s;->a()Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_0
    return-object p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ0/k;

    check-cast p2, LQ0/A;

    check-cast p3, LQ0/v;

    invoke-virtual {p3}, LQ0/v;->i()I

    move-result p3

    check-cast p4, LQ0/w;

    invoke-virtual {p4}, LQ0/w;->m()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LT0/d$a;->a(LQ0/k;LQ0/A;II)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method
