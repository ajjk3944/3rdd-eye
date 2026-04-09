.class public abstract Lb3/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/o$a;,
        Lb3/o$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb3/o$a;
    .locals 1

    new-instance v0, Lb3/e$b;

    invoke-direct {v0}, Lb3/e$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lb3/a;
.end method

.method public abstract c()Lb3/o$b;
.end method
