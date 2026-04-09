.class final Ljb/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


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

    iput-object p1, p0, Ljb/b$e;->a:Ljb/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljb/g;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb/b$e;->a:Ljb/b;

    invoke-static {v0, p1}, Ljb/b;->l(Ljb/b;Ljb/g;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljb/g;

    invoke-virtual {p0, p1}, Ljb/b$e;->a(Ljb/g;)V

    return-void
.end method
