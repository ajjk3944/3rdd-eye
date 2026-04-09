.class public final Lrg/i;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/i$b;,
        Lrg/i$a;
    }
.end annotation


# instance fields
.field final a:Lgg/r;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/r;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/i;->a:Lgg/r;

    iput-object p2, p0, Lrg/i;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 3

    iget-object v0, p0, Lrg/i;->a:Lgg/r;

    new-instance v1, Lrg/i$a;

    iget-object v2, p0, Lrg/i;->b:Lkg/n;

    invoke-direct {v1, p1, v2}, Lrg/i$a;-><init>(Lgg/p;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
