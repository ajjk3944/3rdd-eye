.class public final Lug/u;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/u$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/u;->a:Lgg/D;

    iput-object p2, p0, Lug/u;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/u;->a:Lgg/D;

    new-instance v1, Lug/u$a;

    iget-object v2, p0, Lug/u;->b:Lkg/n;

    invoke-direct {v1, p1, v2}, Lug/u$a;-><init>(Lgg/B;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
