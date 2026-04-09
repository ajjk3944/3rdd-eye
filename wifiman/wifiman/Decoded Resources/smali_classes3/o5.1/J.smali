.class public final Lo5/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/I;


# static fields
.field public static final a:Lo5/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/J;

    invoke-direct {v0}, Lo5/J;-><init>()V

    sput-object v0, Lo5/J;->a:Lo5/J;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    return-wide v0
.end method
