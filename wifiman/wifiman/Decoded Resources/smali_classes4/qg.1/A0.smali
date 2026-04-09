.class public final Lqg/A0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/A0$a;
    }
.end annotation


# instance fields
.field final c:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/i;Lgg/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/A0;->c:Lgg/y;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 3

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/A0$a;

    iget-object v2, p0, Lqg/A0;->c:Lgg/y;

    invoke-direct {v1, p1, v2}, Lqg/A0$a;-><init>(LDj/b;Lgg/y;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
