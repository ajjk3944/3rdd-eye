.class public final LI2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/f$c;,
        LI2/f$a;,
        LI2/f$b;,
        LI2/f$e;,
        LI2/f$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LI2/f$e;


# direct methods
.method constructor <init>(Landroid/content/Context;LI2/f$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LI2/f;->a:Landroid/content/Context;

    iput-object p2, p0, LI2/f;->b:LI2/f$e;

    return-void
.end method

.method public static c(Landroid/content/Context;)LI2/o;
    .locals 1

    new-instance v0, LI2/f$a;

    invoke-direct {v0, p0}, LI2/f$a;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static e(Landroid/content/Context;)LI2/o;
    .locals 1

    new-instance v0, LI2/f$b;

    invoke-direct {v0, p0}, LI2/f$b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static g(Landroid/content/Context;)LI2/o;
    .locals 1

    new-instance v0, LI2/f$c;

    invoke-direct {v0, p0}, LI2/f$c;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, LI2/f;->d(Ljava/lang/Integer;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, LI2/f;->f(Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Integer;IILC2/g;)LI2/n$a;
    .locals 3

    sget-object p2, LM2/l;->b:LC2/f;

    invoke-virtual {p4, p2}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/res/Resources$Theme;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    goto :goto_0

    :cond_0
    iget-object p3, p0, LI2/f;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    :goto_0
    new-instance p4, LI2/n$a;

    new-instance v0, LV2/b;

    invoke-direct {v0, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance v1, LI2/f$d;

    iget-object v2, p0, LI2/f;->b:LI2/f$e;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v1, p2, p3, v2, p1}, LI2/f$d;-><init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;LI2/f$e;I)V

    invoke-direct {p4, v0, v1}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p4
.end method

.method public f(Ljava/lang/Integer;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
