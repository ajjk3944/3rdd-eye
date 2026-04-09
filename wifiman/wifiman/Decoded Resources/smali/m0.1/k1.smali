.class public abstract Lm0/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/k1$a;
    }
.end annotation


# static fields
.field public static final a:Lm0/k1$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm0/k1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm0/k1$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm0/k1;->a:Lm0/k1$a;

    const/4 v0, 0x0

    invoke-static {v0}, Lm0/k1;->d(I)I

    move-result v0

    sput v0, Lm0/k1;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, Lm0/k1;->d(I)I

    move-result v0

    sput v0, Lm0/k1;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, Lm0/k1;->d(I)I

    move-result v0

    sput v0, Lm0/k1;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lm0/k1;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, Lm0/k1;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, Lm0/k1;->d:I

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

    sget v0, Lm0/k1;->b:I

    invoke-static {p0, v0}, Lm0/k1;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Butt"

    goto :goto_0

    :cond_0
    sget v0, Lm0/k1;->c:I

    invoke-static {p0, v0}, Lm0/k1;->e(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "Round"

    goto :goto_0

    :cond_1
    sget v0, Lm0/k1;->d:I

    invoke-static {p0, v0}, Lm0/k1;->e(II)Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "Square"

    goto :goto_0

    :cond_2
    const-string p0, "Unknown"

    :goto_0
    return-object p0
.end method
