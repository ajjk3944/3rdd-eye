.class public final Lk3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/j$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lk3/j;
    .locals 1

    invoke-static {}, Lk3/j$a;->a()Lk3/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lk3/e;
    .locals 1

    invoke-static {}, Lk3/f;->d()Lk3/e;

    move-result-object v0

    invoke-static {v0}, Le3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk3/e;

    return-object v0
.end method


# virtual methods
.method public b()Lk3/e;
    .locals 1

    invoke-static {}, Lk3/j;->c()Lk3/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk3/j;->b()Lk3/e;

    move-result-object v0

    return-object v0
.end method
