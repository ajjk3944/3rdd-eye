.class public final LK6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK6/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LK6/e;
    .locals 1

    invoke-static {}, LK6/e$a;->a()LK6/e;

    move-result-object v0

    return-object v0
.end method

.method public static b()I
    .locals 1

    invoke-static {}, LK6/d;->a()I

    move-result v0

    return v0
.end method


# virtual methods
.method public c()Ljava/lang/Integer;
    .locals 1

    invoke-static {}, LK6/e;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/e;->c()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
