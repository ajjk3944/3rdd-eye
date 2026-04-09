.class public final LIi/p0$a;
.super Ldh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, LIi/J;->b:LIi/J$a;

    new-instance v1, LIi/o0;

    invoke-direct {v1}, LIi/o0;-><init>()V

    .line 3
    invoke-direct {p0, v0, v1}, Ldh/b;-><init>(Ldh/i$c;Lmh/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LIi/p0$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Ldh/i$b;)LIi/p0;
    .locals 0

    invoke-static {p0}, LIi/p0$a;->d(Ldh/i$b;)LIi/p0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ldh/i$b;)LIi/p0;
    .locals 1

    instance-of v0, p0, LIi/p0;

    if-eqz v0, :cond_0

    check-cast p0, LIi/p0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
