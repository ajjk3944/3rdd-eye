.class public final Lh5;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lej0;


# instance fields
.field public final synthetic a:Li5;


# direct methods
.method public constructor <init>(Li5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5;->a:Li5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lch;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lh5;->a:Li5;

    .line 2
    .line 3
    invoke-virtual {p1}, Li5;->m()Lu5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lh6;

    .line 9
    .line 10
    iget-object v2, v1, Lh6;->p:Landroid/content/Context;

    .line 11
    .line 12
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v2}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, p1, Lch;->i:Lgw3;

    .line 30
    .line 31
    iget-object p1, p1, Lgw3;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Lvq2;

    .line 34
    .line 35
    const-string v1, "androidx:appcompat"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lvq2;->e(Ljava/lang/String;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lu5;->c()V

    .line 41
    .line 42
    .line 43
    return-void
.end method
