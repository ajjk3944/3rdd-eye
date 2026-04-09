.class public abstract Lke/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lke/c$a;,
        Lke/c$b;
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
    invoke-direct {p0}, Lke/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lke/c;)I
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lke/c$a;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lke/c$a;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lke/c$a;

    invoke-virtual {v0}, Lke/c$a;->b()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lke/c$a;

    invoke-virtual {p1}, Lke/c$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Lkotlin/text/t;->u(Ljava/lang/String;Ljava/lang/String;Z)I

    move-result v1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lke/c$b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    instance-of v0, p0, Lke/c$b;

    if-eqz v0, :cond_5

    instance-of v0, p1, Lke/c$a;

    if-eqz v0, :cond_3

    const/4 v1, -0x1

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lke/c$b;

    if-eqz p1, :cond_4

    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lke/c;

    invoke-virtual {p0, p1}, Lke/c;->a(Lke/c;)I

    move-result p1

    return p1
.end method
