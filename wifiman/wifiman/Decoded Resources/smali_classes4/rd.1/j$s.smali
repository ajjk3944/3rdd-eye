.class final Lrd/j$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;->s(Lgg/i;Linet/ipaddr/g;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lrd/j;

.field final synthetic b:Linet/ipaddr/g;


# direct methods
.method constructor <init>(Lrd/j;Linet/ipaddr/g;)V
    .locals 0

    iput-object p1, p0, Lrd/j$s;->a:Lrd/j;

    iput-object p2, p0, Lrd/j$s;->b:Linet/ipaddr/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lgg/f;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lrd/j$s;->a:Lrd/j;

    iget-object v1, p0, Lrd/j$s;->b:Linet/ipaddr/g;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lrd/j;->k(Lrd/j;Linet/ipaddr/g;I)Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lrd/j$s;->a(Ll9/a;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
