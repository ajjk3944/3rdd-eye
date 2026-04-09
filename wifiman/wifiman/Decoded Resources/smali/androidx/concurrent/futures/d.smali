.class public final Landroidx/concurrent/futures/d;
.super Landroidx/concurrent/futures/a;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/concurrent/futures/a;-><init>()V

    return-void
.end method

.method public static D()Landroidx/concurrent/futures/d;
    .locals 1

    new-instance v0, Landroidx/concurrent/futures/d;

    invoke-direct {v0}, Landroidx/concurrent/futures/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public y(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Landroidx/concurrent/futures/a;->y(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public z(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, Landroidx/concurrent/futures/a;->z(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
