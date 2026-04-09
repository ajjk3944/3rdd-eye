.class public final LG6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LG6/g;
    .locals 1

    invoke-static {}, LG6/g$a;->a()LG6/g;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lgg/y;
    .locals 1

    invoke-static {}, LG6/a$c;->f()Lgg/y;

    move-result-object v0

    invoke-static {v0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/y;

    return-object v0
.end method


# virtual methods
.method public b()Lgg/y;
    .locals 1

    invoke-static {}, LG6/g;->c()Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/g;->b()Lgg/y;

    move-result-object v0

    return-object v0
.end method
