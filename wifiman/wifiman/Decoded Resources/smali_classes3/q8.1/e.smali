.class public abstract Lq8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDe/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/e$a;,
        Lq8/e$b;
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
    invoke-direct {p0}, Lq8/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ls9/d;
    .locals 2

    instance-of v0, p0, Lq8/e$a;

    if-eqz v0, :cond_1

    new-instance v0, Ls9/d$b;

    move-object v1, p0

    check-cast v1, Lq8/e$a;

    invoke-virtual {v1}, Lq8/e$a;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f1100b9

    goto :goto_0

    :cond_0
    const v1, 0x7f1100b8

    :goto_0
    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    goto :goto_2

    :cond_1
    instance-of v0, p0, Lq8/e$b;

    if-eqz v0, :cond_3

    new-instance v0, Ls9/d$b;

    move-object v1, p0

    check-cast v1, Lq8/e$b;

    invoke-virtual {v1}, Lq8/e$b;->f()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f1100bb

    goto :goto_1

    :cond_2
    const v1, 0x7f1100ba

    :goto_1
    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    :goto_2
    return-object v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public c(LT/l;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LDe/h$a;->a(LDe/h;LT/l;I)V

    return-void
.end method
