.class public final Lpg/v;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/v$a;
    }
.end annotation


# instance fields
.field final a:Lgg/f;

.field final b:Lkg/f;

.field final c:Lkg/f;

.field final d:Lkg/a;

.field final e:Lkg/a;

.field final f:Lkg/a;

.field final g:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/f;Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lpg/v;->a:Lgg/f;

    iput-object p2, p0, Lpg/v;->b:Lkg/f;

    iput-object p3, p0, Lpg/v;->c:Lkg/f;

    iput-object p4, p0, Lpg/v;->d:Lkg/a;

    iput-object p5, p0, Lpg/v;->e:Lkg/a;

    iput-object p6, p0, Lpg/v;->f:Lkg/a;

    iput-object p7, p0, Lpg/v;->g:Lkg/a;

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 2

    iget-object v0, p0, Lpg/v;->a:Lgg/f;

    new-instance v1, Lpg/v$a;

    invoke-direct {v1, p0, p1}, Lpg/v$a;-><init>(Lpg/v;Lgg/d;)V

    invoke-interface {v0, v1}, Lgg/f;->e(Lgg/d;)V

    return-void
.end method
