.class public final LC9/h$a;
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
    name = "a"
.end annotation


# static fields
.field public static final a:LC9/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC9/h$a;

    invoke-direct {v0}, LC9/h$a;-><init>()V

    sput-object v0, LC9/h$a;->a:LC9/h$a;

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
    instance-of p1, p1, LC9/h$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x47ef6fb4

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DarkBackground"

    return-object v0
.end method
