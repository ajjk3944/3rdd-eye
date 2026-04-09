.class public final Lm3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm3/c$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lm3/c;
    .locals 1

    invoke-static {}, Lm3/c$a;->a()Lm3/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lm3/a;
    .locals 1

    invoke-static {}, Lm3/b;->a()Lm3/a;

    move-result-object v0

    invoke-static {v0}, Le3/d;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm3/a;

    return-object v0
.end method


# virtual methods
.method public c()Lm3/a;
    .locals 1

    invoke-static {}, Lm3/c;->b()Lm3/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm3/c;->c()Lm3/a;

    move-result-object v0

    return-object v0
.end method
