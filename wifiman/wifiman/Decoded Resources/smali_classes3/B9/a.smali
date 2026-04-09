.class public abstract LB9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LA/y;Ljava/util/List;Lmh/l;Lmh/l;ZZLmh/q;Lmh/q;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "itemId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "actionContent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "itemContent"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-instance v0, LB9/a$b;

    invoke-direct {v0, p5, p4, p6, p7}, LB9/a$b;-><init>(ZZLmh/q;Lmh/q;)V

    const p4, -0x7a902fad

    const/4 p5, 0x1

    invoke-static {p4, p5, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p4

    invoke-interface {p0, p1, p2, p3, p4}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    return-void
.end method

.method public static synthetic b(LA/y;Ljava/util/List;Lmh/l;Lmh/l;ZZLmh/q;Lmh/q;ILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    sget-object v0, LB9/a$a;->a:LB9/a$a;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    move v6, v0

    goto :goto_1

    :cond_1
    move v6, p5

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p4

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, LB9/a;->a(LA/y;Ljava/util/List;Lmh/l;Lmh/l;ZZLmh/q;Lmh/q;)V

    return-void
.end method
