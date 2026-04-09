.class public abstract LI5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgg/i;Ljava/lang/Object;)Lgg/i;
    .locals 1

    const-string v0, "$receiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-static {p1}, LI5/a;->e(Ljava/lang/Object;)LI5/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, LI5/a;->f()LI5/a;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lgg/i;->x(Lgg/m;)Lgg/i;

    move-result-object p0

    const-string/jumbo p1, "compose(\n      if (defau\u2026ngShare.instance<T>()\n  )"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static bridge synthetic b(Lgg/i;Ljava/lang/Object;ILjava/lang/Object;)Lgg/i;
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LI5/b;->a(Lgg/i;Ljava/lang/Object;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: replayingShare"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
