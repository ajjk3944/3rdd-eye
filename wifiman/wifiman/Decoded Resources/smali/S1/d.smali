.class public abstract LS1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:LS1/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LS1/d;
    .locals 1

    sget-object v0, LS1/d;->a:LS1/d;

    if-nez v0, :cond_0

    new-instance v0, LS1/e;

    invoke-direct {v0}, LS1/e;-><init>()V

    sput-object v0, LS1/d;->a:LS1/d;

    :cond_0
    sget-object v0, LS1/d;->a:LS1/d;

    return-object v0
.end method
