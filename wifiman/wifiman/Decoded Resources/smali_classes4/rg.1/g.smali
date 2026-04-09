.class public final Lrg/g;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/g$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/p;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/p;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/g;->a:Lgg/D;

    iput-object p2, p0, Lrg/g;->b:Lkg/p;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lrg/g;->a:Lgg/D;

    new-instance v1, Lrg/g$a;

    iget-object v2, p0, Lrg/g;->b:Lkg/p;

    invoke-direct {v1, p1, v2}, Lrg/g$a;-><init>(Lgg/p;Lkg/p;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
