.class public abstract Ltg/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/a0$a;,
        Ltg/a0$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Object;Lkg/n;)Lgg/s;
    .locals 1

    new-instance v0, Ltg/a0$b;

    invoke-direct {v0, p0, p1}, Ltg/a0$b;-><init>(Ljava/lang/Object;Lkg/n;)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lgg/v;Lgg/x;Lkg/n;)Z
    .locals 1

    instance-of v0, p0, Lkg/q;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :try_start_0
    check-cast p0, Lkg/q;

    invoke-interface {p0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-nez p0, :cond_0

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return v0

    :cond_0
    :try_start_1
    invoke-interface {p2, p0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "The mapper returned a null ObservableSource"

    invoke-static {p0, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lgg/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    instance-of p2, p0, Lkg/q;

    if-eqz p2, :cond_2

    :try_start_2
    check-cast p0, Lkg/q;

    invoke-interface {p0}, Lkg/q;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p0, :cond_1

    invoke-static {p1}, Llg/c;->complete(Lgg/x;)V

    return v0

    :cond_1
    new-instance p2, Ltg/a0$a;

    invoke-direct {p2, p1, p0}, Ltg/a0$a;-><init>(Lgg/x;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {p2}, Ltg/a0$a;->run()V

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return v0

    :cond_2
    invoke-interface {p0, p1}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return v0

    :catchall_1
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return v0

    :catchall_2
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Llg/c;->error(Ljava/lang/Throwable;Lgg/x;)V

    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
