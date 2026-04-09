.class public final Lqg/y;
.super Lgg/b;
.source "SourceFile"

# interfaces
.implements Lng/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/y$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:Lkg/n;

.field final c:I

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;ZI)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lqg/y;->a:Lgg/i;

    iput-object p2, p0, Lqg/y;->b:Lkg/n;

    iput-boolean p3, p0, Lqg/y;->d:Z

    iput p4, p0, Lqg/y;->c:I

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 5

    iget-object v0, p0, Lqg/y;->a:Lgg/i;

    new-instance v1, Lqg/y$a;

    iget-object v2, p0, Lqg/y;->b:Lkg/n;

    iget-boolean v3, p0, Lqg/y;->d:Z

    iget v4, p0, Lqg/y;->c:I

    invoke-direct {v1, p1, v2, v3, v4}, Lqg/y$a;-><init>(Lgg/d;Lkg/n;ZI)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.method public f()Lgg/i;
    .locals 5

    new-instance v0, Lqg/x;

    iget-object v1, p0, Lqg/y;->a:Lgg/i;

    iget-object v2, p0, Lqg/y;->b:Lkg/n;

    iget-boolean v3, p0, Lqg/y;->d:Z

    iget v4, p0, Lqg/y;->c:I

    invoke-direct {v0, v1, v2, v3, v4}, Lqg/x;-><init>(Lgg/i;Lkg/n;ZI)V

    invoke-static {v0}, LEg/a;->o(Lgg/i;)Lgg/i;

    move-result-object v0

    return-object v0
.end method
