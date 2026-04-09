.class public final LK6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/i$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LK6/i;
    .locals 1

    invoke-static {}, LK6/i$a;->a()LK6/i;

    move-result-object v0

    return-object v0
.end method

.method public static c()LP6/i;
    .locals 1

    invoke-static {}, LK6/d;->e()LP6/i;

    move-result-object v0

    invoke-static {v0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/i;

    return-object v0
.end method


# virtual methods
.method public b()LP6/i;
    .locals 1

    invoke-static {}, LK6/i;->c()LP6/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/i;->b()LP6/i;

    move-result-object v0

    return-object v0
.end method
