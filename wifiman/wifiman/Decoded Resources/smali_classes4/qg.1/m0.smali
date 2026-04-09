.class public final Lqg/m0;
.super Lgg/z;
.source "SourceFile"

# interfaces
.implements Lng/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/m0$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lgg/i;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lqg/m0;->a:Lgg/i;

    iput-object p2, p0, Lqg/m0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lqg/m0;->a:Lgg/i;

    new-instance v1, Lqg/m0$a;

    iget-object v2, p0, Lqg/m0;->b:Ljava/lang/Object;

    invoke-direct {v1, p1, v2}, Lqg/m0$a;-><init>(Lgg/B;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.method public f()Lgg/i;
    .locals 4

    new-instance v0, Lqg/l0;

    iget-object v1, p0, Lqg/m0;->a:Lgg/i;

    iget-object v2, p0, Lqg/m0;->b:Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lqg/l0;-><init>(Lgg/i;Ljava/lang/Object;Z)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
