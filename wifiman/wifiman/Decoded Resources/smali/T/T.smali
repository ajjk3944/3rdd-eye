.class abstract LT/T;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/T$a;
    }
.end annotation


# static fields
.field public static final a:LT/T$a;

.field private static final b:I

.field private static final c:I

.field private static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/T$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT/T$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LT/T;->a:LT/T$a;

    const/4 v0, 0x0

    invoke-static {v0}, LT/T;->d(I)I

    move-result v0

    sput v0, LT/T;->b:I

    const/4 v0, 0x1

    invoke-static {v0}, LT/T;->d(I)I

    move-result v0

    sput v0, LT/T;->c:I

    const/4 v0, 0x2

    invoke-static {v0}, LT/T;->d(I)I

    move-result v0

    sput v0, LT/T;->d:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LT/T;->b:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LT/T;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LT/T;->d:I

    return v0
.end method

.method private static d(I)I
    .locals 0

    return p0
.end method
