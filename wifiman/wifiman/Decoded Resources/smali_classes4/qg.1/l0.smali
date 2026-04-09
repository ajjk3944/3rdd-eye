.class public final Lqg/l0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/l0$a;
    }
.end annotation


# instance fields
.field final c:Ljava/lang/Object;

.field final d:Z


# direct methods
.method public constructor <init>(Lgg/i;Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/l0;->c:Ljava/lang/Object;

    iput-boolean p3, p0, Lqg/l0;->d:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/l0$a;

    iget-object v2, p0, Lqg/l0;->c:Ljava/lang/Object;

    iget-boolean v3, p0, Lqg/l0;->d:Z

    invoke-direct {v1, p1, v2, v3}, Lqg/l0$a;-><init>(LDj/b;Ljava/lang/Object;Z)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
