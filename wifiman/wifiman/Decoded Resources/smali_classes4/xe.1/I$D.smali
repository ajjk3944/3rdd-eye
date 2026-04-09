.class public final Lxe/I$D;
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
    name = "D"
.end annotation


# static fields
.field public static final a:Lxe/I$D;

.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxe/I$D;

    invoke-direct {v0}, Lxe/I$D;-><init>()V

    sput-object v0, Lxe/I$D;->a:Lxe/I$D;

    const-string v0, "speedtestServerPicker"

    sput-object v0, Lxe/I$D;->b:Ljava/lang/String;

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

    sget-object v0, Lxe/I$D;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxe/I$D;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x79482f80

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SpeedtestServerPicker"

    return-object v0
.end method
