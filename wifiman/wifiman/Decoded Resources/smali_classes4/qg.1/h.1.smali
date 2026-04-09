.class public final Lqg/h;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/h$a;
    }
.end annotation


# instance fields
.field final c:Lgg/D;


# direct methods
.method public constructor <init>(Lgg/i;Lgg/D;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/h;->c:Lgg/D;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/h$a;

    iget-object v2, p0, Lqg/h;->c:Lgg/D;

    invoke-direct {v1, p1, v2}, Lqg/h$a;-><init>(LDj/b;Lgg/D;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
