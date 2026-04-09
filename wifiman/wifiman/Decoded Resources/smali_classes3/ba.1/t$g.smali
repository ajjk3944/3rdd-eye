.class final Lba/t$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lba/t;->V0()V
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

    iput-object p1, p0, Lba/t$g;->a:Lba/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lba/t$g;->a:Lba/t;

    invoke-virtual {v0}, Lba/t;->m0()LLi/z;

    move-result-object v0

    invoke-interface {v0, p1}, LLi/y;->j(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lba/t$g;->a(Ljava/lang/Boolean;)V

    return-void
.end method
