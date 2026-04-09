.class public abstract LN/M0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/M0$a;
    }
.end annotation


# static fields
.field public static final a:LN/M0$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I

.field private static final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LN/M0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN/M0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN/M0;->a:LN/M0$a;

    const/4 v0, 0x0

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->d:I

    const/4 v0, 0x3

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->e:I

    const/4 v0, 0x4

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->f:I

    const/4 v0, 0x5

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->g:I

    const/4 v0, 0x6

    invoke-static {v0}, LN/M0;->h(I)I

    move-result v0

    sput v0, LN/M0;->h:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LN/M0;->c:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LN/M0;->d:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LN/M0;->e:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LN/M0;->f:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, LN/M0;->b:I

    return v0
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, LN/M0;->h:I

    return v0
.end method

.method public static final synthetic g()I
    .locals 1

    sget v0, LN/M0;->g:I

    return v0
.end method

.method private static h(I)I
    .locals 0

    return p0
.end method

.method public static final i(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
