.class public final LT/N0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT/N0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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
    invoke-direct {p0}, LT/N0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LT/N0$a;LT/N0$c;)V
    .locals 0

    invoke-direct {p0, p1}, LT/N0$a;->c(LT/N0$c;)V

    return-void
.end method

.method public static final synthetic b(LT/N0$a;LT/N0$c;)V
    .locals 0

    invoke-direct {p0, p1}, LT/N0$a;->d(LT/N0$c;)V

    return-void
.end method

.method private final c(LT/N0$c;)V
    .locals 3

    :cond_0
    invoke-static {}, LT/N0;->I()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW/f;

    invoke-interface {v0, p1}, LW/f;->add(Ljava/lang/Object;)LW/f;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LT/N0;->I()LLi/z;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LLi/z;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method

.method private final d(LT/N0$c;)V
    .locals 3

    :cond_0
    invoke-static {}, LT/N0;->I()LLi/z;

    move-result-object v0

    invoke-interface {v0}, LLi/z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW/f;

    invoke-interface {v0, p1}, LW/f;->remove(Ljava/lang/Object;)LW/f;

    move-result-object v1

    if-eq v0, v1, :cond_1

    invoke-static {}, LT/N0;->I()LLi/z;

    move-result-object v2

    invoke-interface {v2, v0, v1}, LLi/z;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    return-void
.end method
