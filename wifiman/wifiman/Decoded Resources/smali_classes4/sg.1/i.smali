.class public final Lsg/i;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/i$a;
    }
.end annotation


# instance fields
.field final b:Lgg/i;

.field final c:Lkg/n;

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Z)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lsg/i;->b:Lgg/i;

    iput-object p2, p0, Lsg/i;->c:Lkg/n;

    iput-boolean p3, p0, Lsg/i;->d:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    iget-object v0, p0, Lsg/i;->b:Lgg/i;

    new-instance v1, Lsg/i$a;

    iget-object v2, p0, Lsg/i;->c:Lkg/n;

    iget-boolean v3, p0, Lsg/i;->d:Z

    invoke-direct {v1, p1, v2, v3}, Lsg/i$a;-><init>(LDj/b;Lkg/n;Z)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
