.class public final Lug/v;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/v$a;
    }
.end annotation


# instance fields
.field final a:Lgg/D;

.field final b:Lgg/y;


# direct methods
.method public constructor <init>(Lgg/D;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/v;->a:Lgg/D;

    iput-object p2, p0, Lug/v;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 2

    new-instance v0, Lug/v$a;

    iget-object v1, p0, Lug/v;->a:Lgg/D;

    invoke-direct {v0, p1, v1}, Lug/v$a;-><init>(Lgg/B;Lgg/D;)V

    invoke-interface {p1, v0}, Lgg/B;->c(Lhg/c;)V

    iget-object p1, p0, Lug/v;->b:Lgg/y;

    invoke-virtual {p1, v0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    move-result-object p1

    iget-object v0, v0, Lug/v$a;->b:Llg/e;

    invoke-virtual {v0, p1}, Llg/e;->a(Lhg/c;)Z

    return-void
.end method
