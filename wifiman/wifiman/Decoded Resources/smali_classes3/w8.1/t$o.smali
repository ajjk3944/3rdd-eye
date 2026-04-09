.class final Lw8/t$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw8/t;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw8/t;


# direct methods
.method constructor <init>(Lw8/t;)V
    .locals 0

    iput-object p1, p0, Lw8/t$o;->a:Lw8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/usurvey/a;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw8/t$o;->a:Lw8/t;

    invoke-virtual {p1}, Lcom/ubnt/usurvey/a;->l()LIa/a$b;

    move-result-object p1

    invoke-static {v0, p1}, Lw8/t;->o1(Lw8/t;LIa/a$b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-virtual {p0, p1}, Lw8/t$o;->a(Lcom/ubnt/usurvey/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
