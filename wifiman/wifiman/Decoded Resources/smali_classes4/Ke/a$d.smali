.class public final LKe/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKe/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LKe/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final a:LKe/a$d;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LKe/a$d;

    invoke-direct {v0}, LKe/a$d;-><init>()V

    sput-object v0, LKe/a$d;->a:LKe/a$d;

    const-string v1, "portScanControl"

    sput-object v1, LKe/a$d;->b:Ljava/lang/String;

    invoke-virtual {v0}, LKe/a$d;->getType()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LKe/a$d;->c:Ljava/lang/String;

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
    instance-of p1, p1, LKe/a$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    sget-object v0, LKe/a$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    sget-object v0, LKe/a$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x35ae650e    # -3434172.5f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "PortScanControl"

    return-object v0
.end method
