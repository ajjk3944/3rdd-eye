.class public final Lsg/d;
.super Lgg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/d$a;
    }
.end annotation


# instance fields
.field final a:Lgg/i;

.field final b:Lkg/n;

.field final c:Lzg/g;

.field final d:I


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Lzg/g;I)V
    .locals 0

    invoke-direct {p0}, Lgg/b;-><init>()V

    iput-object p1, p0, Lsg/d;->a:Lgg/i;

    iput-object p2, p0, Lsg/d;->b:Lkg/n;

    iput-object p3, p0, Lsg/d;->c:Lzg/g;

    iput p4, p0, Lsg/d;->d:I

    return-void
.end method


# virtual methods
.method protected V(Lgg/d;)V
    .locals 5

    iget-object v0, p0, Lsg/d;->a:Lgg/i;

    new-instance v1, Lsg/d$a;

    iget-object v2, p0, Lsg/d;->b:Lkg/n;

    iget-object v3, p0, Lsg/d;->c:Lzg/g;

    iget v4, p0, Lsg/d;->d:I

    invoke-direct {v1, p1, v2, v3, v4}, Lsg/d$a;-><init>(Lgg/d;Lkg/n;Lzg/g;I)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
