.class public final Lqg/p;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/p$a;
    }
.end annotation


# instance fields
.field private final c:Lkg/f;

.field private final d:Lkg/o;

.field private final e:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/f;Lkg/o;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/p;->c:Lkg/f;

    iput-object p3, p0, Lqg/p;->d:Lkg/o;

    iput-object p4, p0, Lqg/p;->e:Lkg/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v1, Lqg/p$a;

    iget-object v2, p0, Lqg/p;->c:Lkg/f;

    iget-object v3, p0, Lqg/p;->d:Lkg/o;

    iget-object v4, p0, Lqg/p;->e:Lkg/a;

    invoke-direct {v1, p1, v2, v3, v4}, Lqg/p$a;-><init>(LDj/b;Lkg/f;Lkg/o;Lkg/a;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
