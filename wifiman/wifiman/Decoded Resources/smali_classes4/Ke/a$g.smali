.class public final LKe/a$g;
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
    name = "g"
.end annotation


# static fields
.field public static final a:LKe/a$g;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LKe/a$g;

    invoke-direct {v0}, LKe/a$g;-><init>()V

    sput-object v0, LKe/a$g;->a:LKe/a$g;

    const-string v1, "speedtestButton"

    sput-object v1, LKe/a$g;->b:Ljava/lang/String;

    invoke-virtual {v0}, LKe/a$g;->getType()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LKe/a$g;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    sget-object v0, LKe/a$g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    sget-object v0, LKe/a$g;->b:Ljava/lang/String;

    return-object v0
.end method
