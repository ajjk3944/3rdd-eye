.class public final Lug/q;
.super Lgg/z;
.source "SourceFile"


# instance fields
.field final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/q;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 1

    invoke-static {}, Lhg/c;->n()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/B;->c(Lhg/c;)V

    iget-object v0, p0, Lug/q;->a:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lgg/B;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
