.class public final Lxe/H;
.super Lxe/F$e;
.source "SourceFile"


# static fields
.field public static final a:Lxe/H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/H;

    invoke-direct {v0}, Lxe/H;-><init>()V

    sput-object v0, Lxe/H;->a:Lxe/H;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxe/F$e;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxe/H;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x70fcc60e

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DisplayPrefsNetworkScan"

    return-object v0
.end method
