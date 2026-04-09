.class public final LN6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN6/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LN6/l;
    .locals 1

    invoke-static {}, LN6/l$a;->a()LN6/l;

    move-result-object v0

    return-object v0
.end method

.method public static c()LN6/k;
    .locals 1

    new-instance v0, LN6/k;

    invoke-direct {v0}, LN6/k;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LN6/k;
    .locals 1

    invoke-static {}, LN6/l;->c()LN6/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/l;->b()LN6/k;

    move-result-object v0

    return-object v0
.end method
