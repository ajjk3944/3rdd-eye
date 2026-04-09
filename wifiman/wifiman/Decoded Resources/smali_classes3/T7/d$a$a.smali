.class public final LT7/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT7/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
