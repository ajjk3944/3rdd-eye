.class public final LL0/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/A$a;
    }
.end annotation


# static fields
.field public static final a:LL0/A$a;

.field private static final b:LL0/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/A$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL0/A$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL0/A;->a:LL0/A$a;

    new-instance v0, LL0/A;

    invoke-direct {v0}, LL0/A;-><init>()V

    sput-object v0, LL0/A;->b:LL0/A;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()LL0/A;
    .locals 1

    sget-object v0, LL0/A;->b:LL0/A;

    return-object v0
.end method


# virtual methods
.method public final b(LL0/A;)LL0/A;
    .locals 0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LL0/A;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PlatformSpanStyle()"

    return-object v0
.end method
