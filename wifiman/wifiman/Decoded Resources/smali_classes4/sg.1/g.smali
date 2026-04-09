.class public final Lsg/g;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/g$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:Lkg/n;

.field final c:Z


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lsg/g;->a:Lgg/i;

    iput-object p2, p0, Lsg/g;->b:Lkg/n;

    iput-boolean p3, p0, Lsg/g;->c:Z

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 4

    iget-object v0, p0, Lsg/g;->a:Lgg/i;

    new-instance v1, Lsg/g$a;

    iget-object v2, p0, Lsg/g;->b:Lkg/n;

    iget-boolean v3, p0, Lsg/g;->c:Z

    invoke-direct {v1, p1, v2, v3}, Lsg/g$a;-><init>(Lgg/d;Lkg/n;Z)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
