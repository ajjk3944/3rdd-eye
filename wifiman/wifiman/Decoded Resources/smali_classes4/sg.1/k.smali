.class abstract Lsg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a(Ljava/lang/Object;Lkg/n;Lgg/d;)Z
    .locals 1

    instance-of v0, p0, Lkg/q;

    if-eqz v0, :cond_2

    check-cast p0, Lkg/q;

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "The mapper returned a null CompletableSource"

    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lgg/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    invoke-static {p2}, Llg/c;->complete(Lgg/d;)V

    goto :goto_1

    :cond_1
    invoke-interface {p0, p2}, Lgg/f;->e(Lgg/d;)V

    :goto_1
    return v0

    :goto_2
    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p2}, Llg/c;->error(Ljava/lang/Throwable;Lgg/d;)V

    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
