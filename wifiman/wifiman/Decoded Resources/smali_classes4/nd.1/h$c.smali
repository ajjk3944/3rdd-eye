.class final Lnd/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h;->b(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnd/h;


# direct methods
.method constructor <init>(Lnd/h;)V
    .locals 0

    iput-object p1, p0, Lnd/h$c;->a:Lnd/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnd/f;)Lgg/D;
    .locals 3

    const-string v0, "place"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnd/h$c;->a:Lnd/h;

    invoke-static {v0, p1}, Lnd/h;->l(Lnd/h;Lnd/f;)Lgg/b;

    move-result-object v0

    iget-object v1, p0, Lnd/h$c;->a:Lnd/h;

    invoke-virtual {p1}, Lnd/f;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnd/h;->k(Lnd/h;Ljava/lang/String;)Lgg/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/b;->g(Lgg/f;)Lgg/b;

    move-result-object v0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/b;->k(Lgg/D;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnd/f;

    invoke-virtual {p0, p1}, Lnd/h$c;->a(Lnd/f;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
