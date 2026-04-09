.class public final LG6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LG6/l;
    .locals 1

    invoke-static {}, LG6/l$a;->a()LG6/l;

    move-result-object v0

    return-object v0
.end method

.method public static c()[B
    .locals 1

    invoke-static {}, LG6/a$c;->k()[B

    move-result-object v0

    invoke-static {v0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method


# virtual methods
.method public b()[B
    .locals 1

    invoke-static {}, LG6/l;->c()[B

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/l;->b()[B

    move-result-object v0

    return-object v0
.end method
