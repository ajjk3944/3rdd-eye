.class final Lhd/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/c;-><init>(Lje/u;LBc/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lhd/c;


# direct methods
.method constructor <init>(Lhd/c;)V
    .locals 0

    iput-object p1, p0, Lhd/c$d;->a:Lhd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/util/List;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lhd/c$d;->a:Lhd/c;

    invoke-static {p1}, Lhd/c;->d(Lhd/c;)Ljava/util/concurrent/LinkedBlockingQueue;

    move-result-object p1

    invoke-static {p1}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lhd/c$d;->a(LYg/J;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
