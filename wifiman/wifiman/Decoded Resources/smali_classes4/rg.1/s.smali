.class public final Lrg/s;
.super Lrg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/s$a;
    }
.end annotation


# instance fields
.field final b:Lkg/f;

.field final c:Lkg/f;

.field final d:Lkg/f;

.field final e:Lkg/a;

.field final f:Lkg/a;

.field final g:Lkg/a;


# direct methods
.method public constructor <init>(Lgg/r;Lkg/f;Lkg/f;Lkg/f;Lkg/a;Lkg/a;Lkg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lrg/a;-><init>(Lgg/r;)V

    iput-object p2, p0, Lrg/s;->b:Lkg/f;

    iput-object p3, p0, Lrg/s;->c:Lkg/f;

    iput-object p4, p0, Lrg/s;->d:Lkg/f;

    iput-object p5, p0, Lrg/s;->e:Lkg/a;

    iput-object p6, p0, Lrg/s;->f:Lkg/a;

    iput-object p7, p0, Lrg/s;->g:Lkg/a;

    return-void
.end method


# virtual methods
.method protected v(Lgg/p;)V
    .locals 2

    iget-object v0, p0, Lrg/a;->a:Lgg/r;

    new-instance v1, Lrg/s$a;

    invoke-direct {v1, p1, p0}, Lrg/s$a;-><init>(Lgg/p;Lrg/s;)V

    invoke-interface {v0, v1}, Lgg/r;->a(Lgg/p;)V

    return-void
.end method
