.class public final Lrg/h;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/h$a;
    }
.end annotation


# instance fields
.field final a:Lgg/r;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/r;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lrg/h;->a:Lgg/r;

    iput-object p2, p0, Lrg/h;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    new-instance v0, Lrg/h$a;

    iget-object v1, p0, Lrg/h;->b:Lkg/n;

    invoke-direct {v0, p1, v1}, Lrg/h$a;-><init>(Lgg/d;Lkg/n;)V

    invoke-interface {p1, v0}, Lgg/d;->c(Lhg/c;)V

    iget-object p1, p0, Lrg/h;->a:Lgg/r;

    invoke-interface {p1, v0}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
