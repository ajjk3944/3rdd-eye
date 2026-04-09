.class public final Lqg/I;
.super Lgg/b;
.source "SourceFile"

# interfaces
.implements Lng/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/I$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;


# direct methods
.method public constructor <init>(Lgg/i;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lqg/I;->a:Lgg/i;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    iget-object v0, p0, Lqg/I;->a:Lgg/i;

    new-instance v1, Lqg/I$a;

    invoke-direct {v1, p1}, Lqg/I$a;-><init>(Lgg/d;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.method public f()Lgg/i;
    .locals 2

    new-instance v0, Lqg/H;

    iget-object v1, p0, Lqg/I;->a:Lgg/i;

    invoke-direct {v0, v1}, Lqg/H;-><init>(Lgg/i;)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
