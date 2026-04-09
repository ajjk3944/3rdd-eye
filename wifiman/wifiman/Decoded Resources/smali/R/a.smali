.class public abstract LR/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LL0/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/B;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL0/B;-><init>(Z)V

    sput-object v0, LR/a;->a:LL0/B;

    return-void
.end method

.method public static final a()LL0/B;
    .locals 1

    sget-object v0, LR/a;->a:LL0/B;

    return-object v0
.end method
