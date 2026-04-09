.class public final Lsg/f;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsg/f$a;
    }
.end annotation


# instance fields
.field final b:Lgg/i;

.field final c:Lkg/n;

.field final d:Lzg/g;

.field final e:I


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;Lzg/g;I)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-object p1, p0, Lsg/f;->b:Lgg/i;

    iput-object p2, p0, Lsg/f;->c:Lkg/n;

    iput-object p3, p0, Lsg/f;->d:Lzg/g;

    iput p4, p0, Lsg/f;->e:I

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 5

    iget-object v0, p0, Lsg/f;->b:Lgg/i;

    new-instance v1, Lsg/f$a;

    iget-object v2, p0, Lsg/f;->c:Lkg/n;

    iget v3, p0, Lsg/f;->e:I

    iget-object v4, p0, Lsg/f;->d:Lzg/g;

    invoke-direct {v1, p1, v2, v3, v4}, Lsg/f$a;-><init>(LDj/b;Lkg/n;ILzg/g;)V

    invoke-virtual {v0, v1}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method
