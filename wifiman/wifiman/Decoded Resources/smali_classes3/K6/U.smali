.class public final LK6/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/U$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LK6/U;
    .locals 1

    invoke-static {}, LK6/U$a;->a()LK6/U;

    move-result-object v0

    return-object v0
.end method

.method public static c()LK6/T;
    .locals 1

    new-instance v0, LK6/T;

    invoke-direct {v0}, LK6/T;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LK6/T;
    .locals 1

    invoke-static {}, LK6/U;->c()LK6/T;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/U;->b()LK6/T;

    move-result-object v0

    return-object v0
.end method
