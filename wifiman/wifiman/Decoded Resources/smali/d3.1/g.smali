.class public abstract Ld3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ld3/g;
    .locals 4

    new-instance v0, Ld3/b;

    sget-object v1, Ld3/g$a;->FATAL_ERROR:Ld3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld3/b;-><init>(Ld3/g$a;J)V

    return-object v0
.end method

.method public static d()Ld3/g;
    .locals 4

    new-instance v0, Ld3/b;

    sget-object v1, Ld3/g$a;->INVALID_PAYLOAD:Ld3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld3/b;-><init>(Ld3/g$a;J)V

    return-object v0
.end method

.method public static e(J)Ld3/g;
    .locals 2

    new-instance v0, Ld3/b;

    sget-object v1, Ld3/g$a;->OK:Ld3/g$a;

    invoke-direct {v0, v1, p0, p1}, Ld3/b;-><init>(Ld3/g$a;J)V

    return-object v0
.end method

.method public static f()Ld3/g;
    .locals 4

    new-instance v0, Ld3/b;

    sget-object v1, Ld3/g$a;->TRANSIENT_ERROR:Ld3/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld3/b;-><init>(Ld3/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Ld3/g$a;
.end method
