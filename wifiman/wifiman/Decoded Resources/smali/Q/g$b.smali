.class final LQ/g$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/g;->N2()V
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

    iput-object p1, p0, LQ/g$b;->a:LQ/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LP/g;
    .locals 2

    iget-object v0, p0, LQ/g$b;->a:LQ/g;

    invoke-static {}, LQ/o;->a()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQ/m;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LQ/m;->b()LP/g;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, LQ/n;->a:LQ/n;

    invoke-virtual {v0}, LQ/n;->a()LP/g;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ/g$b;->a()LP/g;

    move-result-object v0

    return-object v0
.end method
