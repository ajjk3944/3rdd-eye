.class public final Lqg/T;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/T$b;,
        Lqg/T$c;,
        Lqg/T$a;
    }
.end annotation


# instance fields
.field final c:Lgg/y;

.field final d:Z

.field final e:I


# direct methods
.method public constructor <init>(Lgg/i;Lgg/y;ZI)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/T;->c:Lgg/y;

    iput-boolean p3, p0, Lqg/T;->d:Z

    iput p4, p0, Lqg/T;->e:I

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lqg/T;->c:Lgg/y;

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    instance-of v1, p1, LDg/a;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lqg/b;->b:Lgg/i;

    new-instance v2, Lqg/T$b;

    check-cast p1, LDg/a;

    iget-boolean v3, p0, Lqg/T;->d:Z

    iget v4, p0, Lqg/T;->e:I

    invoke-direct {v2, p1, v0, v3, v4}, Lqg/T$b;-><init>(LDg/a;Lgg/y$c;ZI)V

    invoke-virtual {v1, v2}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lqg/b;->b:Lgg/i;

    new-instance v2, Lqg/T$c;

    iget-boolean v3, p0, Lqg/T;->d:Z

    iget v4, p0, Lqg/T;->e:I

    invoke-direct {v2, p1, v0, v3, v4}, Lqg/T$c;-><init>(LDj/b;Lgg/y$c;ZI)V

    invoke-virtual {v1, v2}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method
