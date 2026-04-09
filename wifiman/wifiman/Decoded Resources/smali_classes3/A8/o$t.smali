.class final LA8/o$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$t;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYe/e;)LDj/a;
    .locals 2

    const-string/jumbo v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA8/o$t;->a:LA8/o;

    invoke-static {v0}, LA8/o;->V0(LA8/o;)Lje/u;

    move-result-object v0

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    new-instance v1, LA8/o$t$a;

    invoke-direct {v1, p1}, LA8/o$t$a;-><init>(LYe/e;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYe/e;

    invoke-virtual {p0, p1}, LA8/o$t;->a(LYe/e;)LDj/a;

    move-result-object p1

    return-object p1
.end method
