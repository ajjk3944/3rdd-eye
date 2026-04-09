.class final Lz8/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz8/c;


# direct methods
.method constructor <init>(Lz8/c;)V
    .locals 0

    iput-object p1, p0, Lz8/c$e;->a:Lz8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Ll9/a;

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lz8/c$e;->b(Ljava/util/Set;Ll9/a;Ljava/util/Map;)LJ9/j;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;Ll9/a;Ljava/util/Map;)LJ9/j;
    .locals 1

    const-string/jumbo v0, "bandsSupported"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "apPerBand"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LS8/c;

    iget-object v0, p0, Lz8/c$e;->a:Lz8/c;

    invoke-static {v0, p1, p2, p3}, Lz8/c;->x0(Lz8/c;Ljava/util/Set;LS8/c;Ljava/util/Map;)LJ9/j;

    move-result-object p1

    return-object p1
.end method
