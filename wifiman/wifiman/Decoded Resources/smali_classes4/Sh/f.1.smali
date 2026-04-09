.class public abstract LSh/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LUh/n;LWh/c;LWh/g;ZZZ)LSh/A;
    .locals 2

    const-string v0, "proto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LXh/a;->d:Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;

    const-string v1, "propertySignature"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, LWh/e;->a(Lkotlin/reflect/jvm/internal/impl/protobuf/h$d;Lkotlin/reflect/jvm/internal/impl/protobuf/h$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXh/a$d;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p3, :cond_2

    sget-object p3, LYh/i;->a:LYh/i;

    invoke-virtual {p3, p0, p1, p2, p5}, LYh/i;->c(LUh/n;LWh/c;LWh/g;Z)LYh/d$a;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    sget-object p1, LSh/A;->b:LSh/A$a;

    invoke-virtual {p1, p0}, LSh/A$a;->b(LYh/d;)LSh/A;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz p4, :cond_3

    invoke-virtual {v0}, LXh/a$d;->P0()Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, LSh/A;->b:LSh/A$a;

    invoke-virtual {v0}, LXh/a$d;->E0()LXh/a$c;

    move-result-object p2

    const-string p3, "getSyntheticMethod(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LSh/A$a;->c(LWh/c;LXh/a$c;)LSh/A;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v1
.end method

.method public static synthetic b(LUh/n;LWh/c;LWh/g;ZZZILjava/lang/Object;)LSh/A;
    .locals 7

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x20

    if-eqz p3, :cond_2

    const/4 p5, 0x1

    :cond_2
    move v6, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LSh/f;->a(LUh/n;LWh/c;LWh/g;ZZZ)LSh/A;

    move-result-object p0

    return-object p0
.end method
