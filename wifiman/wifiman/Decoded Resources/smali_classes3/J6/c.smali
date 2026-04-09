.class public final LJ6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LJ6/c;
    .locals 1

    invoke-static {}, LJ6/c$a;->a()LJ6/c;

    move-result-object v0

    return-object v0
.end method

.method public static c()LJ6/b;
    .locals 1

    new-instance v0, LJ6/b;

    invoke-direct {v0}, LJ6/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LJ6/b;
    .locals 1

    invoke-static {}, LJ6/c;->c()LJ6/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ6/c;->b()LJ6/b;

    move-result-object v0

    return-object v0
.end method
