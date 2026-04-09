.class final LOd/c$e$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

.field final synthetic b:LOd/c;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;LOd/c;)V
    .locals 0

    iput-object p1, p0, LOd/c$e$g;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, LOd/c$e$g;->b:LOd/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)V
    .locals 2

    const-string v0, "fetch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LOd/c$e$g;->a:Lkotlin/jvm/internal/N;

    iget-object v1, p0, LOd/c$e$g;->b:LOd/c;

    invoke-static {v1, p1}, LOd/c;->e(LOd/c;LWc/b;)Lgg/s;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, LOd/c$e$g;->a(LWc/b;)V

    return-void
.end method
