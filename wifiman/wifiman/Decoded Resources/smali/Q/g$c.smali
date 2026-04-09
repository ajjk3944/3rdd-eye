.class final LQ/g$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/g;->P2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/g;


# direct methods
.method constructor <init>(LQ/g;)V
    .locals 0

    iput-object p1, p0, LQ/g$c;->a:LQ/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LQ/g$c;->a:LQ/g;

    invoke-static {}, LQ/o;->a()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ/m;

    if-nez v0, :cond_0

    iget-object v0, p0, LQ/g$c;->a:LQ/g;

    invoke-static {v0}, LQ/g;->M2(LQ/g;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LQ/g$c;->a:LQ/g;

    invoke-static {v0}, LQ/g;->L2(LQ/g;)LE0/j;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, LQ/g$c;->a:LQ/g;

    invoke-static {v0}, LQ/g;->J2(LQ/g;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ/g$c;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
