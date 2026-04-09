.class public final LU9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU9/h$a;


# static fields
.field public static final a:LU9/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LU9/j;

    invoke-direct {v0}, LU9/j;-><init>()V

    sput-object v0, LU9/j;->a:LU9/j;

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
    instance-of p1, p1, LU9/j;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x5627837

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Expand"

    return-object v0
.end method
