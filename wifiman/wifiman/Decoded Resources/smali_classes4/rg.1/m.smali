.class public final Lrg/m;
.super Lgg/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/m$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/D;)V
    .locals 0

    invoke-direct {p0}, Lgg/n;-><init>()V

    iput-object p1, p0, Lrg/m;->a:Lgg/D;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Lrg/m;->a:Lgg/D;

    new-instance v1, Lrg/m$a;

    invoke-direct {v1, p1}, Lrg/m$a;-><init>(Lgg/p;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
