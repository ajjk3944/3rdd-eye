.class public abstract Ls9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls9/a$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/b$a;,
        Ls9/b$b;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls9/b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract e()Ls9/b$b;
.end method

.method public final f(Ls9/b$b;)Ls9/b;
    .locals 7

    instance-of v0, p0, Ls9/b$a;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Ls9/b$a;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Ls9/b$a;->i(Ls9/b$a;ILs9/b$b;Ls9/d;ILjava/lang/Object;)Ls9/b$a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final g(Ls9/d;)Ls9/b;
    .locals 7

    instance-of v0, p0, Ls9/b$a;

    if-eqz v0, :cond_0

    move-object v1, p0

    check-cast v1, Ls9/b$a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Ls9/b$a;->i(Ls9/b$a;ILs9/b$b;Ls9/d;ILjava/lang/Object;)Ls9/b$a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
