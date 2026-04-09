.class final Lhd/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


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

    iput-object p1, p0, Lhd/c$f;->a:Lhd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lje/r;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhd/c$f;->a:Lhd/c;

    invoke-static {v0, p1}, Lhd/c;->e(Lhd/c;Lje/r;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lje/r;

    invoke-virtual {p0, p1}, Lhd/c$f;->a(Lje/r;)Z

    move-result p1

    return p1
.end method
