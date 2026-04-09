.class public abstract Ls9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/d$a;,
        Ls9/d$b;,
        Ls9/d$c;
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
    invoke-direct {p0}, Ls9/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5306ba41

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.common.CommonString.toCharSequence (CommonString.kt:11)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    instance-of v0, p0, Ls9/d$c;

    if-eqz v0, :cond_1

    move-object p1, p0

    check-cast p1, Ls9/d$c;

    invoke-virtual {p1}, Ls9/d$c;->b()Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ls9/d$b;

    if-eqz v0, :cond_2

    move-object p3, p0

    check-cast p3, Ls9/d$b;

    invoke-virtual {p3, p1}, Ls9/d$b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ls9/d$a;

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Ls9/d$a;

    invoke-virtual {v0}, Ls9/d$a;->b()Lmh/q;

    move-result-object v0

    and-int/lit8 p3, p3, 0xe

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->J()V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
