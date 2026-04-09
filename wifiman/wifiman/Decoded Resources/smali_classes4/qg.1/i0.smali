.class public abstract Lqg/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/i0$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Object;Lkg/n;)Lgg/i;
    .locals 1

    new-instance v0, Lqg/i0$a;

    invoke-direct {v0, p0, p1}, Lqg/i0$a;-><init>(Ljava/lang/Object;Lkg/n;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(LDj/a;LDj/b;Lkg/n;)Z
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

    invoke-static {p1}, Lyg/d;->complete(LDj/b;)V

    return v0

    :cond_0
    :try_start_1
    invoke-interface {p2, p0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "The mapper returned a null Publisher"

    invoke-static {p0, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, LDj/a;
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

    invoke-static {p1}, Lyg/d;->complete(LDj/b;)V

    return v0

    :cond_1
    new-instance p2, Lyg/e;

    invoke-direct {p2, p1, p0}, Lyg/e;-><init>(LDj/b;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, LDj/b;->j(LDj/c;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return v0

    :cond_2
    invoke-interface {p0, p1}, LDj/a;->b(LDj/b;)V

    :goto_0
    return v0

    :catchall_1
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return v0

    :catchall_2
    move-exception p0

    invoke-static {p0}, Lig/a;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Lyg/d;->error(Ljava/lang/Throwable;LDj/b;)V

    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
