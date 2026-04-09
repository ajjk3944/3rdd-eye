.class final Lba/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t;->T0(Ljava/lang/String;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lba/t;


# direct methods
.method constructor <init>(Lba/t;)V
    .locals 0

    iput-object p1, p0, Lba/t$d;->a:Lba/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lba/t$d;->a:Lba/t;

    invoke-virtual {p1}, Lba/t;->n0()LLi/z;

    move-result-object p1

    new-instance v0, Ls9/d$b;

    sget v1, LP9/b;->F0:I

    invoke-direct {v0, v1}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object p1, p0, Lba/t$d;->a:Lba/t;

    invoke-virtual {p1}, Lba/t;->m0()LLi/z;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    iget-object p1, p0, Lba/t$d;->a:Lba/t;

    invoke-virtual {p1}, Lba/t;->i0()LLi/z;

    move-result-object p1

    invoke-interface {p1, v0}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, Lba/t$d;->a(Lhg/c;)V

    return-void
.end method
