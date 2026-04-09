.class final Ln8/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/j;


# direct methods
.method constructor <init>(Ln8/j;)V
    .locals 0

    iput-object p1, p0, Ln8/j$c;->a:Ln8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ln8/e;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln8/j$c;->a:Ln8/j;

    invoke-static {v0, p1}, Ln8/j;->H0(Ln8/j;Ln8/e;)V

    iget-object v0, p0, Ln8/j$c;->a:Ln8/j;

    invoke-static {v0}, Ln8/j;->C0(Ln8/j;)Landroidx/lifecycle/E;

    move-result-object v0

    invoke-interface {p1, v0}, Ln8/e;->d(Landroidx/lifecycle/E;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ln8/e;

    invoke-virtual {p0, p1}, Ln8/j$c;->a(Ln8/e;)V

    return-void
.end method
