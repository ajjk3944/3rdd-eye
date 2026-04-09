.class public abstract LWc/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWc/b$a;,
        LWc/b$b;,
        LWc/b$c;
    }
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
    invoke-direct {p0}, LWc/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, LWc/b$b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LWc/b$b;

    invoke-virtual {v0}, LWc/b$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    instance-of v0, p0, LWc/b$c;

    if-nez v0, :cond_3

    instance-of v0, p0, LWc/b$a$a;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of v0, p0, LWc/b$a$b;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, LWc/b$a$b;

    invoke-virtual {v0}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public abstract b()Ljava/lang/Object;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p0, LWc/b$c;

    if-eqz v0, :cond_0

    instance-of p1, p1, LWc/b$c;

    goto :goto_1

    :cond_0
    instance-of v0, p0, LWc/b$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_1

    check-cast p1, LWc/b$b;

    invoke-virtual {p1}, LWc/b$b;->b()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p0

    check-cast v0, LWc/b$b;

    invoke-virtual {v0}, LWc/b$b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    move p1, v2

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_1

    :cond_2
    instance-of v0, p0, LWc/b$a$b;

    if-eqz v0, :cond_3

    instance-of v0, p1, LWc/b$a$b;

    if-eqz v0, :cond_1

    check-cast p1, LWc/b$a$b;

    invoke-virtual {p1}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p0

    check-cast v0, LWc/b$a$b;

    invoke-virtual {v0}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_3
    instance-of v0, p0, LWc/b$a$a;

    if-eqz v0, :cond_4

    instance-of v0, p1, LWc/b$a$a;

    if-eqz v0, :cond_1

    check-cast p1, LWc/b$a$a;

    invoke-virtual {p1}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    move-object v0, p0

    check-cast v0, LWc/b$a$a;

    invoke-virtual {v0}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :goto_1
    return p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
