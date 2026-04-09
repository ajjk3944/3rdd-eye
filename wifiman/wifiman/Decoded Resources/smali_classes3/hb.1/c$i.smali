.class final Lhb/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c;->a(Lmb/j;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhb/c;

.field final synthetic b:Lmb/j;


# direct methods
.method constructor <init>(Lhb/c;Lmb/j;)V
    .locals 0

    iput-object p1, p0, Lhb/c$i;->a:Lhb/c;

    iput-object p2, p0, Lhb/c$i;->b:Lmb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltb/u;)Lgg/D;
    .locals 3

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/c$i;->a:Lhb/c;

    invoke-static {v0}, Lhb/c;->q(Lhb/c;)Lgg/z;

    move-result-object v0

    new-instance v1, Lhb/c$i$a;

    iget-object v2, p0, Lhb/c$i;->b:Lmb/j;

    invoke-direct {v1, v2}, Lhb/c$i$a;-><init>(Lmb/j;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lhb/c$i$b;

    invoke-direct {v1, p1}, Lhb/c$i$b;-><init>(Ltb/u;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltb/u;

    invoke-virtual {p0, p1}, Lhb/c$i;->a(Ltb/u;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
