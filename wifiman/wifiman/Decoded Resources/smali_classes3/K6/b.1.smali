.class public final LK6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LK6/b;
    .locals 1

    invoke-static {}, LK6/b$a;->a()LK6/b;

    move-result-object v0

    return-object v0
.end method

.method public static c()LK6/a;
    .locals 1

    new-instance v0, LK6/a;

    invoke-direct {v0}, LK6/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LK6/a;
    .locals 1

    invoke-static {}, LK6/b;->c()LK6/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/b;->b()LK6/a;

    move-result-object v0

    return-object v0
.end method
