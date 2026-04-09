.class final LOd/c$e$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOd/c$e;->b(LPd/d;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LOd/c$e$h;->a:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/s;)Lgg/v;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LOd/c$e$h$a;

    iget-object v1, p0, LOd/c$e$h;->a:Lkotlin/jvm/internal/N;

    invoke-direct {v0, v1}, LOd/c$e$h$a;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-virtual {p1, v0}, Lgg/s;->Q(Lkg/n;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, LOd/c$e$h;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
