.class public final LI6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI6/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LI6/e;
    .locals 1

    invoke-static {}, LI6/e$a;->a()LI6/e;

    move-result-object v0

    return-object v0
.end method

.method public static c()LJ5/b;
    .locals 1

    invoke-static {}, LI6/b;->c()LJ5/b;

    move-result-object v0

    invoke-static {v0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ5/b;

    return-object v0
.end method


# virtual methods
.method public b()LJ5/b;
    .locals 1

    invoke-static {}, LI6/e;->c()LJ5/b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI6/e;->b()LJ5/b;

    move-result-object v0

    return-object v0
.end method
