.class final Lg2/l$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg2/l;->a(Landroid/content/Context;)Lc0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lg2/l$b;->a:Landroid/content/Context;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)Lf2/w;
    .locals 1

    iget-object v0, p0, Lg2/l$b;->a:Landroid/content/Context;

    invoke-static {v0}, Lg2/l;->b(Landroid/content/Context;)Lf2/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lf2/n;->n0(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Lg2/l$b;->a(Landroid/os/Bundle;)Lf2/w;

    move-result-object p1

    return-object p1
.end method
