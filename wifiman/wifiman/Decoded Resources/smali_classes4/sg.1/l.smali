.class public final Lsg/l;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/l$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Lsg/l;->a:Lgg/D;

    iput-object p2, p0, Lsg/l;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    new-instance v0, Lsg/l$a;

    iget-object v1, p0, Lsg/l;->b:Lkg/n;

    invoke-direct {v0, p1, v1}, Lsg/l$a;-><init>(Lgg/x;Lkg/n;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    iget-object p1, p0, Lsg/l;->a:Lgg/D;

    invoke-interface {p1, v0}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
