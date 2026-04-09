.class final LE0/c0$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/c0;-><init>(LE0/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/c0;


# direct methods
.method constructor <init>(LE0/c0;)V
    .locals 0

    iput-object p1, p0, LE0/c0$g;->a:LE0/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/n0;Lp0/c;)V
    .locals 5

    iget-object v0, p0, LE0/c0$g;->a:LE0/c0;

    invoke-virtual {v0}, LE0/c0;->G1()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LE0/c0$g;->a:LE0/c0;

    invoke-static {v0}, LE0/c0;->d2(LE0/c0;)LE0/o0;

    move-result-object v0

    iget-object v1, p0, LE0/c0$g;->a:LE0/c0;

    invoke-static {}, LE0/c0;->a2()Lmh/l;

    move-result-object v2

    new-instance v3, LE0/c0$g$a;

    iget-object v4, p0, LE0/c0$g;->a:LE0/c0;

    invoke-direct {v3, v4, p1, p2}, LE0/c0$g$a;-><init>(LE0/c0;Lm0/n0;Lp0/c;)V

    invoke-virtual {v0, v1, v2, v3}, LE0/o0;->i(LE0/n0;Lmh/l;Lmh/a;)V

    iget-object p1, p0, LE0/c0$g;->a:LE0/c0;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LE0/c0;->i2(LE0/c0;Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LE0/c0$g;->a:LE0/c0;

    const/4 p2, 0x1

    invoke-static {p1, p2}, LE0/c0;->i2(LE0/c0;Z)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/n0;

    check-cast p2, Lp0/c;

    invoke-virtual {p0, p1, p2}, LE0/c0$g;->a(Lm0/n0;Lp0/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
