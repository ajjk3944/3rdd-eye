.class public final Lug/e;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/e$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/D;Lgg/v;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/e;->a:Lgg/D;

    iput-object p2, p0, Lug/e;->b:Lgg/v;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 3

    iget-object v0, p0, Lug/e;->b:Lgg/v;

    new-instance v1, Lug/e$a;

    iget-object v2, p0, Lug/e;->a:Lgg/D;

    invoke-direct {v1, p1, v2}, Lug/e$a;-><init>(Lgg/B;Lgg/D;)V

    invoke-interface {v0, v1}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method
