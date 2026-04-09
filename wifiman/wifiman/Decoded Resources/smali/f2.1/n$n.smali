.class final Lf2/n$n;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf2/n;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/n;


# direct methods
.method constructor <init>(Lf2/n;)V
    .locals 0

    iput-object p1, p0, Lf2/n$n;->a:Lf2/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lf2/x;
    .locals 3

    iget-object v0, p0, Lf2/n$n;->a:Lf2/n;

    invoke-static {v0}, Lf2/n;->h(Lf2/n;)Lf2/x;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lf2/x;

    iget-object v1, p0, Lf2/n$n;->a:Lf2/n;

    invoke-virtual {v1}, Lf2/n;->E()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lf2/n$n;->a:Lf2/n;

    invoke-static {v2}, Lf2/n;->m(Lf2/n;)Lf2/E;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lf2/x;-><init>(Landroid/content/Context;Lf2/E;)V

    :cond_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf2/n$n;->a()Lf2/x;

    move-result-object v0

    return-object v0
.end method
