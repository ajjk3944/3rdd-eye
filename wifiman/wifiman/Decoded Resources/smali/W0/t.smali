.class public abstract LW0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/t$a;
    }
.end annotation


# static fields
.field public static final a:LW0/t$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LW0/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW0/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/t;->a:LW0/t$a;

    const/4 v0, 0x1

    invoke-static {v0}, LW0/t;->d(I)I

    move-result v0

    sput v0, LW0/t;->b:I

    const/4 v0, 0x2

    invoke-static {v0}, LW0/t;->d(I)I

    move-result v0

    sput v0, LW0/t;->c:I

    const/4 v0, 0x3

    invoke-static {v0}, LW0/t;->d(I)I

    move-result v0

    sput v0, LW0/t;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LW0/t;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LW0/t;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LW0/t;->d:I

    return v0
.end method

.method public static d(I)I
    .locals 0

    return p0
.end method

.method public static final e(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static f(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static g(I)Ljava/lang/String;
    .locals 1

    sget v0, LW0/t;->b:I

    invoke-static {p0, v0}, LW0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Clip"

    goto :goto_0

    :cond_0
    sget v0, LW0/t;->c:I

    invoke-static {p0, v0}, LW0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Ellipsis"

    goto :goto_0

    :cond_1
    sget v0, LW0/t;->d:I

    invoke-static {p0, v0}, LW0/t;->e(II)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Visible"

    goto :goto_0

    :cond_2
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method
