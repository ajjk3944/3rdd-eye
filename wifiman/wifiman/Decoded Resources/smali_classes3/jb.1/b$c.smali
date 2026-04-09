.class final Ljb/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/b;->m()Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljb/b;


# direct methods
.method constructor <init>(Ljb/b;)V
    .locals 0

    iput-object p1, p0, Ljb/b$c;->a:Ljb/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEb/r;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ljb/b$c;->a:Ljb/b;

    invoke-static {p1}, Ljb/b;->e(Ljb/b;)Ljb/i;

    move-result-object p1

    invoke-interface {p1}, Ljb/i;->e()Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEb/r;

    invoke-virtual {p0, p1}, Ljb/b$c;->a(LEb/r;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
