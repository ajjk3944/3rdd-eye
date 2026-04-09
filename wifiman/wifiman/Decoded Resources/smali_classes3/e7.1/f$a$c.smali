.class public final Le7/f$a$c;
.super Le7/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final a:Le7/f$a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/f$a$c;

    invoke-direct {v0}, Le7/f$a$c;-><init>()V

    sput-object v0, Le7/f$a$c;->a:Le7/f$a$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le7/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Le7/f$a$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x18c75ea1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DeviceUnsupported"

    return-object v0
.end method
