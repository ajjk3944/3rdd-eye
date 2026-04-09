.class public final Lrg/o;
.super Lgg/b;
.source "SourceFile"

# interfaces
.implements Lng/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/o$a;
    }
.end annotation


# instance fields
.field final a:Lgg/r;


# direct methods
.method public constructor <init>(Lgg/r;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lrg/o;->a:Lgg/r;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    iget-object v0, p0, Lrg/o;->a:Lgg/r;

    new-instance v1, Lrg/o$a;

    invoke-direct {v1, p1}, Lrg/o$a;-><init>(Lgg/d;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method

.method public d()Lgg/n;
    .locals 2

    new-instance v0, Lrg/n;

    iget-object v1, p0, Lrg/o;->a:Lgg/r;

    invoke-direct {v0, v1}, Lrg/n;-><init>(Lgg/r;)V

    invoke-static {v0}, LEg/a;->p(Lgg/n;)Lgg/n;

    move-result-object v0

    return-object v0
.end method
