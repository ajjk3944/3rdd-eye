.class public LN2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC2/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;LC2/g;)Z
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, LN2/a;->d(Ljava/io/File;LC2/g;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILC2/g;)LE2/c;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, LN2/a;->c(Ljava/io/File;IILC2/g;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/File;IILC2/g;)LE2/c;
    .locals 0

    new-instance p2, LN2/b;

    invoke-direct {p2, p1}, LN2/b;-><init>(Ljava/io/File;)V

    return-object p2
.end method

.method public d(Ljava/io/File;LC2/g;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
