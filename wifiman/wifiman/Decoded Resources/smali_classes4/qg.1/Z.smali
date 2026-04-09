.class public final Lqg/Z;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/Z$a;
    }
.end annotation


# instance fields
.field final c:Lkg/n;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/Z;->c:Lkg/n;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/Z$a;

    iget-object v2, p0, Lqg/Z;->c:Lkg/n;

    invoke-direct {v1, p1, v2}, Lqg/Z$a;-><init>(LDj/b;Lkg/n;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
