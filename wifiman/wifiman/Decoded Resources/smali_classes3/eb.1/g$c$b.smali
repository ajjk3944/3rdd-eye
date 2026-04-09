.class public abstract Leb/g$c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/g$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public static synthetic a(Leb/g$c;Ljava/lang/String;ZJ)Lgg/D;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leb/g$c$b;->d(Leb/g$c;Ljava/lang/String;ZJ)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static b(Leb/g$c;Ljava/lang/String;ZJ)Lgg/z;
    .locals 7

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/h;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-wide v5, p3

    invoke-direct/range {v1 .. v6}, Leb/h;-><init>(Leb/g$c;Ljava/lang/String;ZJ)V

    invoke-static {v0}, Lgg/z;->j(Lkg/q;)Lgg/z;

    move-result-object p0

    const-string/jumbo p1, "defer(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic c(Leb/g$c;Ljava/lang/String;ZJILjava/lang/Object;)Lgg/z;
    .locals 0

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const-wide/16 p3, 0x1e

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Leb/g$c;->a(Ljava/lang/String;ZJ)Lgg/z;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: observableWebSocket"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static d(Leb/g$c;Ljava/lang/String;ZJ)Lgg/D;
    .locals 6

    sget-object v0, Leb/m;->i:Leb/m$a;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Leb/m$a;->a(Leb/o;Ljava/lang/String;ZJ)Lgg/z;

    move-result-object p0

    return-object p0
.end method
