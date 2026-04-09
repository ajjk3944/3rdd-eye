.class public final Lug/h;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/h$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/D;Lkg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/h;->a:Lgg/D;

    iput-object p2, p0, Lug/h;->b:Lkg/f;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/h;->a:Lgg/D;

    new-instance v1, Lug/h$a;

    iget-object v2, p0, Lug/h;->b:Lkg/f;

    invoke-direct {v1, p1, v2}, Lug/h$a;-><init>(Lgg/B;Lkg/f;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void
.end method
