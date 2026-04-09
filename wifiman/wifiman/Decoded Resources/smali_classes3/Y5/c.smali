.class public abstract LY5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY5/c$a;,
        LY5/c$b;
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
    invoke-direct {p0}, LY5/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    instance-of v0, p0, LY5/c$a$a;

    return v0
.end method

.method public final b()Z
    .locals 1

    instance-of v0, p0, LY5/c$b$a;

    return v0
.end method

.method public final c(Z)Z
    .locals 1

    instance-of v0, p0, LY5/c$b$b;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    instance-of v0, p0, LY5/c$b$a;

    if-eqz v0, :cond_2

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d()Z
    .locals 1

    instance-of v0, p0, LY5/c$b$b;

    return v0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
