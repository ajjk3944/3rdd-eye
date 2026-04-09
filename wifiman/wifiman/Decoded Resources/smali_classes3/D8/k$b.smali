.class final LD8/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/k;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/k;


# direct methods
.method constructor <init>(LD8/k;)V
    .locals 0

    iput-object p1, p0, LD8/k$b;->a:LD8/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LBc/a$b;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    iget-object v1, p0, LD8/k$b;->a:LD8/k;

    const/4 v2, 0x2

    invoke-static {v1, p1, v2}, LD8/k;->f(LD8/k;LBc/a$b;I)Laf/O;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LBc/a$b;

    invoke-virtual {p0, p1}, LD8/k$b;->a(LBc/a$b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
