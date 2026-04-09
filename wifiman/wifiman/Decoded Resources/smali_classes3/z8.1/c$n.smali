.class final Lz8/c$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;->q0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz8/c;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Lz8/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lz8/c$n;->a:Lz8/c;

    iput-object p2, p0, Lz8/c$n;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/c;)Lgg/f;
    .locals 5

    const-string/jumbo v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lre/c;->b()Lgg/i;

    move-result-object v0

    invoke-interface {p1}, Lre/c;->c()Lgg/i;

    move-result-object v1

    new-instance v2, Lz8/c$n$a;

    iget-object v3, p0, Lz8/c$n;->a:Lz8/c;

    iget-object v4, p0, Lz8/c$n;->b:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lz8/c$n$a;-><init>(Lz8/c;Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lz8/c$n$b;

    invoke-direct {v1, p1}, Lz8/c$n$b;-><init>(Lre/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->t(Lkg/n;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/c;

    invoke-virtual {p0, p1}, Lz8/c$n;->a(Lre/c;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
