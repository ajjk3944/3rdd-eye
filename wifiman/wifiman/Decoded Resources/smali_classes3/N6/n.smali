.class public final LN6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN6/n$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LN6/n;
    .locals 1

    invoke-static {}, LN6/n$a;->a()LN6/n;

    move-result-object v0

    return-object v0
.end method

.method public static c()LN6/m;
    .locals 1

    new-instance v0, LN6/m;

    invoke-direct {v0}, LN6/m;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LN6/m;
    .locals 1

    invoke-static {}, LN6/n;->c()LN6/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/n;->b()LN6/m;

    move-result-object v0

    return-object v0
.end method
