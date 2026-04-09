.class public abstract Li5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/f$a;,
        Li5/f$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Li5/f$a;
    .locals 3

    new-instance v0, Li5/b$b;

    invoke-direct {v0}, Li5/b$b;-><init>()V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Li5/b$b;->d(J)Li5/f$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Li5/f$b;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()J
.end method
