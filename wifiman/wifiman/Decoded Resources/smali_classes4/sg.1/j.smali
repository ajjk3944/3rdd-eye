.class public final Lsg/j;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/j$a;
    }
.end annotation


# instance fields
.field final a:Lgg/s;

.field final b:Lkg/n;

.field final c:Z


# direct methods
.method public constructor <init>(Lgg/s;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lsg/j;->a:Lgg/s;

    iput-object p2, p0, Lsg/j;->b:Lkg/n;

    iput-boolean p3, p0, Lsg/j;->c:Z

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 4

    iget-object v0, p0, Lsg/j;->a:Lgg/s;

    iget-object v1, p0, Lsg/j;->b:Lkg/n;

    invoke-static {v0, v1, p1}, Lsg/k;->a(Ljava/lang/Object;Lkg/n;Lgg/d;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lsg/j;->a:Lgg/s;

    new-instance v1, Lsg/j$a;

    iget-object v2, p0, Lsg/j;->b:Lkg/n;

    iget-boolean v3, p0, Lsg/j;->c:Z

    invoke-direct {v1, p1, v2, v3}, Lsg/j$a;-><init>(Lgg/d;Lkg/n;Z)V

    invoke-virtual {v0, v1}, Lgg/s;->d(Lgg/x;)V

    :cond_0
    return-void
.end method
