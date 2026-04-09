.class public final LIi/J$a;
.super Ldh/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LIi/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, Ldh/f;->m0:Ldh/f$b;

    new-instance v1, LIi/I;

    invoke-direct {v1}, LIi/I;-><init>()V

    .line 3
    invoke-direct {p0, v0, v1}, Ldh/b;-><init>(Ldh/i$c;Lmh/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LIi/J$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Ldh/i$b;)LIi/J;
    .locals 0

    invoke-static {p0}, LIi/J$a;->d(Ldh/i$b;)LIi/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ldh/i$b;)LIi/J;
    .locals 1

    instance-of v0, p0, LIi/J;

    if-eqz v0, :cond_0

    check-cast p0, LIi/J;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
