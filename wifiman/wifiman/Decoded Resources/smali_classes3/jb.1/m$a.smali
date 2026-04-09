.class final synthetic Ljb/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljb/m;-><init>(Ldb/a;LGb/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljb/m;


# direct methods
.method constructor <init>(Ljb/m;)V
    .locals 0

    iput-object p1, p0, Ljb/m$a;->a:Ljb/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Llb/o;)V
    .locals 1

    const-string/jumbo v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb/m$a;->a:Ljb/m;

    invoke-static {v0, p1}, Ljb/m;->d(Ljb/m;Llb/o;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Llb/o;

    invoke-virtual {p0, p1}, Ljb/m$a;->a(Llb/o;)V

    return-void
.end method
