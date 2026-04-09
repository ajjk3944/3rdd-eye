.class public final Lug/m;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/m$a;,
        Lug/m$b;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p2, p0, Lug/m;->b:Lkg/n;

    iput-object p1, p0, Lug/m;->a:Lgg/D;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lug/m;->a:Lgg/D;

    new-instance v1, Lug/m$b;

    iget-object v2, p0, Lug/m;->b:Lkg/n;

    invoke-direct {v1, p1, v2}, Lug/m$b;-><init>(Lgg/p;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
