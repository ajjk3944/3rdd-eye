.class final Lnd/h$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h;->t(Lnd/f;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnd/h;

.field final synthetic b:Lnd/f;


# direct methods
.method constructor <init>(Lnd/h;Lnd/f;)V
    .locals 0

    iput-object p1, p0, Lnd/h$n;->a:Lnd/h;

    iput-object p2, p0, Lnd/h$n;->b:Lnd/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWb/j;)Lgg/f;
    .locals 3

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnd/h$n;->a:Lnd/h;

    iget-object v1, p0, Lnd/h$n;->b:Lnd/f;

    new-instance v2, Lnd/h$n$a;

    invoke-direct {v2, p1, v0, v1}, Lnd/h$n$a;-><init>(LWb/j;Lnd/h;Lnd/f;)V

    invoke-static {v2}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWb/j;

    invoke-virtual {p0, p1}, Lnd/h$n;->a(LWb/j;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
