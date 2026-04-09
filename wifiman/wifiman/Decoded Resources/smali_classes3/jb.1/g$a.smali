.class final Ljb/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/g;->h(Z)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljb/g;


# direct methods
.method constructor <init>(Ljb/g;)V
    .locals 0

    iput-object p1, p0, Ljb/g$a;->a:Ljb/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/b;)Llb/b;
    .locals 1

    const-string/jumbo v0, "cloudCredentials"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb/g$a;->a:Ljb/g;

    invoke-static {v0, p1}, Ljb/g;->e(Ljb/g;Llb/b;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llb/b;

    invoke-virtual {p0, p1}, Ljb/g$a;->a(Llb/b;)Llb/b;

    move-result-object p1

    return-object p1
.end method
