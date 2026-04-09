.class public final Ltg/l;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/l$a;
    }
.end annotation


# instance fields
.field final b:Lkg/n;

.field final c:Lkg/c;


# direct methods
.method public constructor <init>(Lgg/v;Lkg/n;Lkg/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-object p2, p0, Ltg/l;->b:Lkg/n;

    iput-object p3, p0, Ltg/l;->c:Lkg/c;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 4

    iget-object v0, p0, Ltg/a;->a:Lgg/v;

    new-instance v1, Ltg/l$a;

    iget-object v2, p0, Ltg/l;->b:Lkg/n;

    iget-object v3, p0, Ltg/l;->c:Lkg/c;

    invoke-direct {v1, p1, v2, v3}, Ltg/l$a;-><init>(Lgg/x;Lkg/n;Lkg/c;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
