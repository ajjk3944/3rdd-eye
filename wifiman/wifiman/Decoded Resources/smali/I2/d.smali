.class public LI2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/d$a;,
        LI2/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, LI2/d;->c(Ljava/io/File;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, LI2/d;->d(Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/io/File;IILC2/g;)LI2/n$a;
    .locals 0

    new-instance p2, LI2/n$a;

    new-instance p3, LV2/b;

    invoke-direct {p3, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance p4, LI2/d$a;

    invoke-direct {p4, p1}, LI2/d$a;-><init>(Ljava/io/File;)V

    invoke-direct {p2, p3, p4}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public d(Ljava/io/File;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
