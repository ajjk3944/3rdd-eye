.class public abstract Lh5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh5/d$a;
    }
.end annotation


# static fields
.field public static a:Lh5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lh5/d;->a()Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lh5/d$a;->a()Lh5/d;

    move-result-object v0

    sput-object v0, Lh5/d;->a:Lh5/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lh5/d$a;
    .locals 4

    new-instance v0, Lh5/a$b;

    invoke-direct {v0}, Lh5/a$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lh5/a$b;->h(J)Lh5/d$a;

    move-result-object v0

    sget-object v3, Lh5/c$a;->ATTEMPT_MIGRATION:Lh5/c$a;

    invoke-virtual {v0, v3}, Lh5/d$a;->g(Lh5/c$a;)Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lh5/d$a;->c(J)Lh5/d$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()J
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract g()Lh5/c$a;
.end method

.method public abstract h()J
.end method

.method public i()Z
    .locals 2

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->REGISTER_ERROR:Lh5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->NOT_GENERATED:Lh5/c$a;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->ATTEMPT_MIGRATION:Lh5/c$a;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->REGISTERED:Lh5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->UNREGISTERED:Lh5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lh5/d;->g()Lh5/c$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->ATTEMPT_MIGRATION:Lh5/c$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract n()Lh5/d$a;
.end method

.method public o(Ljava/lang/String;JJ)Lh5/d;
    .locals 1

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh5/d$a;->b(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Lh5/d$a;->c(J)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p4, p5}, Lh5/d$a;->h(J)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lh5/d$a;->a()Lh5/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Lh5/d;
    .locals 2

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh5/d$a;->b(Ljava/lang/String;)Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lh5/d$a;->a()Lh5/d;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;)Lh5/d;
    .locals 1

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh5/d$a;->e(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    sget-object v0, Lh5/c$a;->REGISTER_ERROR:Lh5/c$a;

    invoke-virtual {p1, v0}, Lh5/d$a;->g(Lh5/c$a;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lh5/d$a;->a()Lh5/d;

    move-result-object p1

    return-object p1
.end method

.method public r()Lh5/d;
    .locals 2

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    sget-object v1, Lh5/c$a;->NOT_GENERATED:Lh5/c$a;

    invoke-virtual {v0, v1}, Lh5/d$a;->g(Lh5/c$a;)Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lh5/d$a;->a()Lh5/d;

    move-result-object v0

    return-object v0
.end method

.method public s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)Lh5/d;
    .locals 1

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh5/d$a;->d(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    sget-object v0, Lh5/c$a;->REGISTERED:Lh5/c$a;

    invoke-virtual {p1, v0}, Lh5/d$a;->g(Lh5/c$a;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p5}, Lh5/d$a;->b(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lh5/d$a;->f(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p6, p7}, Lh5/d$a;->c(J)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lh5/d$a;->h(J)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lh5/d$a;->a()Lh5/d;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lh5/d;
    .locals 1

    invoke-virtual {p0}, Lh5/d;->n()Lh5/d$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lh5/d$a;->d(Ljava/lang/String;)Lh5/d$a;

    move-result-object p1

    sget-object v0, Lh5/c$a;->UNREGISTERED:Lh5/c$a;

    invoke-virtual {p1, v0}, Lh5/d$a;->g(Lh5/c$a;)Lh5/d$a;

    move-result-object p1

    invoke-virtual {p1}, Lh5/d$a;->a()Lh5/d;

    move-result-object p1

    return-object p1
.end method
