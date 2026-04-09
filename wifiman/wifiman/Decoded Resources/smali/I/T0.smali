.class abstract LI/T0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI/T0$a;
    }
.end annotation


# static fields
.field private static final a:LI/T0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LI/T0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI/T0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LI/T0;->a:LI/T0$a;

    return-void
.end method

.method public static a(I)[I
    .locals 0

    mul-int/lit8 p0, p0, 0x3

    new-array p0, p0, [I

    invoke-static {p0}, LI/T0;->b([I)[I

    move-result-object p0

    return-object p0
.end method

.method private static b([I)[I
    .locals 0

    return-object p0
.end method

.method public static final c([II)[I
    .locals 0

    mul-int/lit8 p1, p1, 0x3

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    const-string p1, "copyOf(this, newSize)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LI/T0;->b([I)[I

    move-result-object p0

    return-object p0
.end method

.method public static final d([I)I
    .locals 0

    array-length p0, p0

    div-int/lit8 p0, p0, 0x3

    return p0
.end method

.method public static final e([IIIII)V
    .locals 0

    mul-int/lit8 p1, p1, 0x3

    aput p2, p0, p1

    add-int/lit8 p2, p1, 0x1

    aput p3, p0, p2

    add-int/lit8 p1, p1, 0x2

    aput p4, p0, p1

    return-void
.end method
