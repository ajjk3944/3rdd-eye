.class final synthetic Leb/c$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/c;->n()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:Leb/c;


# direct methods
.method constructor <init>(Leb/c;)V
    .locals 0

    iput-object p1, p0, Leb/c$i;->a:Leb/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/k;)V
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/c$i;->a:Leb/c;

    invoke-static {v0, p1}, Leb/c;->g(Leb/c;Lgb/k;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lgb/k;

    invoke-virtual {p0, p1}, Leb/c$i;->a(Lgb/k;)V

    return-void
.end method
