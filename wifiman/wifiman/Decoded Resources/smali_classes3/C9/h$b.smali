.class public final LC9/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC9/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:LC9/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC9/h$b;

    invoke-direct {v0}, LC9/h$b;-><init>()V

    sput-object v0, LC9/h$b;->a:LC9/h$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, LC9/h$b;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x55bbe724

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "LightBackground"

    return-object v0
.end method
