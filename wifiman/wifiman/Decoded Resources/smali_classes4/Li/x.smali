.class abstract synthetic LLi/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a()Lmh/a;
    .locals 1

    invoke-static {}, LLi/x;->d()Lmh/a;

    move-result-object v0

    return-object v0
.end method

.method public static final b(LLi/g;LLi/g;LLi/g;LLi/g;Lmh/s;)LLi/g;
    .locals 2

    const/4 v0, 0x4

    new-array v0, v0, [LLi/g;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    const/4 p0, 0x3

    aput-object p3, v0, p0

    new-instance p0, LLi/x$b;

    invoke-direct {p0, v0, p4}, LLi/x$b;-><init>([LLi/g;Lmh/s;)V

    return-object p0
.end method

.method public static final c(LLi/g;LLi/g;LLi/g;Lmh/r;)LLi/g;
    .locals 2

    const/4 v0, 0x3

    new-array v0, v0, [LLi/g;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const/4 p0, 0x2

    aput-object p2, v0, p0

    new-instance p0, LLi/x$a;

    invoke-direct {p0, v0, p3}, LLi/x$a;-><init>([LLi/g;Lmh/r;)V

    return-object p0
.end method

.method private static final d()Lmh/a;
    .locals 1

    sget-object v0, LLi/x$c;->a:LLi/x$c;

    return-object v0
.end method
