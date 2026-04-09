.class public LJ2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/b$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LJ2/b;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, LJ2/b;->c(Landroid/net/Uri;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, LJ2/b;->d(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public c(Landroid/net/Uri;IILC2/g;)LI2/n$a;
    .locals 0

    invoke-static {p2, p3}, LD2/b;->e(II)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LI2/n$a;

    new-instance p3, LV2/b;

    invoke-direct {p3, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    iget-object p4, p0, LJ2/b;->a:Landroid/content/Context;

    invoke-static {p4, p1}, LD2/c;->f(Landroid/content/Context;Landroid/net/Uri;)LD2/c;

    move-result-object p1

    invoke-direct {p2, p3, p1}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 0

    invoke-static {p1}, LD2/b;->b(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
