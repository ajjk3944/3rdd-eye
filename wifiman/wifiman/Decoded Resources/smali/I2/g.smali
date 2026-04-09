.class public LI2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI2/g$d;,
        LI2/g$c;,
        LI2/g$b;,
        LI2/g$e;,
        LI2/g$a;
    }
.end annotation


# instance fields
.field private final a:LI2/g$d;


# direct methods
.method public constructor <init>(LI2/g$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI2/g;->a:LI2/g$d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;IILC2/g;)LI2/n$a;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, LI2/g;->c(Ljava/io/File;IILC2/g;)LI2/n$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, LI2/g;->d(Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/io/File;IILC2/g;)LI2/n$a;
    .locals 1

    new-instance p2, LI2/n$a;

    new-instance p3, LV2/b;

    invoke-direct {p3, p1}, LV2/b;-><init>(Ljava/lang/Object;)V

    new-instance p4, LI2/g$c;

    iget-object v0, p0, LI2/g;->a:LI2/g$d;

    invoke-direct {p4, p1, v0}, LI2/g$c;-><init>(Ljava/io/File;LI2/g$d;)V

    invoke-direct {p2, p3, p4}, LI2/n$a;-><init>(LC2/e;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method

.method public d(Ljava/io/File;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
