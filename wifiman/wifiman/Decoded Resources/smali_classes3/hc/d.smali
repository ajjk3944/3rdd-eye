.class public final Lhc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhc/b;
.implements Lhc/c;


# instance fields
.field private final a:LHg/d;

.field private final b:Lgg/s;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LHg/b;->k1()LHg/b;

    move-result-object v0

    invoke-virtual {v0}, LHg/d;->i1()LHg/d;

    move-result-object v0

    const-string/jumbo v1, "toSerialized(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lhc/d;->a:LHg/d;

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/s;->o0(Lgg/y;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0}, Lgg/s;->r0()LBg/a;

    move-result-object v0

    invoke-virtual {v0}, LBg/a;->l1()Lgg/s;

    move-result-object v0

    const-string/jumbo v1, "refCount(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lhc/d;->b:Lgg/s;

    return-void
.end method


# virtual methods
.method public a(Lhc/a;)V
    .locals 3

    const-string/jumbo v0, "toast"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "TOAST SERVICE - show \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lhc/d;->a:LHg/d;

    invoke-interface {v0, p1}, Lgg/x;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public b()Lgg/s;
    .locals 1

    iget-object v0, p0, Lhc/d;->b:Lgg/s;

    return-object v0
.end method
