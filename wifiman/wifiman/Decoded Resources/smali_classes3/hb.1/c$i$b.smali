.class final Lhb/c$i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/c$i;->a(Ltb/u;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltb/u;


# direct methods
.method constructor <init>(Ltb/u;)V
    .locals 0

    iput-object p1, p0, Lhb/c$i$b;->a:Ltb/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lmb/x;)LYg/s;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb/c$i$b;->a:Ltb/u;

    invoke-static {v0, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmb/x;

    invoke-virtual {p0, p1}, Lhb/c$i$b;->a(Lmb/x;)LYg/s;

    move-result-object p1

    return-object p1
.end method
