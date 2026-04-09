.class public final LSh/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LSh/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LSh/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lli/N;ZZLjava/lang/Boolean;ZLSh/v;LYh/e;)LSh/x;
    .locals 6

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmMetadataVersion"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    if-eqz p4, :cond_3

    instance-of p2, p1, Lli/N$a;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Lli/N$a;

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object v1

    sget-object v2, LUh/c$c;->INTERFACE:LUh/c$c;

    if-ne v1, v2, :cond_0

    invoke-virtual {p2}, Lli/N$a;->e()LZh/b;

    move-result-object p1

    const-string p2, "DefaultImpls"

    invoke-static {p2}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p2

    const-string p3, "identifier(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LZh/b;->d(LZh/f;)LZh/b;

    move-result-object p1

    invoke-static {p6, p1, p7}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    instance-of p2, p1, Lli/N$b;

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lli/N;->c()LBh/g0;

    move-result-object p2

    instance-of p4, p2, LSh/r;

    if-eqz p4, :cond_1

    check-cast p2, LSh/r;

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LSh/r;->f()Lgi/d;

    move-result-object p2

    goto :goto_1

    :cond_2
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_4

    sget-object p1, LZh/b;->d:LZh/b$a;

    new-instance p3, LZh/c;

    invoke-virtual {p2}, Lgi/d;->f()Ljava/lang/String;

    move-result-object v0

    const-string p2, "getInternalName(...)"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, LZh/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object p1

    invoke-static {p6, p1, p7}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "isConst should not be null for property (container="

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    if-eqz p3, :cond_8

    instance-of p2, p1, Lli/N$a;

    if-eqz p2, :cond_8

    move-object p2, p1

    check-cast p2, Lli/N$a;

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object p3

    sget-object p4, LUh/c$c;->COMPANION_OBJECT:LUh/c$c;

    if-ne p3, p4, :cond_8

    invoke-virtual {p2}, Lli/N$a;->h()Lli/N$a;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object p3

    sget-object p4, LUh/c$c;->CLASS:LUh/c$c;

    if-eq p3, p4, :cond_5

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object p3

    sget-object p4, LUh/c$c;->ENUM_CLASS:LUh/c$c;

    if-eq p3, p4, :cond_5

    if-eqz p5, :cond_8

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object p3

    sget-object p4, LUh/c$c;->INTERFACE:LUh/c$c;

    if-eq p3, p4, :cond_5

    invoke-virtual {p2}, Lli/N$a;->g()LUh/c$c;

    move-result-object p3

    sget-object p4, LUh/c$c;->ANNOTATION_CLASS:LUh/c$c;

    if-ne p3, p4, :cond_8

    :cond_5
    invoke-virtual {p2}, Lli/N;->c()LBh/g0;

    move-result-object p1

    instance-of p2, p1, LSh/z;

    if-eqz p2, :cond_6

    check-cast p1, LSh/z;

    goto :goto_2

    :cond_6
    move-object p1, v0

    :goto_2
    if-eqz p1, :cond_7

    invoke-virtual {p1}, LSh/z;->d()LSh/x;

    move-result-object v0

    :cond_7
    return-object v0

    :cond_8
    instance-of p2, p1, Lli/N$b;

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lli/N;->c()LBh/g0;

    move-result-object p2

    instance-of p2, p2, LSh/r;

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lli/N;->c()LBh/g0;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LSh/r;

    invoke-virtual {p1}, LSh/r;->g()LSh/x;

    move-result-object p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, LSh/r;->d()LZh/b;

    move-result-object p1

    invoke-static {p6, p1, p7}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object p2

    :cond_9
    return-object p2

    :cond_a
    return-object v0
.end method
