.class public final LP6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP6/z$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LP6/z;
    .locals 1

    invoke-static {}, LP6/z$a;->a()LP6/z;

    move-result-object v0

    return-object v0
.end method

.method public static c()LP6/y;
    .locals 1

    new-instance v0, LP6/y;

    invoke-direct {v0}, LP6/y;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LP6/y;
    .locals 1

    invoke-static {}, LP6/z;->c()LP6/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/z;->b()LP6/y;

    move-result-object v0

    return-object v0
.end method
