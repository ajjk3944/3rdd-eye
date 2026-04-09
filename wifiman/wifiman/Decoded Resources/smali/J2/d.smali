.class public final LJ2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ2/d$d;,
        LJ2/d$a;,
        LJ2/d$b;,
        LJ2/d$c;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LI2/n;

.field private final c:LI2/n;

.field private final d:Ljava/lang/Class;


# direct methods
.method constructor <init>(Landroid/content/Context;LI2/n;LI2/n;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LJ2/d;->a:Landroid/content/Context;

    iput-object p2, p0, LJ2/d;->b:LI2/n;

    iput-object p3, p0, LJ2/d;->c:LI2/n;

    iput-object p4, p0, LJ2/d;->d:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, LJ2/d;->c(Landroid/net/Uri;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, LJ2/d;->d(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method

.method public c(Landroid/net/Uri;IILC2/g;)LI2/n$a;
    .locals 13

    move-object v0, p0

    new-instance v1, LI2/n$a;

    new-instance v2, LV2/b;

    move-object v7, p1

    invoke-direct {v2, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance v12, LJ2/d$d;

    iget-object v4, v0, LJ2/d;->a:Landroid/content/Context;

    iget-object v5, v0, LJ2/d;->b:LI2/n;

    iget-object v6, v0, LJ2/d;->c:LI2/n;

    iget-object v11, v0, LJ2/d;->d:Ljava/lang/Class;

    move-object v3, v12

    move v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p4

    invoke-direct/range {v3 .. v11}, LJ2/d$d;-><init>(Landroid/content/Context;LI2/n;LI2/n;Landroid/net/Uri;IILC2/g;Ljava/lang/Class;)V

    invoke-direct {v1, v2, v12}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object v1
.end method

.method public d(Landroid/net/Uri;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p1}, LD2/b;->c(Landroid/net/Uri;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
