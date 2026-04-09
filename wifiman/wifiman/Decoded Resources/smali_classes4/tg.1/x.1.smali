.class public final Ltg/x;
.super Lgg/b;
.source "SourceFile"

# interfaces
.implements Lng/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/x$a;
    }
.end annotation


# instance fields
.field final a:Lgg/v;

.field final b:Lkg/n;

.field final c:Z


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Ltg/x;->a:Lgg/v;

    iput-object p2, p0, Ltg/x;->b:Lkg/n;

    iput-boolean p3, p0, Ltg/x;->c:Z

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 4

    iget-object v0, p0, Ltg/x;->a:Lgg/v;

    new-instance v1, Ltg/x$a;

    iget-object v2, p0, Ltg/x;->b:Lkg/n;

    iget-boolean v3, p0, Ltg/x;->c:Z

    invoke-direct {v1, p1, v2, v3}, Ltg/x$a;-><init>(Lgg/d;Lkg/n;Z)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

.method public b()Lgg/s;
    .locals 4

    new-instance v0, Ltg/w;

    iget-object v1, p0, Ltg/x;->a:Lgg/v;

    iget-object v2, p0, Ltg/x;->b:Lkg/n;

    iget-boolean v3, p0, Ltg/x;->c:Z

    invoke-direct {v0, v1, v2, v3}, Ltg/w;-><init>(Lgg/v;Lkg/n;Z)V

    invoke-static {v0}, LEg/a;->q(Lgg/s;)Lgg/s;

    move-result-object v0

    return-object v0
.end method
