.class public final Lxe/I$m;
.super Lxe/I;
.source "SourceFile"

# interfaces
.implements LAe/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/I;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "m"
.end annotation


# static fields
.field public static final a:Lxe/I$m;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/I$m;

    invoke-direct {v0}, Lxe/I$m;-><init>()V

    sput-object v0, Lxe/I$m;->a:Lxe/I$m;

    const-string v0, "networkHosts"

    sput-object v0, Lxe/I$m;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lxe/I;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lxe/I$m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxe/I$m;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x78392fa7

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NetworkHosts"

    return-object v0
.end method
